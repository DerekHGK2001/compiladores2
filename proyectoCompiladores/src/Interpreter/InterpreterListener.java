// Generated from C:/Users/dhenr/Documents/Clases/Compiladores/proyectoFase1/src\Interpreter.g4 by ANTLR 4.12.0
package Interpreter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterpreterParser}.
 */
public interface InterpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(InterpreterParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(InterpreterParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(InterpreterParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(InterpreterParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(InterpreterParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(InterpreterParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration(InterpreterParser.Array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration(InterpreterParser.Array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#arraybi_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArraybi_declaration(InterpreterParser.Arraybi_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#arraybi_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArraybi_declaration(InterpreterParser.Arraybi_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(InterpreterParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(InterpreterParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(InterpreterParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(InterpreterParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(InterpreterParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(InterpreterParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(InterpreterParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(InterpreterParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#variable_init}.
	 * @param ctx the parse tree
	 */
	void enterVariable_init(InterpreterParser.Variable_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#variable_init}.
	 * @param ctx the parse tree
	 */
	void exitVariable_init(InterpreterParser.Variable_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#array_init}.
	 * @param ctx the parse tree
	 */
	void enterArray_init(InterpreterParser.Array_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#array_init}.
	 * @param ctx the parse tree
	 */
	void exitArray_init(InterpreterParser.Array_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#arrayBi_init}.
	 * @param ctx the parse tree
	 */
	void enterArrayBi_init(InterpreterParser.ArrayBi_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#arrayBi_init}.
	 * @param ctx the parse tree
	 */
	void exitArrayBi_init(InterpreterParser.ArrayBi_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(InterpreterParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(InterpreterParser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#arrayBi_access}.
	 * @param ctx the parse tree
	 */
	void enterArrayBi_access(InterpreterParser.ArrayBi_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#arrayBi_access}.
	 * @param ctx the parse tree
	 */
	void exitArrayBi_access(InterpreterParser.ArrayBi_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(InterpreterParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(InterpreterParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#writeln_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteln_stmt(InterpreterParser.Writeln_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#writeln_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteln_stmt(InterpreterParser.Writeln_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(InterpreterParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(InterpreterParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(InterpreterParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(InterpreterParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(InterpreterParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(InterpreterParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(InterpreterParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(InterpreterParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(InterpreterParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(InterpreterParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(InterpreterParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(InterpreterParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(InterpreterParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(InterpreterParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(InterpreterParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(InterpreterParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#anidar}.
	 * @param ctx the parse tree
	 */
	void enterAnidar(InterpreterParser.AnidarContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#anidar}.
	 * @param ctx the parse tree
	 */
	void exitAnidar(InterpreterParser.AnidarContext ctx);
}