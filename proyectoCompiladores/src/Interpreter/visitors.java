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

                if(!firstTypeId.equalsIgnoreCase("real")){
                    if (!firstTypeId.equalsIgnoreCase(secondTypeId) && !firstTypeId.equalsIgnoreCase("string")) {
                        System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un " + secondTypeId + ".");
                    }
                }else{
                    if (!firstTypeId.equalsIgnoreCase("integer") && !firstTypeId.equalsIgnoreCase("real")) {
                        System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un " + secondTypeId + ".");
                    }
                }

            } else {
                System.err.println("Error: La constante '" + secondId + "' no existe.");
            }
        }

        if (ctx.NUMBER() != null) {
            if (!firstTypeId.equalsIgnoreCase("integer") && !firstTypeId.equalsIgnoreCase("string") && !firstTypeId.equalsIgnoreCase("real")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un Integer.");
            }
        } else if (ctx.FLOAT() != null) {
            if (!firstTypeId.equalsIgnoreCase("real") && !firstTypeId.equalsIgnoreCase("string")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un real.");
            }
        } else if (ctx.TEXT() != null) {
            if (!firstTypeId.equalsIgnoreCase("string")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un String.");
            }
        } else if (ctx.simple_expression() != null) {
            boolean isFloat = false;

            for (int i = 0; i < ctx.simple_expression().factor().size(); i++) {
                if (ctx.simple_expression().factor(i).FLOAT() != null) {
                    isFloat = true;
                }
            }

            if (isFloat) {
                if (!firstTypeId.equalsIgnoreCase("real")) {
                    System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un real.");
                } else {
                    visit(ctx.simple_expression());
                }
            } else {
                if (!firstTypeId.equalsIgnoreCase("integer") && !firstTypeId.equalsIgnoreCase("real")) {
                    System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un integer.");
                } else {
                    visit(ctx.simple_expression());
                }
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

        if (symbolVariableTable.containsKey(name) || symbolConstTable.containsKey(name)) {
            System.err.println("Error: La variable '" + name + "' ya ha sido declarada anteriormente.");
        } else {
            String type = "";

            if (ctx.ID().size() > 1) {
                String name2 = idNodes.get(1).getText();

                if (symbolVariableTable.containsKey(name2)) {
                    EntryVariable entry = (EntryVariable) symbolVariableTable.get(name2);
                    type = entry.getType();
                } else if (symbolConstTable.containsKey(name2)) {
                    EntryConst entry = (EntryConst) symbolConstTable.get(name2);
                    type = entry.getType();
                } else {
                    System.err.println("Error: La variable '" + name2 + "' no existe.");
                }
            }

            if (ctx.TEXT() != null) {
                type = "string";
            }

            if (ctx.NUMBER() != null) {
                type = "integer";
            }

            if (ctx.simple_expression() != null) {
                type = "real";
            }

            if (ctx.FLOAT() != null) {
                type = "real";
            }

            if (ctx.BOOLEANVALUE() != null) {
                type = "boolean";
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

                if (!entry.getType().equalsIgnoreCase("integer") && !entry.getType().equalsIgnoreCase("real")) {
                    System.err.println("Error: La variable '" + idTerm + "' tiene que ser un Integer o un real.");
                }
            } else if (symbolConstTable.containsKey(idTerm)) {
                EntryConst entry = (EntryConst) symbolConstTable.get(idTerm);

                if (!entry.getType().equalsIgnoreCase("integer") && !entry.getType().equalsIgnoreCase("real")) {
                    System.err.println("Error: La constante '" + idTerm + "' tiene que ser un Integer o un real.");
                }
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

        }else if(ctx.terms(0).FLOAT()!=null){
            tipoTerm1="real";

        }else if(ctx.terms(0).BOOLEANVALUE()!=null){
            tipoTerm1="boolean";

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

        }else if(ctx.terms(1).FLOAT()!=null){
            tipoTerm2="real";

        }else if(ctx.terms(1).BOOLEANVALUE()!=null){
            tipoTerm2="boolean";

        }

        if(tipoTerm1!=tipoTerm2){
            System.err.println("Error: no se puede comparar un '" + tipoTerm1 + "' con un '" + tipoTerm2 + "'");
        }

        return null;
    }
}
