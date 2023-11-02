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
		TO=1, OF=2, DOWNTO=3, PROGRAM=4, BEGIN=5, END=6, ENDPROGRAM=7, VAR=8, 
		PRINTLN=9, COMMA=10, FOR=11, WHILE=12, COMMENT=13, DO=14, ARRAY=15, WRITELN=16, 
		WRITE=17, PLUS=18, MINUS=19, MULT=20, DIV=21, ELSE=22, IF=23, THEN=24, 
		AND=25, OR=26, NOT=27, FUNCTION=28, GREATER_THAN=29, LESS_THAN=30, GREATER_THAN_OR_EQUALS=31, 
		LESS_THAN_OR_EQUALS=32, EQUALS=33, NOT_EQUALS=34, TYPE=35, ASSIGN=36, 
		COLON=37, DOTDOT=38, POINT=39, OPEN_PARENTHESIS=40, CLOSE_PARENTHESIS=41, 
		OPEN_BRACKET=42, CLOSE_BRACKET=43, SEMICOLON=44, ID=45, NUMBER=46, TRUE=47, 
		FALSE=48, TEXT=49, WS=50, STRING=51, PROCEDURE=52;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_variable_declaration = 2, 
		RULE_array_declaration = 3, RULE_arraybi_declaration = 4, RULE_function_declaration = 5, 
		RULE_parameters = 6, RULE_parameter = 7, RULE_statements = 8, RULE_variable_init = 9, 
		RULE_assign_variables = 10, RULE_array_init = 11, RULE_arrayBi_init = 12, 
		RULE_array_access = 13, RULE_arrayBi_access = 14, RULE_for_loop = 15, 
		RULE_writeln_stmt = 16, RULE_write = 17, RULE_while_loop = 18, RULE_if_statement = 19, 
		RULE_statement = 20, RULE_expression = 21, RULE_simple_expression = 22, 
		RULE_term = 23, RULE_factor = 24, RULE_anidar = 25, RULE_procedure_declaration = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "variable_declaration", "array_declaration", 
			"arraybi_declaration", "function_declaration", "parameters", "parameter", 
			"statements", "variable_init", "assign_variables", "array_init", "arrayBi_init", 
			"array_access", "arrayBi_access", "for_loop", "writeln_stmt", "write", 
			"while_loop", "if_statement", "statement", "expression", "simple_expression", 
			"term", "factor", "anidar", "procedure_declaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'to'", "'of'", "'downto'", "'program'", "'begin'", "'end;'", "'end.'", 
			"'var'", "'println'", "','", "'for'", "'while'", null, "'do'", "'array'", 
			"'writeln'", "'write'", "'+'", "'-'", null, "'/'", "'else'", "'if'", 
			"'then'", "'and'", "'or'", "'not'", "'function'", "'>'", "'<'", "'>='", 
			"'<='", "'='", "'<>'", null, "':='", "':'", "'..'", "'.'", "'('", "')'", 
			"'['", "']'", "';'", null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TO", "OF", "DOWNTO", "PROGRAM", "BEGIN", "END", "ENDPROGRAM", 
			"VAR", "PRINTLN", "COMMA", "FOR", "WHILE", "COMMENT", "DO", "ARRAY", 
			"WRITELN", "WRITE", "PLUS", "MINUS", "MULT", "DIV", "ELSE", "IF", "THEN", 
			"AND", "OR", "NOT", "FUNCTION", "GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQUALS", 
			"LESS_THAN_OR_EQUALS", "EQUALS", "NOT_EQUALS", "TYPE", "ASSIGN", "COLON", 
			"DOTDOT", "POINT", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "SEMICOLON", "ID", "NUMBER", "TRUE", "FALSE", "TEXT", 
			"WS", "STRING", "PROCEDURE"
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
			setState(54);
			match(PROGRAM);
			setState(55);
			match(ID);
			setState(56);
			match(SEMICOLON);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(57);
				declarations();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(BEGIN);
			setState(64);
			statements();
			setState(65);
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
		public TerminalNode VAR() { return getToken(InterpreterParser.VAR, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<Array_declarationContext> array_declaration() {
			return getRuleContexts(Array_declarationContext.class);
		}
		public Array_declarationContext array_declaration(int i) {
			return getRuleContext(Array_declarationContext.class,i);
		}
		public List<Arraybi_declarationContext> arraybi_declaration() {
			return getRuleContexts(Arraybi_declarationContext.class);
		}
		public Arraybi_declarationContext arraybi_declaration(int i) {
			return getRuleContext(Arraybi_declarationContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(VAR);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(68);
					variable_declaration();
					}
					break;
				case 2:
					{
					setState(69);
					array_declaration();
					}
					break;
				case 3:
					{
					setState(70);
					arraybi_declaration();
					}
					break;
				case 4:
					{
					setState(71);
					function_declaration();
					}
					break;
				case 5:
					{
					setState(72);
					procedure_declaration();
					}
					break;
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4538784267894784L) != 0) );
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
		enterRule(_localctx, 4, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(78);
				match(COMMA);
				setState(79);
				match(ID);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(COLON);
			setState(86);
			match(TYPE);
			setState(87);
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
		enterRule(_localctx, 6, RULE_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(COLON);
			setState(91);
			match(ARRAY);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(92);
				match(OPEN_BRACKET);
				setState(93);
				match(NUMBER);
				setState(94);
				match(DOTDOT);
				setState(95);
				match(NUMBER);
				setState(96);
				match(CLOSE_BRACKET);
				}
			}

			setState(99);
			match(OF);
			setState(100);
			match(TYPE);
			setState(101);
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
		enterRule(_localctx, 8, RULE_arraybi_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(COLON);
			setState(105);
			match(ARRAY);
			setState(106);
			match(OPEN_BRACKET);
			setState(107);
			match(NUMBER);
			setState(108);
			match(DOTDOT);
			setState(109);
			match(NUMBER);
			setState(110);
			match(COMMA);
			setState(111);
			match(NUMBER);
			setState(112);
			match(DOTDOT);
			setState(113);
			match(NUMBER);
			setState(114);
			match(CLOSE_BRACKET);
			setState(115);
			match(OF);
			setState(116);
			match(TYPE);
			setState(117);
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
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
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
		enterRule(_localctx, 10, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(FUNCTION);
			setState(120);
			match(ID);
			setState(121);
			match(OPEN_PARENTHESIS);
			setState(122);
			parameters();
			setState(123);
			match(CLOSE_PARENTHESIS);
			setState(124);
			match(COLON);
			setState(125);
			match(TYPE);
			setState(126);
			match(SEMICOLON);
			setState(127);
			match(BEGIN);
			setState(128);
			statements();
			setState(129);
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
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
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
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(131);
				parameter();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(132);
					match(COMMA);
					setState(133);
					parameter();
					}
					}
					setState(138);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode COLON() { return getToken(InterpreterParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(InterpreterParser.TYPE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(142);
			match(COLON);
			setState(143);
			match(TYPE);
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
		enterRule(_localctx, 16, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184380680224L) != 0)) {
				{
				{
				setState(145);
				statement();
				}
				}
				setState(150);
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
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public Assign_variablesContext assign_variables() {
			return getRuleContext(Assign_variablesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 18, RULE_variable_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ID);
			setState(152);
			match(ASSIGN);
			setState(153);
			assign_variables();
			setState(154);
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
	public static class Assign_variablesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(InterpreterParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(InterpreterParser.TEXT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnidarContext anidar() {
			return getRuleContext(AnidarContext.class,0);
		}
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public Assign_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterAssign_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitAssign_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitAssign_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_variablesContext assign_variables() throws RecognitionException {
		Assign_variablesContext _localctx = new Assign_variablesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_variables);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(TEXT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				anidar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				array_access();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
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
	public static class Array_initContext extends ParserRuleContext {
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public Assign_variablesContext assign_variables() {
			return getRuleContext(Assign_variablesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 22, RULE_array_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			array_access();
			setState(166);
			match(ASSIGN);
			setState(167);
			assign_variables();
			setState(168);
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
		public ArrayBi_accessContext arrayBi_access() {
			return getRuleContext(ArrayBi_accessContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(InterpreterParser.ASSIGN, 0); }
		public Assign_variablesContext assign_variables() {
			return getRuleContext(Assign_variablesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(InterpreterParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 24, RULE_arrayBi_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			arrayBi_access();
			setState(171);
			match(ASSIGN);
			setState(172);
			assign_variables();
			setState(173);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 26, RULE_array_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
			setState(176);
			match(OPEN_BRACKET);
			setState(177);
			expression();
			setState(178);
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
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(InterpreterParser.OPEN_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 28, RULE_arrayBi_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(OPEN_BRACKET);
			setState(182);
			expression();
			setState(183);
			match(COMMA);
			setState(184);
			expression();
			setState(185);
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
		enterRule(_localctx, 30, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(FOR);
			setState(188);
			match(ID);
			setState(189);
			match(ASSIGN);
			setState(190);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(191);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(193);
			match(DO);
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(194);
				match(BEGIN);
				setState(195);
				statements();
				setState(196);
				match(END);
				}
				break;
			case 2:
				{
				setState(198);
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
		enterRule(_localctx, 32, RULE_writeln_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(WRITELN);
			setState(202);
			match(OPEN_PARENTHESIS);
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(204);
				match(COMMA);
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(205);
					match(ID);
					}
					break;
				case 2:
					{
					setState(206);
					match(TEXT);
					}
					break;
				case 3:
					{
					setState(207);
					array_access();
					}
					break;
				case 4:
					{
					setState(208);
					arrayBi_access();
					}
					break;
				}
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(CLOSE_PARENTHESIS);
			setState(217);
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
		enterRule(_localctx, 34, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(WRITE);
			setState(220);
			match(OPEN_PARENTHESIS);
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(222);
				match(COMMA);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(223);
					match(ID);
					}
					break;
				case 2:
					{
					setState(224);
					match(TEXT);
					}
					break;
				case 3:
					{
					setState(225);
					array_access();
					}
					break;
				case 4:
					{
					setState(226);
					arrayBi_access();
					}
					break;
				}
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(CLOSE_PARENTHESIS);
			setState(235);
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
		enterRule(_localctx, 36, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(WHILE);
			setState(238);
			expression();
			setState(239);
			match(DO);
			setState(240);
			match(BEGIN);
			setState(241);
			statements();
			setState(242);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(InterpreterParser.THEN, 0); }
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
		enterRule(_localctx, 38, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(IF);
			setState(245);
			expression();
			setState(246);
			match(THEN);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(247);
				statement();
				}
				break;
			case 2:
				{
				setState(248);
				match(BEGIN);
				setState(249);
				statements();
				setState(250);
				match(END);
				}
				break;
			}
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(254);
				match(ELSE);
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(255);
					statement();
					}
					break;
				case 2:
					{
					setState(256);
					match(BEGIN);
					setState(257);
					statements();
					setState(258);
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
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				variable_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				array_init();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				arrayBi_init();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				writeln_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				write();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				match(BEGIN);
				setState(273);
				statements();
				setState(274);
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
		public TerminalNode EQUALS() { return getToken(InterpreterParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(InterpreterParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(InterpreterParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUALS() { return getToken(InterpreterParser.LESS_THAN_OR_EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(InterpreterParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUALS() { return getToken(InterpreterParser.GREATER_THAN_OR_EQUALS, 0); }
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
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			simple_expression();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) {
				{
				setState(279);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(280);
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
	public static class Simple_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(InterpreterParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(InterpreterParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(InterpreterParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(InterpreterParser.MINUS, i);
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
		enterRule(_localctx, 44, RULE_simple_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			term();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(284);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(285);
				term();
				}
				}
				setState(290);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(InterpreterParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(InterpreterParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(InterpreterParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(InterpreterParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			factor();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(292);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(293);
				factor();
				}
				}
				setState(298);
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
		public TerminalNode STRING() { return getToken(InterpreterParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(InterpreterParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(InterpreterParser.FALSE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode NOT() { return getToken(InterpreterParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
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
		enterRule(_localctx, 48, RULE_factor);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(STRING);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(FALSE);
				}
				break;
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 6);
				{
				setState(304);
				match(OPEN_PARENTHESIS);
				setState(305);
				expression();
				setState(306);
				match(CLOSE_PARENTHESIS);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				match(NOT);
				setState(309);
				factor();
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
	public static class AnidarContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(InterpreterParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterpreterParser.TEXT, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(InterpreterParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(InterpreterParser.PLUS, i);
		}
		public AnidarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anidar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterAnidar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitAnidar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitAnidar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnidarContext anidar() throws RecognitionException {
		AnidarContext _localctx = new AnidarContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_anidar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(TEXT);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(313);
				match(PLUS);
				setState(314);
				match(TEXT);
				}
				}
				setState(319);
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
	public static class Procedure_declarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(InterpreterParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(InterpreterParser.ID, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(InterpreterParser.OPEN_PARENTHESIS, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(InterpreterParser.CLOSE_PARENTHESIS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(InterpreterParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(InterpreterParser.SEMICOLON, i);
		}
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
		enterRule(_localctx, 52, RULE_procedure_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(PROCEDURE);
			setState(321);
			match(ID);
			setState(322);
			match(OPEN_PARENTHESIS);
			setState(323);
			parameters();
			setState(324);
			match(CLOSE_PARENTHESIS);
			setState(325);
			match(SEMICOLON);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(326);
				declarations();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(BEGIN);
			setState(333);
			statements();
			setState(334);
			match(END);
			setState(335);
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

	public static final String _serializedATN =
		"\u0004\u00014\u0152\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001J\b\u0001"+
		"\u000b\u0001\f\u0001K\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"Q\b\u0002\n\u0002\f\u0002T\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003b\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0087\b\u0006"+
		"\n\u0006\f\u0006\u008a\t\u0006\u0003\u0006\u008c\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0005\b\u0093\b\b\n\b\f\b\u0096"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a4\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c8"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d2\b\u0010\u0005\u0010\u00d4"+
		"\b\u0010\n\u0010\f\u0010\u00d7\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00e4\b\u0011\u0005\u0011\u00e6\b"+
		"\u0011\n\u0011\f\u0011\u00e9\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00fd\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0105\b\u0013\u0003\u0013\u0107\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0115\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u011a\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u011f\b\u0016\n\u0016\f\u0016\u0122\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0127\b\u0017\n\u0017"+
		"\f\u0017\u012a\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0137\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u013c\b\u0019\n\u0019\f\u0019\u013f\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0148\b\u001a\n\u001a\f\u001a\u014b\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.024\u0000\u0006\u0001\u0000-.\u0002\u0000\u0001\u0001\u0003"+
		"\u0003\u0002\u0000--11\u0001\u0000\u001d\"\u0001\u0000\u0012\u0013\u0001"+
		"\u0000\u0014\u0015\u0166\u00006\u0001\u0000\u0000\u0000\u0002C\u0001\u0000"+
		"\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006Y\u0001\u0000\u0000\u0000"+
		"\bg\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000"+
		"\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000\u0010\u0094\u0001\u0000"+
		"\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000\u0014\u00a3\u0001\u0000"+
		"\u0000\u0000\u0016\u00a5\u0001\u0000\u0000\u0000\u0018\u00aa\u0001\u0000"+
		"\u0000\u0000\u001a\u00af\u0001\u0000\u0000\u0000\u001c\u00b4\u0001\u0000"+
		"\u0000\u0000\u001e\u00bb\u0001\u0000\u0000\u0000 \u00c9\u0001\u0000\u0000"+
		"\u0000\"\u00db\u0001\u0000\u0000\u0000$\u00ed\u0001\u0000\u0000\u0000"+
		"&\u00f4\u0001\u0000\u0000\u0000(\u0114\u0001\u0000\u0000\u0000*\u0116"+
		"\u0001\u0000\u0000\u0000,\u011b\u0001\u0000\u0000\u0000.\u0123\u0001\u0000"+
		"\u0000\u00000\u0136\u0001\u0000\u0000\u00002\u0138\u0001\u0000\u0000\u0000"+
		"4\u0140\u0001\u0000\u0000\u000067\u0005\u0004\u0000\u000078\u0005-\u0000"+
		"\u00008<\u0005,\u0000\u00009;\u0003\u0002\u0001\u0000:9\u0001\u0000\u0000"+
		"\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0005\u0000\u0000@A\u0003\u0010\b\u0000AB\u0005\u0007\u0000\u0000B\u0001"+
		"\u0001\u0000\u0000\u0000CI\u0005\b\u0000\u0000DJ\u0003\u0004\u0002\u0000"+
		"EJ\u0003\u0006\u0003\u0000FJ\u0003\b\u0004\u0000GJ\u0003\n\u0005\u0000"+
		"HJ\u00034\u001a\u0000ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000"+
		"IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000L\u0003\u0001\u0000\u0000\u0000MR\u0005-\u0000\u0000NO\u0005"+
		"\n\u0000\u0000OQ\u0005-\u0000\u0000PN\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SU\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0005%\u0000\u0000"+
		"VW\u0005#\u0000\u0000WX\u0005,\u0000\u0000X\u0005\u0001\u0000\u0000\u0000"+
		"YZ\u0005-\u0000\u0000Z[\u0005%\u0000\u0000[a\u0005\u000f\u0000\u0000\\"+
		"]\u0005*\u0000\u0000]^\u0005.\u0000\u0000^_\u0005&\u0000\u0000_`\u0005"+
		".\u0000\u0000`b\u0005+\u0000\u0000a\\\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0002\u0000\u0000"+
		"de\u0005#\u0000\u0000ef\u0005,\u0000\u0000f\u0007\u0001\u0000\u0000\u0000"+
		"gh\u0005-\u0000\u0000hi\u0005%\u0000\u0000ij\u0005\u000f\u0000\u0000j"+
		"k\u0005*\u0000\u0000kl\u0005.\u0000\u0000lm\u0005&\u0000\u0000mn\u0005"+
		".\u0000\u0000no\u0005\n\u0000\u0000op\u0005.\u0000\u0000pq\u0005&\u0000"+
		"\u0000qr\u0005.\u0000\u0000rs\u0005+\u0000\u0000st\u0005\u0002\u0000\u0000"+
		"tu\u0005#\u0000\u0000uv\u0005,\u0000\u0000v\t\u0001\u0000\u0000\u0000"+
		"wx\u0005\u001c\u0000\u0000xy\u0005-\u0000\u0000yz\u0005(\u0000\u0000z"+
		"{\u0003\f\u0006\u0000{|\u0005)\u0000\u0000|}\u0005%\u0000\u0000}~\u0005"+
		"#\u0000\u0000~\u007f\u0005,\u0000\u0000\u007f\u0080\u0005\u0005\u0000"+
		"\u0000\u0080\u0081\u0003\u0010\b\u0000\u0081\u0082\u0005\u0006\u0000\u0000"+
		"\u0082\u000b\u0001\u0000\u0000\u0000\u0083\u0088\u0003\u000e\u0007\u0000"+
		"\u0084\u0085\u0005\n\u0000\u0000\u0085\u0087\u0003\u000e\u0007\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u0083\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\r\u0001\u0000\u0000\u0000\u008d\u008e\u0005-\u0000\u0000\u008e\u008f"+
		"\u0005%\u0000\u0000\u008f\u0090\u0005#\u0000\u0000\u0090\u000f\u0001\u0000"+
		"\u0000\u0000\u0091\u0093\u0003(\u0014\u0000\u0092\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0011\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005-\u0000\u0000"+
		"\u0098\u0099\u0005$\u0000\u0000\u0099\u009a\u0003\u0014\n\u0000\u009a"+
		"\u009b\u0005,\u0000\u0000\u009b\u0013\u0001\u0000\u0000\u0000\u009c\u00a4"+
		"\u0005-\u0000\u0000\u009d\u00a4\u0005.\u0000\u0000\u009e\u00a4\u00051"+
		"\u0000\u0000\u009f\u00a4\u0003*\u0015\u0000\u00a0\u00a4\u00032\u0019\u0000"+
		"\u00a1\u00a4\u0003\u001a\r\u0000\u00a2\u00a4\u0003\u001c\u000e\u0000\u00a3"+
		"\u009c\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000\u00a3"+
		"\u009e\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0003\u001a\r\u0000\u00a6\u00a7\u0005$\u0000\u0000\u00a7\u00a8"+
		"\u0003\u0014\n\u0000\u00a8\u00a9\u0005,\u0000\u0000\u00a9\u0017\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0003\u001c\u000e\u0000\u00ab\u00ac\u0005"+
		"$\u0000\u0000\u00ac\u00ad\u0003\u0014\n\u0000\u00ad\u00ae\u0005,\u0000"+
		"\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00b0\u0005-\u0000\u0000"+
		"\u00b0\u00b1\u0005*\u0000\u0000\u00b1\u00b2\u0003*\u0015\u0000\u00b2\u00b3"+
		"\u0005+\u0000\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"-\u0000\u0000\u00b5\u00b6\u0005*\u0000\u0000\u00b6\u00b7\u0003*\u0015"+
		"\u0000\u00b7\u00b8\u0005\n\u0000\u0000\u00b8\u00b9\u0003*\u0015\u0000"+
		"\u00b9\u00ba\u0005+\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005\u000b\u0000\u0000\u00bc\u00bd\u0005-\u0000\u0000\u00bd\u00be"+
		"\u0005$\u0000\u0000\u00be\u00bf\u0007\u0000\u0000\u0000\u00bf\u00c0\u0007"+
		"\u0001\u0000\u0000\u00c0\u00c1\u0007\u0000\u0000\u0000\u00c1\u00c7\u0005"+
		"\u000e\u0000\u0000\u00c2\u00c3\u0005\u0005\u0000\u0000\u00c3\u00c4\u0003"+
		"\u0010\b\u0000\u00c4\u00c5\u0005\u0006\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c8\u0003(\u0014\u0000\u00c7\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u001f\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005\u0010\u0000\u0000\u00ca\u00cb\u0005(\u0000\u0000"+
		"\u00cb\u00d5\u0007\u0002\u0000\u0000\u00cc\u00d1\u0005\n\u0000\u0000\u00cd"+
		"\u00d2\u0005-\u0000\u0000\u00ce\u00d2\u00051\u0000\u0000\u00cf\u00d2\u0003"+
		"\u001a\r\u0000\u00d0\u00d2\u0003\u001c\u000e\u0000\u00d1\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d3\u00cc\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005)\u0000\u0000\u00d9\u00da\u0005,\u0000\u0000"+
		"\u00da!\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0011\u0000\u0000\u00dc"+
		"\u00dd\u0005(\u0000\u0000\u00dd\u00e7\u0007\u0002\u0000\u0000\u00de\u00e3"+
		"\u0005\n\u0000\u0000\u00df\u00e4\u0005-\u0000\u0000\u00e0\u00e4\u0005"+
		"1\u0000\u0000\u00e1\u00e4\u0003\u001a\r\u0000\u00e2\u00e4\u0003\u001c"+
		"\u000e\u0000\u00e3\u00df\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00de\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005)\u0000"+
		"\u0000\u00eb\u00ec\u0005,\u0000\u0000\u00ec#\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005\f\u0000\u0000\u00ee\u00ef\u0003*\u0015\u0000\u00ef\u00f0"+
		"\u0005\u000e\u0000\u0000\u00f0\u00f1\u0005\u0005\u0000\u0000\u00f1\u00f2"+
		"\u0003\u0010\b\u0000\u00f2\u00f3\u0005\u0006\u0000\u0000\u00f3%\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005\u0017\u0000\u0000\u00f5\u00f6\u0003"+
		"*\u0015\u0000\u00f6\u00fc\u0005\u0018\u0000\u0000\u00f7\u00fd\u0003(\u0014"+
		"\u0000\u00f8\u00f9\u0005\u0005\u0000\u0000\u00f9\u00fa\u0003\u0010\b\u0000"+
		"\u00fa\u00fb\u0005\u0006\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f7\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fd\u0106\u0001\u0000\u0000\u0000\u00fe\u0104\u0005\u0016\u0000\u0000"+
		"\u00ff\u0105\u0003(\u0014\u0000\u0100\u0101\u0005\u0005\u0000\u0000\u0101"+
		"\u0102\u0003\u0010\b\u0000\u0102\u0103\u0005\u0006\u0000\u0000\u0103\u0105"+
		"\u0001\u0000\u0000\u0000\u0104\u00ff\u0001\u0000\u0000\u0000\u0104\u0100"+
		"\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u00fe"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\'\u0001"+
		"\u0000\u0000\u0000\u0108\u0115\u0003\u0012\t\u0000\u0109\u0115\u0003\u0016"+
		"\u000b\u0000\u010a\u0115\u0003\u0018\f\u0000\u010b\u0115\u0003\u001e\u000f"+
		"\u0000\u010c\u0115\u0003 \u0010\u0000\u010d\u0115\u0003\"\u0011\u0000"+
		"\u010e\u0115\u0003$\u0012\u0000\u010f\u0115\u0003&\u0013\u0000\u0110\u0111"+
		"\u0005\u0005\u0000\u0000\u0111\u0112\u0003\u0010\b\u0000\u0112\u0113\u0005"+
		"\u0006\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0108\u0001"+
		"\u0000\u0000\u0000\u0114\u0109\u0001\u0000\u0000\u0000\u0114\u010a\u0001"+
		"\u0000\u0000\u0000\u0114\u010b\u0001\u0000\u0000\u0000\u0114\u010c\u0001"+
		"\u0000\u0000\u0000\u0114\u010d\u0001\u0000\u0000\u0000\u0114\u010e\u0001"+
		"\u0000\u0000\u0000\u0114\u010f\u0001\u0000\u0000\u0000\u0114\u0110\u0001"+
		"\u0000\u0000\u0000\u0115)\u0001\u0000\u0000\u0000\u0116\u0119\u0003,\u0016"+
		"\u0000\u0117\u0118\u0007\u0003\u0000\u0000\u0118\u011a\u0003,\u0016\u0000"+
		"\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a+\u0001\u0000\u0000\u0000\u011b\u0120\u0003.\u0017\u0000\u011c\u011d"+
		"\u0007\u0004\u0000\u0000\u011d\u011f\u0003.\u0017\u0000\u011e\u011c\u0001"+
		"\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121-\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0128\u00030\u0018"+
		"\u0000\u0124\u0125\u0007\u0005\u0000\u0000\u0125\u0127\u00030\u0018\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129/\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b"+
		"\u0137\u0005-\u0000\u0000\u012c\u0137\u0005.\u0000\u0000\u012d\u0137\u0005"+
		"3\u0000\u0000\u012e\u0137\u0005/\u0000\u0000\u012f\u0137\u00050\u0000"+
		"\u0000\u0130\u0131\u0005(\u0000\u0000\u0131\u0132\u0003*\u0015\u0000\u0132"+
		"\u0133\u0005)\u0000\u0000\u0133\u0137\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0005\u001b\u0000\u0000\u0135\u0137\u00030\u0018\u0000\u0136\u012b\u0001"+
		"\u0000\u0000\u0000\u0136\u012c\u0001\u0000\u0000\u0000\u0136\u012d\u0001"+
		"\u0000\u0000\u0000\u0136\u012e\u0001\u0000\u0000\u0000\u0136\u012f\u0001"+
		"\u0000\u0000\u0000\u0136\u0130\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u01371\u0001\u0000\u0000\u0000\u0138\u013d\u00051\u0000"+
		"\u0000\u0139\u013a\u0005\u0012\u0000\u0000\u013a\u013c\u00051\u0000\u0000"+
		"\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e3\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u00054\u0000\u0000\u0141\u0142\u0005-\u0000\u0000\u0142\u0143\u0005"+
		"(\u0000\u0000\u0143\u0144\u0003\f\u0006\u0000\u0144\u0145\u0005)\u0000"+
		"\u0000\u0145\u0149\u0005,\u0000\u0000\u0146\u0148\u0003\u0002\u0001\u0000"+
		"\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0005\u0005\u0000\u0000\u014d\u014e\u0003\u0010\b\u0000\u014e"+
		"\u014f\u0005\u0006\u0000\u0000\u014f\u0150\u0005,\u0000\u0000\u01505\u0001"+
		"\u0000\u0000\u0000\u0018<IKRa\u0088\u008b\u0094\u00a3\u00c7\u00d1\u00d5"+
		"\u00e3\u00e7\u00fc\u0104\u0106\u0114\u0119\u0120\u0128\u0136\u013d\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}