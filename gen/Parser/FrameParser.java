// Generated from C:/Users/LEGION/Desktop/angular_compiler-master/FrameParser.g4 by ANTLR 4.13.2
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FrameParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMG_TAG_OPEN=1, TAG_SELF_CLOSE=2, SRC=3, ALT=4, BUTTON_TAG_OPEN=5, BUTTON_TAG_CLOSE=6, 
		TYPE=7, DISABLED=8, CLICK=9, STYLE=10, INPUT_TAG_OPEN=11, PLACEHOLDER=12, 
		VALUE=13, NAME=14, ID=15, DIV_TAG_OPEN=16, DIV_TAG_CLOSE=17, CLASS=18, 
		P_TAG_OPEN=19, P_TAG_CLOSE=20, ROUTER_OUTLET_TAG=21, STAR_NG_IF=22, STAR_NG_FOR=23, 
		NG_MODEL=24, NG_MODEL_TWO_WAY=25, FORM_TAG_OPEN=26, FORM_TAG_CLOSE=27, 
		NG_SUBMIT=28, LABEL_TAG_OPEN=29, LABEL_TAG_CLOSE=30, FOR=31, AT_COMPONENT=32, 
		SELECTOR=33, TEMPLATE=34, STYLEURLS=35, EXPORT=36, PRIMITIVE_TYPE=37, 
		PLUS=38, MINUS=39, STAR=40, DIV=41, GT=42, LT=43, AND=44, OR=45, NOT=46, 
		BOOLEAN=47, LBRACE=48, RBRACE=49, LPAREN=50, RPAREN=51, COLON=52, COMMA=53, 
		LBRACK=54, RBRACK=55, CONSTRUCTOR=56, THIS=57, DOT=58, SEMI=59, LET=60, 
		CONST=61, VAR=62, RETURN=63, PUBLIC=64, PRIVATE=65, PROTECTED=66, STATIC=67, 
		ASYNC=68, AT_INJECTABLE=69, PROVIDEDIN=70, USECLASS=71, USEVALUE=72, EXTENDS=73, 
		FUNCTION=74, ARROW=75, INTERFACE=76, ENUM=77, SELECT=78, ROUTES=79, PATH=80, 
		COMPONENT=81, CREATEACTION=82, STORE=83, DISPATCH=84, CREATEREDUCER=85, 
		ON=86, EQ=87, IDENTITY=88, STRING=89, NUMBER=90, WS=91;
	public static final int
		RULE_root = 0, RULE_htmlSection = 1, RULE_tsSection = 2, RULE_htmlImageTag = 3, 
		RULE_imgAttribute = 4, RULE_htmlButtonTag = 5, RULE_buttonAttribute = 6, 
		RULE_buttonContent = 7, RULE_htmlInputTag = 8, RULE_inputAttribute = 9, 
		RULE_htmlParagraphTag = 10, RULE_paragraphAttribute = 11, RULE_paragraphContent = 12, 
		RULE_htmlLabelTag = 13, RULE_labelAttribute = 14, RULE_labelContent = 15, 
		RULE_htmlDivTag = 16, RULE_divAttribute = 17, RULE_divContent = 18, RULE_htmlFormTag = 19, 
		RULE_formAttribute = 20, RULE_formContent = 21, RULE_routerOutletTag = 22, 
		RULE_ngIfDirective = 23, RULE_ngForDirective = 24, RULE_componentDeclaration = 25, 
		RULE_componentBody = 26, RULE_componentProperty = 27, RULE_arrayLiteral = 28, 
		RULE_classBlock = 29, RULE_classMember = 30, RULE_variableDeclaration = 31, 
		RULE_type = 32, RULE_expression = 33, RULE_binaryOp = 34, RULE_unaryOp = 35, 
		RULE_literal = 36, RULE_arrayAccess = 37, RULE_objectLiteral = 38, RULE_objectProperty = 39, 
		RULE_constructorDeclaration = 40, RULE_parameterList = 41, RULE_parameter = 42, 
		RULE_block = 43, RULE_statement = 44, RULE_assignmentStatement = 45, RULE_functionCallStatement = 46, 
		RULE_argumentList = 47, RULE_methodDeclaration = 48, RULE_methodModifier = 49, 
		RULE_returnStatement = 50, RULE_serviceDeclaration = 51, RULE_injectableBody = 52, 
		RULE_injectableProperty = 53, RULE_classDeclaration = 54, RULE_functionDeclaration = 55, 
		RULE_arrowFunction = 56, RULE_interfaceDeclaration = 57, RULE_interfaceBody = 58, 
		RULE_interfaceProperty = 59, RULE_enumDeclaration = 60, RULE_enumBody = 61, 
		RULE_enumMember = 62, RULE_routingDeclaration = 63, RULE_routeConfig = 64, 
		RULE_pathProperty = 65, RULE_routeComponentProperty = 66, RULE_ngrxActionDeclaration = 67, 
		RULE_actionType = 68, RULE_storeDispatchStatement = 69, RULE_actionCall = 70, 
		RULE_storeSelectExpression = 71, RULE_selectorCall = 72, RULE_ngrxReducerDeclaration = 73, 
		RULE_reducerConfig = 74, RULE_onReducerBlock = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "htmlSection", "tsSection", "htmlImageTag", "imgAttribute", "htmlButtonTag", 
			"buttonAttribute", "buttonContent", "htmlInputTag", "inputAttribute", 
			"htmlParagraphTag", "paragraphAttribute", "paragraphContent", "htmlLabelTag", 
			"labelAttribute", "labelContent", "htmlDivTag", "divAttribute", "divContent", 
			"htmlFormTag", "formAttribute", "formContent", "routerOutletTag", "ngIfDirective", 
			"ngForDirective", "componentDeclaration", "componentBody", "componentProperty", 
			"arrayLiteral", "classBlock", "classMember", "variableDeclaration", "type", 
			"expression", "binaryOp", "unaryOp", "literal", "arrayAccess", "objectLiteral", 
			"objectProperty", "constructorDeclaration", "parameterList", "parameter", 
			"block", "statement", "assignmentStatement", "functionCallStatement", 
			"argumentList", "methodDeclaration", "methodModifier", "returnStatement", 
			"serviceDeclaration", "injectableBody", "injectableProperty", "classDeclaration", 
			"functionDeclaration", "arrowFunction", "interfaceDeclaration", "interfaceBody", 
			"interfaceProperty", "enumDeclaration", "enumBody", "enumMember", "routingDeclaration", 
			"routeConfig", "pathProperty", "routeComponentProperty", "ngrxActionDeclaration", 
			"actionType", "storeDispatchStatement", "actionCall", "storeSelectExpression", 
			"selectorCall", "ngrxReducerDeclaration", "reducerConfig", "onReducerBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<img'", "'/>'", "'src'", "'alt'", "'<button'", "'</button>'", 
			"'type'", "'disabled'", "'(click)'", "'style'", "'<input'", "'placeholder'", 
			"'value'", "'name'", "'id'", "'<div'", "'</div>'", "'class'", "'<p'", 
			"'</p>'", "'<router-outlet></router-outlet>'", "'*ngIf'", "'*ngFor'", 
			"'[ngModel]'", "'[(ngModel)]'", "'<form'", "'</form>'", "'(ngSubmit)'", 
			"'<label'", "'</label>'", "'for'", "'@Component'", "'selector'", "'template'", 
			"'styleUrls'", "'export'", null, "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
			"'&&'", "'||'", "'!'", null, "'{'", "'}'", "'('", "')'", "':'", "','", 
			"'['", "']'", "'constructor'", "'this'", "'.'", "';'", "'let'", "'const'", 
			"'var'", "'return'", "'public'", "'private'", "'protected'", "'static'", 
			"'async'", "'@Injectable'", "'providedIn'", "'useClass'", "'useValue'", 
			"'extends'", "'function'", "'=>'", "'interface'", "'enum'", "'select'", 
			"'Routes'", "'path'", "'component'", "'createAction'", "'store'", "'dispatch'", 
			"'createReducer'", "'on'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMG_TAG_OPEN", "TAG_SELF_CLOSE", "SRC", "ALT", "BUTTON_TAG_OPEN", 
			"BUTTON_TAG_CLOSE", "TYPE", "DISABLED", "CLICK", "STYLE", "INPUT_TAG_OPEN", 
			"PLACEHOLDER", "VALUE", "NAME", "ID", "DIV_TAG_OPEN", "DIV_TAG_CLOSE", 
			"CLASS", "P_TAG_OPEN", "P_TAG_CLOSE", "ROUTER_OUTLET_TAG", "STAR_NG_IF", 
			"STAR_NG_FOR", "NG_MODEL", "NG_MODEL_TWO_WAY", "FORM_TAG_OPEN", "FORM_TAG_CLOSE", 
			"NG_SUBMIT", "LABEL_TAG_OPEN", "LABEL_TAG_CLOSE", "FOR", "AT_COMPONENT", 
			"SELECTOR", "TEMPLATE", "STYLEURLS", "EXPORT", "PRIMITIVE_TYPE", "PLUS", 
			"MINUS", "STAR", "DIV", "GT", "LT", "AND", "OR", "NOT", "BOOLEAN", "LBRACE", 
			"RBRACE", "LPAREN", "RPAREN", "COLON", "COMMA", "LBRACK", "RBRACK", "CONSTRUCTOR", 
			"THIS", "DOT", "SEMI", "LET", "CONST", "VAR", "RETURN", "PUBLIC", "PRIVATE", 
			"PROTECTED", "STATIC", "ASYNC", "AT_INJECTABLE", "PROVIDEDIN", "USECLASS", 
			"USEVALUE", "EXTENDS", "FUNCTION", "ARROW", "INTERFACE", "ENUM", "SELECT", 
			"ROUTES", "PATH", "COMPONENT", "CREATEACTION", "STORE", "DISPATCH", "CREATEREDUCER", 
			"ON", "EQ", "IDENTITY", "STRING", "NUMBER", "WS"
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
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FrameParser.EOF, 0); }
		public List<HtmlSectionContext> htmlSection() {
			return getRuleContexts(HtmlSectionContext.class);
		}
		public HtmlSectionContext htmlSection(int i) {
			return getRuleContext(HtmlSectionContext.class,i);
		}
		public List<TsSectionContext> tsSection() {
			return getRuleContexts(TsSectionContext.class);
		}
		public TsSectionContext tsSection(int i) {
			return getRuleContext(TsSectionContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 606668834L) != 0)) {
				{
				{
				setState(152);
				htmlSection();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 4606084251665L) != 0)) {
				{
				{
				setState(158);
				tsSection();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSectionContext extends ParserRuleContext {
		public HtmlSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlSection; }
	 
		public HtmlSectionContext() { }
		public void copyFrom(HtmlSectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLRouterOutletLabelContext extends HtmlSectionContext {
		public RouterOutletTagContext routerOutletTag() {
			return getRuleContext(RouterOutletTagContext.class,0);
		}
		public HTMLRouterOutletLabelContext(HtmlSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHTMLRouterOutletLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLDivLabelContext extends HtmlSectionContext {
		public HtmlDivTagContext htmlDivTag() {
			return getRuleContext(HtmlDivTagContext.class,0);
		}
		public HTMLDivLabelContext(HtmlSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHTMLDivLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLFormLabelContext extends HtmlSectionContext {
		public HtmlFormTagContext htmlFormTag() {
			return getRuleContext(HtmlFormTagContext.class,0);
		}
		public HTMLFormLabelContext(HtmlSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHTMLFormLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLInputLabelContext extends HtmlSectionContext {
		public HtmlInputTagContext htmlInputTag() {
			return getRuleContext(HtmlInputTagContext.class,0);
		}
		public HTMLInputLabelContext(HtmlSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHTMLInputLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLParagraphLabelContext extends HtmlSectionContext {
		public HtmlParagraphTagContext htmlParagraphTag() {
			return getRuleContext(HtmlParagraphTagContext.class,0);
		}
		public HTMLParagraphLabelContext(HtmlSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHTMLParagraphLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLImageLabelContext extends HtmlSectionContext {
		public HtmlImageTagContext htmlImageTag() {
			return getRuleContext(HtmlImageTagContext.class,0);
		}
		public HTMLImageLabelContext(HtmlSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHTMLImageLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLLabelContext extends HtmlSectionContext {
		public HtmlLabelTagContext htmlLabelTag() {
			return getRuleContext(HtmlLabelTagContext.class,0);
		}
		public HTMLLabelContext(HtmlSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHTMLLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLButtonLabelContext extends HtmlSectionContext {
		public HtmlButtonTagContext htmlButtonTag() {
			return getRuleContext(HtmlButtonTagContext.class,0);
		}
		public HTMLButtonLabelContext(HtmlSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHTMLButtonLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlSectionContext htmlSection() throws RecognitionException {
		HtmlSectionContext _localctx = new HtmlSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlSection);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV_TAG_OPEN:
				_localctx = new HTMLDivLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				htmlDivTag();
				}
				break;
			case FORM_TAG_OPEN:
				_localctx = new HTMLFormLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				htmlFormTag();
				}
				break;
			case P_TAG_OPEN:
				_localctx = new HTMLParagraphLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				htmlParagraphTag();
				}
				break;
			case BUTTON_TAG_OPEN:
				_localctx = new HTMLButtonLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				htmlButtonTag();
				}
				break;
			case INPUT_TAG_OPEN:
				_localctx = new HTMLInputLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				htmlInputTag();
				}
				break;
			case IMG_TAG_OPEN:
				_localctx = new HTMLImageLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				htmlImageTag();
				}
				break;
			case LABEL_TAG_OPEN:
				_localctx = new HTMLLabelContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				htmlLabelTag();
				}
				break;
			case ROUTER_OUTLET_TAG:
				_localctx = new HTMLRouterOutletLabelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				routerOutletTag();
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
	public static class TsSectionContext extends ParserRuleContext {
		public TsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsSection; }
	 
		public TsSectionContext() { }
		public void copyFrom(TsSectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSServiceLabelContext extends TsSectionContext {
		public ServiceDeclarationContext serviceDeclaration() {
			return getRuleContext(ServiceDeclarationContext.class,0);
		}
		public TSServiceLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSServiceLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSRoutingLabelContext extends TsSectionContext {
		public RoutingDeclarationContext routingDeclaration() {
			return getRuleContext(RoutingDeclarationContext.class,0);
		}
		public TSRoutingLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSRoutingLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSVariableLabelContext extends TsSectionContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TSVariableLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSVariableLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSInterfaceLabelContext extends TsSectionContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TSInterfaceLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSInterfaceLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSComponentLabelContext extends TsSectionContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public TSComponentLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSComponentLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSFunctionLabelContext extends TsSectionContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TSFunctionLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSFunctionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSEnumLabelContext extends TsSectionContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public TSEnumLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSEnumLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSArrowFunctionLabelContext extends TsSectionContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TSArrowFunctionLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSArrowFunctionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSClassLabelContext extends TsSectionContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TSClassLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSClassLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSActionLabelContext extends TsSectionContext {
		public NgrxActionDeclarationContext ngrxActionDeclaration() {
			return getRuleContext(NgrxActionDeclarationContext.class,0);
		}
		public TSActionLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSActionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TSReducerLabelContext extends TsSectionContext {
		public NgrxReducerDeclarationContext ngrxReducerDeclaration() {
			return getRuleContext(NgrxReducerDeclarationContext.class,0);
		}
		public TSReducerLabelContext(TsSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitTSReducerLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsSectionContext tsSection() throws RecognitionException {
		TsSectionContext _localctx = new TsSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tsSection);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new TSComponentLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				componentDeclaration();
				}
				break;
			case 2:
				_localctx = new TSServiceLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				serviceDeclaration();
				}
				break;
			case 3:
				_localctx = new TSClassLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				classDeclaration();
				}
				break;
			case 4:
				_localctx = new TSFunctionLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				functionDeclaration();
				}
				break;
			case 5:
				_localctx = new TSArrowFunctionLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				arrowFunction();
				}
				break;
			case 6:
				_localctx = new TSVariableLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				variableDeclaration();
				}
				break;
			case 7:
				_localctx = new TSInterfaceLabelContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				interfaceDeclaration();
				}
				break;
			case 8:
				_localctx = new TSEnumLabelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				enumDeclaration();
				}
				break;
			case 9:
				_localctx = new TSRoutingLabelContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				routingDeclaration();
				}
				break;
			case 10:
				_localctx = new TSActionLabelContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
				ngrxActionDeclaration();
				}
				break;
			case 11:
				_localctx = new TSReducerLabelContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(186);
				ngrxReducerDeclaration();
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
	public static class HtmlImageTagContext extends ParserRuleContext {
		public TerminalNode IMG_TAG_OPEN() { return getToken(FrameParser.IMG_TAG_OPEN, 0); }
		public TerminalNode TAG_SELF_CLOSE() { return getToken(FrameParser.TAG_SELF_CLOSE, 0); }
		public List<ImgAttributeContext> imgAttribute() {
			return getRuleContexts(ImgAttributeContext.class);
		}
		public ImgAttributeContext imgAttribute(int i) {
			return getRuleContext(ImgAttributeContext.class,i);
		}
		public HtmlImageTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlImageTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtmlImageTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlImageTagContext htmlImageTag() throws RecognitionException {
		HtmlImageTagContext _localctx = new HtmlImageTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlImageTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IMG_TAG_OPEN);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1048L) != 0)) {
				{
				{
				setState(190);
				imgAttribute();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(TAG_SELF_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImgAttributeContext extends ParserRuleContext {
		public TerminalNode SRC() { return getToken(FrameParser.SRC, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode ALT() { return getToken(FrameParser.ALT, 0); }
		public TerminalNode STYLE() { return getToken(FrameParser.STYLE, 0); }
		public ImgAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitImgAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgAttributeContext imgAttribute() throws RecognitionException {
		ImgAttributeContext _localctx = new ImgAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_imgAttribute);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SRC:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(SRC);
				setState(199);
				match(EQ);
				setState(200);
				match(STRING);
				}
				break;
			case ALT:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(ALT);
				setState(202);
				match(EQ);
				setState(203);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(STYLE);
				setState(205);
				match(EQ);
				setState(206);
				match(STRING);
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
	public static class HtmlButtonTagContext extends ParserRuleContext {
		public TerminalNode BUTTON_TAG_OPEN() { return getToken(FrameParser.BUTTON_TAG_OPEN, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public TerminalNode BUTTON_TAG_CLOSE() { return getToken(FrameParser.BUTTON_TAG_CLOSE, 0); }
		public List<ButtonAttributeContext> buttonAttribute() {
			return getRuleContexts(ButtonAttributeContext.class);
		}
		public ButtonAttributeContext buttonAttribute(int i) {
			return getRuleContext(ButtonAttributeContext.class,i);
		}
		public ButtonContentContext buttonContent() {
			return getRuleContext(ButtonContentContext.class,0);
		}
		public HtmlButtonTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlButtonTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtmlButtonTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlButtonTagContext htmlButtonTag() throws RecognitionException {
		HtmlButtonTagContext _localctx = new HtmlButtonTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlButtonTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(BUTTON_TAG_OPEN);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62916480L) != 0)) {
				{
				{
				setState(210);
				buttonAttribute();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(GT);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(217);
				buttonContent();
				}
			}

			setState(220);
			match(BUTTON_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonAttributeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(FrameParser.TYPE, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode DISABLED() { return getToken(FrameParser.DISABLED, 0); }
		public TerminalNode CLICK() { return getToken(FrameParser.CLICK, 0); }
		public TerminalNode STYLE() { return getToken(FrameParser.STYLE, 0); }
		public TerminalNode STAR_NG_IF() { return getToken(FrameParser.STAR_NG_IF, 0); }
		public TerminalNode STAR_NG_FOR() { return getToken(FrameParser.STAR_NG_FOR, 0); }
		public TerminalNode NG_MODEL() { return getToken(FrameParser.NG_MODEL, 0); }
		public TerminalNode NG_MODEL_TWO_WAY() { return getToken(FrameParser.NG_MODEL_TWO_WAY, 0); }
		public ButtonAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitButtonAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonAttributeContext buttonAttribute() throws RecognitionException {
		ButtonAttributeContext _localctx = new ButtonAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_buttonAttribute);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(TYPE);
				setState(223);
				match(EQ);
				setState(224);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(DISABLED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(CLICK);
				setState(227);
				match(EQ);
				setState(228);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(STYLE);
				setState(230);
				match(EQ);
				setState(231);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(STAR_NG_IF);
				setState(233);
				match(EQ);
				setState(234);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
				match(STAR_NG_FOR);
				setState(236);
				match(EQ);
				setState(237);
				match(STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				match(CLICK);
				setState(239);
				match(EQ);
				setState(240);
				match(STRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(241);
				match(NG_MODEL);
				setState(242);
				match(EQ);
				setState(243);
				match(STRING);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				match(NG_MODEL_TWO_WAY);
				setState(245);
				match(EQ);
				setState(246);
				match(STRING);
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
	public static class ButtonContentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public ButtonContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitButtonContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContentContext buttonContent() throws RecognitionException {
		ButtonContentContext _localctx = new ButtonContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_buttonContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlInputTagContext extends ParserRuleContext {
		public TerminalNode INPUT_TAG_OPEN() { return getToken(FrameParser.INPUT_TAG_OPEN, 0); }
		public TerminalNode TAG_SELF_CLOSE() { return getToken(FrameParser.TAG_SELF_CLOSE, 0); }
		public List<InputAttributeContext> inputAttribute() {
			return getRuleContexts(InputAttributeContext.class);
		}
		public InputAttributeContext inputAttribute(int i) {
			return getRuleContext(InputAttributeContext.class,i);
		}
		public HtmlInputTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlInputTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtmlInputTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlInputTagContext htmlInputTag() throws RecognitionException {
		HtmlInputTagContext _localctx = new HtmlInputTagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlInputTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(INPUT_TAG_OPEN);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50394240L) != 0)) {
				{
				{
				setState(252);
				inputAttribute();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(TAG_SELF_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputAttributeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(FrameParser.TYPE, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode PLACEHOLDER() { return getToken(FrameParser.PLACEHOLDER, 0); }
		public TerminalNode STYLE() { return getToken(FrameParser.STYLE, 0); }
		public TerminalNode VALUE() { return getToken(FrameParser.VALUE, 0); }
		public TerminalNode NAME() { return getToken(FrameParser.NAME, 0); }
		public TerminalNode ID() { return getToken(FrameParser.ID, 0); }
		public TerminalNode NG_MODEL() { return getToken(FrameParser.NG_MODEL, 0); }
		public TerminalNode NG_MODEL_TWO_WAY() { return getToken(FrameParser.NG_MODEL_TWO_WAY, 0); }
		public InputAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInputAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputAttributeContext inputAttribute() throws RecognitionException {
		InputAttributeContext _localctx = new InputAttributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inputAttribute);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(TYPE);
				setState(261);
				match(EQ);
				setState(262);
				match(STRING);
				}
				break;
			case PLACEHOLDER:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(PLACEHOLDER);
				setState(264);
				match(EQ);
				setState(265);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(STYLE);
				setState(267);
				match(EQ);
				setState(268);
				match(STRING);
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(VALUE);
				setState(270);
				match(EQ);
				setState(271);
				match(STRING);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(NAME);
				setState(273);
				match(EQ);
				setState(274);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				match(ID);
				setState(276);
				match(EQ);
				setState(277);
				match(STRING);
				}
				break;
			case NG_MODEL:
				enterOuterAlt(_localctx, 7);
				{
				setState(278);
				match(NG_MODEL);
				setState(279);
				match(EQ);
				setState(280);
				match(STRING);
				}
				break;
			case NG_MODEL_TWO_WAY:
				enterOuterAlt(_localctx, 8);
				{
				setState(281);
				match(NG_MODEL_TWO_WAY);
				setState(282);
				match(EQ);
				setState(283);
				match(STRING);
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
	public static class HtmlParagraphTagContext extends ParserRuleContext {
		public TerminalNode P_TAG_OPEN() { return getToken(FrameParser.P_TAG_OPEN, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public TerminalNode P_TAG_CLOSE() { return getToken(FrameParser.P_TAG_CLOSE, 0); }
		public List<ParagraphAttributeContext> paragraphAttribute() {
			return getRuleContexts(ParagraphAttributeContext.class);
		}
		public ParagraphAttributeContext paragraphAttribute(int i) {
			return getRuleContext(ParagraphAttributeContext.class,i);
		}
		public ParagraphContentContext paragraphContent() {
			return getRuleContext(ParagraphContentContext.class,0);
		}
		public HtmlParagraphTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlParagraphTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtmlParagraphTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlParagraphTagContext htmlParagraphTag() throws RecognitionException {
		HtmlParagraphTagContext _localctx = new HtmlParagraphTagContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlParagraphTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(P_TAG_OPEN);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63211008L) != 0)) {
				{
				{
				setState(287);
				paragraphAttribute();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(GT);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2082L) != 0) || _la==STRING) {
				{
				setState(294);
				paragraphContent();
				}
			}

			setState(297);
			match(P_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParagraphAttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FrameParser.ID, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode CLASS() { return getToken(FrameParser.CLASS, 0); }
		public TerminalNode STYLE() { return getToken(FrameParser.STYLE, 0); }
		public TerminalNode STAR_NG_IF() { return getToken(FrameParser.STAR_NG_IF, 0); }
		public TerminalNode STAR_NG_FOR() { return getToken(FrameParser.STAR_NG_FOR, 0); }
		public TerminalNode CLICK() { return getToken(FrameParser.CLICK, 0); }
		public TerminalNode NG_MODEL() { return getToken(FrameParser.NG_MODEL, 0); }
		public TerminalNode NG_MODEL_TWO_WAY() { return getToken(FrameParser.NG_MODEL_TWO_WAY, 0); }
		public ParagraphAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraphAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitParagraphAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagraphAttributeContext paragraphAttribute() throws RecognitionException {
		ParagraphAttributeContext _localctx = new ParagraphAttributeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paragraphAttribute);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(ID);
				setState(300);
				match(EQ);
				setState(301);
				match(STRING);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(CLASS);
				setState(303);
				match(EQ);
				setState(304);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(STYLE);
				setState(306);
				match(EQ);
				setState(307);
				match(STRING);
				}
				break;
			case STAR_NG_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(STAR_NG_IF);
				setState(309);
				match(EQ);
				setState(310);
				match(STRING);
				}
				break;
			case STAR_NG_FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(STAR_NG_FOR);
				setState(312);
				match(EQ);
				setState(313);
				match(STRING);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 6);
				{
				setState(314);
				match(CLICK);
				setState(315);
				match(EQ);
				setState(316);
				match(STRING);
				}
				break;
			case NG_MODEL:
				enterOuterAlt(_localctx, 7);
				{
				setState(317);
				match(NG_MODEL);
				setState(318);
				match(EQ);
				setState(319);
				match(STRING);
				}
				break;
			case NG_MODEL_TWO_WAY:
				enterOuterAlt(_localctx, 8);
				{
				setState(320);
				match(NG_MODEL_TWO_WAY);
				setState(321);
				match(EQ);
				setState(322);
				match(STRING);
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
	public static class ParagraphContentContext extends ParserRuleContext {
		public ParagraphContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraphContent; }
	 
		public ParagraphContentContext() { }
		public void copyFrom(ParagraphContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParagraphTextLabelContext extends ParagraphContentContext {
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public ParagraphTextLabelContext(ParagraphContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitParagraphTextLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParagraphImageLabelContext extends ParagraphContentContext {
		public HtmlImageTagContext htmlImageTag() {
			return getRuleContext(HtmlImageTagContext.class,0);
		}
		public ParagraphImageLabelContext(ParagraphContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitParagraphImageLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParagraphButtonLabelContext extends ParagraphContentContext {
		public HtmlButtonTagContext htmlButtonTag() {
			return getRuleContext(HtmlButtonTagContext.class,0);
		}
		public ParagraphButtonLabelContext(ParagraphContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitParagraphButtonLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParagraphInputLabelContext extends ParagraphContentContext {
		public HtmlInputTagContext htmlInputTag() {
			return getRuleContext(HtmlInputTagContext.class,0);
		}
		public ParagraphInputLabelContext(ParagraphContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitParagraphInputLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagraphContentContext paragraphContent() throws RecognitionException {
		ParagraphContentContext _localctx = new ParagraphContentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_paragraphContent);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new ParagraphTextLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(STRING);
				}
				break;
			case IMG_TAG_OPEN:
				_localctx = new ParagraphImageLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				htmlImageTag();
				}
				break;
			case BUTTON_TAG_OPEN:
				_localctx = new ParagraphButtonLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				htmlButtonTag();
				}
				break;
			case INPUT_TAG_OPEN:
				_localctx = new ParagraphInputLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				htmlInputTag();
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
	public static class HtmlLabelTagContext extends ParserRuleContext {
		public TerminalNode LABEL_TAG_OPEN() { return getToken(FrameParser.LABEL_TAG_OPEN, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public TerminalNode LABEL_TAG_CLOSE() { return getToken(FrameParser.LABEL_TAG_CLOSE, 0); }
		public List<LabelAttributeContext> labelAttribute() {
			return getRuleContexts(LabelAttributeContext.class);
		}
		public LabelAttributeContext labelAttribute(int i) {
			return getRuleContext(LabelAttributeContext.class,i);
		}
		public LabelContentContext labelContent() {
			return getRuleContext(LabelContentContext.class,0);
		}
		public HtmlLabelTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlLabelTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtmlLabelTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlLabelTagContext htmlLabelTag() throws RecognitionException {
		HtmlLabelTagContext _localctx = new HtmlLabelTagContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_htmlLabelTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(LABEL_TAG_OPEN);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147746816L) != 0)) {
				{
				{
				setState(332);
				labelAttribute();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			match(GT);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(339);
				labelContent();
				}
			}

			setState(342);
			match(LABEL_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelAttributeContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FrameParser.FOR, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode STYLE() { return getToken(FrameParser.STYLE, 0); }
		public TerminalNode CLASS() { return getToken(FrameParser.CLASS, 0); }
		public LabelAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitLabelAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelAttributeContext labelAttribute() throws RecognitionException {
		LabelAttributeContext _localctx = new LabelAttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_labelAttribute);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(FOR);
				setState(345);
				match(EQ);
				setState(346);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(STYLE);
				setState(348);
				match(EQ);
				setState(349);
				match(STRING);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				match(CLASS);
				setState(351);
				match(EQ);
				setState(352);
				match(STRING);
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
	public static class LabelContentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public LabelContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitLabelContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContentContext labelContent() throws RecognitionException {
		LabelContentContext _localctx = new LabelContentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_labelContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDivTagContext extends ParserRuleContext {
		public TerminalNode DIV_TAG_OPEN() { return getToken(FrameParser.DIV_TAG_OPEN, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public TerminalNode DIV_TAG_CLOSE() { return getToken(FrameParser.DIV_TAG_CLOSE, 0); }
		public List<DivAttributeContext> divAttribute() {
			return getRuleContexts(DivAttributeContext.class);
		}
		public DivAttributeContext divAttribute(int i) {
			return getRuleContext(DivAttributeContext.class,i);
		}
		public List<DivContentContext> divContent() {
			return getRuleContexts(DivContentContext.class);
		}
		public DivContentContext divContent(int i) {
			return getRuleContext(DivContentContext.class,i);
		}
		public HtmlDivTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDivTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtmlDivTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDivTagContext htmlDivTag() throws RecognitionException {
		HtmlDivTagContext _localctx = new HtmlDivTagContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_htmlDivTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(DIV_TAG_OPEN);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63211008L) != 0)) {
				{
				{
				setState(358);
				divAttribute();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(GT);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15271970L) != 0) || _la==STRING) {
				{
				{
				setState(365);
				divContent();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			match(DIV_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivAttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FrameParser.ID, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode CLASS() { return getToken(FrameParser.CLASS, 0); }
		public TerminalNode STYLE() { return getToken(FrameParser.STYLE, 0); }
		public TerminalNode STAR_NG_IF() { return getToken(FrameParser.STAR_NG_IF, 0); }
		public TerminalNode STAR_NG_FOR() { return getToken(FrameParser.STAR_NG_FOR, 0); }
		public TerminalNode CLICK() { return getToken(FrameParser.CLICK, 0); }
		public TerminalNode NG_MODEL() { return getToken(FrameParser.NG_MODEL, 0); }
		public TerminalNode NG_MODEL_TWO_WAY() { return getToken(FrameParser.NG_MODEL_TWO_WAY, 0); }
		public DivAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivAttributeContext divAttribute() throws RecognitionException {
		DivAttributeContext _localctx = new DivAttributeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_divAttribute);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(ID);
				setState(374);
				match(EQ);
				setState(375);
				match(STRING);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(CLASS);
				setState(377);
				match(EQ);
				setState(378);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(STYLE);
				setState(380);
				match(EQ);
				setState(381);
				match(STRING);
				}
				break;
			case STAR_NG_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				match(STAR_NG_IF);
				setState(383);
				match(EQ);
				setState(384);
				match(STRING);
				}
				break;
			case STAR_NG_FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				match(STAR_NG_FOR);
				setState(386);
				match(EQ);
				setState(387);
				match(STRING);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				match(CLICK);
				setState(389);
				match(EQ);
				setState(390);
				match(STRING);
				}
				break;
			case NG_MODEL:
				enterOuterAlt(_localctx, 7);
				{
				setState(391);
				match(NG_MODEL);
				setState(392);
				match(EQ);
				setState(393);
				match(STRING);
				}
				break;
			case NG_MODEL_TWO_WAY:
				enterOuterAlt(_localctx, 8);
				{
				setState(394);
				match(NG_MODEL_TWO_WAY);
				setState(395);
				match(EQ);
				setState(396);
				match(STRING);
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
	public static class DivContentContext extends ParserRuleContext {
		public DivContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divContent; }
	 
		public DivContentContext() { }
		public void copyFrom(DivContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivButtonLabelContext extends DivContentContext {
		public HtmlButtonTagContext htmlButtonTag() {
			return getRuleContext(HtmlButtonTagContext.class,0);
		}
		public DivButtonLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivButtonLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivNgIfLabelContext extends DivContentContext {
		public NgIfDirectiveContext ngIfDirective() {
			return getRuleContext(NgIfDirectiveContext.class,0);
		}
		public DivNgIfLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivNgIfLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivInputLabelContext extends DivContentContext {
		public HtmlInputTagContext htmlInputTag() {
			return getRuleContext(HtmlInputTagContext.class,0);
		}
		public DivInputLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivInputLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivNestedLabelContext extends DivContentContext {
		public HtmlDivTagContext htmlDivTag() {
			return getRuleContext(HtmlDivTagContext.class,0);
		}
		public DivNestedLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivNestedLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivPlainTextLabelContext extends DivContentContext {
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public DivPlainTextLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivPlainTextLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivParagraphLabelContext extends DivContentContext {
		public HtmlParagraphTagContext htmlParagraphTag() {
			return getRuleContext(HtmlParagraphTagContext.class,0);
		}
		public DivParagraphLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivParagraphLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivImageLabelContext extends DivContentContext {
		public HtmlImageTagContext htmlImageTag() {
			return getRuleContext(HtmlImageTagContext.class,0);
		}
		public DivImageLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivImageLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivNgForLabelContext extends DivContentContext {
		public NgForDirectiveContext ngForDirective() {
			return getRuleContext(NgForDirectiveContext.class,0);
		}
		public DivNgForLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivNgForLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivRouterOutletLabelContext extends DivContentContext {
		public RouterOutletTagContext routerOutletTag() {
			return getRuleContext(RouterOutletTagContext.class,0);
		}
		public DivRouterOutletLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivRouterOutletLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContentContext divContent() throws RecognitionException {
		DivContentContext _localctx = new DivContentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_divContent);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMG_TAG_OPEN:
				_localctx = new DivImageLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				htmlImageTag();
				}
				break;
			case BUTTON_TAG_OPEN:
				_localctx = new DivButtonLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				htmlButtonTag();
				}
				break;
			case INPUT_TAG_OPEN:
				_localctx = new DivInputLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				htmlInputTag();
				}
				break;
			case P_TAG_OPEN:
				_localctx = new DivParagraphLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				htmlParagraphTag();
				}
				break;
			case DIV_TAG_OPEN:
				_localctx = new DivNestedLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
				htmlDivTag();
				}
				break;
			case ROUTER_OUTLET_TAG:
				_localctx = new DivRouterOutletLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				routerOutletTag();
				}
				break;
			case STAR_NG_IF:
				_localctx = new DivNgIfLabelContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(405);
				ngIfDirective();
				}
				break;
			case STAR_NG_FOR:
				_localctx = new DivNgForLabelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(406);
				ngForDirective();
				}
				break;
			case STRING:
				_localctx = new DivPlainTextLabelContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(407);
				match(STRING);
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
	public static class HtmlFormTagContext extends ParserRuleContext {
		public TerminalNode FORM_TAG_OPEN() { return getToken(FrameParser.FORM_TAG_OPEN, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public TerminalNode FORM_TAG_CLOSE() { return getToken(FrameParser.FORM_TAG_CLOSE, 0); }
		public List<FormAttributeContext> formAttribute() {
			return getRuleContexts(FormAttributeContext.class);
		}
		public FormAttributeContext formAttribute(int i) {
			return getRuleContext(FormAttributeContext.class,i);
		}
		public List<FormContentContext> formContent() {
			return getRuleContexts(FormContentContext.class);
		}
		public FormContentContext formContent(int i) {
			return getRuleContext(FormContentContext.class,i);
		}
		public HtmlFormTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlFormTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtmlFormTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlFormTagContext htmlFormTag() throws RecognitionException {
		HtmlFormTagContext _localctx = new HtmlFormTagContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_htmlFormTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(FORM_TAG_OPEN);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268731392L) != 0)) {
				{
				{
				setState(411);
				formAttribute();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(GT);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536938528L) != 0) || _la==STRING) {
				{
				{
				setState(418);
				formContent();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(FORM_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormAttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FrameParser.ID, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode CLASS() { return getToken(FrameParser.CLASS, 0); }
		public TerminalNode STYLE() { return getToken(FrameParser.STYLE, 0); }
		public TerminalNode NG_SUBMIT() { return getToken(FrameParser.NG_SUBMIT, 0); }
		public FormAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFormAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormAttributeContext formAttribute() throws RecognitionException {
		FormAttributeContext _localctx = new FormAttributeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formAttribute);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(ID);
				setState(427);
				match(EQ);
				setState(428);
				match(STRING);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(CLASS);
				setState(430);
				match(EQ);
				setState(431);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(STYLE);
				setState(433);
				match(EQ);
				setState(434);
				match(STRING);
				}
				break;
			case NG_SUBMIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(NG_SUBMIT);
				setState(436);
				match(EQ);
				setState(437);
				match(STRING);
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
	public static class FormContentContext extends ParserRuleContext {
		public FormContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formContent; }
	 
		public FormContentContext() { }
		public void copyFrom(FormContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormButtonLabelContext extends FormContentContext {
		public HtmlButtonTagContext htmlButtonTag() {
			return getRuleContext(HtmlButtonTagContext.class,0);
		}
		public FormButtonLabelContext(FormContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFormButtonLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormInputLabelContext extends FormContentContext {
		public HtmlInputTagContext htmlInputTag() {
			return getRuleContext(HtmlInputTagContext.class,0);
		}
		public FormInputLabelContext(FormContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFormInputLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormLabelContext extends FormContentContext {
		public HtmlLabelTagContext htmlLabelTag() {
			return getRuleContext(HtmlLabelTagContext.class,0);
		}
		public FormLabelContext(FormContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFormLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormDivLabelContext extends FormContentContext {
		public HtmlDivTagContext htmlDivTag() {
			return getRuleContext(HtmlDivTagContext.class,0);
		}
		public FormDivLabelContext(FormContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFormDivLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormTextLabelContext extends FormContentContext {
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public FormTextLabelContext(FormContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFormTextLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContentContext formContent() throws RecognitionException {
		FormContentContext _localctx = new FormContentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formContent);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT_TAG_OPEN:
				_localctx = new FormInputLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				htmlInputTag();
				}
				break;
			case BUTTON_TAG_OPEN:
				_localctx = new FormButtonLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				htmlButtonTag();
				}
				break;
			case LABEL_TAG_OPEN:
				_localctx = new FormLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				htmlLabelTag();
				}
				break;
			case DIV_TAG_OPEN:
				_localctx = new FormDivLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(443);
				htmlDivTag();
				}
				break;
			case STRING:
				_localctx = new FormTextLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(444);
				match(STRING);
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
	public static class RouterOutletTagContext extends ParserRuleContext {
		public TerminalNode ROUTER_OUTLET_TAG() { return getToken(FrameParser.ROUTER_OUTLET_TAG, 0); }
		public RouterOutletTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerOutletTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitRouterOutletTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterOutletTagContext routerOutletTag() throws RecognitionException {
		RouterOutletTagContext _localctx = new RouterOutletTagContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_routerOutletTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(ROUTER_OUTLET_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgIfDirectiveContext extends ParserRuleContext {
		public TerminalNode STAR_NG_IF() { return getToken(FrameParser.STAR_NG_IF, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public NgIfDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngIfDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitNgIfDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgIfDirectiveContext ngIfDirective() throws RecognitionException {
		NgIfDirectiveContext _localctx = new NgIfDirectiveContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ngIfDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(STAR_NG_IF);
			setState(450);
			match(EQ);
			setState(451);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgForDirectiveContext extends ParserRuleContext {
		public TerminalNode STAR_NG_FOR() { return getToken(FrameParser.STAR_NG_FOR, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public NgForDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngForDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitNgForDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgForDirectiveContext ngForDirective() throws RecognitionException {
		NgForDirectiveContext _localctx = new NgForDirectiveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ngForDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(STAR_NG_FOR);
			setState(454);
			match(EQ);
			setState(455);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode AT_COMPONENT() { return getToken(FrameParser.AT_COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode EXPORT() { return getToken(FrameParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(FrameParser.CLASS, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(AT_COMPONENT);
			setState(458);
			match(LPAREN);
			setState(459);
			componentBody();
			setState(460);
			match(RPAREN);
			setState(461);
			match(EXPORT);
			setState(462);
			match(CLASS);
			setState(463);
			match(IDENTITY);
			setState(464);
			classBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FrameParser.LBRACE, 0); }
		public List<ComponentPropertyContext> componentProperty() {
			return getRuleContexts(ComponentPropertyContext.class);
		}
		public ComponentPropertyContext componentProperty(int i) {
			return getRuleContext(ComponentPropertyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(FrameParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitComponentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(LBRACE);
			setState(467);
			componentProperty();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(468);
				match(COMMA);
				setState(469);
				componentProperty();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
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
	public static class ComponentPropertyContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(FrameParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode TEMPLATE() { return getToken(FrameParser.TEMPLATE, 0); }
		public TerminalNode STYLEURLS() { return getToken(FrameParser.STYLEURLS, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_componentProperty);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(SELECTOR);
				setState(478);
				match(COLON);
				setState(479);
				match(STRING);
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(TEMPLATE);
				setState(481);
				match(COLON);
				setState(482);
				match(STRING);
				}
				break;
			case STYLEURLS:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(STYLEURLS);
				setState(484);
				match(COLON);
				setState(485);
				arrayLiteral();
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(FrameParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(FrameParser.RBRACK, 0); }
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
		enterRule(_localctx, 56, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(LBRACK);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 3940649674214273L) != 0)) {
				{
				setState(489);
				expression(0);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(490);
					match(COMMA);
					setState(491);
					expression(0);
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(499);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FrameParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FrameParser.RBRACE, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitClassBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_classBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(LBRACE);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 4294975345L) != 0)) {
				{
				{
				setState(502);
				classMember();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
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
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	 
		public ClassMemberContext() { }
		public void copyFrom(ClassMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassVariableLabelContext extends ClassMemberContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FrameParser.SEMI, 0); }
		public ClassVariableLabelContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitClassVariableLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassConstructorLabelContext extends ClassMemberContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassConstructorLabelContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitClassConstructorLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassMethodLabelContext extends ClassMemberContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMethodLabelContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitClassMethodLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classMember);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case CONST:
			case VAR:
				_localctx = new ClassVariableLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				variableDeclaration();
				setState(511);
				match(SEMI);
				}
				break;
			case CONSTRUCTOR:
				_localctx = new ClassConstructorLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				constructorDeclaration();
				}
				break;
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case STATIC:
			case ASYNC:
			case IDENTITY:
				_localctx = new ClassMethodLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				methodDeclaration();
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LET() { return getToken(FrameParser.LET, 0); }
		public TerminalNode CONST() { return getToken(FrameParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(FrameParser.VAR, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(518);
			match(IDENTITY);
			setState(519);
			match(COLON);
			setState(520);
			type();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(521);
				match(EQ);
				setState(522);
				expression(0);
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
		public TerminalNode PRIMITIVE_TYPE() { return getToken(FrameParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode LBRACK() { return getToken(FrameParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(FrameParser.RBRACK, 0); }
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
		enterRule(_localctx, 64, RULE_type);
		int _la;
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(PRIMITIVE_TYPE);
				}
				break;
			case IDENTITY:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(IDENTITY);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(527);
					match(LBRACK);
					setState(528);
					match(RBRACK);
					}
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionLabelContext extends ExpressionContext {
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitUnaryExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionLabelContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitLiteralExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionLabelContext extends ExpressionContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public IdentifierExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitIdentifierExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionLabelContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public ParenExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitParenExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionLabelContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public BinaryExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitBinaryExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectExpressionLabelContext extends ExpressionContext {
		public StoreSelectExpressionContext storeSelectExpression() {
			return getRuleContext(StoreSelectExpressionContext.class,0);
		}
		public SelectExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitSelectExpressionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralExpressionLabelContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitObjectLiteralExpressionLabel(this);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				{
				_localctx = new UnaryExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(534);
				unaryOp();
				setState(535);
				expression(7);
				}
				break;
			case BOOLEAN:
			case STRING:
			case NUMBER:
				{
				_localctx = new LiteralExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(537);
				literal();
				}
				break;
			case IDENTITY:
				{
				_localctx = new IdentifierExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(538);
				match(IDENTITY);
				}
				break;
			case LBRACE:
				{
				_localctx = new ObjectLiteralExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(539);
				objectLiteral();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(540);
				match(LPAREN);
				setState(541);
				expression(0);
				setState(542);
				match(RPAREN);
				}
				break;
			case THIS:
				{
				_localctx = new SelectExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(544);
				storeSelectExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(553);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionLabelContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(547);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(548);
						binaryOp();
						setState(549);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(551);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(552);
						arrayAccess();
						}
						break;
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
	public static class BinaryOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FrameParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FrameParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(FrameParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(FrameParser.DIV, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public TerminalNode LT() { return getToken(FrameParser.LT, 0); }
		public TerminalNode AND() { return getToken(FrameParser.AND, 0); }
		public TerminalNode OR() { return getToken(FrameParser.OR, 0); }
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_binaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70093866270720L) != 0)) ) {
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
	public static class UnaryOpContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(FrameParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(FrameParser.NOT, 0); }
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==NOT) ) {
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FrameParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(FrameParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 72, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 13194139533313L) != 0)) ) {
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
	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(FrameParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(FrameParser.RBRACK, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(LBRACK);
			setState(565);
			expression(0);
			setState(566);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
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
		enterRule(_localctx, 76, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(LBRACE);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTITY) {
				{
				setState(569);
				objectProperty();
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(570);
					match(COMMA);
					setState(571);
					objectProperty();
					}
					}
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(579);
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
	public static class ObjectPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_objectProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(IDENTITY);
			setState(582);
			match(COLON);
			setState(583);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(FrameParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(CONSTRUCTOR);
			setState(586);
			match(LPAREN);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16777223L) != 0)) {
				{
				setState(587);
				parameterList();
				}
			}

			setState(590);
			match(RPAREN);
			setState(591);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			parameter();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(594);
				match(COMMA);
				setState(595);
				parameter();
				}
				}
				setState(600);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(FrameParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(FrameParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(FrameParser.PROTECTED, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				setState(601);
				_la = _input.LA(1);
				if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(604);
			match(IDENTITY);
			setState(605);
			match(COLON);
			setState(606);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode LBRACE() { return getToken(FrameParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FrameParser.RBRACE, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(LBRACE);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 2147483769L) != 0)) {
				{
				{
				setState(609);
				statement();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStmtLabelContext extends StatementContext {
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public FunctionCallStmtLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFunctionCallStmtLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtLabelContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStmtLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitReturnStmtLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStmtLabelContext extends StatementContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public AssignmentStmtLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAssignmentStmtLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DispatchStmtLabelContext extends StatementContext {
		public StoreDispatchStatementContext storeDispatchStatement() {
			return getRuleContext(StoreDispatchStatementContext.class,0);
		}
		public DispatchStmtLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDispatchStmtLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationStmtLabelContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FrameParser.SEMI, 0); }
		public VarDeclarationStmtLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitVarDeclarationStmtLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statement);
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new AssignmentStmtLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				assignmentStatement();
				}
				break;
			case 2:
				_localctx = new FunctionCallStmtLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				functionCallStatement();
				}
				break;
			case 3:
				_localctx = new VarDeclarationStmtLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				variableDeclaration();
				setState(620);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new ReturnStmtLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				returnStatement();
				}
				break;
			case 5:
				_localctx = new DispatchStmtLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(623);
				storeDispatchStatement();
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FrameParser.SEMI, 0); }
		public TerminalNode THIS() { return getToken(FrameParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(FrameParser.DOT, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(626);
				match(THIS);
				setState(627);
				match(DOT);
				}
			}

			setState(630);
			match(IDENTITY);
			setState(631);
			match(EQ);
			setState(632);
			expression(0);
			setState(633);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatementContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(FrameParser.SEMI, 0); }
		public TerminalNode THIS() { return getToken(FrameParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(FrameParser.DOT, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(635);
				match(THIS);
				setState(636);
				match(DOT);
				}
			}

			setState(639);
			match(IDENTITY);
			setState(640);
			match(LPAREN);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 3940649674214273L) != 0)) {
				{
				setState(641);
				argumentList();
				}
			}

			setState(644);
			match(RPAREN);
			setState(645);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			expression(0);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(648);
				match(COMMA);
				setState(649);
				expression(0);
				}
				}
				setState(654);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public TerminalNode ASYNC() { return getToken(FrameParser.ASYNC, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 15L) != 0)) {
				{
				{
				setState(655);
				methodModifier();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(661);
				match(ASYNC);
				}
			}

			setState(664);
			match(IDENTITY);
			setState(665);
			match(LPAREN);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16777223L) != 0)) {
				{
				setState(666);
				parameterList();
				}
			}

			setState(669);
			match(RPAREN);
			setState(670);
			match(COLON);
			setState(671);
			type();
			setState(672);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(FrameParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(FrameParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(FrameParser.PROTECTED, 0); }
		public TerminalNode STATIC() { return getToken(FrameParser.STATIC, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 15L) != 0)) ) {
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
		public TerminalNode RETURN() { return getToken(FrameParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(FrameParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(RETURN);
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 3940649674214273L) != 0)) {
				{
				setState(677);
				expression(0);
				}
			}

			setState(680);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServiceDeclarationContext extends ParserRuleContext {
		public TerminalNode AT_INJECTABLE() { return getToken(FrameParser.AT_INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public InjectableBodyContext injectableBody() {
			return getRuleContext(InjectableBodyContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode EXPORT() { return getToken(FrameParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(FrameParser.CLASS, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public ServiceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitServiceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceDeclarationContext serviceDeclaration() throws RecognitionException {
		ServiceDeclarationContext _localctx = new ServiceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_serviceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(AT_INJECTABLE);
			setState(683);
			match(LPAREN);
			setState(684);
			injectableBody();
			setState(685);
			match(RPAREN);
			setState(686);
			match(EXPORT);
			setState(687);
			match(CLASS);
			setState(688);
			match(IDENTITY);
			setState(689);
			classBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FrameParser.LBRACE, 0); }
		public List<InjectablePropertyContext> injectableProperty() {
			return getRuleContexts(InjectablePropertyContext.class);
		}
		public InjectablePropertyContext injectableProperty(int i) {
			return getRuleContext(InjectablePropertyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(FrameParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public InjectableBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInjectableBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableBodyContext injectableBody() throws RecognitionException {
		InjectableBodyContext _localctx = new InjectableBodyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_injectableBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(LBRACE);
			setState(692);
			injectableProperty();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(693);
				match(COMMA);
				setState(694);
				injectableProperty();
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
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
	public static class InjectablePropertyContext extends ParserRuleContext {
		public TerminalNode PROVIDEDIN() { return getToken(FrameParser.PROVIDEDIN, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode USECLASS() { return getToken(FrameParser.USECLASS, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode USEVALUE() { return getToken(FrameParser.USEVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InjectablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInjectableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectablePropertyContext injectableProperty() throws RecognitionException {
		InjectablePropertyContext _localctx = new InjectablePropertyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_injectableProperty);
		try {
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROVIDEDIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				match(PROVIDEDIN);
				setState(703);
				match(COLON);
				setState(704);
				match(STRING);
				}
				break;
			case USECLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(USECLASS);
				setState(706);
				match(COLON);
				setState(707);
				match(IDENTITY);
				}
				break;
			case USEVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				match(USEVALUE);
				setState(709);
				match(COLON);
				setState(710);
				expression(0);
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(FrameParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(FrameParser.CLASS, 0); }
		public List<TerminalNode> IDENTITY() { return getTokens(FrameParser.IDENTITY); }
		public TerminalNode IDENTITY(int i) {
			return getToken(FrameParser.IDENTITY, i);
		}
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(FrameParser.EXTENDS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(EXPORT);
			setState(714);
			match(CLASS);
			setState(715);
			match(IDENTITY);
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(716);
				match(EXTENDS);
				setState(717);
				match(IDENTITY);
				}
			}

			setState(720);
			classBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode FUNCTION() { return getToken(FrameParser.FUNCTION, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(FrameParser.ASYNC, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(722);
				match(ASYNC);
				}
			}

			setState(725);
			match(FUNCTION);
			setState(726);
			match(IDENTITY);
			setState(727);
			match(LPAREN);
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16777223L) != 0)) {
				{
				setState(728);
				parameterList();
				}
			}

			setState(731);
			match(RPAREN);
			setState(732);
			match(COLON);
			setState(733);
			type();
			setState(734);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(FrameParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(LPAREN);
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 16777223L) != 0)) {
				{
				setState(737);
				parameterList();
				}
			}

			setState(740);
			match(RPAREN);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(741);
				match(COLON);
				setState(742);
				type();
				}
			}

			setState(745);
			match(ARROW);
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(746);
				block();
				}
				break;
			case 2:
				{
				setState(747);
				expression(0);
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
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(FrameParser.EXPORT, 0); }
		public TerminalNode INTERFACE() { return getToken(FrameParser.INTERFACE, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(EXPORT);
			setState(751);
			match(INTERFACE);
			setState(752);
			match(IDENTITY);
			setState(753);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FrameParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FrameParser.RBRACE, 0); }
		public List<InterfacePropertyContext> interfaceProperty() {
			return getRuleContexts(InterfacePropertyContext.class);
		}
		public InterfacePropertyContext interfaceProperty(int i) {
			return getRuleContext(InterfacePropertyContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(LBRACE);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTITY) {
				{
				{
				setState(756);
				interfaceProperty();
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762);
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
	public static class InterfacePropertyContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(FrameParser.SEMI, 0); }
		public InterfacePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitInterfaceProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePropertyContext interfaceProperty() throws RecognitionException {
		InterfacePropertyContext _localctx = new InterfacePropertyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_interfaceProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(IDENTITY);
			setState(765);
			match(COLON);
			setState(766);
			type();
			setState(767);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(FrameParser.EXPORT, 0); }
		public TerminalNode ENUM() { return getToken(FrameParser.ENUM, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_enumDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(EXPORT);
			setState(770);
			match(ENUM);
			setState(771);
			match(IDENTITY);
			setState(772);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FrameParser.LBRACE, 0); }
		public List<EnumMemberContext> enumMember() {
			return getRuleContexts(EnumMemberContext.class);
		}
		public EnumMemberContext enumMember(int i) {
			return getRuleContext(EnumMemberContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(FrameParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_enumBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(LBRACE);
			setState(775);
			enumMember();
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(776);
					match(COMMA);
					setState(777);
					enumMember();
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(783);
				match(COMMA);
				}
			}

			setState(786);
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
	public static class EnumMemberContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumMember; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitEnumMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumMemberContext enumMember() throws RecognitionException {
		EnumMemberContext _localctx = new EnumMemberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(IDENTITY);
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(789);
				match(EQ);
				setState(790);
				expression(0);
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
	public static class RoutingDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(FrameParser.CONST, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TerminalNode ROUTES() { return getToken(FrameParser.ROUTES, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode LBRACK() { return getToken(FrameParser.LBRACK, 0); }
		public List<RouteConfigContext> routeConfig() {
			return getRuleContexts(RouteConfigContext.class);
		}
		public RouteConfigContext routeConfig(int i) {
			return getRuleContext(RouteConfigContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(FrameParser.RBRACK, 0); }
		public TerminalNode SEMI() { return getToken(FrameParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public RoutingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routingDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitRoutingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutingDeclarationContext routingDeclaration() throws RecognitionException {
		RoutingDeclarationContext _localctx = new RoutingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_routingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(CONST);
			setState(794);
			match(IDENTITY);
			setState(795);
			match(COLON);
			setState(796);
			match(ROUTES);
			setState(797);
			match(EQ);
			setState(798);
			match(LBRACK);
			setState(799);
			routeConfig();
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(800);
				match(COMMA);
				setState(801);
				routeConfig();
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(807);
			match(RBRACK);
			setState(808);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RouteConfigContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FrameParser.LBRACE, 0); }
		public PathPropertyContext pathProperty() {
			return getRuleContext(PathPropertyContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FrameParser.COMMA, 0); }
		public RouteComponentPropertyContext routeComponentProperty() {
			return getRuleContext(RouteComponentPropertyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FrameParser.RBRACE, 0); }
		public RouteConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeConfig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitRouteConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteConfigContext routeConfig() throws RecognitionException {
		RouteConfigContext _localctx = new RouteConfigContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_routeConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(LBRACE);
			setState(811);
			pathProperty();
			setState(812);
			match(COMMA);
			setState(813);
			routeComponentProperty();
			setState(814);
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
	public static class PathPropertyContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(FrameParser.PATH, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public PathPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitPathProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathPropertyContext pathProperty() throws RecognitionException {
		PathPropertyContext _localctx = new PathPropertyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_pathProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(PATH);
			setState(817);
			match(COLON);
			setState(818);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RouteComponentPropertyContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(FrameParser.COMPONENT, 0); }
		public TerminalNode COLON() { return getToken(FrameParser.COLON, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public RouteComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeComponentProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitRouteComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteComponentPropertyContext routeComponentProperty() throws RecognitionException {
		RouteComponentPropertyContext _localctx = new RouteComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_routeComponentProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(COMPONENT);
			setState(821);
			match(COLON);
			setState(822);
			match(IDENTITY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgrxActionDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(FrameParser.EXPORT, 0); }
		public TerminalNode CONST() { return getToken(FrameParser.CONST, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode CREATEACTION() { return getToken(FrameParser.CREATEACTION, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ActionTypeContext actionType() {
			return getRuleContext(ActionTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(FrameParser.SEMI, 0); }
		public NgrxActionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngrxActionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitNgrxActionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgrxActionDeclarationContext ngrxActionDeclaration() throws RecognitionException {
		NgrxActionDeclarationContext _localctx = new NgrxActionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_ngrxActionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(EXPORT);
			setState(825);
			match(CONST);
			setState(826);
			match(IDENTITY);
			setState(827);
			match(EQ);
			setState(828);
			match(CREATEACTION);
			setState(829);
			match(LPAREN);
			setState(830);
			actionType();
			setState(831);
			match(RPAREN);
			setState(832);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public ActionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitActionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_actionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StoreDispatchStatementContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(FrameParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(FrameParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FrameParser.DOT, i);
		}
		public TerminalNode STORE() { return getToken(FrameParser.STORE, 0); }
		public TerminalNode DISPATCH() { return getToken(FrameParser.DISPATCH, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ActionCallContext actionCall() {
			return getRuleContext(ActionCallContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(FrameParser.SEMI, 0); }
		public StoreDispatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeDispatchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitStoreDispatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreDispatchStatementContext storeDispatchStatement() throws RecognitionException {
		StoreDispatchStatementContext _localctx = new StoreDispatchStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_storeDispatchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(THIS);
			setState(837);
			match(DOT);
			setState(838);
			match(STORE);
			setState(839);
			match(DOT);
			setState(840);
			match(DISPATCH);
			setState(841);
			match(LPAREN);
			setState(842);
			actionCall();
			setState(843);
			match(RPAREN);
			setState(844);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionCallContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public ActionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitActionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionCallContext actionCall() throws RecognitionException {
		ActionCallContext _localctx = new ActionCallContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_actionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(IDENTITY);
			setState(847);
			match(LPAREN);
			setState(848);
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
	public static class StoreSelectExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(FrameParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(FrameParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FrameParser.DOT, i);
		}
		public TerminalNode STORE() { return getToken(FrameParser.STORE, 0); }
		public TerminalNode SELECT() { return getToken(FrameParser.SELECT, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public SelectorCallContext selectorCall() {
			return getRuleContext(SelectorCallContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public StoreSelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeSelectExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitStoreSelectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreSelectExpressionContext storeSelectExpression() throws RecognitionException {
		StoreSelectExpressionContext _localctx = new StoreSelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_storeSelectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(THIS);
			setState(851);
			match(DOT);
			setState(852);
			match(STORE);
			setState(853);
			match(DOT);
			setState(854);
			match(SELECT);
			setState(855);
			match(LPAREN);
			setState(856);
			selectorCall();
			setState(857);
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
	public static class SelectorCallContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public SelectorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitSelectorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorCallContext selectorCall() throws RecognitionException {
		SelectorCallContext _localctx = new SelectorCallContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_selectorCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(IDENTITY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgrxReducerDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(FrameParser.EXPORT, 0); }
		public TerminalNode CONST() { return getToken(FrameParser.CONST, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode CREATEREDUCER() { return getToken(FrameParser.CREATEREDUCER, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public ReducerConfigContext reducerConfig() {
			return getRuleContext(ReducerConfigContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(FrameParser.SEMI, 0); }
		public NgrxReducerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngrxReducerDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitNgrxReducerDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgrxReducerDeclarationContext ngrxReducerDeclaration() throws RecognitionException {
		NgrxReducerDeclarationContext _localctx = new NgrxReducerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ngrxReducerDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(EXPORT);
			setState(862);
			match(CONST);
			setState(863);
			match(IDENTITY);
			setState(864);
			match(EQ);
			setState(865);
			match(CREATEREDUCER);
			setState(866);
			match(LPAREN);
			setState(867);
			reducerConfig();
			setState(868);
			match(RPAREN);
			setState(869);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReducerConfigContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode COMMA() { return getToken(FrameParser.COMMA, 0); }
		public List<OnReducerBlockContext> onReducerBlock() {
			return getRuleContexts(OnReducerBlockContext.class);
		}
		public OnReducerBlockContext onReducerBlock(int i) {
			return getRuleContext(OnReducerBlockContext.class,i);
		}
		public ReducerConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reducerConfig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitReducerConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReducerConfigContext reducerConfig() throws RecognitionException {
		ReducerConfigContext _localctx = new ReducerConfigContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_reducerConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(IDENTITY);
			setState(872);
			match(COMMA);
			setState(874); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(873);
				onReducerBlock();
				}
				}
				setState(876); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnReducerBlockContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(FrameParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FrameParser.COMMA, i);
		}
		public TerminalNode ON() { return getToken(FrameParser.ON, 0); }
		public TerminalNode LPAREN() { return getToken(FrameParser.LPAREN, 0); }
		public TerminalNode IDENTITY() { return getToken(FrameParser.IDENTITY, 0); }
		public TerminalNode ARROW() { return getToken(FrameParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FrameParser.RPAREN, 0); }
		public OnReducerBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onReducerBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitOnReducerBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnReducerBlockContext onReducerBlock() throws RecognitionException {
		OnReducerBlockContext _localctx = new OnReducerBlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_onReducerBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(COMMA);
			setState(879);
			match(ON);
			setState(880);
			match(LPAREN);
			setState(881);
			match(IDENTITY);
			setState(882);
			match(COMMA);
			setState(883);
			match(ARROW);
			setState(884);
			block();
			setState(885);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001[\u0378\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0001\u0000\u0005\u0000\u009a\b\u0000\n\u0000\f\u0000\u009d\t"+
		"\u0000\u0001\u0000\u0005\u0000\u00a0\b\u0000\n\u0000\f\u0000\u00a3\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00af\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00bc\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003\u00c0\b\u0003\n\u0003"+
		"\f\u0003\u00c3\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00d0\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00d4\b\u0005\n\u0005\f\u0005\u00d7\t\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00db\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f8"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b\u00fe\b\b\n\b"+
		"\f\b\u0101\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u011d\b\t\u0001\n\u0001\n\u0005\n\u0121\b\n\n\n\f\n"+
		"\u0124\t\n\u0001\n\u0001\n\u0003\n\u0128\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0144\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u014a\b\f\u0001"+
		"\r\u0001\r\u0005\r\u014e\b\r\n\r\f\r\u0151\t\r\u0001\r\u0001\r\u0003\r"+
		"\u0155\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0162\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0168\b\u0010\n\u0010\f\u0010\u016b\t\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u016f\b\u0010\n\u0010\f\u0010\u0172\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u018e\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0199\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u019d\b\u0013\n\u0013"+
		"\f\u0013\u01a0\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01a4\b\u0013"+
		"\n\u0013\f\u0013\u01a7\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01b7"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01be\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u01d7\b\u001a\n\u001a\f\u001a\u01da\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01e7\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01ed\b\u001c"+
		"\n\u001c\f\u001c\u01f0\t\u001c\u0003\u001c\u01f2\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u01f8\b\u001d\n\u001d\f\u001d"+
		"\u01fb\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0204\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u020c\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u0212\b \u0003 \u0214\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u0222\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u022a"+
		"\b!\n!\f!\u022d\t!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%"+
		"\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005&\u023d\b&\n&\f"+
		"&\u0240\t&\u0003&\u0242\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0003(\u024d\b(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0005)\u0255\b)\n)\f)\u0258\t)\u0001*\u0003*\u025b\b*\u0001*"+
		"\u0001*\u0001*\u0001*\u0001+\u0001+\u0005+\u0263\b+\n+\f+\u0266\t+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0271"+
		"\b,\u0001-\u0001-\u0003-\u0275\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0003.\u027e\b.\u0001.\u0001.\u0001.\u0003.\u0283\b.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0005/\u028b\b/\n/\f/\u028e\t/\u00010\u0005"+
		"0\u0291\b0\n0\f0\u0294\t0\u00010\u00030\u0297\b0\u00010\u00010\u00010"+
		"\u00030\u029c\b0\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u0001"+
		"2\u00012\u00032\u02a7\b2\u00012\u00012\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u00054\u02b8"+
		"\b4\n4\f4\u02bb\t4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u02c8\b5\u00016\u00016\u00016\u00016\u0001"+
		"6\u00036\u02cf\b6\u00016\u00016\u00017\u00037\u02d4\b7\u00017\u00017\u0001"+
		"7\u00017\u00037\u02da\b7\u00017\u00017\u00017\u00017\u00017\u00018\u0001"+
		"8\u00038\u02e3\b8\u00018\u00018\u00018\u00038\u02e8\b8\u00018\u00018\u0001"+
		"8\u00038\u02ed\b8\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0005"+
		":\u02f6\b:\n:\f:\u02f9\t:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0005"+
		"=\u030b\b=\n=\f=\u030e\t=\u0001=\u0003=\u0311\b=\u0001=\u0001=\u0001>"+
		"\u0001>\u0001>\u0003>\u0318\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0005?\u0323\b?\n?\f?\u0326\t?\u0001?\u0001?\u0001"+
		"?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001"+
		"A\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001J\u0001J\u0001J\u0004J\u036b\bJ\u000bJ\fJ\u036c\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0000\u0001"+
		"BL\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0000\u0006"+
		"\u0001\u0000<>\u0001\u0000&-\u0002\u0000\'\'..\u0002\u0000//YZ\u0001\u0000"+
		"@B\u0001\u0000@C\u03b0\u0000\u009b\u0001\u0000\u0000\u0000\u0002\u00ae"+
		"\u0001\u0000\u0000\u0000\u0004\u00bb\u0001\u0000\u0000\u0000\u0006\u00bd"+
		"\u0001\u0000\u0000\u0000\b\u00cf\u0001\u0000\u0000\u0000\n\u00d1\u0001"+
		"\u0000\u0000\u0000\f\u00f7\u0001\u0000\u0000\u0000\u000e\u00f9\u0001\u0000"+
		"\u0000\u0000\u0010\u00fb\u0001\u0000\u0000\u0000\u0012\u011c\u0001\u0000"+
		"\u0000\u0000\u0014\u011e\u0001\u0000\u0000\u0000\u0016\u0143\u0001\u0000"+
		"\u0000\u0000\u0018\u0149\u0001\u0000\u0000\u0000\u001a\u014b\u0001\u0000"+
		"\u0000\u0000\u001c\u0161\u0001\u0000\u0000\u0000\u001e\u0163\u0001\u0000"+
		"\u0000\u0000 \u0165\u0001\u0000\u0000\u0000\"\u018d\u0001\u0000\u0000"+
		"\u0000$\u0198\u0001\u0000\u0000\u0000&\u019a\u0001\u0000\u0000\u0000("+
		"\u01b6\u0001\u0000\u0000\u0000*\u01bd\u0001\u0000\u0000\u0000,\u01bf\u0001"+
		"\u0000\u0000\u0000.\u01c1\u0001\u0000\u0000\u00000\u01c5\u0001\u0000\u0000"+
		"\u00002\u01c9\u0001\u0000\u0000\u00004\u01d2\u0001\u0000\u0000\u00006"+
		"\u01e6\u0001\u0000\u0000\u00008\u01e8\u0001\u0000\u0000\u0000:\u01f5\u0001"+
		"\u0000\u0000\u0000<\u0203\u0001\u0000\u0000\u0000>\u0205\u0001\u0000\u0000"+
		"\u0000@\u0213\u0001\u0000\u0000\u0000B\u0221\u0001\u0000\u0000\u0000D"+
		"\u022e\u0001\u0000\u0000\u0000F\u0230\u0001\u0000\u0000\u0000H\u0232\u0001"+
		"\u0000\u0000\u0000J\u0234\u0001\u0000\u0000\u0000L\u0238\u0001\u0000\u0000"+
		"\u0000N\u0245\u0001\u0000\u0000\u0000P\u0249\u0001\u0000\u0000\u0000R"+
		"\u0251\u0001\u0000\u0000\u0000T\u025a\u0001\u0000\u0000\u0000V\u0260\u0001"+
		"\u0000\u0000\u0000X\u0270\u0001\u0000\u0000\u0000Z\u0274\u0001\u0000\u0000"+
		"\u0000\\\u027d\u0001\u0000\u0000\u0000^\u0287\u0001\u0000\u0000\u0000"+
		"`\u0292\u0001\u0000\u0000\u0000b\u02a2\u0001\u0000\u0000\u0000d\u02a4"+
		"\u0001\u0000\u0000\u0000f\u02aa\u0001\u0000\u0000\u0000h\u02b3\u0001\u0000"+
		"\u0000\u0000j\u02c7\u0001\u0000\u0000\u0000l\u02c9\u0001\u0000\u0000\u0000"+
		"n\u02d3\u0001\u0000\u0000\u0000p\u02e0\u0001\u0000\u0000\u0000r\u02ee"+
		"\u0001\u0000\u0000\u0000t\u02f3\u0001\u0000\u0000\u0000v\u02fc\u0001\u0000"+
		"\u0000\u0000x\u0301\u0001\u0000\u0000\u0000z\u0306\u0001\u0000\u0000\u0000"+
		"|\u0314\u0001\u0000\u0000\u0000~\u0319\u0001\u0000\u0000\u0000\u0080\u032a"+
		"\u0001\u0000\u0000\u0000\u0082\u0330\u0001\u0000\u0000\u0000\u0084\u0334"+
		"\u0001\u0000\u0000\u0000\u0086\u0338\u0001\u0000\u0000\u0000\u0088\u0342"+
		"\u0001\u0000\u0000\u0000\u008a\u0344\u0001\u0000\u0000\u0000\u008c\u034e"+
		"\u0001\u0000\u0000\u0000\u008e\u0352\u0001\u0000\u0000\u0000\u0090\u035b"+
		"\u0001\u0000\u0000\u0000\u0092\u035d\u0001\u0000\u0000\u0000\u0094\u0367"+
		"\u0001\u0000\u0000\u0000\u0096\u036e\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0003\u0002\u0001\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u00a1\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u0004\u0002\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0000\u0000\u0001\u00a5\u0001\u0001\u0000\u0000\u0000\u00a6\u00af"+
		"\u0003 \u0010\u0000\u00a7\u00af\u0003&\u0013\u0000\u00a8\u00af\u0003\u0014"+
		"\n\u0000\u00a9\u00af\u0003\n\u0005\u0000\u00aa\u00af\u0003\u0010\b\u0000"+
		"\u00ab\u00af\u0003\u0006\u0003\u0000\u00ac\u00af\u0003\u001a\r\u0000\u00ad"+
		"\u00af\u0003,\u0016\u0000\u00ae\u00a6\u0001\u0000\u0000\u0000\u00ae\u00a7"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00ae\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u0003\u0001\u0000\u0000\u0000\u00b0\u00bc"+
		"\u00032\u0019\u0000\u00b1\u00bc\u0003f3\u0000\u00b2\u00bc\u0003l6\u0000"+
		"\u00b3\u00bc\u0003n7\u0000\u00b4\u00bc\u0003p8\u0000\u00b5\u00bc\u0003"+
		">\u001f\u0000\u00b6\u00bc\u0003r9\u0000\u00b7\u00bc\u0003x<\u0000\u00b8"+
		"\u00bc\u0003~?\u0000\u00b9\u00bc\u0003\u0086C\u0000\u00ba\u00bc\u0003"+
		"\u0092I\u0000\u00bb\u00b0\u0001\u0000\u0000\u0000\u00bb\u00b1\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b2\u0001\u0000\u0000\u0000\u00bb\u00b3\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b4\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u0005\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c1\u0005\u0001\u0000\u0000\u00be\u00c0\u0003\b\u0004"+
		"\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\u0002\u0000\u0000\u00c5\u0007\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0003\u0000\u0000\u00c7\u00c8\u0005W\u0000\u0000"+
		"\u00c8\u00d0\u0005Y\u0000\u0000\u00c9\u00ca\u0005\u0004\u0000\u0000\u00ca"+
		"\u00cb\u0005W\u0000\u0000\u00cb\u00d0\u0005Y\u0000\u0000\u00cc\u00cd\u0005"+
		"\n\u0000\u0000\u00cd\u00ce\u0005W\u0000\u0000\u00ce\u00d0\u0005Y\u0000"+
		"\u0000\u00cf\u00c6\u0001\u0000\u0000\u0000\u00cf\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00d0\t\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d5\u0005\u0005\u0000\u0000\u00d2\u00d4\u0003\f\u0006\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8"+
		"\u00da\u0005*\u0000\u0000\u00d9\u00db\u0003\u000e\u0007\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0006\u0000\u0000\u00dd\u000b"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0007\u0000\u0000\u00df\u00e0"+
		"\u0005W\u0000\u0000\u00e0\u00f8\u0005Y\u0000\u0000\u00e1\u00f8\u0005\b"+
		"\u0000\u0000\u00e2\u00e3\u0005\t\u0000\u0000\u00e3\u00e4\u0005W\u0000"+
		"\u0000\u00e4\u00f8\u0005Y\u0000\u0000\u00e5\u00e6\u0005\n\u0000\u0000"+
		"\u00e6\u00e7\u0005W\u0000\u0000\u00e7\u00f8\u0005Y\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0016\u0000\u0000\u00e9\u00ea\u0005W\u0000\u0000\u00ea\u00f8\u0005"+
		"Y\u0000\u0000\u00eb\u00ec\u0005\u0017\u0000\u0000\u00ec\u00ed\u0005W\u0000"+
		"\u0000\u00ed\u00f8\u0005Y\u0000\u0000\u00ee\u00ef\u0005\t\u0000\u0000"+
		"\u00ef\u00f0\u0005W\u0000\u0000\u00f0\u00f8\u0005Y\u0000\u0000\u00f1\u00f2"+
		"\u0005\u0018\u0000\u0000\u00f2\u00f3\u0005W\u0000\u0000\u00f3\u00f8\u0005"+
		"Y\u0000\u0000\u00f4\u00f5\u0005\u0019\u0000\u0000\u00f5\u00f6\u0005W\u0000"+
		"\u0000\u00f6\u00f8\u0005Y\u0000\u0000\u00f7\u00de\u0001\u0000\u0000\u0000"+
		"\u00f7\u00e1\u0001\u0000\u0000\u0000\u00f7\u00e2\u0001\u0000\u0000\u0000"+
		"\u00f7\u00e5\u0001\u0000\u0000\u0000\u00f7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00f7\u00eb\u0001\u0000\u0000\u0000\u00f7\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f1\u0001\u0000\u0000\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f8\r\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005Y\u0000\u0000\u00fa"+
		"\u000f\u0001\u0000\u0000\u0000\u00fb\u00ff\u0005\u000b\u0000\u0000\u00fc"+
		"\u00fe\u0003\u0012\t\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101"+
		"\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0002\u0000\u0000\u0103\u0011"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0007\u0000\u0000\u0105\u0106"+
		"\u0005W\u0000\u0000\u0106\u011d\u0005Y\u0000\u0000\u0107\u0108\u0005\f"+
		"\u0000\u0000\u0108\u0109\u0005W\u0000\u0000\u0109\u011d\u0005Y\u0000\u0000"+
		"\u010a\u010b\u0005\n\u0000\u0000\u010b\u010c\u0005W\u0000\u0000\u010c"+
		"\u011d\u0005Y\u0000\u0000\u010d\u010e\u0005\r\u0000\u0000\u010e\u010f"+
		"\u0005W\u0000\u0000\u010f\u011d\u0005Y\u0000\u0000\u0110\u0111\u0005\u000e"+
		"\u0000\u0000\u0111\u0112\u0005W\u0000\u0000\u0112\u011d\u0005Y\u0000\u0000"+
		"\u0113\u0114\u0005\u000f\u0000\u0000\u0114\u0115\u0005W\u0000\u0000\u0115"+
		"\u011d\u0005Y\u0000\u0000\u0116\u0117\u0005\u0018\u0000\u0000\u0117\u0118"+
		"\u0005W\u0000\u0000\u0118\u011d\u0005Y\u0000\u0000\u0119\u011a\u0005\u0019"+
		"\u0000\u0000\u011a\u011b\u0005W\u0000\u0000\u011b\u011d\u0005Y\u0000\u0000"+
		"\u011c\u0104\u0001\u0000\u0000\u0000\u011c\u0107\u0001\u0000\u0000\u0000"+
		"\u011c\u010a\u0001\u0000\u0000\u0000\u011c\u010d\u0001\u0000\u0000\u0000"+
		"\u011c\u0110\u0001\u0000\u0000\u0000\u011c\u0113\u0001\u0000\u0000\u0000"+
		"\u011c\u0116\u0001\u0000\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000"+
		"\u011d\u0013\u0001\u0000\u0000\u0000\u011e\u0122\u0005\u0013\u0000\u0000"+
		"\u011f\u0121\u0003\u0016\u000b\u0000\u0120\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0127\u0005*\u0000\u0000\u0126"+
		"\u0128\u0003\u0018\f\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0005\u0014\u0000\u0000\u012a\u0015\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0005\u000f\u0000\u0000\u012c\u012d\u0005W\u0000\u0000\u012d\u0144\u0005"+
		"Y\u0000\u0000\u012e\u012f\u0005\u0012\u0000\u0000\u012f\u0130\u0005W\u0000"+
		"\u0000\u0130\u0144\u0005Y\u0000\u0000\u0131\u0132\u0005\n\u0000\u0000"+
		"\u0132\u0133\u0005W\u0000\u0000\u0133\u0144\u0005Y\u0000\u0000\u0134\u0135"+
		"\u0005\u0016\u0000\u0000\u0135\u0136\u0005W\u0000\u0000\u0136\u0144\u0005"+
		"Y\u0000\u0000\u0137\u0138\u0005\u0017\u0000\u0000\u0138\u0139\u0005W\u0000"+
		"\u0000\u0139\u0144\u0005Y\u0000\u0000\u013a\u013b\u0005\t\u0000\u0000"+
		"\u013b\u013c\u0005W\u0000\u0000\u013c\u0144\u0005Y\u0000\u0000\u013d\u013e"+
		"\u0005\u0018\u0000\u0000\u013e\u013f\u0005W\u0000\u0000\u013f\u0144\u0005"+
		"Y\u0000\u0000\u0140\u0141\u0005\u0019\u0000\u0000\u0141\u0142\u0005W\u0000"+
		"\u0000\u0142\u0144\u0005Y\u0000\u0000\u0143\u012b\u0001\u0000\u0000\u0000"+
		"\u0143\u012e\u0001\u0000\u0000\u0000\u0143\u0131\u0001\u0000\u0000\u0000"+
		"\u0143\u0134\u0001\u0000\u0000\u0000\u0143\u0137\u0001\u0000\u0000\u0000"+
		"\u0143\u013a\u0001\u0000\u0000\u0000\u0143\u013d\u0001\u0000\u0000\u0000"+
		"\u0143\u0140\u0001\u0000\u0000\u0000\u0144\u0017\u0001\u0000\u0000\u0000"+
		"\u0145\u014a\u0005Y\u0000\u0000\u0146\u014a\u0003\u0006\u0003\u0000\u0147"+
		"\u014a\u0003\n\u0005\u0000\u0148\u014a\u0003\u0010\b\u0000\u0149\u0145"+
		"\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000\u0000\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u0019"+
		"\u0001\u0000\u0000\u0000\u014b\u014f\u0005\u001d\u0000\u0000\u014c\u014e"+
		"\u0003\u001c\u000e\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151"+
		"\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014f"+
		"\u0001\u0000\u0000\u0000\u0152\u0154\u0005*\u0000\u0000\u0153\u0155\u0003"+
		"\u001e\u000f\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0005"+
		"\u001e\u0000\u0000\u0157\u001b\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"\u001f\u0000\u0000\u0159\u015a\u0005W\u0000\u0000\u015a\u0162\u0005Y\u0000"+
		"\u0000\u015b\u015c\u0005\n\u0000\u0000\u015c\u015d\u0005W\u0000\u0000"+
		"\u015d\u0162\u0005Y\u0000\u0000\u015e\u015f\u0005\u0012\u0000\u0000\u015f"+
		"\u0160\u0005W\u0000\u0000\u0160\u0162\u0005Y\u0000\u0000\u0161\u0158\u0001"+
		"\u0000\u0000\u0000\u0161\u015b\u0001\u0000\u0000\u0000\u0161\u015e\u0001"+
		"\u0000\u0000\u0000\u0162\u001d\u0001\u0000\u0000\u0000\u0163\u0164\u0005"+
		"Y\u0000\u0000\u0164\u001f\u0001\u0000\u0000\u0000\u0165\u0169\u0005\u0010"+
		"\u0000\u0000\u0166\u0168\u0003\"\u0011\u0000\u0167\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000"+
		"\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u0170\u0005*\u0000\u0000"+
		"\u016d\u016f\u0003$\u0012\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f"+
		"\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172"+
		"\u0170\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u0011\u0000\u0000\u0174"+
		"!\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u000f\u0000\u0000\u0176\u0177"+
		"\u0005W\u0000\u0000\u0177\u018e\u0005Y\u0000\u0000\u0178\u0179\u0005\u0012"+
		"\u0000\u0000\u0179\u017a\u0005W\u0000\u0000\u017a\u018e\u0005Y\u0000\u0000"+
		"\u017b\u017c\u0005\n\u0000\u0000\u017c\u017d\u0005W\u0000\u0000\u017d"+
		"\u018e\u0005Y\u0000\u0000\u017e\u017f\u0005\u0016\u0000\u0000\u017f\u0180"+
		"\u0005W\u0000\u0000\u0180\u018e\u0005Y\u0000\u0000\u0181\u0182\u0005\u0017"+
		"\u0000\u0000\u0182\u0183\u0005W\u0000\u0000\u0183\u018e\u0005Y\u0000\u0000"+
		"\u0184\u0185\u0005\t\u0000\u0000\u0185\u0186\u0005W\u0000\u0000\u0186"+
		"\u018e\u0005Y\u0000\u0000\u0187\u0188\u0005\u0018\u0000\u0000\u0188\u0189"+
		"\u0005W\u0000\u0000\u0189\u018e\u0005Y\u0000\u0000\u018a\u018b\u0005\u0019"+
		"\u0000\u0000\u018b\u018c\u0005W\u0000\u0000\u018c\u018e\u0005Y\u0000\u0000"+
		"\u018d\u0175\u0001\u0000\u0000\u0000\u018d\u0178\u0001\u0000\u0000\u0000"+
		"\u018d\u017b\u0001\u0000\u0000\u0000\u018d\u017e\u0001\u0000\u0000\u0000"+
		"\u018d\u0181\u0001\u0000\u0000\u0000\u018d\u0184\u0001\u0000\u0000\u0000"+
		"\u018d\u0187\u0001\u0000\u0000\u0000\u018d\u018a\u0001\u0000\u0000\u0000"+
		"\u018e#\u0001\u0000\u0000\u0000\u018f\u0199\u0003\u0006\u0003\u0000\u0190"+
		"\u0199\u0003\n\u0005\u0000\u0191\u0199\u0003\u0010\b\u0000\u0192\u0199"+
		"\u0003\u0014\n\u0000\u0193\u0199\u0003 \u0010\u0000\u0194\u0199\u0003"+
		",\u0016\u0000\u0195\u0199\u0003.\u0017\u0000\u0196\u0199\u00030\u0018"+
		"\u0000\u0197\u0199\u0005Y\u0000\u0000\u0198\u018f\u0001\u0000\u0000\u0000"+
		"\u0198\u0190\u0001\u0000\u0000\u0000\u0198\u0191\u0001\u0000\u0000\u0000"+
		"\u0198\u0192\u0001\u0000\u0000\u0000\u0198\u0193\u0001\u0000\u0000\u0000"+
		"\u0198\u0194\u0001\u0000\u0000\u0000\u0198\u0195\u0001\u0000\u0000\u0000"+
		"\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000"+
		"\u0199%\u0001\u0000\u0000\u0000\u019a\u019e\u0005\u001a\u0000\u0000\u019b"+
		"\u019d\u0003(\u0014\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u01a0"+
		"\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a5\u0005*\u0000\u0000\u01a2\u01a4\u0003"+
		"*\u0015\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0005\u001b\u0000\u0000\u01a9\'\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0005\u000f\u0000\u0000\u01ab\u01ac\u0005W\u0000\u0000"+
		"\u01ac\u01b7\u0005Y\u0000\u0000\u01ad\u01ae\u0005\u0012\u0000\u0000\u01ae"+
		"\u01af\u0005W\u0000\u0000\u01af\u01b7\u0005Y\u0000\u0000\u01b0\u01b1\u0005"+
		"\n\u0000\u0000\u01b1\u01b2\u0005W\u0000\u0000\u01b2\u01b7\u0005Y\u0000"+
		"\u0000\u01b3\u01b4\u0005\u001c\u0000\u0000\u01b4\u01b5\u0005W\u0000\u0000"+
		"\u01b5\u01b7\u0005Y\u0000\u0000\u01b6\u01aa\u0001\u0000\u0000\u0000\u01b6"+
		"\u01ad\u0001\u0000\u0000\u0000\u01b6\u01b0\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b7)\u0001\u0000\u0000\u0000\u01b8\u01be"+
		"\u0003\u0010\b\u0000\u01b9\u01be\u0003\n\u0005\u0000\u01ba\u01be\u0003"+
		"\u001a\r\u0000\u01bb\u01be\u0003 \u0010\u0000\u01bc\u01be\u0005Y\u0000"+
		"\u0000\u01bd\u01b8\u0001\u0000\u0000\u0000\u01bd\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bd\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be+\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0005\u0015\u0000\u0000\u01c0-\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0005\u0016\u0000\u0000\u01c2\u01c3\u0005W\u0000\u0000\u01c3\u01c4"+
		"\u0005Y\u0000\u0000\u01c4/\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u0017"+
		"\u0000\u0000\u01c6\u01c7\u0005W\u0000\u0000\u01c7\u01c8\u0005Y\u0000\u0000"+
		"\u01c81\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005 \u0000\u0000\u01ca\u01cb"+
		"\u00052\u0000\u0000\u01cb\u01cc\u00034\u001a\u0000\u01cc\u01cd\u00053"+
		"\u0000\u0000\u01cd\u01ce\u0005$\u0000\u0000\u01ce\u01cf\u0005\u0012\u0000"+
		"\u0000\u01cf\u01d0\u0005X\u0000\u0000\u01d0\u01d1\u0003:\u001d\u0000\u01d1"+
		"3\u0001\u0000\u0000\u0000\u01d2\u01d3\u00050\u0000\u0000\u01d3\u01d8\u0003"+
		"6\u001b\u0000\u01d4\u01d5\u00055\u0000\u0000\u01d5\u01d7\u00036\u001b"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u00051\u0000\u0000\u01dc5\u0001\u0000\u0000\u0000\u01dd"+
		"\u01de\u0005!\u0000\u0000\u01de\u01df\u00054\u0000\u0000\u01df\u01e7\u0005"+
		"Y\u0000\u0000\u01e0\u01e1\u0005\"\u0000\u0000\u01e1\u01e2\u00054\u0000"+
		"\u0000\u01e2\u01e7\u0005Y\u0000\u0000\u01e3\u01e4\u0005#\u0000\u0000\u01e4"+
		"\u01e5\u00054\u0000\u0000\u01e5\u01e7\u00038\u001c\u0000\u01e6\u01dd\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e0\u0001\u0000\u0000\u0000\u01e6\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e77\u0001\u0000\u0000\u0000\u01e8\u01f1\u00056\u0000"+
		"\u0000\u01e9\u01ee\u0003B!\u0000\u01ea\u01eb\u00055\u0000\u0000\u01eb"+
		"\u01ed\u0003B!\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001"+
		"\u0000\u0000\u0000\u01f1\u01e9\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005"+
		"7\u0000\u0000\u01f49\u0001\u0000\u0000\u0000\u01f5\u01f9\u00050\u0000"+
		"\u0000\u01f6\u01f8\u0003<\u001e\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fd\u00051\u0000\u0000\u01fd"+
		";\u0001\u0000\u0000\u0000\u01fe\u01ff\u0003>\u001f\u0000\u01ff\u0200\u0005"+
		";\u0000\u0000\u0200\u0204\u0001\u0000\u0000\u0000\u0201\u0204\u0003P("+
		"\u0000\u0202\u0204\u0003`0\u0000\u0203\u01fe\u0001\u0000\u0000\u0000\u0203"+
		"\u0201\u0001\u0000\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204"+
		"=\u0001\u0000\u0000\u0000\u0205\u0206\u0007\u0000\u0000\u0000\u0206\u0207"+
		"\u0005X\u0000\u0000\u0207\u0208\u00054\u0000\u0000\u0208\u020b\u0003@"+
		" \u0000\u0209\u020a\u0005W\u0000\u0000\u020a\u020c\u0003B!\u0000\u020b"+
		"\u0209\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c"+
		"?\u0001\u0000\u0000\u0000\u020d\u0214\u0005%\u0000\u0000\u020e\u0211\u0005"+
		"X\u0000\u0000\u020f\u0210\u00056\u0000\u0000\u0210\u0212\u00057\u0000"+
		"\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000"+
		"\u0000\u0212\u0214\u0001\u0000\u0000\u0000\u0213\u020d\u0001\u0000\u0000"+
		"\u0000\u0213\u020e\u0001\u0000\u0000\u0000\u0214A\u0001\u0000\u0000\u0000"+
		"\u0215\u0216\u0006!\uffff\uffff\u0000\u0216\u0217\u0003F#\u0000\u0217"+
		"\u0218\u0003B!\u0007\u0218\u0222\u0001\u0000\u0000\u0000\u0219\u0222\u0003"+
		"H$\u0000\u021a\u0222\u0005X\u0000\u0000\u021b\u0222\u0003L&\u0000\u021c"+
		"\u021d\u00052\u0000\u0000\u021d\u021e\u0003B!\u0000\u021e\u021f\u0005"+
		"3\u0000\u0000\u021f\u0222\u0001\u0000\u0000\u0000\u0220\u0222\u0003\u008e"+
		"G\u0000\u0221\u0215\u0001\u0000\u0000\u0000\u0221\u0219\u0001\u0000\u0000"+
		"\u0000\u0221\u021a\u0001\u0000\u0000\u0000\u0221\u021b\u0001\u0000\u0000"+
		"\u0000\u0221\u021c\u0001\u0000\u0000\u0000\u0221\u0220\u0001\u0000\u0000"+
		"\u0000\u0222\u022b\u0001\u0000\u0000\u0000\u0223\u0224\n\b\u0000\u0000"+
		"\u0224\u0225\u0003D\"\u0000\u0225\u0226\u0003B!\t\u0226\u022a\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\n\u0005\u0000\u0000\u0228\u022a\u0003J%\u0000"+
		"\u0229\u0223\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000"+
		"\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0001\u0000\u0000\u0000\u022cC\u0001\u0000\u0000\u0000\u022d"+
		"\u022b\u0001\u0000\u0000\u0000\u022e\u022f\u0007\u0001\u0000\u0000\u022f"+
		"E\u0001\u0000\u0000\u0000\u0230\u0231\u0007\u0002\u0000\u0000\u0231G\u0001"+
		"\u0000\u0000\u0000\u0232\u0233\u0007\u0003\u0000\u0000\u0233I\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u00056\u0000\u0000\u0235\u0236\u0003B!\u0000"+
		"\u0236\u0237\u00057\u0000\u0000\u0237K\u0001\u0000\u0000\u0000\u0238\u0241"+
		"\u00050\u0000\u0000\u0239\u023e\u0003N\'\u0000\u023a\u023b\u00055\u0000"+
		"\u0000\u023b\u023d\u0003N\'\u0000\u023c\u023a\u0001\u0000\u0000\u0000"+
		"\u023d\u0240\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0242\u0001\u0000\u0000\u0000"+
		"\u0240\u023e\u0001\u0000\u0000\u0000\u0241\u0239\u0001\u0000\u0000\u0000"+
		"\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000"+
		"\u0243\u0244\u00051\u0000\u0000\u0244M\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0005X\u0000\u0000\u0246\u0247\u00054\u0000\u0000\u0247\u0248\u0003B"+
		"!\u0000\u0248O\u0001\u0000\u0000\u0000\u0249\u024a\u00058\u0000\u0000"+
		"\u024a\u024c\u00052\u0000\u0000\u024b\u024d\u0003R)\u0000\u024c\u024b"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e"+
		"\u0001\u0000\u0000\u0000\u024e\u024f\u00053\u0000\u0000\u024f\u0250\u0003"+
		"V+\u0000\u0250Q\u0001\u0000\u0000\u0000\u0251\u0256\u0003T*\u0000\u0252"+
		"\u0253\u00055\u0000\u0000\u0253\u0255\u0003T*\u0000\u0254\u0252\u0001"+
		"\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000\u0000\u0256\u0254\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257S\u0001\u0000"+
		"\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259\u025b\u0007\u0004"+
		"\u0000\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000"+
		"\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0005X\u0000"+
		"\u0000\u025d\u025e\u00054\u0000\u0000\u025e\u025f\u0003@ \u0000\u025f"+
		"U\u0001\u0000\u0000\u0000\u0260\u0264\u00050\u0000\u0000\u0261\u0263\u0003"+
		"X,\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0263\u0266\u0001\u0000\u0000"+
		"\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000"+
		"\u0000\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000"+
		"\u0000\u0267\u0268\u00051\u0000\u0000\u0268W\u0001\u0000\u0000\u0000\u0269"+
		"\u0271\u0003Z-\u0000\u026a\u0271\u0003\\.\u0000\u026b\u026c\u0003>\u001f"+
		"\u0000\u026c\u026d\u0005;\u0000\u0000\u026d\u0271\u0001\u0000\u0000\u0000"+
		"\u026e\u0271\u0003d2\u0000\u026f\u0271\u0003\u008aE\u0000\u0270\u0269"+
		"\u0001\u0000\u0000\u0000\u0270\u026a\u0001\u0000\u0000\u0000\u0270\u026b"+
		"\u0001\u0000\u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u026f"+
		"\u0001\u0000\u0000\u0000\u0271Y\u0001\u0000\u0000\u0000\u0272\u0273\u0005"+
		"9\u0000\u0000\u0273\u0275\u0005:\u0000\u0000\u0274\u0272\u0001\u0000\u0000"+
		"\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u0005X\u0000\u0000\u0277\u0278\u0005W\u0000\u0000\u0278"+
		"\u0279\u0003B!\u0000\u0279\u027a\u0005;\u0000\u0000\u027a[\u0001\u0000"+
		"\u0000\u0000\u027b\u027c\u00059\u0000\u0000\u027c\u027e\u0005:\u0000\u0000"+
		"\u027d\u027b\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000"+
		"\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0005X\u0000\u0000\u0280"+
		"\u0282\u00052\u0000\u0000\u0281\u0283\u0003^/\u0000\u0282\u0281\u0001"+
		"\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0284\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u00053\u0000\u0000\u0285\u0286\u0005;\u0000"+
		"\u0000\u0286]\u0001\u0000\u0000\u0000\u0287\u028c\u0003B!\u0000\u0288"+
		"\u0289\u00055\u0000\u0000\u0289\u028b\u0003B!\u0000\u028a\u0288\u0001"+
		"\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000\u0000\u028c\u028a\u0001"+
		"\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d_\u0001\u0000"+
		"\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028f\u0291\u0003b1\u0000"+
		"\u0290\u028f\u0001\u0000\u0000\u0000\u0291\u0294\u0001\u0000\u0000\u0000"+
		"\u0292\u0290\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000"+
		"\u0295\u0297\u0005D\u0000\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0296"+
		"\u0297\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298"+
		"\u0299\u0005X\u0000\u0000\u0299\u029b\u00052\u0000\u0000\u029a\u029c\u0003"+
		"R)\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000"+
		"\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u00053\u0000\u0000"+
		"\u029e\u029f\u00054\u0000\u0000\u029f\u02a0\u0003@ \u0000\u02a0\u02a1"+
		"\u0003V+\u0000\u02a1a\u0001\u0000\u0000\u0000\u02a2\u02a3\u0007\u0005"+
		"\u0000\u0000\u02a3c\u0001\u0000\u0000\u0000\u02a4\u02a6\u0005?\u0000\u0000"+
		"\u02a5\u02a7\u0003B!\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a6\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02a9"+
		"\u0005;\u0000\u0000\u02a9e\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005E"+
		"\u0000\u0000\u02ab\u02ac\u00052\u0000\u0000\u02ac\u02ad\u0003h4\u0000"+
		"\u02ad\u02ae\u00053\u0000\u0000\u02ae\u02af\u0005$\u0000\u0000\u02af\u02b0"+
		"\u0005\u0012\u0000\u0000\u02b0\u02b1\u0005X\u0000\u0000\u02b1\u02b2\u0003"+
		":\u001d\u0000\u02b2g\u0001\u0000\u0000\u0000\u02b3\u02b4\u00050\u0000"+
		"\u0000\u02b4\u02b9\u0003j5\u0000\u02b5\u02b6\u00055\u0000\u0000\u02b6"+
		"\u02b8\u0003j5\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8\u02bb\u0001"+
		"\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bc\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001"+
		"\u0000\u0000\u0000\u02bc\u02bd\u00051\u0000\u0000\u02bdi\u0001\u0000\u0000"+
		"\u0000\u02be\u02bf\u0005F\u0000\u0000\u02bf\u02c0\u00054\u0000\u0000\u02c0"+
		"\u02c8\u0005Y\u0000\u0000\u02c1\u02c2\u0005G\u0000\u0000\u02c2\u02c3\u0005"+
		"4\u0000\u0000\u02c3\u02c8\u0005X\u0000\u0000\u02c4\u02c5\u0005H\u0000"+
		"\u0000\u02c5\u02c6\u00054\u0000\u0000\u02c6\u02c8\u0003B!\u0000\u02c7"+
		"\u02be\u0001\u0000\u0000\u0000\u02c7\u02c1\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c4\u0001\u0000\u0000\u0000\u02c8k\u0001\u0000\u0000\u0000\u02c9\u02ca"+
		"\u0005$\u0000\u0000\u02ca\u02cb\u0005\u0012\u0000\u0000\u02cb\u02ce\u0005"+
		"X\u0000\u0000\u02cc\u02cd\u0005I\u0000\u0000\u02cd\u02cf\u0005X\u0000"+
		"\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d1\u0003:\u001d\u0000"+
		"\u02d1m\u0001\u0000\u0000\u0000\u02d2\u02d4\u0005D\u0000\u0000\u02d3\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005J\u0000\u0000\u02d6\u02d7\u0005"+
		"X\u0000\u0000\u02d7\u02d9\u00052\u0000\u0000\u02d8\u02da\u0003R)\u0000"+
		"\u02d9\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000"+
		"\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dc\u00053\u0000\u0000\u02dc"+
		"\u02dd\u00054\u0000\u0000\u02dd\u02de\u0003@ \u0000\u02de\u02df\u0003"+
		"V+\u0000\u02dfo\u0001\u0000\u0000\u0000\u02e0\u02e2\u00052\u0000\u0000"+
		"\u02e1\u02e3\u0003R)\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e2\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e7"+
		"\u00053\u0000\u0000\u02e5\u02e6\u00054\u0000\u0000\u02e6\u02e8\u0003@"+
		" \u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02ec\u0005K\u0000\u0000"+
		"\u02ea\u02ed\u0003V+\u0000\u02eb\u02ed\u0003B!\u0000\u02ec\u02ea\u0001"+
		"\u0000\u0000\u0000\u02ec\u02eb\u0001\u0000\u0000\u0000\u02edq\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ef\u0005$\u0000\u0000\u02ef\u02f0\u0005L\u0000\u0000"+
		"\u02f0\u02f1\u0005X\u0000\u0000\u02f1\u02f2\u0003t:\u0000\u02f2s\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f7\u00050\u0000\u0000\u02f4\u02f6\u0003v;"+
		"\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f8\u02fa\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fb\u00051\u0000\u0000\u02fbu\u0001\u0000\u0000\u0000\u02fc"+
		"\u02fd\u0005X\u0000\u0000\u02fd\u02fe\u00054\u0000\u0000\u02fe\u02ff\u0003"+
		"@ \u0000\u02ff\u0300\u0005;\u0000\u0000\u0300w\u0001\u0000\u0000\u0000"+
		"\u0301\u0302\u0005$\u0000\u0000\u0302\u0303\u0005M\u0000\u0000\u0303\u0304"+
		"\u0005X\u0000\u0000\u0304\u0305\u0003z=\u0000\u0305y\u0001\u0000\u0000"+
		"\u0000\u0306\u0307\u00050\u0000\u0000\u0307\u030c\u0003|>\u0000\u0308"+
		"\u0309\u00055\u0000\u0000\u0309\u030b\u0003|>\u0000\u030a\u0308\u0001"+
		"\u0000\u0000\u0000\u030b\u030e\u0001\u0000\u0000\u0000\u030c\u030a\u0001"+
		"\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u0310\u0001"+
		"\u0000\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030f\u0311\u0005"+
		"5\u0000\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000"+
		"\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0313\u00051\u0000"+
		"\u0000\u0313{\u0001\u0000\u0000\u0000\u0314\u0317\u0005X\u0000\u0000\u0315"+
		"\u0316\u0005W\u0000\u0000\u0316\u0318\u0003B!\u0000\u0317\u0315\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318}\u0001\u0000"+
		"\u0000\u0000\u0319\u031a\u0005=\u0000\u0000\u031a\u031b\u0005X\u0000\u0000"+
		"\u031b\u031c\u00054\u0000\u0000\u031c\u031d\u0005O\u0000\u0000\u031d\u031e"+
		"\u0005W\u0000\u0000\u031e\u031f\u00056\u0000\u0000\u031f\u0324\u0003\u0080"+
		"@\u0000\u0320\u0321\u00055\u0000\u0000\u0321\u0323\u0003\u0080@\u0000"+
		"\u0322\u0320\u0001\u0000\u0000\u0000\u0323\u0326\u0001\u0000\u0000\u0000"+
		"\u0324\u0322\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000"+
		"\u0325\u0327\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000"+
		"\u0327\u0328\u00057\u0000\u0000\u0328\u0329\u0005;\u0000\u0000\u0329\u007f"+
		"\u0001\u0000\u0000\u0000\u032a\u032b\u00050\u0000\u0000\u032b\u032c\u0003"+
		"\u0082A\u0000\u032c\u032d\u00055\u0000\u0000\u032d\u032e\u0003\u0084B"+
		"\u0000\u032e\u032f\u00051\u0000\u0000\u032f\u0081\u0001\u0000\u0000\u0000"+
		"\u0330\u0331\u0005P\u0000\u0000\u0331\u0332\u00054\u0000\u0000\u0332\u0333"+
		"\u0005Y\u0000\u0000\u0333\u0083\u0001\u0000\u0000\u0000\u0334\u0335\u0005"+
		"Q\u0000\u0000\u0335\u0336\u00054\u0000\u0000\u0336\u0337\u0005X\u0000"+
		"\u0000\u0337\u0085\u0001\u0000\u0000\u0000\u0338\u0339\u0005$\u0000\u0000"+
		"\u0339\u033a\u0005=\u0000\u0000\u033a\u033b\u0005X\u0000\u0000\u033b\u033c"+
		"\u0005W\u0000\u0000\u033c\u033d\u0005R\u0000\u0000\u033d\u033e\u00052"+
		"\u0000\u0000\u033e\u033f\u0003\u0088D\u0000\u033f\u0340\u00053\u0000\u0000"+
		"\u0340\u0341\u0005;\u0000\u0000\u0341\u0087\u0001\u0000\u0000\u0000\u0342"+
		"\u0343\u0005Y\u0000\u0000\u0343\u0089\u0001\u0000\u0000\u0000\u0344\u0345"+
		"\u00059\u0000\u0000\u0345\u0346\u0005:\u0000\u0000\u0346\u0347\u0005S"+
		"\u0000\u0000\u0347\u0348\u0005:\u0000\u0000\u0348\u0349\u0005T\u0000\u0000"+
		"\u0349\u034a\u00052\u0000\u0000\u034a\u034b\u0003\u008cF\u0000\u034b\u034c"+
		"\u00053\u0000\u0000\u034c\u034d\u0005;\u0000\u0000\u034d\u008b\u0001\u0000"+
		"\u0000\u0000\u034e\u034f\u0005X\u0000\u0000\u034f\u0350\u00052\u0000\u0000"+
		"\u0350\u0351\u00053\u0000\u0000\u0351\u008d\u0001\u0000\u0000\u0000\u0352"+
		"\u0353\u00059\u0000\u0000\u0353\u0354\u0005:\u0000\u0000\u0354\u0355\u0005"+
		"S\u0000\u0000\u0355\u0356\u0005:\u0000\u0000\u0356\u0357\u0005N\u0000"+
		"\u0000\u0357\u0358\u00052\u0000\u0000\u0358\u0359\u0003\u0090H\u0000\u0359"+
		"\u035a\u00053\u0000\u0000\u035a\u008f\u0001\u0000\u0000\u0000\u035b\u035c"+
		"\u0005X\u0000\u0000\u035c\u0091\u0001\u0000\u0000\u0000\u035d\u035e\u0005"+
		"$\u0000\u0000\u035e\u035f\u0005=\u0000\u0000\u035f\u0360\u0005X\u0000"+
		"\u0000\u0360\u0361\u0005W\u0000\u0000\u0361\u0362\u0005U\u0000\u0000\u0362"+
		"\u0363\u00052\u0000\u0000\u0363\u0364\u0003\u0094J\u0000\u0364\u0365\u0005"+
		"3\u0000\u0000\u0365\u0366\u0005;\u0000\u0000\u0366\u0093\u0001\u0000\u0000"+
		"\u0000\u0367\u0368\u0005X\u0000\u0000\u0368\u036a\u00055\u0000\u0000\u0369"+
		"\u036b\u0003\u0096K\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036b\u036c"+
		"\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036c\u036d"+
		"\u0001\u0000\u0000\u0000\u036d\u0095\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u00055\u0000\u0000\u036f\u0370\u0005V\u0000\u0000\u0370\u0371\u00052"+
		"\u0000\u0000\u0371\u0372\u0005X\u0000\u0000\u0372\u0373\u00055\u0000\u0000"+
		"\u0373\u0374\u0005K\u0000\u0000\u0374\u0375\u0003V+\u0000\u0375\u0376"+
		"\u00053\u0000\u0000\u0376\u0097\u0001\u0000\u0000\u0000C\u009b\u00a1\u00ae"+
		"\u00bb\u00c1\u00cf\u00d5\u00da\u00f7\u00ff\u011c\u0122\u0127\u0143\u0149"+
		"\u014f\u0154\u0161\u0169\u0170\u018d\u0198\u019e\u01a5\u01b6\u01bd\u01d8"+
		"\u01e6\u01ee\u01f1\u01f9\u0203\u020b\u0211\u0213\u0221\u0229\u022b\u023e"+
		"\u0241\u024c\u0256\u025a\u0264\u0270\u0274\u027d\u0282\u028c\u0292\u0296"+
		"\u029b\u02a6\u02b9\u02c7\u02ce\u02d3\u02d9\u02e2\u02e7\u02ec\u02f7\u030c"+
		"\u0310\u0317\u0324\u036c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}