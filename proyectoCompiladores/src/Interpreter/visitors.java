package Interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class visitors extends InterpreterBaseVisitor {
    private List<String> listaErrores = new ArrayList<>();
    private static Map<String, Object> symbolVariableTable = new HashMap<>();
    private static Map<String, Object> symbolConstTable = new HashMap<>();
    private static Map<String, Object> symbolFunctionTable = new HashMap<>();
    private static Map<String, Object> symbolArrayTable = new HashMap<>();
    private static Map<String, Object> symbolArraybiTable = new HashMap<>();
    private int ambito = 0;

    public int getAmbito() {
        return ambito;
    }

    public void sumarAmbito(){
        ambito++;
    }
    public void restarAmbito(){
        ambito--;
    }
    public static Map<String, Object> getSymbolVariableTable() {
        return symbolVariableTable;
    }

    public static Map<String, Object> getSymbolConstTable() {
        return symbolConstTable;
    }

    public void reiniciar(){
        listaErrores.clear();;
        symbolVariableTable.clear();
        symbolConstTable.clear();
        symbolFunctionTable.clear();
        symbolArrayTable.clear();
        symbolArraybiTable.clear();
        ambito=0;
    }

    @Override
    public Object visitVariable_declaration(InterpreterParser.Variable_declarationContext ctx) {
        String type = ctx.TYPE().getText();

        for (TerminalNode idNode : ctx.ID()) {
            String name = idNode.getText();

            if (exist(name)) {
                listaErrores.add("Error: La variable '" + name + "' ya ha sido declarada anteriormente.");
            } else {
                EntryVariable entry = new EntryVariable(name, type, getAmbito());
                getSymbolVariableTable().put(name, entry);
            }
        }

        return null;
    }

    @Override
    public Object visitArray_declaration(InterpreterParser.Array_declarationContext ctx) {
        String type = ctx.TYPE().getText();
        String name = ctx.ID().getText();

        if(symbolArrayTable.containsKey(name) || symbolFunctionTable.containsKey(name) || exist(name)){
            listaErrores.add("Error: Ya existe una variable, funcion o arreglo con el nombre '" + name + "'.");
        }else{

            int limiteInf = Integer.parseInt(ctx.array_range().NUMBER(0).getText());
            int limiteSup = Integer.parseInt(ctx.array_range().NUMBER(1).getText());

            if(limiteInf<0) {
                listaErrores.add("Error: El limite inferior del arreglo '" + name + "' debe de ser mayor o igual a 0.");
                return null;
            }
            if(limiteSup<0) {
                listaErrores.add("Error: El limite superior del arreglo '" + name + "' debe de ser mayor o igual a 0.");
                return null;
            }
            EntryArray entry = new EntryArray(name, type, limiteInf, limiteSup, getAmbito());
            symbolArrayTable.put(name, entry);
        }

        return null;
    }

    @Override
    public Object visitArraybi_declaration(InterpreterParser.Arraybi_declarationContext ctx) {
        String type = ctx.TYPE().getText();
        String name = ctx.ID().getText();

        if(symbolArraybiTable.containsKey(name) || symbolArrayTable.containsKey(name) || symbolFunctionTable.containsKey(name) || exist(name)){
            listaErrores.add("Error: Ya existe una variable, funcion o arreglo con el nombre '" + name + "'.");
        }else{
            int limiteInfFila = Integer.parseInt(ctx.array_range(0).NUMBER(0).getText());
            int limiteSupFila = Integer.parseInt(ctx.array_range(0).NUMBER(1).getText());
            int limiteInfColumna = Integer.parseInt(ctx.array_range(1).NUMBER(0).getText());
            int limiteSupColumna = Integer.parseInt(ctx.array_range(1).NUMBER(1).getText());

            if(limiteInfFila<0) {
                listaErrores.add("Error: El limite inferior para las filas del arreglo '" + name + "' debe de ser mayor o igual a 0.");
                return null;
            }
            if(limiteSupFila<0) {
                listaErrores.add("Error: El limite superior para las filas del arreglo '" + name + "' debe de ser mayor o igual a 0.");
                return null;
            }
            if(limiteInfColumna<0) {
                listaErrores.add("Error: El limite inferior para las columnas del arreglo '" + name + "' debe de ser mayor o igual a 0.");
                return null;
            }
            if(limiteSupColumna<0) {
                listaErrores.add("Error: El limite superior para las columnas del arreglo '" + name + "' debe de ser mayor o igual a 0.");
                return null;
            }
            EntryArrayBidi entry = new EntryArrayBidi(name, type, limiteInfFila, limiteSupFila, limiteInfColumna, limiteSupColumna, getAmbito());
            symbolArraybiTable.put(name, entry);
        }

        return null;
    }

    @Override
    public Object visitArray_access(InterpreterParser.Array_accessContext ctx) {

        String name = ctx.ID().getText();
        if(symbolArrayTable.containsKey(name)){
            EntryArray entryArray = (EntryArray) symbolArrayTable.get(name);

            if(ctx.index().ID()!=null){
                String IDname = ctx.index().ID().getText();
                if(symbolVariableTable.containsKey(IDname)){

                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(IDname);

                    if(!entry.getType().equalsIgnoreCase("Integer")){
                        listaErrores.add("Error: La variable '" + IDname + "' debe de ser un Integer.");
                    }


                }else if (symbolConstTable.containsKey(IDname)){

                    EntryConst entry = (EntryConst) symbolConstTable.get(IDname);

                    if(!entry.getType().equalsIgnoreCase("Integer")){
                        listaErrores.add("Error: La constante '" + IDname + "' debe de ser un Integer.");
                    }

                }else{
                    listaErrores.add("Error: La variable o constante '" + IDname + "' no existe.");
                }
            }

            if(ctx.index().NUMBER()!=null){
                int indice = Integer.parseInt(ctx.index().NUMBER().getText());

                int limiteInf = entryArray.getLimiteInferior();
                int limiteSup = entryArray.getLimiteSuperior();

                if(indice<limiteInf)
                    listaErrores.add("Error: El indice asignado al arreglo '" + name + "' no puede ser menor al indice inferior asignado al arreglo.");
                if(indice>limiteSup)
                    listaErrores.add("Error: El indice asignado al arreglo '" + name + "' no puede ser mayor al indice superior asignado al arreglo.");
            }

        }else{
            listaErrores.add("Error: El arreglo '" + name + "' no existe.");
        }

        return null;
    }

    @Override
    public Object visitArrayBi_access(InterpreterParser.ArrayBi_accessContext ctx) {

        String name = ctx.ID().getText();
        if(symbolArraybiTable.containsKey(name)){
            EntryArrayBidi entryArraybi = (EntryArrayBidi) symbolArraybiTable.get(name);

            for(int i=0; i<ctx.index().size();i++){
                if(ctx.index(i).ID()!=null){
                    String IDname = ctx.index(i).ID().getText();
                    if(symbolVariableTable.containsKey(IDname)){

                        EntryVariable entry = (EntryVariable) symbolVariableTable.get(IDname);

                        if(!entry.getType().equalsIgnoreCase("Integer")){
                            listaErrores.add("Error: La variable '" + IDname + "' debe de ser un Integer.");
                        }


                    }else if (symbolConstTable.containsKey(IDname)){

                        EntryConst entry = (EntryConst) symbolConstTable.get(IDname);

                        if(!entry.getType().equalsIgnoreCase("Integer")){
                            listaErrores.add("Error: La constante '" + IDname + "' debe de ser un Integer.");
                        }

                    }else{
                        listaErrores.add("Error: La variable o constante '" + IDname + "' no existe.");
                    }
                }
            }

            if(ctx.index(0).NUMBER()!=null){
                int indice = Integer.parseInt(ctx.index(0).NUMBER().getText());

                int limiteInf = entryArraybi.getLimiteInferiorFilas();
                int limiteSup = entryArraybi.getLimiteSuperiorFilas();

                if(indice<limiteInf)
                    listaErrores.add("Error: El indice asignado al arreglo '" + name + "' no puede ser menor al numero de fila inferior asignado al arreglo.");
                if(indice>limiteSup)
                    listaErrores.add("Error: El indice asignado al arreglo '" + name + "' no puede ser mayor al numero de fila superior asignado al arreglo.");
            }

            if(ctx.index(1).NUMBER()!=null){
                int indice = Integer.parseInt(ctx.index(1).NUMBER().getText());

                int limiteInf = entryArraybi.getLimiteInferiorColumnas();
                int limiteSup = entryArraybi.getLimiteSuperiorColumnas();

                if(indice<limiteInf)
                    listaErrores.add("Error: El indice asignado al arreglo '" + name + "' no puede ser menor al numero de columna inferior asignado al arreglo.");
                if(indice>limiteSup)
                    listaErrores.add("Error: El indice asignado al arreglo '" + name + "' no puede ser mayor al numero de columna superior asignado al arreglo.");
            }

        }else{
            listaErrores.add("Error: El arreglo bidimensional '" + name + "' no existe.");
        }

        return null;
    }

    @Override
    public Object visitArray_init(InterpreterParser.Array_initContext ctx) {

        String name = ctx.array_access(0).ID().getText();
        if(symbolArrayTable.containsKey(name)){

            visit(ctx.array_access(0));
            EntryArray entryArray = (EntryArray) symbolArrayTable.get(name);
            String arrayType = entryArray.getType();

            if(ctx.ID()!=null){
                String secondId = ctx.ID().getText();

                if(symbolVariableTable.containsKey(secondId)){
                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(secondId);
                    String secondTypeId = entry.getType();

                    if (!arrayType.equalsIgnoreCase(secondTypeId) && !arrayType.equalsIgnoreCase("string")) {
                        listaErrores.add("Error: El arreglo '" + name + "' de tipo " + arrayType + " no se le puede asignar un " + secondTypeId + ".");
                    }

                } else if(symbolConstTable.containsKey(secondId)){
                    EntryConst entry = (EntryConst) symbolConstTable.get(secondId);
                    String secondTypeId = entry.getType();

                    if (!arrayType.equalsIgnoreCase(secondTypeId) && !arrayType.equalsIgnoreCase("string")) {
                        listaErrores.add("Error: El arreglo '" + name + "' de tipo " + arrayType + " no se le puede asignar un " + secondTypeId + ".");
                    }

                } else {
                    listaErrores.add("Error: La variable o constante '" + secondId + "' no existe.");
                }
            }

            if (ctx.NUMBER() != null) {
                if (!arrayType.equalsIgnoreCase("integer") && !arrayType.equalsIgnoreCase("string")) {
                    listaErrores.add("Error: El arreglo '" + name + "' de tipo " + arrayType + " no se le puede asignar un Integer.");
                }
            }else if (ctx.TEXT() != null) {
                if (!arrayType.equalsIgnoreCase("string")) {
                    listaErrores.add("Error: El arreglo '" + name + "' de tipo " + arrayType + " no se le puede asignar un String.");
                }
            } else if (ctx.CHAR() != null) {
                if (!arrayType.equalsIgnoreCase("char")) {
                    listaErrores.add("Error: El arreglo '" + name + "' de tipo " + arrayType + " no se le puede asignar un String.");
                }
            } else if (ctx.simple_expression() != null) {

                if (!arrayType.equalsIgnoreCase("integer")) {
                    listaErrores.add("Error: El arreglo '" + name + "' de tipo " + arrayType + " no se le puede asignar un integer.");
                } else {
                    visit(ctx.simple_expression());
                }
            } else if (ctx.BOOLEANVALUE() != null) {
                if (!arrayType.equalsIgnoreCase("boolean")) {
                    listaErrores.add("Error: El arreglo '" + name + "' de tipo " + arrayType + " no se le puede asignar un boolean.");
                }
            }else if (ctx.function_Call() != null) {
                if (symbolFunctionTable.containsKey(ctx.function_Call().ID().getText())) {

                    EntryFunction functionEntry = (EntryFunction) symbolFunctionTable.get(ctx.function_Call().ID().getText());
                    String returnType = functionEntry.getType();

                    if (!arrayType.equalsIgnoreCase(returnType)) {
                        listaErrores.add("Error: El arreglo '" + name + "' de tipo " + arrayType + " no se le puede asignar un " + returnType + ".");
                    }

                    visit(ctx.function_Call());

                } else {
                    listaErrores.add("Error: La función '" + ctx.function_Call().ID().getText() + "' no existe.");
                }
            }else if(ctx.array_access().size()==2){
                if(symbolArrayTable.containsKey(ctx.array_access(1).ID().getText())){

                    visit(ctx.array_access(1));
                    EntryArray entryArray2 = (EntryArray) symbolArrayTable.get(ctx.array_access(1).ID().getText());
                    String arrayType2 = entryArray2.getType();

                    if (!arrayType.equalsIgnoreCase(arrayType2)) {
                        listaErrores.add("Error: El arreglo '" + name + "' de tipo " + arrayType + " no se le puede asignar un " + arrayType2 + ".");
                    }

                }else{
                    listaErrores.add("Error: El arreglo '" + ctx.array_access(1).ID().getText() + "' no existe.");
                }
            }else if(ctx.arrayBi_access()!=null){
                if(symbolArraybiTable.containsKey(ctx.arrayBi_access().ID().getText())){

                    visit(ctx.arrayBi_access());
                    EntryArrayBidi entryArraybi = (EntryArrayBidi) symbolArraybiTable.get(ctx.arrayBi_access().ID().getText());
                    String arrayType2 = entryArraybi.getType();

                    if (!arrayType.equalsIgnoreCase(arrayType2)) {
                        listaErrores.add("Error: El arreglo '" + name + "' de tipo " + arrayType + " no se le puede asignar un " + arrayType2 + ".");
                    }

                }else{
                    listaErrores.add("Error: El arreglo bidimensional'" + ctx.arrayBi_access().ID().getText() + "' no existe.");
                }
            }


        }else{
            listaErrores.add("Error: El arreglo '" + name + "' no existe.");
        }

        return null;
    }

    @Override
    public Object visitArrayBi_init(InterpreterParser.ArrayBi_initContext ctx) {

        String name = ctx.arrayBi_access(0).ID().getText();
        if(symbolArraybiTable.containsKey(name)){

            visit(ctx.arrayBi_access(0));
            EntryArrayBidi entryArraybidi = (EntryArrayBidi) symbolArraybiTable.get(name);
            String arrayType = entryArraybidi.getType();

            if(ctx.ID()!=null){
                String secondId = ctx.ID().getText();

                if(symbolVariableTable.containsKey(secondId)){
                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(secondId);
                    String secondTypeId = entry.getType();

                    if (!arrayType.equalsIgnoreCase(secondTypeId) && !arrayType.equalsIgnoreCase("string")) {
                        listaErrores.add("Error: El arreglo bidimensional '" + name + "' de tipo " + arrayType + " no se le puede asignar un " + secondTypeId + ".");
                    }

                } else if(symbolConstTable.containsKey(secondId)){
                    EntryConst entry = (EntryConst) symbolConstTable.get(secondId);
                    String secondTypeId = entry.getType();

                    if (!arrayType.equalsIgnoreCase(secondTypeId) && !arrayType.equalsIgnoreCase("string")) {
                        listaErrores.add("Error: El arreglo bidimensional '" + name + "' de tipo " + arrayType + " no se le puede asignar un " + secondTypeId + ".");
                    }

                } else {
                    listaErrores.add("Error: La variable o constante '" + secondId + "' no existe.");
                }
            }

            if (ctx.NUMBER() != null) {
                if (!arrayType.equalsIgnoreCase("integer") && !arrayType.equalsIgnoreCase("string")) {
                    listaErrores.add("Error: El arreglo bidimensional '" + name + "' de tipo " + arrayType + " no se le puede asignar un Integer.");
                }
            }else if (ctx.TEXT() != null) {
                if (!arrayType.equalsIgnoreCase("string")) {
                    listaErrores.add("Error: El arreglo bidimensional '" + name + "' de tipo " + arrayType + " no se le puede asignar un String.");
                }
            } else if (ctx.CHAR() != null) {
                if (!arrayType.equalsIgnoreCase("char")) {
                    listaErrores.add("Error: El arreglo bidimensional '" + name + "' de tipo " + arrayType + " no se le puede asignar un String.");
                }
            } else if (ctx.simple_expression() != null) {

                if (!arrayType.equalsIgnoreCase("integer")) {
                    listaErrores.add("Error: El arreglo bidimensional '" + name + "' de tipo " + arrayType + " no se le puede asignar un integer.");
                } else {
                    visit(ctx.simple_expression());
                }
            } else if (ctx.BOOLEANVALUE() != null) {
                if (!arrayType.equalsIgnoreCase("boolean")) {
                    listaErrores.add("Error: El arreglo bidimensional '" + name + "' de tipo " + arrayType + " no se le puede asignar un boolean.");
                }
            }else if (ctx.function_Call() != null) {
                if (symbolFunctionTable.containsKey(ctx.function_Call().ID().getText())) {

                    EntryFunction functionEntry = (EntryFunction) symbolFunctionTable.get(ctx.function_Call().ID().getText());
                    String returnType = functionEntry.getType();

                    if (!arrayType.equalsIgnoreCase(returnType)) {
                        listaErrores.add("Error: El arreglo bidimensional '" + name + "' de tipo " + arrayType + " no se le puede asignar un " + returnType + ".");
                    }

                    visit(ctx.function_Call());

                } else {
                    listaErrores.add("Error: La función '" + ctx.function_Call().ID().getText() + "' no existe.");
                }
            }else if(ctx.arrayBi_access().size()==2){
                if(symbolArraybiTable.containsKey(ctx.arrayBi_access(1).ID().getText())){

                    visit(ctx.arrayBi_access(1));
                    EntryArray entryArray2 = (EntryArray) symbolArraybiTable.get(ctx.arrayBi_access(1).ID().getText());
                    String arrayType2 = entryArray2.getType();

                    if (!arrayType.equalsIgnoreCase(arrayType2)) {
                        listaErrores.add("Error: El arreglo bidimensional '" + name + "' de tipo " + arrayType + " no se le puede asignar un " + arrayType2 + ".");
                    }

                }else{
                    listaErrores.add("Error: El arreglo bidimensional '" + ctx.arrayBi_access(1).ID().getText() + "' no existe.");
                }
            }else if(ctx.array_access()!=null){
                if(symbolArrayTable.containsKey(ctx.array_access().ID().getText())){

                    visit(ctx.array_access());
                    EntryArray entryArray = (EntryArray) symbolArrayTable.get(ctx.array_access().ID().getText());
                    String arrayType2 = entryArray.getType();

                    if (!arrayType.equalsIgnoreCase(arrayType2)) {
                        listaErrores.add("Error: El arreglo bidimensional '" + name + "' de tipo " + arrayType + " no se le puede asignar un " + arrayType2 + ".");
                    }

                }else{
                    listaErrores.add("Error: El arreglo '" + ctx.array_access().ID().getText() + "' no existe.");
                }
            }


        }else{
            listaErrores.add("Error: El arreglo bidimensional '" + name + "' no existe.");
        }

        return null;
    }
    EntryFunction functionEntry;
    boolean retorna = false;
    @Override
    public Object visitFunction_declaration(InterpreterParser.Function_declarationContext ctx) {
        sumarAmbito();

        String functionName = ctx.ID().getText();
        String returnType = ctx.TYPE().getText();
        functionEntry = null;
        retorna = false;

        // Verificar si la función ya existe en la tabla de símbolos
        if (symbolFunctionTable.containsKey(functionName) || exist(functionName)) {
            listaErrores.add("Error: Ya existe una variable o funcion con el nombre '" + functionName + "'.");

            eliminarVariable_Constante_arreglo(getAmbito());
            restarAmbito();
            return null;
        } else {
            // Crear la entrada de la función
            functionEntry = new EntryFunction(functionName, returnType, getAmbito());
        }

        // Si hay parámetros, agregarlos a la entrada de la función
        if (ctx.parameters_declaration() != null) {
            visit(ctx.parameters_declaration());
        }

        // Agregar la función a la tabla de símbolos
        symbolFunctionTable.put(functionName, functionEntry);

        if (ctx.declarations() != null) {
            for (int i = 0; i < ctx.declarations().size(); i++) {
                visit(ctx.declarations(i));
            }
        }

        if (ctx.statement_function() != null) {
            for (int i = 0; i < ctx.statement_function().size(); i++) {
                visit(ctx.statement_function(i));
            }
        }

        if(!retorna){
            listaErrores.add("Error: La funcion '" + functionName + "' debe de retornar un valor.");
        }

        eliminarVariable_Constante_arreglo(getAmbito());
        restarAmbito();
        functionEntry = null;
        return null;
    }

    public Object visitParameters_declaration(InterpreterParser.Parameters_declarationContext ctx) {

        if(ctx.ID()!=null){
            for(int i =0; i<ctx.ID().size(); ++i){
                if (!exist(ctx.ID(i).getText())) {
                    EntryVariable entry = new EntryVariable(ctx.ID(i).getText(), ctx.TYPE().getText(), getAmbito());
                    getSymbolVariableTable().put(ctx.ID(i).getText(), entry);

                    Map<String, Object> parametros = new HashMap<>();
                    String parameterName = ctx.ID(i).getText();
                    String parameterType = ctx.TYPE().getText();
                    parametros.put(parameterName, parameterType);
                    functionEntry.addParameter(parametros);
                }else{
                    Map<String, Object> parametros = new HashMap<>();
                    String parameterName = ctx.ID(i).getText();
                    String parameterType = ctx.TYPE().getText();
                    parametros.put(parameterName, parameterType);
                    functionEntry.addParameter(parametros);
                }
            }
        }

        if(ctx.parameters_declaration()!=null){
            for(int i=0; i<ctx.parameters_declaration().size();i++){
                visit(ctx.parameters_declaration(i));
            }
        }

        return null;
    }

    @Override
    public Object visitStatement_function(InterpreterParser.Statement_functionContext ctx) {

        if(ctx.variable_init()!=null){
            if(ctx.variable_init().ID(0).getText().equals(functionEntry.getName())){
                retorna = true;

                if(ctx.variable_init().ID(1)!=null){
                    if(symbolVariableTable.containsKey(ctx.variable_init().ID(1).getText())){
                        EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.variable_init().ID(1).getText());
                        String secondTypeId = entry.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(secondTypeId)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + secondTypeId + ".");
                        }
                    }else if(symbolConstTable.containsKey(ctx.variable_init().ID(1).getText())){
                        EntryVariable entry = (EntryVariable) symbolConstTable.get(ctx.variable_init().ID(1).getText());
                        String secondTypeId = entry.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(secondTypeId)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + secondTypeId + ".");
                        }
                    }
                    else{
                        listaErrores.add("Error: La variable o constante '" + ctx.variable_init().ID(1).getText() + "' no existe.");
                    }
                }

                if(ctx.variable_init().NUMBER()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("integer")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Integer.");
                    }
                }

                if(ctx.variable_init().TEXT()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("string")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un String.");
                    }
                }

                if(ctx.variable_init().CHAR()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("char")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Char.");
                    }
                }

                if(ctx.variable_init().BOOLEANVALUE()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("boolean")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Boolean.");
                    }
                }

                if(ctx.variable_init().simple_expression()!=null){
                    visit(ctx.variable_init().simple_expression());
                    if (!functionEntry.getType().equalsIgnoreCase("integer")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Integer.");
                    }
                }

                if(ctx.variable_init().function_Call()!=null){
                    listaErrores.add("Error: Una funcion no puede retornar otra funcion.");
                }

                if(ctx.variable_init().array_access()!=null){
                    if(symbolArrayTable.containsKey(ctx.variable_init().array_access().ID().getText())){

                        visit(ctx.variable_init().array_access());
                        EntryArray entryArray = (EntryArray) symbolArrayTable.get(ctx.variable_init().array_access().ID().getText());
                        String arrayType = entryArray.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(arrayType)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + arrayType + ".");
                        }

                    }else{
                        listaErrores.add("Error: El arreglo '" + ctx.variable_init().array_access().ID().getText() + "' no existe.");
                    }
                }

                if(ctx.variable_init().arrayBi_access()!=null){
                    if(symbolArraybiTable.containsKey(ctx.variable_init().arrayBi_access().ID().getText())){

                        visit(ctx.variable_init().arrayBi_access());
                        EntryArrayBidi entryArray = (EntryArrayBidi) symbolArraybiTable.get(ctx.variable_init().arrayBi_access().ID().getText());
                        String arrayType = entryArray.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(arrayType)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + arrayType + ".");
                        }

                    }else{
                        listaErrores.add("Error: El arreglo bidimensional '" + ctx.variable_init().arrayBi_access().ID().getText() + "' no existe.");
                    }
                }

            }else{
                visit(ctx.variable_init());
            }
        }

        if(ctx.array_init()!=null){
            visit(ctx.array_init());
        }

        if(ctx.for_loop()!=null){
            visit(ctx.for_loop());
        }

        if(ctx.while_loop()!=null){
            visit(ctx.while_loop());
        }

        if(ctx.write()!=null){
            visit(ctx.write());
        }

        if(ctx.writeln_stmt()!=null){
            visit(ctx.writeln_stmt());
        }

        if(ctx.if_statement()!=null){
            visit(ctx.if_statement());

            if(ctx.if_statement().else_statement()!=null){
                for(int i = 0; i<ctx.if_statement().else_statement().size(); i++){
                    visit(ctx.if_statement().else_statement(i));
                }
            }
        }

        if(ctx.read_call()!=null){
            visit(ctx.read_call());
        }

        if(ctx.readln_call()!=null){
            visit(ctx.readln_call());
        }

        if(ctx.array_init()!=null){
            visit(ctx.array_init());
        }

        if(ctx.arrayBi_init()!=null){
            visit(ctx.arrayBi_init());
        }

        return null;
    }

    @Override
    public Object visitFunction_Call(InterpreterParser.Function_CallContext ctx) {

        boolean tieneParametro;
        ArrayList<String> listaP = new ArrayList<>();
        String functionName = ctx.ID().getText();

        EntryFunction functionEntry = (EntryFunction) symbolFunctionTable.get(functionName);
        ArrayList<Map<String, Object>> parameters = functionEntry.getParameters();

        if (parameters != null && !parameters.isEmpty()) {
            tieneParametro = true;
            for (Map<String, Object> parameter : parameters) {
                for (Map.Entry<String, Object> entry : parameter.entrySet()) {
                    listaP.add((String) entry.getValue());
                }
            }
            System.out.println();
        } else {
            tieneParametro = false;
        }

        if(ctx.parameter_init()!=null){

            if(!tieneParametro){
                listaErrores.add("Error: La funcion " + functionName + " no pide parametros.");
                return null;
            }

            InterpreterParser.Parameter_initContext parametroInit = ctx.parameter_init();


            if(parametroInit.terms()!=null){

                if(parametroInit.terms().size()!= listaP.size()){
                    listaErrores.add("Error: En la funcion '" + functionName + "' se ingresaron " + parametroInit.terms().size() + " parametros pero pide " + listaP.size() + " parametros.");
                    return null;
                }

                for(int i =0; i<parametroInit.terms().size(); i++){

                    if(parametroInit.terms(i).ID()!=null){
                        String idName = parametroInit.terms(i).ID().getText();

                        if(symbolVariableTable.containsKey(idName)){
                            EntryVariable entry = (EntryVariable) symbolVariableTable.get(idName);
                            String TypeId = entry.getType();

                            if (!listaP.get(i).equalsIgnoreCase(TypeId)) {
                                listaErrores.add("Error: En la funcion '" + functionName + "' la variable o constante '" + idName + "' debe de ser un " + listaP.get(i) + ".");
                            }

                        } else if(symbolConstTable.containsKey(idName)){
                            EntryConst entry = (EntryConst) symbolConstTable.get(idName);
                            String TypeId = entry.getType();

                            if (!listaP.get(i).equalsIgnoreCase(TypeId)) {
                                listaErrores.add("Error: En la funcion '" + functionName + "' la variable o constante '" + idName + "' debe de ser un " + listaP.get(i) + ".");
                            }

                        } else {
                            listaErrores.add("Error: La variable o constante '" + idName + "' no existe.");
                        }
                    }

                    if(parametroInit.terms(i).CHAR()!=null){
                        if(!listaP.get(i).equalsIgnoreCase("char")){
                            listaErrores.add("Error: La funcion '" + functionName + "' pide un " + listaP.get(i) + " no un char.");
                        }
                    }

                    if(parametroInit.terms(i).BOOLEANVALUE()!=null){
                        if(!listaP.get(i).equalsIgnoreCase("boolean")){
                            listaErrores.add("Error: La funcion '" + functionName + "' pide un " + listaP.get(i) + " no un boolean.");
                        }
                    }

                    if(parametroInit.terms(i).NUMBER()!=null){
                        if(!listaP.get(i).equalsIgnoreCase("integer")){
                            listaErrores.add("Error: La funcion '" + functionName + "' pide un " + listaP.get(i) + " no un integer.");
                        }
                    }

                    if(parametroInit.terms(i).TEXT()!=null){
                        if(!listaP.get(i).equalsIgnoreCase("string")){
                            listaErrores.add("Error: La funcion '" + functionName + "' pide un " + listaP.get(i) + " no un string.");
                        }
                    }

                    if(parametroInit.terms(i).simple_expression()!=null){
                        if(!listaP.get(i).equalsIgnoreCase("integer")){
                            listaErrores.add("Error: La funcion '" + functionName + "' pide un " + listaP.get(i) + " no un integer.");
                        }else{
                            visit(parametroInit.terms(i).simple_expression());
                        }
                    }

                    if(parametroInit.terms(i).array_access()!=null){
                        if(symbolArrayTable.containsKey(parametroInit.terms(i).array_access().ID().getText())){

                            visit(parametroInit.terms(i).array_access());
                            EntryArray entryArray = (EntryArray) symbolArrayTable.get(parametroInit.terms(i).array_access().ID().getText());
                            String arrayType = entryArray.getType();

                            if (!listaP.get(i).equalsIgnoreCase(arrayType)) {
                                listaErrores.add("Error: La funcion '" + functionName + "' pide un " + listaP.get(i) + " no un " + arrayType + ".");
                            }

                        }else{
                            listaErrores.add("Error: El arreglo '" + parametroInit.terms(i).array_access().ID().getText() + "' no existe.");
                        }
                    }

                    if(parametroInit.terms(i).arrayBi_access()!=null) {

                        if (symbolArraybiTable.containsKey(parametroInit.terms(i).arrayBi_access().ID().getText())) {

                            visit(parametroInit.terms(i).arrayBi_access());
                            EntryArrayBidi entryArray = (EntryArrayBidi) symbolArraybiTable.get(parametroInit.terms(i).arrayBi_access().ID().getText());
                            String arrayType = entryArray.getType();

                            if (!listaP.get(i).equalsIgnoreCase(arrayType)) {
                                listaErrores.add("Error: La funcion '" + functionName + "' pide un " + listaP.get(i) + " no un " + arrayType + ".");
                            }

                        } else {
                            listaErrores.add("Error: El arreglo bidimensional '" + parametroInit.terms(i).arrayBi_access().ID().getText() + "' no existe.");
                        }
                    }
                }
            }
        }else{
            if(tieneParametro){
                listaErrores.add("Error: La funcion '" + functionName + "' pide parametros.");
                return null;
            }
        }
        return null;
    }

    @Override
    public Object visitVariable_init(InterpreterParser.Variable_initContext ctx) {
        List<TerminalNode> idNodes = ctx.getTokens(InterpreterLexer.ID);

        String firstId = idNodes.get(0).getText();
        String firstTypeId = "";

        if(symbolConstTable.containsKey(firstId)){
            listaErrores.add("Error: Una constante no puede cambiar de valor.");
            return null;
        }

        if (!symbolVariableTable.containsKey(firstId)) {
            listaErrores.add("Error: La variable '" + firstId + "' no existe.");
            return null;
        } else {
            EntryVariable entry = (EntryVariable) symbolVariableTable.get(firstId);
            firstTypeId = entry.getType();
        }

        if (idNodes.size() == 2) {
            String secondId = idNodes.get(1).getText();

            if(symbolVariableTable.containsKey(secondId)){
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(secondId);
                String secondTypeId = entry.getType();

                if (!firstTypeId.equalsIgnoreCase(secondTypeId) && !firstTypeId.equalsIgnoreCase("string")) {
                    listaErrores.add("Error: La variable '" + firstId + "' de tipo " + firstTypeId + " no se le puede asignar un " + secondTypeId + ".");
                }

            } else if(symbolConstTable.containsKey(secondId)){
                EntryConst entry = (EntryConst) symbolConstTable.get(secondId);
                String secondTypeId = entry.getType();

                if (!firstTypeId.equalsIgnoreCase(secondTypeId) && !firstTypeId.equalsIgnoreCase("string")) {
                    listaErrores.add("Error: La variable '" + firstId + "' de tipo " + firstTypeId + " no se le puede asignar un " + secondTypeId + ".");
                }

            } else {
                listaErrores.add("Error: La variable o constante '" + secondId + "' no existe.");
            }
        }

        if (ctx.NUMBER() != null) {
            if (!firstTypeId.equalsIgnoreCase("integer") && !firstTypeId.equalsIgnoreCase("string")) {
                listaErrores.add("Error: La variable '" + firstId + "' de tipo " + firstTypeId + " no se le puede asignar un Integer.");
            }
        }else if (ctx.TEXT() != null) {
            if (!firstTypeId.equalsIgnoreCase("string")) {
                listaErrores.add("Error: La variable '" + firstId + "' de tipo " + firstTypeId + " no se le puede asignar un String.");
            }
        } else if (ctx.CHAR() != null) {
            if (!firstTypeId.equalsIgnoreCase("char")) {
                listaErrores.add("Error: La variable '" + firstId + "' de tipo " + firstTypeId + " no se le puede asignar un String.");
            }
        } else if (ctx.simple_expression() != null) {

            if (!firstTypeId.equalsIgnoreCase("integer")) {
                listaErrores.add("Error: La variable '" + firstId + "' de tipo " + firstTypeId + " no se le puede asignar un integer.");
            } else {
                visit(ctx.simple_expression());
            }
        } else if (ctx.BOOLEANVALUE() != null) {
            if (!firstTypeId.equalsIgnoreCase("boolean")) {
                listaErrores.add("Error: La variable '" + firstId + "' de tipo " + firstTypeId + " no se le puede asignar un boolean.");
            }
        }else if (ctx.function_Call() != null) {
            if (symbolFunctionTable.containsKey(ctx.function_Call().ID().getText())) {

                EntryFunction functionEntry = (EntryFunction) symbolFunctionTable.get(ctx.function_Call().ID().getText());
                String returnType = functionEntry.getType();

                if (!firstTypeId.equalsIgnoreCase(returnType)) {
                    listaErrores.add("Error: La variable '" + firstId + "' de tipo " + firstTypeId + " no se le puede asignar un " + returnType + ".");
                }

                visit(ctx.function_Call());

            } else {
                listaErrores.add("Error: La función '" + ctx.function_Call().ID().getText() + "' no existe.");
            }
        }else if(ctx.array_access()!=null){
            if(symbolArrayTable.containsKey(ctx.array_access().ID().getText())){

                visit(ctx.array_access());
                EntryArray entryArray = (EntryArray) symbolArrayTable.get(ctx.array_access().ID().getText());
                String arrayType = entryArray.getType();

                if (!firstTypeId.equalsIgnoreCase(arrayType)) {
                    listaErrores.add("Error: La variable '" + firstId + "' de tipo " + firstTypeId + " no se le puede asignar un " + arrayType + ".");
                }

            }else{
                listaErrores.add("Error: El arreglo '" + ctx.array_access().ID().getText() + "' no existe.");
            }
        }else if(ctx.arrayBi_access()!=null){
            if(symbolArraybiTable.containsKey(ctx.arrayBi_access().ID().getText())){

                visit(ctx.arrayBi_access());
                EntryArrayBidi entryArray = (EntryArrayBidi) symbolArraybiTable.get(ctx.arrayBi_access().ID().getText());
                String arrayType = entryArray.getType();

                if (!firstTypeId.equalsIgnoreCase(arrayType)) {
                    listaErrores.add("Error: La variable '" + firstId + "' de tipo " + firstTypeId + " no se le puede asignar un " + arrayType + ".");
                }

            }else{
                listaErrores.add("Error: El arreglo bidimensional '" + ctx.arrayBi_access().ID().getText() + "' no existe.");
            }
        }

        return null;
    }

    @Override
    public Object visitConst_variable_declaration(InterpreterParser.Const_variable_declarationContext ctx) {
        List<TerminalNode> idNodes = ctx.getTokens(InterpreterLexer.ID);
        String name = idNodes.get(0).getText();

        if (exist(name)) {
            listaErrores.add("Error: La variable o constante '" + name + "' ya ha sido declarada anteriormente.");
        } else {
            String type = "";

            if (ctx.TEXT() != null) {
                type = "string";
            }else if(ctx.CHAR()!=null){
                type = "char";
            }else{
                listaErrores.add("Error: Una constante solo puede ser un string o char.");
            }

            EntryConst entry = new EntryConst(name, type, getAmbito());
            getSymbolConstTable().put(name, entry);
        }

        return null;
    }

    @Override
    public Object visitSimple_expression(InterpreterParser.Simple_expressionContext ctx) {
        for (int i = 0; i < ctx.factor().size(); i++) {
            visit(ctx.factor(i));
        }
        return null;
    }

    @Override
    public Object visitFactor(InterpreterParser.FactorContext ctx) {
        if (ctx.ID() != null) {
            List<TerminalNode> idNodes = ctx.getTokens(InterpreterLexer.ID);
            String idTerm = idNodes.get(0).getText();

            if (symbolVariableTable.containsKey(idTerm)) {
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(idTerm);

                if (!entry.getType().equalsIgnoreCase("integer")) {
                    listaErrores.add("Error: La variable '" + idTerm + "' tiene que ser un Integer.");
                }
            } else if (symbolConstTable.containsKey(idTerm)) {
                listaErrores.add("Error: La constante '" + idTerm + "' no es valida.");
            } else {
                listaErrores.add("Error: La variable '" + idTerm + "' no existe.");
            }
        }

        if(ctx.array_access()!=null){
            if(symbolArrayTable.containsKey(ctx.array_access().ID().getText())){

                visit(ctx.array_access());
                EntryArray entryArray = (EntryArray) symbolArrayTable.get(ctx.array_access().ID().getText());
                String arrayType = entryArray.getType();

                if (!arrayType.equalsIgnoreCase("integer")) {
                    listaErrores.add("Error: El arreglo '" + ctx.array_access().ID().getText() + "' tiene que ser un Integer.");
                }


            }else{
                listaErrores.add("Error: El arreglo '" + ctx.array_access().ID().getText() + "' no existe.");
            }
        }

        if(ctx.arrayBi_access()!=null) {
            if (symbolArraybiTable.containsKey(ctx.arrayBi_access().ID().getText())) {

                visit(ctx.arrayBi_access());
                EntryArrayBidi entryArray = (EntryArrayBidi) symbolArraybiTable.get(ctx.arrayBi_access().ID().getText());
                String arrayType = entryArray.getType();

                if (!arrayType.equalsIgnoreCase("integer")) {
                    listaErrores.add("Error: El arreglo bidimensional '" + ctx.arrayBi_access().ID().getText() + "' tiene que ser un Integer.");
                }


            } else {
                listaErrores.add("Error: El arreglo bidimensional '" + ctx.arrayBi_access().ID().getText() + "' no existe.");
            }
        }

        if (ctx.operacones_parentesis() != null) {
            visit(ctx.operacones_parentesis());
        }

        return null;
    }

    @Override
    public Object visitOperacones_parentesis(InterpreterParser.Operacones_parentesisContext ctx) {
        visit(ctx.simple_expression());
        return null;
    }

    @Override
    public Object visitComparison(InterpreterParser.ComparisonContext ctx) {

        String tipoTerm1 = "";
        String tipoTerm2 = "";

        if(ctx.terms(0).ID()!=null){

            String idTerm = ctx.terms(0).ID().getText();

            if(symbolVariableTable.containsKey(idTerm)){
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(idTerm);
                tipoTerm1 = entry.getType();

            }else if(symbolConstTable.containsKey(idTerm)){
                EntryConst entry = (EntryConst) symbolConstTable.get(idTerm);
                tipoTerm1 = entry.getType();

            }else{
                listaErrores.add("Error: La variable '" + idTerm + "' no existe.");
            }

        }else if(ctx.terms(0).NUMBER()!=null){
            tipoTerm1="integer";

        }else if(ctx.terms(0).TEXT()!=null){
            tipoTerm1="string";

        }else if(ctx.terms(0).CHAR()!=null){
            tipoTerm1="char";

        }else if(ctx.terms(0).BOOLEANVALUE()!=null){
            tipoTerm1="boolean";

        }else if(ctx.terms(0).simple_expression()!=null){
            tipoTerm1="integer";
            visit(ctx.terms(0).simple_expression());
        }else if(ctx.terms(0).array_access()!=null){
            if(symbolArrayTable.containsKey(ctx.terms(0).array_access().ID().getText())){

                visit(ctx.terms(0).array_access());
                EntryArray entryArray = (EntryArray) symbolArrayTable.get(ctx.terms(0).array_access().ID().getText());
                String arrayType = entryArray.getType();

                tipoTerm1 = arrayType;

            }else{
                listaErrores.add("Error: El arreglo '" + ctx.terms(0).array_access().ID().getText() + "' no existe.");
            }
        }else if(ctx.terms(0).arrayBi_access()!=null) {
            if (symbolArraybiTable.containsKey(ctx.terms(0).arrayBi_access().ID().getText())) {

                visit(ctx.terms(0).arrayBi_access());
                EntryArrayBidi entryArray = (EntryArrayBidi) symbolArraybiTable.get(ctx.terms(0).arrayBi_access().ID().getText());
                String arrayType = entryArray.getType();

                tipoTerm1 = arrayType;

            } else {
                listaErrores.add("Error: El arreglo bidimensional '" + ctx.terms(0).arrayBi_access().ID().getText() + "' no existe.");
            }
        }

        if(ctx.terms(1).ID()!=null){

            String idTerm = ctx.terms(1).ID().getText();

            if(symbolVariableTable.containsKey(idTerm)){
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(idTerm);
                tipoTerm2 = entry.getType();

            }else if(symbolConstTable.containsKey(idTerm)){
                EntryConst entry = (EntryConst) symbolConstTable.get(idTerm);
                tipoTerm2 = entry.getType();

            }else{
                listaErrores.add("Error: La variable '" + idTerm + "' no existe.");
            }

        }else if(ctx.terms(1).array_access()!=null){
            if(symbolArrayTable.containsKey(ctx.terms(1).array_access().ID().getText())){

                visit(ctx.terms(1).array_access());
                EntryArray entryArray = (EntryArray) symbolArrayTable.get(ctx.terms(1).array_access().ID().getText());
                String arrayType = entryArray.getType();

                tipoTerm1 = arrayType;

            }else{
                listaErrores.add("Error: El arreglo '" + ctx.terms(1).array_access().ID().getText() + "' no existe.");
            }
        }else if(ctx.terms(1).arrayBi_access()!=null) {
            if (symbolArraybiTable.containsKey(ctx.terms(1).arrayBi_access().ID().getText())) {

                visit(ctx.terms(1).arrayBi_access());
                EntryArrayBidi entryArray = (EntryArrayBidi) symbolArraybiTable.get(ctx.terms(1).arrayBi_access().ID().getText());
                String arrayType = entryArray.getType();

                tipoTerm1 = arrayType;

            } else {
                listaErrores.add("Error: El arreglo bidimensional '" + ctx.terms(0).arrayBi_access().ID().getText() + "' no existe.");
            }
        }else if(ctx.terms(1).NUMBER()!=null){
            tipoTerm2="integer";

        }else if(ctx.terms(1).TEXT()!=null){
            tipoTerm2="string";

        }else if(ctx.terms(1).CHAR()!=null){
            tipoTerm2="char";

        }else if(ctx.terms(1).BOOLEANVALUE()!=null){
            tipoTerm2="boolean";

        }else if(ctx.terms(1).simple_expression()!=null){
            tipoTerm2="integer";
            visit(ctx.terms(1).simple_expression());
        }

        if(!tipoTerm1.equalsIgnoreCase(tipoTerm2)){
            listaErrores.add("Error: no se puede comparar un '" + tipoTerm1 + "' con un '" + tipoTerm2 + "'");
        }else{
            if(tipoTerm1.equalsIgnoreCase("string")){
                if(ctx.operaciones().EQUALS()==null && ctx.operaciones().NOT_EQUALS()==null ){
                    listaErrores.add("Error: no se puede hacer esa accion con un String");
                }
            }
        }


        return null;
    }

    @Override
    public Object visitWriteln_stmt(InterpreterParser.Writeln_stmtContext ctx) {

        for(int ii = 0; ii<ctx.write_contain().size();ii++){
            if(ctx.write_contain(ii).ID()!=null){
                String idTerm = ctx.write_contain(ii).ID().getText();
                if(!exist(idTerm)){
                    listaErrores.add("Error: La variable o constante '" + idTerm + "' no existe.");
                }
            }

            if(ctx.write_contain(ii).array_access()!=null){
                String idTerm = ctx.write_contain(ii).array_access().ID().getText();
                if(!symbolArrayTable.containsKey(idTerm)){
                    listaErrores.add("Error: El arreglo '" + idTerm + "' no existe.");
                }else
                    visit(ctx.write_contain(ii).array_access());
            }

            if(ctx.write_contain(ii).arrayBi_access()!=null){
                String idTerm = ctx.write_contain(ii).arrayBi_access().ID().getText();
                if(!symbolArraybiTable.containsKey(idTerm)){
                    listaErrores.add("Error: El arreglo bidimensional '" + idTerm + "' no existe.");
                }else
                    visit(ctx.write_contain(ii).arrayBi_access());
            }
        }
        return null;
    }

    @Override
    public Object visitWrite(InterpreterParser.WriteContext ctx) {

        for(int ii = 0; ii<ctx.write_contain().size();ii++){
            if(ctx.write_contain(ii).ID()!=null){
                String idTerm = ctx.write_contain(ii).ID().getText();
                if(!exist(idTerm)){
                    listaErrores.add("Error: La variable o constante '" + idTerm + "' no existe.");
                }
            }

            if(ctx.write_contain(ii).array_access()!=null){
                String idTerm = ctx.write_contain(ii).array_access().ID().getText();
                if(!symbolArrayTable.containsKey(idTerm)){
                    listaErrores.add("Error: El arreglo '" + idTerm + "' no existe.");
                }else
                    visit(ctx.write_contain(ii).array_access());
            }

            if(ctx.write_contain(ii).arrayBi_access()!=null){
                String idTerm = ctx.write_contain(ii).arrayBi_access().ID().getText();
                if(!symbolArraybiTable.containsKey(idTerm)){
                    listaErrores.add("Error: El arreglo bidimensional '" + idTerm + "' no existe.");
                }else
                    visit(ctx.write_contain(ii).arrayBi_access());
            }
        }
        return null;
    }

    @Override
    public Object visitRead_call(InterpreterParser.Read_callContext ctx) {

        if(ctx.ID()!=null){
            String idTerm = ctx.ID().getText();
            if(!exist(idTerm)){
                listaErrores.add("Error: La variable o constante '" + idTerm + "' no existe.");
            }
        }

        if(ctx.array_access()!=null){
            String idTerm = ctx.array_access().ID().getText();
            if(!symbolArrayTable.containsKey(idTerm)){
                listaErrores.add("Error: El arreglo '" + idTerm + "' no existe.");
            }else
                visit(ctx.array_access());
        }

        if(ctx.arrayBi_access()!=null){
            String idTerm = ctx.arrayBi_access().ID().getText();
            if(!symbolArraybiTable.containsKey(idTerm)){
                listaErrores.add("Error: El arreglo bidimensional '" + idTerm + "' no existe.");
            }else
                visit(ctx.arrayBi_access());
        }
        return null;
    }

    @Override
    public Object visitReadln_call(InterpreterParser.Readln_callContext ctx) {

        if(ctx.ID()!=null){
            String idTerm = ctx.ID().getText();
            if(!exist(idTerm)){
                listaErrores.add("Error: La variable o constante '" + idTerm + "' no existe.");
            }
        }

        if(ctx.array_access()!=null){
            String idTerm = ctx.array_access().ID().getText();
            if(!symbolArrayTable.containsKey(idTerm)){
                listaErrores.add("Error: El arreglo '" + idTerm + "' no existe.");
            }else
                visit(ctx.array_access());
        }

        if(ctx.arrayBi_access()!=null){
            String idTerm = ctx.arrayBi_access().ID().getText();
            if(!symbolArraybiTable.containsKey(idTerm)){
                listaErrores.add("Error: El arreglo bidimensonal '" + idTerm + "' no existe.");
            }else
                visit(ctx.arrayBi_access());
        }
        return null;
    }

    public boolean exist(String id){
        if(!symbolVariableTable.containsKey(id) && !symbolConstTable.containsKey(id)){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object visitFor_loop(InterpreterParser.For_loopContext ctx) {
        sumarAmbito();
        if(ctx.ID()!=null){
            String idTerm = ctx.ID().getText();
            if(!exist(idTerm)){
                listaErrores.add("Error: La variable o constante '" + idTerm + "' no existe.");
            }
        }

        if(ctx.statement_bucle()!=null){
            for(int i =0; i<ctx.statement_bucle().size();i++){

                visit(ctx.statement_bucle(i));

            }
        }

        eliminarVariable_Constante_arreglo(getAmbito());
        restarAmbito();

        return null;
    }

    @Override
    public Object visitWhile_loop(InterpreterParser.While_loopContext ctx) {
        sumarAmbito();

        if(ctx.comparison()!=null){
            visit(ctx.comparison());
        }

        if(ctx.statement_bucle()!=null){
            for(int i =0; i<ctx.statement_bucle().size();i++){
                visit(ctx.statement_bucle(i));
            }
        }

        eliminarVariable_Constante_arreglo(getAmbito());
        restarAmbito();

        return null;
    }

    @Override
    public Object visitStatement_bucle(InterpreterParser.Statement_bucleContext ctx) {

        if(ctx.declarations()!=null){

            if(ctx.declarations().const_variables()!=null){
                for(int i2=0; i2<ctx.declarations().const_variables().size();i2++) {
                    if(ctx.declarations().const_variables(i2).const_variable_declaration()!=null){
                        visit(ctx.declarations().const_variables(i2).const_variable_declaration());
                    }
                }
            }

            if(ctx.declarations().var_variables()!=null){

                for(int i2 =0; i2<ctx.declarations().var_variables().size();i2++) {
                    if(ctx.declarations().var_variables(i2).variable_declaration()!=null){
                        visit(ctx.declarations().var_variables(i2).variable_declaration());
                    }

                    if(ctx.declarations().var_variables(i2).array_declaration()!=null){
                        visit(ctx.declarations().var_variables(i2).array_declaration());
                    }

                    if(ctx.declarations().var_variables(i2).arraybi_declaration()!=null){
                        visit(ctx.declarations().var_variables(i2).arraybi_declaration());
                    }

                }
            }

        }

        if(functionEntry!=null && ctx.variable_init()!=null){
            if(ctx.variable_init().ID(0).getText().equals(functionEntry.getName())){
                retorna = true;

                if(ctx.variable_init().ID(1)!=null){
                    if(symbolVariableTable.containsKey(ctx.variable_init().ID(1).getText())){
                        EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.variable_init().ID(1).getText());
                        String secondTypeId = entry.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(secondTypeId)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + secondTypeId + ".");
                        }
                    }else if(symbolConstTable.containsKey(ctx.variable_init().ID(1).getText())){
                        EntryVariable entry = (EntryVariable) symbolConstTable.get(ctx.variable_init().ID(1).getText());
                        String secondTypeId = entry.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(secondTypeId)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + secondTypeId + ".");
                        }
                    }
                    else{
                        listaErrores.add("Error: La variable o constante '" + ctx.variable_init().ID(1).getText() + "' no existe.");
                    }
                }

                if(ctx.variable_init().NUMBER()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("integer")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Integer.");
                    }
                }

                if(ctx.variable_init().TEXT()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("string")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un String.");
                    }
                }

                if(ctx.variable_init().CHAR()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("char")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Char.");
                    }
                }

                if(ctx.variable_init().BOOLEANVALUE()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("boolean")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Boolean.");
                    }
                }

                if(ctx.variable_init().simple_expression()!=null){
                    visit(ctx.variable_init().simple_expression());
                    if (!functionEntry.getType().equalsIgnoreCase("integer")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Integer.");
                    }
                }

                if(ctx.variable_init().function_Call()!=null){
                    listaErrores.add("Error: Una funcion no puede retornar otra funcion.");
                }

                if(ctx.variable_init().array_access()!=null){
                    if(symbolArrayTable.containsKey(ctx.variable_init().array_access().ID().getText())){

                        visit(ctx.variable_init().array_access());
                        EntryArray entryArray = (EntryArray) symbolArrayTable.get(ctx.variable_init().array_access().ID().getText());
                        String arrayType = entryArray.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(arrayType)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + arrayType + ".");
                        }

                    }else{
                        listaErrores.add("Error: El arreglo '" + ctx.variable_init().array_access().ID().getText() + "' no existe.");
                    }
                }

                if(ctx.variable_init().arrayBi_access()!=null){
                    if(symbolArraybiTable.containsKey(ctx.variable_init().arrayBi_access().ID().getText())){

                        visit(ctx.variable_init().arrayBi_access());
                        EntryArrayBidi entryArray = (EntryArrayBidi) symbolArraybiTable.get(ctx.variable_init().arrayBi_access().ID().getText());
                        String arrayType = entryArray.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(arrayType)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + arrayType + ".");
                        }

                    }else{
                        listaErrores.add("Error: El arreglo bidimensional '" + ctx.variable_init().arrayBi_access().ID().getText() + "' no existe.");
                    }
                }

            }else{
                visit(ctx.variable_init());
            }

        }else{
            if(ctx.variable_init()!=null){
                visit(ctx.variable_init());
            }
        }

        if(ctx.for_loop()!=null){
            visit(ctx.for_loop());
        }

        if(ctx.while_loop()!=null){
            visit(ctx.while_loop());
        }

        if(ctx.write()!=null){
            visit(ctx.write());
        }

        if(ctx.writeln_stmt()!=null){
            visit(ctx.writeln_stmt());
        }

        if(ctx.if_statement()!=null){
            visit(ctx.if_statement());

            if(ctx.if_statement().else_statement()!=null){
                for(int i = 0; i<ctx.if_statement().else_statement().size(); i++){
                    visit(ctx.if_statement().else_statement(i));
                }
            }
        }

        if(ctx.read_call()!=null){
            visit(ctx.read_call());
        }

        if(ctx.readln_call()!=null){
            visit(ctx.readln_call());
        }

        if(ctx.array_init()!=null){
            visit(ctx.array_init());
        }

        if(ctx.arrayBi_init()!=null){
            visit(ctx.arrayBi_init());
        }
        return null;
    }

    @Override
    public Object visitIf_statement2(InterpreterParser.If_statement2Context ctx) {

        if(functionEntry!=null && ctx.variable_init()!=null){
            if(ctx.variable_init().ID(0).getText().equals(functionEntry.getName())){

                if(ctx.variable_init().ID(1)!=null){
                    if(symbolVariableTable.containsKey(ctx.variable_init().ID(1).getText())){
                        EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.variable_init().ID(1).getText());
                        String secondTypeId = entry.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(secondTypeId)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + secondTypeId + ".");
                        }
                    }else if(symbolConstTable.containsKey(ctx.variable_init().ID(1).getText())){
                        EntryVariable entry = (EntryVariable) symbolConstTable.get(ctx.variable_init().ID(1).getText());
                        String secondTypeId = entry.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(secondTypeId)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + secondTypeId + ".");
                        }
                    }
                    else{
                        listaErrores.add("Error: La variable o constante '" + ctx.variable_init().ID(1).getText() + "' no existe.");
                    }
                }

                if(ctx.variable_init().NUMBER()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("integer")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Integer.");
                    }
                }

                if(ctx.variable_init().TEXT()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("string")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un String.");
                    }
                }

                if(ctx.variable_init().CHAR()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("char")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Char.");
                    }
                }

                if(ctx.variable_init().BOOLEANVALUE()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("boolean")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Boolean.");
                    }
                }

                if(ctx.variable_init().simple_expression()!=null){
                    visit(ctx.variable_init().simple_expression());
                    if (!functionEntry.getType().equalsIgnoreCase("integer")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Integer.");
                    }
                }

                if(ctx.variable_init().function_Call()!=null){
                    listaErrores.add("Error: Una funcion no puede retornar otra funcion.");
                }

                if(ctx.variable_init().array_access()!=null){
                    if(symbolArrayTable.containsKey(ctx.variable_init().array_access().ID().getText())){

                        visit(ctx.variable_init().array_access());
                        EntryArray entryArray = (EntryArray) symbolArrayTable.get(ctx.variable_init().array_access().ID().getText());
                        String arrayType = entryArray.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(arrayType)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + arrayType + ".");
                        }

                    }else{
                        listaErrores.add("Error: El arreglo '" + ctx.variable_init().array_access().ID().getText() + "' no existe.");
                    }
                }

                if(ctx.variable_init().arrayBi_access()!=null){
                    if(symbolArraybiTable.containsKey(ctx.variable_init().arrayBi_access().ID().getText())){

                        visit(ctx.variable_init().arrayBi_access());
                        EntryArrayBidi entryArray = (EntryArrayBidi) symbolArraybiTable.get(ctx.variable_init().arrayBi_access().ID().getText());
                        String arrayType = entryArray.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(arrayType)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + arrayType + ".");
                        }

                    }else{
                        listaErrores.add("Error: El arreglo bidimensional '" + ctx.variable_init().arrayBi_access().ID().getText() + "' no existe.");
                    }
                }

            }else{
                visit(ctx.variable_init());
            }

        }else{
            if(ctx.variable_init()!=null){
                visit(ctx.variable_init());
            }
        }

        if(ctx.array_init()!=null){
            visit(ctx.array_init());
        }

        if(ctx.for_loop()!=null){
            visit(ctx.for_loop());
        }

        if(ctx.while_loop()!=null){
            visit(ctx.while_loop());
        }

        if(ctx.write()!=null){
            visit(ctx.write());
        }

        if(ctx.writeln_stmt()!=null){
            visit(ctx.writeln_stmt());
        }

        if(ctx.if_statement()!=null){
            visit(ctx.if_statement());

            if(ctx.if_statement().else_statement()!=null){
                for(int i = 0; i<ctx.if_statement().else_statement().size(); i++){
                    visit(ctx.if_statement().else_statement(i));
                }
            }
        }

        if(ctx.read_call()!=null){
            visit(ctx.read_call());
        }

        if(ctx.readln_call()!=null){
            visit(ctx.readln_call());
        }

        if(ctx.array_init()!=null){
            visit(ctx.array_init());
        }

        if(ctx.arrayBi_init()!=null){
            visit(ctx.arrayBi_init());
        }

        return null;
    }

    @Override
    public Object visitElse_statement(InterpreterParser.Else_statementContext ctx) {

        if(functionEntry!=null && ctx.variable_init()!=null){
            if(ctx.variable_init().ID(0).getText().equals(functionEntry.getName())){
                retorna = true;

                if(ctx.variable_init().ID(1)!=null){
                    if(symbolVariableTable.containsKey(ctx.variable_init().ID(1).getText())){
                        EntryVariable entry = (EntryVariable) symbolVariableTable.get(ctx.variable_init().ID(1).getText());
                        String secondTypeId = entry.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(secondTypeId)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + secondTypeId + ".");
                        }
                    }else if(symbolConstTable.containsKey(ctx.variable_init().ID(1).getText())){
                        EntryVariable entry = (EntryVariable) symbolConstTable.get(ctx.variable_init().ID(1).getText());
                        String secondTypeId = entry.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(secondTypeId)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + secondTypeId + ".");
                        }
                    }
                    else{
                        listaErrores.add("Error: La variable o constante '" + ctx.variable_init().ID(1).getText() + "' no existe.");
                    }
                }

                if(ctx.variable_init().NUMBER()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("integer")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Integer.");
                    }
                }

                if(ctx.variable_init().TEXT()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("string")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un String.");
                    }
                }

                if(ctx.variable_init().CHAR()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("char")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Char.");
                    }
                }

                if(ctx.variable_init().BOOLEANVALUE()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("boolean")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Boolean.");
                    }
                }

                if(ctx.variable_init().simple_expression()!=null){
                    visit(ctx.variable_init().simple_expression());
                    if (!functionEntry.getType().equalsIgnoreCase("integer")) {
                        listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un Integer.");
                    }
                }

                if(ctx.variable_init().function_Call()!=null){
                    listaErrores.add("Error: Una funcion no puede retornar otra funcion.");
                }

                if(ctx.variable_init().array_access()!=null){
                    if(symbolArrayTable.containsKey(ctx.variable_init().array_access().ID().getText())){

                        visit(ctx.variable_init().array_access());
                        EntryArray entryArray = (EntryArray) symbolArrayTable.get(ctx.variable_init().array_access().ID().getText());
                        String arrayType = entryArray.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(arrayType)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + arrayType + ".");
                        }

                    }else{
                        listaErrores.add("Error: El arreglo '" + ctx.variable_init().array_access().ID().getText() + "' no existe.");
                    }
                }

                if(ctx.variable_init().arrayBi_access()!=null){
                    if(symbolArraybiTable.containsKey(ctx.variable_init().arrayBi_access().ID().getText())){

                        visit(ctx.variable_init().arrayBi_access());
                        EntryArrayBidi entryArray = (EntryArrayBidi) symbolArraybiTable.get(ctx.variable_init().arrayBi_access().ID().getText());
                        String arrayType = entryArray.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(arrayType)) {
                            listaErrores.add("Error: La funcion '" + functionEntry.getName() + "' de tipo " + functionEntry.getType() + " no puede retornar un " + arrayType + ".");
                        }

                    }else{
                        listaErrores.add("Error: El arreglo bidimensional '" + ctx.variable_init().arrayBi_access().ID().getText() + "' no existe.");
                    }
                }

            }else{
                visit(ctx.variable_init());
            }

        }else{
            if(ctx.variable_init()!=null){
                visit(ctx.variable_init());
            }
        }

        if(ctx.array_init()!=null){
            visit(ctx.array_init());
        }

        if(ctx.for_loop()!=null){
            visit(ctx.for_loop());
        }

        if(ctx.while_loop()!=null){
            visit(ctx.while_loop());
        }

        if(ctx.write()!=null){
            visit(ctx.write());
        }

        if(ctx.writeln_stmt()!=null){
            visit(ctx.writeln_stmt());
        }

        if(ctx.if_statement()!=null){
            visit(ctx.if_statement());

            if(ctx.if_statement().else_statement()!=null){
                for(int i = 0; i<ctx.if_statement().else_statement().size(); i++){
                    visit(ctx.if_statement().else_statement(i));
                }
            }
        }

        if(ctx.read_call()!=null){
            visit(ctx.read_call());
        }

        if(ctx.readln_call()!=null){
            visit(ctx.readln_call());
        }

        if(ctx.array_init()!=null){
            visit(ctx.array_init());
        }

        if(ctx.arrayBi_init()!=null){
            visit(ctx.arrayBi_init());
        }

        return null;
    }

    public void eliminarVariable_Constante_arreglo(int ambito) {
        
        if (!symbolVariableTable.isEmpty()) {
            List<String> variablesToRemove = new ArrayList<>();
            for (Map.Entry<String, Object> entry : symbolVariableTable.entrySet()) {
                EntryVariable variableEntry = (EntryVariable) entry.getValue();
                if (variableEntry.getAmbit() == ambito) {
                    variablesToRemove.add(entry.getKey());
                }
            }
            for (String variable : variablesToRemove) {
                symbolVariableTable.remove(variable);
            }
        }

        if (!symbolConstTable.isEmpty()) {
            List<String> constantesToRemove = new ArrayList<>();
            for (Map.Entry<String, Object> entry : symbolConstTable.entrySet()) {
                EntryConst constEntry = (EntryConst) entry.getValue();
                if (constEntry.getAmbit() == ambito) {
                    constantesToRemove.add(entry.getKey());
                }
            }
            for (String constante : constantesToRemove) {
                symbolConstTable.remove(constante);
            }
        }

        if (!symbolArrayTable.isEmpty()) {
            List<String> arrayToRemove = new ArrayList<>();
            for (Map.Entry<String, Object> entry : symbolArrayTable.entrySet()) {
                EntryArray entryArray = (EntryArray) entry.getValue();
                if (entryArray.getAmbit() == ambito) {
                    arrayToRemove.add(entry.getKey());
                }
            }
            for (String arreglo : arrayToRemove) {
                symbolArrayTable.remove(arreglo);
            }
        }

        if (!symbolArraybiTable.isEmpty()) {
            List<String> arrayToRemove = new ArrayList<>();
            for (Map.Entry<String, Object> entry : symbolArraybiTable.entrySet()) {
                EntryArrayBidi entryArray = (EntryArrayBidi) entry.getValue();
                if (entryArray.getAmbit() == ambito) {
                    arrayToRemove.add(entry.getKey());
                }
            }
            for (String arreglo : arrayToRemove) {
                symbolArraybiTable.remove(arreglo);
            }
        }
    }

    public List<String> getListaErrores() {
        return listaErrores;
    }
}