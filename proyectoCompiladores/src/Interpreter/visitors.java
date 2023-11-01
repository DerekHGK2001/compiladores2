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

    @Override
    public Object visitVariable_declaration(InterpreterParser.Variable_declarationContext ctx) {
        String type = ctx.TYPE().getText();
        for (TerminalNode idNode : ctx.ID()) {
            String name = idNode.getText();
            SymbolEntry entry = new SymbolEntry(name, type);
            symbolTable.put(name, entry);
        }
        return null;
    }

    @Override
    public Object visitArray_declaration(InterpreterParser.Array_declarationContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.TYPE().getText();
        NormalArrayEntry entry = new NormalArrayEntry(name, type, getSizeFromContext(ctx));
        symbolTable.put(name, entry);
        return null;
    }

    @Override
    public Object visitArraybi_declaration(InterpreterParser.Arraybi_declarationContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.TYPE().getText();
        int[] dimensions = getDimensionsFromContext(ctx);
        BidimensionalArrayEntry entry = new BidimensionalArrayEntry(name, type, dimensions);
        symbolTable.put(name, entry);
        return null;
    }

    private int getSizeFromContext(InterpreterParser.Array_declarationContext ctx) {
        int size = 1; // Tamaño predeterminado para arreglos unidimensionales

        if (ctx.OPEN_BRACKET() != null) {
            size = Integer.parseInt(ctx.NUMBER(1).getText()) ;
        }

        return size;
    }

    private int[] getDimensionsFromContext(InterpreterParser.Arraybi_declarationContext ctx) {
        int size1 = 1;
        int size2 = 1;

        if (ctx.OPEN_BRACKET() != null) {
            size1 = Integer.parseInt(ctx.NUMBER(1).getText()) - Integer.parseInt(ctx.NUMBER(0).getText()) + 1;
            size2 = Integer.parseInt(ctx.NUMBER(3).getText()) - Integer.parseInt(ctx.NUMBER(2).getText()) + 1;
        }

        return new int[]{size1, size2};
    }

    @Override
    public Object visitVariable_init(InterpreterParser.Variable_initContext ctx) {
        List<TerminalNode> idNodes = ctx.ID();

        for (TerminalNode idNode : idNodes) {
            String variableName = idNode.getText();
            usedVariables.add(variableName);

            // Verificar si el ID existe en la tabla de símbolos
            if (!symbolTable.containsKey(variableName)) {
                // Agregar un mensaje de error similar a CustomErrorListener
                String errorMessage = String.format("Variable '%s' no ha sido declarada.", variableName);
                System.err.println(errorMessage);
            }
        }

        return null;
    }

}