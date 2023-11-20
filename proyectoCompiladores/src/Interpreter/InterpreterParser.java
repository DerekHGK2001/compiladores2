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
		READLN=1, READ=2, TO=3, OF=4, DOWNTO=5, PROGRAM=6, PROCEDURE=7, BEGIN=8, 
		END=9, ENDPROGRAM=10, VAR=11, CONST=12, PRINTLN=13, COMMA=14, FOR=15, 
		WHILE=16, COMMENT=17, DO=18, ARRAY=19, WRITELN=20, WRITE=21, PLUS=22, 
		MINUS=23, MULT=24, DIV=25, ELSE=26, IF=27, THEN=28, AND=29, OR=30, NOT=31, 
		FUNCTION=32, GREATER_THAN=33, LESS_THAN=34, GREATER_THAN_OR_EQUALS=35, 
		LESS_THAN_OR_EQUALS=36, EQUALS=37, NOT_EQUALS=38, TYPE=39, ASSIGN=40, 
		COLON=41, DOTDOT=42, POINT=43, OPEN_PARENTHESIS=44, CLOSE_PARENTHESIS=45, 
		OPEN_BRACKET=46, CLOSE_BRACKET=47, SEMICOLON=48, BOOLEANVALUE=49, ID=50, 
		NUMBER=51, TEXT=52, CHAR=53, WS=54, STRING=55;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_read_call = 2, RULE_readln_call = 3, 
		RULE_variable_declaration = 4, RULE_array_declaration = 5, RULE_arraybi_declaration = 6, 
		RULE_var_variables = 7, RULE_const_variable_declaration = 8, RULE_const_array_declaration = 9, 
		RULE_const_arraybi_declaration = 10, RULE_const_variables = 11, RULE_statements = 12, 
		RULE_variable_init = 13, RULE_array_init = 14, RULE_arrayBi_init = 15, 
		RULE_array_access = 16, RULE_arrayBi_access = 17, RULE_for_loop = 18, 
		RULE_writeln_stmt = 19, RULE_write = 20, RULE_while_loop = 21, RULE_if_statement = 22, 
		RULE_statement = 23, RULE_statement_bucle = 24, RULE_expression = 25, 
		RULE_comparison = 26, RULE_terms = 27, RULE_simple_expression = 28, RULE_factor = 29, 
		RULE_operacones_parentesis = 30, RULE_operaciones_simples = 31, RULE_operaciones = 32, 
		RULE_function_declaration = 33, RULE_function_Call = 34, RULE_parameters = 35, 
		RULE_parameter_dec = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "read_call", "readln_call", "variable_declaration", 
			"array_declaration", "arraybi_declaration", "var_variables", "const_variable_declaration", 
			"const_array_declaration", "const_arraybi_declaration", "const_variables", 
			"statements", "variable_init", "array_init", "arrayBi_init", "array_access", 
			"arrayBi_access", "for_loop", "writeln_stmt", "write", "while_loop", 
			"if_statement", "statement", "statement_bucle", "expression", "comparison", 
			"terms", "simple_expression", "factor", "operacones_parentesis", "operaciones_simples", 
			"operaciones", "function_declaration", "function_Call", "parameters", 
			"parameter_dec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'readln'", "'read'", "'to'", "'of'", "'downto'", "'program'", 
			"'procedure'", "'begin'", "'end;'", "'end.'", "'var'", "'const'", "'println'", 
			"','", "'for'", "'while'", null, "'do'", "'array'", "'writeln'", "'write'", 
			"'+'", "'-'", null, "'/'", "'else'", "'if'", "'then'", "'and'", "'or'", 
			"'not'", "'function'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", null, 
			"':='", "':'", "'..'", "'.'", "'('", "')'", "'['", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "READLN", "READ", "TO", "OF", "DOWNTO", "PROGRAM", "PROCEDURE", 
			"BEGIN", "END", "ENDPROGRAM", "VAR", "CONST", "PRINTLN", "COMMA", "FOR", 
			"WHILE", "COMMENT", "DO", "ARRAY", "WRITELN", "WRITE", "PLUS", "MINUS", 
			"MULT", "DIV", "ELSE", "IF", "THEN", "AND", "OR", "NOT", "FUNCTION", 
			"GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN_OR_EQUALS", 
			"EQUALS", "NOT_EQUALS", "TYPE", "ASSIGN", "COLON", "DOTDOT", "POINT", 
			"OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"SEMICOLON", "BOOLEANVALUE", "ID", "NUMBER", "TEXT", "CHAR", "WS", "STRING"
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
			setState(74);
			match(PROGRAM);
			setState(75);
			match(ID);
			setState(76);
			match(SEMICOLON);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294973440L) != 0)) {
				{
				{
				setState(77);
				declarations();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(BEGIN);
			setState(84);
			statements();
			setState(85);
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
			setState(100); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(100);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
						{
						setState(87);
						match(VAR);
						setState(89); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(88);
								var_variables();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(91); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case CONST:
						{
						setState(93);
						match(CONST);
						setState(95); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(94);
								const_variables();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(97); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case FUNCTION:
						{
						setState(99);
						function_declaration();
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
				setState(102); 
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
			setState(104);
			match(READ);
			setState(105);
			match(OPEN_PARENTHESIS);
			setState(106);
			match(ID);
			setState(107);
			match(CLOSE_PARENTHESIS);
			setState(108);
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
	public static class Readln_callContext extends ParserRuleContext {
		public TerminalNode READLN() { return getToken(InterpreterParser.READLN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public Readln_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readln_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterReadln_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitReadln_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitReadln_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Readln_callContext readln_call() throws RecognitionException {
		Readln_callContext _localctx = new Readln_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_readln_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(READLN);
			setState(111);
			match(OPEN_PARENTHESIS);
			setState(112);
			match(ID);
			setState(113);
			match(CLOSE_PARENTHESIS);
			setState(114);
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
		enterRule(_localctx, 8, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ID);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117);
				match(COMMA);
				setState(118);
				match(ID);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(COLON);
			setState(125);
			match(TYPE);
			setState(126);
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
		enterRule(_localctx, 10, RULE_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
			setState(129);
			match(COLON);
			setState(130);
			match(ARRAY);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(131);
				match(OPEN_BRACKET);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(132);
					match(MINUS);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(NUMBER);
				setState(139);
				match(DOTDOT);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(140);
					match(MINUS);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(NUMBER);
				setState(147);
				match(CLOSE_BRACKET);
				}
			}

			setState(150);
			match(OF);
			setState(151);
			match(TYPE);
			setState(152);
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
		enterRule(_localctx, 12, RULE_arraybi_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ID);
			setState(155);
			match(COLON);
			setState(156);
			match(ARRAY);
			setState(157);
			match(OPEN_BRACKET);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(158);
				match(MINUS);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(NUMBER);
			setState(165);
			match(DOTDOT);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(166);
				match(MINUS);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(NUMBER);
			setState(173);
			match(COMMA);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(174);
				match(MINUS);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(NUMBER);
			setState(181);
			match(DOTDOT);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(182);
				match(MINUS);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(NUMBER);
			setState(189);
			match(CLOSE_BRACKET);
			setState(190);
			match(OF);
			setState(191);
			match(TYPE);
			setState(192);
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
		enterRule(_localctx, 14, RULE_var_variables);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				array_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
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
		enterRule(_localctx, 16, RULE_const_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
			setState(200);
			match(EQUALS);
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
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
		enterRule(_localctx, 18, RULE_const_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ID);
			setState(205);
			match(COLON);
			setState(206);
			match(ARRAY);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(207);
				match(OPEN_BRACKET);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(208);
					match(MINUS);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(NUMBER);
				setState(215);
				match(DOTDOT);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS) {
					{
					{
					setState(216);
					match(MINUS);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(NUMBER);
				setState(223);
				match(CLOSE_BRACKET);
				}
			}

			setState(226);
			match(OF);
			setState(227);
			match(TYPE);
			setState(228);
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
		enterRule(_localctx, 20, RULE_const_arraybi_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ID);
			setState(231);
			match(COLON);
			setState(232);
			match(ARRAY);
			setState(233);
			match(OPEN_BRACKET);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(234);
				match(MINUS);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(NUMBER);
			setState(241);
			match(DOTDOT);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(242);
				match(MINUS);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(NUMBER);
			setState(249);
			match(COMMA);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(250);
				match(MINUS);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(NUMBER);
			setState(257);
			match(DOTDOT);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(258);
				match(MINUS);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(NUMBER);
			setState(265);
			match(CLOSE_BRACKET);
			setState(266);
			match(OF);
			setState(267);
			match(TYPE);
			setState(268);
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
		enterRule(_localctx, 22, RULE_const_variables);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				const_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				const_array_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
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
		enterRule(_localctx, 24, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
				{
				{
				setState(275);
				statement();
				}
				}
				setState(280);
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
		enterRule(_localctx, 26, RULE_variable_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(ID);
			setState(282);
			match(ASSIGN);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(283);
				match(ID);
				}
				break;
			case 2:
				{
				setState(284);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(285);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(286);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(287);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(288);
				simple_expression();
				}
				break;
			case 7:
				{
				setState(289);
				array_access();
				}
				break;
			case 8:
				{
				setState(290);
				arrayBi_access();
				}
				break;
			case 9:
				{
				setState(291);
				function_Call();
				}
				break;
			}
			setState(294);
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
		enterRule(_localctx, 28, RULE_array_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			array_access();
			setState(297);
			match(ASSIGN);
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(298);
				match(ID);
				}
				break;
			case 2:
				{
				setState(299);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(300);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(301);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(302);
				simple_expression();
				}
				break;
			case 6:
				{
				setState(303);
				array_access();
				}
				break;
			case 7:
				{
				setState(304);
				arrayBi_access();
				}
				break;
			case 8:
				{
				setState(305);
				function_Call();
				}
				break;
			}
			setState(308);
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
		enterRule(_localctx, 30, RULE_arrayBi_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			arrayBi_access();
			setState(311);
			match(ASSIGN);
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(312);
				match(ID);
				}
				break;
			case 2:
				{
				setState(313);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(314);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(315);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(316);
				simple_expression();
				}
				break;
			case 6:
				{
				setState(317);
				array_access();
				}
				break;
			case 7:
				{
				setState(318);
				arrayBi_access();
				}
				break;
			case 8:
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
		enterRule(_localctx, 32, RULE_array_access);
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
		enterRule(_localctx, 34, RULE_arrayBi_access);
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
		public List<Statement_bucleContext> statement_bucle() {
			return getRuleContexts(Statement_bucleContext.class);
		}
		public Statement_bucleContext statement_bucle(int i) {
			return getRuleContext(Statement_bucleContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
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
		enterRule(_localctx, 36, RULE_for_loop);
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
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READLN:
			case READ:
			case VAR:
			case CONST:
			case FOR:
			case WHILE:
			case WRITELN:
			case WRITE:
			case IF:
			case FUNCTION:
			case ID:
				{
				setState(355);
				statement_bucle();
				}
				break;
			case BEGIN:
				{
				setState(356);
				match(BEGIN);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125904339277830L) != 0)) {
					{
					{
					setState(357);
					statement_bucle();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 38, RULE_writeln_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(WRITELN);
			setState(367);
			match(OPEN_PARENTHESIS);
			setState(368);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14636698788954112L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(369);
				match(COMMA);
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(370);
					match(ID);
					}
					break;
				case 2:
					{
					setState(371);
					match(TEXT);
					}
					break;
				case 3:
					{
					setState(372);
					match(CHAR);
					}
					break;
				case 4:
					{
					setState(373);
					array_access();
					}
					break;
				case 5:
					{
					setState(374);
					arrayBi_access();
					}
					break;
				}
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(CLOSE_PARENTHESIS);
			setState(383);
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
		enterRule(_localctx, 40, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(WRITE);
			setState(386);
			match(OPEN_PARENTHESIS);
			setState(387);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14636698788954112L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(388);
				match(COMMA);
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(389);
					match(ID);
					}
					break;
				case 2:
					{
					setState(390);
					match(TEXT);
					}
					break;
				case 3:
					{
					setState(391);
					match(CHAR);
					}
					break;
				case 4:
					{
					setState(392);
					array_access();
					}
					break;
				case 5:
					{
					setState(393);
					arrayBi_access();
					}
					break;
				}
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(CLOSE_PARENTHESIS);
			setState(402);
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
		public TerminalNode DO() { return getToken(InterpreterParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public List<Statement_bucleContext> statement_bucle() {
			return getRuleContexts(Statement_bucleContext.class);
		}
		public Statement_bucleContext statement_bucle(int i) {
			return getRuleContext(Statement_bucleContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(WHILE);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(405);
				match(OPEN_PARENTHESIS);
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(406);
					expression();
					}
					break;
				case 2:
					{
					setState(407);
					comparison();
					}
					break;
				}
				setState(410);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case 2:
				{
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(412);
					expression();
					}
					break;
				case 2:
					{
					setState(413);
					comparison();
					}
					break;
				}
				}
				break;
			}
			setState(418);
			match(DO);
			setState(419);
			match(BEGIN);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125904339277830L) != 0)) {
				{
				{
				setState(420);
				statement_bucle();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
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
		enterRule(_localctx, 44, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(IF);
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(429);
				expression();
				}
				break;
			case 2:
				{
				setState(430);
				comparison();
				}
				break;
			}
			setState(433);
			match(THEN);
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READLN:
			case READ:
			case FOR:
			case WHILE:
			case WRITELN:
			case WRITE:
			case IF:
			case ID:
				{
				setState(434);
				statement();
				}
				break;
			case BEGIN:
				{
				setState(435);
				match(BEGIN);
				setState(436);
				statements();
				setState(437);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(441);
				match(ELSE);
				setState(447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case READLN:
				case READ:
				case FOR:
				case WHILE:
				case WRITELN:
				case WRITE:
				case IF:
				case ID:
					{
					setState(442);
					statement();
					}
					break;
				case BEGIN:
					{
					setState(443);
					match(BEGIN);
					setState(444);
					statements();
					setState(445);
					match(END);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		public Read_callContext read_call() {
			return getRuleContext(Read_callContext.class,0);
		}
		public Readln_callContext readln_call() {
			return getRuleContext(Readln_callContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(456);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(457);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(458);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(459);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(460);
				readln_call();
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
	public static class Statement_bucleContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
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
		public Read_callContext read_call() {
			return getRuleContext(Read_callContext.class,0);
		}
		public Readln_callContext readln_call() {
			return getRuleContext(Readln_callContext.class,0);
		}
		public Statement_bucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatement_bucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatement_bucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitStatement_bucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_bucleContext statement_bucle() throws RecognitionException {
		Statement_bucleContext _localctx = new Statement_bucleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement_bucle);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				variable_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				array_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				arrayBi_init();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				for_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				writeln_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(469);
				write();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(470);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(471);
				if_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(472);
				read_call();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(473);
				readln_call();
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
		enterRule(_localctx, 50, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			simple_expression();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) {
				{
				setState(477);
				operaciones();
				setState(478);
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
		enterRule(_localctx, 52, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			terms();
			setState(483);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(484);
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
		public TerminalNode BOOLEANVALUE() { return getToken(InterpreterParser.BOOLEANVALUE, 0); }
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_terms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(486);
				match(ID);
				}
				break;
			case 2:
				{
				setState(487);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(488);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(489);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(490);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(491);
				simple_expression();
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
		enterRule(_localctx, 56, RULE_simple_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			factor();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) {
				{
				{
				setState(495);
				operaciones_simples();
				setState(496);
				factor();
				}
				}
				setState(502);
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
		enterRule(_localctx, 58, RULE_factor);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(NUMBER);
				}
				break;
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
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
		enterRule(_localctx, 60, RULE_operacones_parentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(OPEN_PARENTHESIS);
			setState(509);
			simple_expression();
			setState(510);
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
		enterRule(_localctx, 62, RULE_operaciones_simples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_operaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) ) {
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
	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(InterpreterParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public List<TerminalNode> COLON() { return getTokens(InterpreterParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(InterpreterParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(InterpreterParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(InterpreterParser.TYPE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
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
		enterRule(_localctx, 66, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(FUNCTION);
			setState(517);
			match(ID);
			setState(518);
			match(OPEN_PARENTHESIS);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON || _la==ID) {
				{
				{
				setState(519);
				parameters();
				setState(520);
				match(COLON);
				setState(521);
				match(TYPE);
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			match(CLOSE_PARENTHESIS);
			setState(529);
			match(COLON);
			setState(530);
			match(TYPE);
			setState(531);
			match(SEMICOLON);
			setState(532);
			match(BEGIN);
			setState(533);
			statements();
			setState(534);
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
		enterRule(_localctx, 68, RULE_function_Call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(ID);
			setState(537);
			match(OPEN_PARENTHESIS);
			{
			setState(538);
			parameter_dec();
			}
			setState(539);
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
		enterRule(_localctx, 70, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				{
				setState(541);
				match(ID);
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(542);
					match(COMMA);
					setState(543);
					match(ID);
					}
					}
					setState(548);
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
		enterRule(_localctx, 72, RULE_parameter_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17469040742105088L) != 0)) {
				{
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(551);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556060672L) != 0)) ) {
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
					setState(552);
					simple_expression();
					}
					break;
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(555);
					match(COMMA);
					setState(558);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(556);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556060672L) != 0)) ) {
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
						setState(557);
						simple_expression();
						}
						break;
					}
					}
					}
					setState(564);
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
		"\u0004\u00017\u0238\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001Z\b\u0001"+
		"\u000b\u0001\f\u0001[\u0001\u0001\u0001\u0001\u0004\u0001`\b\u0001\u000b"+
		"\u0001\f\u0001a\u0001\u0001\u0004\u0001e\b\u0001\u000b\u0001\f\u0001f"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004x\b\u0004\n\u0004\f\u0004"+
		"{\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0086\b\u0005"+
		"\n\u0005\f\u0005\u0089\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u008e\b\u0005\n\u0005\f\u0005\u0091\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0095\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00a0\b\u0006\n\u0006\f\u0006\u00a3\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00a8\b\u0006\n\u0006\f\u0006\u00ab\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00b0\b\u0006\n\u0006\f\u0006\u00b3"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b8\b\u0006"+
		"\n\u0006\f\u0006\u00bb\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00c6\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00d2\b\t\n\t\f\t\u00d5\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u00da\b\t\n\t\f\t\u00dd\t\t\u0001\t\u0001\t\u0003"+
		"\t\u00e1\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00ec\b\n\n\n\f\n\u00ef\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0005\n\u00f4\b\n\n\n\f\n\u00f7\t\n\u0001\n\u0001\n\u0001\n\u0005\n\u00fc"+
		"\b\n\n\n\f\n\u00ff\t\n\u0001\n\u0001\n\u0001\n\u0005\n\u0104\b\n\n\n\f"+
		"\n\u0107\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0112\b\u000b\u0001\f\u0005\f\u0115"+
		"\b\f\n\f\f\f\u0118\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0125\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0133\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0141\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u014a\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0153\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0159\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0167\b\u0012\n\u0012\f\u0012\u016a"+
		"\t\u0012\u0001\u0012\u0003\u0012\u016d\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0178\b\u0013\u0005\u0013\u017a\b\u0013\n\u0013"+
		"\f\u0013\u017d\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u018b\b\u0014\u0005\u0014\u018d\b"+
		"\u0014\n\u0014\f\u0014\u0190\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0199\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u019f\b\u0015"+
		"\u0003\u0015\u01a1\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u01a6\b\u0015\n\u0015\f\u0015\u01a9\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01b0\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01b8"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01c0\b\u0016\u0003\u0016\u01c2\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01ce\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01db\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01e1\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01ed\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01f3\b\u001c"+
		"\n\u001c\f\u001c\u01f6\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01fb\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0005!\u020c\b!\n!\f!\u020f\t!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0005#\u0221\b#\n#\f#\u0224\t#\u0003#\u0226\b#\u0001$\u0001"+
		"$\u0003$\u022a\b$\u0001$\u0001$\u0001$\u0003$\u022f\b$\u0005$\u0231\b"+
		"$\n$\f$\u0234\t$\u0003$\u0236\b$\u0001$\u0000\u0000%\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFH\u0000\b\u0001\u000045\u0001\u000023\u0002\u0000\u0003"+
		"\u0003\u0005\u0005\u0002\u00002245\u0001\u0000%&\u0001\u0000\u0016\u0019"+
		"\u0001\u0000!$\u0001\u000015\u027f\u0000J\u0001\u0000\u0000\u0000\u0002"+
		"d\u0001\u0000\u0000\u0000\u0004h\u0001\u0000\u0000\u0000\u0006n\u0001"+
		"\u0000\u0000\u0000\bt\u0001\u0000\u0000\u0000\n\u0080\u0001\u0000\u0000"+
		"\u0000\f\u009a\u0001\u0000\u0000\u0000\u000e\u00c5\u0001\u0000\u0000\u0000"+
		"\u0010\u00c7\u0001\u0000\u0000\u0000\u0012\u00cc\u0001\u0000\u0000\u0000"+
		"\u0014\u00e6\u0001\u0000\u0000\u0000\u0016\u0111\u0001\u0000\u0000\u0000"+
		"\u0018\u0116\u0001\u0000\u0000\u0000\u001a\u0119\u0001\u0000\u0000\u0000"+
		"\u001c\u0128\u0001\u0000\u0000\u0000\u001e\u0136\u0001\u0000\u0000\u0000"+
		" \u0144\u0001\u0000\u0000\u0000\"\u014d\u0001\u0000\u0000\u0000$\u015c"+
		"\u0001\u0000\u0000\u0000&\u016e\u0001\u0000\u0000\u0000(\u0181\u0001\u0000"+
		"\u0000\u0000*\u0194\u0001\u0000\u0000\u0000,\u01ac\u0001\u0000\u0000\u0000"+
		".\u01cd\u0001\u0000\u0000\u00000\u01da\u0001\u0000\u0000\u00002\u01dc"+
		"\u0001\u0000\u0000\u00004\u01e2\u0001\u0000\u0000\u00006\u01ec\u0001\u0000"+
		"\u0000\u00008\u01ee\u0001\u0000\u0000\u0000:\u01fa\u0001\u0000\u0000\u0000"+
		"<\u01fc\u0001\u0000\u0000\u0000>\u0200\u0001\u0000\u0000\u0000@\u0202"+
		"\u0001\u0000\u0000\u0000B\u0204\u0001\u0000\u0000\u0000D\u0218\u0001\u0000"+
		"\u0000\u0000F\u0225\u0001\u0000\u0000\u0000H\u0235\u0001\u0000\u0000\u0000"+
		"JK\u0005\u0006\u0000\u0000KL\u00052\u0000\u0000LP\u00050\u0000\u0000M"+
		"O\u0003\u0002\u0001\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\b\u0000\u0000TU\u0003\u0018"+
		"\f\u0000UV\u0005\n\u0000\u0000V\u0001\u0001\u0000\u0000\u0000WY\u0005"+
		"\u000b\u0000\u0000XZ\u0003\u000e\u0007\u0000YX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\e\u0001\u0000\u0000\u0000]_\u0005\f\u0000\u0000^`\u0003\u0016"+
		"\u000b\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ce\u0003B!\u0000dW\u0001\u0000\u0000\u0000d]\u0001\u0000\u0000\u0000d"+
		"c\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000g\u0003\u0001\u0000\u0000\u0000hi\u0005"+
		"\u0002\u0000\u0000ij\u0005,\u0000\u0000jk\u00052\u0000\u0000kl\u0005-"+
		"\u0000\u0000lm\u00050\u0000\u0000m\u0005\u0001\u0000\u0000\u0000no\u0005"+
		"\u0001\u0000\u0000op\u0005,\u0000\u0000pq\u00052\u0000\u0000qr\u0005-"+
		"\u0000\u0000rs\u00050\u0000\u0000s\u0007\u0001\u0000\u0000\u0000ty\u0005"+
		"2\u0000\u0000uv\u0005\u000e\u0000\u0000vx\u00052\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"|}\u0005)\u0000\u0000}~\u0005\'\u0000\u0000~\u007f\u00050\u0000\u0000"+
		"\u007f\t\u0001\u0000\u0000\u0000\u0080\u0081\u00052\u0000\u0000\u0081"+
		"\u0082\u0005)\u0000\u0000\u0082\u0094\u0005\u0013\u0000\u0000\u0083\u0087"+
		"\u0005.\u0000\u0000\u0084\u0086\u0005\u0017\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"3\u0000\u0000\u008b\u008f\u0005*\u0000\u0000\u008c\u008e\u0005\u0017\u0000"+
		"\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u00053\u0000\u0000\u0093\u0095\u0005/\u0000\u0000\u0094"+
		"\u0083\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0004\u0000\u0000\u0097"+
		"\u0098\u0005\'\u0000\u0000\u0098\u0099\u00050\u0000\u0000\u0099\u000b"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u00052\u0000\u0000\u009b\u009c\u0005"+
		")\u0000\u0000\u009c\u009d\u0005\u0013\u0000\u0000\u009d\u00a1\u0005.\u0000"+
		"\u0000\u009e\u00a0\u0005\u0017\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u00053\u0000\u0000"+
		"\u00a5\u00a9\u0005*\u0000\u0000\u00a6\u00a8\u0005\u0017\u0000\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u00053\u0000\u0000\u00ad\u00b1\u0005\u000e\u0000\u0000\u00ae\u00b0"+
		"\u0005\u0017\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u00053\u0000\u0000\u00b5\u00b9\u0005"+
		"*\u0000\u0000\u00b6\u00b8\u0005\u0017\u0000\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u00053\u0000"+
		"\u0000\u00bd\u00be\u0005/\u0000\u0000\u00be\u00bf\u0005\u0004\u0000\u0000"+
		"\u00bf\u00c0\u0005\'\u0000\u0000\u00c0\u00c1\u00050\u0000\u0000\u00c1"+
		"\r\u0001\u0000\u0000\u0000\u00c2\u00c6\u0003\b\u0004\u0000\u00c3\u00c6"+
		"\u0003\n\u0005\u0000\u00c4\u00c6\u0003\f\u0006\u0000\u00c5\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u000f\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"2\u0000\u0000\u00c8\u00c9\u0005%\u0000\u0000\u00c9\u00ca\u0007\u0000\u0000"+
		"\u0000\u00ca\u00cb\u00050\u0000\u0000\u00cb\u0011\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u00052\u0000\u0000\u00cd\u00ce\u0005)\u0000\u0000\u00ce\u00e0"+
		"\u0005\u0013\u0000\u0000\u00cf\u00d3\u0005.\u0000\u0000\u00d0\u00d2\u0005"+
		"\u0017\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u00053\u0000\u0000\u00d7\u00db\u0005*\u0000"+
		"\u0000\u00d8\u00da\u0005\u0017\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u00053\u0000\u0000"+
		"\u00df\u00e1\u0005/\u0000\u0000\u00e0\u00cf\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0005\u0004\u0000\u0000\u00e3\u00e4\u0005\'\u0000\u0000\u00e4\u00e5"+
		"\u00050\u0000\u0000\u00e5\u0013\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"2\u0000\u0000\u00e7\u00e8\u0005)\u0000\u0000\u00e8\u00e9\u0005\u0013\u0000"+
		"\u0000\u00e9\u00ed\u0005.\u0000\u0000\u00ea\u00ec\u0005\u0017\u0000\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u00053\u0000\u0000\u00f1\u00f5\u0005*\u0000\u0000\u00f2\u00f4"+
		"\u0005\u0017\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u00053\u0000\u0000\u00f9\u00fd\u0005"+
		"\u000e\u0000\u0000\u00fa\u00fc\u0005\u0017\u0000\u0000\u00fb\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"3\u0000\u0000\u0101\u0105\u0005*\u0000\u0000\u0102\u0104\u0005\u0017\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u00053\u0000\u0000\u0109\u010a\u0005/\u0000\u0000\u010a"+
		"\u010b\u0005\u0004\u0000\u0000\u010b\u010c\u0005\'\u0000\u0000\u010c\u010d"+
		"\u00050\u0000\u0000\u010d\u0015\u0001\u0000\u0000\u0000\u010e\u0112\u0003"+
		"\u0010\b\u0000\u010f\u0112\u0003\u0012\t\u0000\u0110\u0112\u0003\u0014"+
		"\n\u0000\u0111\u010e\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0017\u0001\u0000\u0000"+
		"\u0000\u0113\u0115\u0003.\u0017\u0000\u0114\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0019\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u00052\u0000\u0000\u011a"+
		"\u0124\u0005(\u0000\u0000\u011b\u0125\u00052\u0000\u0000\u011c\u0125\u0005"+
		"3\u0000\u0000\u011d\u0125\u00054\u0000\u0000\u011e\u0125\u00055\u0000"+
		"\u0000\u011f\u0125\u00051\u0000\u0000\u0120\u0125\u00038\u001c\u0000\u0121"+
		"\u0125\u0003 \u0010\u0000\u0122\u0125\u0003\"\u0011\u0000\u0123\u0125"+
		"\u0003D\"\u0000\u0124\u011b\u0001\u0000\u0000\u0000\u0124\u011c\u0001"+
		"\u0000\u0000\u0000\u0124\u011d\u0001\u0000\u0000\u0000\u0124\u011e\u0001"+
		"\u0000\u0000\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0120\u0001"+
		"\u0000\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u00050\u0000\u0000\u0127\u001b\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0003 \u0010\u0000\u0129\u0132\u0005(\u0000\u0000"+
		"\u012a\u0133\u00052\u0000\u0000\u012b\u0133\u00053\u0000\u0000\u012c\u0133"+
		"\u00054\u0000\u0000\u012d\u0133\u00055\u0000\u0000\u012e\u0133\u00038"+
		"\u001c\u0000\u012f\u0133\u0003 \u0010\u0000\u0130\u0133\u0003\"\u0011"+
		"\u0000\u0131\u0133\u0003D\"\u0000\u0132\u012a\u0001\u0000\u0000\u0000"+
		"\u0132\u012b\u0001\u0000\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000"+
		"\u0132\u012d\u0001\u0000\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000"+
		"\u0132\u012f\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u00050\u0000\u0000\u0135\u001d\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0003\"\u0011\u0000\u0137\u0140\u0005(\u0000\u0000\u0138\u0141"+
		"\u00052\u0000\u0000\u0139\u0141\u00053\u0000\u0000\u013a\u0141\u00054"+
		"\u0000\u0000\u013b\u0141\u00055\u0000\u0000\u013c\u0141\u00038\u001c\u0000"+
		"\u013d\u0141\u0003 \u0010\u0000\u013e\u0141\u0003\"\u0011\u0000\u013f"+
		"\u0141\u0003D\"\u0000\u0140\u0138\u0001\u0000\u0000\u0000\u0140\u0139"+
		"\u0001\u0000\u0000\u0000\u0140\u013a\u0001\u0000\u0000\u0000\u0140\u013b"+
		"\u0001\u0000\u0000\u0000\u0140\u013c\u0001\u0000\u0000\u0000\u0140\u013d"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u00050\u0000\u0000\u0143\u001f\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"2\u0000\u0000\u0145\u0149\u0005.\u0000\u0000\u0146\u014a\u00038\u001c"+
		"\u0000\u0147\u014a\u00053\u0000\u0000\u0148\u014a\u00052\u0000\u0000\u0149"+
		"\u0146\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149"+
		"\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0005/\u0000\u0000\u014c!\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		"2\u0000\u0000\u014e\u0152\u0005.\u0000\u0000\u014f\u0153\u00038\u001c"+
		"\u0000\u0150\u0153\u00053\u0000\u0000\u0151\u0153\u00052\u0000\u0000\u0152"+
		"\u014f\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154"+
		"\u0158\u0005\u000e\u0000\u0000\u0155\u0159\u00038\u001c\u0000\u0156\u0159"+
		"\u00053\u0000\u0000\u0157\u0159\u00052\u0000\u0000\u0158\u0155\u0001\u0000"+
		"\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0157\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0005/\u0000"+
		"\u0000\u015b#\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u000f\u0000\u0000"+
		"\u015d\u015e\u00052\u0000\u0000\u015e\u015f\u0005(\u0000\u0000\u015f\u0160"+
		"\u0007\u0001\u0000\u0000\u0160\u0161\u0007\u0002\u0000\u0000\u0161\u0162"+
		"\u0007\u0001\u0000\u0000\u0162\u016c\u0005\u0012\u0000\u0000\u0163\u016d"+
		"\u00030\u0018\u0000\u0164\u0168\u0005\b\u0000\u0000\u0165\u0167\u0003"+
		"0\u0018\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000"+
		"\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000"+
		"\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000"+
		"\u0000\u0000\u016b\u016d\u0005\t\u0000\u0000\u016c\u0163\u0001\u0000\u0000"+
		"\u0000\u016c\u0164\u0001\u0000\u0000\u0000\u016d%\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0005\u0014\u0000\u0000\u016f\u0170\u0005,\u0000\u0000\u0170"+
		"\u017b\u0007\u0003\u0000\u0000\u0171\u0177\u0005\u000e\u0000\u0000\u0172"+
		"\u0178\u00052\u0000\u0000\u0173\u0178\u00054\u0000\u0000\u0174\u0178\u0005"+
		"5\u0000\u0000\u0175\u0178\u0003 \u0010\u0000\u0176\u0178\u0003\"\u0011"+
		"\u0000\u0177\u0172\u0001\u0000\u0000\u0000\u0177\u0173\u0001\u0000\u0000"+
		"\u0000\u0177\u0174\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000"+
		"\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000"+
		"\u0000\u0179\u0171\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000"+
		"\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000"+
		"\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0005-\u0000\u0000\u017f\u0180\u00050\u0000\u0000\u0180"+
		"\'\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u0015\u0000\u0000\u0182\u0183"+
		"\u0005,\u0000\u0000\u0183\u018e\u0007\u0003\u0000\u0000\u0184\u018a\u0005"+
		"\u000e\u0000\u0000\u0185\u018b\u00052\u0000\u0000\u0186\u018b\u00054\u0000"+
		"\u0000\u0187\u018b\u00055\u0000\u0000\u0188\u018b\u0003 \u0010\u0000\u0189"+
		"\u018b\u0003\"\u0011\u0000\u018a\u0185\u0001\u0000\u0000\u0000\u018a\u0186"+
		"\u0001\u0000\u0000\u0000\u018a\u0187\u0001\u0000\u0000\u0000\u018a\u0188"+
		"\u0001\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018d"+
		"\u0001\u0000\u0000\u0000\u018c\u0184\u0001\u0000\u0000\u0000\u018d\u0190"+
		"\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0001\u0000\u0000\u0000\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u018e"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0005-\u0000\u0000\u0192\u0193\u0005"+
		"0\u0000\u0000\u0193)\u0001\u0000\u0000\u0000\u0194\u01a0\u0005\u0010\u0000"+
		"\u0000\u0195\u0198\u0005,\u0000\u0000\u0196\u0199\u00032\u0019\u0000\u0197"+
		"\u0199\u00034\u001a\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0197"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0005-\u0000\u0000\u019b\u01a1\u0001\u0000\u0000\u0000\u019c\u019f\u0003"+
		"2\u0019\u0000\u019d\u019f\u00034\u001a\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a0\u0195\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u0012\u0000"+
		"\u0000\u01a3\u01a7\u0005\b\u0000\u0000\u01a4\u01a6\u00030\u0018\u0000"+
		"\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0005\t\u0000\u0000\u01ab+\u0001\u0000\u0000\u0000\u01ac"+
		"\u01af\u0005\u001b\u0000\u0000\u01ad\u01b0\u00032\u0019\u0000\u01ae\u01b0"+
		"\u00034\u001a\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b7\u0005"+
		"\u001c\u0000\u0000\u01b2\u01b8\u0003.\u0017\u0000\u01b3\u01b4\u0005\b"+
		"\u0000\u0000\u01b4\u01b5\u0003\u0018\f\u0000\u01b5\u01b6\u0005\t\u0000"+
		"\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b3\u0001\u0000\u0000\u0000\u01b8\u01c1\u0001\u0000\u0000"+
		"\u0000\u01b9\u01bf\u0005\u001a\u0000\u0000\u01ba\u01c0\u0003.\u0017\u0000"+
		"\u01bb\u01bc\u0005\b\u0000\u0000\u01bc\u01bd\u0003\u0018\f\u0000\u01bd"+
		"\u01be\u0005\t\u0000\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bf\u01bb\u0001\u0000\u0000\u0000\u01c0\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c1\u01b9\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2-\u0001\u0000\u0000\u0000\u01c3\u01ce\u0003"+
		"\u001a\r\u0000\u01c4\u01ce\u0003\u001c\u000e\u0000\u01c5\u01ce\u0003\u001e"+
		"\u000f\u0000\u01c6\u01ce\u0003$\u0012\u0000\u01c7\u01ce\u0003&\u0013\u0000"+
		"\u01c8\u01ce\u0003(\u0014\u0000\u01c9\u01ce\u0003*\u0015\u0000\u01ca\u01ce"+
		"\u0003,\u0016\u0000\u01cb\u01ce\u0003\u0004\u0002\u0000\u01cc\u01ce\u0003"+
		"\u0006\u0003\u0000\u01cd\u01c3\u0001\u0000\u0000\u0000\u01cd\u01c4\u0001"+
		"\u0000\u0000\u0000\u01cd\u01c5\u0001\u0000\u0000\u0000\u01cd\u01c6\u0001"+
		"\u0000\u0000\u0000\u01cd\u01c7\u0001\u0000\u0000\u0000\u01cd\u01c8\u0001"+
		"\u0000\u0000\u0000\u01cd\u01c9\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ce/\u0001\u0000\u0000\u0000\u01cf\u01db\u0003\u0002"+
		"\u0001\u0000\u01d0\u01db\u0003\u001a\r\u0000\u01d1\u01db\u0003\u001c\u000e"+
		"\u0000\u01d2\u01db\u0003\u001e\u000f\u0000\u01d3\u01db\u0003$\u0012\u0000"+
		"\u01d4\u01db\u0003&\u0013\u0000\u01d5\u01db\u0003(\u0014\u0000\u01d6\u01db"+
		"\u0003*\u0015\u0000\u01d7\u01db\u0003,\u0016\u0000\u01d8\u01db\u0003\u0004"+
		"\u0002\u0000\u01d9\u01db\u0003\u0006\u0003\u0000\u01da\u01cf\u0001\u0000"+
		"\u0000\u0000\u01da\u01d0\u0001\u0000\u0000\u0000\u01da\u01d1\u0001\u0000"+
		"\u0000\u0000\u01da\u01d2\u0001\u0000\u0000\u0000\u01da\u01d3\u0001\u0000"+
		"\u0000\u0000\u01da\u01d4\u0001\u0000\u0000\u0000\u01da\u01d5\u0001\u0000"+
		"\u0000\u0000\u01da\u01d6\u0001\u0000\u0000\u0000\u01da\u01d7\u0001\u0000"+
		"\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01d9\u0001\u0000"+
		"\u0000\u0000\u01db1\u0001\u0000\u0000\u0000\u01dc\u01e0\u00038\u001c\u0000"+
		"\u01dd\u01de\u0003@ \u0000\u01de\u01df\u00038\u001c\u0000\u01df\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e0\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e13\u0001\u0000\u0000\u0000\u01e2\u01e3\u0003"+
		"6\u001b\u0000\u01e3\u01e4\u0007\u0004\u0000\u0000\u01e4\u01e5\u00036\u001b"+
		"\u0000\u01e55\u0001\u0000\u0000\u0000\u01e6\u01ed\u00052\u0000\u0000\u01e7"+
		"\u01ed\u00054\u0000\u0000\u01e8\u01ed\u00055\u0000\u0000\u01e9\u01ed\u0005"+
		"3\u0000\u0000\u01ea\u01ed\u00051\u0000\u0000\u01eb\u01ed\u00038\u001c"+
		"\u0000\u01ec\u01e6\u0001\u0000\u0000\u0000\u01ec\u01e7\u0001\u0000\u0000"+
		"\u0000\u01ec\u01e8\u0001\u0000\u0000\u0000\u01ec\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ed7\u0001\u0000\u0000\u0000\u01ee\u01f4\u0003:\u001d\u0000\u01ef"+
		"\u01f0\u0003>\u001f\u0000\u01f0\u01f1\u0003:\u001d\u0000\u01f1\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f2\u01ef\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f59\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f7\u01fb\u00052\u0000\u0000\u01f8\u01fb\u00053\u0000\u0000"+
		"\u01f9\u01fb\u0003<\u001e\u0000\u01fa\u01f7\u0001\u0000\u0000\u0000\u01fa"+
		"\u01f8\u0001\u0000\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb"+
		";\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005,\u0000\u0000\u01fd\u01fe\u0003"+
		"8\u001c\u0000\u01fe\u01ff\u0005-\u0000\u0000\u01ff=\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0007\u0005\u0000\u0000\u0201?\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0007\u0006\u0000\u0000\u0203A\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u0005 \u0000\u0000\u0205\u0206\u00052\u0000\u0000\u0206\u020d\u0005"+
		",\u0000\u0000\u0207\u0208\u0003F#\u0000\u0208\u0209\u0005)\u0000\u0000"+
		"\u0209\u020a\u0005\'\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b"+
		"\u0207\u0001\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d"+
		"\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e"+
		"\u0210\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0005-\u0000\u0000\u0211\u0212\u0005)\u0000\u0000\u0212\u0213\u0005"+
		"\'\u0000\u0000\u0213\u0214\u00050\u0000\u0000\u0214\u0215\u0005\b\u0000"+
		"\u0000\u0215\u0216\u0003\u0018\f\u0000\u0216\u0217\u0005\t\u0000\u0000"+
		"\u0217C\u0001\u0000\u0000\u0000\u0218\u0219\u00052\u0000\u0000\u0219\u021a"+
		"\u0005,\u0000\u0000\u021a\u021b\u0003H$\u0000\u021b\u021c\u0005-\u0000"+
		"\u0000\u021cE\u0001\u0000\u0000\u0000\u021d\u0222\u00052\u0000\u0000\u021e"+
		"\u021f\u0005\u000e\u0000\u0000\u021f\u0221\u00052\u0000\u0000\u0220\u021e"+
		"\u0001\u0000\u0000\u0000\u0221\u0224\u0001\u0000\u0000\u0000\u0222\u0220"+
		"\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0226"+
		"\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0225\u021d"+
		"\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226G\u0001"+
		"\u0000\u0000\u0000\u0227\u022a\u0007\u0007\u0000\u0000\u0228\u022a\u0003"+
		"8\u001c\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u0228\u0001\u0000"+
		"\u0000\u0000\u022a\u0232\u0001\u0000\u0000\u0000\u022b\u022e\u0005\u000e"+
		"\u0000\u0000\u022c\u022f\u0007\u0007\u0000\u0000\u022d\u022f\u00038\u001c"+
		"\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022d\u0001\u0000\u0000"+
		"\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022b\u0001\u0000\u0000"+
		"\u0000\u0231\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000"+
		"\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0236\u0001\u0000\u0000"+
		"\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0235\u0229\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236I\u0001\u0000\u0000\u0000"+
		"8P[adfy\u0087\u008f\u0094\u00a1\u00a9\u00b1\u00b9\u00c5\u00d3\u00db\u00e0"+
		"\u00ed\u00f5\u00fd\u0105\u0111\u0116\u0124\u0132\u0140\u0149\u0152\u0158"+
		"\u0168\u016c\u0177\u017b\u018a\u018e\u0198\u019e\u01a0\u01a7\u01af\u01b7"+
		"\u01bf\u01c1\u01cd\u01da\u01e0\u01ec\u01f4\u01fa\u020d\u0222\u0225\u0229"+
		"\u022e\u0232\u0235";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}