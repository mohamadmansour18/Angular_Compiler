// Generated from C:/Users/LEGION/Desktop/angular_compiler-master/FrameParser.g4 by ANTLR 4.13.2
package Parser;
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
	 * Visit a parse tree produced by the {@code ImportStatement1}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement1(FrameParser.ImportStatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassStatement1}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement1(FrameParser.ClassStatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentStatement1}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStatement1(FrameParser.ComponentStatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(FrameParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorStatement}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorStatement(FrameParser.ConstructorStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclareStatement1}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclareStatement1(FrameParser.VarDeclareStatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAliasStatement1}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasStatement1(FrameParser.TypeAliasStatement1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStatement1}
	 * labeled alternative in {@link FrameParser#stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement1(FrameParser.ExprStatement1Context ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(FrameParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#classStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement(FrameParser.ClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(FrameParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(FrameParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(FrameParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#routesPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutesPropertyDeclaration(FrameParser.RoutesPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#normalPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalPropertyDeclaration(FrameParser.NormalPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#componentDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecorator(FrameParser.ComponentDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#componentOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentOptions(FrameParser.ComponentOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#selectorProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProperty(FrameParser.SelectorPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#standaloneProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneProperty(FrameParser.StandalonePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#importsProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProperty(FrameParser.ImportsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#templateProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateProperty(FrameParser.TemplatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(FrameParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#constructorParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParamList(FrameParser.ConstructorParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#constructorParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParam(FrameParser.ConstructorParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(FrameParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(FrameParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(FrameParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FrameParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#blockContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockContent(FrameParser.BlockContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#statementInBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementInBlock(FrameParser.StatementInBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FrameParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FrameParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#varDeclareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclareStatement(FrameParser.VarDeclareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(FrameParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#generalTypeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralTypeAnnotation(FrameParser.GeneralTypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#typeAliasStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasStatement(FrameParser.TypeAliasStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(FrameParser.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#objectTypeMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeMembers(FrameParser.ObjectTypeMembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#objectTypeMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeMember(FrameParser.ObjectTypeMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#typeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRef(FrameParser.TypeRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#exprStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(FrameParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FrameParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#assignmentExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(FrameParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(FrameParser.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#conditionalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(FrameParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#nullishExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullishExpr(FrameParser.NullishExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#logicalOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(FrameParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#logicalAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(FrameParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(FrameParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#relationalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(FrameParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(FrameParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(FrameParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(FrameParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#asExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsExpression(FrameParser.AsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(FrameParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#signalGenericCallPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalGenericCallPrimary(FrameParser.SignalGenericCallPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#signalGenericArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalGenericArgs(FrameParser.SignalGenericArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#signalGenericArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalGenericArg(FrameParser.SignalGenericArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(FrameParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(FrameParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#importCallPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportCallPrimary(FrameParser.ImportCallPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(FrameParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#paramListSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamListSimple(FrameParser.ParamListSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(FrameParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(FrameParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(FrameParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(FrameParser.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(FrameParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLDivLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLDivLabel(FrameParser.HTMLDivLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLFormLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLFormLabel(FrameParser.HTMLFormLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLParagraphLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLParagraphLabel(FrameParser.HTMLParagraphLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLButtonLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLButtonLabel(FrameParser.HTMLButtonLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLInputLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLInputLabel(FrameParser.HTMLInputLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLImageLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLImageLabel(FrameParser.HTMLImageLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLLabel(FrameParser.HTMLLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLSpanLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLSpanLabel(FrameParser.HTMLSpanLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLAnchorLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLAnchorLabel(FrameParser.HTMLAnchorLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HTMLRouterOutletLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLRouterOutletLabel(FrameParser.HTMLRouterOutletLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#htmlImageTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlImageTag(FrameParser.HtmlImageTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#imgAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgAttribute(FrameParser.ImgAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#htmlButtonTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlButtonTag(FrameParser.HtmlButtonTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#buttonAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonAttribute(FrameParser.ButtonAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#buttonContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonContent(FrameParser.ButtonContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#htmlInputTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlInputTag(FrameParser.HtmlInputTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#inputAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputAttribute(FrameParser.InputAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#htmlParagraphTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlParagraphTag(FrameParser.HtmlParagraphTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#paragraphAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphAttribute(FrameParser.ParagraphAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParagraphImageLabel}
	 * labeled alternative in {@link FrameParser#paragraphContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphImageLabel(FrameParser.ParagraphImageLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParagraphButtonLabel}
	 * labeled alternative in {@link FrameParser#paragraphContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphButtonLabel(FrameParser.ParagraphButtonLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParagraphInputLabel}
	 * labeled alternative in {@link FrameParser#paragraphContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphInputLabel(FrameParser.ParagraphInputLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParagraphPolationLabel}
	 * labeled alternative in {@link FrameParser#paragraphContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphPolationLabel(FrameParser.ParagraphPolationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParagraphTextLabel}
	 * labeled alternative in {@link FrameParser#paragraphContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphTextLabel(FrameParser.ParagraphTextLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#htmlLabelTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlLabelTag(FrameParser.HtmlLabelTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#labelAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelAttribute(FrameParser.LabelAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#labelContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelContent(FrameParser.LabelContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#htmlDivTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDivTag(FrameParser.HtmlDivTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#divAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivAttribute(FrameParser.DivAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivImageLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivImageLabel(FrameParser.DivImageLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivButtonLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivButtonLabel(FrameParser.DivButtonLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivInputLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivInputLabel(FrameParser.DivInputLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivParagraphLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivParagraphLabel(FrameParser.DivParagraphLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivNestedLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivNestedLabel(FrameParser.DivNestedLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivSpanLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivSpanLabel(FrameParser.DivSpanLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivAnchorLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivAnchorLabel(FrameParser.DivAnchorLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivLabel(FrameParser.DivLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivRouterOutletLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivRouterOutletLabel(FrameParser.DivRouterOutletLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivNgIfLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivNgIfLabel(FrameParser.DivNgIfLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivNgForLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivNgForLabel(FrameParser.DivNgForLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivInterpolationLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivInterpolationLabel(FrameParser.DivInterpolationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivPlainTextLabel}
	 * labeled alternative in {@link FrameParser#divContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivPlainTextLabel(FrameParser.DivPlainTextLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#htmlFormTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlFormTag(FrameParser.HtmlFormTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#formAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormAttribute(FrameParser.FormAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormInputLabel}
	 * labeled alternative in {@link FrameParser#formContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormInputLabel(FrameParser.FormInputLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormButtonLabel}
	 * labeled alternative in {@link FrameParser#formContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormButtonLabel(FrameParser.FormButtonLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormLabel}
	 * labeled alternative in {@link FrameParser#formContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormLabel(FrameParser.FormLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormDivLabel}
	 * labeled alternative in {@link FrameParser#formContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormDivLabel(FrameParser.FormDivLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormTextLabel}
	 * labeled alternative in {@link FrameParser#formContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormTextLabel(FrameParser.FormTextLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#htmlSpanTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSpanTag(FrameParser.HtmlSpanTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#spanAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanAttribute(FrameParser.SpanAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#spanContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanContent(FrameParser.SpanContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#htmlAnchorTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAnchorTag(FrameParser.HtmlAnchorTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#anchorAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchorAttribute(FrameParser.AnchorAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#anchorContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchorContent(FrameParser.AnchorContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#routerOutletTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouterOutletTag(FrameParser.RouterOutletTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#ngIfDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfDirective(FrameParser.NgIfDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#ngForDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForDirective(FrameParser.NgForDirectiveContext ctx);
}