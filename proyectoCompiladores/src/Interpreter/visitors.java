package Interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class visitors extends InterpreterBaseVisitor {
    private static Map<String, Object> symbolVariableTable = new HashMap<>();
    public static Map<String, Object> getSymbolVariableTable() {
        return symbolVariableTable;
    }
    private static Map<String, Object> symbolConstTable = new HashMap<>();
    public static Map<String, Object> getSymbolConstTable() {
        return symbolConstTable;
    }
    public int ambito = 0;

    @Override
    public Object visitVariable_declaration(InterpreterParser.Variable_declarationContext ctx) {
        String type = ctx.TYPE().getText();
        for (TerminalNode idNode : ctx.ID()) {
            String name = idNode.getText();

            // Verificar si la variable ya existe en la tabla de símbolos
            if (symbolVariableTable.containsKey(name)) {

                System.err.println("Error: La variable '" + name + "' ya ha sido declarada anteriormente.");

            } else {
                // Si no existe, crear una nueva entrada en la tabla de símbolos
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
        String secondTypeId = "";

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
            if (!symbolVariableTable.containsKey(secondId)) {
                System.err.println("Error: La variable '" + secondId + "' no existe.");
            } else {
                EntryVariable entry = (EntryVariable) symbolVariableTable.get(secondId);
                secondTypeId = entry.getType();

                if (!firstTypeId.equalsIgnoreCase(secondTypeId) && !firstTypeId.equalsIgnoreCase("string")) {
                    System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un " + secondTypeId + ".");
                }
            }
        }

        if (ctx.NUMBER() != null) {
            if (!firstTypeId.equalsIgnoreCase("integer") && !firstTypeId.equalsIgnoreCase("string")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un Integer.");
            }
        } else if (ctx.TEXT() != null) {
            if (!firstTypeId.equalsIgnoreCase("string")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un String.");
            }
        } else if (ctx.simple_expression() != null) {
            if (!firstTypeId.equalsIgnoreCase("integer")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un integer.");
            }
        } else if (ctx.BOOLEANVALUE() != null) {
            if (!firstTypeId.equalsIgnoreCase("boolean")) {
                System.err.println("Error: A una variable de tipo " + firstTypeId + " no se le puede asignar un boolean.");
            }
        } else if (ctx.array_access() != null) {
            // Aquí haces algo si el contexto es un array_access
        } else if (ctx.arrayBi_access() != null) {
            // Aquí haces algo si el contexto es un arrayBi_access
        }

        return null;
    }

    @Override
    public Object visitConst_variable_declaration(InterpreterParser.Const_variable_declarationContext ctx) {

        for (TerminalNode idNode : ctx.ID()) {
            String name = idNode.getText();

            // Verificar si la variable ya existe en la tabla de símbolos
            if (symbolVariableTable.containsKey(name) || symbolConstTable.containsKey(name)) {

                System.err.println("Error: La variable '" + name + "' ya ha sido declarada anteriormente.");

            } else {
                // Si no existe, crear una nueva entrada en la tabla de símbolos
                EntryConst entry = new EntryConst(name, ambito);
                getSymbolConstTable().put(name, entry);
            }
        }
        return null;
    }

}