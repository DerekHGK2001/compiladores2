package Interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class visitors extends InterpreterBaseVisitor {
    private static Map<String, Object> symbolTable = new HashMap<>();
    public static Map<String, Object> getSymbolTable() {
        return symbolTable;
    }
    private List<String> usedVariables = new ArrayList<>();
    private int ambito = 0;

    @Override
    public Object visitVariable_declaration(InterpreterParser.Variable_declarationContext ctx) {
        String type = ctx.TYPE().getText();
        for (TerminalNode idNode : ctx.ID()) {
            String name = idNode.getText();

            // Verificar si la variable ya existe en la tabla de símbolos
            if (symbolTable.containsKey(name)) {
                System.err.println("Error: La variable '" + name + "' ya ha sido declarada anteriormente.");
            } else {
                // Si no existe, crear una nueva entrada en la tabla de símbolos
                EntryVariable entry = new EntryVariable(name, type, ambito);
                symbolTable.put(name, entry);
            }
        }
        return null;
    }

    @Override
    public Object visitVariable_init(InterpreterParser.Variable_initContext ctx) {


        return null;
    }

}