// Generated from C:/Users/RouterLab/Desktop/Curricular Files/PLC/UTL-Phase1/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACES=1, SEMICOLON=2, COMMA=3, COLON=4, DOT=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, LBRACK=10, RBRACK=11, PLUS=12, MINUS=13, MULT=14, DIV=15, MOD=16, 
		AND=17, OR=18, NOT=19, BIT_AND=20, BIT_OR=21, BIT_XOR=22, L_SHIFT=23, 
		R_SHIFT=24, BIT_NOT=25, LT=26, GT=27, EQ=28, NEQ=29, INC=30, DEC=31, ASSIGN=32, 
		ADD_ASSIGN=33, SUB_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, MOD_ASSIGN=37, 
		TRY=38, THROW=39, CATCH=40, IF=41, ELSE=42, FOR=43, WHILE=44, BREAK=45, 
		CONTINUE=46, RETURN=47, MAIN=48, ONINIT=49, ONSTART=50, STATIC=51, SHARED=52, 
		FLOAT=53, DOUBLE=54, STRING=55, BOOL=56, VOID=57, INT=58, BUY=59, SELL=60, 
		ASK=61, BID=62, TIME=63, HIGH=64, LOW=65, DIGITS=66, VOLUME=67, TYPE=68, 
		TEXT=69, OPEN=70, CLOSE=71, TRADE=72, ORDER=73, CANDLE=74, EXCEPTION=75, 
		REFRESH_RATE=76, GET_CANDLE=77, TERMINATE=78, CONNECT=79, OBSERVE=80, 
		PRINT=81, PREORDER=82, PARALLEL=83, SCHEDULE=84, ID=85, INT_LITERAL=86, 
		FLOAT_LITERAL=87, STRING_LITERAL=88, COMMENT=89;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_functionDeclaration = 3, 
		RULE_assignment = 4, RULE_functionCall = 5, RULE_printCall = 6, RULE_methodCall = 7, 
		RULE_parameterList = 8, RULE_argumentList = 9, RULE_ifStatement = 10, 
		RULE_whileStatement = 11, RULE_forStatement = 12, RULE_tryCatchStatement = 13, 
		RULE_scheduleStatement = 14, RULE_tradeCombination = 15, RULE_controlBlock = 16, 
		RULE_returnStatement = 17, RULE_throwExceptionStatement = 18, RULE_mainBlock = 19, 
		RULE_initBlock = 20, RULE_startBlock = 21, RULE_body = 22, RULE_block = 23, 
		RULE_expression = 24, RULE_atom = 25, RULE_primitiveType = 26, RULE_complexType = 27, 
		RULE_espetialFunction = 28, RULE_espetialVariable = 29, RULE_assign = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "functionDeclaration", "assignment", 
			"functionCall", "printCall", "methodCall", "parameterList", "argumentList", 
			"ifStatement", "whileStatement", "forStatement", "tryCatchStatement", 
			"scheduleStatement", "tradeCombination", "controlBlock", "returnStatement", 
			"throwExceptionStatement", "mainBlock", "initBlock", "startBlock", "body", 
			"block", "expression", "atom", "primitiveType", "complexType", "espetialFunction", 
			"espetialVariable", "assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "','", "':'", "'.'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'|'", "'^'", "'<<'", "'>>'", "'~'", "'<'", "'>'", "'=='", "'!='", "'++'", 
			"'--'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'try'", "'throw'", 
			"'catch'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
			"'return'", "'Main'", "'OnInit'", "'OnStart'", "'static'", "'shared'", 
			"'float'", "'double'", "'string'", "'bool'", "'void'", "'int'", "'BUY'", 
			"'SELL'", "'Ask'", "'Bid'", "'Time'", "'High'", "'Low'", "'Digits'", 
			"'Volume'", "'Type'", "'Text'", "'Open'", "'Close'", "'Trade'", "'Order'", 
			"'Candle'", "'Exception'", "'RefreshRate'", "'GetCandle'", "'Terminate'", 
			"'Connect'", "'Observe'", "'Print'", "'preorder'", "'parallel'", "'@schedule'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACES", "SEMICOLON", "COMMA", "COLON", "DOT", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "AND", "OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "L_SHIFT", 
			"R_SHIFT", "BIT_NOT", "LT", "GT", "EQ", "NEQ", "INC", "DEC", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"TRY", "THROW", "CATCH", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", 
			"RETURN", "MAIN", "ONINIT", "ONSTART", "STATIC", "SHARED", "FLOAT", "DOUBLE", 
			"STRING", "BOOL", "VOID", "INT", "BUY", "SELL", "ASK", "BID", "TIME", 
			"HIGH", "LOW", "DIGITS", "VOLUME", "TYPE", "TEXT", "OPEN", "CLOSE", "TRADE", 
			"ORDER", "CANDLE", "EXCEPTION", "REFRESH_RATE", "GET_CANDLE", "TERMINATE", 
			"CONNECT", "OBSERVE", "PRINT", "PREORDER", "PARALLEL", "SCHEDULE", "ID", 
			"INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "COMMENT"
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
	public String getGrammarFileName() { return "UTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2303866915195985984L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 127999L) != 0) );
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
		public ControlBlockContext controlBlock;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ControlBlockContext controlBlock() {
			return getRuleContext(ControlBlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PrintCallContext printCall() {
			return getRuleContext(PrintCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public ScheduleStatementContext scheduleStatement() {
			return getRuleContext(ScheduleStatementContext.class,0);
		}
		public ThrowExceptionStatementContext throwExceptionStatement() {
			return getRuleContext(ThrowExceptionStatementContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public InitBlockContext initBlock() {
			return getRuleContext(InitBlockContext.class,0);
		}
		public StartBlockContext startBlock() {
			return getRuleContext(StartBlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				((StatementContext)_localctx).controlBlock = controlBlock();
				setState(71);
				match(SEMICOLON);
				System.out.println("Control:"+(((StatementContext)_localctx).controlBlock!=null?_input.getText(((StatementContext)_localctx).controlBlock.start,((StatementContext)_localctx).controlBlock.stop):null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				functionCall();
				setState(75);
				match(SEMICOLON);
				System.out.println("FunctionCall");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				printCall();
				setState(79);
				match(SEMICOLON);
				System.out.println("Built-in:print");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				expression(0);
				setState(83);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				methodCall();
				setState(86);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				ifStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				whileStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(91);
				forStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(92);
				tryCatchStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(93);
				scheduleStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(94);
				throwExceptionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(95);
				mainBlock();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(96);
				initBlock();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(97);
				startBlock();
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
	public static class DeclarationContext extends ParserRuleContext {
		public Token INT_LITERAL;
		public Token ID;
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(UTLParser.STATIC, 0); }
		public TerminalNode SHARED() { return getToken(UTLParser.SHARED, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC || _la==SHARED) {
				{
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==STATIC || _la==SHARED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
				{
				setState(103);
				primitiveType();
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				{
				setState(104);
				complexType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(107);
				match(LBRACK);
				setState(108);
				((DeclarationContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(109);
				match(RBRACK);
				}
			}

			setState(112);
			((DeclarationContext)_localctx).ID = match(ID);
			if ((((DeclarationContext)_localctx).INT_LITERAL!=null?((DeclarationContext)_localctx).INT_LITERAL.getText():null) != null) System.out.println("ArrayDec:"+(((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null)+":"+(((DeclarationContext)_localctx).INT_LITERAL!=null?((DeclarationContext)_localctx).INT_LITERAL.getText():null)); else System.out.println("VarDec:"+(((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null));
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(114);
				match(ASSIGN);
				setState(115);
				expression(0);
				System.out.println("Operator:=");
				}
			}

			setState(120);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public Token ID;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			primitiveType();
			setState(123);
			((FunctionDeclarationContext)_localctx).ID = match(ID);
			setState(124);
			match(LPAREN);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 7864383L) != 0)) {
				{
				setState(125);
				parameterList();
				}
			}

			setState(128);
			match(RPAREN);
			System.out.println("MethodDec:"+(((FunctionDeclarationContext)_localctx).ID!=null?((FunctionDeclarationContext)_localctx).ID.getText():null));
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(130);
				match(THROW);
				setState(131);
				match(EXCEPTION);
				}
				break;
			}
			setState(134);
			body();
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
	public static class AssignmentContext extends ParserRuleContext {
		public AssignContext assign;
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(137);
				match(LBRACK);
				setState(138);
				expression(0);
				setState(139);
				match(RBRACK);
				}
			}

			setState(143);
			((AssignmentContext)_localctx).assign = assign();
			setState(144);
			expression(0);
			System.out.println("Operator:"+(((AssignmentContext)_localctx).assign!=null?_input.getText(((AssignmentContext)_localctx).assign.start,((AssignmentContext)_localctx).assign.stop):null));
			setState(146);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public ComplexTypeContext complexType;
		public ArgumentListContext argumentList;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public EspetialFunctionContext espetialFunction() {
			return getRuleContext(EspetialFunctionContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
				{
				setState(148);
				espetialFunction();
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				{
				setState(149);
				((FunctionCallContext)_localctx).complexType = complexType();
				}
				break;
			case ID:
				{
				setState(150);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(153);
			match(LPAREN);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729382260165582912L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 123391L) != 0)) {
				{
				setState(154);
				((FunctionCallContext)_localctx).argumentList = argumentList();
				}
			}

			setState(157);
			match(RPAREN);
			if ("Exception".equals((((FunctionCallContext)_localctx).complexType!=null?_input.getText(((FunctionCallContext)_localctx).complexType.start,((FunctionCallContext)_localctx).complexType.stop):null))) System.out.println("ErrorControl:"+(((FunctionCallContext)_localctx).argumentList!=null?_input.getText(((FunctionCallContext)_localctx).argumentList.start,((FunctionCallContext)_localctx).argumentList.stop):null).split(",", 2)[0]);
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
	public static class PrintCallContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(UTLParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public PrintCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterPrintCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitPrintCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitPrintCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintCallContext printCall() throws RecognitionException {
		PrintCallContext _localctx = new PrintCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(PRINT);
			setState(161);
			match(LPAREN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729382260165582912L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 123391L) != 0)) {
				{
				setState(162);
				argumentList();
				}
			}

			setState(165);
			match(RPAREN);
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
	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(168);
				match(LBRACK);
				setState(169);
				expression(0);
				setState(170);
				match(RBRACK);
				}
			}

			setState(174);
			match(DOT);
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==OPEN || _la==CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			match(LPAREN);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729382260165582912L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 123391L) != 0)) {
				{
				setState(177);
				argumentList();
				}
			}

			setState(180);
			match(RPAREN);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(UTLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UTLParser.ID, i);
		}
		public List<PrimitiveTypeContext> primitiveType() {
			return getRuleContexts(PrimitiveTypeContext.class);
		}
		public PrimitiveTypeContext primitiveType(int i) {
			return getRuleContext(PrimitiveTypeContext.class,i);
		}
		public List<ComplexTypeContext> complexType() {
			return getRuleContexts(ComplexTypeContext.class);
		}
		public ComplexTypeContext complexType(int i) {
			return getRuleContext(ComplexTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
				{
				setState(182);
				primitiveType();
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				{
				setState(183);
				complexType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(186);
			match(ID);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(187);
				match(COMMA);
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
					{
					setState(188);
					primitiveType();
					}
					break;
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
					{
					setState(189);
					complexType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192);
				match(ID);
				}
				}
				setState(198);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			expression(0);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				expression(0);
				}
				}
				setState(206);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(UTLParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UTLParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IF);
			System.out.println("Conditional:if");
			setState(209);
			match(LPAREN);
			setState(210);
			expression(0);
			setState(211);
			match(RPAREN);
			setState(212);
			body();
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(213);
				match(ELSE);
				System.out.println("Conditional:else");
				setState(215);
				body();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(UTLParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(WHILE);
			System.out.println("Loop:while");
			setState(220);
			match(LPAREN);
			setState(221);
			expression(0);
			setState(222);
			match(RPAREN);
			setState(223);
			body();
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(UTLParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(FOR);
			System.out.println("Loop:for");
			setState(227);
			match(LPAREN);
			setState(228);
			statement();
			setState(229);
			expression(0);
			setState(230);
			match(SEMICOLON);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729382260165582912L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 123391L) != 0)) {
				{
				setState(231);
				expression(0);
				}
			}

			setState(234);
			match(RPAREN);
			setState(235);
			body();
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
	public static class TryCatchStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(UTLParser.TRY, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode CATCH() { return getToken(UTLParser.CATCH, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tryCatchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(TRY);
			setState(238);
			body();
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(239);
				match(CATCH);
				setState(240);
				match(EXCEPTION);
				setState(241);
				match(ID);
				setState(242);
				body();
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
	public static class ScheduleStatementContext extends ParserRuleContext {
		public TerminalNode SCHEDULE() { return getToken(UTLParser.SCHEDULE, 0); }
		public TradeCombinationContext tradeCombination() {
			return getRuleContext(TradeCombinationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ScheduleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheduleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterScheduleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitScheduleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitScheduleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScheduleStatementContext scheduleStatement() throws RecognitionException {
		ScheduleStatementContext _localctx = new ScheduleStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scheduleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(SCHEDULE);
			setState(246);
			tradeCombination();
			setState(247);
			match(SEMICOLON);
			System.out.println("ConcurrencyControl:Schedule");
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
	public static class TradeCombinationContext extends ParserRuleContext {
		public TerminalNode PREORDER() { return getToken(UTLParser.PREORDER, 0); }
		public List<TerminalNode> ID() { return getTokens(UTLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UTLParser.ID, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(UTLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(UTLParser.LPAREN, i);
		}
		public List<TradeCombinationContext> tradeCombination() {
			return getRuleContexts(TradeCombinationContext.class);
		}
		public TradeCombinationContext tradeCombination(int i) {
			return getRuleContext(TradeCombinationContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(UTLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(UTLParser.RPAREN, i);
		}
		public TerminalNode PARALLEL() { return getToken(UTLParser.PARALLEL, 0); }
		public TradeCombinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tradeCombination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterTradeCombination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitTradeCombination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitTradeCombination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TradeCombinationContext tradeCombination() throws RecognitionException {
		TradeCombinationContext _localctx = new TradeCombinationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tradeCombination);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(250);
					match(ID);
					}
					break;
				case LPAREN:
					{
					setState(251);
					match(LPAREN);
					setState(252);
					tradeCombination();
					setState(253);
					match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(257);
				match(PREORDER);
				setState(263);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(258);
					match(ID);
					}
					break;
				case LPAREN:
					{
					setState(259);
					match(LPAREN);
					setState(260);
					tradeCombination();
					setState(261);
					match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(265);
					match(ID);
					}
					break;
				case LPAREN:
					{
					setState(266);
					match(LPAREN);
					setState(267);
					tradeCombination();
					setState(268);
					match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(272);
				match(PARALLEL);
				setState(278);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(273);
					match(ID);
					}
					break;
				case LPAREN:
					{
					setState(274);
					match(LPAREN);
					setState(275);
					tradeCombination();
					setState(276);
					match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(ID);
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
	public static class ControlBlockContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(UTLParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(UTLParser.CONTINUE, 0); }
		public ControlBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterControlBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitControlBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitControlBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlBlockContext controlBlock() throws RecognitionException {
		ControlBlockContext _localctx = new ControlBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_controlBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==BREAK || _la==CONTINUE) ) {
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(UTLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(RETURN);
			setState(286);
			expression(0);
			setState(287);
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
	public static class ThrowExceptionStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ThrowExceptionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwExceptionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterThrowExceptionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitThrowExceptionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitThrowExceptionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowExceptionStatementContext throwExceptionStatement() throws RecognitionException {
		ThrowExceptionStatementContext _localctx = new ThrowExceptionStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_throwExceptionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(THROW);
			setState(290);
			expression(0);
			setState(291);
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
	public static class MainBlockContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(UTLParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mainBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(VOID);
			setState(294);
			match(MAIN);
			setState(295);
			match(LPAREN);
			setState(296);
			match(RPAREN);
			setState(297);
			body();
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
	public static class InitBlockContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode ONINIT() { return getToken(UTLParser.ONINIT, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public InitBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterInitBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitInitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitInitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitBlockContext initBlock() throws RecognitionException {
		InitBlockContext _localctx = new InitBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_initBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(VOID);
			setState(300);
			match(ONINIT);
			setState(301);
			match(LPAREN);
			setState(302);
			match(TRADE);
			setState(303);
			match(ID);
			setState(304);
			match(RPAREN);
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(305);
				match(THROW);
				setState(306);
				match(EXCEPTION);
				}
				break;
			}
			setState(309);
			body();
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
	public static class StartBlockContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode ONSTART() { return getToken(UTLParser.ONSTART, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public StartBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStartBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStartBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStartBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartBlockContext startBlock() throws RecognitionException {
		StartBlockContext _localctx = new StartBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_startBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(VOID);
			setState(312);
			match(ONSTART);
			setState(313);
			match(LPAREN);
			setState(314);
			match(TRADE);
			setState(315);
			match(ID);
			setState(316);
			match(RPAREN);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(317);
				match(THROW);
				setState(318);
				match(EXCEPTION);
				}
				break;
			}
			setState(321);
			body();
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
	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_body);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				block();
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case STATIC:
			case SHARED:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case SCHEDULE:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				statement();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(LBRACE);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2303866915195985984L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 127999L) != 0)) {
				{
				{
				setState(328);
				statement();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(RBRACE);
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
		public Token opr;
		public Token AND;
		public Token OR;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(UTLParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(UTLParser.MINUS, 0); }
		public TerminalNode BIT_NOT() { return getToken(UTLParser.BIT_NOT, 0); }
		public TerminalNode INC() { return getToken(UTLParser.INC, 0); }
		public TerminalNode DEC() { return getToken(UTLParser.DEC, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode MULT() { return getToken(UTLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(UTLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(UTLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(UTLParser.PLUS, 0); }
		public TerminalNode L_SHIFT() { return getToken(UTLParser.L_SHIFT, 0); }
		public TerminalNode R_SHIFT() { return getToken(UTLParser.R_SHIFT, 0); }
		public TerminalNode LT() { return getToken(UTLParser.LT, 0); }
		public TerminalNode GT() { return getToken(UTLParser.GT, 0); }
		public TerminalNode EQ() { return getToken(UTLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(UTLParser.NEQ, 0); }
		public TerminalNode BIT_AND() { return getToken(UTLParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(UTLParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(UTLParser.BIT_XOR, 0); }
		public TerminalNode AND() { return getToken(UTLParser.AND, 0); }
		public TerminalNode OR() { return getToken(UTLParser.OR, 0); }
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public EspetialVariableContext espetialVariable() {
			return getRuleContext(EspetialVariableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(337);
				atom();
				}
				break;
			case 2:
				{
				setState(338);
				((ExpressionContext)_localctx).opr = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3255312384L) != 0)) ) {
					((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				expression(13);
				System.out.println("Operator:"+(((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
				}
				break;
			case 3:
				{
				setState(342);
				match(ID);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(343);
					match(LBRACK);
					setState(344);
					expression(0);
					setState(345);
					match(RBRACK);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(349);
				match(LPAREN);
				setState(350);
				expression(0);
				setState(351);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(353);
				functionCall();
				}
				break;
			case 6:
				{
				setState(354);
				methodCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(358);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						expression(13);
						System.out.println("Operator:"+(((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(363);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						expression(12);
						System.out.println("Operator:"+(((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(368);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==L_SHIFT || _la==R_SHIFT) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(369);
						expression(11);
						System.out.println("Operator:"+(((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(372);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(373);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LT || _la==GT) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(374);
						expression(10);
						System.out.println("Operator:"+(((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(377);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(378);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(379);
						expression(9);
						System.out.println("Operator:"+(((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(382);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(383);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(384);
						expression(8);
						System.out.println("Operator:"+(((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(387);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(388);
						((ExpressionContext)_localctx).AND = match(AND);
						setState(389);
						expression(7);
						System.out.println("Operator:"+(((ExpressionContext)_localctx).AND!=null?((ExpressionContext)_localctx).AND.getText():null));
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(392);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(393);
						((ExpressionContext)_localctx).OR = match(OR);
						setState(394);
						expression(6);
						System.out.println("Operator:"+(((ExpressionContext)_localctx).OR!=null?((ExpressionContext)_localctx).OR.getText():null));
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(397);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(398);
						match(DOT);
						setState(399);
						espetialVariable();
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(400);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(401);
						((ExpressionContext)_localctx).opr = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).opr = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						System.out.println("Operator:"+(((ExpressionContext)_localctx).opr!=null?((ExpressionContext)_localctx).opr.getText():null));
						}
						break;
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(UTLParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(UTLParser.STRING_LITERAL, 0); }
		public TerminalNode SELL() { return getToken(UTLParser.SELL, 0); }
		public TerminalNode BUY() { return getToken(UTLParser.BUY, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 939524099L) != 0)) ) {
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
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(UTLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(UTLParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(UTLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(UTLParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(UTLParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 567453553048682496L) != 0)) ) {
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
	public static class ComplexTypeContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitComplexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_complexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 15L) != 0)) ) {
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
	public static class EspetialFunctionContext extends ParserRuleContext {
		public TerminalNode REFRESH_RATE() { return getToken(UTLParser.REFRESH_RATE, 0); }
		public TerminalNode CONNECT() { return getToken(UTLParser.CONNECT, 0); }
		public TerminalNode OBSERVE() { return getToken(UTLParser.OBSERVE, 0); }
		public TerminalNode GET_CANDLE() { return getToken(UTLParser.GET_CANDLE, 0); }
		public TerminalNode TERMINATE() { return getToken(UTLParser.TERMINATE, 0); }
		public EspetialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialFunctionContext espetialFunction() throws RecognitionException {
		EspetialFunctionContext _localctx = new EspetialFunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_espetialFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 31L) != 0)) ) {
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
	public static class EspetialVariableContext extends ParserRuleContext {
		public TerminalNode ASK() { return getToken(UTLParser.ASK, 0); }
		public TerminalNode BID() { return getToken(UTLParser.BID, 0); }
		public TerminalNode TIME() { return getToken(UTLParser.TIME, 0); }
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public TerminalNode HIGH() { return getToken(UTLParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(UTLParser.LOW, 0); }
		public TerminalNode DIGITS() { return getToken(UTLParser.DIGITS, 0); }
		public TerminalNode VOLUME() { return getToken(UTLParser.VOLUME, 0); }
		public TerminalNode TYPE() { return getToken(UTLParser.TYPE, 0); }
		public TerminalNode TEXT() { return getToken(UTLParser.TEXT, 0); }
		public EspetialVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialVariableContext espetialVariable() throws RecognitionException {
		EspetialVariableContext _localctx = new EspetialVariableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_espetialVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 2047L) != 0)) ) {
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(UTLParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(UTLParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(UTLParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(UTLParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(UTLParser.MOD_ASSIGN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001Y\u01a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0004\u0000@\b\u0000\u000b\u0000\f\u0000A\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001c\b\u0001\u0001\u0002\u0003\u0002f\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002j\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"o\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002w\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u007f\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0085\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u008e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0098\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u009c\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a4\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00ad\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00b3\b\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0003\b\u00b9\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bf"+
		"\b\b\u0001\b\u0001\b\u0005\b\u00c3\b\b\n\b\f\b\u00c6\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00cb\b\t\n\t\f\t\u00ce\t\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d9\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00e9\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00f4\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0100\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0108\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010f\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0117\b\u000f\u0001\u000f\u0003\u000f\u011a\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0134\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0140\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0146\b\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u014a\b\u0017\n\u0017"+
		"\f\u0017\u014d\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u015c\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0164\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0194\b\u0018\n\u0018\f\u0018\u0197\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0000\u00010\u001f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<\u0000\u0011\u0001\u000034\u0001\u0000FG\u0001"+
		"\u0000-.\u0004\u0000\r\r\u0013\u0013\u0019\u0019\u001e\u001f\u0001\u0000"+
		"\u000e\u0010\u0001\u0000\f\r\u0001\u0000\u0017\u0018\u0001\u0000\u001a"+
		"\u001b\u0001\u0000\u001c\u001d\u0001\u0000\u0014\u0016\u0001\u0000\u001e"+
		"\u001f\u0002\u0000;<VX\u0001\u00005:\u0001\u0000HK\u0001\u0000LP\u0001"+
		"\u0000=G\u0001\u0000 %\u01c5\u0000?\u0001\u0000\u0000\u0000\u0002b\u0001"+
		"\u0000\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006z\u0001\u0000\u0000"+
		"\u0000\b\u0088\u0001\u0000\u0000\u0000\n\u0097\u0001\u0000\u0000\u0000"+
		"\f\u00a0\u0001\u0000\u0000\u0000\u000e\u00a7\u0001\u0000\u0000\u0000\u0010"+
		"\u00b8\u0001\u0000\u0000\u0000\u0012\u00c7\u0001\u0000\u0000\u0000\u0014"+
		"\u00cf\u0001\u0000\u0000\u0000\u0016\u00da\u0001\u0000\u0000\u0000\u0018"+
		"\u00e1\u0001\u0000\u0000\u0000\u001a\u00ed\u0001\u0000\u0000\u0000\u001c"+
		"\u00f5\u0001\u0000\u0000\u0000\u001e\u0119\u0001\u0000\u0000\u0000 \u011b"+
		"\u0001\u0000\u0000\u0000\"\u011d\u0001\u0000\u0000\u0000$\u0121\u0001"+
		"\u0000\u0000\u0000&\u0125\u0001\u0000\u0000\u0000(\u012b\u0001\u0000\u0000"+
		"\u0000*\u0137\u0001\u0000\u0000\u0000,\u0145\u0001\u0000\u0000\u0000."+
		"\u0147\u0001\u0000\u0000\u00000\u0163\u0001\u0000\u0000\u00002\u0198\u0001"+
		"\u0000\u0000\u00004\u019a\u0001\u0000\u0000\u00006\u019c\u0001\u0000\u0000"+
		"\u00008\u019e\u0001\u0000\u0000\u0000:\u01a0\u0001\u0000\u0000\u0000<"+
		"\u01a2\u0001\u0000\u0000\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000B\u0001\u0001\u0000\u0000\u0000Cc\u0003\u0004\u0002"+
		"\u0000Dc\u0003\b\u0004\u0000Ec\u0003\u0006\u0003\u0000FG\u0003 \u0010"+
		"\u0000GH\u0005\u0002\u0000\u0000HI\u0006\u0001\uffff\uffff\u0000Ic\u0001"+
		"\u0000\u0000\u0000JK\u0003\n\u0005\u0000KL\u0005\u0002\u0000\u0000LM\u0006"+
		"\u0001\uffff\uffff\u0000Mc\u0001\u0000\u0000\u0000NO\u0003\f\u0006\u0000"+
		"OP\u0005\u0002\u0000\u0000PQ\u0006\u0001\uffff\uffff\u0000Qc\u0001\u0000"+
		"\u0000\u0000RS\u00030\u0018\u0000ST\u0005\u0002\u0000\u0000Tc\u0001\u0000"+
		"\u0000\u0000UV\u0003\u000e\u0007\u0000VW\u0005\u0002\u0000\u0000Wc\u0001"+
		"\u0000\u0000\u0000Xc\u0003\"\u0011\u0000Yc\u0003\u0014\n\u0000Zc\u0003"+
		"\u0016\u000b\u0000[c\u0003\u0018\f\u0000\\c\u0003\u001a\r\u0000]c\u0003"+
		"\u001c\u000e\u0000^c\u0003$\u0012\u0000_c\u0003&\u0013\u0000`c\u0003("+
		"\u0014\u0000ac\u0003*\u0015\u0000bC\u0001\u0000\u0000\u0000bD\u0001\u0000"+
		"\u0000\u0000bE\u0001\u0000\u0000\u0000bF\u0001\u0000\u0000\u0000bJ\u0001"+
		"\u0000\u0000\u0000bN\u0001\u0000\u0000\u0000bR\u0001\u0000\u0000\u0000"+
		"bU\u0001\u0000\u0000\u0000bX\u0001\u0000\u0000\u0000bY\u0001\u0000\u0000"+
		"\u0000bZ\u0001\u0000\u0000\u0000b[\u0001\u0000\u0000\u0000b\\\u0001\u0000"+
		"\u0000\u0000b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000b_\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"c\u0003\u0001\u0000\u0000\u0000df\u0007\u0000\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000gj\u0003"+
		"4\u001a\u0000hj\u00036\u001b\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000jn\u0001\u0000\u0000\u0000kl\u0005\n\u0000\u0000lm\u0005V"+
		"\u0000\u0000mo\u0005\u000b\u0000\u0000nk\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005U\u0000\u0000qv\u0006"+
		"\u0002\uffff\uffff\u0000rs\u0005 \u0000\u0000st\u00030\u0018\u0000tu\u0006"+
		"\u0002\uffff\uffff\u0000uw\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0002"+
		"\u0000\u0000y\u0005\u0001\u0000\u0000\u0000z{\u00034\u001a\u0000{|\u0005"+
		"U\u0000\u0000|~\u0005\u0006\u0000\u0000}\u007f\u0003\u0010\b\u0000~}\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0007\u0000\u0000\u0081\u0084\u0006\u0003"+
		"\uffff\uffff\u0000\u0082\u0083\u0005\'\u0000\u0000\u0083\u0085\u0005K"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0003,\u0016"+
		"\u0000\u0087\u0007\u0001\u0000\u0000\u0000\u0088\u008d\u0005U\u0000\u0000"+
		"\u0089\u008a\u0005\n\u0000\u0000\u008a\u008b\u00030\u0018\u0000\u008b"+
		"\u008c\u0005\u000b\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d"+
		"\u0089\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0003<\u001e\u0000\u0090\u0091"+
		"\u00030\u0018\u0000\u0091\u0092\u0006\u0004\uffff\uffff\u0000\u0092\u0093"+
		"\u0005\u0002\u0000\u0000\u0093\t\u0001\u0000\u0000\u0000\u0094\u0098\u0003"+
		"8\u001c\u0000\u0095\u0098\u00036\u001b\u0000\u0096\u0098\u0005U\u0000"+
		"\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009b\u0005\u0006\u0000\u0000\u009a\u009c\u0003\u0012\t\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0007\u0000\u0000"+
		"\u009e\u009f\u0006\u0005\uffff\uffff\u0000\u009f\u000b\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005Q\u0000\u0000\u00a1\u00a3\u0005\u0006\u0000\u0000"+
		"\u00a2\u00a4\u0003\u0012\t\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0007\u0000\u0000\u00a6\r\u0001\u0000\u0000\u0000\u00a7\u00ac"+
		"\u0005U\u0000\u0000\u00a8\u00a9\u0005\n\u0000\u0000\u00a9\u00aa\u0003"+
		"0\u0018\u0000\u00aa\u00ab\u0005\u000b\u0000\u0000\u00ab\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0005"+
		"\u0000\u0000\u00af\u00b0\u0007\u0001\u0000\u0000\u00b0\u00b2\u0005\u0006"+
		"\u0000\u0000\u00b1\u00b3\u0003\u0012\t\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0007\u0000\u0000\u00b5\u000f\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b9\u00034\u001a\u0000\u00b7\u00b9\u00036\u001b\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00c4\u0005U\u0000\u0000\u00bb\u00be"+
		"\u0005\u0003\u0000\u0000\u00bc\u00bf\u00034\u001a\u0000\u00bd\u00bf\u0003"+
		"6\u001b\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005U\u0000"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00bb\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u0011\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00cc\u00030\u0018\u0000"+
		"\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00cb\u00030\u0018\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u0013\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005)\u0000\u0000\u00d0\u00d1\u0006\n\uffff\uffff\u0000\u00d1"+
		"\u00d2\u0005\u0006\u0000\u0000\u00d2\u00d3\u00030\u0018\u0000\u00d3\u00d4"+
		"\u0005\u0007\u0000\u0000\u00d4\u00d8\u0003,\u0016\u0000\u00d5\u00d6\u0005"+
		"*\u0000\u0000\u00d6\u00d7\u0006\n\uffff\uffff\u0000\u00d7\u00d9\u0003"+
		",\u0016\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u0015\u0001\u0000\u0000\u0000\u00da\u00db\u0005,\u0000"+
		"\u0000\u00db\u00dc\u0006\u000b\uffff\uffff\u0000\u00dc\u00dd\u0005\u0006"+
		"\u0000\u0000\u00dd\u00de\u00030\u0018\u0000\u00de\u00df\u0005\u0007\u0000"+
		"\u0000\u00df\u00e0\u0003,\u0016\u0000\u00e0\u0017\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005+\u0000\u0000\u00e2\u00e3\u0006\f\uffff\uffff\u0000"+
		"\u00e3\u00e4\u0005\u0006\u0000\u0000\u00e4\u00e5\u0003\u0002\u0001\u0000"+
		"\u00e5\u00e6\u00030\u0018\u0000\u00e6\u00e8\u0005\u0002\u0000\u0000\u00e7"+
		"\u00e9\u00030\u0018\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0007\u0000\u0000\u00eb\u00ec\u0003,\u0016\u0000\u00ec\u0019\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005&\u0000\u0000\u00ee\u00f3\u0003,\u0016"+
		"\u0000\u00ef\u00f0\u0005(\u0000\u0000\u00f0\u00f1\u0005K\u0000\u0000\u00f1"+
		"\u00f2\u0005U\u0000\u0000\u00f2\u00f4\u0003,\u0016\u0000\u00f3\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u001b\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005T\u0000\u0000\u00f6\u00f7\u0003\u001e"+
		"\u000f\u0000\u00f7\u00f8\u0005\u0002\u0000\u0000\u00f8\u00f9\u0006\u000e"+
		"\uffff\uffff\u0000\u00f9\u001d\u0001\u0000\u0000\u0000\u00fa\u0100\u0005"+
		"U\u0000\u0000\u00fb\u00fc\u0005\u0006\u0000\u0000\u00fc\u00fd\u0003\u001e"+
		"\u000f\u0000\u00fd\u00fe\u0005\u0007\u0000\u0000\u00fe\u0100\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fa\u0001\u0000\u0000\u0000\u00ff\u00fb\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0107\u0005R\u0000"+
		"\u0000\u0102\u0108\u0005U\u0000\u0000\u0103\u0104\u0005\u0006\u0000\u0000"+
		"\u0104\u0105\u0003\u001e\u000f\u0000\u0105\u0106\u0005\u0007\u0000\u0000"+
		"\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0102\u0001\u0000\u0000\u0000"+
		"\u0107\u0103\u0001\u0000\u0000\u0000\u0108\u011a\u0001\u0000\u0000\u0000"+
		"\u0109\u010f\u0005U\u0000\u0000\u010a\u010b\u0005\u0006\u0000\u0000\u010b"+
		"\u010c\u0003\u001e\u000f\u0000\u010c\u010d\u0005\u0007\u0000\u0000\u010d"+
		"\u010f\u0001\u0000\u0000\u0000\u010e\u0109\u0001\u0000\u0000\u0000\u010e"+
		"\u010a\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0116\u0005S\u0000\u0000\u0111\u0117\u0005U\u0000\u0000\u0112\u0113\u0005"+
		"\u0006\u0000\u0000\u0113\u0114\u0003\u001e\u000f\u0000\u0114\u0115\u0005"+
		"\u0007\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0111\u0001"+
		"\u0000\u0000\u0000\u0116\u0112\u0001\u0000\u0000\u0000\u0117\u011a\u0001"+
		"\u0000\u0000\u0000\u0118\u011a\u0005U\u0000\u0000\u0119\u00ff\u0001\u0000"+
		"\u0000\u0000\u0119\u010e\u0001\u0000\u0000\u0000\u0119\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u001f\u0001\u0000\u0000\u0000\u011b\u011c\u0007\u0002"+
		"\u0000\u0000\u011c!\u0001\u0000\u0000\u0000\u011d\u011e\u0005/\u0000\u0000"+
		"\u011e\u011f\u00030\u0018\u0000\u011f\u0120\u0005\u0002\u0000\u0000\u0120"+
		"#\u0001\u0000\u0000\u0000\u0121\u0122\u0005\'\u0000\u0000\u0122\u0123"+
		"\u00030\u0018\u0000\u0123\u0124\u0005\u0002\u0000\u0000\u0124%\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u00059\u0000\u0000\u0126\u0127\u00050\u0000\u0000"+
		"\u0127\u0128\u0005\u0006\u0000\u0000\u0128\u0129\u0005\u0007\u0000\u0000"+
		"\u0129\u012a\u0003,\u0016\u0000\u012a\'\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u00059\u0000\u0000\u012c\u012d\u00051\u0000\u0000\u012d\u012e\u0005"+
		"\u0006\u0000\u0000\u012e\u012f\u0005H\u0000\u0000\u012f\u0130\u0005U\u0000"+
		"\u0000\u0130\u0133\u0005\u0007\u0000\u0000\u0131\u0132\u0005\'\u0000\u0000"+
		"\u0132\u0134\u0005K\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0003,\u0016\u0000\u0136)\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		"9\u0000\u0000\u0138\u0139\u00052\u0000\u0000\u0139\u013a\u0005\u0006\u0000"+
		"\u0000\u013a\u013b\u0005H\u0000\u0000\u013b\u013c\u0005U\u0000\u0000\u013c"+
		"\u013f\u0005\u0007\u0000\u0000\u013d\u013e\u0005\'\u0000\u0000\u013e\u0140"+
		"\u0005K\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0003"+
		",\u0016\u0000\u0142+\u0001\u0000\u0000\u0000\u0143\u0146\u0003.\u0017"+
		"\u0000\u0144\u0146\u0003\u0002\u0001\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146-\u0001\u0000\u0000\u0000"+
		"\u0147\u014b\u0005\b\u0000\u0000\u0148\u014a\u0003\u0002\u0001\u0000\u0149"+
		"\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0005\t\u0000\u0000\u014f/\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0006\u0018\uffff\uffff\u0000\u0151\u0164\u00032\u0019\u0000\u0152\u0153"+
		"\u0007\u0003\u0000\u0000\u0153\u0154\u00030\u0018\r\u0154\u0155\u0006"+
		"\u0018\uffff\uffff\u0000\u0155\u0164\u0001\u0000\u0000\u0000\u0156\u015b"+
		"\u0005U\u0000\u0000\u0157\u0158\u0005\n\u0000\u0000\u0158\u0159\u0003"+
		"0\u0018\u0000\u0159\u015a\u0005\u000b\u0000\u0000\u015a\u015c\u0001\u0000"+
		"\u0000\u0000\u015b\u0157\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u0164\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0006"+
		"\u0000\u0000\u015e\u015f\u00030\u0018\u0000\u015f\u0160\u0005\u0007\u0000"+
		"\u0000\u0160\u0164\u0001\u0000\u0000\u0000\u0161\u0164\u0003\n\u0005\u0000"+
		"\u0162\u0164\u0003\u000e\u0007\u0000\u0163\u0150\u0001\u0000\u0000\u0000"+
		"\u0163\u0152\u0001\u0000\u0000\u0000\u0163\u0156\u0001\u0000\u0000\u0000"+
		"\u0163\u015d\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0195\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\n\f\u0000\u0000\u0166\u0167\u0007\u0004\u0000\u0000\u0167"+
		"\u0168\u00030\u0018\r\u0168\u0169\u0006\u0018\uffff\uffff\u0000\u0169"+
		"\u0194\u0001\u0000\u0000\u0000\u016a\u016b\n\u000b\u0000\u0000\u016b\u016c"+
		"\u0007\u0005\u0000\u0000\u016c\u016d\u00030\u0018\f\u016d\u016e\u0006"+
		"\u0018\uffff\uffff\u0000\u016e\u0194\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\n\n\u0000\u0000\u0170\u0171\u0007\u0006\u0000\u0000\u0171\u0172\u0003"+
		"0\u0018\u000b\u0172\u0173\u0006\u0018\uffff\uffff\u0000\u0173\u0194\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\n\t\u0000\u0000\u0175\u0176\u0007\u0007"+
		"\u0000\u0000\u0176\u0177\u00030\u0018\n\u0177\u0178\u0006\u0018\uffff"+
		"\uffff\u0000\u0178\u0194\u0001\u0000\u0000\u0000\u0179\u017a\n\b\u0000"+
		"\u0000\u017a\u017b\u0007\b\u0000\u0000\u017b\u017c\u00030\u0018\t\u017c"+
		"\u017d\u0006\u0018\uffff\uffff\u0000\u017d\u0194\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\n\u0007\u0000\u0000\u017f\u0180\u0007\t\u0000\u0000\u0180"+
		"\u0181\u00030\u0018\b\u0181\u0182\u0006\u0018\uffff\uffff\u0000\u0182"+
		"\u0194\u0001\u0000\u0000\u0000\u0183\u0184\n\u0006\u0000\u0000\u0184\u0185"+
		"\u0005\u0011\u0000\u0000\u0185\u0186\u00030\u0018\u0007\u0186\u0187\u0006"+
		"\u0018\uffff\uffff\u0000\u0187\u0194\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\n\u0005\u0000\u0000\u0189\u018a\u0005\u0012\u0000\u0000\u018a\u018b\u0003"+
		"0\u0018\u0006\u018b\u018c\u0006\u0018\uffff\uffff\u0000\u018c\u0194\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\n\u000f\u0000\u0000\u018e\u018f\u0005\u0005"+
		"\u0000\u0000\u018f\u0194\u0003:\u001d\u0000\u0190\u0191\n\u000e\u0000"+
		"\u0000\u0191\u0192\u0007\n\u0000\u0000\u0192\u0194\u0006\u0018\uffff\uffff"+
		"\u0000\u0193\u0165\u0001\u0000\u0000\u0000\u0193\u016a\u0001\u0000\u0000"+
		"\u0000\u0193\u016f\u0001\u0000\u0000\u0000\u0193\u0174\u0001\u0000\u0000"+
		"\u0000\u0193\u0179\u0001\u0000\u0000\u0000\u0193\u017e\u0001\u0000\u0000"+
		"\u0000\u0193\u0183\u0001\u0000\u0000\u0000\u0193\u0188\u0001\u0000\u0000"+
		"\u0000\u0193\u018d\u0001\u0000\u0000\u0000\u0193\u0190\u0001\u0000\u0000"+
		"\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u01961\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0007\u000b\u0000\u0000"+
		"\u01993\u0001\u0000\u0000\u0000\u019a\u019b\u0007\f\u0000\u0000\u019b"+
		"5\u0001\u0000\u0000\u0000\u019c\u019d\u0007\r\u0000\u0000\u019d7\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0007\u000e\u0000\u0000\u019f9\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0007\u000f\u0000\u0000\u01a1;\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0007\u0010\u0000\u0000\u01a3=\u0001\u0000\u0000\u0000"+
		"\"Abeinv~\u0084\u008d\u0097\u009b\u00a3\u00ac\u00b2\u00b8\u00be\u00c4"+
		"\u00cc\u00d8\u00e8\u00f3\u00ff\u0107\u010e\u0116\u0119\u0133\u013f\u0145"+
		"\u014b\u015b\u0163\u0193\u0195";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}