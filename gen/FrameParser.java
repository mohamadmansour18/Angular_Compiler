package gen;// Generated from C:/Users/LENOVO/Music/2/TypeScriptCompiler/Main.FrameParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FrameParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Body=1, Type=2, Void=3, Injectable=4, Component=5, Interface=6, Import=7, 
		From=8, Async=9, Await=10, TypeDeclare=11, ReadOnly=12, Export=13, Arrow=14, 
		Return=15, Console=16, Never=17, Function=18, Constructor=19, Accessmodifier=20, 
		SetGet=21, Enum=22, If=23, Else=24, For=25, While=26, ATT=27, Implements=28, 
		Const=29, ASTERISK=30, STRUCTURAL_DIRECTIVE=31, LT=32, GT=33, SLASH_GT=34, 
		SLASH_LT=35, HASH=36, TEQUAL=37, LBRACKET=38, RBRACKET=39, LPAREN=40, 
		RPAREN=41, LBRACKET_PAREN=42, RBRACKET_PAREN=43, LBRACE=44, RBRACE=45, 
		LBRACKETS=46, RBRACKETS=47, COLON=48, EQUALS=49, SEMICOLON=50, COMMA=51, 
		DOT=52, QUESTION=53, PIPE=54, ANDAND=55, OROR=56, NOTEQUAL=57, EQUALEQUAL=58, 
		COMPARISON=59, PLUS=60, MINUS=61, DIV=62, NOT=63, Class=64, AS=65, LET=66, 
		OF=67, AngularQut=68, STRING=69, NUMBER=70, BOOLEAN=71, NULL=72, IDENTIFIER=73, 
		IDENT=74, ESCAPE=75, WS=76, And=77, Or=78, SEMICOLONColon=79;
	public static final int
		RULE_rootprogram = 0, RULE_program = 1, RULE_statements = 2, RULE_stetment = 3, 
		RULE_prefix = 4, RULE_component = 5, RULE_services = 6, RULE_import_rule = 7, 
		RULE_operations = 8, RULE_class = 9, RULE_var = 10, RULE_classbody = 11, 
		RULE_constructor = 12, RULE_interface = 13, RULE_interfacebody = 14, RULE_interfacefun = 15, 
		RULE_interfacevar = 16, RULE_enum = 17, RULE_enumassignable = 18, RULE_enumAssin = 19, 
		RULE_number_STRING_BOOLEAN = 20, RULE_class_function = 21, RULE_function = 22, 
		RULE_body_with_out_curly = 23, RULE_body = 24, RULE_basedata = 25, RULE_info = 26, 
		RULE_array = 27, RULE_data = 28, RULE_typeequal = 29, RULE_return = 30, 
		RULE_typedeclare = 31, RULE_prameters = 32, RULE_header = 33, RULE_arrowfunction = 34, 
		RULE_print = 35, RULE_prameter = 36, RULE_arguments = 37, RULE_argument = 38, 
		RULE_vardeclare = 39, RULE_keyword = 40, RULE_equal = 41, RULE_equalbasedata = 42, 
		RULE_types = 43, RULE_type = 44, RULE_access = 45, RULE_culls = 46, RULE_cullfunction = 47, 
		RULE_objects = 48, RULE_object = 49, RULE_objectstype = 50, RULE_objecttype = 51, 
		RULE_typecurles = 52, RULE_typecurle = 53, RULE_template = 54, RULE_element = 55, 
		RULE_content = 56, RULE_elementContent = 57, RULE_htmlElement = 58, RULE_character = 59, 
		RULE_tagOpenEmpty = 60, RULE_tagOpen = 61, RULE_tagClose = 62, RULE_attribute = 63, 
		RULE_angularComponent = 64, RULE_directiveElement = 65, RULE_structuralDirective = 66, 
		RULE_attributeDirective = 67, RULE_twoWayDirective = 68, RULE_expression = 69, 
		RULE_logicalOrExpression = 70, RULE_logicalAndExpression = 71, RULE_equalityExpression = 72, 
		RULE_relationalExpression = 73, RULE_additiveExpression = 74, RULE_multiplicativeExpression = 75, 
		RULE_unaryExpression = 76, RULE_primaryExpression = 77, RULE_pipeExpression = 78, 
		RULE_baseExpression = 79, RULE_literal = 80, RULE_functionCall = 81, RULE_arrayLiteral = 82, 
		RULE_objectLiteral = 83, RULE_propLitiral = 84, RULE_interpolation = 85, 
		RULE_text = 86, RULE_if_statement = 87, RULE_loop_statement = 88, RULE_while = 89, 
		RULE_for = 90, RULE_loop_init = 91, RULE_loop_step = 92;
	private static String[] makeRuleNames() {
		return new String[] {
			"rootprogram", "program", "statements", "stetment", "prefix", "component", 
			"services", "import_rule", "operations", "class", "var", "classbody", 
			"constructor", "interface", "interfacebody", "interfacefun", "interfacevar", 
			"enum", "enumassignable", "enumAssin", "number_STRING_BOOLEAN", "class_function", 
			"function", "body_with_out_curly", "body", "basedata", "info", "array", 
			"data", "typeequal", "return", "typedeclare", "prameters", "header", 
			"arrowfunction", "print", "prameter", "arguments", "argument", "vardeclare", 
			"keyword", "equal", "equalbasedata", "types", "type", "access", "culls", 
			"cullfunction", "objects", "object", "objectstype", "objecttype", "typecurles", 
			"typecurle", "template", "element", "content", "elementContent", "htmlElement", 
			"character", "tagOpenEmpty", "tagOpen", "tagClose", "attribute", "angularComponent", 
			"directiveElement", "structuralDirective", "attributeDirective", "twoWayDirective", 
			"expression", "logicalOrExpression", "logicalAndExpression", "equalityExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "primaryExpression", "pipeExpression", "baseExpression", 
			"literal", "functionCall", "arrayLiteral", "objectLiteral", "propLitiral", 
			"interpolation", "text", "if_statement", "loop_statement", "while", "for", 
			"loop_init", "loop_step"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'body'", null, "'void'", "'Injectable'", "'Component'", "'interface'", 
			"'import'", "'from'", "'async'", "'await'", "'type'", "'readonly'", "'export'", 
			"'=>'", "'return'", "'console'", "'never'", "'function'", "'constructor'", 
			null, null, "'enum'", "'if'", "'else'", "'for'", "'while'", "'@'", "'implements'", 
			"'const'", "'*'", null, "'<'", "'>'", "'</'", "'/>'", "'#'", "'==='", 
			"'['", "']'", "'('", "')'", "'[('", "')]'", "'{{'", "'}}'", "'{'", "'}'", 
			"':'", "'='", "';'", "','", "'.'", "'?'", "'|'", "'&&'", "'||'", "'!='", 
			"'=='", null, "'+'", "'-'", "'/'", "'!'", "'class'", "'as'", "'let'", 
			"'of'", "'`'", null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Body", "Type", "Void", "Injectable", "Component", "Interface", 
			"Import", "From", "Async", "Await", "TypeDeclare", "ReadOnly", "Export", 
			"Arrow", "Return", "Console", "Never", "Function", "Constructor", "Accessmodifier", 
			"SetGet", "Enum", "If", "Else", "For", "While", "ATT", "Implements", 
			"Const", "ASTERISK", "STRUCTURAL_DIRECTIVE", "LT", "GT", "SLASH_GT", 
			"SLASH_LT", "HASH", "TEQUAL", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", 
			"LBRACKET_PAREN", "RBRACKET_PAREN", "LBRACE", "RBRACE", "LBRACKETS", 
			"RBRACKETS", "COLON", "EQUALS", "SEMICOLON", "COMMA", "DOT", "QUESTION", 
			"PIPE", "ANDAND", "OROR", "NOTEQUAL", "EQUALEQUAL", "COMPARISON", "PLUS", 
			"MINUS", "DIV", "NOT", "Class", "AS", "LET", "OF", "AngularQut", "STRING", 
			"NUMBER", "BOOLEAN", "NULL", "IDENTIFIER", "IDENT", "ESCAPE", "WS", "And", 
			"Or", "SEMICOLONColon"
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
	public String getGrammarFileName() { return "FrameParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FrameParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootprogramContext extends ParserRuleContext {
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public TerminalNode EOF() { return getToken(FrameParser.EOF, 0); }
		public RootprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootprogram; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor) return ((FrameParserVisitor<? extends T>)visitor).visitRootprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootprogramContext rootprogram() throws RecognitionException {
		RootprogramContext _localctx = new RootprogramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rootprogram);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17597265685696L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 549L) != 0)) {
					{
					{
					setState(186);
					program();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(EOF);
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
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(195);
					statements();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(198); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class StatementsContext extends ParserRuleContext {
		public StetmentContext stetment() {
			return getRuleContext(StetmentContext.class,0);
		}
		public TerminalNode Export() { return getToken(FrameParser.Export, 0); }
		public TerminalNode Await() { return getToken(FrameParser.Await, 0); }
		public TerminalNode SEMICOLON() { return getToken(FrameParser.SEMICOLON, 0); }
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(200);
				match(Export);
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Await) {
				{
				setState(203);
				match(Await);
				}
			}

			{
			setState(206);
			stetment();
			}
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(207);
				match(SEMICOLON);
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
	public static class StetmentContext extends ParserRuleContext {
		public StetmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stetment; }
	 
		public StetmentContext() { }
		public void copyFrom(StetmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStatementContext extends StetmentContext {
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ComponentStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitComponentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclareStatementContext extends StetmentContext {
		public TypedeclareContext typedeclare() {
			return getRuleContext(TypedeclareContext.class,0);
		}
		public TypeDeclareStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTypeDeclareStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclareStatementContext extends StetmentContext {
		public VardeclareContext vardeclare() {
			return getRuleContext(VardeclareContext.class,0);
		}
		public VarDeclareStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitVarDeclareStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceStatementContext extends StetmentContext {
		public InterfaceContext interface_() {
			return getRuleContext(InterfaceContext.class,0);
		}
		public InterfaceStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInterfaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessStatementContext extends StetmentContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public AccessStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAccessStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends StetmentContext {
		public Import_ruleContext import_rule() {
			return getRuleContext(Import_ruleContext.class,0);
		}
		public ImportStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends StetmentContext {
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public LoopStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStatementContext extends StetmentContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TemplateStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTemplateStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixStatementContext extends StetmentContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public PrefixStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitPrefixStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationsStatementContext extends StetmentContext {
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public OperationsStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitOperationsStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementContext extends StetmentContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StetmentContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassStatementContext extends StetmentContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public ClassStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ServicesStatementContext extends StetmentContext {
		public ServicesContext services() {
			return getRuleContext(ServicesContext.class,0);
		}
		public ServicesStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitServicesStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionStatementContext extends StetmentContext {
		public CullfunctionContext cullfunction() {
			return getRuleContext(CullfunctionContext.class,0);
		}
		public CallFunctionStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitCallFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumStatementContext extends StetmentContext {
		public EnumContext enum_() {
			return getRuleContext(EnumContext.class,0);
		}
		public EnumStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitEnumStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StetmentContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintStatementContext(StetmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StetmentContext stetment() throws RecognitionException {
		StetmentContext _localctx = new StetmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stetment);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ServicesStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				services();
				}
				break;
			case 2:
				_localctx = new ComponentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				component();
				}
				break;
			case 3:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				print();
				}
				break;
			case 4:
				_localctx = new VarDeclareStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				vardeclare();
				}
				break;
			case 5:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				function();
				}
				break;
			case 6:
				_localctx = new CallFunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				cullfunction();
				}
				break;
			case 7:
				_localctx = new AccessStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				access();
				}
				break;
			case 8:
				_localctx = new TypeDeclareStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				typedeclare();
				}
				break;
			case 9:
				_localctx = new EnumStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(218);
				enum_();
				}
				break;
			case 10:
				_localctx = new InterfaceStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(219);
				interface_();
				}
				break;
			case 11:
				_localctx = new ClassStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(220);
				class_();
				}
				break;
			case 12:
				_localctx = new OperationsStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(221);
				operations();
				}
				break;
			case 13:
				_localctx = new ImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(222);
				import_rule();
				}
				break;
			case 14:
				_localctx = new TemplateStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(223);
				template();
				}
				break;
			case 15:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(224);
				if_statement();
				}
				break;
			case 16:
				_localctx = new LoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(225);
				loop_statement();
				}
				break;
			case 17:
				_localctx = new PrefixStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(226);
				prefix();
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
	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public List<TerminalNode> PLUS() { return getTokens(FrameParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(FrameParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(FrameParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(FrameParser.MINUS, i);
		}
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IDENTIFIER);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				{
				setState(230);
				match(PLUS);
				setState(231);
				match(PLUS);
				}
				break;
			case MINUS:
				{
				setState(232);
				match(MINUS);
				setState(233);
				match(MINUS);
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
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode ATT() { return getToken(FrameParser.ATT, 0); }
		public TerminalNode Component() { return getToken(FrameParser.Component, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_component);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(ATT);
				setState(237);
				match(Component);
				setState(238);
				match(LPAREN);
				setState(239);
				objects();
				setState(240);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(ATT);
				setState(243);
				match(Component);
				setState(244);
				match(LPAREN);
				setState(245);
				template();
				setState(246);
				match(RPAREN);
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
	public static class ServicesContext extends ParserRuleContext {
		public TerminalNode ATT() { return getToken(FrameParser.ATT, 0); }
		public TerminalNode Injectable() { return getToken(FrameParser.Injectable, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public ServicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_services; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitServices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServicesContext services() throws RecognitionException {
		ServicesContext _localctx = new ServicesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_services);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ATT);
			setState(251);
			match(Injectable);
			setState(252);
			match(LPAREN);
			setState(253);
			objects();
			setState(254);
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
	public static class Import_ruleContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(FrameParser.Import, 0); }
		public TerminalNode LBRACKETS() { return getToken(FrameParser.LBRACKETS, 0); }
		public TerminalNode RBRACKETS() { return getToken(FrameParser.RBRACKETS, 0); }
		public TerminalNode From() { return getToken(FrameParser.From, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public List<TerminalNode> Component() { return getTokens(FrameParser.Component); }
		public TerminalNode Component(int i) {
			return getToken(FrameParser.Component, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(FrameParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FrameParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public TerminalNode SEMICOLON() { return getToken(FrameParser.SEMICOLON, 0); }
		public Import_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_rule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitImport_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_ruleContext import_rule() throws RecognitionException {
		Import_ruleContext _localctx = new Import_ruleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_import_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(Import);
			setState(257);
			match(LBRACKETS);
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==Component || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259);
				match(COMMA);
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==Component || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(RBRACKETS);
			setState(267);
			match(From);
			setState(268);
			match(STRING);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(269);
				match(SEMICOLON);
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
	public static class OperationsContext extends ParserRuleContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			access();
			setState(273);
			equal();
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(FrameParser.Class, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode LBRACKETS() { return getToken(FrameParser.LBRACKETS, 0); }
		public TerminalNode RBRACKETS() { return getToken(FrameParser.RBRACKETS, 0); }
		public TerminalNode Implements() { return getToken(FrameParser.Implements, 0); }
		public TerminalNode IDENT() { return getToken(FrameParser.IDENT, 0); }
		public List<ClassbodyContext> classbody() {
			return getRuleContexts(ClassbodyContext.class);
		}
		public ClassbodyContext classbody(int i) {
			return getRuleContext(ClassbodyContext.class,i);
		}
		public List<TerminalNode> Accessmodifier() { return getTokens(FrameParser.Accessmodifier); }
		public TerminalNode Accessmodifier(int i) {
			return getToken(FrameParser.Accessmodifier, i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(Class);
			setState(276);
			match(IDENTIFIER);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(277);
				match(Implements);
				setState(278);
				match(IDENT);
				}
			}

			setState(281);
			match(LBRACKETS);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 2305843009213694849L) != 0)) {
				{
				{
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Accessmodifier) {
					{
					setState(282);
					match(Accessmodifier);
					}
				}

				setState(285);
				classbody();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(RBRACKETS);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ReadOnly() { return getToken(FrameParser.ReadOnly, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ReadOnly) {
				{
				setState(293);
				match(ReadOnly);
				}
			}

			{
			{
			setState(296);
			match(IDENTIFIER);
			}
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(299);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
					{
					setState(297);
					type();
					}
					break;
				case TEQUAL:
				case EQUALS:
					{
					setState(298);
					equal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				{
				setState(301);
				type();
				setState(302);
				equal();
				}
				}
				break;
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
	public static class ClassbodyContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FrameParser.SEMICOLON, 0); }
		public Class_functionContext class_function() {
			return getRuleContext(Class_functionContext.class,0);
		}
		public TerminalNode SetGet() { return getToken(FrameParser.SetGet, 0); }
		public ClassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitClassbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassbodyContext classbody() throws RecognitionException {
		ClassbodyContext _localctx = new ClassbodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(306);
				var();
				}
				break;
			case 2:
				{
				setState(307);
				constructor();
				}
				break;
			case 3:
				{
				{
				{
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SetGet) {
					{
					setState(308);
					match(SetGet);
					}
				}

				setState(311);
				class_function();
				}
				}
				}
				break;
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(314);
				match(SEMICOLON);
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode Constructor() { return getToken(FrameParser.Constructor, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode LBRACKETS() { return getToken(FrameParser.LBRACKETS, 0); }
		public TerminalNode RBRACKETS() { return getToken(FrameParser.RBRACKETS, 0); }
		public PrametersContext prameters() {
			return getRuleContext(PrametersContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(Constructor);
			setState(318);
			match(LPAREN);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Accessmodifier || _la==IDENTIFIER) {
				{
				setState(319);
				prameters();
				}
			}

			setState(322);
			match(RPAREN);
			setState(323);
			match(LBRACKETS);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17597265685696L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 549L) != 0)) {
				{
				{
				setState(324);
				statements();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			match(RBRACKETS);
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
	public static class InterfaceContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(FrameParser.Interface, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode LBRACKETS() { return getToken(FrameParser.LBRACKETS, 0); }
		public TerminalNode RBRACKETS() { return getToken(FrameParser.RBRACKETS, 0); }
		public List<InterfacebodyContext> interfacebody() {
			return getRuleContexts(InterfacebodyContext.class);
		}
		public InterfacebodyContext interfacebody(int i) {
			return getRuleContext(InterfacebodyContext.class,i);
		}
		public InterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceContext interface_() throws RecognitionException {
		InterfaceContext _localctx = new InterfaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(Interface);
			setState(333);
			match(IDENTIFIER);
			setState(334);
			match(LBRACKETS);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ReadOnly || _la==IDENTIFIER) {
				{
				{
				setState(335);
				interfacebody();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(RBRACKETS);
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
	public static class InterfacebodyContext extends ParserRuleContext {
		public InterfacefunContext interfacefun() {
			return getRuleContext(InterfacefunContext.class,0);
		}
		public InterfacevarContext interfacevar() {
			return getRuleContext(InterfacevarContext.class,0);
		}
		public InterfacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacebody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInterfacebody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacebodyContext interfacebody() throws RecognitionException {
		InterfacebodyContext _localctx = new InterfacebodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interfacebody);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				interfacefun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				interfacevar();
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
	public static class InterfacefunContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TerminalNode Type() { return getToken(FrameParser.Type, 0); }
		public PrametersContext prameters() {
			return getRuleContext(PrametersContext.class,0);
		}
		public InterfacefunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacefun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInterfacefun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacefunContext interfacefun() throws RecognitionException {
		InterfacefunContext _localctx = new InterfacefunContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfacefun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(IDENTIFIER);
			setState(348);
			match(LPAREN);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Accessmodifier || _la==IDENTIFIER) {
				{
				setState(349);
				prameters();
				}
			}

			setState(352);
			match(RPAREN);
			setState(353);
			match(COLON);
			setState(354);
			match(Type);
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
	public static class InterfacevarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TerminalNode Type() { return getToken(FrameParser.Type, 0); }
		public TerminalNode ReadOnly() { return getToken(FrameParser.ReadOnly, 0); }
		public TerminalNode PIPE() { return getToken(FrameParser.PIPE, 0); }
		public InterfacevarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacevar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInterfacevar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacevarContext interfacevar() throws RecognitionException {
		InterfacevarContext _localctx = new InterfacevarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfacevar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ReadOnly) {
				{
				setState(356);
				match(ReadOnly);
				}
			}

			setState(359);
			match(IDENTIFIER);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(360);
				match(PIPE);
				}
			}

			setState(363);
			match(COLON);
			setState(364);
			match(Type);
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
	public static class EnumContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(FrameParser.Enum, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode LBRACKETS() { return getToken(FrameParser.LBRACKETS, 0); }
		public TerminalNode RBRACKETS() { return getToken(FrameParser.RBRACKETS, 0); }
		public EnumassignableContext enumassignable() {
			return getRuleContext(EnumassignableContext.class,0);
		}
		public EnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(Enum);
			setState(367);
			match(IDENTIFIER);
			setState(368);
			match(LBRACKETS);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(369);
				enumassignable();
				}
			}

			setState(372);
			match(RBRACKETS);
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
	public static class EnumassignableContext extends ParserRuleContext {
		public List<EnumAssinContext> enumAssin() {
			return getRuleContexts(EnumAssinContext.class);
		}
		public EnumAssinContext enumAssin(int i) {
			return getRuleContext(EnumAssinContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public EnumassignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumassignable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitEnumassignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumassignableContext enumassignable() throws RecognitionException {
		EnumassignableContext _localctx = new EnumassignableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumassignable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			enumAssin();
			setState(379);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375);
					match(COMMA);
					setState(376);
					enumAssin();
					}
					} 
				}
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(382);
				match(COMMA);
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
	public static class EnumAssinContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(FrameParser.EQUALS, 0); }
		public Number_STRING_BOOLEANContext number_STRING_BOOLEAN() {
			return getRuleContext(Number_STRING_BOOLEANContext.class,0);
		}
		public EnumAssinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumAssin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitEnumAssin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumAssinContext enumAssin() throws RecognitionException {
		EnumAssinContext _localctx = new EnumAssinContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumAssin);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(385);
				match(IDENTIFIER);
				setState(386);
				match(EQUALS);
				setState(387);
				number_STRING_BOOLEAN();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(388);
				match(IDENTIFIER);
				}
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
	public static class Number_STRING_BOOLEANContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FrameParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(FrameParser.BOOLEAN, 0); }
		public Number_STRING_BOOLEANContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_STRING_BOOLEAN; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitNumber_STRING_BOOLEAN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_STRING_BOOLEANContext number_STRING_BOOLEAN() throws RecognitionException {
		Number_STRING_BOOLEANContext _localctx = new Number_STRING_BOOLEANContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_number_STRING_BOOLEAN);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 7L) != 0)) ) {
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
	public static class Class_functionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Class_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitClass_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_functionContext class_function() throws RecognitionException {
		Class_functionContext _localctx = new Class_functionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_class_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(IDENTIFIER);
			setState(394);
			header();
			setState(395);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(FrameParser.Function, 0); }
		public Class_functionContext class_function() {
			return getRuleContext(Class_functionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(Function);
			setState(398);
			class_function();
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
	public static class Body_with_out_curlyContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public Body_with_out_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_with_out_curly; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitBody_with_out_curly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_with_out_curlyContext body_with_out_curly() throws RecognitionException {
		Body_with_out_curlyContext _localctx = new Body_with_out_curlyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_body_with_out_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(400);
				statements();
				}
				break;
			}
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(403);
				return_();
				}
				break;
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
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LBRACKETS() { return getToken(FrameParser.LBRACKETS, 0); }
		public TerminalNode RBRACKETS() { return getToken(FrameParser.RBRACKETS, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(LBRACKETS);
			{
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17597265685696L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 549L) != 0)) {
				{
				{
				setState(407);
				statements();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(413);
				return_();
				}
			}

			}
			setState(416);
			match(RBRACKETS);
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
	public static class BasedataContext extends ParserRuleContext {
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public BasedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basedata; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitBasedata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasedataContext basedata() throws RecognitionException {
		BasedataContext _localctx = new BasedataContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_basedata);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				info();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(IDENTIFIER);
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
	public static class InfoContext extends ParserRuleContext {
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
	 
		public InfoContext() { }
		public void copyFrom(InfoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectssContext extends InfoContext {
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public ObjectssContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitObjectss(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AngularTempletContext extends InfoContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public AngularTempletContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAngularTemplet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends InfoContext {
		public Number_STRING_BOOLEANContext number_STRING_BOOLEAN() {
			return getRuleContext(Number_STRING_BOOLEANContext.class,0);
		}
		public VariableContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuitAngulatContext extends InfoContext {
		public List<TerminalNode> AngularQut() { return getTokens(FrameParser.AngularQut); }
		public TerminalNode AngularQut(int i) {
			return getToken(FrameParser.AngularQut, i);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public QuitAngulatContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitQuitAngulat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccesssContext extends InfoContext {
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public AccesssContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAccesss(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends InfoContext {
		public CullfunctionContext cullfunction() {
			return getRuleContext(CullfunctionContext.class,0);
		}
		public CallFunctionContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraysContext extends InfoContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArraysContext(InfoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitArrays(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_info);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				number_STRING_BOOLEAN();
				}
				break;
			case 2:
				_localctx = new ObjectssContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				objects();
				}
				break;
			case 3:
				_localctx = new CallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				cullfunction();
				}
				break;
			case 4:
				_localctx = new AccesssContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				access();
				}
				break;
			case 5:
				_localctx = new ArraysContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				array();
				}
				break;
			case 6:
				_localctx = new AngularTempletContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				template();
				}
				break;
			case 7:
				_localctx = new QuitAngulatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(428);
				match(AngularQut);
				setState(429);
				template();
				setState(430);
				match(AngularQut);
				}
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FrameParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(FrameParser.RBRACKET, 0); }
		public List<BasedataContext> basedata() {
			return getRuleContexts(BasedataContext.class);
		}
		public BasedataContext basedata(int i) {
			return getRuleContext(BasedataContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(LBRACKET);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 3229815427137L) != 0)) {
				{
				setState(435);
				basedata();
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(436);
						match(COMMA);
						setState(437);
						basedata();
						}
						} 
					}
					setState(442);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(443);
					match(COMMA);
					}
				}

				}
			}

			setState(448);
			match(RBRACKET);
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
	public static class DataContext extends ParserRuleContext {
		public ArrowfunctionContext arrowfunction() {
			return getRuleContext(ArrowfunctionContext.class,0);
		}
		public BasedataContext basedata() {
			return getRuleContext(BasedataContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Async:
			case LPAREN:
				{
				setState(450);
				arrowfunction();
				}
				break;
			case LT:
			case LBRACKET:
			case LBRACE:
			case LBRACKETS:
			case AngularQut:
			case STRING:
			case NUMBER:
			case BOOLEAN:
			case IDENTIFIER:
				{
				setState(451);
				basedata();
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
	public static class TypeequalContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(FrameParser.EQUALS, 0); }
		public Number_STRING_BOOLEANContext number_STRING_BOOLEAN() {
			return getRuleContext(Number_STRING_BOOLEANContext.class,0);
		}
		public CullfunctionContext cullfunction() {
			return getRuleContext(CullfunctionContext.class,0);
		}
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public TypecurlesContext typecurles() {
			return getRuleContext(TypecurlesContext.class,0);
		}
		public TypeequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeequal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTypeequal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeequalContext typeequal() throws RecognitionException {
		TypeequalContext _localctx = new TypeequalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeequal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(EQUALS);
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(455);
				number_STRING_BOOLEAN();
				}
				break;
			case 2:
				{
				setState(456);
				cullfunction();
				}
				break;
			case 3:
				{
				setState(457);
				access();
				}
				break;
			case 4:
				{
				setState(458);
				typecurles();
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(FrameParser.Return, 0); }
		public BasedataContext basedata() {
			return getRuleContext(BasedataContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FrameParser.SEMICOLON, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(Return);
			setState(462);
			basedata();
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(463);
				match(SEMICOLON);
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
	public static class TypedeclareContext extends ParserRuleContext {
		public TerminalNode TypeDeclare() { return getToken(FrameParser.TypeDeclare, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TypeequalContext typeequal() {
			return getRuleContext(TypeequalContext.class,0);
		}
		public TypedeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedeclare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTypedeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedeclareContext typedeclare() throws RecognitionException {
		TypedeclareContext _localctx = new TypedeclareContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typedeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(TypeDeclare);
			setState(467);
			match(IDENTIFIER);
			setState(468);
			typeequal();
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
	public static class PrametersContext extends ParserRuleContext {
		public List<PrameterContext> prameter() {
			return getRuleContexts(PrameterContext.class);
		}
		public PrameterContext prameter(int i) {
			return getRuleContext(PrameterContext.class,i);
		}
		public List<TerminalNode> Accessmodifier() { return getTokens(FrameParser.Accessmodifier); }
		public TerminalNode Accessmodifier(int i) {
			return getToken(FrameParser.Accessmodifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public PrametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitPrameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrametersContext prameters() throws RecognitionException {
		PrametersContext _localctx = new PrametersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_prameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Accessmodifier) {
				{
				setState(470);
				match(Accessmodifier);
				}
			}

			setState(473);
			prameter();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(474);
				match(COMMA);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Accessmodifier) {
					{
					setState(475);
					match(Accessmodifier);
					}
				}

				setState(478);
				prameter();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public PrametersContext prameters() {
			return getRuleContext(PrametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(LPAREN);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Accessmodifier || _la==IDENTIFIER) {
				{
				setState(485);
				prameters();
				}
			}

			setState(488);
			match(RPAREN);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(489);
				type();
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
	public static class ArrowfunctionContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(FrameParser.Arrow, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Body_with_out_curlyContext body_with_out_curly() {
			return getRuleContext(Body_with_out_curlyContext.class,0);
		}
		public TerminalNode Async() { return getToken(FrameParser.Async, 0); }
		public ArrowfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowfunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitArrowfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowfunctionContext arrowfunction() throws RecognitionException {
		ArrowfunctionContext _localctx = new ArrowfunctionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrowfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(492);
				match(Async);
				}
			}

			setState(495);
			header();
			setState(496);
			match(Arrow);
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKETS:
				{
				setState(497);
				body();
				}
				break;
			case EOF:
			case Interface:
			case Import:
			case Await:
			case TypeDeclare:
			case ReadOnly:
			case Export:
			case Return:
			case Console:
			case Function:
			case Constructor:
			case Accessmodifier:
			case SetGet:
			case Enum:
			case If:
			case For:
			case While:
			case ATT:
			case Const:
			case LT:
			case RPAREN:
			case LBRACE:
			case RBRACKETS:
			case SEMICOLON:
			case COMMA:
			case Class:
			case AS:
			case LET:
			case STRING:
			case IDENTIFIER:
			case SEMICOLONColon:
				{
				setState(498);
				body_with_out_curly();
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Console() { return getToken(FrameParser.Console, 0); }
		public TerminalNode DOT() { return getToken(FrameParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(Console);
			setState(502);
			match(DOT);
			setState(503);
			match(IDENTIFIER);
			setState(504);
			match(LPAREN);
			{
			setState(505);
			arguments();
			}
			setState(506);
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
	public static class PrameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public PrameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitPrameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrameterContext prameter() throws RecognitionException {
		PrameterContext _localctx = new PrameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_prameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(IDENTIFIER);
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Interface:
			case Import:
			case Await:
			case TypeDeclare:
			case ReadOnly:
			case Export:
			case Return:
			case Console:
			case Function:
			case Constructor:
			case Accessmodifier:
			case SetGet:
			case Enum:
			case If:
			case For:
			case While:
			case ATT:
			case Const:
			case LT:
			case TEQUAL:
			case RPAREN:
			case LBRACE:
			case RBRACKETS:
			case COLON:
			case EQUALS:
			case SEMICOLON:
			case COMMA:
			case Class:
			case AS:
			case LET:
			case STRING:
			case IDENTIFIER:
			case SEMICOLONColon:
				{
				{
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(509);
					type();
					}
				}

				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEQUAL || _la==EQUALS) {
					{
					setState(512);
					equal();
					}
				}

				}
				}
				break;
			case LBRACKETS:
				{
				{
				setState(515);
				objects();
				}
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(518);
			argument();
			}
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(519);
				match(COMMA);
				setState(520);
				argument();
				}
				}
				setState(525);
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
	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public EqualbasedataContext equalbasedata() {
			return getRuleContext(EqualbasedataContext.class,0);
		}
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public BasedataContext basedata() {
			return getRuleContext(BasedataContext.class,0);
		}
		public ArrowfunctionContext arrowfunction() {
			return getRuleContext(ArrowfunctionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_argument);
		int _la;
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(526);
				match(IDENTIFIER);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(527);
					equalbasedata();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				objects();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				basedata();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				arrowfunction();
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
	public static class VardeclareContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public PrameterContext prameter() {
			return getRuleContext(PrameterContext.class,0);
		}
		public VardeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitVardeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclareContext vardeclare() throws RecognitionException {
		VardeclareContext _localctx = new VardeclareContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_vardeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			keyword();
			setState(536);
			prameter();
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
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(FrameParser.Const, 0); }
		public TerminalNode LET() { return getToken(FrameParser.LET, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==LET) ) {
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
	public static class EqualContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(FrameParser.EQUALS, 0); }
		public TerminalNode TEQUAL() { return getToken(FrameParser.TEQUAL, 0); }
		public TerminalNode AS() { return getToken(FrameParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(540);
			_la = _input.LA(1);
			if ( !(_la==TEQUAL || _la==EQUALS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(541);
			data();
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(542);
				match(AS);
				setState(543);
				match(IDENTIFIER);
				}
				break;
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
	public static class EqualbasedataContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(FrameParser.EQUALS, 0); }
		public BasedataContext basedata() {
			return getRuleContext(BasedataContext.class,0);
		}
		public EqualbasedataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalbasedata; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitEqualbasedata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualbasedataContext equalbasedata() throws RecognitionException {
		EqualbasedataContext _localctx = new EqualbasedataContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_equalbasedata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(EQUALS);
			setState(547);
			basedata();
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
	public static class TypesContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(FrameParser.Type, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode Void() { return getToken(FrameParser.Void, 0); }
		public TerminalNode Never() { return getToken(FrameParser.Never, 0); }
		public ObjectstypeContext objectstype() {
			return getRuleContext(ObjectstypeContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(FrameParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(FrameParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(FrameParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(FrameParser.RBRACKET, i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				{
				setState(549);
				match(Type);
				}
				break;
			case IDENTIFIER:
				{
				setState(550);
				match(IDENTIFIER);
				}
				break;
			case Void:
				{
				setState(551);
				match(Void);
				}
				break;
			case Never:
				{
				setState(552);
				match(Never);
				}
				break;
			case LBRACKETS:
				{
				setState(553);
				objectstype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(556);
				match(LBRACKET);
				setState(557);
				match(RBRACKET);
				}
				break;
			}
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(560);
				match(LBRACKET);
				setState(561);
				match(RBRACKET);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(FrameParser.And); }
		public TerminalNode And(int i) {
			return getToken(FrameParser.And, i);
		}
		public List<TerminalNode> Or() { return getTokens(FrameParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(FrameParser.Or, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(564);
			match(COLON);
			setState(565);
			types();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And || _la==Or) {
				{
				{
				setState(566);
				_la = _input.LA(1);
				if ( !(_la==And || _la==Or) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(567);
				types();
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class AccessContext extends ParserRuleContext {
		public List<CullsContext> culls() {
			return getRuleContexts(CullsContext.class);
		}
		public CullsContext culls(int i) {
			return getRuleContext(CullsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(FrameParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FrameParser.DOT, i);
		}
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			culls();
			setState(576); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(574);
				match(DOT);
				setState(575);
				culls();
				}
				}
				setState(578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
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
	public static class CullsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public CullfunctionContext cullfunction() {
			return getRuleContext(CullfunctionContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(FrameParser.PIPE, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public CullsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_culls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitCulls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CullsContext culls() throws RecognitionException {
		CullsContext _localctx = new CullsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_culls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(580);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(581);
				cullfunction();
				}
				break;
			case 3:
				{
				{
				setState(582);
				match(IDENTIFIER);
				setState(583);
				array();
				}
				}
				break;
			}
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(586);
				match(PIPE);
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
	public static class CullfunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public CullfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cullfunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitCullfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CullfunctionContext cullfunction() throws RecognitionException {
		CullfunctionContext _localctx = new CullfunctionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_cullfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(IDENTIFIER);
			setState(590);
			match(LPAREN);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 89339614724608L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 47L) != 0)) {
				{
				setState(591);
				arguments();
				}
			}

			setState(594);
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
	public static class ObjectsContext extends ParserRuleContext {
		public TerminalNode LBRACKETS() { return getToken(FrameParser.LBRACKETS, 0); }
		public TerminalNode RBRACKETS() { return getToken(FrameParser.RBRACKETS, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public ObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objects; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitObjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectsContext objects() throws RecognitionException {
		ObjectsContext _localctx = new ObjectsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_objects);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(LBRACKETS);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(597);
				object();
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(598);
						match(COMMA);
						setState(599);
						object();
						}
						} 
					}
					setState(604);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(605);
					match(COMMA);
					}
				}

				}
			}

			setState(610);
			match(RBRACKETS);
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(IDENTIFIER);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(613);
				match(COLON);
				setState(614);
				data();
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
	public static class ObjectstypeContext extends ParserRuleContext {
		public TerminalNode LBRACKETS() { return getToken(FrameParser.LBRACKETS, 0); }
		public TerminalNode RBRACKETS() { return getToken(FrameParser.RBRACKETS, 0); }
		public List<ObjecttypeContext> objecttype() {
			return getRuleContexts(ObjecttypeContext.class);
		}
		public ObjecttypeContext objecttype(int i) {
			return getRuleContext(ObjecttypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public ObjectstypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectstype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitObjectstype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectstypeContext objectstype() throws RecognitionException {
		ObjectstypeContext _localctx = new ObjectstypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_objectstype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(LBRACKETS);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(618);
				objecttype();
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(619);
					match(COMMA);
					setState(620);
					objecttype();
					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(628);
			match(RBRACKETS);
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
	public static class ObjecttypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TerminalNode Type() { return getToken(FrameParser.Type, 0); }
		public ObjecttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objecttype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitObjecttype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjecttypeContext objecttype() throws RecognitionException {
		ObjecttypeContext _localctx = new ObjecttypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_objecttype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(IDENTIFIER);
			setState(631);
			match(COLON);
			setState(632);
			match(Type);
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
	public static class TypecurlesContext extends ParserRuleContext {
		public TerminalNode LBRACKETS() { return getToken(FrameParser.LBRACKETS, 0); }
		public TerminalNode RBRACKETS() { return getToken(FrameParser.RBRACKETS, 0); }
		public List<TypecurleContext> typecurle() {
			return getRuleContexts(TypecurleContext.class);
		}
		public TypecurleContext typecurle(int i) {
			return getRuleContext(TypecurleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public List<TerminalNode> SEMICOLONColon() { return getTokens(FrameParser.SEMICOLONColon); }
		public TerminalNode SEMICOLONColon(int i) {
			return getToken(FrameParser.SEMICOLONColon, i);
		}
		public TypecurlesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typecurles; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTypecurles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypecurlesContext typecurles() throws RecognitionException {
		TypecurlesContext _localctx = new TypecurlesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typecurles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(LBRACKETS);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ReadOnly || _la==IDENTIFIER) {
				{
				setState(635);
				typecurle();
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==SEMICOLONColon) {
					{
					{
					setState(636);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==SEMICOLONColon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(637);
					typecurle();
					}
					}
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(645);
			match(RBRACKETS);
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
	public static class TypecurleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TerminalNode Type() { return getToken(FrameParser.Type, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode ReadOnly() { return getToken(FrameParser.ReadOnly, 0); }
		public TerminalNode PIPE() { return getToken(FrameParser.PIPE, 0); }
		public TypecurleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typecurle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTypecurle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypecurleContext typecurle() throws RecognitionException {
		TypecurleContext _localctx = new TypecurleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typecurle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ReadOnly) {
				{
				setState(647);
				match(ReadOnly);
				}
			}

			setState(650);
			match(IDENTIFIER);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(651);
				match(PIPE);
				}
			}

			setState(654);
			match(COLON);
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				{
				setState(655);
				match(Type);
				}
				break;
			case Async:
			case LT:
			case LBRACKET:
			case LPAREN:
			case LBRACE:
			case LBRACKETS:
			case AngularQut:
			case STRING:
			case NUMBER:
			case BOOLEAN:
			case IDENTIFIER:
				{
				setState(656);
				data();
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
	public static class TemplateContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_template);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(661); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(661);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LT:
						{
						setState(659);
						element();
						}
						break;
					case LBRACE:
					case STRING:
					case IDENTIFIER:
						{
						setState(660);
						text();
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
				setState(663); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
	public static class ElementContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public AngularComponentContext angularComponent() {
			return getRuleContext(AngularComponentContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_element);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				htmlElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				angularComponent();
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
	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharactersContext extends ContentContext {
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public CharactersContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitCharacters(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextsContext extends ContentContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TextsContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTexts(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ContentContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveContext extends ContentContext {
		public DirectiveElementContext directiveElement() {
			return getRuleContext(DirectiveElementContext.class,0);
		}
		public DirectiveContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AngularComponentsContext extends ContentContext {
		public AngularComponentContext angularComponent() {
			return getRuleContext(AngularComponentContext.class,0);
		}
		public AngularComponentsContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAngularComponents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_content);
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new CharactersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				character();
				}
				break;
			case 2:
				_localctx = new TextsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				text();
				}
				break;
			case 3:
				_localctx = new HtmlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				htmlElement();
				}
				break;
			case 4:
				_localctx = new AngularComponentsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				angularComponent();
				}
				break;
			case 5:
				_localctx = new DirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(673);
				directiveElement();
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
	public static class ElementContentContext extends ParserRuleContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ElementContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitElementContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContentContext elementContent() throws RecognitionException {
		ElementContentContext _localctx = new ElementContentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(676);
					content();
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public TagOpenContext tagOpen() {
			return getRuleContext(TagOpenContext.class,0);
		}
		public ElementContentContext elementContent() {
			return getRuleContext(ElementContentContext.class,0);
		}
		public TagCloseContext tagClose() {
			return getRuleContext(TagCloseContext.class,0);
		}
		public TagOpenEmptyContext tagOpenEmpty() {
			return getRuleContext(TagOpenEmptyContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_htmlElement);
		try {
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(682);
				tagOpen();
				setState(683);
				elementContent();
				setState(684);
				tagClose();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(686);
				tagOpenEmpty();
				}
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
	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FrameParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FrameParser.MINUS, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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
	public static class TagOpenEmptyContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(FrameParser.LT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode SLASH_LT() { return getToken(FrameParser.SLASH_LT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public ElementContentContext elementContent() {
			return getRuleContext(ElementContentContext.class,0);
		}
		public TagOpenEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagOpenEmpty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTagOpenEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagOpenEmptyContext tagOpenEmpty() throws RecognitionException {
		TagOpenEmptyContext _localctx = new TagOpenEmptyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tagOpenEmpty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(LT);
			setState(692);
			match(IDENTIFIER);
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				{
				setState(693);
				elementContent();
				}
				}
				break;
			case 2:
				{
				setState(694);
				attribute();
				}
				break;
			}
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 8606711809L) != 0)) {
				{
				{
				setState(697);
				attribute();
				}
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(703);
			match(SLASH_LT);
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
	public static class TagOpenContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(FrameParser.LT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public ElementContentContext elementContent() {
			return getRuleContext(ElementContentContext.class,0);
		}
		public TagOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagOpen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTagOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagOpenContext tagOpen() throws RecognitionException {
		TagOpenContext _localctx = new TagOpenContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_tagOpen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(LT);
			setState(706);
			match(IDENTIFIER);
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				{
				setState(707);
				elementContent();
				}
				}
				break;
			case 2:
				{
				setState(708);
				attribute();
				}
				break;
			}
			{
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 8606711809L) != 0)) {
				{
				{
				setState(711);
				attribute();
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(717);
			match(GT);
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
	public static class TagCloseContext extends ParserRuleContext {
		public TerminalNode SLASH_GT() { return getToken(FrameParser.SLASH_GT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public TagCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagClose; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTagClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagCloseContext tagClose() throws RecognitionException {
		TagCloseContext _localctx = new TagCloseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_tagClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(SLASH_GT);
			setState(720);
			match(IDENTIFIER);
			setState(721);
			match(GT);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode Class() { return getToken(FrameParser.Class, 0); }
		public TerminalNode EQUALS() { return getToken(FrameParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(FrameParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(FrameParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(FrameParser.NULL, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(723);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				{
				{
				setState(724);
				match(LPAREN);
				setState(725);
				expression();
				setState(726);
				match(RPAREN);
				}
				}
				break;
			case Class:
				{
				setState(728);
				match(Class);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(731);
				match(EQUALS);
				setState(732);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
	public static class AngularComponentContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(FrameParser.LT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AngularComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularComponent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAngularComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularComponentContext angularComponent() throws RecognitionException {
		AngularComponentContext _localctx = new AngularComponentContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_angularComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(LT);
			setState(736);
			match(IDENTIFIER);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 8606711809L) != 0)) {
				{
				{
				setState(737);
				attribute();
				}
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(743);
			match(GT);
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
	public static class DirectiveElementContext extends ParserRuleContext {
		public DirectiveElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveElement; }
	 
		public DirectiveElementContext() { }
		public void copyFrom(DirectiveElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TwoWayContext extends DirectiveElementContext {
		public TwoWayDirectiveContext twoWayDirective() {
			return getRuleContext(TwoWayDirectiveContext.class,0);
		}
		public TwoWayContext(DirectiveElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTwoWay(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructuralContext extends DirectiveElementContext {
		public StructuralDirectiveContext structuralDirective() {
			return getRuleContext(StructuralDirectiveContext.class,0);
		}
		public StructuralContext(DirectiveElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitStructural(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends DirectiveElementContext {
		public AttributeDirectiveContext attributeDirective() {
			return getRuleContext(AttributeDirectiveContext.class,0);
		}
		public AttributesContext(DirectiveElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveElementContext directiveElement() throws RecognitionException {
		DirectiveElementContext _localctx = new DirectiveElementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_directiveElement);
		try {
			setState(748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCTURAL_DIRECTIVE:
				_localctx = new StructuralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				structuralDirective();
				}
				break;
			case LBRACKET:
				_localctx = new AttributesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				attributeDirective();
				}
				break;
			case LBRACKET_PAREN:
				_localctx = new TwoWayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				twoWayDirective();
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
	public static class StructuralDirectiveContext extends ParserRuleContext {
		public TerminalNode STRUCTURAL_DIRECTIVE() { return getToken(FrameParser.STRUCTURAL_DIRECTIVE, 0); }
		public TerminalNode EQUALS() { return getToken(FrameParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StructuralDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuralDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitStructuralDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuralDirectiveContext structuralDirective() throws RecognitionException {
		StructuralDirectiveContext _localctx = new StructuralDirectiveContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_structuralDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(STRUCTURAL_DIRECTIVE);
			setState(751);
			match(EQUALS);
			setState(752);
			expression();
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
	public static class AttributeDirectiveContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FrameParser.LBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(FrameParser.RBRACKET, 0); }
		public TerminalNode EQUALS() { return getToken(FrameParser.EQUALS, 0); }
		public AttributeDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAttributeDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDirectiveContext attributeDirective() throws RecognitionException {
		AttributeDirectiveContext _localctx = new AttributeDirectiveContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attributeDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(LBRACKET);
			setState(755);
			expression();
			setState(756);
			match(RBRACKET);
			setState(757);
			match(EQUALS);
			setState(758);
			expression();
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
	public static class TwoWayDirectiveContext extends ParserRuleContext {
		public TerminalNode LBRACKET_PAREN() { return getToken(FrameParser.LBRACKET_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACKET_PAREN() { return getToken(FrameParser.RBRACKET_PAREN, 0); }
		public TerminalNode EQUALS() { return getToken(FrameParser.EQUALS, 0); }
		public TwoWayDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWayDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTwoWayDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWayDirectiveContext twoWayDirective() throws RecognitionException {
		TwoWayDirectiveContext _localctx = new TwoWayDirectiveContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_twoWayDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(LBRACKET_PAREN);
			setState(761);
			expression();
			setState(762);
			match(RBRACKET_PAREN);
			setState(763);
			match(EQUALS);
			setState(764);
			expression();
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
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			logicalOrExpression();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> ANDAND() { return getTokens(FrameParser.ANDAND); }
		public TerminalNode ANDAND(int i) {
			return getToken(FrameParser.ANDAND, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			logicalAndExpression();
			setState(773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(769);
					match(ANDAND);
					setState(770);
					logicalAndExpression();
					}
					} 
				}
				setState(775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> OROR() { return getTokens(FrameParser.OROR); }
		public TerminalNode OROR(int i) {
			return getToken(FrameParser.OROR, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			equalityExpression();
			setState(781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(777);
					match(OROR);
					setState(778);
					equalityExpression();
					}
					} 
				}
				setState(783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUALEQUAL() { return getTokens(FrameParser.EQUALEQUAL); }
		public TerminalNode EQUALEQUAL(int i) {
			return getToken(FrameParser.EQUALEQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(FrameParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(FrameParser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_equalityExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			relationalExpression();
			setState(789);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(785);
					_la = _input.LA(1);
					if ( !(_la==NOTEQUAL || _la==EQUALEQUAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(786);
					relationalExpression();
					}
					} 
				}
				setState(791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(FrameParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(FrameParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(FrameParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(FrameParser.GT, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(FrameParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(FrameParser.EQUALS, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			additiveExpression();
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(799);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(793);
						match(LT);
						}
						break;
					case 2:
						{
						setState(794);
						match(GT);
						}
						break;
					case 3:
						{
						{
						setState(795);
						match(LT);
						setState(796);
						match(EQUALS);
						}
						}
						break;
					case 4:
						{
						{
						setState(797);
						match(GT);
						setState(798);
						match(EQUALS);
						}
						}
						break;
					}
					setState(801);
					additiveExpression();
					}
					} 
				}
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(FrameParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(FrameParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(FrameParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(FrameParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			multiplicativeExpression();
			setState(812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(808);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(809);
					multiplicativeExpression();
					}
					} 
				}
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(FrameParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(FrameParser.DIV, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			unaryExpression();
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(816);
					match(DIV);
					}
					setState(817);
					unaryExpression();
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(FrameParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(FrameParser.MINUS, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_unaryExpression);
		int _la;
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(824);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				primaryExpression();
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public PipeExpressionContext pipeExpression() {
			return getRuleContext(PipeExpressionContext.class,0);
		}
		public PropLitiralContext propLitiral() {
			return getRuleContext(PropLitiralContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_primaryExpression);
		try {
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(830);
				match(LPAREN);
				setState(831);
				expression();
				setState(832);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(834);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(835);
				arrayLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(836);
				objectLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(837);
				pipeExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(838);
				propLitiral();
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
	public static class PipeExpressionContext extends ParserRuleContext {
		public BaseExpressionContext baseExpression() {
			return getRuleContext(BaseExpressionContext.class,0);
		}
		public List<TerminalNode> PIPE() { return getTokens(FrameParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(FrameParser.PIPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(FrameParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FrameParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(FrameParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FrameParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PipeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitPipeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeExpressionContext pipeExpression() throws RecognitionException {
		PipeExpressionContext _localctx = new PipeExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_pipeExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			baseExpression();
			setState(850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(842);
					match(PIPE);
					setState(843);
					match(IDENTIFIER);
					setState(846);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(844);
						match(COLON);
						setState(845);
						expression();
						}
					}

					}
					} 
				}
				setState(852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
	public static class BaseExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public BaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitBaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseExpressionContext baseExpression() throws RecognitionException {
		BaseExpressionContext _localctx = new BaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_baseExpression);
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(855);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(856);
				arrayLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(857);
				objectLiteral();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(FrameParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(FrameParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(FrameParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) ) {
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FrameParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public BaseExpressionContext baseExpression() {
			return getRuleContext(BaseExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(IDENTIFIER);
			setState(863);
			match(LPAREN);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 66571993153L) != 0)) {
				{
				setState(864);
				baseExpression();
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(865);
					match(COMMA);
					setState(866);
					expression();
					}
					}
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(874);
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FrameParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(FrameParser.RBRACKET, 0); }
		public BaseExpressionContext baseExpression() {
			return getRuleContext(BaseExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(LBRACKET);
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 66571993153L) != 0)) {
				{
				setState(877);
				baseExpression();
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(878);
					match(COMMA);
					setState(879);
					expression();
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(887);
			match(RBRACKET);
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
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FrameParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FrameParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FrameParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FrameParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(FrameParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FrameParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(LBRACE);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(890);
				match(IDENTIFIER);
				setState(891);
				match(COLON);
				setState(892);
				expression();
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(893);
					match(COMMA);
					setState(894);
					match(IDENTIFIER);
					setState(895);
					match(COLON);
					setState(896);
					expression();
					}
					}
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(904);
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
	public static class PropLitiralContext extends ParserRuleContext {
		public List<BaseExpressionContext> baseExpression() {
			return getRuleContexts(BaseExpressionContext.class);
		}
		public BaseExpressionContext baseExpression(int i) {
			return getRuleContext(BaseExpressionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(FrameParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FrameParser.DOT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PropLitiralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propLitiral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitPropLitiral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropLitiralContext propLitiral() throws RecognitionException {
		PropLitiralContext _localctx = new PropLitiralContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_propLitiral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(906);
					baseExpression();
					setState(907);
					match(DOT);
					setState(908);
					expression();
					}
					} 
				}
				setState(914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FrameParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FrameParser.RBRACE, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(LBRACE);
			setState(916);
			expression();
			setState(917);
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
	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FrameParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FrameParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(FrameParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(FrameParser.STRING, i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(922); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(922);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(919);
						match(IDENTIFIER);
						}
						break;
					case STRING:
						{
						setState(920);
						match(STRING);
						}
						break;
					case LBRACE:
						{
						setState(921);
						interpolation();
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
				setState(924); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(FrameParser.If, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public List<TerminalNode> LBRACKETS() { return getTokens(FrameParser.LBRACKETS); }
		public TerminalNode LBRACKETS(int i) {
			return getToken(FrameParser.LBRACKETS, i);
		}
		public List<TerminalNode> RBRACKETS() { return getTokens(FrameParser.RBRACKETS); }
		public TerminalNode RBRACKETS(int i) {
			return getToken(FrameParser.RBRACKETS, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode Else() { return getToken(FrameParser.Else, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(If);
			setState(927);
			match(LPAREN);
			setState(928);
			expression();
			setState(929);
			match(RPAREN);
			setState(930);
			match(LBRACKETS);
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17597265685696L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 549L) != 0)) {
				{
				{
				setState(931);
				statements();
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(937);
			match(RBRACKETS);
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(938);
				match(Else);
				setState(939);
				match(LBRACKETS);
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17597265685696L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 549L) != 0)) {
					{
					{
					setState(940);
					statements();
					}
					}
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(946);
				match(RBRACKETS);
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
	public static class Loop_statementContext extends ParserRuleContext {
		public TerminalNode LBRACKETS() { return getToken(FrameParser.LBRACKETS, 0); }
		public TerminalNode RBRACKETS() { return getToken(FrameParser.RBRACKETS, 0); }
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				{
				setState(949);
				while_();
				}
				break;
			case For:
				{
				setState(950);
				for_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(953);
			match(LBRACKETS);
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17597265685696L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 549L) != 0)) {
				{
				{
				setState(954);
				statements();
				}
				}
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960);
			match(RBRACKETS);
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(FrameParser.While, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(While);
			setState(963);
			match(LPAREN);
			setState(964);
			expression();
			setState(965);
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(FrameParser.For, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(FrameParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FrameParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public Loop_initContext loop_init() {
			return getRuleContext(Loop_initContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Loop_stepContext loop_step() {
			return getRuleContext(Loop_stepContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(For);
			setState(968);
			match(LPAREN);
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(969);
				loop_init();
				}
				break;
			}
			setState(972);
			match(SEMICOLON);
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(973);
				expression();
				}
				break;
			}
			setState(976);
			match(SEMICOLON);
			setState(978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(977);
				loop_step();
				}
				break;
			}
			setState(980);
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
	public static class Loop_initContext extends ParserRuleContext {
		public VardeclareContext vardeclare() {
			return getRuleContext(VardeclareContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public Loop_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitLoop_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_initContext loop_init() throws RecognitionException {
		Loop_initContext _localctx = new Loop_initContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_loop_init);
		int _la;
		try {
			setState(991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				vardeclare();
				}
				break;
			case LT:
			case GT:
			case LBRACKET:
			case LPAREN:
			case LBRACE:
			case SEMICOLON:
			case COMMA:
			case ANDAND:
			case OROR:
			case NOTEQUAL:
			case EQUALEQUAL:
			case PLUS:
			case MINUS:
			case DIV:
			case NOT:
			case STRING:
			case NUMBER:
			case BOOLEAN:
			case NULL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				expression();
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(984);
					match(COMMA);
					setState(985);
					expression();
					}
					}
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class Loop_stepContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public Loop_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_step; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitLoop_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_stepContext loop_step() throws RecognitionException {
		Loop_stepContext _localctx = new Loop_stepContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_loop_step);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			expression();
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(994);
				match(COMMA);
				setState(995);
				expression();
				}
				}
				setState(1000);
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
		"\u0004\u0001O\u03ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0001\u0000\u0005\u0000\u00bc\b"+
		"\u0000\n\u0000\f\u0000\u00bf\t\u0000\u0001\u0000\u0003\u0000\u00c2\b\u0000"+
		"\u0001\u0001\u0004\u0001\u00c5\b\u0001\u000b\u0001\f\u0001\u00c6\u0001"+
		"\u0002\u0003\u0002\u00ca\b\u0002\u0001\u0002\u0003\u0002\u00cd\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00d1\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00e4\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00eb\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00f9\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u0106\b\u0007\n\u0007\f\u0007\u0109\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u010f\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0118\b\t\u0001"+
		"\t\u0001\t\u0003\t\u011c\b\t\u0001\t\u0005\t\u011f\b\t\n\t\f\t\u0122\t"+
		"\t\u0001\t\u0001\t\u0001\n\u0003\n\u0127\b\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u012c\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0131\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0136\b\u000b\u0001\u000b\u0003\u000b\u0139"+
		"\b\u000b\u0001\u000b\u0003\u000b\u013c\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u0141\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u0146\b\f\n\f\f\f\u0149"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0151\b\r"+
		"\n\r\f\r\u0154\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u015a\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u015f\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0003"+
		"\u0010\u0166\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u016a\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0173\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u017a\b\u0012\n\u0012\f\u0012\u017d"+
		"\t\u0012\u0001\u0012\u0003\u0012\u0180\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0186\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0003\u0017\u0192\b\u0017\u0001\u0017\u0003\u0017"+
		"\u0195\b\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u0199\b\u0018\n\u0018"+
		"\f\u0018\u019c\t\u0018\u0001\u0018\u0003\u0018\u019f\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u01a5\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01b1\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01b7\b\u001b\n\u001b"+
		"\f\u001b\u01ba\t\u001b\u0001\u001b\u0003\u001b\u01bd\b\u001b\u0003\u001b"+
		"\u01bf\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01c5\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01cc\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01d1\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0003 \u01d8\b \u0001 \u0001 \u0001 \u0003 \u01dd\b \u0001 \u0005 \u01e0"+
		"\b \n \f \u01e3\t \u0001!\u0001!\u0003!\u01e7\b!\u0001!\u0001!\u0003!"+
		"\u01eb\b!\u0001\"\u0003\"\u01ee\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u01f4\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0003$\u01ff\b$\u0001$\u0003$\u0202\b$\u0001$\u0003$\u0205\b$\u0001"+
		"%\u0001%\u0001%\u0005%\u020a\b%\n%\f%\u020d\t%\u0001&\u0001&\u0003&\u0211"+
		"\b&\u0001&\u0001&\u0001&\u0003&\u0216\b&\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0003)\u0221\b)\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u022b\b+\u0001+\u0001+\u0003"+
		"+\u022f\b+\u0001+\u0001+\u0003+\u0233\b+\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u0239\b,\n,\f,\u023c\t,\u0001-\u0001-\u0001-\u0004-\u0241\b-\u000b-"+
		"\f-\u0242\u0001.\u0001.\u0001.\u0001.\u0003.\u0249\b.\u0001.\u0003.\u024c"+
		"\b.\u0001/\u0001/\u0001/\u0003/\u0251\b/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00010\u00050\u0259\b0\n0\f0\u025c\t0\u00010\u00030\u025f\b0\u00030"+
		"\u0261\b0\u00010\u00010\u00011\u00011\u00011\u00031\u0268\b1\u00012\u0001"+
		"2\u00012\u00012\u00052\u026e\b2\n2\f2\u0271\t2\u00032\u0273\b2\u00012"+
		"\u00012\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u0005"+
		"4\u027f\b4\n4\f4\u0282\t4\u00034\u0284\b4\u00014\u00014\u00015\u00035"+
		"\u0289\b5\u00015\u00015\u00035\u028d\b5\u00015\u00015\u00015\u00035\u0292"+
		"\b5\u00016\u00016\u00046\u0296\b6\u000b6\f6\u0297\u00017\u00017\u0003"+
		"7\u029c\b7\u00018\u00018\u00018\u00018\u00018\u00038\u02a3\b8\u00019\u0005"+
		"9\u02a6\b9\n9\f9\u02a9\t9\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u02b0"+
		"\b:\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0003<\u02b8\b<\u0001<\u0005"+
		"<\u02bb\b<\n<\f<\u02be\t<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0003"+
		"=\u02c6\b=\u0001=\u0005=\u02c9\b=\n=\f=\u02cc\t=\u0001=\u0001=\u0001>"+
		"\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003"+
		"?\u02da\b?\u0001?\u0001?\u0003?\u02de\b?\u0001@\u0001@\u0001@\u0005@\u02e3"+
		"\b@\n@\f@\u02e6\t@\u0001@\u0001@\u0001A\u0001A\u0001A\u0003A\u02ed\bA"+
		"\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001F\u0001"+
		"F\u0001F\u0005F\u0304\bF\nF\fF\u0307\tF\u0001G\u0001G\u0001G\u0005G\u030c"+
		"\bG\nG\fG\u030f\tG\u0001H\u0001H\u0001H\u0005H\u0314\bH\nH\fH\u0317\t"+
		"H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u0320\bI\u0001"+
		"I\u0005I\u0323\bI\nI\fI\u0326\tI\u0001J\u0001J\u0001J\u0005J\u032b\bJ"+
		"\nJ\fJ\u032e\tJ\u0001K\u0001K\u0001K\u0005K\u0333\bK\nK\fK\u0336\tK\u0001"+
		"L\u0001L\u0001L\u0003L\u033b\bL\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u0348\bM\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0003N\u034f\bN\u0005N\u0351\bN\nN\fN\u0354\tN\u0001O"+
		"\u0001O\u0001O\u0001O\u0001O\u0003O\u035b\bO\u0001P\u0001P\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0005Q\u0364\bQ\nQ\fQ\u0367\tQ\u0003Q\u0369\bQ"+
		"\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0005R\u0371\bR\nR\fR\u0374"+
		"\tR\u0003R\u0376\bR\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0005S\u0382\bS\nS\fS\u0385\tS\u0003S\u0387\bS\u0001S"+
		"\u0001S\u0001T\u0001T\u0001T\u0001T\u0005T\u038f\bT\nT\fT\u0392\tT\u0001"+
		"U\u0001U\u0001U\u0001U\u0001V\u0001V\u0001V\u0004V\u039b\bV\u000bV\fV"+
		"\u039c\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0005W\u03a5\bW\nW\f"+
		"W\u03a8\tW\u0001W\u0001W\u0001W\u0001W\u0005W\u03ae\bW\nW\fW\u03b1\tW"+
		"\u0001W\u0003W\u03b4\bW\u0001X\u0001X\u0003X\u03b8\bX\u0001X\u0001X\u0005"+
		"X\u03bc\bX\nX\fX\u03bf\tX\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Z\u0001Z\u0001Z\u0003Z\u03cb\bZ\u0001Z\u0001Z\u0003Z\u03cf\bZ\u0001"+
		"Z\u0001Z\u0003Z\u03d3\bZ\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0005"+
		"[\u03db\b[\n[\f[\u03de\t[\u0003[\u03e0\b[\u0001\\\u0001\\\u0001\\\u0005"+
		"\\\u03e5\b\\\n\\\f\\\u03e8\t\\\u0001\\\u0000\u0000]\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u0000\n\u0002\u0000\u0005\u0005II\u0001\u0000EG\u0002\u0000\u001d"+
		"\u001dBB\u0002\u0000%%11\u0001\u0000MN\u0002\u000033OO\u0001\u0000<=\u0001"+
		"\u0000EH\u0001\u00009:\u0002\u0000==??\u0434\u0000\u00c1\u0001\u0000\u0000"+
		"\u0000\u0002\u00c4\u0001\u0000\u0000\u0000\u0004\u00c9\u0001\u0000\u0000"+
		"\u0000\u0006\u00e3\u0001\u0000\u0000\u0000\b\u00e5\u0001\u0000\u0000\u0000"+
		"\n\u00f8\u0001\u0000\u0000\u0000\f\u00fa\u0001\u0000\u0000\u0000\u000e"+
		"\u0100\u0001\u0000\u0000\u0000\u0010\u0110\u0001\u0000\u0000\u0000\u0012"+
		"\u0113\u0001\u0000\u0000\u0000\u0014\u0126\u0001\u0000\u0000\u0000\u0016"+
		"\u0138\u0001\u0000\u0000\u0000\u0018\u013d\u0001\u0000\u0000\u0000\u001a"+
		"\u014c\u0001\u0000\u0000\u0000\u001c\u0159\u0001\u0000\u0000\u0000\u001e"+
		"\u015b\u0001\u0000\u0000\u0000 \u0165\u0001\u0000\u0000\u0000\"\u016e"+
		"\u0001\u0000\u0000\u0000$\u0176\u0001\u0000\u0000\u0000&\u0185\u0001\u0000"+
		"\u0000\u0000(\u0187\u0001\u0000\u0000\u0000*\u0189\u0001\u0000\u0000\u0000"+
		",\u018d\u0001\u0000\u0000\u0000.\u0191\u0001\u0000\u0000\u00000\u0196"+
		"\u0001\u0000\u0000\u00002\u01a4\u0001\u0000\u0000\u00004\u01b0\u0001\u0000"+
		"\u0000\u00006\u01b2\u0001\u0000\u0000\u00008\u01c4\u0001\u0000\u0000\u0000"+
		":\u01c6\u0001\u0000\u0000\u0000<\u01cd\u0001\u0000\u0000\u0000>\u01d2"+
		"\u0001\u0000\u0000\u0000@\u01d7\u0001\u0000\u0000\u0000B\u01e4\u0001\u0000"+
		"\u0000\u0000D\u01ed\u0001\u0000\u0000\u0000F\u01f5\u0001\u0000\u0000\u0000"+
		"H\u01fc\u0001\u0000\u0000\u0000J\u0206\u0001\u0000\u0000\u0000L\u0215"+
		"\u0001\u0000\u0000\u0000N\u0217\u0001\u0000\u0000\u0000P\u021a\u0001\u0000"+
		"\u0000\u0000R\u021c\u0001\u0000\u0000\u0000T\u0222\u0001\u0000\u0000\u0000"+
		"V\u022a\u0001\u0000\u0000\u0000X\u0234\u0001\u0000\u0000\u0000Z\u023d"+
		"\u0001\u0000\u0000\u0000\\\u0248\u0001\u0000\u0000\u0000^\u024d\u0001"+
		"\u0000\u0000\u0000`\u0254\u0001\u0000\u0000\u0000b\u0264\u0001\u0000\u0000"+
		"\u0000d\u0269\u0001\u0000\u0000\u0000f\u0276\u0001\u0000\u0000\u0000h"+
		"\u027a\u0001\u0000\u0000\u0000j\u0288\u0001\u0000\u0000\u0000l\u0295\u0001"+
		"\u0000\u0000\u0000n\u029b\u0001\u0000\u0000\u0000p\u02a2\u0001\u0000\u0000"+
		"\u0000r\u02a7\u0001\u0000\u0000\u0000t\u02af\u0001\u0000\u0000\u0000v"+
		"\u02b1\u0001\u0000\u0000\u0000x\u02b3\u0001\u0000\u0000\u0000z\u02c1\u0001"+
		"\u0000\u0000\u0000|\u02cf\u0001\u0000\u0000\u0000~\u02d9\u0001\u0000\u0000"+
		"\u0000\u0080\u02df\u0001\u0000\u0000\u0000\u0082\u02ec\u0001\u0000\u0000"+
		"\u0000\u0084\u02ee\u0001\u0000\u0000\u0000\u0086\u02f2\u0001\u0000\u0000"+
		"\u0000\u0088\u02f8\u0001\u0000\u0000\u0000\u008a\u02fe\u0001\u0000\u0000"+
		"\u0000\u008c\u0300\u0001\u0000\u0000\u0000\u008e\u0308\u0001\u0000\u0000"+
		"\u0000\u0090\u0310\u0001\u0000\u0000\u0000\u0092\u0318\u0001\u0000\u0000"+
		"\u0000\u0094\u0327\u0001\u0000\u0000\u0000\u0096\u032f\u0001\u0000\u0000"+
		"\u0000\u0098\u033a\u0001\u0000\u0000\u0000\u009a\u0347\u0001\u0000\u0000"+
		"\u0000\u009c\u0349\u0001\u0000\u0000\u0000\u009e\u035a\u0001\u0000\u0000"+
		"\u0000\u00a0\u035c\u0001\u0000\u0000\u0000\u00a2\u035e\u0001\u0000\u0000"+
		"\u0000\u00a4\u036c\u0001\u0000\u0000\u0000\u00a6\u0379\u0001\u0000\u0000"+
		"\u0000\u00a8\u0390\u0001\u0000\u0000\u0000\u00aa\u0393\u0001\u0000\u0000"+
		"\u0000\u00ac\u039a\u0001\u0000\u0000\u0000\u00ae\u039e\u0001\u0000\u0000"+
		"\u0000\u00b0\u03b7\u0001\u0000\u0000\u0000\u00b2\u03c2\u0001\u0000\u0000"+
		"\u0000\u00b4\u03c7\u0001\u0000\u0000\u0000\u00b6\u03df\u0001\u0000\u0000"+
		"\u0000\u00b8\u03e1\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003\u0002\u0001"+
		"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00c2\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c2\u0005\u0000\u0000\u0001\u00c1\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u0001\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c5\u0003\u0004\u0002\u0000\u00c4\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u0003\u0001\u0000\u0000"+
		"\u0000\u00c8\u00ca\u0005\r\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0005\n\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d0\u0003\u0006\u0003\u0000\u00cf\u00d1\u00052\u0000\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u0005"+
		"\u0001\u0000\u0000\u0000\u00d2\u00e4\u0003\f\u0006\u0000\u00d3\u00e4\u0003"+
		"\n\u0005\u0000\u00d4\u00e4\u0003F#\u0000\u00d5\u00e4\u0003N\'\u0000\u00d6"+
		"\u00e4\u0003,\u0016\u0000\u00d7\u00e4\u0003^/\u0000\u00d8\u00e4\u0003"+
		"Z-\u0000\u00d9\u00e4\u0003>\u001f\u0000\u00da\u00e4\u0003\"\u0011\u0000"+
		"\u00db\u00e4\u0003\u001a\r\u0000\u00dc\u00e4\u0003\u0012\t\u0000\u00dd"+
		"\u00e4\u0003\u0010\b\u0000\u00de\u00e4\u0003\u000e\u0007\u0000\u00df\u00e4"+
		"\u0003l6\u0000\u00e0\u00e4\u0003\u00aeW\u0000\u00e1\u00e4\u0003\u00b0"+
		"X\u0000\u00e2\u00e4\u0003\b\u0004\u0000\u00e3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00e3\u00d3\u0001\u0000\u0000\u0000\u00e3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00e3\u00d5\u0001\u0000\u0000\u0000\u00e3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00e3\u00d7\u0001\u0000\u0000\u0000\u00e3\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e3\u00d9\u0001\u0000\u0000\u0000\u00e3\u00da\u0001\u0000\u0000"+
		"\u0000\u00e3\u00db\u0001\u0000\u0000\u0000\u00e3\u00dc\u0001\u0000\u0000"+
		"\u0000\u00e3\u00dd\u0001\u0000\u0000\u0000\u00e3\u00de\u0001\u0000\u0000"+
		"\u0000\u00e3\u00df\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u0007\u0001\u0000\u0000\u0000\u00e5\u00ea\u0005I\u0000\u0000"+
		"\u00e6\u00e7\u0005<\u0000\u0000\u00e7\u00eb\u0005<\u0000\u0000\u00e8\u00e9"+
		"\u0005=\u0000\u0000\u00e9\u00eb\u0005=\u0000\u0000\u00ea\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\t\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0005\u001b\u0000\u0000\u00ed\u00ee\u0005\u0005\u0000"+
		"\u0000\u00ee\u00ef\u0005(\u0000\u0000\u00ef\u00f0\u0003`0\u0000\u00f0"+
		"\u00f1\u0005)\u0000\u0000\u00f1\u00f9\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005\u001b\u0000\u0000\u00f3\u00f4\u0005\u0005\u0000\u0000\u00f4\u00f5"+
		"\u0005(\u0000\u0000\u00f5\u00f6\u0003l6\u0000\u00f6\u00f7\u0005)\u0000"+
		"\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f9\u000b\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\u001b\u0000\u0000\u00fb\u00fc\u0005\u0004\u0000"+
		"\u0000\u00fc\u00fd\u0005(\u0000\u0000\u00fd\u00fe\u0003`0\u0000\u00fe"+
		"\u00ff\u0005)\u0000\u0000\u00ff\r\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0005\u0007\u0000\u0000\u0101\u0102\u0005.\u0000\u0000\u0102\u0107\u0007"+
		"\u0000\u0000\u0000\u0103\u0104\u00053\u0000\u0000\u0104\u0106\u0007\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0005/\u0000\u0000\u010b\u010c\u0005\b\u0000"+
		"\u0000\u010c\u010e\u0005E\u0000\u0000\u010d\u010f\u00052\u0000\u0000\u010e"+
		"\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u000f\u0001\u0000\u0000\u0000\u0110\u0111\u0003Z-\u0000\u0111\u0112\u0003"+
		"R)\u0000\u0112\u0011\u0001\u0000\u0000\u0000\u0113\u0114\u0005@\u0000"+
		"\u0000\u0114\u0117\u0005I\u0000\u0000\u0115\u0116\u0005\u001c\u0000\u0000"+
		"\u0116\u0118\u0005J\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u0120\u0005.\u0000\u0000\u011a\u011c\u0005\u0014\u0000\u0000\u011b\u011a"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u011f\u0003\u0016\u000b\u0000\u011e\u011b"+
		"\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0005/\u0000\u0000\u0124\u0013\u0001\u0000\u0000\u0000\u0125\u0127\u0005"+
		"\f\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0130\u0005I\u0000"+
		"\u0000\u0129\u012c\u0003X,\u0000\u012a\u012c\u0003R)\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u0131"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0003X,\u0000\u012e\u012f\u0003R"+
		")\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012b\u0001\u0000\u0000"+
		"\u0000\u0130\u012d\u0001\u0000\u0000\u0000\u0131\u0015\u0001\u0000\u0000"+
		"\u0000\u0132\u0139\u0003\u0014\n\u0000\u0133\u0139\u0003\u0018\f\u0000"+
		"\u0134\u0136\u0005\u0015\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u0003*\u0015\u0000\u0138\u0132\u0001\u0000\u0000\u0000\u0138"+
		"\u0133\u0001\u0000\u0000\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0139"+
		"\u013b\u0001\u0000\u0000\u0000\u013a\u013c\u00052\u0000\u0000\u013b\u013a"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0017"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0013\u0000\u0000\u013e\u0140"+
		"\u0005(\u0000\u0000\u013f\u0141\u0003@ \u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0005)\u0000\u0000\u0143\u0147\u0005.\u0000\u0000"+
		"\u0144\u0146\u0003\u0004\u0002\u0000\u0145\u0144\u0001\u0000\u0000\u0000"+
		"\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014b\u0005/\u0000\u0000\u014b"+
		"\u0019\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u0006\u0000\u0000\u014d"+
		"\u014e\u0005I\u0000\u0000\u014e\u0152\u0005.\u0000\u0000\u014f\u0151\u0003"+
		"\u001c\u000e\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0154\u0001"+
		"\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001"+
		"\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0152\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0005/\u0000\u0000\u0156\u001b\u0001\u0000"+
		"\u0000\u0000\u0157\u015a\u0003\u001e\u000f\u0000\u0158\u015a\u0003 \u0010"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u001d\u0001\u0000\u0000\u0000\u015b\u015c\u0005I\u0000\u0000"+
		"\u015c\u015e\u0005(\u0000\u0000\u015d\u015f\u0003@ \u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0005)\u0000\u0000\u0161\u0162\u0005"+
		"0\u0000\u0000\u0162\u0163\u0005\u0002\u0000\u0000\u0163\u001f\u0001\u0000"+
		"\u0000\u0000\u0164\u0166\u0005\f\u0000\u0000\u0165\u0164\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0169\u0005I\u0000\u0000\u0168\u016a\u00056\u0000\u0000\u0169"+
		"\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u00050\u0000\u0000\u016c\u016d"+
		"\u0005\u0002\u0000\u0000\u016d!\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		"\u0016\u0000\u0000\u016f\u0170\u0005I\u0000\u0000\u0170\u0172\u0005.\u0000"+
		"\u0000\u0171\u0173\u0003$\u0012\u0000\u0172\u0171\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0005/\u0000\u0000\u0175#\u0001\u0000\u0000\u0000\u0176\u017b"+
		"\u0003&\u0013\u0000\u0177\u0178\u00053\u0000\u0000\u0178\u017a\u0003&"+
		"\u0013\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000"+
		"\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000"+
		"\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000"+
		"\u0000\u0000\u017e\u0180\u00053\u0000\u0000\u017f\u017e\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180%\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0005I\u0000\u0000\u0182\u0183\u00051\u0000\u0000\u0183\u0186"+
		"\u0003(\u0014\u0000\u0184\u0186\u0005I\u0000\u0000\u0185\u0181\u0001\u0000"+
		"\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\'\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0007\u0001\u0000\u0000\u0188)\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0005I\u0000\u0000\u018a\u018b\u0003B!\u0000\u018b\u018c"+
		"\u00030\u0018\u0000\u018c+\u0001\u0000\u0000\u0000\u018d\u018e\u0005\u0012"+
		"\u0000\u0000\u018e\u018f\u0003*\u0015\u0000\u018f-\u0001\u0000\u0000\u0000"+
		"\u0190\u0192\u0003\u0004\u0002\u0000\u0191\u0190\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000"+
		"\u0193\u0195\u0003<\u001e\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0001\u0000\u0000\u0000\u0195/\u0001\u0000\u0000\u0000\u0196\u019a"+
		"\u0005.\u0000\u0000\u0197\u0199\u0003\u0004\u0002\u0000\u0198\u0197\u0001"+
		"\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019e\u0001"+
		"\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u019f\u0003"+
		"<\u001e\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005/\u0000"+
		"\u0000\u01a11\u0001\u0000\u0000\u0000\u01a2\u01a5\u00034\u001a\u0000\u01a3"+
		"\u01a5\u0005I\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a53\u0001\u0000\u0000\u0000\u01a6\u01b1\u0003"+
		"(\u0014\u0000\u01a7\u01b1\u0003`0\u0000\u01a8\u01b1\u0003^/\u0000\u01a9"+
		"\u01b1\u0003Z-\u0000\u01aa\u01b1\u00036\u001b\u0000\u01ab\u01b1\u0003"+
		"l6\u0000\u01ac\u01ad\u0005D\u0000\u0000\u01ad\u01ae\u0003l6\u0000\u01ae"+
		"\u01af\u0005D\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01a6"+
		"\u0001\u0000\u0000\u0000\u01b0\u01a7\u0001\u0000\u0000\u0000\u01b0\u01a8"+
		"\u0001\u0000\u0000\u0000\u01b0\u01a9\u0001\u0000\u0000\u0000\u01b0\u01aa"+
		"\u0001\u0000\u0000\u0000\u01b0\u01ab\u0001\u0000\u0000\u0000\u01b0\u01ac"+
		"\u0001\u0000\u0000\u0000\u01b15\u0001\u0000\u0000\u0000\u01b2\u01be\u0005"+
		"&\u0000\u0000\u01b3\u01b8\u00032\u0019\u0000\u01b4\u01b5\u00053\u0000"+
		"\u0000\u01b5\u01b7\u00032\u0019\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000"+
		"\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01bd\u00053\u0000\u0000\u01bc"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd"+
		"\u01bf\u0001\u0000\u0000\u0000\u01be\u01b3\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0005\'\u0000\u0000\u01c17\u0001\u0000\u0000\u0000\u01c2\u01c5"+
		"\u0003D\"\u0000\u01c3\u01c5\u00032\u0019\u0000\u01c4\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c59\u0001\u0000\u0000"+
		"\u0000\u01c6\u01cb\u00051\u0000\u0000\u01c7\u01cc\u0003(\u0014\u0000\u01c8"+
		"\u01cc\u0003^/\u0000\u01c9\u01cc\u0003Z-\u0000\u01ca\u01cc\u0003h4\u0000"+
		"\u01cb\u01c7\u0001\u0000\u0000\u0000\u01cb\u01c8\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cc;\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u000f\u0000\u0000\u01ce"+
		"\u01d0\u00032\u0019\u0000\u01cf\u01d1\u00052\u0000\u0000\u01d0\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1=\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0005\u000b\u0000\u0000\u01d3\u01d4\u0005I\u0000"+
		"\u0000\u01d4\u01d5\u0003:\u001d\u0000\u01d5?\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d8\u0005\u0014\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01e1\u0003H$\u0000\u01da\u01dc\u00053\u0000\u0000\u01db\u01dd\u0005"+
		"\u0014\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0003"+
		"H$\u0000\u01df\u01da\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2A\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e6\u0005(\u0000\u0000\u01e5\u01e7\u0003@ \u0000\u01e6\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e8\u01ea\u0005)\u0000\u0000\u01e9\u01eb\u0003"+
		"X,\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ebC\u0001\u0000\u0000\u0000\u01ec\u01ee\u0005\t\u0000\u0000"+
		"\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0\u0003B!\u0000\u01f0\u01f3"+
		"\u0005\u000e\u0000\u0000\u01f1\u01f4\u00030\u0018\u0000\u01f2\u01f4\u0003"+
		".\u0017\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f4E\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\u0010\u0000"+
		"\u0000\u01f6\u01f7\u00054\u0000\u0000\u01f7\u01f8\u0005I\u0000\u0000\u01f8"+
		"\u01f9\u0005(\u0000\u0000\u01f9\u01fa\u0003J%\u0000\u01fa\u01fb\u0005"+
		")\u0000\u0000\u01fbG\u0001\u0000\u0000\u0000\u01fc\u0204\u0005I\u0000"+
		"\u0000\u01fd\u01ff\u0003X,\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0001\u0000\u0000\u0000\u01ff\u0201\u0001\u0000\u0000\u0000\u0200"+
		"\u0202\u0003R)\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001"+
		"\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0205\u0003"+
		"`0\u0000\u0204\u01fe\u0001\u0000\u0000\u0000\u0204\u0203\u0001\u0000\u0000"+
		"\u0000\u0205I\u0001\u0000\u0000\u0000\u0206\u020b\u0003L&\u0000\u0207"+
		"\u0208\u00053\u0000\u0000\u0208\u020a\u0003L&\u0000\u0209\u0207\u0001"+
		"\u0000\u0000\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b\u0209\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020cK\u0001\u0000"+
		"\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0210\u0005I\u0000"+
		"\u0000\u020f\u0211\u0003T*\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0001\u0000\u0000\u0000\u0211\u0216\u0001\u0000\u0000\u0000\u0212"+
		"\u0216\u0003`0\u0000\u0213\u0216\u00032\u0019\u0000\u0214\u0216\u0003"+
		"D\"\u0000\u0215\u020e\u0001\u0000\u0000\u0000\u0215\u0212\u0001\u0000"+
		"\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0214\u0001\u0000"+
		"\u0000\u0000\u0216M\u0001\u0000\u0000\u0000\u0217\u0218\u0003P(\u0000"+
		"\u0218\u0219\u0003H$\u0000\u0219O\u0001\u0000\u0000\u0000\u021a\u021b"+
		"\u0007\u0002\u0000\u0000\u021bQ\u0001\u0000\u0000\u0000\u021c\u021d\u0007"+
		"\u0003\u0000\u0000\u021d\u0220\u00038\u001c\u0000\u021e\u021f\u0005A\u0000"+
		"\u0000\u021f\u0221\u0005I\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u0001\u0000\u0000\u0000\u0221S\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u00051\u0000\u0000\u0223\u0224\u00032\u0019\u0000\u0224U\u0001"+
		"\u0000\u0000\u0000\u0225\u022b\u0005\u0002\u0000\u0000\u0226\u022b\u0005"+
		"I\u0000\u0000\u0227\u022b\u0005\u0003\u0000\u0000\u0228\u022b\u0005\u0011"+
		"\u0000\u0000\u0229\u022b\u0003d2\u0000\u022a\u0225\u0001\u0000\u0000\u0000"+
		"\u022a\u0226\u0001\u0000\u0000\u0000\u022a\u0227\u0001\u0000\u0000\u0000"+
		"\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u0229\u0001\u0000\u0000\u0000"+
		"\u022b\u022e\u0001\u0000\u0000\u0000\u022c\u022d\u0005&\u0000\u0000\u022d"+
		"\u022f\u0005\'\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f"+
		"\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0005&\u0000\u0000\u0231\u0233\u0005\'\u0000\u0000\u0232\u0230\u0001"+
		"\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233W\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u00050\u0000\u0000\u0235\u023a\u0003V+\u0000"+
		"\u0236\u0237\u0007\u0004\u0000\u0000\u0237\u0239\u0003V+\u0000\u0238\u0236"+
		"\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023bY\u0001"+
		"\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u0240\u0003"+
		"\\.\u0000\u023e\u023f\u00054\u0000\u0000\u023f\u0241\u0003\\.\u0000\u0240"+
		"\u023e\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242"+
		"\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243"+
		"[\u0001\u0000\u0000\u0000\u0244\u0249\u0005I\u0000\u0000\u0245\u0249\u0003"+
		"^/\u0000\u0246\u0247\u0005I\u0000\u0000\u0247\u0249\u00036\u001b\u0000"+
		"\u0248\u0244\u0001\u0000\u0000\u0000\u0248\u0245\u0001\u0000\u0000\u0000"+
		"\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u024b\u0001\u0000\u0000\u0000"+
		"\u024a\u024c\u00056\u0000\u0000\u024b\u024a\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0001\u0000\u0000\u0000\u024c]\u0001\u0000\u0000\u0000\u024d\u024e"+
		"\u0005I\u0000\u0000\u024e\u0250\u0005(\u0000\u0000\u024f\u0251\u0003J"+
		"%\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u0005)\u0000\u0000"+
		"\u0253_\u0001\u0000\u0000\u0000\u0254\u0260\u0005.\u0000\u0000\u0255\u025a"+
		"\u0003b1\u0000\u0256\u0257\u00053\u0000\u0000\u0257\u0259\u0003b1\u0000"+
		"\u0258\u0256\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000\u0000"+
		"\u025a\u0258\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000"+
		"\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000"+
		"\u025d\u025f\u00053\u0000\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025e"+
		"\u025f\u0001\u0000\u0000\u0000\u025f\u0261\u0001\u0000\u0000\u0000\u0260"+
		"\u0255\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u0001\u0000\u0000\u0000\u0262\u0263\u0005/\u0000\u0000\u0263a\u0001"+
		"\u0000\u0000\u0000\u0264\u0267\u0005I\u0000\u0000\u0265\u0266\u00050\u0000"+
		"\u0000\u0266\u0268\u00038\u001c\u0000\u0267\u0265\u0001\u0000\u0000\u0000"+
		"\u0267\u0268\u0001\u0000\u0000\u0000\u0268c\u0001\u0000\u0000\u0000\u0269"+
		"\u0272\u0005.\u0000\u0000\u026a\u026f\u0003f3\u0000\u026b\u026c\u0005"+
		"3\u0000\u0000\u026c\u026e\u0003f3\u0000\u026d\u026b\u0001\u0000\u0000"+
		"\u0000\u026e\u0271\u0001\u0000\u0000\u0000\u026f\u026d\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0273\u0001\u0000\u0000"+
		"\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0272\u026a\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000"+
		"\u0000\u0274\u0275\u0005/\u0000\u0000\u0275e\u0001\u0000\u0000\u0000\u0276"+
		"\u0277\u0005I\u0000\u0000\u0277\u0278\u00050\u0000\u0000\u0278\u0279\u0005"+
		"\u0002\u0000\u0000\u0279g\u0001\u0000\u0000\u0000\u027a\u0283\u0005.\u0000"+
		"\u0000\u027b\u0280\u0003j5\u0000\u027c\u027d\u0007\u0005\u0000\u0000\u027d"+
		"\u027f\u0003j5\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027f\u0282\u0001"+
		"\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001"+
		"\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000\u0000\u0282\u0280\u0001"+
		"\u0000\u0000\u0000\u0283\u027b\u0001\u0000\u0000\u0000\u0283\u0284\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0286\u0005"+
		"/\u0000\u0000\u0286i\u0001\u0000\u0000\u0000\u0287\u0289\u0005\f\u0000"+
		"\u0000\u0288\u0287\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028c\u0005I\u0000\u0000"+
		"\u028b\u028d\u00056\u0000\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028c"+
		"\u028d\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e"+
		"\u0291\u00050\u0000\u0000\u028f\u0292\u0005\u0002\u0000\u0000\u0290\u0292"+
		"\u00038\u001c\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0291\u0290\u0001"+
		"\u0000\u0000\u0000\u0292k\u0001\u0000\u0000\u0000\u0293\u0296\u0003n7"+
		"\u0000\u0294\u0296\u0003\u00acV\u0000\u0295\u0293\u0001\u0000\u0000\u0000"+
		"\u0295\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000"+
		"\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000"+
		"\u0298m\u0001\u0000\u0000\u0000\u0299\u029c\u0003t:\u0000\u029a\u029c"+
		"\u0003\u0080@\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029a\u0001"+
		"\u0000\u0000\u0000\u029co\u0001\u0000\u0000\u0000\u029d\u02a3\u0003v;"+
		"\u0000\u029e\u02a3\u0003\u00acV\u0000\u029f\u02a3\u0003t:\u0000\u02a0"+
		"\u02a3\u0003\u0080@\u0000\u02a1\u02a3\u0003\u0082A\u0000\u02a2\u029d\u0001"+
		"\u0000\u0000\u0000\u02a2\u029e\u0001\u0000\u0000\u0000\u02a2\u029f\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a3q\u0001\u0000\u0000\u0000\u02a4\u02a6\u0003p8"+
		"\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000"+
		"\u0000\u02a8s\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ab\u0003z=\u0000\u02ab\u02ac\u0003r9\u0000\u02ac\u02ad\u0003"+
		"|>\u0000\u02ad\u02b0\u0001\u0000\u0000\u0000\u02ae\u02b0\u0003x<\u0000"+
		"\u02af\u02aa\u0001\u0000\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000"+
		"\u02b0u\u0001\u0000\u0000\u0000\u02b1\u02b2\u0007\u0006\u0000\u0000\u02b2"+
		"w\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005 \u0000\u0000\u02b4\u02b7\u0005"+
		"I\u0000\u0000\u02b5\u02b8\u0003r9\u0000\u02b6\u02b8\u0003~?\u0000\u02b7"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b8"+
		"\u02bc\u0001\u0000\u0000\u0000\u02b9\u02bb\u0003~?\u0000\u02ba\u02b9\u0001"+
		"\u0000\u0000\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001"+
		"\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02bf\u0001"+
		"\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02c0\u0005"+
		"#\u0000\u0000\u02c0y\u0001\u0000\u0000\u0000\u02c1\u02c2\u0005 \u0000"+
		"\u0000\u02c2\u02c5\u0005I\u0000\u0000\u02c3\u02c6\u0003r9\u0000\u02c4"+
		"\u02c6\u0003~?\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c6\u02ca\u0001\u0000\u0000\u0000\u02c7\u02c9\u0003"+
		"~?\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000"+
		"\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cd\u02ce\u0005!\u0000\u0000\u02ce{\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d0\u0005\"\u0000\u0000\u02d0\u02d1\u0005I\u0000\u0000\u02d1\u02d2"+
		"\u0005!\u0000\u0000\u02d2}\u0001\u0000\u0000\u0000\u02d3\u02da\u0005I"+
		"\u0000\u0000\u02d4\u02d5\u0005(\u0000\u0000\u02d5\u02d6\u0003\u008aE\u0000"+
		"\u02d6\u02d7\u0005)\u0000\u0000\u02d7\u02da\u0001\u0000\u0000\u0000\u02d8"+
		"\u02da\u0005@\u0000\u0000\u02d9\u02d3\u0001\u0000\u0000\u0000\u02d9\u02d4"+
		"\u0001\u0000\u0000\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02da\u02dd"+
		"\u0001\u0000\u0000\u0000\u02db\u02dc\u00051\u0000\u0000\u02dc\u02de\u0007"+
		"\u0007\u0000\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001"+
		"\u0000\u0000\u0000\u02de\u007f\u0001\u0000\u0000\u0000\u02df\u02e0\u0005"+
		" \u0000\u0000\u02e0\u02e4\u0005I\u0000\u0000\u02e1\u02e3\u0003~?\u0000"+
		"\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e6\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e8\u0005!\u0000\u0000\u02e8\u0081\u0001\u0000\u0000\u0000\u02e9"+
		"\u02ed\u0003\u0084B\u0000\u02ea\u02ed\u0003\u0086C\u0000\u02eb\u02ed\u0003"+
		"\u0088D\u0000\u02ec\u02e9\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000"+
		"\u0000\u0000\u02ec\u02eb\u0001\u0000\u0000\u0000\u02ed\u0083\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ef\u0005\u001f\u0000\u0000\u02ef\u02f0\u00051\u0000"+
		"\u0000\u02f0\u02f1\u0003\u008aE\u0000\u02f1\u0085\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f3\u0005&\u0000\u0000\u02f3\u02f4\u0003\u008aE\u0000\u02f4\u02f5"+
		"\u0005\'\u0000\u0000\u02f5\u02f6\u00051\u0000\u0000\u02f6\u02f7\u0003"+
		"\u008aE\u0000\u02f7\u0087\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005*\u0000"+
		"\u0000\u02f9\u02fa\u0003\u008aE\u0000\u02fa\u02fb\u0005+\u0000\u0000\u02fb"+
		"\u02fc\u00051\u0000\u0000\u02fc\u02fd\u0003\u008aE\u0000\u02fd\u0089\u0001"+
		"\u0000\u0000\u0000\u02fe\u02ff\u0003\u008cF\u0000\u02ff\u008b\u0001\u0000"+
		"\u0000\u0000\u0300\u0305\u0003\u008eG\u0000\u0301\u0302\u00057\u0000\u0000"+
		"\u0302\u0304\u0003\u008eG\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304"+
		"\u0307\u0001\u0000\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305"+
		"\u0306\u0001\u0000\u0000\u0000\u0306\u008d\u0001\u0000\u0000\u0000\u0307"+
		"\u0305\u0001\u0000\u0000\u0000\u0308\u030d\u0003\u0090H\u0000\u0309\u030a"+
		"\u00058\u0000\u0000\u030a\u030c\u0003\u0090H\u0000\u030b\u0309\u0001\u0000"+
		"\u0000\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u008f\u0001\u0000"+
		"\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310\u0315\u0003\u0092"+
		"I\u0000\u0311\u0312\u0007\b\u0000\u0000\u0312\u0314\u0003\u0092I\u0000"+
		"\u0313\u0311\u0001\u0000\u0000\u0000\u0314\u0317\u0001\u0000\u0000\u0000"+
		"\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000"+
		"\u0316\u0091\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000"+
		"\u0318\u0324\u0003\u0094J\u0000\u0319\u0320\u0005 \u0000\u0000\u031a\u0320"+
		"\u0005!\u0000\u0000\u031b\u031c\u0005 \u0000\u0000\u031c\u0320\u00051"+
		"\u0000\u0000\u031d\u031e\u0005!\u0000\u0000\u031e\u0320\u00051\u0000\u0000"+
		"\u031f\u0319\u0001\u0000\u0000\u0000\u031f\u031a\u0001\u0000\u0000\u0000"+
		"\u031f\u031b\u0001\u0000\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000"+
		"\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0323\u0003\u0094J\u0000\u0322"+
		"\u031f\u0001\u0000\u0000\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324"+
		"\u0322\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325"+
		"\u0093\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0327"+
		"\u032c\u0003\u0096K\u0000\u0328\u0329\u0007\u0006\u0000\u0000\u0329\u032b"+
		"\u0003\u0096K\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u032e\u0001"+
		"\u0000\u0000\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032c\u032d\u0001"+
		"\u0000\u0000\u0000\u032d\u0095\u0001\u0000\u0000\u0000\u032e\u032c\u0001"+
		"\u0000\u0000\u0000\u032f\u0334\u0003\u0098L\u0000\u0330\u0331\u0005>\u0000"+
		"\u0000\u0331\u0333\u0003\u0098L\u0000\u0332\u0330\u0001\u0000\u0000\u0000"+
		"\u0333\u0336\u0001\u0000\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000"+
		"\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0097\u0001\u0000\u0000\u0000"+
		"\u0336\u0334\u0001\u0000\u0000\u0000\u0337\u0338\u0007\t\u0000\u0000\u0338"+
		"\u033b\u0003\u0098L\u0000\u0339\u033b\u0003\u009aM\u0000\u033a\u0337\u0001"+
		"\u0000\u0000\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033b\u0099\u0001"+
		"\u0000\u0000\u0000\u033c\u0348\u0003\u00a0P\u0000\u033d\u0348\u0005I\u0000"+
		"\u0000\u033e\u033f\u0005(\u0000\u0000\u033f\u0340\u0003\u008aE\u0000\u0340"+
		"\u0341\u0005)\u0000\u0000\u0341\u0348\u0001\u0000\u0000\u0000\u0342\u0348"+
		"\u0003\u00a2Q\u0000\u0343\u0348\u0003\u00a4R\u0000\u0344\u0348\u0003\u00a6"+
		"S\u0000\u0345\u0348\u0003\u009cN\u0000\u0346\u0348\u0003\u00a8T\u0000"+
		"\u0347\u033c\u0001\u0000\u0000\u0000\u0347\u033d\u0001\u0000\u0000\u0000"+
		"\u0347\u033e\u0001\u0000\u0000\u0000\u0347\u0342\u0001\u0000\u0000\u0000"+
		"\u0347\u0343\u0001\u0000\u0000\u0000\u0347\u0344\u0001\u0000\u0000\u0000"+
		"\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0346\u0001\u0000\u0000\u0000"+
		"\u0348\u009b\u0001\u0000\u0000\u0000\u0349\u0352\u0003\u009eO\u0000\u034a"+
		"\u034b\u00056\u0000\u0000\u034b\u034e\u0005I\u0000\u0000\u034c\u034d\u0005"+
		"0\u0000\u0000\u034d\u034f\u0003\u008aE\u0000\u034e\u034c\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\u0001\u0000\u0000\u0000\u034f\u0351\u0001\u0000\u0000"+
		"\u0000\u0350\u034a\u0001\u0000\u0000\u0000\u0351\u0354\u0001\u0000\u0000"+
		"\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000"+
		"\u0000\u0353\u009d\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000"+
		"\u0000\u0355\u035b\u0003\u00a0P\u0000\u0356\u035b\u0005I\u0000\u0000\u0357"+
		"\u035b\u0003\u00a2Q\u0000\u0358\u035b\u0003\u00a4R\u0000\u0359\u035b\u0003"+
		"\u00a6S\u0000\u035a\u0355\u0001\u0000\u0000\u0000\u035a\u0356\u0001\u0000"+
		"\u0000\u0000\u035a\u0357\u0001\u0000\u0000\u0000\u035a\u0358\u0001\u0000"+
		"\u0000\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035b\u009f\u0001\u0000"+
		"\u0000\u0000\u035c\u035d\u0007\u0007\u0000\u0000\u035d\u00a1\u0001\u0000"+
		"\u0000\u0000\u035e\u035f\u0005I\u0000\u0000\u035f\u0368\u0005(\u0000\u0000"+
		"\u0360\u0365\u0003\u009eO\u0000\u0361\u0362\u00053\u0000\u0000\u0362\u0364"+
		"\u0003\u008aE\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0367\u0001"+
		"\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0365\u0366\u0001"+
		"\u0000\u0000\u0000\u0366\u0369\u0001\u0000\u0000\u0000\u0367\u0365\u0001"+
		"\u0000\u0000\u0000\u0368\u0360\u0001\u0000\u0000\u0000\u0368\u0369\u0001"+
		"\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000\u0000\u036a\u036b\u0005"+
		")\u0000\u0000\u036b\u00a3\u0001\u0000\u0000\u0000\u036c\u0375\u0005&\u0000"+
		"\u0000\u036d\u0372\u0003\u009eO\u0000\u036e\u036f\u00053\u0000\u0000\u036f"+
		"\u0371\u0003\u008aE\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0371\u0374"+
		"\u0001\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0373"+
		"\u0001\u0000\u0000\u0000\u0373\u0376\u0001\u0000\u0000\u0000\u0374\u0372"+
		"\u0001\u0000\u0000\u0000\u0375\u036d\u0001\u0000\u0000\u0000\u0375\u0376"+
		"\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0378"+
		"\u0005\'\u0000\u0000\u0378\u00a5\u0001\u0000\u0000\u0000\u0379\u0386\u0005"+
		",\u0000\u0000\u037a\u037b\u0005I\u0000\u0000\u037b\u037c\u00050\u0000"+
		"\u0000\u037c\u0383\u0003\u008aE\u0000\u037d\u037e\u00053\u0000\u0000\u037e"+
		"\u037f\u0005I\u0000\u0000\u037f\u0380\u00050\u0000\u0000\u0380\u0382\u0003"+
		"\u008aE\u0000\u0381\u037d\u0001\u0000\u0000\u0000\u0382\u0385\u0001\u0000"+
		"\u0000\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000"+
		"\u0000\u0000\u0384\u0387\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000"+
		"\u0000\u0000\u0386\u037a\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000"+
		"\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u0389\u0005-\u0000"+
		"\u0000\u0389\u00a7\u0001\u0000\u0000\u0000\u038a\u038b\u0003\u009eO\u0000"+
		"\u038b\u038c\u00054\u0000\u0000\u038c\u038d\u0003\u008aE\u0000\u038d\u038f"+
		"\u0001\u0000\u0000\u0000\u038e\u038a\u0001\u0000\u0000\u0000\u038f\u0392"+
		"\u0001\u0000\u0000\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0390\u0391"+
		"\u0001\u0000\u0000\u0000\u0391\u00a9\u0001\u0000\u0000\u0000\u0392\u0390"+
		"\u0001\u0000\u0000\u0000\u0393\u0394\u0005,\u0000\u0000\u0394\u0395\u0003"+
		"\u008aE\u0000\u0395\u0396\u0005-\u0000\u0000\u0396\u00ab\u0001\u0000\u0000"+
		"\u0000\u0397\u039b\u0005I\u0000\u0000\u0398\u039b\u0005E\u0000\u0000\u0399"+
		"\u039b\u0003\u00aaU\u0000\u039a\u0397\u0001\u0000\u0000\u0000\u039a\u0398"+
		"\u0001\u0000\u0000\u0000\u039a\u0399\u0001\u0000\u0000\u0000\u039b\u039c"+
		"\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039c\u039d"+
		"\u0001\u0000\u0000\u0000\u039d\u00ad\u0001\u0000\u0000\u0000\u039e\u039f"+
		"\u0005\u0017\u0000\u0000\u039f\u03a0\u0005(\u0000\u0000\u03a0\u03a1\u0003"+
		"\u008aE\u0000\u03a1\u03a2\u0005)\u0000\u0000\u03a2\u03a6\u0005.\u0000"+
		"\u0000\u03a3\u03a5\u0003\u0004\u0002\u0000\u03a4\u03a3\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a8\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000"+
		"\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a9\u03b3\u0005/\u0000\u0000"+
		"\u03aa\u03ab\u0005\u0018\u0000\u0000\u03ab\u03af\u0005.\u0000\u0000\u03ac"+
		"\u03ae\u0003\u0004\u0002\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ae"+
		"\u03b1\u0001\u0000\u0000\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03af"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1"+
		"\u03af\u0001\u0000\u0000\u0000\u03b2\u03b4\u0005/\u0000\u0000\u03b3\u03aa"+
		"\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000\u0000\u0000\u03b4\u00af"+
		"\u0001\u0000\u0000\u0000\u03b5\u03b8\u0003\u00b2Y\u0000\u03b6\u03b8\u0003"+
		"\u00b4Z\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03bd\u0005.\u0000"+
		"\u0000\u03ba\u03bc\u0003\u0004\u0002\u0000\u03bb\u03ba\u0001\u0000\u0000"+
		"\u0000\u03bc\u03bf\u0001\u0000\u0000\u0000\u03bd\u03bb\u0001\u0000\u0000"+
		"\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03c0\u0001\u0000\u0000"+
		"\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c1\u0005/\u0000\u0000"+
		"\u03c1\u00b1\u0001\u0000\u0000\u0000\u03c2\u03c3\u0005\u001a\u0000\u0000"+
		"\u03c3\u03c4\u0005(\u0000\u0000\u03c4\u03c5\u0003\u008aE\u0000\u03c5\u03c6"+
		"\u0005)\u0000\u0000\u03c6\u00b3\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005"+
		"\u0019\u0000\u0000\u03c8\u03ca\u0005(\u0000\u0000\u03c9\u03cb\u0003\u00b6"+
		"[\u0000\u03ca\u03c9\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000"+
		"\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u03ce\u00052\u0000\u0000"+
		"\u03cd\u03cf\u0003\u008aE\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce"+
		"\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0"+
		"\u03d2\u00052\u0000\u0000\u03d1\u03d3\u0003\u00b8\\\u0000\u03d2\u03d1"+
		"\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d4"+
		"\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005)\u0000\u0000\u03d5\u00b5\u0001"+
		"\u0000\u0000\u0000\u03d6\u03e0\u0003N\'\u0000\u03d7\u03dc\u0003\u008a"+
		"E\u0000\u03d8\u03d9\u00053\u0000\u0000\u03d9\u03db\u0003\u008aE\u0000"+
		"\u03da\u03d8\u0001\u0000\u0000\u0000\u03db\u03de\u0001\u0000\u0000\u0000"+
		"\u03dc\u03da\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000\u0000"+
		"\u03dd\u03e0\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000"+
		"\u03df\u03d6\u0001\u0000\u0000\u0000\u03df\u03d7\u0001\u0000\u0000\u0000"+
		"\u03e0\u00b7\u0001\u0000\u0000\u0000\u03e1\u03e6\u0003\u008aE\u0000\u03e2"+
		"\u03e3\u00053\u0000\u0000\u03e3\u03e5\u0003\u008aE\u0000\u03e4\u03e2\u0001"+
		"\u0000\u0000\u0000\u03e5\u03e8\u0001\u0000\u0000\u0000\u03e6\u03e4\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7\u00b9\u0001"+
		"\u0000\u0000\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000z\u00bd\u00c1\u00c6"+
		"\u00c9\u00cc\u00d0\u00e3\u00ea\u00f8\u0107\u010e\u0117\u011b\u0120\u0126"+
		"\u012b\u0130\u0135\u0138\u013b\u0140\u0147\u0152\u0159\u015e\u0165\u0169"+
		"\u0172\u017b\u017f\u0185\u0191\u0194\u019a\u019e\u01a4\u01b0\u01b8\u01bc"+
		"\u01be\u01c4\u01cb\u01d0\u01d7\u01dc\u01e1\u01e6\u01ea\u01ed\u01f3\u01fe"+
		"\u0201\u0204\u020b\u0210\u0215\u0220\u022a\u022e\u0232\u023a\u0242\u0248"+
		"\u024b\u0250\u025a\u025e\u0260\u0267\u026f\u0272\u0280\u0283\u0288\u028c"+
		"\u0291\u0295\u0297\u029b\u02a2\u02a7\u02af\u02b7\u02bc\u02c5\u02ca\u02d9"+
		"\u02dd\u02e4\u02ec\u0305\u030d\u0315\u031f\u0324\u032c\u0334\u033a\u0347"+
		"\u034e\u0352\u035a\u0365\u0368\u0372\u0375\u0383\u0386\u0390\u039a\u039c"+
		"\u03a6\u03af\u03b3\u03b7\u03bd\u03ca\u03ce\u03d2\u03dc\u03df\u03e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}