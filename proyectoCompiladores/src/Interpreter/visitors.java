package Interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class visitors extends InterpreterBaseVisitor {

    private static Map<String, Object> symbolVariableTable = new HashMap<>();
    private static Map<String, Object> symbolConstTable = new HashMap<>();
    private static Map<String, Object> symbolFunctionTable = new HashMap<>();
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

    @Override
    public Object visitVariable_declaration(InterpreterParser.Variable_declarationContext ctx) {
        String type = ctx.TYPE().getText();

        for (TerminalNode idNode : ctx.ID()) {
            String name = idNode.getText();

            if (exist(name)) {
                System.err.println("Error: La variable '" + name + "' ya ha sido declarada anteriormente.");
            } else {
                EntryVariable entry = new EntryVariable(name, type, getAmbito());
                getSymbolVariableTable().put(name, entry);
            }
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

        // Verificar si la función ya existe en la tabla de símbolos
        if (symbolFunctionTable.containsKey(functionName) || exist(functionName)) {
            System.err.println("Error: Ya existe una variable o funcion con el nombre '" + functionName + "'.");

            eliminarVariable_Constante(getAmbito());
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
            System.err.println("Error: Una funcion debe de retornar un valor. ");
        }

        eliminarVariable_Constante(getAmbito());
        restarAmbito();
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
                            System.err.println("Error: Una funcion de tipo " + functionEntry.getType() + " no puede retornar un " + secondTypeId + ".");
                        }
                    }else if(symbolConstTable.containsKey(ctx.variable_init().ID(1).getText())){
                        EntryVariable entry = (EntryVariable) symbolConstTable.get(ctx.variable_init().ID(1).getText());
                        String secondTypeId = entry.getType();

                        if (!functionEntry.getType().equalsIgnoreCase(secondTypeId)) {
                            System.err.println("Error: Una funcion de tipo " + functionEntry.getType() + " no puede retornar un " + secondTypeId + ".");
                        }
                    }
                    else{
                        System.err.println("Error: La variable o constante '" + ctx.variable_init().ID(1).getText() + "' no existe.");
                    }
                }

                if(ctx.variable_init().NUMBER()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("integer")) {
                        System.err.println("Error: Una funcion de tipo " + functionEntry.getType() + " no puede retornar un Integer.");
                    }
                }

                if(ctx.variable_init().TEXT()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("string")) {
                        System.err.println("Error: Una funcion de tipo " + functionEntry.getType() + " no puede retornar un String.");
                    }
                }

                if(ctx.variable_init().CHAR()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("char")) {
                        System.err.println("Error: Una funcion de tipo " + functionEntry.getType() + " no puede retornar un Char.");
                    }
                }

                if(ctx.variable_init().BOOLEANVALUE()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("boolean")) {
                        System.err.println("Error: Una funcion de tipo " + functionEntry.getType() + " no puede retornar un Boolean.");
                    }
                }

                if(ctx.variable_init().simple_expression()!=null){
                    if (!functionEntry.getType().equalsIgnoreCase("integer")) {
                        System.err.println("Error: Una funcion de tipo " + functionEntry.getType() + " no puede retornar un Integer.");
                    }
                }

                if(ctx.variable_init().function_Call()!=null){
                    System.err.println("Error: Una funcion no puede retornar otra funcion.");
                }

            }else{
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
        }

        if(ctx.read_call()!=null){
            visit(ctx.read_call());
        }

        if(ctx.readln_call()!=null){
            visit(ctx.readln_call());
        }

        return null;
    }

    @Override
    public Object visitFunction_Call(InterpreterParser.Function_CallContext ctx) {

        return null;
    }

    @Override
    public Object visitVariable_init(InterpreterParser.Variable_initContext ctx) {
        List<TerminalNode> idNodes = ctx.getTokens(InterpreterLexer.ID);

        String firstId = idNodes.get(0).getText();
        String firstTypeId = "";

        if(symbolConstTable.containsKey(firstId)){
            System.err.println("Error: Una constante no puede cambiar de valor.");
            return null;
        }

        if (!symbolVariableTable.containsKey(firstId)) {
            System.err.println("Error: La variable '" + firstId + "' no existe.");
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
                    System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un " + secondTypeId + ".");
                }

            } else if(symbolConstTable.containsKey(secondId)){
                EntryConst entry = (EntryConst) symbolConstTable.get(secondId);
                String secondTypeId = entry.getType();

                if (!firstTypeId.equalsIgnoreCase(secondTypeId) && !firstTypeId.equalsIgnoreCase("string")) {
                    System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un " + secondTypeId + ".");
                }

            } else {
                System.err.println("Error: La constante '" + secondId + "' no existe.");
            }
        }

        if (ctx.NUMBER() != null) {
            if (!firstTypeId.equalsIgnoreCase("integer") && !firstTypeId.equalsIgnoreCase("string")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un Integer.");
            }
        }else if (ctx.TEXT() != null) {
            if (!firstTypeId.equalsIgnoreCase("string")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un String.");
            }
        } else if (ctx.CHAR() != null) {
            if (!firstTypeId.equalsIgnoreCase("char")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un String.");
            }
        } else if (ctx.simple_expression() != null) {

            if (!firstTypeId.equalsIgnoreCase("integer")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un integer.");
            } else {
                visit(ctx.simple_expression());
            }
        } else if (ctx.BOOLEANVALUE() != null) {
            if (!firstTypeId.equalsIgnoreCase("boolean")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un boolean.");
            }
        }else if (ctx.function_Call() != null) {
            if (symbolFunctionTable.containsKey(ctx.function_Call().ID().getText())) {

                EntryFunction functionEntry = (EntryFunction) symbolFunctionTable.get(ctx.function_Call().ID().getText());
                String returnType = functionEntry.getType();

                if (!firstTypeId.equalsIgnoreCase(returnType)) {
                    System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un " + returnType + ".");
                }else{
                    visit(ctx.function_Call());
                }

            } else {
                System.err.println("Error: La función '" + ctx.function_Call().ID().getText() + "' no existe.");
            }
        }

        return null;
    }

    @Override
    public Object visitConst_variable_declaration(InterpreterParser.Const_variable_declarationContext ctx) {
        List<TerminalNode> idNodes = ctx.getTokens(InterpreterLexer.ID);
        String name = idNodes.get(0).getText();

        if (exist(name)) {
            System.err.println("Error: La variable o constante '" + name + "' ya ha sido declarada anteriormente.");
        } else {
            String type = "";

            if (ctx.TEXT() != null) {
                type = "string";
            }else if(ctx.CHAR()!=null){
                type = "char";
            }else{
                System.err.println("Error: Una constante solo puede ser un string o char.");
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
                    System.err.println("Error: La variable '" + idTerm + "' tiene que ser un Integer.");
                }
            } else if (symbolConstTable.containsKey(idTerm)) {
                System.err.println("Error: La constante '" + idTerm + "' no es valida.");
            } else {
                System.err.println("Error: La variable '" + idTerm + "' no existe.");
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
                System.err.println("Error: La variable '" + idTerm + "' no existe.");
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
                System.err.println("Error: La variable '" + idTerm + "' no existe.");
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
            System.err.println("Error: no se puede comparar un '" + tipoTerm1 + "' con un '" + tipoTerm2 + "'");
        }

        return null;
    }

    @Override
    public Object visitWriteln_stmt(InterpreterParser.Writeln_stmtContext ctx) {

        if(ctx.ID()!=null){
            for(int i =0; i<ctx.ID().size();i++){
                String idTerm = ctx.ID(i).getText();
                if(!exist(idTerm)){
                    System.err.println("Error: La variable o constante '" + idTerm + "' no existe.");
                }
            }
        }
        return null;
    }

    @Override
    public Object visitWrite(InterpreterParser.WriteContext ctx) {

        if(ctx.ID()!=null){
            for(int i =0; i<ctx.ID().size();i++){
                String idTerm = ctx.ID(i).getText();
                if(!exist(idTerm)){
                    System.err.println("Error: La variable o constante '" + idTerm + "' no existe.");
                }
            }
        }
        return null;
    }

    @Override
    public Object visitRead_call(InterpreterParser.Read_callContext ctx) {

        if(ctx.ID()!=null){
            String idTerm = ctx.ID().getText();
            if(!exist(idTerm)){
                System.err.println("Error: La variable o constante '" + idTerm + "' no existe.");
            }
        }
        return null;
    }

    @Override
    public Object visitReadln_call(InterpreterParser.Readln_callContext ctx) {

        if(ctx.ID()!=null){
            String idTerm = ctx.ID().getText();
            if(!exist(idTerm)){
                System.err.println("Error: La variable o constante '" + idTerm + "' no existe.");
            }
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
            for(int i =0; i<ctx.ID().size();i++){
                String idTerm = ctx.ID(i).getText();
                if(!exist(idTerm)){
                    System.err.println("Error: La variable o constante '" + idTerm + "' no existe.");
                }
            }
        }

        if(ctx.statement_bucle()!=null){
            for(int i =0; i<ctx.statement_bucle().size();i++){

                visit(ctx.statement_bucle(i));

            }
        }

        eliminarVariable_Constante(getAmbito());
        restarAmbito();

        return null;
    }

    @Override
    public Object visitWhile_loop(InterpreterParser.While_loopContext ctx) {
        sumarAmbito();

        if(ctx.comparison()!=null){
            visit(ctx.comparison());
        }

        if(ctx.expression()!=null){
            visit(ctx.expression());
        }

        if(ctx.statement_bucle()!=null){
            for(int i =0; i<ctx.statement_bucle().size();i++){
                visit(ctx.statement_bucle(i));
            }
        }

        eliminarVariable_Constante(getAmbito());
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
                }
            }

        }

        if(ctx.variable_init()!=null){
            visit(ctx.variable_init());
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
        }

        if(ctx.read_call()!=null){
            visit(ctx.read_call());
        }

        if(ctx.readln_call()!=null){
            visit(ctx.readln_call());
        }
        return null;
    }

    public void eliminarVariable_Constante(int ambito) {
        
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
    }


}