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
		ASYNC=68, SPAN_TAG_OPEN=69, SPAN_TAG_CLOSE=70, A_TAG_OPEN=71, A_TAG_CLOSE=72, 
		HREF=73, TARGET=74, REL=75, ROUTER_LINK_BINDING=76, AT_INJECTABLE=77, 
		PROVIDEDIN=78, USECLASS=79, USEVALUE=80, EXTENDS=81, FUNCTION=82, ARROW=83, 
		INTERFACE=84, ENUM=85, SELECT=86, ROUTES=87, PATH=88, COMPONENT=89, CREATEACTION=90, 
		STORE=91, DISPATCH=92, CREATEREDUCER=93, ON=94, EQ=95, IDENTITY=96, STRING=97, 
		NUMBER=98, WS=99;
	public static final int
		RULE_root = 0, RULE_htmlSection = 1, RULE_tsSection = 2, RULE_htmlImageTag = 3, 
		RULE_imgAttribute = 4, RULE_htmlButtonTag = 5, RULE_buttonAttribute = 6, 
		RULE_buttonContent = 7, RULE_htmlInputTag = 8, RULE_inputAttribute = 9, 
		RULE_htmlParagraphTag = 10, RULE_paragraphAttribute = 11, RULE_paragraphContent = 12, 
		RULE_htmlLabelTag = 13, RULE_labelAttribute = 14, RULE_labelContent = 15, 
		RULE_htmlDivTag = 16, RULE_divAttribute = 17, RULE_divContent = 18, RULE_htmlFormTag = 19, 
		RULE_formAttribute = 20, RULE_formContent = 21, RULE_htmlSpanTag = 22, 
		RULE_spanAttribute = 23, RULE_spanContent = 24, RULE_htmlAnchorTag = 25, 
		RULE_anchorAttribute = 26, RULE_anchorContent = 27, RULE_routerOutletTag = 28, 
		RULE_ngIfDirective = 29, RULE_ngForDirective = 30, RULE_componentDeclaration = 31, 
		RULE_componentBody = 32, RULE_componentProperty = 33, RULE_arrayLiteral = 34, 
		RULE_classBlock = 35, RULE_classMember = 36, RULE_variableDeclaration = 37, 
		RULE_type = 38, RULE_expression = 39, RULE_binaryOp = 40, RULE_unaryOp = 41, 
		RULE_literal = 42, RULE_arrayAccess = 43, RULE_objectLiteral = 44, RULE_objectProperty = 45, 
		RULE_constructorDeclaration = 46, RULE_parameterList = 47, RULE_parameter = 48, 
		RULE_block = 49, RULE_statement = 50, RULE_assignmentStatement = 51, RULE_functionCallStatement = 52, 
		RULE_argumentList = 53, RULE_methodDeclaration = 54, RULE_methodModifier = 55, 
		RULE_returnStatement = 56, RULE_serviceDeclaration = 57, RULE_injectableBody = 58, 
		RULE_injectableProperty = 59, RULE_classDeclaration = 60, RULE_functionDeclaration = 61, 
		RULE_arrowFunction = 62, RULE_interfaceDeclaration = 63, RULE_interfaceBody = 64, 
		RULE_interfaceProperty = 65, RULE_enumDeclaration = 66, RULE_enumBody = 67, 
		RULE_enumMember = 68, RULE_routingDeclaration = 69, RULE_routeConfig = 70, 
		RULE_pathProperty = 71, RULE_routeComponentProperty = 72, RULE_ngrxActionDeclaration = 73, 
		RULE_actionType = 74, RULE_storeDispatchStatement = 75, RULE_actionCall = 76, 
		RULE_storeSelectExpression = 77, RULE_selectorCall = 78, RULE_ngrxReducerDeclaration = 79, 
		RULE_reducerConfig = 80, RULE_onReducerBlock = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "htmlSection", "tsSection", "htmlImageTag", "imgAttribute", "htmlButtonTag", 
			"buttonAttribute", "buttonContent", "htmlInputTag", "inputAttribute", 
			"htmlParagraphTag", "paragraphAttribute", "paragraphContent", "htmlLabelTag", 
			"labelAttribute", "labelContent", "htmlDivTag", "divAttribute", "divContent", 
			"htmlFormTag", "formAttribute", "formContent", "htmlSpanTag", "spanAttribute", 
			"spanContent", "htmlAnchorTag", "anchorAttribute", "anchorContent", "routerOutletTag", 
			"ngIfDirective", "ngForDirective", "componentDeclaration", "componentBody", 
			"componentProperty", "arrayLiteral", "classBlock", "classMember", "variableDeclaration", 
			"type", "expression", "binaryOp", "unaryOp", "literal", "arrayAccess", 
			"objectLiteral", "objectProperty", "constructorDeclaration", "parameterList", 
			"parameter", "block", "statement", "assignmentStatement", "functionCallStatement", 
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
			"'async'", "'<span'", "'</span>'", "'<a'", "'</a>'", "'href'", "'target'", 
			"'rel'", "'[routerLink]'", "'@Injectable'", "'providedIn'", "'useClass'", 
			"'useValue'", "'extends'", "'function'", "'=>'", "'interface'", "'enum'", 
			"'select'", "'Routes'", "'path'", "'component'", "'createAction'", "'store'", 
			"'dispatch'", "'createReducer'", "'on'", "'='"
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
			"PROTECTED", "STATIC", "ASYNC", "SPAN_TAG_OPEN", "SPAN_TAG_CLOSE", "A_TAG_OPEN", 
			"A_TAG_CLOSE", "HREF", "TARGET", "REL", "ROUTER_LINK_BINDING", "AT_INJECTABLE", 
			"PROVIDEDIN", "USECLASS", "USEVALUE", "EXTENDS", "FUNCTION", "ARROW", 
			"INTERFACE", "ENUM", "SELECT", "ROUTES", "PATH", "COMPONENT", "CREATEACTION", 
			"STORE", "DISPATCH", "CREATEREDUCER", "ON", "EQ", "IDENTITY", "STRING", 
			"NUMBER", "WS"
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
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 606668834L) != 0) || _la==SPAN_TAG_OPEN || _la==A_TAG_OPEN) {
				{
				{
				setState(164);
				htmlSection();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 1161154877718545L) != 0)) {
				{
				{
				setState(170);
				tsSection();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
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
	public static class HTMLSpanLabelContext extends HtmlSectionContext {
		public HtmlSpanTagContext htmlSpanTag() {
			return getRuleContext(HtmlSpanTagContext.class,0);
		}
		public HTMLSpanLabelContext(HtmlSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHTMLSpanLabel(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class HTMLAnchorLabelContext extends HtmlSectionContext {
		public HtmlAnchorTagContext htmlAnchorTag() {
			return getRuleContext(HtmlAnchorTagContext.class,0);
		}
		public HTMLAnchorLabelContext(HtmlSectionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHTMLAnchorLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlSectionContext htmlSection() throws RecognitionException {
		HtmlSectionContext _localctx = new HtmlSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlSection);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV_TAG_OPEN:
				_localctx = new HTMLDivLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				htmlDivTag();
				}
				break;
			case FORM_TAG_OPEN:
				_localctx = new HTMLFormLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				htmlFormTag();
				}
				break;
			case P_TAG_OPEN:
				_localctx = new HTMLParagraphLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				htmlParagraphTag();
				}
				break;
			case BUTTON_TAG_OPEN:
				_localctx = new HTMLButtonLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				htmlButtonTag();
				}
				break;
			case INPUT_TAG_OPEN:
				_localctx = new HTMLInputLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				htmlInputTag();
				}
				break;
			case IMG_TAG_OPEN:
				_localctx = new HTMLImageLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				htmlImageTag();
				}
				break;
			case LABEL_TAG_OPEN:
				_localctx = new HTMLLabelContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				htmlLabelTag();
				}
				break;
			case SPAN_TAG_OPEN:
				_localctx = new HTMLSpanLabelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(185);
				htmlSpanTag();
				}
				break;
			case A_TAG_OPEN:
				_localctx = new HTMLAnchorLabelContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(186);
				htmlAnchorTag();
				}
				break;
			case ROUTER_OUTLET_TAG:
				_localctx = new HTMLRouterOutletLabelContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(187);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new TSComponentLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				componentDeclaration();
				}
				break;
			case 2:
				_localctx = new TSServiceLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				serviceDeclaration();
				}
				break;
			case 3:
				_localctx = new TSClassLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				classDeclaration();
				}
				break;
			case 4:
				_localctx = new TSFunctionLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				functionDeclaration();
				}
				break;
			case 5:
				_localctx = new TSArrowFunctionLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				arrowFunction();
				}
				break;
			case 6:
				_localctx = new TSVariableLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				variableDeclaration();
				}
				break;
			case 7:
				_localctx = new TSInterfaceLabelContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				interfaceDeclaration();
				}
				break;
			case 8:
				_localctx = new TSEnumLabelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				enumDeclaration();
				}
				break;
			case 9:
				_localctx = new TSRoutingLabelContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(198);
				routingDeclaration();
				}
				break;
			case 10:
				_localctx = new TSActionLabelContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(199);
				ngrxActionDeclaration();
				}
				break;
			case 11:
				_localctx = new TSReducerLabelContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(200);
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
			setState(203);
			match(IMG_TAG_OPEN);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1048L) != 0)) {
				{
				{
				setState(204);
				imgAttribute();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SRC:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(SRC);
				setState(213);
				match(EQ);
				setState(214);
				match(STRING);
				}
				break;
			case ALT:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(ALT);
				setState(216);
				match(EQ);
				setState(217);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(STYLE);
				setState(219);
				match(EQ);
				setState(220);
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
			setState(223);
			match(BUTTON_TAG_OPEN);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62916480L) != 0)) {
				{
				{
				setState(224);
				buttonAttribute();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(GT);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(231);
				buttonContent();
				}
			}

			setState(234);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(TYPE);
				setState(237);
				match(EQ);
				setState(238);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(DISABLED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(CLICK);
				setState(241);
				match(EQ);
				setState(242);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(STYLE);
				setState(244);
				match(EQ);
				setState(245);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(STAR_NG_IF);
				setState(247);
				match(EQ);
				setState(248);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
				match(STAR_NG_FOR);
				setState(250);
				match(EQ);
				setState(251);
				match(STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				match(CLICK);
				setState(253);
				match(EQ);
				setState(254);
				match(STRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				match(NG_MODEL);
				setState(256);
				match(EQ);
				setState(257);
				match(STRING);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(258);
				match(NG_MODEL_TWO_WAY);
				setState(259);
				match(EQ);
				setState(260);
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
			setState(263);
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
			setState(265);
			match(INPUT_TAG_OPEN);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50394240L) != 0)) {
				{
				{
				setState(266);
				inputAttribute();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
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
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(TYPE);
				setState(275);
				match(EQ);
				setState(276);
				match(STRING);
				}
				break;
			case PLACEHOLDER:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(PLACEHOLDER);
				setState(278);
				match(EQ);
				setState(279);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(STYLE);
				setState(281);
				match(EQ);
				setState(282);
				match(STRING);
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(VALUE);
				setState(284);
				match(EQ);
				setState(285);
				match(STRING);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(NAME);
				setState(287);
				match(EQ);
				setState(288);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(289);
				match(ID);
				setState(290);
				match(EQ);
				setState(291);
				match(STRING);
				}
				break;
			case NG_MODEL:
				enterOuterAlt(_localctx, 7);
				{
				setState(292);
				match(NG_MODEL);
				setState(293);
				match(EQ);
				setState(294);
				match(STRING);
				}
				break;
			case NG_MODEL_TWO_WAY:
				enterOuterAlt(_localctx, 8);
				{
				setState(295);
				match(NG_MODEL_TWO_WAY);
				setState(296);
				match(EQ);
				setState(297);
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
			setState(300);
			match(P_TAG_OPEN);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63211008L) != 0)) {
				{
				{
				setState(301);
				paragraphAttribute();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(GT);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2082L) != 0) || _la==STRING) {
				{
				setState(308);
				paragraphContent();
				}
			}

			setState(311);
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
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(ID);
				setState(314);
				match(EQ);
				setState(315);
				match(STRING);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(CLASS);
				setState(317);
				match(EQ);
				setState(318);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(STYLE);
				setState(320);
				match(EQ);
				setState(321);
				match(STRING);
				}
				break;
			case STAR_NG_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(STAR_NG_IF);
				setState(323);
				match(EQ);
				setState(324);
				match(STRING);
				}
				break;
			case STAR_NG_FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(STAR_NG_FOR);
				setState(326);
				match(EQ);
				setState(327);
				match(STRING);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				match(CLICK);
				setState(329);
				match(EQ);
				setState(330);
				match(STRING);
				}
				break;
			case NG_MODEL:
				enterOuterAlt(_localctx, 7);
				{
				setState(331);
				match(NG_MODEL);
				setState(332);
				match(EQ);
				setState(333);
				match(STRING);
				}
				break;
			case NG_MODEL_TWO_WAY:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
				match(NG_MODEL_TWO_WAY);
				setState(335);
				match(EQ);
				setState(336);
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
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new ParagraphTextLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(STRING);
				}
				break;
			case IMG_TAG_OPEN:
				_localctx = new ParagraphImageLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				htmlImageTag();
				}
				break;
			case BUTTON_TAG_OPEN:
				_localctx = new ParagraphButtonLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				htmlButtonTag();
				}
				break;
			case INPUT_TAG_OPEN:
				_localctx = new ParagraphInputLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
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
		public List<LabelContentContext> labelContent() {
			return getRuleContexts(LabelContentContext.class);
		}
		public LabelContentContext labelContent(int i) {
			return getRuleContext(LabelContentContext.class,i);
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
			setState(345);
			match(LABEL_TAG_OPEN);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147746816L) != 0)) {
				{
				{
				setState(346);
				labelAttribute();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(GT);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INPUT_TAG_OPEN || _la==SPAN_TAG_OPEN || _la==STRING) {
				{
				{
				setState(353);
				labelContent();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
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
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(FOR);
				setState(362);
				match(EQ);
				setState(363);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(STYLE);
				setState(365);
				match(EQ);
				setState(366);
				match(STRING);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(CLASS);
				setState(368);
				match(EQ);
				setState(369);
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
		public HtmlSpanTagContext htmlSpanTag() {
			return getRuleContext(HtmlSpanTagContext.class,0);
		}
		public HtmlInputTagContext htmlInputTag() {
			return getRuleContext(HtmlInputTagContext.class,0);
		}
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
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(STRING);
				}
				break;
			case SPAN_TAG_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				htmlSpanTag();
				}
				break;
			case INPUT_TAG_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
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
			setState(377);
			match(DIV_TAG_OPEN);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 63211008L) != 0)) {
				{
				{
				setState(378);
				divAttribute();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			match(GT);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 552142882L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 268435461L) != 0)) {
				{
				{
				setState(385);
				divContent();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
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
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(ID);
				setState(394);
				match(EQ);
				setState(395);
				match(STRING);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(CLASS);
				setState(397);
				match(EQ);
				setState(398);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(STYLE);
				setState(400);
				match(EQ);
				setState(401);
				match(STRING);
				}
				break;
			case STAR_NG_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(STAR_NG_IF);
				setState(403);
				match(EQ);
				setState(404);
				match(STRING);
				}
				break;
			case STAR_NG_FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				match(STAR_NG_FOR);
				setState(406);
				match(EQ);
				setState(407);
				match(STRING);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 6);
				{
				setState(408);
				match(CLICK);
				setState(409);
				match(EQ);
				setState(410);
				match(STRING);
				}
				break;
			case NG_MODEL:
				enterOuterAlt(_localctx, 7);
				{
				setState(411);
				match(NG_MODEL);
				setState(412);
				match(EQ);
				setState(413);
				match(STRING);
				}
				break;
			case NG_MODEL_TWO_WAY:
				enterOuterAlt(_localctx, 8);
				{
				setState(414);
				match(NG_MODEL_TWO_WAY);
				setState(415);
				match(EQ);
				setState(416);
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
	public static class DivSpanLabelContext extends DivContentContext {
		public HtmlSpanTagContext htmlSpanTag() {
			return getRuleContext(HtmlSpanTagContext.class,0);
		}
		public DivSpanLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivSpanLabel(this);
			else return visitor.visitChildren(this);
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
	public static class DivLabelContext extends DivContentContext {
		public HtmlLabelTagContext htmlLabelTag() {
			return getRuleContext(HtmlLabelTagContext.class,0);
		}
		public DivLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivLabel(this);
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
	public static class DivAnchorLabelContext extends DivContentContext {
		public HtmlAnchorTagContext htmlAnchorTag() {
			return getRuleContext(HtmlAnchorTagContext.class,0);
		}
		public DivAnchorLabelContext(DivContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitDivAnchorLabel(this);
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
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMG_TAG_OPEN:
				_localctx = new DivImageLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				htmlImageTag();
				}
				break;
			case BUTTON_TAG_OPEN:
				_localctx = new DivButtonLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				htmlButtonTag();
				}
				break;
			case INPUT_TAG_OPEN:
				_localctx = new DivInputLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				htmlInputTag();
				}
				break;
			case P_TAG_OPEN:
				_localctx = new DivParagraphLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				htmlParagraphTag();
				}
				break;
			case DIV_TAG_OPEN:
				_localctx = new DivNestedLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
				htmlDivTag();
				}
				break;
			case SPAN_TAG_OPEN:
				_localctx = new DivSpanLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(424);
				htmlSpanTag();
				}
				break;
			case A_TAG_OPEN:
				_localctx = new DivAnchorLabelContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(425);
				htmlAnchorTag();
				}
				break;
			case LABEL_TAG_OPEN:
				_localctx = new DivLabelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(426);
				htmlLabelTag();
				}
				break;
			case ROUTER_OUTLET_TAG:
				_localctx = new DivRouterOutletLabelContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(427);
				routerOutletTag();
				}
				break;
			case STAR_NG_IF:
				_localctx = new DivNgIfLabelContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(428);
				ngIfDirective();
				}
				break;
			case STAR_NG_FOR:
				_localctx = new DivNgForLabelContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(429);
				ngForDirective();
				}
				break;
			case STRING:
				_localctx = new DivPlainTextLabelContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(430);
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
			setState(433);
			match(FORM_TAG_OPEN);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268731392L) != 0)) {
				{
				{
				setState(434);
				formAttribute();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			match(GT);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536938528L) != 0) || _la==STRING) {
				{
				{
				setState(441);
				formContent();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
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
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(ID);
				setState(450);
				match(EQ);
				setState(451);
				match(STRING);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(CLASS);
				setState(453);
				match(EQ);
				setState(454);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				match(STYLE);
				setState(456);
				match(EQ);
				setState(457);
				match(STRING);
				}
				break;
			case NG_SUBMIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				match(NG_SUBMIT);
				setState(459);
				match(EQ);
				setState(460);
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
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT_TAG_OPEN:
				_localctx = new FormInputLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				htmlInputTag();
				}
				break;
			case BUTTON_TAG_OPEN:
				_localctx = new FormButtonLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				htmlButtonTag();
				}
				break;
			case LABEL_TAG_OPEN:
				_localctx = new FormLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				htmlLabelTag();
				}
				break;
			case DIV_TAG_OPEN:
				_localctx = new FormDivLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				htmlDivTag();
				}
				break;
			case STRING:
				_localctx = new FormTextLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
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
	public static class HtmlSpanTagContext extends ParserRuleContext {
		public TerminalNode SPAN_TAG_OPEN() { return getToken(FrameParser.SPAN_TAG_OPEN, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public TerminalNode SPAN_TAG_CLOSE() { return getToken(FrameParser.SPAN_TAG_CLOSE, 0); }
		public List<SpanAttributeContext> spanAttribute() {
			return getRuleContexts(SpanAttributeContext.class);
		}
		public SpanAttributeContext spanAttribute(int i) {
			return getRuleContext(SpanAttributeContext.class,i);
		}
		public SpanContentContext spanContent() {
			return getRuleContext(SpanContentContext.class,0);
		}
		public HtmlSpanTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlSpanTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtmlSpanTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlSpanTagContext htmlSpanTag() throws RecognitionException {
		HtmlSpanTagContext _localctx = new HtmlSpanTagContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_htmlSpanTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(SPAN_TAG_OPEN);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE || _la==CLASS) {
				{
				{
				setState(471);
				spanAttribute();
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
			match(GT);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(478);
				spanContent();
				}
			}

			setState(481);
			match(SPAN_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpanAttributeContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(FrameParser.STYLE, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode CLASS() { return getToken(FrameParser.CLASS, 0); }
		public SpanAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spanAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitSpanAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpanAttributeContext spanAttribute() throws RecognitionException {
		SpanAttributeContext _localctx = new SpanAttributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_spanAttribute);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(STYLE);
				setState(484);
				match(EQ);
				setState(485);
				match(STRING);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(CLASS);
				setState(487);
				match(EQ);
				setState(488);
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
	public static class SpanContentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public SpanContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spanContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitSpanContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpanContentContext spanContent() throws RecognitionException {
		SpanContentContext _localctx = new SpanContentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_spanContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
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
	public static class HtmlAnchorTagContext extends ParserRuleContext {
		public TerminalNode A_TAG_OPEN() { return getToken(FrameParser.A_TAG_OPEN, 0); }
		public TerminalNode GT() { return getToken(FrameParser.GT, 0); }
		public TerminalNode A_TAG_CLOSE() { return getToken(FrameParser.A_TAG_CLOSE, 0); }
		public List<AnchorAttributeContext> anchorAttribute() {
			return getRuleContexts(AnchorAttributeContext.class);
		}
		public AnchorAttributeContext anchorAttribute(int i) {
			return getRuleContext(AnchorAttributeContext.class,i);
		}
		public AnchorContentContext anchorContent() {
			return getRuleContext(AnchorContentContext.class,0);
		}
		public HtmlAnchorTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAnchorTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitHtmlAnchorTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAnchorTagContext htmlAnchorTag() throws RecognitionException {
		HtmlAnchorTagContext _localctx = new HtmlAnchorTagContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_htmlAnchorTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(A_TAG_OPEN);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE || _la==CLASS || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 15L) != 0)) {
				{
				{
				setState(494);
				anchorAttribute();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
			match(GT);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(501);
				anchorContent();
				}
			}

			setState(504);
			match(A_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnchorAttributeContext extends ParserRuleContext {
		public TerminalNode HREF() { return getToken(FrameParser.HREF, 0); }
		public TerminalNode EQ() { return getToken(FrameParser.EQ, 0); }
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public TerminalNode TARGET() { return getToken(FrameParser.TARGET, 0); }
		public TerminalNode REL() { return getToken(FrameParser.REL, 0); }
		public TerminalNode STYLE() { return getToken(FrameParser.STYLE, 0); }
		public TerminalNode CLASS() { return getToken(FrameParser.CLASS, 0); }
		public TerminalNode ROUTER_LINK_BINDING() { return getToken(FrameParser.ROUTER_LINK_BINDING, 0); }
		public AnchorAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchorAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAnchorAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorAttributeContext anchorAttribute() throws RecognitionException {
		AnchorAttributeContext _localctx = new AnchorAttributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_anchorAttribute);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HREF:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(HREF);
				setState(507);
				match(EQ);
				setState(508);
				match(STRING);
				}
				break;
			case TARGET:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(TARGET);
				setState(510);
				match(EQ);
				setState(511);
				match(STRING);
				}
				break;
			case REL:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				match(REL);
				setState(513);
				match(EQ);
				setState(514);
				match(STRING);
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				match(STYLE);
				setState(516);
				match(EQ);
				setState(517);
				match(STRING);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(518);
				match(CLASS);
				setState(519);
				match(EQ);
				setState(520);
				match(STRING);
				}
				break;
			case ROUTER_LINK_BINDING:
				enterOuterAlt(_localctx, 6);
				{
				setState(521);
				match(ROUTER_LINK_BINDING);
				setState(522);
				match(EQ);
				setState(523);
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
	public static class AnchorContentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FrameParser.STRING, 0); }
		public AnchorContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchorContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FrameParserVisitor ) return ((FrameParserVisitor<? extends T>)visitor).visitAnchorContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorContentContext anchorContent() throws RecognitionException {
		AnchorContentContext _localctx = new AnchorContentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_anchorContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		enterRule(_localctx, 56, RULE_routerOutletTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		enterRule(_localctx, 58, RULE_ngIfDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(STAR_NG_IF);
			setState(531);
			match(EQ);
			setState(532);
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
		enterRule(_localctx, 60, RULE_ngForDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(STAR_NG_FOR);
			setState(535);
			match(EQ);
			setState(536);
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
		enterRule(_localctx, 62, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(AT_COMPONENT);
			setState(539);
			match(LPAREN);
			setState(540);
			componentBody();
			setState(541);
			match(RPAREN);
			setState(542);
			match(EXPORT);
			setState(543);
			match(CLASS);
			setState(544);
			match(IDENTITY);
			setState(545);
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
		enterRule(_localctx, 64, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(LBRACE);
			setState(548);
			componentProperty();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(549);
				match(COMMA);
				setState(550);
				componentProperty();
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
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
		enterRule(_localctx, 66, RULE_componentProperty);
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(SELECTOR);
				setState(559);
				match(COLON);
				setState(560);
				match(STRING);
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(TEMPLATE);
				setState(562);
				match(COLON);
				setState(563);
				match(STRING);
				}
				break;
			case STYLEURLS:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
				match(STYLEURLS);
				setState(565);
				match(COLON);
				setState(566);
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
		enterRule(_localctx, 68, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LBRACK);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 1008806316531256193L) != 0)) {
				{
				setState(570);
				expression(0);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(571);
					match(COMMA);
					setState(572);
					expression(0);
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(580);
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
		enterRule(_localctx, 70, RULE_classBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(LBRACE);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1099511635825L) != 0)) {
				{
				{
				setState(583);
				classMember();
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589);
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
		enterRule(_localctx, 72, RULE_classMember);
		try {
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case CONST:
			case VAR:
				_localctx = new ClassVariableLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				variableDeclaration();
				setState(592);
				match(SEMI);
				}
				break;
			case CONSTRUCTOR:
				_localctx = new ClassConstructorLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
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
				setState(595);
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
		enterRule(_localctx, 74, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(599);
			match(IDENTITY);
			setState(600);
			match(COLON);
			setState(601);
			type();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(602);
				match(EQ);
				setState(603);
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
		enterRule(_localctx, 76, RULE_type);
		int _la;
		try {
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(PRIMITIVE_TYPE);
				}
				break;
			case IDENTITY:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(IDENTITY);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(608);
					match(LBRACK);
					setState(609);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				{
				_localctx = new UnaryExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(615);
				unaryOp();
				setState(616);
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
				setState(618);
				literal();
				}
				break;
			case IDENTITY:
				{
				_localctx = new IdentifierExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(619);
				match(IDENTITY);
				}
				break;
			case LBRACE:
				{
				_localctx = new ObjectLiteralExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(620);
				objectLiteral();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(621);
				match(LPAREN);
				setState(622);
				expression(0);
				setState(623);
				match(RPAREN);
				}
				break;
			case THIS:
				{
				_localctx = new SelectExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(625);
				storeSelectExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(634);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionLabelContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(628);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(629);
						binaryOp();
						setState(630);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(632);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(633);
						arrayAccess();
						}
						break;
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 80, RULE_binaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
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
		enterRule(_localctx, 82, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
		enterRule(_localctx, 84, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 3377699720527873L) != 0)) ) {
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
		enterRule(_localctx, 86, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(LBRACK);
			setState(646);
			expression(0);
			setState(647);
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
		enterRule(_localctx, 88, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(LBRACE);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTITY) {
				{
				setState(650);
				objectProperty();
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(651);
					match(COMMA);
					setState(652);
					objectProperty();
					}
					}
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(660);
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
		enterRule(_localctx, 90, RULE_objectProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(IDENTITY);
			setState(663);
			match(COLON);
			setState(664);
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
		enterRule(_localctx, 92, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(CONSTRUCTOR);
			setState(667);
			match(LPAREN);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4294967303L) != 0)) {
				{
				setState(668);
				parameterList();
				}
			}

			setState(671);
			match(RPAREN);
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
		enterRule(_localctx, 94, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			parameter();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(675);
				match(COMMA);
				setState(676);
				parameter();
				}
				}
				setState(681);
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
		enterRule(_localctx, 96, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				setState(682);
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

			setState(685);
			match(IDENTITY);
			setState(686);
			match(COLON);
			setState(687);
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
		enterRule(_localctx, 98, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(LBRACE);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 549755814009L) != 0)) {
				{
				{
				setState(690);
				statement();
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
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
		enterRule(_localctx, 100, RULE_statement);
		try {
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new AssignmentStmtLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				assignmentStatement();
				}
				break;
			case 2:
				_localctx = new FunctionCallStmtLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				functionCallStatement();
				}
				break;
			case 3:
				_localctx = new VarDeclarationStmtLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				variableDeclaration();
				setState(701);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new ReturnStmtLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(703);
				returnStatement();
				}
				break;
			case 5:
				_localctx = new DispatchStmtLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(704);
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
		enterRule(_localctx, 102, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(707);
				match(THIS);
				setState(708);
				match(DOT);
				}
			}

			setState(711);
			match(IDENTITY);
			setState(712);
			match(EQ);
			setState(713);
			expression(0);
			setState(714);
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
		enterRule(_localctx, 104, RULE_functionCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(716);
				match(THIS);
				setState(717);
				match(DOT);
				}
			}

			setState(720);
			match(IDENTITY);
			setState(721);
			match(LPAREN);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 1008806316531256193L) != 0)) {
				{
				setState(722);
				argumentList();
				}
			}

			setState(725);
			match(RPAREN);
			setState(726);
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
		enterRule(_localctx, 106, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			expression(0);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(729);
				match(COMMA);
				setState(730);
				expression(0);
				}
				}
				setState(735);
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
		enterRule(_localctx, 108, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 15L) != 0)) {
				{
				{
				setState(736);
				methodModifier();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(742);
				match(ASYNC);
				}
			}

			setState(745);
			match(IDENTITY);
			setState(746);
			match(LPAREN);
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4294967303L) != 0)) {
				{
				setState(747);
				parameterList();
				}
			}

			setState(750);
			match(RPAREN);
			setState(751);
			match(COLON);
			setState(752);
			type();
			setState(753);
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
		enterRule(_localctx, 110, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
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
		enterRule(_localctx, 112, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(RETURN);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 1008806316531256193L) != 0)) {
				{
				setState(758);
				expression(0);
				}
			}

			setState(761);
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
		enterRule(_localctx, 114, RULE_serviceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(AT_INJECTABLE);
			setState(764);
			match(LPAREN);
			setState(765);
			injectableBody();
			setState(766);
			match(RPAREN);
			setState(767);
			match(EXPORT);
			setState(768);
			match(CLASS);
			setState(769);
			match(IDENTITY);
			setState(770);
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
		enterRule(_localctx, 116, RULE_injectableBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(LBRACE);
			setState(773);
			injectableProperty();
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(774);
				match(COMMA);
				setState(775);
				injectableProperty();
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(781);
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
		enterRule(_localctx, 118, RULE_injectableProperty);
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROVIDEDIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(PROVIDEDIN);
				setState(784);
				match(COLON);
				setState(785);
				match(STRING);
				}
				break;
			case USECLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				match(USECLASS);
				setState(787);
				match(COLON);
				setState(788);
				match(IDENTITY);
				}
				break;
			case USEVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(789);
				match(USEVALUE);
				setState(790);
				match(COLON);
				setState(791);
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
		enterRule(_localctx, 120, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(EXPORT);
			setState(795);
			match(CLASS);
			setState(796);
			match(IDENTITY);
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(797);
				match(EXTENDS);
				setState(798);
				match(IDENTITY);
				}
			}

			setState(801);
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
		enterRule(_localctx, 122, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(803);
				match(ASYNC);
				}
			}

			setState(806);
			match(FUNCTION);
			setState(807);
			match(IDENTITY);
			setState(808);
			match(LPAREN);
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4294967303L) != 0)) {
				{
				setState(809);
				parameterList();
				}
			}

			setState(812);
			match(RPAREN);
			setState(813);
			match(COLON);
			setState(814);
			type();
			setState(815);
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
		enterRule(_localctx, 124, RULE_arrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(LPAREN);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4294967303L) != 0)) {
				{
				setState(818);
				parameterList();
				}
			}

			setState(821);
			match(RPAREN);
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(822);
				match(COLON);
				setState(823);
				type();
				}
			}

			setState(826);
			match(ARROW);
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(827);
				block();
				}
				break;
			case 2:
				{
				setState(828);
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
		enterRule(_localctx, 126, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(EXPORT);
			setState(832);
			match(INTERFACE);
			setState(833);
			match(IDENTITY);
			setState(834);
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
		enterRule(_localctx, 128, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(LBRACE);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTITY) {
				{
				{
				setState(837);
				interfaceProperty();
				}
				}
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(843);
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
		enterRule(_localctx, 130, RULE_interfaceProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(IDENTITY);
			setState(846);
			match(COLON);
			setState(847);
			type();
			setState(848);
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
		enterRule(_localctx, 132, RULE_enumDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(EXPORT);
			setState(851);
			match(ENUM);
			setState(852);
			match(IDENTITY);
			setState(853);
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
		enterRule(_localctx, 134, RULE_enumBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(LBRACE);
			setState(856);
			enumMember();
			setState(861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(857);
					match(COMMA);
					setState(858);
					enumMember();
					}
					} 
				}
				setState(863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(864);
				match(COMMA);
				}
			}

			setState(867);
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
		enterRule(_localctx, 136, RULE_enumMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(IDENTITY);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(870);
				match(EQ);
				setState(871);
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
		enterRule(_localctx, 138, RULE_routingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(CONST);
			setState(875);
			match(IDENTITY);
			setState(876);
			match(COLON);
			setState(877);
			match(ROUTES);
			setState(878);
			match(EQ);
			setState(879);
			match(LBRACK);
			setState(880);
			routeConfig();
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(881);
				match(COMMA);
				setState(882);
				routeConfig();
				}
				}
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(888);
			match(RBRACK);
			setState(889);
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
		enterRule(_localctx, 140, RULE_routeConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(LBRACE);
			setState(892);
			pathProperty();
			setState(893);
			match(COMMA);
			setState(894);
			routeComponentProperty();
			setState(895);
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
		enterRule(_localctx, 142, RULE_pathProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(PATH);
			setState(898);
			match(COLON);
			setState(899);
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
		enterRule(_localctx, 144, RULE_routeComponentProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(COMPONENT);
			setState(902);
			match(COLON);
			setState(903);
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
		enterRule(_localctx, 146, RULE_ngrxActionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(EXPORT);
			setState(906);
			match(CONST);
			setState(907);
			match(IDENTITY);
			setState(908);
			match(EQ);
			setState(909);
			match(CREATEACTION);
			setState(910);
			match(LPAREN);
			setState(911);
			actionType();
			setState(912);
			match(RPAREN);
			setState(913);
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
		enterRule(_localctx, 148, RULE_actionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
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
		enterRule(_localctx, 150, RULE_storeDispatchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(THIS);
			setState(918);
			match(DOT);
			setState(919);
			match(STORE);
			setState(920);
			match(DOT);
			setState(921);
			match(DISPATCH);
			setState(922);
			match(LPAREN);
			setState(923);
			actionCall();
			setState(924);
			match(RPAREN);
			setState(925);
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
		enterRule(_localctx, 152, RULE_actionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(IDENTITY);
			setState(928);
			match(LPAREN);
			setState(929);
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
		enterRule(_localctx, 154, RULE_storeSelectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(THIS);
			setState(932);
			match(DOT);
			setState(933);
			match(STORE);
			setState(934);
			match(DOT);
			setState(935);
			match(SELECT);
			setState(936);
			match(LPAREN);
			setState(937);
			selectorCall();
			setState(938);
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
		enterRule(_localctx, 156, RULE_selectorCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
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
		enterRule(_localctx, 158, RULE_ngrxReducerDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(EXPORT);
			setState(943);
			match(CONST);
			setState(944);
			match(IDENTITY);
			setState(945);
			match(EQ);
			setState(946);
			match(CREATEREDUCER);
			setState(947);
			match(LPAREN);
			setState(948);
			reducerConfig();
			setState(949);
			match(RPAREN);
			setState(950);
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
		enterRule(_localctx, 160, RULE_reducerConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(IDENTITY);
			setState(953);
			match(COMMA);
			setState(955); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(954);
				onReducerBlock();
				}
				}
				setState(957); 
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
		enterRule(_localctx, 162, RULE_onReducerBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(COMMA);
			setState(960);
			match(ON);
			setState(961);
			match(LPAREN);
			setState(962);
			match(IDENTITY);
			setState(963);
			match(COMMA);
			setState(964);
			match(ARROW);
			setState(965);
			block();
			setState(966);
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
		case 39:
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
		"\u0004\u0001c\u03c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"P\u0007P\u0002Q\u0007Q\u0001\u0000\u0005\u0000\u00a6\b\u0000\n\u0000\f"+
		"\u0000\u00a9\t\u0000\u0001\u0000\u0005\u0000\u00ac\b\u0000\n\u0000\f\u0000"+
		"\u00af\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00bd\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00ca\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u00ce\b\u0003\n\u0003\f\u0003\u00d1\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00de\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00e2\b\u0005\n\u0005\f\u0005\u00e5\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00e9\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0106\b\u0006\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0005\b\u010c\b\b\n\b\f\b\u010f\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u012b\b\t\u0001\n\u0001\n\u0005"+
		"\n\u012f\b\n\n\n\f\n\u0132\t\n\u0001\n\u0001\n\u0003\n\u0136\b\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0152\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u0158\b\f\u0001\r\u0001\r\u0005\r\u015c\b\r\n\r\f\r\u015f\t\r"+
		"\u0001\r\u0001\r\u0005\r\u0163\b\r\n\r\f\r\u0166\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0173\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0178\b\u000f\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u017c\b\u0010\n\u0010\f\u0010\u017f\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0183\b\u0010\n\u0010\f\u0010\u0186\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u01a2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01b0\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u01b4\b\u0013\n\u0013\f\u0013\u01b7\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u01bb\b\u0013\n\u0013\f\u0013\u01be\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u01ce\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d5\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u01d9\b\u0016\n\u0016\f\u0016\u01dc\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01e0\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u01ea\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u01f0\b\u0019\n\u0019\f\u0019\u01f3\t\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01f7\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u020d\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u0228"+
		"\b \n \f \u022b\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u0238\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u023e\b\"\n\"\f\"\u0241\t\"\u0003\"\u0243\b\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0005#\u0249\b#\n#\f#\u024c\t#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u0255\b$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u025d\b%\u0001&\u0001&\u0001&\u0001&\u0003&\u0263\b&\u0003"+
		"&\u0265\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0273\b\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0005\'\u027b\b\'\n\'\f\'\u027e\t\'\u0001("+
		"\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u028e\b,\n,\f,\u0291\t,\u0003,\u0293\b,"+
		"\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0003"+
		".\u029e\b.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0005/\u02a6\b/\n"+
		"/\f/\u02a9\t/\u00010\u00030\u02ac\b0\u00010\u00010\u00010\u00010\u0001"+
		"1\u00011\u00051\u02b4\b1\n1\f1\u02b7\t1\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00032\u02c2\b2\u00013\u00013\u00033\u02c6"+
		"\b3\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00034\u02cf\b4\u0001"+
		"4\u00014\u00014\u00034\u02d4\b4\u00014\u00014\u00014\u00015\u00015\u0001"+
		"5\u00055\u02dc\b5\n5\f5\u02df\t5\u00016\u00056\u02e2\b6\n6\f6\u02e5\t"+
		"6\u00016\u00036\u02e8\b6\u00016\u00016\u00016\u00036\u02ed\b6\u00016\u0001"+
		"6\u00016\u00016\u00016\u00017\u00017\u00018\u00018\u00038\u02f8\b8\u0001"+
		"8\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0005:\u0309\b:\n:\f:\u030c\t:\u0001:\u0001"+
		":\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003"+
		";\u0319\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u0320\b<\u0001<\u0001"+
		"<\u0001=\u0003=\u0325\b=\u0001=\u0001=\u0001=\u0001=\u0003=\u032b\b=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0003>\u0334\b>\u0001>\u0001"+
		">\u0001>\u0003>\u0339\b>\u0001>\u0001>\u0001>\u0003>\u033e\b>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001@\u0001@\u0005@\u0347\b@\n@\f@\u034a\t@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001C\u0005C\u035c\bC\nC\fC\u035f\tC\u0001"+
		"C\u0003C\u0362\bC\u0001C\u0001C\u0001D\u0001D\u0001D\u0003D\u0369\bD\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0005E\u0374"+
		"\bE\nE\fE\u0377\tE\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0004"+
		"P\u03bc\bP\u000bP\fP\u03bd\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0000\u0001NR\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u0000"+
		"\u0006\u0001\u0000<>\u0001\u0000&-\u0002\u0000\'\'..\u0002\u0000//ab\u0001"+
		"\u0000@B\u0001\u0000@C\u040c\u0000\u00a7\u0001\u0000\u0000\u0000\u0002"+
		"\u00bc\u0001\u0000\u0000\u0000\u0004\u00c9\u0001\u0000\u0000\u0000\u0006"+
		"\u00cb\u0001\u0000\u0000\u0000\b\u00dd\u0001\u0000\u0000\u0000\n\u00df"+
		"\u0001\u0000\u0000\u0000\f\u0105\u0001\u0000\u0000\u0000\u000e\u0107\u0001"+
		"\u0000\u0000\u0000\u0010\u0109\u0001\u0000\u0000\u0000\u0012\u012a\u0001"+
		"\u0000\u0000\u0000\u0014\u012c\u0001\u0000\u0000\u0000\u0016\u0151\u0001"+
		"\u0000\u0000\u0000\u0018\u0157\u0001\u0000\u0000\u0000\u001a\u0159\u0001"+
		"\u0000\u0000\u0000\u001c\u0172\u0001\u0000\u0000\u0000\u001e\u0177\u0001"+
		"\u0000\u0000\u0000 \u0179\u0001\u0000\u0000\u0000\"\u01a1\u0001\u0000"+
		"\u0000\u0000$\u01af\u0001\u0000\u0000\u0000&\u01b1\u0001\u0000\u0000\u0000"+
		"(\u01cd\u0001\u0000\u0000\u0000*\u01d4\u0001\u0000\u0000\u0000,\u01d6"+
		"\u0001\u0000\u0000\u0000.\u01e9\u0001\u0000\u0000\u00000\u01eb\u0001\u0000"+
		"\u0000\u00002\u01ed\u0001\u0000\u0000\u00004\u020c\u0001\u0000\u0000\u0000"+
		"6\u020e\u0001\u0000\u0000\u00008\u0210\u0001\u0000\u0000\u0000:\u0212"+
		"\u0001\u0000\u0000\u0000<\u0216\u0001\u0000\u0000\u0000>\u021a\u0001\u0000"+
		"\u0000\u0000@\u0223\u0001\u0000\u0000\u0000B\u0237\u0001\u0000\u0000\u0000"+
		"D\u0239\u0001\u0000\u0000\u0000F\u0246\u0001\u0000\u0000\u0000H\u0254"+
		"\u0001\u0000\u0000\u0000J\u0256\u0001\u0000\u0000\u0000L\u0264\u0001\u0000"+
		"\u0000\u0000N\u0272\u0001\u0000\u0000\u0000P\u027f\u0001\u0000\u0000\u0000"+
		"R\u0281\u0001\u0000\u0000\u0000T\u0283\u0001\u0000\u0000\u0000V\u0285"+
		"\u0001\u0000\u0000\u0000X\u0289\u0001\u0000\u0000\u0000Z\u0296\u0001\u0000"+
		"\u0000\u0000\\\u029a\u0001\u0000\u0000\u0000^\u02a2\u0001\u0000\u0000"+
		"\u0000`\u02ab\u0001\u0000\u0000\u0000b\u02b1\u0001\u0000\u0000\u0000d"+
		"\u02c1\u0001\u0000\u0000\u0000f\u02c5\u0001\u0000\u0000\u0000h\u02ce\u0001"+
		"\u0000\u0000\u0000j\u02d8\u0001\u0000\u0000\u0000l\u02e3\u0001\u0000\u0000"+
		"\u0000n\u02f3\u0001\u0000\u0000\u0000p\u02f5\u0001\u0000\u0000\u0000r"+
		"\u02fb\u0001\u0000\u0000\u0000t\u0304\u0001\u0000\u0000\u0000v\u0318\u0001"+
		"\u0000\u0000\u0000x\u031a\u0001\u0000\u0000\u0000z\u0324\u0001\u0000\u0000"+
		"\u0000|\u0331\u0001\u0000\u0000\u0000~\u033f\u0001\u0000\u0000\u0000\u0080"+
		"\u0344\u0001\u0000\u0000\u0000\u0082\u034d\u0001\u0000\u0000\u0000\u0084"+
		"\u0352\u0001\u0000\u0000\u0000\u0086\u0357\u0001\u0000\u0000\u0000\u0088"+
		"\u0365\u0001\u0000\u0000\u0000\u008a\u036a\u0001\u0000\u0000\u0000\u008c"+
		"\u037b\u0001\u0000\u0000\u0000\u008e\u0381\u0001\u0000\u0000\u0000\u0090"+
		"\u0385\u0001\u0000\u0000\u0000\u0092\u0389\u0001\u0000\u0000\u0000\u0094"+
		"\u0393\u0001\u0000\u0000\u0000\u0096\u0395\u0001\u0000\u0000\u0000\u0098"+
		"\u039f\u0001\u0000\u0000\u0000\u009a\u03a3\u0001\u0000\u0000\u0000\u009c"+
		"\u03ac\u0001\u0000\u0000\u0000\u009e\u03ae\u0001\u0000\u0000\u0000\u00a0"+
		"\u03b8\u0001\u0000\u0000\u0000\u00a2\u03bf\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a6\u0003\u0002\u0001\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ad\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ac\u0003\u0004\u0002\u0000\u00ab"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0000\u0000\u0001\u00b1\u0001\u0001\u0000\u0000\u0000\u00b2"+
		"\u00bd\u0003 \u0010\u0000\u00b3\u00bd\u0003&\u0013\u0000\u00b4\u00bd\u0003"+
		"\u0014\n\u0000\u00b5\u00bd\u0003\n\u0005\u0000\u00b6\u00bd\u0003\u0010"+
		"\b\u0000\u00b7\u00bd\u0003\u0006\u0003\u0000\u00b8\u00bd\u0003\u001a\r"+
		"\u0000\u00b9\u00bd\u0003,\u0016\u0000\u00ba\u00bd\u00032\u0019\u0000\u00bb"+
		"\u00bd\u00038\u001c\u0000\u00bc\u00b2\u0001\u0000\u0000\u0000\u00bc\u00b3"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc\u00b5"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00b7"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u0003\u0001\u0000\u0000\u0000\u00be\u00ca"+
		"\u0003>\u001f\u0000\u00bf\u00ca\u0003r9\u0000\u00c0\u00ca\u0003x<\u0000"+
		"\u00c1\u00ca\u0003z=\u0000\u00c2\u00ca\u0003|>\u0000\u00c3\u00ca\u0003"+
		"J%\u0000\u00c4\u00ca\u0003~?\u0000\u00c5\u00ca\u0003\u0084B\u0000\u00c6"+
		"\u00ca\u0003\u008aE\u0000\u00c7\u00ca\u0003\u0092I\u0000\u00c8\u00ca\u0003"+
		"\u009eO\u0000\u00c9\u00be\u0001\u0000\u0000\u0000\u00c9\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c0\u0001\u0000\u0000\u0000\u00c9\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c2\u0001\u0000\u0000\u0000\u00c9\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c4\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u0005\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cf\u0005\u0001\u0000\u0000\u00cc\u00ce\u0003\b\u0004"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005\u0002\u0000\u0000\u00d3\u0007\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005\u0003\u0000\u0000\u00d5\u00d6\u0005_\u0000\u0000"+
		"\u00d6\u00de\u0005a\u0000\u0000\u00d7\u00d8\u0005\u0004\u0000\u0000\u00d8"+
		"\u00d9\u0005_\u0000\u0000\u00d9\u00de\u0005a\u0000\u0000\u00da\u00db\u0005"+
		"\n\u0000\u0000\u00db\u00dc\u0005_\u0000\u0000\u00dc\u00de\u0005a\u0000"+
		"\u0000\u00dd\u00d4\u0001\u0000\u0000\u0000\u00dd\u00d7\u0001\u0000\u0000"+
		"\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00de\t\u0001\u0000\u0000\u0000"+
		"\u00df\u00e3\u0005\u0005\u0000\u0000\u00e0\u00e2\u0003\f\u0006\u0000\u00e1"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0005*\u0000\u0000\u00e7\u00e9\u0003\u000e\u0007\u0000\u00e8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0006\u0000\u0000\u00eb\u000b"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0007\u0000\u0000\u00ed\u00ee"+
		"\u0005_\u0000\u0000\u00ee\u0106\u0005a\u0000\u0000\u00ef\u0106\u0005\b"+
		"\u0000\u0000\u00f0\u00f1\u0005\t\u0000\u0000\u00f1\u00f2\u0005_\u0000"+
		"\u0000\u00f2\u0106\u0005a\u0000\u0000\u00f3\u00f4\u0005\n\u0000\u0000"+
		"\u00f4\u00f5\u0005_\u0000\u0000\u00f5\u0106\u0005a\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0016\u0000\u0000\u00f7\u00f8\u0005_\u0000\u0000\u00f8\u0106\u0005"+
		"a\u0000\u0000\u00f9\u00fa\u0005\u0017\u0000\u0000\u00fa\u00fb\u0005_\u0000"+
		"\u0000\u00fb\u0106\u0005a\u0000\u0000\u00fc\u00fd\u0005\t\u0000\u0000"+
		"\u00fd\u00fe\u0005_\u0000\u0000\u00fe\u0106\u0005a\u0000\u0000\u00ff\u0100"+
		"\u0005\u0018\u0000\u0000\u0100\u0101\u0005_\u0000\u0000\u0101\u0106\u0005"+
		"a\u0000\u0000\u0102\u0103\u0005\u0019\u0000\u0000\u0103\u0104\u0005_\u0000"+
		"\u0000\u0104\u0106\u0005a\u0000\u0000\u0105\u00ec\u0001\u0000\u0000\u0000"+
		"\u0105\u00ef\u0001\u0000\u0000\u0000\u0105\u00f0\u0001\u0000\u0000\u0000"+
		"\u0105\u00f3\u0001\u0000\u0000\u0000\u0105\u00f6\u0001\u0000\u0000\u0000"+
		"\u0105\u00f9\u0001\u0000\u0000\u0000\u0105\u00fc\u0001\u0000\u0000\u0000"+
		"\u0105\u00ff\u0001\u0000\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000"+
		"\u0106\r\u0001\u0000\u0000\u0000\u0107\u0108\u0005a\u0000\u0000\u0108"+
		"\u000f\u0001\u0000\u0000\u0000\u0109\u010d\u0005\u000b\u0000\u0000\u010a"+
		"\u010c\u0003\u0012\t\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010f"+
		"\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0002\u0000\u0000\u0111\u0011"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0007\u0000\u0000\u0113\u0114"+
		"\u0005_\u0000\u0000\u0114\u012b\u0005a\u0000\u0000\u0115\u0116\u0005\f"+
		"\u0000\u0000\u0116\u0117\u0005_\u0000\u0000\u0117\u012b\u0005a\u0000\u0000"+
		"\u0118\u0119\u0005\n\u0000\u0000\u0119\u011a\u0005_\u0000\u0000\u011a"+
		"\u012b\u0005a\u0000\u0000\u011b\u011c\u0005\r\u0000\u0000\u011c\u011d"+
		"\u0005_\u0000\u0000\u011d\u012b\u0005a\u0000\u0000\u011e\u011f\u0005\u000e"+
		"\u0000\u0000\u011f\u0120\u0005_\u0000\u0000\u0120\u012b\u0005a\u0000\u0000"+
		"\u0121\u0122\u0005\u000f\u0000\u0000\u0122\u0123\u0005_\u0000\u0000\u0123"+
		"\u012b\u0005a\u0000\u0000\u0124\u0125\u0005\u0018\u0000\u0000\u0125\u0126"+
		"\u0005_\u0000\u0000\u0126\u012b\u0005a\u0000\u0000\u0127\u0128\u0005\u0019"+
		"\u0000\u0000\u0128\u0129\u0005_\u0000\u0000\u0129\u012b\u0005a\u0000\u0000"+
		"\u012a\u0112\u0001\u0000\u0000\u0000\u012a\u0115\u0001\u0000\u0000\u0000"+
		"\u012a\u0118\u0001\u0000\u0000\u0000\u012a\u011b\u0001\u0000\u0000\u0000"+
		"\u012a\u011e\u0001\u0000\u0000\u0000\u012a\u0121\u0001\u0000\u0000\u0000"+
		"\u012a\u0124\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000\u0000\u0000"+
		"\u012b\u0013\u0001\u0000\u0000\u0000\u012c\u0130\u0005\u0013\u0000\u0000"+
		"\u012d\u012f\u0003\u0016\u000b\u0000\u012e\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000"+
		"\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0135\u0005*\u0000\u0000\u0134"+
		"\u0136\u0003\u0018\f\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0005\u0014\u0000\u0000\u0138\u0015\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005\u000f\u0000\u0000\u013a\u013b\u0005_\u0000\u0000\u013b\u0152\u0005"+
		"a\u0000\u0000\u013c\u013d\u0005\u0012\u0000\u0000\u013d\u013e\u0005_\u0000"+
		"\u0000\u013e\u0152\u0005a\u0000\u0000\u013f\u0140\u0005\n\u0000\u0000"+
		"\u0140\u0141\u0005_\u0000\u0000\u0141\u0152\u0005a\u0000\u0000\u0142\u0143"+
		"\u0005\u0016\u0000\u0000\u0143\u0144\u0005_\u0000\u0000\u0144\u0152\u0005"+
		"a\u0000\u0000\u0145\u0146\u0005\u0017\u0000\u0000\u0146\u0147\u0005_\u0000"+
		"\u0000\u0147\u0152\u0005a\u0000\u0000\u0148\u0149\u0005\t\u0000\u0000"+
		"\u0149\u014a\u0005_\u0000\u0000\u014a\u0152\u0005a\u0000\u0000\u014b\u014c"+
		"\u0005\u0018\u0000\u0000\u014c\u014d\u0005_\u0000\u0000\u014d\u0152\u0005"+
		"a\u0000\u0000\u014e\u014f\u0005\u0019\u0000\u0000\u014f\u0150\u0005_\u0000"+
		"\u0000\u0150\u0152\u0005a\u0000\u0000\u0151\u0139\u0001\u0000\u0000\u0000"+
		"\u0151\u013c\u0001\u0000\u0000\u0000\u0151\u013f\u0001\u0000\u0000\u0000"+
		"\u0151\u0142\u0001\u0000\u0000\u0000\u0151\u0145\u0001\u0000\u0000\u0000"+
		"\u0151\u0148\u0001\u0000\u0000\u0000\u0151\u014b\u0001\u0000\u0000\u0000"+
		"\u0151\u014e\u0001\u0000\u0000\u0000\u0152\u0017\u0001\u0000\u0000\u0000"+
		"\u0153\u0158\u0005a\u0000\u0000\u0154\u0158\u0003\u0006\u0003\u0000\u0155"+
		"\u0158\u0003\n\u0005\u0000\u0156\u0158\u0003\u0010\b\u0000\u0157\u0153"+
		"\u0001\u0000\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157\u0155"+
		"\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158\u0019"+
		"\u0001\u0000\u0000\u0000\u0159\u015d\u0005\u001d\u0000\u0000\u015a\u015c"+
		"\u0003\u001c\u000e\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015f"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015d"+
		"\u0001\u0000\u0000\u0000\u0160\u0164\u0005*\u0000\u0000\u0161\u0163\u0003"+
		"\u001e\u000f\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0166\u0001"+
		"\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001"+
		"\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u0164\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0005\u001e\u0000\u0000\u0168\u001b\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0005\u001f\u0000\u0000\u016a\u016b\u0005"+
		"_\u0000\u0000\u016b\u0173\u0005a\u0000\u0000\u016c\u016d\u0005\n\u0000"+
		"\u0000\u016d\u016e\u0005_\u0000\u0000\u016e\u0173\u0005a\u0000\u0000\u016f"+
		"\u0170\u0005\u0012\u0000\u0000\u0170\u0171\u0005_\u0000\u0000\u0171\u0173"+
		"\u0005a\u0000\u0000\u0172\u0169\u0001\u0000\u0000\u0000\u0172\u016c\u0001"+
		"\u0000\u0000\u0000\u0172\u016f\u0001\u0000\u0000\u0000\u0173\u001d\u0001"+
		"\u0000\u0000\u0000\u0174\u0178\u0005a\u0000\u0000\u0175\u0178\u0003,\u0016"+
		"\u0000\u0176\u0178\u0003\u0010\b\u0000\u0177\u0174\u0001\u0000\u0000\u0000"+
		"\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000"+
		"\u0178\u001f\u0001\u0000\u0000\u0000\u0179\u017d\u0005\u0010\u0000\u0000"+
		"\u017a\u017c\u0003\"\u0011\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c"+
		"\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0001\u0000\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f"+
		"\u017d\u0001\u0000\u0000\u0000\u0180\u0184\u0005*\u0000\u0000\u0181\u0183"+
		"\u0003$\u0012\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0186\u0001"+
		"\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001"+
		"\u0000\u0000\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0184\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0005\u0011\u0000\u0000\u0188!\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0005\u000f\u0000\u0000\u018a\u018b\u0005_\u0000"+
		"\u0000\u018b\u01a2\u0005a\u0000\u0000\u018c\u018d\u0005\u0012\u0000\u0000"+
		"\u018d\u018e\u0005_\u0000\u0000\u018e\u01a2\u0005a\u0000\u0000\u018f\u0190"+
		"\u0005\n\u0000\u0000\u0190\u0191\u0005_\u0000\u0000\u0191\u01a2\u0005"+
		"a\u0000\u0000\u0192\u0193\u0005\u0016\u0000\u0000\u0193\u0194\u0005_\u0000"+
		"\u0000\u0194\u01a2\u0005a\u0000\u0000\u0195\u0196\u0005\u0017\u0000\u0000"+
		"\u0196\u0197\u0005_\u0000\u0000\u0197\u01a2\u0005a\u0000\u0000\u0198\u0199"+
		"\u0005\t\u0000\u0000\u0199\u019a\u0005_\u0000\u0000\u019a\u01a2\u0005"+
		"a\u0000\u0000\u019b\u019c\u0005\u0018\u0000\u0000\u019c\u019d\u0005_\u0000"+
		"\u0000\u019d\u01a2\u0005a\u0000\u0000\u019e\u019f\u0005\u0019\u0000\u0000"+
		"\u019f\u01a0\u0005_\u0000\u0000\u01a0\u01a2\u0005a\u0000\u0000\u01a1\u0189"+
		"\u0001\u0000\u0000\u0000\u01a1\u018c\u0001\u0000\u0000\u0000\u01a1\u018f"+
		"\u0001\u0000\u0000\u0000\u01a1\u0192\u0001\u0000\u0000\u0000\u01a1\u0195"+
		"\u0001\u0000\u0000\u0000\u01a1\u0198\u0001\u0000\u0000\u0000\u01a1\u019b"+
		"\u0001\u0000\u0000\u0000\u01a1\u019e\u0001\u0000\u0000\u0000\u01a2#\u0001"+
		"\u0000\u0000\u0000\u01a3\u01b0\u0003\u0006\u0003\u0000\u01a4\u01b0\u0003"+
		"\n\u0005\u0000\u01a5\u01b0\u0003\u0010\b\u0000\u01a6\u01b0\u0003\u0014"+
		"\n\u0000\u01a7\u01b0\u0003 \u0010\u0000\u01a8\u01b0\u0003,\u0016\u0000"+
		"\u01a9\u01b0\u00032\u0019\u0000\u01aa\u01b0\u0003\u001a\r\u0000\u01ab"+
		"\u01b0\u00038\u001c\u0000\u01ac\u01b0\u0003:\u001d\u0000\u01ad\u01b0\u0003"+
		"<\u001e\u0000\u01ae\u01b0\u0005a\u0000\u0000\u01af\u01a3\u0001\u0000\u0000"+
		"\u0000\u01af\u01a4\u0001\u0000\u0000\u0000\u01af\u01a5\u0001\u0000\u0000"+
		"\u0000\u01af\u01a6\u0001\u0000\u0000\u0000\u01af\u01a7\u0001\u0000\u0000"+
		"\u0000\u01af\u01a8\u0001\u0000\u0000\u0000\u01af\u01a9\u0001\u0000\u0000"+
		"\u0000\u01af\u01aa\u0001\u0000\u0000\u0000\u01af\u01ab\u0001\u0000\u0000"+
		"\u0000\u01af\u01ac\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000"+
		"\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0%\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b5\u0005\u001a\u0000\u0000\u01b2\u01b4\u0003(\u0014\u0000\u01b3"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8"+
		"\u01bc\u0005*\u0000\u0000\u01b9\u01bb\u0003*\u0015\u0000\u01ba\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bf\u0001"+
		"\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"\u001b\u0000\u0000\u01c0\'\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005\u000f"+
		"\u0000\u0000\u01c2\u01c3\u0005_\u0000\u0000\u01c3\u01ce\u0005a\u0000\u0000"+
		"\u01c4\u01c5\u0005\u0012\u0000\u0000\u01c5\u01c6\u0005_\u0000\u0000\u01c6"+
		"\u01ce\u0005a\u0000\u0000\u01c7\u01c8\u0005\n\u0000\u0000\u01c8\u01c9"+
		"\u0005_\u0000\u0000\u01c9\u01ce\u0005a\u0000\u0000\u01ca\u01cb\u0005\u001c"+
		"\u0000\u0000\u01cb\u01cc\u0005_\u0000\u0000\u01cc\u01ce\u0005a\u0000\u0000"+
		"\u01cd\u01c1\u0001\u0000\u0000\u0000\u01cd\u01c4\u0001\u0000\u0000\u0000"+
		"\u01cd\u01c7\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ce)\u0001\u0000\u0000\u0000\u01cf\u01d5\u0003\u0010\b\u0000\u01d0"+
		"\u01d5\u0003\n\u0005\u0000\u01d1\u01d5\u0003\u001a\r\u0000\u01d2\u01d5"+
		"\u0003 \u0010\u0000\u01d3\u01d5\u0005a\u0000\u0000\u01d4\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d0\u0001\u0000\u0000\u0000\u01d4\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d5+\u0001\u0000\u0000\u0000\u01d6\u01da\u0005E\u0000\u0000"+
		"\u01d7\u01d9\u0003.\u0017\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9"+
		"\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0001\u0000\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc"+
		"\u01da\u0001\u0000\u0000\u0000\u01dd\u01df\u0005*\u0000\u0000\u01de\u01e0"+
		"\u00030\u0018\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005"+
		"F\u0000\u0000\u01e2-\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\n\u0000"+
		"\u0000\u01e4\u01e5\u0005_\u0000\u0000\u01e5\u01ea\u0005a\u0000\u0000\u01e6"+
		"\u01e7\u0005\u0012\u0000\u0000\u01e7\u01e8\u0005_\u0000\u0000\u01e8\u01ea"+
		"\u0005a\u0000\u0000\u01e9\u01e3\u0001\u0000\u0000\u0000\u01e9\u01e6\u0001"+
		"\u0000\u0000\u0000\u01ea/\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005a\u0000"+
		"\u0000\u01ec1\u0001\u0000\u0000\u0000\u01ed\u01f1\u0005G\u0000\u0000\u01ee"+
		"\u01f0\u00034\u001a\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f6\u0005*\u0000\u0000\u01f5\u01f7\u0003"+
		"6\u001b\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005H\u0000"+
		"\u0000\u01f93\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005I\u0000\u0000\u01fb"+
		"\u01fc\u0005_\u0000\u0000\u01fc\u020d\u0005a\u0000\u0000\u01fd\u01fe\u0005"+
		"J\u0000\u0000\u01fe\u01ff\u0005_\u0000\u0000\u01ff\u020d\u0005a\u0000"+
		"\u0000\u0200\u0201\u0005K\u0000\u0000\u0201\u0202\u0005_\u0000\u0000\u0202"+
		"\u020d\u0005a\u0000\u0000\u0203\u0204\u0005\n\u0000\u0000\u0204\u0205"+
		"\u0005_\u0000\u0000\u0205\u020d\u0005a\u0000\u0000\u0206\u0207\u0005\u0012"+
		"\u0000\u0000\u0207\u0208\u0005_\u0000\u0000\u0208\u020d\u0005a\u0000\u0000"+
		"\u0209\u020a\u0005L\u0000\u0000\u020a\u020b\u0005_\u0000\u0000\u020b\u020d"+
		"\u0005a\u0000\u0000\u020c\u01fa\u0001\u0000\u0000\u0000\u020c\u01fd\u0001"+
		"\u0000\u0000\u0000\u020c\u0200\u0001\u0000\u0000\u0000\u020c\u0203\u0001"+
		"\u0000\u0000\u0000\u020c\u0206\u0001\u0000\u0000\u0000\u020c\u0209\u0001"+
		"\u0000\u0000\u0000\u020d5\u0001\u0000\u0000\u0000\u020e\u020f\u0005a\u0000"+
		"\u0000\u020f7\u0001\u0000\u0000\u0000\u0210\u0211\u0005\u0015\u0000\u0000"+
		"\u02119\u0001\u0000\u0000\u0000\u0212\u0213\u0005\u0016\u0000\u0000\u0213"+
		"\u0214\u0005_\u0000\u0000\u0214\u0215\u0005a\u0000\u0000\u0215;\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0005\u0017\u0000\u0000\u0217\u0218\u0005"+
		"_\u0000\u0000\u0218\u0219\u0005a\u0000\u0000\u0219=\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0005 \u0000\u0000\u021b\u021c\u00052\u0000\u0000\u021c"+
		"\u021d\u0003@ \u0000\u021d\u021e\u00053\u0000\u0000\u021e\u021f\u0005"+
		"$\u0000\u0000\u021f\u0220\u0005\u0012\u0000\u0000\u0220\u0221\u0005`\u0000"+
		"\u0000\u0221\u0222\u0003F#\u0000\u0222?\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\u00050\u0000\u0000\u0224\u0229\u0003B!\u0000\u0225\u0226\u0005"+
		"5\u0000\u0000\u0226\u0228\u0003B!\u0000\u0227\u0225\u0001\u0000\u0000"+
		"\u0000\u0228\u022b\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000"+
		"\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022c\u0001\u0000\u0000"+
		"\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022c\u022d\u00051\u0000\u0000"+
		"\u022dA\u0001\u0000\u0000\u0000\u022e\u022f\u0005!\u0000\u0000\u022f\u0230"+
		"\u00054\u0000\u0000\u0230\u0238\u0005a\u0000\u0000\u0231\u0232\u0005\""+
		"\u0000\u0000\u0232\u0233\u00054\u0000\u0000\u0233\u0238\u0005a\u0000\u0000"+
		"\u0234\u0235\u0005#\u0000\u0000\u0235\u0236\u00054\u0000\u0000\u0236\u0238"+
		"\u0003D\"\u0000\u0237\u022e\u0001\u0000\u0000\u0000\u0237\u0231\u0001"+
		"\u0000\u0000\u0000\u0237\u0234\u0001\u0000\u0000\u0000\u0238C\u0001\u0000"+
		"\u0000\u0000\u0239\u0242\u00056\u0000\u0000\u023a\u023f\u0003N\'\u0000"+
		"\u023b\u023c\u00055\u0000\u0000\u023c\u023e\u0003N\'\u0000\u023d\u023b"+
		"\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000\u0000\u023f\u023d"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0243"+
		"\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0242\u023a"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244"+
		"\u0001\u0000\u0000\u0000\u0244\u0245\u00057\u0000\u0000\u0245E\u0001\u0000"+
		"\u0000\u0000\u0246\u024a\u00050\u0000\u0000\u0247\u0249\u0003H$\u0000"+
		"\u0248\u0247\u0001\u0000\u0000\u0000\u0249\u024c\u0001\u0000\u0000\u0000"+
		"\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000"+
		"\u024b\u024d\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000"+
		"\u024d\u024e\u00051\u0000\u0000\u024eG\u0001\u0000\u0000\u0000\u024f\u0250"+
		"\u0003J%\u0000\u0250\u0251\u0005;\u0000\u0000\u0251\u0255\u0001\u0000"+
		"\u0000\u0000\u0252\u0255\u0003\\.\u0000\u0253\u0255\u0003l6\u0000\u0254"+
		"\u024f\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0254"+
		"\u0253\u0001\u0000\u0000\u0000\u0255I\u0001\u0000\u0000\u0000\u0256\u0257"+
		"\u0007\u0000\u0000\u0000\u0257\u0258\u0005`\u0000\u0000\u0258\u0259\u0005"+
		"4\u0000\u0000\u0259\u025c\u0003L&\u0000\u025a\u025b\u0005_\u0000\u0000"+
		"\u025b\u025d\u0003N\'\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0001\u0000\u0000\u0000\u025dK\u0001\u0000\u0000\u0000\u025e\u0265"+
		"\u0005%\u0000\u0000\u025f\u0262\u0005`\u0000\u0000\u0260\u0261\u00056"+
		"\u0000\u0000\u0261\u0263\u00057\u0000\u0000\u0262\u0260\u0001\u0000\u0000"+
		"\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0001\u0000\u0000"+
		"\u0000\u0264\u025e\u0001\u0000\u0000\u0000\u0264\u025f\u0001\u0000\u0000"+
		"\u0000\u0265M\u0001\u0000\u0000\u0000\u0266\u0267\u0006\'\uffff\uffff"+
		"\u0000\u0267\u0268\u0003R)\u0000\u0268\u0269\u0003N\'\u0007\u0269\u0273"+
		"\u0001\u0000\u0000\u0000\u026a\u0273\u0003T*\u0000\u026b\u0273\u0005`"+
		"\u0000\u0000\u026c\u0273\u0003X,\u0000\u026d\u026e\u00052\u0000\u0000"+
		"\u026e\u026f\u0003N\'\u0000\u026f\u0270\u00053\u0000\u0000\u0270\u0273"+
		"\u0001\u0000\u0000\u0000\u0271\u0273\u0003\u009aM\u0000\u0272\u0266\u0001"+
		"\u0000\u0000\u0000\u0272\u026a\u0001\u0000\u0000\u0000\u0272\u026b\u0001"+
		"\u0000\u0000\u0000\u0272\u026c\u0001\u0000\u0000\u0000\u0272\u026d\u0001"+
		"\u0000\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u027c\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\n\b\u0000\u0000\u0275\u0276\u0003P(\u0000"+
		"\u0276\u0277\u0003N\'\t\u0277\u027b\u0001\u0000\u0000\u0000\u0278\u0279"+
		"\n\u0005\u0000\u0000\u0279\u027b\u0003V+\u0000\u027a\u0274\u0001\u0000"+
		"\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027b\u027e\u0001\u0000"+
		"\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000"+
		"\u0000\u0000\u027dO\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000"+
		"\u0000\u027f\u0280\u0007\u0001\u0000\u0000\u0280Q\u0001\u0000\u0000\u0000"+
		"\u0281\u0282\u0007\u0002\u0000\u0000\u0282S\u0001\u0000\u0000\u0000\u0283"+
		"\u0284\u0007\u0003\u0000\u0000\u0284U\u0001\u0000\u0000\u0000\u0285\u0286"+
		"\u00056\u0000\u0000\u0286\u0287\u0003N\'\u0000\u0287\u0288\u00057\u0000"+
		"\u0000\u0288W\u0001\u0000\u0000\u0000\u0289\u0292\u00050\u0000\u0000\u028a"+
		"\u028f\u0003Z-\u0000\u028b\u028c\u00055\u0000\u0000\u028c\u028e\u0003"+
		"Z-\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000"+
		"\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000"+
		"\u0000\u0290\u0293\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000"+
		"\u0000\u0292\u028a\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000"+
		"\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u00051\u0000\u0000"+
		"\u0295Y\u0001\u0000\u0000\u0000\u0296\u0297\u0005`\u0000\u0000\u0297\u0298"+
		"\u00054\u0000\u0000\u0298\u0299\u0003N\'\u0000\u0299[\u0001\u0000\u0000"+
		"\u0000\u029a\u029b\u00058\u0000\u0000\u029b\u029d\u00052\u0000\u0000\u029c"+
		"\u029e\u0003^/\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029d\u029e\u0001"+
		"\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0\u0005"+
		"3\u0000\u0000\u02a0\u02a1\u0003b1\u0000\u02a1]\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a7\u0003`0\u0000\u02a3\u02a4\u00055\u0000\u0000\u02a4\u02a6"+
		"\u0003`0\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000"+
		"\u0000\u0000\u02a8_\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ac\u0007\u0004\u0000\u0000\u02ab\u02aa\u0001\u0000\u0000"+
		"\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000"+
		"\u0000\u02ad\u02ae\u0005`\u0000\u0000\u02ae\u02af\u00054\u0000\u0000\u02af"+
		"\u02b0\u0003L&\u0000\u02b0a\u0001\u0000\u0000\u0000\u02b1\u02b5\u0005"+
		"0\u0000\u0000\u02b2\u02b4\u0003d2\u0000\u02b3\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b7\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b8\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8\u02b9\u00051\u0000\u0000"+
		"\u02b9c\u0001\u0000\u0000\u0000\u02ba\u02c2\u0003f3\u0000\u02bb\u02c2"+
		"\u0003h4\u0000\u02bc\u02bd\u0003J%\u0000\u02bd\u02be\u0005;\u0000\u0000"+
		"\u02be\u02c2\u0001\u0000\u0000\u0000\u02bf\u02c2\u0003p8\u0000\u02c0\u02c2"+
		"\u0003\u0096K\u0000\u02c1\u02ba\u0001\u0000\u0000\u0000\u02c1\u02bb\u0001"+
		"\u0000\u0000\u0000\u02c1\u02bc\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2e\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\u00059\u0000\u0000\u02c4\u02c6\u0005:\u0000\u0000"+
		"\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005`\u0000\u0000\u02c8"+
		"\u02c9\u0005_\u0000\u0000\u02c9\u02ca\u0003N\'\u0000\u02ca\u02cb\u0005"+
		";\u0000\u0000\u02cbg\u0001\u0000\u0000\u0000\u02cc\u02cd\u00059\u0000"+
		"\u0000\u02cd\u02cf\u0005:\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d1\u0005`\u0000\u0000\u02d1\u02d3\u00052\u0000\u0000\u02d2\u02d4"+
		"\u0003j5\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d6\u00053\u0000"+
		"\u0000\u02d6\u02d7\u0005;\u0000\u0000\u02d7i\u0001\u0000\u0000\u0000\u02d8"+
		"\u02dd\u0003N\'\u0000\u02d9\u02da\u00055\u0000\u0000\u02da\u02dc\u0003"+
		"N\'\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02dc\u02df\u0001\u0000"+
		"\u0000\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000"+
		"\u0000\u0000\u02dek\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e2\u0003n7\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e7\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e8\u0005D\u0000\u0000\u02e7\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005`\u0000\u0000\u02ea\u02ec\u0005"+
		"2\u0000\u0000\u02eb\u02ed\u0003^/\u0000\u02ec\u02eb\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\u00053\u0000\u0000\u02ef\u02f0\u00054\u0000\u0000\u02f0"+
		"\u02f1\u0003L&\u0000\u02f1\u02f2\u0003b1\u0000\u02f2m\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f4\u0007\u0005\u0000\u0000\u02f4o\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f7\u0005?\u0000\u0000\u02f6\u02f8\u0003N\'\u0000\u02f7\u02f6"+
		"\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02f9"+
		"\u0001\u0000\u0000\u0000\u02f9\u02fa\u0005;\u0000\u0000\u02faq\u0001\u0000"+
		"\u0000\u0000\u02fb\u02fc\u0005M\u0000\u0000\u02fc\u02fd\u00052\u0000\u0000"+
		"\u02fd\u02fe\u0003t:\u0000\u02fe\u02ff\u00053\u0000\u0000\u02ff\u0300"+
		"\u0005$\u0000\u0000\u0300\u0301\u0005\u0012\u0000\u0000\u0301\u0302\u0005"+
		"`\u0000\u0000\u0302\u0303\u0003F#\u0000\u0303s\u0001\u0000\u0000\u0000"+
		"\u0304\u0305\u00050\u0000\u0000\u0305\u030a\u0003v;\u0000\u0306\u0307"+
		"\u00055\u0000\u0000\u0307\u0309\u0003v;\u0000\u0308\u0306\u0001\u0000"+
		"\u0000\u0000\u0309\u030c\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000"+
		"\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u030d\u0001\u0000"+
		"\u0000\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030d\u030e\u00051\u0000"+
		"\u0000\u030eu\u0001\u0000\u0000\u0000\u030f\u0310\u0005N\u0000\u0000\u0310"+
		"\u0311\u00054\u0000\u0000\u0311\u0319\u0005a\u0000\u0000\u0312\u0313\u0005"+
		"O\u0000\u0000\u0313\u0314\u00054\u0000\u0000\u0314\u0319\u0005`\u0000"+
		"\u0000\u0315\u0316\u0005P\u0000\u0000\u0316\u0317\u00054\u0000\u0000\u0317"+
		"\u0319\u0003N\'\u0000\u0318\u030f\u0001\u0000\u0000\u0000\u0318\u0312"+
		"\u0001\u0000\u0000\u0000\u0318\u0315\u0001\u0000\u0000\u0000\u0319w\u0001"+
		"\u0000\u0000\u0000\u031a\u031b\u0005$\u0000\u0000\u031b\u031c\u0005\u0012"+
		"\u0000\u0000\u031c\u031f\u0005`\u0000\u0000\u031d\u031e\u0005Q\u0000\u0000"+
		"\u031e\u0320\u0005`\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f"+
		"\u0320\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321"+
		"\u0322\u0003F#\u0000\u0322y\u0001\u0000\u0000\u0000\u0323\u0325\u0005"+
		"D\u0000\u0000\u0324\u0323\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000"+
		"\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326\u0327\u0005R\u0000"+
		"\u0000\u0327\u0328\u0005`\u0000\u0000\u0328\u032a\u00052\u0000\u0000\u0329"+
		"\u032b\u0003^/\u0000\u032a\u0329\u0001\u0000\u0000\u0000\u032a\u032b\u0001"+
		"\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u032d\u0005"+
		"3\u0000\u0000\u032d\u032e\u00054\u0000\u0000\u032e\u032f\u0003L&\u0000"+
		"\u032f\u0330\u0003b1\u0000\u0330{\u0001\u0000\u0000\u0000\u0331\u0333"+
		"\u00052\u0000\u0000\u0332\u0334\u0003^/\u0000\u0333\u0332\u0001\u0000"+
		"\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000"+
		"\u0000\u0000\u0335\u0338\u00053\u0000\u0000\u0336\u0337\u00054\u0000\u0000"+
		"\u0337\u0339\u0003L&\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0338\u0339"+
		"\u0001\u0000\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u033d"+
		"\u0005S\u0000\u0000\u033b\u033e\u0003b1\u0000\u033c\u033e\u0003N\'\u0000"+
		"\u033d\u033b\u0001\u0000\u0000\u0000\u033d\u033c\u0001\u0000\u0000\u0000"+
		"\u033e}\u0001\u0000\u0000\u0000\u033f\u0340\u0005$\u0000\u0000\u0340\u0341"+
		"\u0005T\u0000\u0000\u0341\u0342\u0005`\u0000\u0000\u0342\u0343\u0003\u0080"+
		"@\u0000\u0343\u007f\u0001\u0000\u0000\u0000\u0344\u0348\u00050\u0000\u0000"+
		"\u0345\u0347\u0003\u0082A\u0000\u0346\u0345\u0001\u0000\u0000\u0000\u0347"+
		"\u034a\u0001\u0000\u0000\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0348"+
		"\u0349\u0001\u0000\u0000\u0000\u0349\u034b\u0001\u0000\u0000\u0000\u034a"+
		"\u0348\u0001\u0000\u0000\u0000\u034b\u034c\u00051\u0000\u0000\u034c\u0081"+
		"\u0001\u0000\u0000\u0000\u034d\u034e\u0005`\u0000\u0000\u034e\u034f\u0005"+
		"4\u0000\u0000\u034f\u0350\u0003L&\u0000\u0350\u0351\u0005;\u0000\u0000"+
		"\u0351\u0083\u0001\u0000\u0000\u0000\u0352\u0353\u0005$\u0000\u0000\u0353"+
		"\u0354\u0005U\u0000\u0000\u0354\u0355\u0005`\u0000\u0000\u0355\u0356\u0003"+
		"\u0086C\u0000\u0356\u0085\u0001\u0000\u0000\u0000\u0357\u0358\u00050\u0000"+
		"\u0000\u0358\u035d\u0003\u0088D\u0000\u0359\u035a\u00055\u0000\u0000\u035a"+
		"\u035c\u0003\u0088D\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035c\u035f"+
		"\u0001\u0000\u0000\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035d\u035e"+
		"\u0001\u0000\u0000\u0000\u035e\u0361\u0001\u0000\u0000\u0000\u035f\u035d"+
		"\u0001\u0000\u0000\u0000\u0360\u0362\u00055\u0000\u0000\u0361\u0360\u0001"+
		"\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0363\u0001"+
		"\u0000\u0000\u0000\u0363\u0364\u00051\u0000\u0000\u0364\u0087\u0001\u0000"+
		"\u0000\u0000\u0365\u0368\u0005`\u0000\u0000\u0366\u0367\u0005_\u0000\u0000"+
		"\u0367\u0369\u0003N\'\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0368"+
		"\u0369\u0001\u0000\u0000\u0000\u0369\u0089\u0001\u0000\u0000\u0000\u036a"+
		"\u036b\u0005=\u0000\u0000\u036b\u036c\u0005`\u0000\u0000\u036c\u036d\u0005"+
		"4\u0000\u0000\u036d\u036e\u0005W\u0000\u0000\u036e\u036f\u0005_\u0000"+
		"\u0000\u036f\u0370\u00056\u0000\u0000\u0370\u0375\u0003\u008cF\u0000\u0371"+
		"\u0372\u00055\u0000\u0000\u0372\u0374\u0003\u008cF\u0000\u0373\u0371\u0001"+
		"\u0000\u0000\u0000\u0374\u0377\u0001\u0000\u0000\u0000\u0375\u0373\u0001"+
		"\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0378\u0001"+
		"\u0000\u0000\u0000\u0377\u0375\u0001\u0000\u0000\u0000\u0378\u0379\u0005"+
		"7\u0000\u0000\u0379\u037a\u0005;\u0000\u0000\u037a\u008b\u0001\u0000\u0000"+
		"\u0000\u037b\u037c\u00050\u0000\u0000\u037c\u037d\u0003\u008eG\u0000\u037d"+
		"\u037e\u00055\u0000\u0000\u037e\u037f\u0003\u0090H\u0000\u037f\u0380\u0005"+
		"1\u0000\u0000\u0380\u008d\u0001\u0000\u0000\u0000\u0381\u0382\u0005X\u0000"+
		"\u0000\u0382\u0383\u00054\u0000\u0000\u0383\u0384\u0005a\u0000\u0000\u0384"+
		"\u008f\u0001\u0000\u0000\u0000\u0385\u0386\u0005Y\u0000\u0000\u0386\u0387"+
		"\u00054\u0000\u0000\u0387\u0388\u0005`\u0000\u0000\u0388\u0091\u0001\u0000"+
		"\u0000\u0000\u0389\u038a\u0005$\u0000\u0000\u038a\u038b\u0005=\u0000\u0000"+
		"\u038b\u038c\u0005`\u0000\u0000\u038c\u038d\u0005_\u0000\u0000\u038d\u038e"+
		"\u0005Z\u0000\u0000\u038e\u038f\u00052\u0000\u0000\u038f\u0390\u0003\u0094"+
		"J\u0000\u0390\u0391\u00053\u0000\u0000\u0391\u0392\u0005;\u0000\u0000"+
		"\u0392\u0093\u0001\u0000\u0000\u0000\u0393\u0394\u0005a\u0000\u0000\u0394"+
		"\u0095\u0001\u0000\u0000\u0000\u0395\u0396\u00059\u0000\u0000\u0396\u0397"+
		"\u0005:\u0000\u0000\u0397\u0398\u0005[\u0000\u0000\u0398\u0399\u0005:"+
		"\u0000\u0000\u0399\u039a\u0005\\\u0000\u0000\u039a\u039b\u00052\u0000"+
		"\u0000\u039b\u039c\u0003\u0098L\u0000\u039c\u039d\u00053\u0000\u0000\u039d"+
		"\u039e\u0005;\u0000\u0000\u039e\u0097\u0001\u0000\u0000\u0000\u039f\u03a0"+
		"\u0005`\u0000\u0000\u03a0\u03a1\u00052\u0000\u0000\u03a1\u03a2\u00053"+
		"\u0000\u0000\u03a2\u0099\u0001\u0000\u0000\u0000\u03a3\u03a4\u00059\u0000"+
		"\u0000\u03a4\u03a5\u0005:\u0000\u0000\u03a5\u03a6\u0005[\u0000\u0000\u03a6"+
		"\u03a7\u0005:\u0000\u0000\u03a7\u03a8\u0005V\u0000\u0000\u03a8\u03a9\u0005"+
		"2\u0000\u0000\u03a9\u03aa\u0003\u009cN\u0000\u03aa\u03ab\u00053\u0000"+
		"\u0000\u03ab\u009b\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005`\u0000\u0000"+
		"\u03ad\u009d\u0001\u0000\u0000\u0000\u03ae\u03af\u0005$\u0000\u0000\u03af"+
		"\u03b0\u0005=\u0000\u0000\u03b0\u03b1\u0005`\u0000\u0000\u03b1\u03b2\u0005"+
		"_\u0000\u0000\u03b2\u03b3\u0005]\u0000\u0000\u03b3\u03b4\u00052\u0000"+
		"\u0000\u03b4\u03b5\u0003\u00a0P\u0000\u03b5\u03b6\u00053\u0000\u0000\u03b6"+
		"\u03b7\u0005;\u0000\u0000\u03b7\u009f\u0001\u0000\u0000\u0000\u03b8\u03b9"+
		"\u0005`\u0000\u0000\u03b9\u03bb\u00055\u0000\u0000\u03ba\u03bc\u0003\u00a2"+
		"Q\u0000\u03bb\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000"+
		"\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000"+
		"\u0000\u03be\u00a1\u0001\u0000\u0000\u0000\u03bf\u03c0\u00055\u0000\u0000"+
		"\u03c0\u03c1\u0005^\u0000\u0000\u03c1\u03c2\u00052\u0000\u0000\u03c2\u03c3"+
		"\u0005`\u0000\u0000\u03c3\u03c4\u00055\u0000\u0000\u03c4\u03c5\u0005S"+
		"\u0000\u0000\u03c5\u03c6\u0003b1\u0000\u03c6\u03c7\u00053\u0000\u0000"+
		"\u03c7\u00a3\u0001\u0000\u0000\u0000J\u00a7\u00ad\u00bc\u00c9\u00cf\u00dd"+
		"\u00e3\u00e8\u0105\u010d\u012a\u0130\u0135\u0151\u0157\u015d\u0164\u0172"+
		"\u0177\u017d\u0184\u01a1\u01af\u01b5\u01bc\u01cd\u01d4\u01da\u01df\u01e9"+
		"\u01f1\u01f6\u020c\u0229\u0237\u023f\u0242\u024a\u0254\u025c\u0262\u0264"+
		"\u0272\u027a\u027c\u028f\u0292\u029d\u02a7\u02ab\u02b5\u02c1\u02c5\u02ce"+
		"\u02d3\u02dd\u02e3\u02e7\u02ec\u02f7\u030a\u0318\u031f\u0324\u032a\u0333"+
		"\u0338\u033d\u0348\u035d\u0361\u0368\u0375\u03bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}