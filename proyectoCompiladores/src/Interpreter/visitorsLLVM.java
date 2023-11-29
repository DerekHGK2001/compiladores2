package Interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class visitorsLLVM extends InterpreterBaseVisitor {
    private static String llvmHeader;
    private static String llvmBody;

    @Override
    public Object visitProgram(InterpreterParser.ProgramContext ctx) {

        

        return null;
    }

    @Override
    public Object visitVariable_declaration(InterpreterParser.Variable_declarationContext ctx) {
        String type = ctx.TYPE().getText();

        for (TerminalNode idNode : ctx.ID()) {
            String name = idNode.getText();

        }

        return null;
    }

    @Override
    public Object visitEndprogram(InterpreterParser.EndprogramContext ctx) {

        return null;
    }
}