package gen;// Generated from C:/Users/LENOVO/Music/2/TypeScriptCompiler/Main.FrameParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FrameParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FrameParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FrameParser#rootprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootprogram(FrameParser.RootprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FrameParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(FrameParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServicesStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServicesStatement(FrameParser.ServicesStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStatement(FrameParser.ComponentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(FrameParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclareStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclareStatement(FrameParser.VarDeclareStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(FrameParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFunctionStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunctionStatement(FrameParser.CallFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccessStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessStatement(FrameParser.AccessStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDeclareStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclareStatement(FrameParser.TypeDeclareStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumStatement(FrameParser.EnumStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceStatement(FrameParser.InterfaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement(FrameParser.ClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationsStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationsStatement(FrameParser.OperationsStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(FrameParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateStatement(FrameParser.TemplateStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FrameParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(FrameParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixStatement(FrameParser.PrefixStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(FrameParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(FrameParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#services}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServices(FrameParser.ServicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#import_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_rule(FrameParser.Import_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(FrameParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(FrameParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(FrameParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#classbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbody(FrameParser.ClassbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(FrameParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface(FrameParser.InterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#interfacebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacebody(FrameParser.InterfacebodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#interfacefun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacefun(FrameParser.InterfacefunContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#interfacevar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacevar(FrameParser.InterfacevarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(FrameParser.EnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#enumassignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumassignable(FrameParser.EnumassignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#enumAssin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumAssin(FrameParser.EnumAssinContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#number_STRING_BOOLEAN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_STRING_BOOLEAN(FrameParser.Number_STRING_BOOLEANContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#class_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_function(FrameParser.Class_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FrameParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#body_with_out_curly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_with_out_curly(FrameParser.Body_with_out_curlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FrameParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#basedata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasedata(FrameParser.BasedataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link FrameParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FrameParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Objectss}
	 * labeled alternative in {@link FrameParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectss(FrameParser.ObjectssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link FrameParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(FrameParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Accesss}
	 * labeled alternative in {@link FrameParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesss(FrameParser.AccesssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arrays}
	 * labeled alternative in {@link FrameParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrays(FrameParser.ArraysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AngularTemplet}
	 * labeled alternative in {@link FrameParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularTemplet(FrameParser.AngularTempletContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuitAngulat}
	 * labeled alternative in {@link FrameParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuitAngulat(FrameParser.QuitAngulatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(FrameParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(FrameParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#typeequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeequal(FrameParser.TypeequalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(FrameParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#typedeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedeclare(FrameParser.TypedeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#prameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrameters(FrameParser.PrametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(FrameParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#arrowfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowfunction(FrameParser.ArrowfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(FrameParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#prameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrameter(FrameParser.PrameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(FrameParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(FrameParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#vardeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclare(FrameParser.VardeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(FrameParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(FrameParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#equalbasedata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualbasedata(FrameParser.EqualbasedataContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(FrameParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FrameParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess(FrameParser.AccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#culls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCulls(FrameParser.CullsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#cullfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCullfunction(FrameParser.CullfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#objects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjects(FrameParser.ObjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(FrameParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#objectstype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectstype(FrameParser.ObjectstypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#objecttype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjecttype(FrameParser.ObjecttypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#typecurles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypecurles(FrameParser.TypecurlesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#typecurle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypecurle(FrameParser.TypecurleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(FrameParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(FrameParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Characters}
	 * labeled alternative in {@link FrameParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacters(FrameParser.CharactersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Texts}
	 * labeled alternative in {@link FrameParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexts(FrameParser.TextsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Html}
	 * labeled alternative in {@link FrameParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(FrameParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AngularComponents}
	 * labeled alternative in {@link FrameParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularComponents(FrameParser.AngularComponentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Directive}
	 * labeled alternative in {@link FrameParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(FrameParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#elementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementContent(FrameParser.ElementContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(FrameParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(FrameParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#tagOpenEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagOpenEmpty(FrameParser.TagOpenEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#tagOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagOpen(FrameParser.TagOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#tagClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagClose(FrameParser.TagCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(FrameParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#angularComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularComponent(FrameParser.AngularComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Structural}
	 * labeled alternative in {@link FrameParser#directiveElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructural(FrameParser.StructuralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attributes}
	 * labeled alternative in {@link FrameParser#directiveElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(FrameParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoWay}
	 * labeled alternative in {@link FrameParser#directiveElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWay(FrameParser.TwoWayContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#structuralDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuralDirective(FrameParser.StructuralDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#attributeDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDirective(FrameParser.AttributeDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#twoWayDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWayDirective(FrameParser.TwoWayDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FrameParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(FrameParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(FrameParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(FrameParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(FrameParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(FrameParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(FrameParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(FrameParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(FrameParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#pipeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeExpression(FrameParser.PipeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExpression(FrameParser.BaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FrameParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FrameParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(FrameParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(FrameParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#propLitiral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropLitiral(FrameParser.PropLitiralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(FrameParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(FrameParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(FrameParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(FrameParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(FrameParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(FrameParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#loop_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_init(FrameParser.Loop_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#loop_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_step(FrameParser.Loop_stepContext ctx);
}