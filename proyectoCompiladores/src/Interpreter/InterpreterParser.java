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
		END=9, ENDP=10, VAR=11, CONST=12, PRINTLN=13, COMMA=14, FOR=15, WHILE=16, 
		COMMENT=17, DO=18, ARRAY=19, WRITELN=20, WRITE=21, PLUS=22, MINUS=23, 
		MULT=24, DIV=25, ELSE=26, IF=27, THEN=28, AND=29, OR=30, NOT=31, FUNCTION=32, 
		GREATER_THAN=33, LESS_THAN=34, GREATER_THAN_OR_EQUALS=35, LESS_THAN_OR_EQUALS=36, 
		EQUALS=37, NOT_EQUALS=38, TYPE=39, ASSIGN=40, COLON=41, DOTDOT=42, POINT=43, 
		OPEN_PARENTHESIS=44, CLOSE_PARENTHESIS=45, OPEN_BRACKET=46, CLOSE_BRACKET=47, 
		SEMICOLON=48, BOOLEANVALUE=49, ID=50, NUMBER=51, TEXT=52, CHAR=53, TEXTWRITE=54, 
		WS=55, STRING=56;
	public static final int
		RULE_program = 0, RULE_endprogram = 1, RULE_declarations = 2, RULE_read_call = 3, 
		RULE_readln_call = 4, RULE_variable_declaration = 5, RULE_array_declaration = 6, 
		RULE_array_range = 7, RULE_arraybi_declaration = 8, RULE_var_variables = 9, 
		RULE_const_variable_declaration = 10, RULE_const_variables = 11, RULE_statements = 12, 
		RULE_variable_init = 13, RULE_array_init = 14, RULE_arrayBi_init = 15, 
		RULE_array_access = 16, RULE_index = 17, RULE_arrayBi_access = 18, RULE_for_loop = 19, 
		RULE_forIndexValue = 20, RULE_forIndexLimit = 21, RULE_writeln_stmt = 22, 
		RULE_write_contain = 23, RULE_write = 24, RULE_while_loop = 25, RULE_if_statement = 26, 
		RULE_else_statement = 27, RULE_if_statement2 = 28, RULE_statement = 29, 
		RULE_statement_bucle = 30, RULE_expression = 31, RULE_comparison = 32, 
		RULE_terms = 33, RULE_simple_expression = 34, RULE_factor = 35, RULE_operacones_parentesis = 36, 
		RULE_operaciones_simples = 37, RULE_operaciones = 38, RULE_function_declaration = 39, 
		RULE_statement_function = 40, RULE_function_Call = 41, RULE_parameters_declaration = 42, 
		RULE_parameter_init = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "endprogram", "declarations", "read_call", "readln_call", 
			"variable_declaration", "array_declaration", "array_range", "arraybi_declaration", 
			"var_variables", "const_variable_declaration", "const_variables", "statements", 
			"variable_init", "array_init", "arrayBi_init", "array_access", "index", 
			"arrayBi_access", "for_loop", "forIndexValue", "forIndexLimit", "writeln_stmt", 
			"write_contain", "write", "while_loop", "if_statement", "else_statement", 
			"if_statement2", "statement", "statement_bucle", "expression", "comparison", 
			"terms", "simple_expression", "factor", "operacones_parentesis", "operaciones_simples", 
			"operaciones", "function_declaration", "statement_function", "function_Call", 
			"parameters_declaration", "parameter_init"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'readln'", "'read'", "'to'", "'of'", "'downto'", "'program'", 
			"'procedure'", "'begin'", "'end;'", "'end'", "'var'", "'const'", "'println'", 
			"','", "'for'", "'while'", null, "'do'", "'array'", "'writeln'", "'write'", 
			"'+'", "'-'", null, null, "'else'", "'if'", "'then'", "'and'", "'or'", 
			"'not'", "'function'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", null, 
			"':='", "':'", "'..'", "'.'", "'('", "')'", "'['", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "READLN", "READ", "TO", "OF", "DOWNTO", "PROGRAM", "PROCEDURE", 
			"BEGIN", "END", "ENDP", "VAR", "CONST", "PRINTLN", "COMMA", "FOR", "WHILE", 
			"COMMENT", "DO", "ARRAY", "WRITELN", "WRITE", "PLUS", "MINUS", "MULT", 
			"DIV", "ELSE", "IF", "THEN", "AND", "OR", "NOT", "FUNCTION", "GREATER_THAN", 
			"LESS_THAN", "GREATER_THAN_OR_EQUALS", "LESS_THAN_OR_EQUALS", "EQUALS", 
			"NOT_EQUALS", "TYPE", "ASSIGN", "COLON", "DOTDOT", "POINT", "OPEN_PARENTHESIS", 
			"CLOSE_PARENTHESIS", "OPEN_BRACKET", "CLOSE_BRACKET", "SEMICOLON", "BOOLEANVALUE", 
			"ID", "NUMBER", "TEXT", "CHAR", "TEXTWRITE", "WS", "STRING"
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
		public EndprogramContext endprogram() {
			return getRuleContext(EndprogramContext.class,0);
		}
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
			setState(88);
			match(PROGRAM);
			setState(89);
			match(ID);
			setState(90);
			match(SEMICOLON);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294973440L) != 0)) {
				{
				{
				setState(91);
				declarations();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(BEGIN);
			setState(98);
			statements();
			setState(99);
			endprogram();
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
	public static class EndprogramContext extends ParserRuleContext {
		public TerminalNode ENDP() { return getToken(InterpreterParser.ENDP, 0); }
		public TerminalNode POINT() { return getToken(InterpreterParser.POINT, 0); }
		public EndprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endprogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterEndprogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitEndprogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitEndprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndprogramContext endprogram() throws RecognitionException {
		EndprogramContext _localctx = new EndprogramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_endprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ENDP);
			setState(102);
			match(POINT);
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
		enterRule(_localctx, 4, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(117);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
						{
						setState(104);
						match(VAR);
						setState(106); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(105);
								var_variables();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(108); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case CONST:
						{
						setState(110);
						match(CONST);
						setState(112); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(111);
								const_variables();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(114); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case FUNCTION:
						{
						setState(116);
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
				setState(119); 
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
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_read_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(READ);
			setState(122);
			match(OPEN_PARENTHESIS);
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(123);
				match(ID);
				}
				break;
			case 2:
				{
				setState(124);
				array_access();
				}
				break;
			case 3:
				{
				setState(125);
				arrayBi_access();
				}
				break;
			}
			setState(128);
			match(CLOSE_PARENTHESIS);
			setState(129);
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
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_readln_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(READLN);
			setState(132);
			match(OPEN_PARENTHESIS);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(133);
				match(ID);
				}
				break;
			case 2:
				{
				setState(134);
				array_access();
				}
				break;
			case 3:
				{
				setState(135);
				arrayBi_access();
				}
				break;
			}
			setState(138);
			match(CLOSE_PARENTHESIS);
			setState(139);
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
		enterRule(_localctx, 10, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				match(ID);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(COLON);
			setState(150);
			match(TYPE);
			setState(151);
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
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public Array_rangeContext array_range() {
			return getRuleContext(Array_rangeContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public TerminalNode OF() { return getToken(InterpreterParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 12, RULE_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ID);
			setState(154);
			match(COLON);
			setState(155);
			match(ARRAY);
			setState(156);
			match(OPEN_BRACKET);
			setState(157);
			array_range();
			setState(158);
			match(CLOSE_BRACKET);
			setState(159);
			match(OF);
			setState(160);
			match(TYPE);
			setState(161);
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
	public static class Array_rangeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(InterpreterParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(InterpreterParser.NUMBER, i);
		}
		public TerminalNode DOTDOT() { return getToken(InterpreterParser.DOTDOT, 0); }
		public Array_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterArray_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitArray_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitArray_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_rangeContext array_range() throws RecognitionException {
		Array_rangeContext _localctx = new Array_rangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(NUMBER);
			setState(164);
			match(DOTDOT);
			setState(165);
			match(NUMBER);
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
		public List<Array_rangeContext> array_range() {
			return getRuleContexts(Array_rangeContext.class);
		}
		public Array_rangeContext array_range(int i) {
			return getRuleContext(Array_rangeContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(InterpreterParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
		public TerminalNode OF() { return getToken(InterpreterParser.OF, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 16, RULE_arraybi_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(COLON);
			setState(169);
			match(ARRAY);
			setState(170);
			match(OPEN_BRACKET);
			setState(171);
			array_range();
			setState(172);
			match(COMMA);
			setState(173);
			array_range();
			setState(174);
			match(CLOSE_BRACKET);
			setState(175);
			match(OF);
			setState(176);
			match(TYPE);
			setState(177);
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
		enterRule(_localctx, 18, RULE_var_variables);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				array_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
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
		enterRule(_localctx, 20, RULE_const_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(185);
			match(EQUALS);
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(187);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			const_variable_declaration();
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
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
				{
				{
				setState(191);
				statement();
				}
				}
				setState(196);
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
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
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
			setState(197);
			match(ID);
			setState(198);
			match(ASSIGN);
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(199);
				match(ID);
				}
				break;
			case 2:
				{
				setState(200);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(201);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(202);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(203);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(204);
				array_access();
				}
				break;
			case 7:
				{
				setState(205);
				arrayBi_access();
				}
				break;
			case 8:
				{
				setState(206);
				simple_expression();
				}
				break;
			case 9:
				{
				setState(207);
				function_Call();
				}
				break;
			}
			setState(210);
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
		public TerminalNode BOOLEANVALUE() { return getToken(InterpreterParser.BOOLEANVALUE, 0); }
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
			setState(212);
			array_access();
			setState(213);
			match(ASSIGN);
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(214);
				match(ID);
				}
				break;
			case 2:
				{
				setState(215);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(216);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(217);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(218);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(219);
				simple_expression();
				}
				break;
			case 7:
				{
				setState(220);
				array_access();
				}
				break;
			case 8:
				{
				setState(221);
				arrayBi_access();
				}
				break;
			case 9:
				{
				setState(222);
				function_Call();
				}
				break;
			}
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
		public TerminalNode BOOLEANVALUE() { return getToken(InterpreterParser.BOOLEANVALUE, 0); }
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
			setState(227);
			arrayBi_access();
			setState(228);
			match(ASSIGN);
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(229);
				match(ID);
				}
				break;
			case 2:
				{
				setState(230);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(231);
				match(TEXT);
				}
				break;
			case 4:
				{
				setState(232);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(233);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(234);
				simple_expression();
				}
				break;
			case 7:
				{
				setState(235);
				array_access();
				}
				break;
			case 8:
				{
				setState(236);
				arrayBi_access();
				}
				break;
			case 9:
				{
				setState(237);
				function_Call();
				}
				break;
			}
			setState(240);
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
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
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
			setState(242);
			match(ID);
			setState(243);
			match(OPEN_BRACKET);
			setState(244);
			index();
			setState(245);
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
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
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
	public static class ArrayBi_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(InterpreterParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(InterpreterParser.CLOSE_BRACKET, 0); }
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
		enterRule(_localctx, 36, RULE_arrayBi_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			setState(250);
			match(OPEN_BRACKET);
			setState(251);
			index();
			setState(252);
			match(COMMA);
			setState(253);
			index();
			setState(254);
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
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public ForIndexValueContext forIndexValue() {
			return getRuleContext(ForIndexValueContext.class,0);
		}
		public ForIndexLimitContext forIndexLimit() {
			return getRuleContext(ForIndexLimitContext.class,0);
		}
		public TerminalNode DO() { return getToken(InterpreterParser.DO, 0); }
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
		enterRule(_localctx, 38, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FOR);
			setState(257);
			match(ID);
			setState(258);
			match(ASSIGN);
			setState(259);
			forIndexValue();
			setState(260);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(261);
			forIndexLimit();
			setState(262);
			match(DO);
			setState(272);
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
				setState(263);
				statement_bucle();
				}
				break;
			case BEGIN:
				{
				setState(264);
				match(BEGIN);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125904339277830L) != 0)) {
					{
					{
					setState(265);
					statement_bucle();
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
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
	public static class ForIndexValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public ForIndexValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIndexValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterForIndexValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitForIndexValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitForIndexValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIndexValueContext forIndexValue() throws RecognitionException {
		ForIndexValueContext _localctx = new ForIndexValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forIndexValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
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
	public static class ForIndexLimitContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public ForIndexLimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIndexLimit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterForIndexLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitForIndexLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitForIndexLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIndexLimitContext forIndexLimit() throws RecognitionException {
		ForIndexLimitContext _localctx = new ForIndexLimitContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forIndexLimit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
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
	public static class Writeln_stmtContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(InterpreterParser.WRITELN, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public List<Write_containContext> write_contain() {
			return getRuleContexts(Write_containContext.class);
		}
		public Write_containContext write_contain(int i) {
			return getRuleContext(Write_containContext.class,i);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
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
		enterRule(_localctx, 44, RULE_writeln_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(WRITELN);
			setState(279);
			match(OPEN_PARENTHESIS);
			setState(280);
			write_contain();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				write_contain();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(CLOSE_PARENTHESIS);
			setState(289);
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
	public static class Write_containContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode TEXTWRITE() { return getToken(InterpreterParser.TEXTWRITE, 0); }
		public TerminalNode CHAR() { return getToken(InterpreterParser.CHAR, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Write_containContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_contain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterWrite_contain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitWrite_contain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitWrite_contain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_containContext write_contain() throws RecognitionException {
		Write_containContext _localctx = new Write_containContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write_contain);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(TEXTWRITE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				array_access();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				arrayBi_access();
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
	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(InterpreterParser.WRITE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public List<Write_containContext> write_contain() {
			return getRuleContexts(Write_containContext.class);
		}
		public Write_containContext write_contain(int i) {
			return getRuleContext(Write_containContext.class,i);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
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
		enterRule(_localctx, 48, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(WRITE);
			setState(299);
			match(OPEN_PARENTHESIS);
			setState(300);
			write_contain();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(301);
				match(COMMA);
				setState(302);
				write_contain();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(CLOSE_PARENTHESIS);
			setState(309);
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
		enterRule(_localctx, 50, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(WHILE);
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(312);
				match(OPEN_PARENTHESIS);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(313);
					expression();
					}
					break;
				case 2:
					{
					setState(314);
					comparison();
					}
					break;
				}
				setState(317);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case 2:
				{
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(319);
					expression();
					}
					break;
				case 2:
					{
					setState(320);
					comparison();
					}
					break;
				}
				}
				break;
			}
			setState(325);
			match(DO);
			setState(326);
			match(BEGIN);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125904339277830L) != 0)) {
				{
				{
				setState(327);
				statement_bucle();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
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
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode THEN() { return getToken(InterpreterParser.THEN, 0); }
		public List<If_statement2Context> if_statement2() {
			return getRuleContexts(If_statement2Context.class);
		}
		public If_statement2Context if_statement2(int i) {
			return getRuleContext(If_statement2Context.class,i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(InterpreterParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(InterpreterParser.BEGIN, i);
		}
		public List<TerminalNode> END() { return getTokens(InterpreterParser.END); }
		public TerminalNode END(int i) {
			return getToken(InterpreterParser.END, i);
		}
		public TerminalNode ELSE() { return getToken(InterpreterParser.ELSE, 0); }
		public List<Else_statementContext> else_statement() {
			return getRuleContexts(Else_statementContext.class);
		}
		public Else_statementContext else_statement(int i) {
			return getRuleContext(Else_statementContext.class,i);
		}
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
		enterRule(_localctx, 52, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(IF);
			setState(336);
			comparison();
			setState(337);
			match(THEN);
			setState(347);
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
				setState(338);
				if_statement2();
				}
				break;
			case BEGIN:
				{
				setState(339);
				match(BEGIN);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
					{
					{
					setState(340);
					if_statement2();
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(346);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(349);
				match(ELSE);
				setState(359);
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
					setState(350);
					else_statement();
					}
					break;
				case BEGIN:
					{
					setState(351);
					match(BEGIN);
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
						{
						{
						setState(352);
						else_statement();
						}
						}
						setState(357);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(358);
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
	public static class Else_statementContext extends ParserRuleContext {
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
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else_statement);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(369);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(370);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(371);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(372);
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
	public static class If_statement2Context extends ParserRuleContext {
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
		public If_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterIf_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitIf_statement2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitIf_statement2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statement2Context if_statement2() throws RecognitionException {
		If_statement2Context _localctx = new If_statement2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_statement2);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(380);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(381);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(382);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(383);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(384);
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
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(392);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(393);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(394);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(395);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(396);
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
		enterRule(_localctx, 60, RULE_statement_bucle);
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				variable_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				array_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				arrayBi_init();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
				for_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				writeln_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(405);
				write();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(406);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(407);
				if_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(408);
				read_call();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(409);
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
		enterRule(_localctx, 62, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			simple_expression();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) {
				{
				setState(413);
				operaciones();
				setState(414);
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
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			terms();
			setState(419);
			operaciones();
			setState(420);
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
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_terms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(422);
				match(ID);
				}
				break;
			case 2:
				{
				setState(423);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(424);
				match(CHAR);
				}
				break;
			case 4:
				{
				setState(425);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(426);
				match(BOOLEANVALUE);
				}
				break;
			case 6:
				{
				setState(427);
				array_access();
				}
				break;
			case 7:
				{
				setState(428);
				arrayBi_access();
				}
				break;
			case 8:
				{
				setState(429);
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
		enterRule(_localctx, 68, RULE_simple_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			factor();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) {
				{
				{
				setState(433);
				operaciones_simples();
				setState(434);
				factor();
				}
				}
				setState(440);
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
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_factor);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				array_access();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				arrayBi_access();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(445);
				operacones_parentesis();
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
		enterRule(_localctx, 72, RULE_operacones_parentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(OPEN_PARENTHESIS);
			setState(449);
			simple_expression();
			setState(450);
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
		enterRule(_localctx, 74, RULE_operaciones_simples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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
		public TerminalNode EQUALS() { return getToken(InterpreterParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(InterpreterParser.NOT_EQUALS, 0); }
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
		enterRule(_localctx, 76, RULE_operaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
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
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
		public TerminalNode BEGIN() { return getToken(InterpreterParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(InterpreterParser.END, 0); }
		public Parameters_declarationContext parameters_declaration() {
			return getRuleContext(Parameters_declarationContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<Statement_functionContext> statement_function() {
			return getRuleContexts(Statement_functionContext.class);
		}
		public Statement_functionContext statement_function(int i) {
			return getRuleContext(Statement_functionContext.class,i);
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
		enterRule(_localctx, 78, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(FUNCTION);
			setState(457);
			match(ID);
			setState(458);
			match(OPEN_PARENTHESIS);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(459);
				parameters_declaration();
				}
			}

			setState(462);
			match(CLOSE_PARENTHESIS);
			setState(463);
			match(COLON);
			setState(464);
			match(TYPE);
			setState(465);
			match(SEMICOLON);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294973440L) != 0)) {
				{
				{
				setState(466);
				declarations();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			match(BEGIN);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125900044304390L) != 0)) {
				{
				{
				setState(473);
				statement_function();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
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
	public static class Statement_functionContext extends ParserRuleContext {
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
		public Statement_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterStatement_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitStatement_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitStatement_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_functionContext statement_function() throws RecognitionException {
		Statement_functionContext _localctx = new Statement_functionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement_function);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(487);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(488);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(489);
				read_call();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(490);
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
	public static class Function_CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public Parameter_initContext parameter_init() {
			return getRuleContext(Parameter_initContext.class,0);
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
		enterRule(_localctx, 82, RULE_function_Call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(ID);
			setState(494);
			match(OPEN_PARENTHESIS);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17469040742105088L) != 0)) {
				{
				setState(495);
				parameter_init();
				}
			}

			setState(498);
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
	public static class Parameters_declarationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(InterpreterParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InterpreterParser.ID, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(InterpreterParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(InterpreterParser.SEMICOLON, i);
		}
		public List<Parameters_declarationContext> parameters_declaration() {
			return getRuleContexts(Parameters_declarationContext.class);
		}
		public Parameters_declarationContext parameters_declaration(int i) {
			return getRuleContext(Parameters_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public Parameters_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterParameters_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitParameters_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitParameters_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_declarationContext parameters_declaration() throws RecognitionException {
		Parameters_declarationContext _localctx = new Parameters_declarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parameters_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(500);
			match(ID);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(501);
				match(COMMA);
				setState(502);
				match(ID);
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(508);
			match(COLON);
			setState(509);
			match(TYPE);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					match(SEMICOLON);
					setState(511);
					parameters_declaration();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class Parameter_initContext extends ParserRuleContext {
		public List<TermsContext> terms() {
			return getRuleContexts(TermsContext.class);
		}
		public TermsContext terms(int i) {
			return getRuleContext(TermsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(InterpreterParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(InterpreterParser.COMMA, i);
		}
		public Parameter_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterParameter_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitParameter_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitParameter_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_initContext parameter_init() throws RecognitionException {
		Parameter_initContext _localctx = new Parameter_initContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parameter_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			terms();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(518);
				match(COMMA);
				setState(519);
				terms();
				}
				}
				setState(524);
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

	public static final String _serializedATN =
		"\u0004\u00018\u020e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000]\b\u0000\n\u0000\f\u0000`\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002k\b\u0002\u000b\u0002"+
		"\f\u0002l\u0001\u0002\u0001\u0002\u0004\u0002q\b\u0002\u000b\u0002\f\u0002"+
		"r\u0001\u0002\u0004\u0002v\b\u0002\u000b\u0002\f\u0002w\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u007f\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0089\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0091\b\u0005\n"+
		"\u0005\f\u0005\u0094\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00b7\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0005\f\u00c1\b\f\n\f\f\f\u00c4\t\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00d1\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e0\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00ef\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u010b\b\u0013\n"+
		"\u0013\f\u0013\u010e\t\u0013\u0001\u0013\u0003\u0013\u0111\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u011c\b\u0016\n\u0016\f\u0016"+
		"\u011f\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0129\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0130\b\u0018"+
		"\n\u0018\f\u0018\u0133\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u013c\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0142\b\u0019\u0003"+
		"\u0019\u0144\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0149"+
		"\b\u0019\n\u0019\f\u0019\u014c\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0156\b\u001a\n\u001a\f\u001a\u0159\t\u001a\u0001\u001a\u0003\u001a\u015c"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0162"+
		"\b\u001a\n\u001a\f\u001a\u0165\t\u001a\u0001\u001a\u0003\u001a\u0168\b"+
		"\u001a\u0003\u001a\u016a\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0176\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0182\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u018e\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u019b\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01a1\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01af"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01b5\b\"\n\"\f\"\u01b8\t"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01bf\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u01cd\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01d4\b\'"+
		"\n\'\f\'\u01d7\t\'\u0001\'\u0001\'\u0005\'\u01db\b\'\n\'\f\'\u01de\t\'"+
		"\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u01ec\b(\u0001)\u0001)\u0001)\u0003)\u01f1\b)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0005*\u01f8\b*\n*\f*\u01fb\t*\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u0201\b*\n*\f*\u0204\t*\u0001+\u0001+\u0001+\u0005"+
		"+\u0209\b+\n+\f+\u020c\t+\u0001+\u0000\u0000,\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTV\u0000\u0005\u0001\u000045\u0001\u000023\u0002\u0000"+
		"\u0003\u0003\u0005\u0005\u0001\u0000\u0016\u0019\u0001\u0000!&\u025a\u0000"+
		"X\u0001\u0000\u0000\u0000\u0002e\u0001\u0000\u0000\u0000\u0004u\u0001"+
		"\u0000\u0000\u0000\u0006y\u0001\u0000\u0000\u0000\b\u0083\u0001\u0000"+
		"\u0000\u0000\n\u008d\u0001\u0000\u0000\u0000\f\u0099\u0001\u0000\u0000"+
		"\u0000\u000e\u00a3\u0001\u0000\u0000\u0000\u0010\u00a7\u0001\u0000\u0000"+
		"\u0000\u0012\u00b6\u0001\u0000\u0000\u0000\u0014\u00b8\u0001\u0000\u0000"+
		"\u0000\u0016\u00bd\u0001\u0000\u0000\u0000\u0018\u00c2\u0001\u0000\u0000"+
		"\u0000\u001a\u00c5\u0001\u0000\u0000\u0000\u001c\u00d4\u0001\u0000\u0000"+
		"\u0000\u001e\u00e3\u0001\u0000\u0000\u0000 \u00f2\u0001\u0000\u0000\u0000"+
		"\"\u00f7\u0001\u0000\u0000\u0000$\u00f9\u0001\u0000\u0000\u0000&\u0100"+
		"\u0001\u0000\u0000\u0000(\u0112\u0001\u0000\u0000\u0000*\u0114\u0001\u0000"+
		"\u0000\u0000,\u0116\u0001\u0000\u0000\u0000.\u0128\u0001\u0000\u0000\u0000"+
		"0\u012a\u0001\u0000\u0000\u00002\u0137\u0001\u0000\u0000\u00004\u014f"+
		"\u0001\u0000\u0000\u00006\u0175\u0001\u0000\u0000\u00008\u0181\u0001\u0000"+
		"\u0000\u0000:\u018d\u0001\u0000\u0000\u0000<\u019a\u0001\u0000\u0000\u0000"+
		">\u019c\u0001\u0000\u0000\u0000@\u01a2\u0001\u0000\u0000\u0000B\u01ae"+
		"\u0001\u0000\u0000\u0000D\u01b0\u0001\u0000\u0000\u0000F\u01be\u0001\u0000"+
		"\u0000\u0000H\u01c0\u0001\u0000\u0000\u0000J\u01c4\u0001\u0000\u0000\u0000"+
		"L\u01c6\u0001\u0000\u0000\u0000N\u01c8\u0001\u0000\u0000\u0000P\u01eb"+
		"\u0001\u0000\u0000\u0000R\u01ed\u0001\u0000\u0000\u0000T\u01f4\u0001\u0000"+
		"\u0000\u0000V\u0205\u0001\u0000\u0000\u0000XY\u0005\u0006\u0000\u0000"+
		"YZ\u00052\u0000\u0000Z^\u00050\u0000\u0000[]\u0003\u0004\u0002\u0000\\"+
		"[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ab\u0005\b\u0000\u0000bc\u0003\u0018\f\u0000cd\u0003\u0002"+
		"\u0001\u0000d\u0001\u0001\u0000\u0000\u0000ef\u0005\n\u0000\u0000fg\u0005"+
		"+\u0000\u0000g\u0003\u0001\u0000\u0000\u0000hj\u0005\u000b\u0000\u0000"+
		"ik\u0003\u0012\t\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mv\u0001\u0000\u0000"+
		"\u0000np\u0005\f\u0000\u0000oq\u0003\u0016\u000b\u0000po\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tv\u0003N\'\u0000uh\u0001\u0000"+
		"\u0000\u0000un\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x\u0005\u0001\u0000\u0000\u0000yz\u0005\u0002\u0000\u0000z~\u0005,\u0000"+
		"\u0000{\u007f\u00052\u0000\u0000|\u007f\u0003 \u0010\u0000}\u007f\u0003"+
		"$\u0012\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"-\u0000\u0000\u0081\u0082\u00050\u0000\u0000\u0082\u0007\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0088\u0005,\u0000\u0000"+
		"\u0085\u0089\u00052\u0000\u0000\u0086\u0089\u0003 \u0010\u0000\u0087\u0089"+
		"\u0003$\u0012\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005-\u0000\u0000\u008b\u008c\u00050\u0000"+
		"\u0000\u008c\t\u0001\u0000\u0000\u0000\u008d\u0092\u00052\u0000\u0000"+
		"\u008e\u008f\u0005\u000e\u0000\u0000\u008f\u0091\u00052\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005)\u0000\u0000\u0096\u0097\u0005\'\u0000\u0000\u0097\u0098"+
		"\u00050\u0000\u0000\u0098\u000b\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"2\u0000\u0000\u009a\u009b\u0005)\u0000\u0000\u009b\u009c\u0005\u0013\u0000"+
		"\u0000\u009c\u009d\u0005.\u0000\u0000\u009d\u009e\u0003\u000e\u0007\u0000"+
		"\u009e\u009f\u0005/\u0000\u0000\u009f\u00a0\u0005\u0004\u0000\u0000\u00a0"+
		"\u00a1\u0005\'\u0000\u0000\u00a1\u00a2\u00050\u0000\u0000\u00a2\r\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u00053\u0000\u0000\u00a4\u00a5\u0005*\u0000"+
		"\u0000\u00a5\u00a6\u00053\u0000\u0000\u00a6\u000f\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u00052\u0000\u0000\u00a8\u00a9\u0005)\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0013\u0000\u0000\u00aa\u00ab\u0005.\u0000\u0000\u00ab\u00ac\u0003"+
		"\u000e\u0007\u0000\u00ac\u00ad\u0005\u000e\u0000\u0000\u00ad\u00ae\u0003"+
		"\u000e\u0007\u0000\u00ae\u00af\u0005/\u0000\u0000\u00af\u00b0\u0005\u0004"+
		"\u0000\u0000\u00b0\u00b1\u0005\'\u0000\u0000\u00b1\u00b2\u00050\u0000"+
		"\u0000\u00b2\u0011\u0001\u0000\u0000\u0000\u00b3\u00b7\u0003\n\u0005\u0000"+
		"\u00b4\u00b7\u0003\f\u0006\u0000\u00b5\u00b7\u0003\u0010\b\u0000\u00b6"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u0013\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u00052\u0000\u0000\u00b9\u00ba\u0005%\u0000\u0000\u00ba\u00bb\u0007"+
		"\u0000\u0000\u0000\u00bb\u00bc\u00050\u0000\u0000\u00bc\u0015\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0003\u0014\n\u0000\u00be\u0017\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c1\u0003:\u001d\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u0019\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u00052\u0000\u0000\u00c6"+
		"\u00d0\u0005(\u0000\u0000\u00c7\u00d1\u00052\u0000\u0000\u00c8\u00d1\u0005"+
		"3\u0000\u0000\u00c9\u00d1\u00054\u0000\u0000\u00ca\u00d1\u00055\u0000"+
		"\u0000\u00cb\u00d1\u00051\u0000\u0000\u00cc\u00d1\u0003 \u0010\u0000\u00cd"+
		"\u00d1\u0003$\u0012\u0000\u00ce\u00d1\u0003D\"\u0000\u00cf\u00d1\u0003"+
		"R)\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000\u0000"+
		"\u0000\u00d0\u00c9\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u00050\u0000\u0000\u00d3\u001b\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0003 \u0010\u0000\u00d5\u00df\u0005(\u0000\u0000\u00d6\u00e0"+
		"\u00052\u0000\u0000\u00d7\u00e0\u00053\u0000\u0000\u00d8\u00e0\u00054"+
		"\u0000\u0000\u00d9\u00e0\u00055\u0000\u0000\u00da\u00e0\u00051\u0000\u0000"+
		"\u00db\u00e0\u0003D\"\u0000\u00dc\u00e0\u0003 \u0010\u0000\u00dd\u00e0"+
		"\u0003$\u0012\u0000\u00de\u00e0\u0003R)\u0000\u00df\u00d6\u0001\u0000"+
		"\u0000\u0000\u00df\u00d7\u0001\u0000\u0000\u0000\u00df\u00d8\u0001\u0000"+
		"\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000"+
		"\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u00050\u0000"+
		"\u0000\u00e2\u001d\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003$\u0012\u0000"+
		"\u00e4\u00ee\u0005(\u0000\u0000\u00e5\u00ef\u00052\u0000\u0000\u00e6\u00ef"+
		"\u00053\u0000\u0000\u00e7\u00ef\u00054\u0000\u0000\u00e8\u00ef\u00055"+
		"\u0000\u0000\u00e9\u00ef\u00051\u0000\u0000\u00ea\u00ef\u0003D\"\u0000"+
		"\u00eb\u00ef\u0003 \u0010\u0000\u00ec\u00ef\u0003$\u0012\u0000\u00ed\u00ef"+
		"\u0003R)\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000\u00ee\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ee\u00e7\u0001\u0000\u0000\u0000\u00ee\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u00050\u0000\u0000\u00f1\u001f\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u00052\u0000\u0000\u00f3\u00f4\u0005.\u0000\u0000\u00f4"+
		"\u00f5\u0003\"\u0011\u0000\u00f5\u00f6\u0005/\u0000\u0000\u00f6!\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0007\u0001\u0000\u0000\u00f8#\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u00052\u0000\u0000\u00fa\u00fb\u0005.\u0000\u0000"+
		"\u00fb\u00fc\u0003\"\u0011\u0000\u00fc\u00fd\u0005\u000e\u0000\u0000\u00fd"+
		"\u00fe\u0003\"\u0011\u0000\u00fe\u00ff\u0005/\u0000\u0000\u00ff%\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005\u000f\u0000\u0000\u0101\u0102\u0005"+
		"2\u0000\u0000\u0102\u0103\u0005(\u0000\u0000\u0103\u0104\u0003(\u0014"+
		"\u0000\u0104\u0105\u0007\u0002\u0000\u0000\u0105\u0106\u0003*\u0015\u0000"+
		"\u0106\u0110\u0005\u0012\u0000\u0000\u0107\u0111\u0003<\u001e\u0000\u0108"+
		"\u010c\u0005\b\u0000\u0000\u0109\u010b\u0003<\u001e\u0000\u010a\u0109"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010f"+
		"\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0111"+
		"\u0005\t\u0000\u0000\u0110\u0107\u0001\u0000\u0000\u0000\u0110\u0108\u0001"+
		"\u0000\u0000\u0000\u0111\'\u0001\u0000\u0000\u0000\u0112\u0113\u0007\u0001"+
		"\u0000\u0000\u0113)\u0001\u0000\u0000\u0000\u0114\u0115\u0007\u0001\u0000"+
		"\u0000\u0115+\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0014\u0000\u0000"+
		"\u0117\u0118\u0005,\u0000\u0000\u0118\u011d\u0003.\u0017\u0000\u0119\u011a"+
		"\u0005\u000e\u0000\u0000\u011a\u011c\u0003.\u0017\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001"+
		"\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005"+
		"-\u0000\u0000\u0121\u0122\u00050\u0000\u0000\u0122-\u0001\u0000\u0000"+
		"\u0000\u0123\u0129\u00052\u0000\u0000\u0124\u0129\u00056\u0000\u0000\u0125"+
		"\u0129\u00055\u0000\u0000\u0126\u0129\u0003 \u0010\u0000\u0127\u0129\u0003"+
		"$\u0012\u0000\u0128\u0123\u0001\u0000\u0000\u0000\u0128\u0124\u0001\u0000"+
		"\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129/\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005\u0015\u0000\u0000\u012b\u012c\u0005,\u0000\u0000"+
		"\u012c\u0131\u0003.\u0017\u0000\u012d\u012e\u0005\u000e\u0000\u0000\u012e"+
		"\u0130\u0003.\u0017\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0133"+
		"\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0005-\u0000\u0000\u0135\u0136\u0005"+
		"0\u0000\u0000\u01361\u0001\u0000\u0000\u0000\u0137\u0143\u0005\u0010\u0000"+
		"\u0000\u0138\u013b\u0005,\u0000\u0000\u0139\u013c\u0003>\u001f\u0000\u013a"+
		"\u013c\u0003@ \u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005"+
		"-\u0000\u0000\u013e\u0144\u0001\u0000\u0000\u0000\u013f\u0142\u0003>\u001f"+
		"\u0000\u0140\u0142\u0003@ \u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143"+
		"\u0138\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0012\u0000\u0000\u0146"+
		"\u014a\u0005\b\u0000\u0000\u0147\u0149\u0003<\u001e\u0000\u0148\u0147"+
		"\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d"+
		"\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0005\t\u0000\u0000\u014e3\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"\u001b\u0000\u0000\u0150\u0151\u0003@ \u0000\u0151\u015b\u0005\u001c\u0000"+
		"\u0000\u0152\u015c\u00038\u001c\u0000\u0153\u0157\u0005\b\u0000\u0000"+
		"\u0154\u0156\u00038\u001c\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156"+
		"\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u015a\u015c\u0005\t\u0000\u0000\u015b\u0152"+
		"\u0001\u0000\u0000\u0000\u015b\u0153\u0001\u0000\u0000\u0000\u015c\u0169"+
		"\u0001\u0000\u0000\u0000\u015d\u0167\u0005\u001a\u0000\u0000\u015e\u0168"+
		"\u00036\u001b\u0000\u015f\u0163\u0005\b\u0000\u0000\u0160\u0162\u0003"+
		"6\u001b\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000"+
		"\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000"+
		"\u0000\u0000\u0166\u0168\u0005\t\u0000\u0000\u0167\u015e\u0001\u0000\u0000"+
		"\u0000\u0167\u015f\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000"+
		"\u0000\u0169\u015d\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016a5\u0001\u0000\u0000\u0000\u016b\u0176\u0003\u001a\r\u0000"+
		"\u016c\u0176\u0003\u001c\u000e\u0000\u016d\u0176\u0003\u001e\u000f\u0000"+
		"\u016e\u0176\u0003&\u0013\u0000\u016f\u0176\u0003,\u0016\u0000\u0170\u0176"+
		"\u00030\u0018\u0000\u0171\u0176\u00032\u0019\u0000\u0172\u0176\u00034"+
		"\u001a\u0000\u0173\u0176\u0003\u0006\u0003\u0000\u0174\u0176\u0003\b\u0004"+
		"\u0000\u0175\u016b\u0001\u0000\u0000\u0000\u0175\u016c\u0001\u0000\u0000"+
		"\u0000\u0175\u016d\u0001\u0000\u0000\u0000\u0175\u016e\u0001\u0000\u0000"+
		"\u0000\u0175\u016f\u0001\u0000\u0000\u0000\u0175\u0170\u0001\u0000\u0000"+
		"\u0000\u0175\u0171\u0001\u0000\u0000\u0000\u0175\u0172\u0001\u0000\u0000"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000"+
		"\u0000\u01767\u0001\u0000\u0000\u0000\u0177\u0182\u0003\u001a\r\u0000"+
		"\u0178\u0182\u0003\u001c\u000e\u0000\u0179\u0182\u0003\u001e\u000f\u0000"+
		"\u017a\u0182\u0003&\u0013\u0000\u017b\u0182\u0003,\u0016\u0000\u017c\u0182"+
		"\u00030\u0018\u0000\u017d\u0182\u00032\u0019\u0000\u017e\u0182\u00034"+
		"\u001a\u0000\u017f\u0182\u0003\u0006\u0003\u0000\u0180\u0182\u0003\b\u0004"+
		"\u0000\u0181\u0177\u0001\u0000\u0000\u0000\u0181\u0178\u0001\u0000\u0000"+
		"\u0000\u0181\u0179\u0001\u0000\u0000\u0000\u0181\u017a\u0001\u0000\u0000"+
		"\u0000\u0181\u017b\u0001\u0000\u0000\u0000\u0181\u017c\u0001\u0000\u0000"+
		"\u0000\u0181\u017d\u0001\u0000\u0000\u0000\u0181\u017e\u0001\u0000\u0000"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u01829\u0001\u0000\u0000\u0000\u0183\u018e\u0003\u001a\r\u0000"+
		"\u0184\u018e\u0003\u001c\u000e\u0000\u0185\u018e\u0003\u001e\u000f\u0000"+
		"\u0186\u018e\u0003&\u0013\u0000\u0187\u018e\u0003,\u0016\u0000\u0188\u018e"+
		"\u00030\u0018\u0000\u0189\u018e\u00032\u0019\u0000\u018a\u018e\u00034"+
		"\u001a\u0000\u018b\u018e\u0003\u0006\u0003\u0000\u018c\u018e\u0003\b\u0004"+
		"\u0000\u018d\u0183\u0001\u0000\u0000\u0000\u018d\u0184\u0001\u0000\u0000"+
		"\u0000\u018d\u0185\u0001\u0000\u0000\u0000\u018d\u0186\u0001\u0000\u0000"+
		"\u0000\u018d\u0187\u0001\u0000\u0000\u0000\u018d\u0188\u0001\u0000\u0000"+
		"\u0000\u018d\u0189\u0001\u0000\u0000\u0000\u018d\u018a\u0001\u0000\u0000"+
		"\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000"+
		"\u0000\u018e;\u0001\u0000\u0000\u0000\u018f\u019b\u0003\u0004\u0002\u0000"+
		"\u0190\u019b\u0003\u001a\r\u0000\u0191\u019b\u0003\u001c\u000e\u0000\u0192"+
		"\u019b\u0003\u001e\u000f\u0000\u0193\u019b\u0003&\u0013\u0000\u0194\u019b"+
		"\u0003,\u0016\u0000\u0195\u019b\u00030\u0018\u0000\u0196\u019b\u00032"+
		"\u0019\u0000\u0197\u019b\u00034\u001a\u0000\u0198\u019b\u0003\u0006\u0003"+
		"\u0000\u0199\u019b\u0003\b\u0004\u0000\u019a\u018f\u0001\u0000\u0000\u0000"+
		"\u019a\u0190\u0001\u0000\u0000\u0000\u019a\u0191\u0001\u0000\u0000\u0000"+
		"\u019a\u0192\u0001\u0000\u0000\u0000\u019a\u0193\u0001\u0000\u0000\u0000"+
		"\u019a\u0194\u0001\u0000\u0000\u0000\u019a\u0195\u0001\u0000\u0000\u0000"+
		"\u019a\u0196\u0001\u0000\u0000\u0000\u019a\u0197\u0001\u0000\u0000\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000"+
		"\u019b=\u0001\u0000\u0000\u0000\u019c\u01a0\u0003D\"\u0000\u019d\u019e"+
		"\u0003L&\u0000\u019e\u019f\u0003D\"\u0000\u019f\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a0\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a1?\u0001\u0000\u0000\u0000\u01a2\u01a3\u0003B!\u0000\u01a3"+
		"\u01a4\u0003L&\u0000\u01a4\u01a5\u0003B!\u0000\u01a5A\u0001\u0000\u0000"+
		"\u0000\u01a6\u01af\u00052\u0000\u0000\u01a7\u01af\u00054\u0000\u0000\u01a8"+
		"\u01af\u00055\u0000\u0000\u01a9\u01af\u00053\u0000\u0000\u01aa\u01af\u0005"+
		"1\u0000\u0000\u01ab\u01af\u0003 \u0010\u0000\u01ac\u01af\u0003$\u0012"+
		"\u0000\u01ad\u01af\u0003D\"\u0000\u01ae\u01a6\u0001\u0000\u0000\u0000"+
		"\u01ae\u01a7\u0001\u0000\u0000\u0000\u01ae\u01a8\u0001\u0000\u0000\u0000"+
		"\u01ae\u01a9\u0001\u0000\u0000\u0000\u01ae\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ae\u01ab\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ae\u01ad\u0001\u0000\u0000\u0000\u01afC\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b6\u0003F#\u0000\u01b1\u01b2\u0003J%\u0000\u01b2\u01b3\u0003F#\u0000"+
		"\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7E\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bf\u00052\u0000\u0000\u01ba\u01bf"+
		"\u00053\u0000\u0000\u01bb\u01bf\u0003 \u0010\u0000\u01bc\u01bf\u0003$"+
		"\u0012\u0000\u01bd\u01bf\u0003H$\u0000\u01be\u01b9\u0001\u0000\u0000\u0000"+
		"\u01be\u01ba\u0001\u0000\u0000\u0000\u01be\u01bb\u0001\u0000\u0000\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bfG\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005,\u0000\u0000\u01c1\u01c2"+
		"\u0003D\"\u0000\u01c2\u01c3\u0005-\u0000\u0000\u01c3I\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0007\u0003\u0000\u0000\u01c5K\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0007\u0004\u0000\u0000\u01c7M\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0005 \u0000\u0000\u01c9\u01ca\u00052\u0000\u0000\u01ca\u01cc\u0005"+
		",\u0000\u0000\u01cb\u01cd\u0003T*\u0000\u01cc\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0005-\u0000\u0000\u01cf\u01d0\u0005)\u0000\u0000\u01d0"+
		"\u01d1\u0005\'\u0000\u0000\u01d1\u01d5\u00050\u0000\u0000\u01d2\u01d4"+
		"\u0003\u0004\u0002\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d8\u01dc\u0005\b\u0000\u0000\u01d9\u01db\u0003"+
		"P(\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000"+
		"\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000"+
		"\u0000\u01dd\u01df\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000"+
		"\u0000\u01df\u01e0\u0005\t\u0000\u0000\u01e0O\u0001\u0000\u0000\u0000"+
		"\u01e1\u01ec\u0003\u001a\r\u0000\u01e2\u01ec\u0003\u001c\u000e\u0000\u01e3"+
		"\u01ec\u0003\u001e\u000f\u0000\u01e4\u01ec\u0003&\u0013\u0000\u01e5\u01ec"+
		"\u0003,\u0016\u0000\u01e6\u01ec\u00030\u0018\u0000\u01e7\u01ec\u00032"+
		"\u0019\u0000\u01e8\u01ec\u00034\u001a\u0000\u01e9\u01ec\u0003\u0006\u0003"+
		"\u0000\u01ea\u01ec\u0003\b\u0004\u0000\u01eb\u01e1\u0001\u0000\u0000\u0000"+
		"\u01eb\u01e2\u0001\u0000\u0000\u0000\u01eb\u01e3\u0001\u0000\u0000\u0000"+
		"\u01eb\u01e4\u0001\u0000\u0000\u0000\u01eb\u01e5\u0001\u0000\u0000\u0000"+
		"\u01eb\u01e6\u0001\u0000\u0000\u0000\u01eb\u01e7\u0001\u0000\u0000\u0000"+
		"\u01eb\u01e8\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ecQ\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u00052\u0000\u0000\u01ee\u01f0\u0005,\u0000\u0000\u01ef\u01f1\u0003"+
		"V+\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005-\u0000\u0000"+
		"\u01f3S\u0001\u0000\u0000\u0000\u01f4\u01f9\u00052\u0000\u0000\u01f5\u01f6"+
		"\u0005\u000e\u0000\u0000\u01f6\u01f8\u00052\u0000\u0000\u01f7\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005"+
		")\u0000\u0000\u01fd\u0202\u0005\'\u0000\u0000\u01fe\u01ff\u00050\u0000"+
		"\u0000\u01ff\u0201\u0003T*\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201"+
		"\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0001\u0000\u0000\u0000\u0203U\u0001\u0000\u0000\u0000\u0204\u0202"+
		"\u0001\u0000\u0000\u0000\u0205\u020a\u0003B!\u0000\u0206\u0207\u0005\u000e"+
		"\u0000\u0000\u0207\u0209\u0003B!\u0000\u0208\u0206\u0001\u0000\u0000\u0000"+
		"\u0209\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020bW\u0001\u0000\u0000\u0000\u020c"+
		"\u020a\u0001\u0000\u0000\u0000+^lruw~\u0088\u0092\u00b6\u00c2\u00d0\u00df"+
		"\u00ee\u010c\u0110\u011d\u0128\u0131\u013b\u0141\u0143\u014a\u0157\u015b"+
		"\u0163\u0167\u0169\u0175\u0181\u018d\u019a\u01a0\u01ae\u01b6\u01be\u01cc"+
		"\u01d5\u01dc\u01eb\u01f0\u01f9\u0202\u020a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}