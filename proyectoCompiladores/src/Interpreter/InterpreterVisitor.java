// Generated from C:/Users/dhenr/Documents/GitHub/compiladores2/proyectoCompiladores/src\Interpreter.g4 by ANTLR 4.12.0
package Interpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterpreterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterpreterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(InterpreterParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#endprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndprogram(InterpreterParser.EndprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(InterpreterParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#read_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_call(InterpreterParser.Read_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#readln_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadln_call(InterpreterParser.Readln_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(InterpreterParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declaration(InterpreterParser.Array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#array_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_range(InterpreterParser.Array_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#arraybi_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraybi_declaration(InterpreterParser.Arraybi_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#var_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_variables(InterpreterParser.Var_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#const_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_variable_declaration(InterpreterParser.Const_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#const_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_variables(InterpreterParser.Const_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(InterpreterParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#variable_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_init(InterpreterParser.Variable_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#array_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_init(InterpreterParser.Array_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#arrayBi_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBi_init(InterpreterParser.ArrayBi_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#array_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(InterpreterParser.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(InterpreterParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#arrayBi_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBi_access(InterpreterParser.ArrayBi_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(InterpreterParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#forIndexValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIndexValue(InterpreterParser.ForIndexValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#forIndexLimit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIndexLimit(InterpreterParser.ForIndexLimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#writeln_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteln_stmt(InterpreterParser.Writeln_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#write_contain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_contain(InterpreterParser.Write_containContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(InterpreterParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(InterpreterParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(InterpreterParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(InterpreterParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#if_statement2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement2(InterpreterParser.If_statement2Context ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(InterpreterParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#statement_bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_bucle(InterpreterParser.Statement_bucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(InterpreterParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(InterpreterParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(InterpreterParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(InterpreterParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(InterpreterParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#operacones_parentesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacones_parentesis(InterpreterParser.Operacones_parentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#operaciones_simples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones_simples(InterpreterParser.Operaciones_simplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(InterpreterParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(InterpreterParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#statement_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_function(InterpreterParser.Statement_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#function_Call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_Call(InterpreterParser.Function_CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#parameters_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_declaration(InterpreterParser.Parameters_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#parameter_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_init(InterpreterParser.Parameter_initContext ctx);
}