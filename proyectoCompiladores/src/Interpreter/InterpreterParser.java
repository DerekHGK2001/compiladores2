// Generated from C:/Users/dhenr/Documents/GitHub/compiladores2/proyectoCompiladores/src\Interpreter.g4 by ANTLR 4.12.0
package Interpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InterpreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, TO=2, OF=3, DOWNTO=4, PROGRAM=5, PROCEDURE=6, BEGIN=7, END=8, 
		ENDPROGRAM=9, VAR=10, CONST=11, PRINTLN=12, COMMA=13, FOR=14, WHILE=15, 
		COMMENT=16, DO=17, ARRAY=18, WRITELN=19, WRITE=20, PLUS=21, MINUS=22, 
		MULT=23, DIV=24, ELSE=25, IF=26, THEN=27, AND=28, OR=29, NOT=30, FUNCTION=31, 
		GREATER_THAN=32, LESS_THAN=33, GREATER_THAN_OR_EQUALS=34, LESS_THAN_OR_EQUALS=35, 
		EQUALS=36, NOT_EQUALS=37, TYPE=38, ASSIGN=39, COLON=40, DOTDOT=41, POINT=42, 
		OPEN_PARENTHESIS=43, CLOSE_PARENTHESIS=44, OPEN_BRACKET=45, CLOSE_BRACKET=46, 
		SEMICOLON=47, BOOLEANVALUE=48, ID=49, NUMBER=50, FLOAT=51, TEXT=52, CHAR=53, 
		WS=54, STRING=55;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_read_call = 2, RULE_variable_declaration = 3, 
		RULE_array_declaration = 4, RULE_arraybi_declaration = 5, RULE_var_variables = 6, 
		RULE_const_variable_declaration = 7, RULE_const_array_declaration = 8, 
		RULE_const_arraybi_declaration = 9, RULE_const_variables = 10, RULE_statements = 11, 
		RULE_variable_init = 12, RULE_array_init = 13, RULE_arrayBi_init = 14, 
		RULE_array_access = 15, RULE_arrayBi_access = 16, RULE_for_loop = 17, 
		RULE_writeln_stmt = 18, RULE_write = 19, RULE_while_loop = 20, RULE_if_statement = 21, 
		RULE_statement = 22, RULE_expression = 23, RULE_comparison = 24, RULE_terms = 25, 
		RULE_simple_expression = 26, RULE_factor = 27, RULE_operacones_parentesis = 28, 
		RULE_operaciones_simples = 29, RULE_operaciones = 30, RULE_procedure_declaration = 31, 
		RULE_procedure_body = 32, RULE_procedure_call = 33, RULE_function_declaration = 34, 
		RULE_function_Call = 35, RULE_parameters = 36, RULE_parameter_dec = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "read_call", "variable_declaration", "array_declaration", 
			"arraybi_declaration", "var_variables", "const_variable_declaration", 
			"const_array_declaration", "const_arraybi_declaration", "const_variables", 
			"statements", "variable_init", "array_init", "arrayBi_init", "array_access", 
			"arrayBi_access", "for_loop", "writeln_stmt", "write", "while_loop", 
			"if_statement", "statement", "expression", "comparison", "terms", "simple_expression", 
			"factor", "operacones_parentesis", "operaciones_simples", "operaciones", 
			"procedure_declaration", "procedure_body", "procedure_call", "function_declaration", 
			"function_Call", "parameters", "parameter_dec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'read'", "'to'", "'of'", "'downto'", "'program'", "'procedure'", 
			"'begin'", "'end;'", "'end.'", "'var'", "'const'", "'println'", "','", 
			"'for'", "'while'", null, "'do'", "'array'", "'writeln'", "'write'", 
			"'+'", "'-'", null, "'/'", "'else'", "'if'", "'then'", "'and'", "'or'", 
			"'not'", "'function'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", null, 
			"':='", "':'", "'..'", "'.'", "'('", "')'", "'['", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "READ", "TO", "OF", "DOWNTO", "PROGRAM", "PROCEDURE", "BEGIN", 
			"END", "ENDPROGRAM", "VAR", "CONST", "PRINTLN", "COMMA", "FOR", "WHILE", 
			"COMMENT", "DO", "ARRAY", "WRITELN", "WRITE", "PLUS", "MINUS", "MULT", 
			"DIV", "ELSE", "IF", "THEN", "AND", "OR", "NOT", "FUNCTION", "GREATER_THAN", 
			"LESS_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN_OR_EQUALS", "EQUALS", 
			"NOT_EQUALS", "TYPE", "ASSIGN", "COLON", "DOTDOT", "POINT", "OPEN_PARENTHESIS", 
			"CLOSE_PARENTHESIS", "OPEN_BRACKET", "CLOSE_BRACKET", "SEMICOLON", "BOOLEANVALUE", 
			"ID", "NUMBER", "FLOAT", "TEXT", "CHAR", "WS", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InterpreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(InterpreterParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDPROGRAM() { return getToken(InterpreterParser.ENDPROGRAM, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PROGRAM);
			setState(77);
			match(ID);
			setState(78);
			match(SEMICOLON);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147486784L) != 0)) {
				{
				{
				setState(79);
				declarations();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(BEGIN);
			setState(86);
			statements();
			setState(87);
			match(ENDPROGRAM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(InterpreterParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(InterpreterParser.VAR, i);
		}
		public List<TerminalNode> CONST() { return getTokens(InterpreterParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(InterpreterParser.CONST, i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<Procedure_declarationContext> procedure_declaration() {
			return getRuleContexts(Procedure_declarationContext.class);
		}
		public Procedure_declarationContext procedure_declaration(int i) {
			return getRuleContext(Procedure_declarationContext.class,i);
		}
		public List<Var_variablesContext> var_variables() {
			return getRuleContexts(Var_variablesContext.class);
		}
		public Var_variablesContext var_variables(int i) {
			return getRuleContext(Var_variablesContext.class,i);
		}
		public List<Const_variablesContext> const_variables() {
			return getRuleContexts(Const_variablesContext.class);
		}
		public Const_variablesContext const_variables(int i) {
			return getRuleContext(Const_variablesContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(103);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
						{
						setState(89);
						match(VAR);
						setState(91); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(90);
								var_variables();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(93); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case CONST:
						{
						setState(95);
						match(CONST);
						setState(97); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(96);
								const_variables();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(99); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case FUNCTION:
						{
						setState(101);
						function_declaration();
						}
						break;
					case PROCEDURE:
						{
						setState(102);
						procedure_declaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Read_callContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(InterpreterParser.READ, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public Read_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterRead_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitRead_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitRead_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_callContext read_call() throws RecognitionException {
		Read_callContext _localctx = new Read_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_read_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(READ);
			setState(108);
			match(OPEN_PARENTHESIS);
			setState(109);
			match(ID);
			setState(110);
			match(CLOSE_PARENTHESIS);
			setState(111);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ID);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(115);
				match(ID);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(COLON);
			setState(122);
			match(TYPE);
			setState(123);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode ARRAY() { return getToken(InterpreterParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(InterpreterParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(InterpreterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(InterpreterParser.NUMBER, i);
		}
		public TerminalNode DOTDOT() { return getToken(InterpreterParser.DOTDOT, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> MINUS() { return getTokens(InterpreterParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(InterpreterParser.MINUS, i);
		}
		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArray_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArray_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArray_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			match(COLON);
			setState(127);
			match(ARRAY);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(128);
				match(OPEN_BRACKET);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(129);
					match(MINUS);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(NUMBER);
				setState(136);
				match(DOTDOT);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(137);
					match(MINUS);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(NUMBER);
				setState(144);
				match(CLOSE_BRACKET);
				}
			}

			setState(147);
			match(OF);
			setState(148);
			match(TYPE);
			setState(149);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arraybi_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode ARRAY() { return getToken(InterpreterParser.ARRAY, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(InterpreterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(InterpreterParser.NUMBER, i);
		}
		public List<TerminalNode> DOTDOT() { return getTokens(InterpreterParser.DOTDOT); }
		public TerminalNode DOTDOT(int i) {
			return getToken(InterpreterParser.DOTDOT, i);
		}
		public TerminalNode COMMA() { return getToken(InterpreterParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public TerminalNode OF() { return getToken(InterpreterParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public List<TerminalNode> MINUS() { return getTokens(InterpreterParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(InterpreterParser.MINUS, i);
		}
		public Arraybi_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybi_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArraybi_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArraybi_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArraybi_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybi_declarationContext arraybi_declaration() throws RecognitionException {
		Arraybi_declarationContext _localctx = new Arraybi_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arraybi_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ID);
			setState(152);
			match(COLON);
			setState(153);
			match(ARRAY);
			setState(154);
			match(OPEN_BRACKET);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(155);
				match(MINUS);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(NUMBER);
			setState(162);
			match(DOTDOT);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(163);
				match(MINUS);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(NUMBER);
			setState(170);
			match(COMMA);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(171);
				match(MINUS);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(NUMBER);
			setState(178);
			match(DOTDOT);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(179);
				match(MINUS);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(NUMBER);
			setState(186);
			match(CLOSE_BRACKET);
			setState(187);
			match(OF);
			setState(188);
			match(TYPE);
			setState(189);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_variablesContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Arraybi_declarationContext arraybi_declaration() {
			return getRuleContext(Arraybi_declarationContext.class,0);
		}
		public Var_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterVar_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitVar_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitVar_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_variablesContext var_variables() throws RecognitionException {
		Var_variablesContext _localctx = new Var_variablesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_variables);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				array_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				arraybi_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_variable_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(InterpreterParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public Const_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterConst_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitConst_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitConst_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_variable_declarationContext const_variable_declaration() throws RecognitionException {
		Const_variable_declarationContext _localctx = new Const_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_const_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(197);
			match(EQUALS);
			setState(198);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(199);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_array_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode ARRAY() { return getToken(InterpreterParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(InterpreterParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(InterpreterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(InterpreterParser.NUMBER, i);
		}
		public TerminalNode DOTDOT() { return getToken(InterpreterParser.DOTDOT, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> MINUS() { return getTokens(InterpreterParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(InterpreterParser.MINUS, i);
		}
		public Const_array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterConst_array_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitConst_array_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitConst_array_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_array_declarationContext const_array_declaration() throws RecognitionException {
		Const_array_declarationContext _localctx = new Const_array_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_const_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(202);
			match(COLON);
			setState(203);
			match(ARRAY);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(204);
				match(OPEN_BRACKET);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(205);
					match(MINUS);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(NUMBER);
				setState(212);
				match(DOTDOT);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(213);
					match(MINUS);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(NUMBER);
				setState(220);
				match(CLOSE_BRACKET);
				}
			}

			setState(223);
			match(OF);
			setState(224);
			match(TYPE);
			setState(225);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_arraybi_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode ARRAY() { return getToken(InterpreterParser.ARRAY, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(InterpreterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(InterpreterParser.NUMBER, i);
		}
		public List<TerminalNode> DOTDOT() { return getTokens(InterpreterParser.DOTDOT); }
		public TerminalNode DOTDOT(int i) {
			return getToken(InterpreterParser.DOTDOT, i);
		}
		public TerminalNode COMMA() { return getToken(InterpreterParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public TerminalNode OF() { return getToken(InterpreterParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public List<TerminalNode> MINUS() { return getTokens(InterpreterParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(InterpreterParser.MINUS, i);
		}
		public Const_arraybi_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_arraybi_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterConst_arraybi_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitConst_arraybi_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitConst_arraybi_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_arraybi_declarationContext const_arraybi_declaration() throws RecognitionException {
		Const_arraybi_declarationContext _localctx = new Const_arraybi_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_const_arraybi_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			setState(228);
			match(COLON);
			setState(229);
			match(ARRAY);
			setState(230);
			match(OPEN_BRACKET);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(231);
				match(MINUS);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(NUMBER);
			setState(238);
			match(DOTDOT);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(239);
				match(MINUS);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(NUMBER);
			setState(246);
			match(COMMA);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(247);
				match(MINUS);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(NUMBER);
			setState(254);
			match(DOTDOT);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(255);
				match(MINUS);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(NUMBER);
			setState(262);
			match(CLOSE_BRACKET);
			setState(263);
			match(OF);
			setState(264);
			match(TYPE);
			setState(265);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_variablesContext extends ParserRuleContext {
		public Const_variable_declarationContext const_variable_declaration() {
			return getRuleContext(Const_variable_declarationContext.class,0);
		}
		public Const_array_declarationContext const_array_declaration() {
			return getRuleContext(Const_array_declarationContext.class,0);
		}
		public Const_arraybi_declarationContext const_arraybi_declaration() {
			return getRuleContext(Const_arraybi_declarationContext.class,0);
		}
		public Const_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterConst_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitConst_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitConst_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_variablesContext const_variables() throws RecognitionException {
		Const_variablesContext _localctx = new Const_variablesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_const_variables);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				const_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				const_array_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				const_arraybi_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562950022152322L) != 0)) {
				{
				{
				setState(272);
				statement();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_initContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(InterpreterParser.FLOAT, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public TerminalNode BOOLEANVALUE() { return getToken(InterpreterParser.BOOLEANVALUE, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Function_CallContext function_Call() {
			return getRuleContext(Function_CallContext.class,0);
		}
		public Variable_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterVariable_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitVariable_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitVariable_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_initContext variable_init() throws RecognitionException {
		Variable_initContext _localctx = new Variable_initContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ID);
			setState(279);
			match(ASSIGN);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(280);
				match(ID);
				}
				break;
			case 2:
				{
				setState(281);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(282);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(283);
				match(TEXT);
				}
				break;
			case 5:
				{
				setState(284);
				match(CHAR);
				}
				break;
			case 6:
				{
				setState(285);
				match(BOOLEANVALUE);
				}
				break;
			case 7:
				{
				setState(286);
				simple_expression();
				}
				break;
			case 8:
				{
				setState(287);
				array_access();
				}
				break;
			case 9:
				{
				setState(288);
				arrayBi_access();
				}
				break;
			case 10:
				{
				setState(289);
				function_Call();
				}
				break;
			}
			setState(292);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_initContext extends ParserRuleContext {
		public List<Array_accessContext> array_access() {
			return getRuleContexts(Array_accessContext.class);
		}
		public Array_accessContext array_access(int i) {
			return getRuleContext(Array_accessContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(InterpreterParser.FLOAT, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Function_CallContext function_Call() {
			return getRuleContext(Function_CallContext.class,0);
		}
		public Array_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArray_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArray_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArray_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initContext array_init() throws RecognitionException {
		Array_initContext _localctx = new Array_initContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			array_access();
			setState(295);
			match(ASSIGN);
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(296);
				match(ID);
				}
				break;
			case 2:
				{
				setState(297);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(298);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(299);
				match(TEXT);
				}
				break;
			case 5:
				{
				setState(300);
				match(CHAR);
				}
				break;
			case 6:
				{
				setState(301);
				simple_expression();
				}
				break;
			case 7:
				{
				setState(302);
				array_access();
				}
				break;
			case 8:
				{
				setState(303);
				arrayBi_access();
				}
				break;
			case 9:
				{
				setState(304);
				function_Call();
				}
				break;
			}
			setState(307);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayBi_initContext extends ParserRuleContext {
		public List<ArrayBi_accessContext> arrayBi_access() {
			return getRuleContexts(ArrayBi_accessContext.class);
		}
		public ArrayBi_accessContext arrayBi_access(int i) {
			return getRuleContext(ArrayBi_accessContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(InterpreterParser.FLOAT, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Function_CallContext function_Call() {
			return getRuleContext(Function_CallContext.class,0);
		}
		public ArrayBi_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayBi_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArrayBi_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArrayBi_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArrayBi_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayBi_initContext arrayBi_init() throws RecognitionException {
		ArrayBi_initContext _localctx = new ArrayBi_initContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayBi_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			arrayBi_access();
			setState(310);
			match(ASSIGN);
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(311);
				match(ID);
				}
				break;
			case 2:
				{
				setState(312);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(313);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(314);
				match(TEXT);
				}
				break;
			case 5:
				{
				setState(315);
				match(CHAR);
				}
				break;
			case 6:
				{
				setState(316);
				simple_expression();
				}
				break;
			case 7:
				{
				setState(317);
				array_access();
				}
				break;
			case 8:
				{
				setState(318);
				arrayBi_access();
				}
				break;
			case 9:
				{
				setState(319);
				function_Call();
				}
				break;
			}
			setState(322);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_accessContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public Array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArray_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArray_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArray_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ID);
			setState(325);
			match(OPEN_BRACKET);
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(326);
				simple_expression();
				}
				break;
			case 2:
				{
				setState(327);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(328);
				match(ID);
				}
				break;
			}
			setState(331);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayBi_accessContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(InterpreterParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(InterpreterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(InterpreterParser.NUMBER, i);
		}
		public ArrayBi_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayBi_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArrayBi_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArrayBi_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArrayBi_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayBi_accessContext arrayBi_access() throws RecognitionException {
		ArrayBi_accessContext _localctx = new ArrayBi_accessContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayBi_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ID);
			setState(334);
			match(OPEN_BRACKET);
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(335);
				simple_expression();
				}
				break;
			case 2:
				{
				setState(336);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(337);
				match(ID);
				}
				break;
			}
			setState(340);
			match(COMMA);
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(341);
				simple_expression();
				}
				break;
			case 2:
				{
				setState(342);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(343);
				match(ID);
				}
				break;
			}
			setState(346);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(InterpreterParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public TerminalNode DO() { return getToken(InterpreterParser.DO, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(InterpreterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(InterpreterParser.NUMBER, i);
		}
		public TerminalNode TO() { return getToken(InterpreterParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(InterpreterParser.DOWNTO, 0); }
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(FOR);
			setState(349);
			match(ID);
			setState(350);
			match(ASSIGN);
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(354);
			match(DO);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(355);
				match(BEGIN);
				setState(356);
				statements();
				setState(357);
				match(END);
				}
				break;
			case 2:
				{
				setState(359);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Writeln_stmtContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(InterpreterParser.WRITELN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(InterpreterParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterpreterParser.TEXT, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(InterpreterParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(InterpreterParser.CHAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public List<Array_accessContext> array_access() {
			return getRuleContexts(Array_accessContext.class);
		}
		public Array_accessContext array_access(int i) {
			return getRuleContext(Array_accessContext.class,i);
		}
		public List<ArrayBi_accessContext> arrayBi_access() {
			return getRuleContexts(ArrayBi_accessContext.class);
		}
		public ArrayBi_accessContext arrayBi_access(int i) {
			return getRuleContext(ArrayBi_accessContext.class,i);
		}
		public Writeln_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterWriteln_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitWriteln_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWriteln_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Writeln_stmtContext writeln_stmt() throws RecognitionException {
		Writeln_stmtContext _localctx = new Writeln_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_writeln_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(WRITELN);
			setState(363);
			match(OPEN_PARENTHESIS);
			setState(364);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14073748835532800L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365);
				match(COMMA);
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(366);
					match(ID);
					}
					break;
				case 2:
					{
					setState(367);
					match(TEXT);
					}
					break;
				case 3:
					{
					setState(368);
					match(CHAR);
					}
					break;
				case 4:
					{
					setState(369);
					array_access();
					}
					break;
				case 5:
					{
					setState(370);
					arrayBi_access();
					}
					break;
				}
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(CLOSE_PARENTHESIS);
			setState(379);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(InterpreterParser.WRITE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(InterpreterParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterpreterParser.TEXT, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(InterpreterParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(InterpreterParser.CHAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public List<Array_accessContext> array_access() {
			return getRuleContexts(Array_accessContext.class);
		}
		public Array_accessContext array_access(int i) {
			return getRuleContext(Array_accessContext.class,i);
		}
		public List<ArrayBi_accessContext> arrayBi_access() {
			return getRuleContexts(ArrayBi_accessContext.class);
		}
		public ArrayBi_accessContext arrayBi_access(int i) {
			return getRuleContext(ArrayBi_accessContext.class,i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(WRITE);
			setState(382);
			match(OPEN_PARENTHESIS);
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14073748835532800L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(384);
				match(COMMA);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(385);
					match(ID);
					}
					break;
				case 2:
					{
					setState(386);
					match(TEXT);
					}
					break;
				case 3:
					{
					setState(387);
					match(CHAR);
					}
					break;
				case 4:
					{
					setState(388);
					array_access();
					}
					break;
				case 5:
					{
					setState(389);
					arrayBi_access();
					}
					break;
				}
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			match(CLOSE_PARENTHESIS);
			setState(398);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(InterpreterParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(InterpreterParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(WHILE);
			setState(401);
			expression();
			setState(402);
			match(DO);
			setState(403);
			match(BEGIN);
			setState(404);
			statements();
			setState(405);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(InterpreterParser.IF, 0); }
		public TerminalNode THEN() { return getToken(InterpreterParser.THEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(InterpreterParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(InterpreterParser.BEGIN, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(InterpreterParser.END); }
		public TerminalNode END(int i) {
			return getToken(InterpreterParser.END, i);
		}
		public TerminalNode ELSE() { return getToken(InterpreterParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(IF);
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(408);
				expression();
				}
				break;
			case 2:
				{
				setState(409);
				comparison();
				}
				break;
			}
			setState(412);
			match(THEN);
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(413);
				statement();
				}
				break;
			case 2:
				{
				setState(414);
				match(BEGIN);
				setState(415);
				statements();
				setState(416);
				match(END);
				}
				break;
			}
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(420);
				match(ELSE);
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(421);
					statement();
					}
					break;
				case 2:
					{
					setState(422);
					match(BEGIN);
					setState(423);
					statements();
					setState(424);
					match(END);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Variable_initContext variable_init() {
			return getRuleContext(Variable_initContext.class,0);
		}
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public ArrayBi_initContext arrayBi_init() {
			return getRuleContext(ArrayBi_initContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Writeln_stmtContext writeln_stmt() {
			return getRuleContext(Writeln_stmtContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public Read_callContext read_call() {
			return getRuleContext(Read_callContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(436);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(437);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(438);
				procedure_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(439);
				read_call();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(440);
				match(BEGIN);
				setState(441);
				statements();
				setState(442);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			simple_expression();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) {
				{
				setState(447);
				operaciones();
				setState(448);
				simple_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public List<TermsContext> terms() {
			return getRuleContexts(TermsContext.class);
		}
		public TermsContext terms(int i) {
			return getRuleContext(TermsContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(InterpreterParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(InterpreterParser.NOT_EQUALS, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			terms();
			setState(453);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(454);
			terms();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(InterpreterParser.FLOAT, 0); }
		public TerminalNode BOOLEANVALUE() { return getToken(InterpreterParser.BOOLEANVALUE, 0); }
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732923532771328L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_expressionContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Operaciones_simplesContext> operaciones_simples() {
			return getRuleContexts(Operaciones_simplesContext.class);
		}
		public Operaciones_simplesContext operaciones_simples(int i) {
			return getRuleContext(Operaciones_simplesContext.class,i);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_simple_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			factor();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) {
				{
				{
				setState(459);
				operaciones_simples();
				setState(460);
				factor();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(InterpreterParser.FLOAT, 0); }
		public Operacones_parentesisContext operacones_parentesis() {
			return getRuleContext(Operacones_parentesisContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(NUMBER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(FLOAT);
				}
				break;
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				operacones_parentesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operacones_parentesisContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public Operacones_parentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacones_parentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterOperacones_parentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitOperacones_parentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitOperacones_parentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacones_parentesisContext operacones_parentesis() throws RecognitionException {
		Operacones_parentesisContext _localctx = new Operacones_parentesisContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operacones_parentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(OPEN_PARENTHESIS);
			setState(474);
			simple_expression();
			setState(475);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operaciones_simplesContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(InterpreterParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(InterpreterParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(InterpreterParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(InterpreterParser.DIV, 0); }
		public Operaciones_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterOperaciones_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitOperaciones_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitOperaciones_simples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operaciones_simplesContext operaciones_simples() throws RecognitionException {
		Operaciones_simplesContext _localctx = new Operaciones_simplesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operaciones_simples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperacionesContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(InterpreterParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUALS() { return getToken(InterpreterParser.LESS_THAN_OR_EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(InterpreterParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUALS() { return getToken(InterpreterParser.GREATER_THAN_OR_EQUALS, 0); }
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_declarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(InterpreterParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public Procedure_bodyContext procedure_body() {
			return getRuleContext(Procedure_bodyContext.class,0);
		}
		public Procedure_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterProcedure_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitProcedure_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitProcedure_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_declarationContext procedure_declaration() throws RecognitionException {
		Procedure_declarationContext _localctx = new Procedure_declarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_procedure_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(PROCEDURE);
			setState(482);
			match(ID);
			setState(483);
			match(OPEN_PARENTHESIS);
			setState(484);
			parameters();
			setState(485);
			match(COLON);
			setState(486);
			match(TYPE);
			setState(487);
			match(CLOSE_PARENTHESIS);
			setState(488);
			match(SEMICOLON);
			setState(489);
			procedure_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_bodyContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public Procedure_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterProcedure_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitProcedure_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitProcedure_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_bodyContext procedure_body() throws RecognitionException {
		Procedure_bodyContext _localctx = new Procedure_bodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_procedure_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(BEGIN);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147486784L) != 0)) {
				{
				{
				setState(492);
				declarations();
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			statements();
			setState(499);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Procedure_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public Parameter_decContext parameter_dec() {
			return getRuleContext(Parameter_decContext.class,0);
		}
		public Procedure_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterProcedure_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitProcedure_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitProcedure_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_callContext procedure_call() throws RecognitionException {
		Procedure_callContext _localctx = new Procedure_callContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_procedure_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(ID);
			setState(502);
			match(OPEN_PARENTHESIS);
			{
			setState(503);
			parameter_dec();
			}
			setState(504);
			match(CLOSE_PARENTHESIS);
			setState(505);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(InterpreterParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(InterpreterParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(InterpreterParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(InterpreterParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(InterpreterParser.TYPE, i);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(FUNCTION);
			setState(508);
			match(ID);
			setState(509);
			match(OPEN_PARENTHESIS);
			setState(510);
			parameters();
			setState(511);
			match(COLON);
			setState(512);
			match(TYPE);
			setState(513);
			match(CLOSE_PARENTHESIS);
			setState(514);
			match(COLON);
			setState(515);
			match(TYPE);
			setState(516);
			match(SEMICOLON);
			setState(517);
			match(BEGIN);
			setState(518);
			statements();
			setState(519);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public Parameter_decContext parameter_dec() {
			return getRuleContext(Parameter_decContext.class,0);
		}
		public Function_CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_Call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterFunction_Call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitFunction_Call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitFunction_Call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_CallContext function_Call() throws RecognitionException {
		Function_CallContext _localctx = new Function_CallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function_Call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(ID);
			setState(522);
			match(OPEN_PARENTHESIS);
			{
			setState(523);
			parameter_dec();
			}
			setState(524);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(526);
				match(ID);
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(527);
					match(COMMA);
					setState(528);
					match(ID);
					}
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_decContext extends ParserRuleContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(InterpreterParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterpreterParser.TEXT, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(InterpreterParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(InterpreterParser.CHAR, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(InterpreterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(InterpreterParser.NUMBER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(InterpreterParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(InterpreterParser.FLOAT, i);
		}
		public List<TerminalNode> BOOLEANVALUE() { return getTokens(InterpreterParser.BOOLEANVALUE); }
		public TerminalNode BOOLEANVALUE(int i) {
			return getToken(InterpreterParser.BOOLEANVALUE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public Parameter_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterParameter_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitParameter_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitParameter_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_decContext parameter_dec() throws RecognitionException {
		Parameter_decContext _localctx = new Parameter_decContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameter_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17741719625793536L) != 0)) {
				{
				setState(538);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(536);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732923532771328L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(537);
					simple_expression();
					}
					break;
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(540);
					match(COMMA);
					setState(543);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(541);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732923532771328L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						setState(542);
						simple_expression();
						}
						break;
					}
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u0229\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000Q\b\u0000\n\u0000\f\u0000T\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\\\b\u0001\u000b\u0001\f\u0001]\u0001\u0001\u0001\u0001\u0004\u0001b\b"+
		"\u0001\u000b\u0001\f\u0001c\u0001\u0001\u0001\u0001\u0004\u0001h\b\u0001"+
		"\u000b\u0001\f\u0001i\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"u\b\u0003\n\u0003\f\u0003x\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0083\b\u0004\n\u0004\f\u0004\u0086\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u008b\b\u0004\n\u0004\f\u0004\u008e\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0092\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u009d\b\u0005\n\u0005\f\u0005\u00a0\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a5\b\u0005\n\u0005\f\u0005"+
		"\u00a8\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ad\b"+
		"\u0005\n\u0005\f\u0005\u00b0\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00b5\b\u0005\n\u0005\f\u0005\u00b8\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00c3\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00cf\b\b\n\b\f\b\u00d2\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d7"+
		"\b\b\n\b\f\b\u00da\t\b\u0001\b\u0001\b\u0003\b\u00de\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00e9"+
		"\b\t\n\t\f\t\u00ec\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u00f1\b\t\n\t\f"+
		"\t\u00f4\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u00f9\b\t\n\t\f\t\u00fc\t"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0101\b\t\n\t\f\t\u0104\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u010f\b\n\u0001\u000b\u0005\u000b\u0112\b\u000b\n\u000b\f\u000b\u0115"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0123\b\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0132\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0141\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u014a\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0153\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0159\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0169\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0174\b\u0012\u0005\u0012\u0176\b\u0012\n\u0012\f\u0012\u0179\t"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0187\b\u0013\u0005\u0013\u0189\b\u0013\n\u0013\f\u0013"+
		"\u018c\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u019b\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01a3\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u01ab\b\u0015\u0003\u0015\u01ad\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01bd\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u01c3\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u01cf\b\u001a\n\u001a\f\u001a\u01d2\t\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01d8\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0005 \u01ee\b \n \f \u01f1\t \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u0212\b$\n$"+
		"\f$\u0215\t$\u0003$\u0217\b$\u0001%\u0001%\u0003%\u021b\b%\u0001%\u0001"+
		"%\u0001%\u0003%\u0220\b%\u0005%\u0222\b%\n%\f%\u0225\t%\u0003%\u0227\b"+
		"%\u0001%\u0000\u0000&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\b\u0001"+
		"\u000045\u0001\u000012\u0002\u0000\u0002\u0002\u0004\u0004\u0002\u0000"+
		"1145\u0001\u0000$%\u0001\u000005\u0001\u0000\u0015\u0018\u0001\u0000 "+
		"#\u0261\u0000L\u0001\u0000\u0000\u0000\u0002g\u0001\u0000\u0000\u0000"+
		"\u0004k\u0001\u0000\u0000\u0000\u0006q\u0001\u0000\u0000\u0000\b}\u0001"+
		"\u0000\u0000\u0000\n\u0097\u0001\u0000\u0000\u0000\f\u00c2\u0001\u0000"+
		"\u0000\u0000\u000e\u00c4\u0001\u0000\u0000\u0000\u0010\u00c9\u0001\u0000"+
		"\u0000\u0000\u0012\u00e3\u0001\u0000\u0000\u0000\u0014\u010e\u0001\u0000"+
		"\u0000\u0000\u0016\u0113\u0001\u0000\u0000\u0000\u0018\u0116\u0001\u0000"+
		"\u0000\u0000\u001a\u0126\u0001\u0000\u0000\u0000\u001c\u0135\u0001\u0000"+
		"\u0000\u0000\u001e\u0144\u0001\u0000\u0000\u0000 \u014d\u0001\u0000\u0000"+
		"\u0000\"\u015c\u0001\u0000\u0000\u0000$\u016a\u0001\u0000\u0000\u0000"+
		"&\u017d\u0001\u0000\u0000\u0000(\u0190\u0001\u0000\u0000\u0000*\u0197"+
		"\u0001\u0000\u0000\u0000,\u01bc\u0001\u0000\u0000\u0000.\u01be\u0001\u0000"+
		"\u0000\u00000\u01c4\u0001\u0000\u0000\u00002\u01c8\u0001\u0000\u0000\u0000"+
		"4\u01ca\u0001\u0000\u0000\u00006\u01d7\u0001\u0000\u0000\u00008\u01d9"+
		"\u0001\u0000\u0000\u0000:\u01dd\u0001\u0000\u0000\u0000<\u01df\u0001\u0000"+
		"\u0000\u0000>\u01e1\u0001\u0000\u0000\u0000@\u01eb\u0001\u0000\u0000\u0000"+
		"B\u01f5\u0001\u0000\u0000\u0000D\u01fb\u0001\u0000\u0000\u0000F\u0209"+
		"\u0001\u0000\u0000\u0000H\u0216\u0001\u0000\u0000\u0000J\u0226\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0005\u0000\u0000MN\u00051\u0000\u0000NR\u0005/\u0000"+
		"\u0000OQ\u0003\u0002\u0001\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0005\u0007\u0000\u0000"+
		"VW\u0003\u0016\u000b\u0000WX\u0005\t\u0000\u0000X\u0001\u0001\u0000\u0000"+
		"\u0000Y[\u0005\n\u0000\u0000Z\\\u0003\f\u0006\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^h\u0001\u0000\u0000\u0000_a\u0005\u000b\u0000\u0000`b\u0003"+
		"\u0014\n\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dh\u0001\u0000\u0000\u0000"+
		"eh\u0003D\"\u0000fh\u0003>\u001f\u0000gY\u0001\u0000\u0000\u0000g_\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000j\u0003\u0001\u0000\u0000\u0000kl\u0005\u0001\u0000\u0000lm\u0005"+
		"+\u0000\u0000mn\u00051\u0000\u0000no\u0005,\u0000\u0000op\u0005/\u0000"+
		"\u0000p\u0005\u0001\u0000\u0000\u0000qv\u00051\u0000\u0000rs\u0005\r\u0000"+
		"\u0000su\u00051\u0000\u0000tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005(\u0000\u0000z{\u0005&\u0000"+
		"\u0000{|\u0005/\u0000\u0000|\u0007\u0001\u0000\u0000\u0000}~\u00051\u0000"+
		"\u0000~\u007f\u0005(\u0000\u0000\u007f\u0091\u0005\u0012\u0000\u0000\u0080"+
		"\u0084\u0005-\u0000\u0000\u0081\u0083\u0005\u0016\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u00052\u0000\u0000\u0088\u008c\u0005)\u0000\u0000\u0089\u008b\u0005\u0016"+
		"\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u00052\u0000\u0000\u0090\u0092\u0005.\u0000\u0000"+
		"\u0091\u0080\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0003\u0000\u0000"+
		"\u0094\u0095\u0005&\u0000\u0000\u0095\u0096\u0005/\u0000\u0000\u0096\t"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u00051\u0000\u0000\u0098\u0099\u0005"+
		"(\u0000\u0000\u0099\u009a\u0005\u0012\u0000\u0000\u009a\u009e\u0005-\u0000"+
		"\u0000\u009b\u009d\u0005\u0016\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u00052\u0000\u0000"+
		"\u00a2\u00a6\u0005)\u0000\u0000\u00a3\u00a5\u0005\u0016\u0000\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u00052\u0000\u0000\u00aa\u00ae\u0005\r\u0000\u0000\u00ab\u00ad"+
		"\u0005\u0016\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u00052\u0000\u0000\u00b2\u00b6\u0005"+
		")\u0000\u0000\u00b3\u00b5\u0005\u0016\u0000\u0000\u00b4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u00052\u0000"+
		"\u0000\u00ba\u00bb\u0005.\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000"+
		"\u00bc\u00bd\u0005&\u0000\u0000\u00bd\u00be\u0005/\u0000\u0000\u00be\u000b"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c3\u0003\u0006\u0003\u0000\u00c0\u00c3"+
		"\u0003\b\u0004\u0000\u00c1\u00c3\u0003\n\u0005\u0000\u00c2\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\r\u0001\u0000\u0000\u0000\u00c4\u00c5\u00051"+
		"\u0000\u0000\u00c5\u00c6\u0005$\u0000\u0000\u00c6\u00c7\u0007\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005/\u0000\u0000\u00c8\u000f\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u00051\u0000\u0000\u00ca\u00cb\u0005(\u0000\u0000\u00cb\u00dd"+
		"\u0005\u0012\u0000\u0000\u00cc\u00d0\u0005-\u0000\u0000\u00cd\u00cf\u0005"+
		"\u0016\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u00052\u0000\u0000\u00d4\u00d8\u0005)\u0000"+
		"\u0000\u00d5\u00d7\u0005\u0016\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db\u0001\u0000\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u00052\u0000\u0000"+
		"\u00dc\u00de\u0005.\u0000\u0000\u00dd\u00cc\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005\u0003\u0000\u0000\u00e0\u00e1\u0005&\u0000\u0000\u00e1\u00e2"+
		"\u0005/\u0000\u0000\u00e2\u0011\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		"1\u0000\u0000\u00e4\u00e5\u0005(\u0000\u0000\u00e5\u00e6\u0005\u0012\u0000"+
		"\u0000\u00e6\u00ea\u0005-\u0000\u0000\u00e7\u00e9\u0005\u0016\u0000\u0000"+
		"\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u00052\u0000\u0000\u00ee\u00f2\u0005)\u0000\u0000\u00ef\u00f1"+
		"\u0005\u0016\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u00052\u0000\u0000\u00f6\u00fa\u0005"+
		"\r\u0000\u0000\u00f7\u00f9\u0005\u0016\u0000\u0000\u00f8\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u00052\u0000"+
		"\u0000\u00fe\u0102\u0005)\u0000\u0000\u00ff\u0101\u0005\u0016\u0000\u0000"+
		"\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u00052\u0000\u0000\u0106\u0107\u0005.\u0000\u0000\u0107\u0108"+
		"\u0005\u0003\u0000\u0000\u0108\u0109\u0005&\u0000\u0000\u0109\u010a\u0005"+
		"/\u0000\u0000\u010a\u0013\u0001\u0000\u0000\u0000\u010b\u010f\u0003\u000e"+
		"\u0007\u0000\u010c\u010f\u0003\u0010\b\u0000\u010d\u010f\u0003\u0012\t"+
		"\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0015\u0001\u0000\u0000"+
		"\u0000\u0110\u0112\u0003,\u0016\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0017\u0001\u0000\u0000\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0117\u00051\u0000\u0000\u0117"+
		"\u0122\u0005\'\u0000\u0000\u0118\u0123\u00051\u0000\u0000\u0119\u0123"+
		"\u00052\u0000\u0000\u011a\u0123\u00053\u0000\u0000\u011b\u0123\u00054"+
		"\u0000\u0000\u011c\u0123\u00055\u0000\u0000\u011d\u0123\u00050\u0000\u0000"+
		"\u011e\u0123\u00034\u001a\u0000\u011f\u0123\u0003\u001e\u000f\u0000\u0120"+
		"\u0123\u0003 \u0010\u0000\u0121\u0123\u0003F#\u0000\u0122\u0118\u0001"+
		"\u0000\u0000\u0000\u0122\u0119\u0001\u0000\u0000\u0000\u0122\u011a\u0001"+
		"\u0000\u0000\u0000\u0122\u011b\u0001\u0000\u0000\u0000\u0122\u011c\u0001"+
		"\u0000\u0000\u0000\u0122\u011d\u0001\u0000\u0000\u0000\u0122\u011e\u0001"+
		"\u0000\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0005/\u0000\u0000\u0125\u0019\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0003\u001e\u000f\u0000\u0127\u0131\u0005\'\u0000"+
		"\u0000\u0128\u0132\u00051\u0000\u0000\u0129\u0132\u00052\u0000\u0000\u012a"+
		"\u0132\u00053\u0000\u0000\u012b\u0132\u00054\u0000\u0000\u012c\u0132\u0005"+
		"5\u0000\u0000\u012d\u0132\u00034\u001a\u0000\u012e\u0132\u0003\u001e\u000f"+
		"\u0000\u012f\u0132\u0003 \u0010\u0000\u0130\u0132\u0003F#\u0000\u0131"+
		"\u0128\u0001\u0000\u0000\u0000\u0131\u0129\u0001\u0000\u0000\u0000\u0131"+
		"\u012a\u0001\u0000\u0000\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0131"+
		"\u012c\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u0131"+
		"\u012e\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0005/\u0000\u0000\u0134\u001b\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0003 \u0010\u0000\u0136\u0140\u0005\'\u0000\u0000\u0137\u0141\u0005"+
		"1\u0000\u0000\u0138\u0141\u00052\u0000\u0000\u0139\u0141\u00053\u0000"+
		"\u0000\u013a\u0141\u00054\u0000\u0000\u013b\u0141\u00055\u0000\u0000\u013c"+
		"\u0141\u00034\u001a\u0000\u013d\u0141\u0003\u001e\u000f\u0000\u013e\u0141"+
		"\u0003 \u0010\u0000\u013f\u0141\u0003F#\u0000\u0140\u0137\u0001\u0000"+
		"\u0000\u0000\u0140\u0138\u0001\u0000\u0000\u0000\u0140\u0139\u0001\u0000"+
		"\u0000\u0000\u0140\u013a\u0001\u0000\u0000\u0000\u0140\u013b\u0001\u0000"+
		"\u0000\u0000\u0140\u013c\u0001\u0000\u0000\u0000\u0140\u013d\u0001\u0000"+
		"\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0005/\u0000"+
		"\u0000\u0143\u001d\u0001\u0000\u0000\u0000\u0144\u0145\u00051\u0000\u0000"+
		"\u0145\u0149\u0005-\u0000\u0000\u0146\u014a\u00034\u001a\u0000\u0147\u014a"+
		"\u00052\u0000\u0000\u0148\u014a\u00051\u0000\u0000\u0149\u0146\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0005.\u0000"+
		"\u0000\u014c\u001f\u0001\u0000\u0000\u0000\u014d\u014e\u00051\u0000\u0000"+
		"\u014e\u0152\u0005-\u0000\u0000\u014f\u0153\u00034\u001a\u0000\u0150\u0153"+
		"\u00052\u0000\u0000\u0151\u0153\u00051\u0000\u0000\u0152\u014f\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0158\u0005\r\u0000"+
		"\u0000\u0155\u0159\u00034\u001a\u0000\u0156\u0159\u00052\u0000\u0000\u0157"+
		"\u0159\u00051\u0000\u0000\u0158\u0155\u0001\u0000\u0000\u0000\u0158\u0156"+
		"\u0001\u0000\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0005.\u0000\u0000\u015b!\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0005\u000e\u0000\u0000\u015d\u015e\u00051\u0000"+
		"\u0000\u015e\u015f\u0005\'\u0000\u0000\u015f\u0160\u0007\u0001\u0000\u0000"+
		"\u0160\u0161\u0007\u0002\u0000\u0000\u0161\u0162\u0007\u0001\u0000\u0000"+
		"\u0162\u0168\u0005\u0011\u0000\u0000\u0163\u0164\u0005\u0007\u0000\u0000"+
		"\u0164\u0165\u0003\u0016\u000b\u0000\u0165\u0166\u0005\b\u0000\u0000\u0166"+
		"\u0169\u0001\u0000\u0000\u0000\u0167\u0169\u0003,\u0016\u0000\u0168\u0163"+
		"\u0001\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169#\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0005\u0013\u0000\u0000\u016b\u016c\u0005"+
		"+\u0000\u0000\u016c\u0177\u0007\u0003\u0000\u0000\u016d\u0173\u0005\r"+
		"\u0000\u0000\u016e\u0174\u00051\u0000\u0000\u016f\u0174\u00054\u0000\u0000"+
		"\u0170\u0174\u00055\u0000\u0000\u0171\u0174\u0003\u001e\u000f\u0000\u0172"+
		"\u0174\u0003 \u0010\u0000\u0173\u016e\u0001\u0000\u0000\u0000\u0173\u016f"+
		"\u0001\u0000\u0000\u0000\u0173\u0170\u0001\u0000\u0000\u0000\u0173\u0171"+
		"\u0001\u0000\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0176"+
		"\u0001\u0000\u0000\u0000\u0175\u016d\u0001\u0000\u0000\u0000\u0176\u0179"+
		"\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0001\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177"+
		"\u0001\u0000\u0000\u0000\u017a\u017b\u0005,\u0000\u0000\u017b\u017c\u0005"+
		"/\u0000\u0000\u017c%\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u0014\u0000"+
		"\u0000\u017e\u017f\u0005+\u0000\u0000\u017f\u018a\u0007\u0003\u0000\u0000"+
		"\u0180\u0186\u0005\r\u0000\u0000\u0181\u0187\u00051\u0000\u0000\u0182"+
		"\u0187\u00054\u0000\u0000\u0183\u0187\u00055\u0000\u0000\u0184\u0187\u0003"+
		"\u001e\u000f\u0000\u0185\u0187\u0003 \u0010\u0000\u0186\u0181\u0001\u0000"+
		"\u0000\u0000\u0186\u0182\u0001\u0000\u0000\u0000\u0186\u0183\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0180\u0001\u0000"+
		"\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000"+
		"\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d\u0001\u0000"+
		"\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u018e\u0005,\u0000"+
		"\u0000\u018e\u018f\u0005/\u0000\u0000\u018f\'\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0005\u000f\u0000\u0000\u0191\u0192\u0003.\u0017\u0000\u0192"+
		"\u0193\u0005\u0011\u0000\u0000\u0193\u0194\u0005\u0007\u0000\u0000\u0194"+
		"\u0195\u0003\u0016\u000b\u0000\u0195\u0196\u0005\b\u0000\u0000\u0196)"+
		"\u0001\u0000\u0000\u0000\u0197\u019a\u0005\u001a\u0000\u0000\u0198\u019b"+
		"\u0003.\u0017\u0000\u0199\u019b\u00030\u0018\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000"+
		"\u0000\u0000\u019c\u01a2\u0005\u001b\u0000\u0000\u019d\u01a3\u0003,\u0016"+
		"\u0000\u019e\u019f\u0005\u0007\u0000\u0000\u019f\u01a0\u0003\u0016\u000b"+
		"\u0000\u01a0\u01a1\u0005\b\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a2\u019d\u0001\u0000\u0000\u0000\u01a2\u019e\u0001\u0000\u0000\u0000"+
		"\u01a3\u01ac\u0001\u0000\u0000\u0000\u01a4\u01aa\u0005\u0019\u0000\u0000"+
		"\u01a5\u01ab\u0003,\u0016\u0000\u01a6\u01a7\u0005\u0007\u0000\u0000\u01a7"+
		"\u01a8\u0003\u0016\u000b\u0000\u01a8\u01a9\u0005\b\u0000\u0000\u01a9\u01ab"+
		"\u0001\u0000\u0000\u0000\u01aa\u01a5\u0001\u0000\u0000\u0000\u01aa\u01a6"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01a4"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad+\u0001"+
		"\u0000\u0000\u0000\u01ae\u01bd\u0003\u0018\f\u0000\u01af\u01bd\u0003\u001a"+
		"\r\u0000\u01b0\u01bd\u0003\u001c\u000e\u0000\u01b1\u01bd\u0003\"\u0011"+
		"\u0000\u01b2\u01bd\u0003$\u0012\u0000\u01b3\u01bd\u0003&\u0013\u0000\u01b4"+
		"\u01bd\u0003(\u0014\u0000\u01b5\u01bd\u0003*\u0015\u0000\u01b6\u01bd\u0003"+
		"B!\u0000\u01b7\u01bd\u0003\u0004\u0002\u0000\u01b8\u01b9\u0005\u0007\u0000"+
		"\u0000\u01b9\u01ba\u0003\u0016\u000b\u0000\u01ba\u01bb\u0005\b\u0000\u0000"+
		"\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01ae\u0001\u0000\u0000\u0000"+
		"\u01bc\u01af\u0001\u0000\u0000\u0000\u01bc\u01b0\u0001\u0000\u0000\u0000"+
		"\u01bc\u01b1\u0001\u0000\u0000\u0000\u01bc\u01b2\u0001\u0000\u0000\u0000"+
		"\u01bc\u01b3\u0001\u0000\u0000\u0000\u01bc\u01b4\u0001\u0000\u0000\u0000"+
		"\u01bc\u01b5\u0001\u0000\u0000\u0000\u01bc\u01b6\u0001\u0000\u0000\u0000"+
		"\u01bc\u01b7\u0001\u0000\u0000\u0000\u01bc\u01b8\u0001\u0000\u0000\u0000"+
		"\u01bd-\u0001\u0000\u0000\u0000\u01be\u01c2\u00034\u001a\u0000\u01bf\u01c0"+
		"\u0003<\u001e\u0000\u01c0\u01c1\u00034\u001a\u0000\u01c1\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c2\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3/\u0001\u0000\u0000\u0000\u01c4\u01c5\u00032\u0019\u0000"+
		"\u01c5\u01c6\u0007\u0004\u0000\u0000\u01c6\u01c7\u00032\u0019\u0000\u01c7"+
		"1\u0001\u0000\u0000\u0000\u01c8\u01c9\u0007\u0005\u0000\u0000\u01c93\u0001"+
		"\u0000\u0000\u0000\u01ca\u01d0\u00036\u001b\u0000\u01cb\u01cc\u0003:\u001d"+
		"\u0000\u01cc\u01cd\u00036\u001b\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cb\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d15\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d8\u00051\u0000\u0000\u01d4\u01d8\u00052\u0000\u0000\u01d5\u01d8\u0005"+
		"3\u0000\u0000\u01d6\u01d8\u00038\u001c\u0000\u01d7\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d87\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005+\u0000\u0000\u01da\u01db\u00034\u001a\u0000\u01db\u01dc"+
		"\u0005,\u0000\u0000\u01dc9\u0001\u0000\u0000\u0000\u01dd\u01de\u0007\u0006"+
		"\u0000\u0000\u01de;\u0001\u0000\u0000\u0000\u01df\u01e0\u0007\u0007\u0000"+
		"\u0000\u01e0=\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005\u0006\u0000\u0000"+
		"\u01e2\u01e3\u00051\u0000\u0000\u01e3\u01e4\u0005+\u0000\u0000\u01e4\u01e5"+
		"\u0003H$\u0000\u01e5\u01e6\u0005(\u0000\u0000\u01e6\u01e7\u0005&\u0000"+
		"\u0000\u01e7\u01e8\u0005,\u0000\u0000\u01e8\u01e9\u0005/\u0000\u0000\u01e9"+
		"\u01ea\u0003@ \u0000\u01ea?\u0001\u0000\u0000\u0000\u01eb\u01ef\u0005"+
		"\u0007\u0000\u0000\u01ec\u01ee\u0003\u0002\u0001\u0000\u01ed\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f3\u0003"+
		"\u0016\u000b\u0000\u01f3\u01f4\u0005\b\u0000\u0000\u01f4A\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u00051\u0000\u0000\u01f6\u01f7\u0005+\u0000\u0000"+
		"\u01f7\u01f8\u0003J%\u0000\u01f8\u01f9\u0005,\u0000\u0000\u01f9\u01fa"+
		"\u0005/\u0000\u0000\u01faC\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005\u001f"+
		"\u0000\u0000\u01fc\u01fd\u00051\u0000\u0000\u01fd\u01fe\u0005+\u0000\u0000"+
		"\u01fe\u01ff\u0003H$\u0000\u01ff\u0200\u0005(\u0000\u0000\u0200\u0201"+
		"\u0005&\u0000\u0000\u0201\u0202\u0005,\u0000\u0000\u0202\u0203\u0005("+
		"\u0000\u0000\u0203\u0204\u0005&\u0000\u0000\u0204\u0205\u0005/\u0000\u0000"+
		"\u0205\u0206\u0005\u0007\u0000\u0000\u0206\u0207\u0003\u0016\u000b\u0000"+
		"\u0207\u0208\u0005\b\u0000\u0000\u0208E\u0001\u0000\u0000\u0000\u0209"+
		"\u020a\u00051\u0000\u0000\u020a\u020b\u0005+\u0000\u0000\u020b\u020c\u0003"+
		"J%\u0000\u020c\u020d\u0005,\u0000\u0000\u020dG\u0001\u0000\u0000\u0000"+
		"\u020e\u0213\u00051\u0000\u0000\u020f\u0210\u0005\r\u0000\u0000\u0210"+
		"\u0212\u00051\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0215"+
		"\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213"+
		"\u0001\u0000\u0000\u0000\u0216\u020e\u0001\u0000\u0000\u0000\u0216\u0217"+
		"\u0001\u0000\u0000\u0000\u0217I\u0001\u0000\u0000\u0000\u0218\u021b\u0007"+
		"\u0005\u0000\u0000\u0219\u021b\u00034\u001a\u0000\u021a\u0218\u0001\u0000"+
		"\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021b\u0223\u0001\u0000"+
		"\u0000\u0000\u021c\u021f\u0005\r\u0000\u0000\u021d\u0220\u0007\u0005\u0000"+
		"\u0000\u021e\u0220\u00034\u001a\u0000\u021f\u021d\u0001\u0000\u0000\u0000"+
		"\u021f\u021e\u0001\u0000\u0000\u0000\u0220\u0222\u0001\u0000\u0000\u0000"+
		"\u0221\u021c\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000"+
		"\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000"+
		"\u0224\u0227\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000"+
		"\u0226\u021a\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000"+
		"\u0227K\u0001\u0000\u0000\u00001R]cgiv\u0084\u008c\u0091\u009e\u00a6\u00ae"+
		"\u00b6\u00c2\u00d0\u00d8\u00dd\u00ea\u00f2\u00fa\u0102\u010e\u0113\u0122"+
		"\u0131\u0140\u0149\u0152\u0158\u0168\u0173\u0177\u0186\u018a\u019a\u01a2"+
		"\u01aa\u01ac\u01bc\u01c2\u01d0\u01d7\u01ef\u0213\u0216\u021a\u021f\u0223"+
		"\u0226";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}