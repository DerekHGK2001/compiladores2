// Generated from C:/Users/dhenr/Documents/GitHub/compiladores2/proyectoCompiladores/src\Interpreter.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by {@link InterpreterParser#endprogram}.
	 * @param ctx the parse tree
	 */
	void enterEndprogram(InterpreterParser.EndprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#endprogram}.
	 * @param ctx the parse tree
	 */
	void exitEndprogram(InterpreterParser.EndprogramContext ctx);
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
	 * Enter a parse tree produced by {@link InterpreterParser#read_call}.
	 * @param ctx the parse tree
	 */
	void enterRead_call(InterpreterParser.Read_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#read_call}.
	 * @param ctx the parse tree
	 */
	void exitRead_call(InterpreterParser.Read_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#readln_call}.
	 * @param ctx the parse tree
	 */
	void enterReadln_call(InterpreterParser.Readln_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#readln_call}.
	 * @param ctx the parse tree
	 */
	void exitReadln_call(InterpreterParser.Readln_callContext ctx);
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
	 * Enter a parse tree produced by {@link InterpreterParser#array_range}.
	 * @param ctx the parse tree
	 */
	void enterArray_range(InterpreterParser.Array_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#array_range}.
	 * @param ctx the parse tree
	 */
	void exitArray_range(InterpreterParser.Array_rangeContext ctx);
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
	 * Enter a parse tree produced by {@link InterpreterParser#var_variables}.
	 * @param ctx the parse tree
	 */
	void enterVar_variables(InterpreterParser.Var_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#var_variables}.
	 * @param ctx the parse tree
	 */
	void exitVar_variables(InterpreterParser.Var_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#const_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConst_variable_declaration(InterpreterParser.Const_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#const_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConst_variable_declaration(InterpreterParser.Const_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#const_variables}.
	 * @param ctx the parse tree
	 */
	void enterConst_variables(InterpreterParser.Const_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#const_variables}.
	 * @param ctx the parse tree
	 */
	void exitConst_variables(InterpreterParser.Const_variablesContext ctx);
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
	 * Enter a parse tree produced by {@link InterpreterParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(InterpreterParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(InterpreterParser.IndexContext ctx);
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
	 * Enter a parse tree produced by {@link InterpreterParser#write_contain}.
	 * @param ctx the parse tree
	 */
	void enterWrite_contain(InterpreterParser.Write_containContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#write_contain}.
	 * @param ctx the parse tree
	 */
	void exitWrite_contain(InterpreterParser.Write_containContext ctx);
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
	 * Enter a parse tree produced by {@link InterpreterParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(InterpreterParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(InterpreterParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#if_statement2}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement2(InterpreterParser.If_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#if_statement2}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement2(InterpreterParser.If_statement2Context ctx);
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
	 * Enter a parse tree produced by {@link InterpreterParser#statement_bucle}.
	 * @param ctx the parse tree
	 */
	void enterStatement_bucle(InterpreterParser.Statement_bucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#statement_bucle}.
	 * @param ctx the parse tree
	 */
	void exitStatement_bucle(InterpreterParser.Statement_bucleContext ctx);
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
	 * Enter a parse tree produced by {@link InterpreterParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(InterpreterParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(InterpreterParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(InterpreterParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(InterpreterParser.TermsContext ctx);
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
	 * Enter a parse tree produced by {@link InterpreterParser#operacones_parentesis}.
	 * @param ctx the parse tree
	 */
	void enterOperacones_parentesis(InterpreterParser.Operacones_parentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#operacones_parentesis}.
	 * @param ctx the parse tree
	 */
	void exitOperacones_parentesis(InterpreterParser.Operacones_parentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#operaciones_simples}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones_simples(InterpreterParser.Operaciones_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#operaciones_simples}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones_simples(InterpreterParser.Operaciones_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(InterpreterParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(InterpreterParser.OperacionesContext ctx);
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
	 * Enter a parse tree produced by {@link InterpreterParser#statement_function}.
	 * @param ctx the parse tree
	 */
	void enterStatement_function(InterpreterParser.Statement_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#statement_function}.
	 * @param ctx the parse tree
	 */
	void exitStatement_function(InterpreterParser.Statement_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#function_Call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_Call(InterpreterParser.Function_CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#function_Call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_Call(InterpreterParser.Function_CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#parameters_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameters_declaration(InterpreterParser.Parameters_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#parameters_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameters_declaration(InterpreterParser.Parameters_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#parameter_init}.
	 * @param ctx the parse tree
	 */
	void enterParameter_init(InterpreterParser.Parameter_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#parameter_init}.
	 * @param ctx the parse tree
	 */
	void exitParameter_init(InterpreterParser.Parameter_initContext ctx);
}