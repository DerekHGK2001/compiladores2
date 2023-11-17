package Interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class visitors extends InterpreterBaseVisitor {

    private static Map<String, Object> symbolVariableTable = new HashMap<>();
    private static Map<String, Object> symbolConstTable = new HashMap<>();
    public int ambito = 0;

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

            if (symbolVariableTable.containsKey(name)) {
                System.err.println("Error: La variable '" + name + "' ya ha sido declarada anteriormente.");
            } else {
                EntryVariable entry = new EntryVariable(name, type, ambito);
                symbolVariableTable.put(name, entry);
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
        }

        return null;
    }

    @Override
    public Object visitConst_variable_declaration(InterpreterParser.Const_variable_declarationContext ctx) {
        List<TerminalNode> idNodes = ctx.getTokens(InterpreterLexer.ID);
        String name = idNodes.get(0).getText();

        if (exist(name)) {
            System.err.println("Error: La variable '" + name + "' ya ha sido declarada anteriormente.");
        } else {
            String type = "";

            if (ctx.TEXT() != null) {
                type = "string";
            }else if(ctx.CHAR()!=null){
                type = "char";
            }else{
                System.err.println("Error: Una constante solo puede ser un string o char.");
            }

            EntryConst entry = new EntryConst(name, type, ambito);
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
                    System.err.println("Error: La variable '" + idTerm + "' no existe.");
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
                    System.err.println("Error: La variable '" + idTerm + "' no existe.");
                }
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

}
