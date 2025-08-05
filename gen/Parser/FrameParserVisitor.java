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
	 * Visit a parse tree produced by {@link FrameParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(FrameParser.RootContext ctx);
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
	 * Visit a parse tree produced by the {@code HTMLRouterOutletLabel}
	 * labeled alternative in {@link FrameParser#htmlSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHTMLRouterOutletLabel(FrameParser.HTMLRouterOutletLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSComponentLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSComponentLabel(FrameParser.TSComponentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSServiceLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSServiceLabel(FrameParser.TSServiceLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSClassLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSClassLabel(FrameParser.TSClassLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSFunctionLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSFunctionLabel(FrameParser.TSFunctionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSArrowFunctionLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSArrowFunctionLabel(FrameParser.TSArrowFunctionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSVariableLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSVariableLabel(FrameParser.TSVariableLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSInterfaceLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSInterfaceLabel(FrameParser.TSInterfaceLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSEnumLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSEnumLabel(FrameParser.TSEnumLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSRoutingLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSRoutingLabel(FrameParser.TSRoutingLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSActionLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSActionLabel(FrameParser.TSActionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TSReducerLabel}
	 * labeled alternative in {@link FrameParser#tsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTSReducerLabel(FrameParser.TSReducerLabelContext ctx);
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
	 * Visit a parse tree produced by the {@code ParagraphTextLabel}
	 * labeled alternative in {@link FrameParser#paragraphContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraphTextLabel(FrameParser.ParagraphTextLabelContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link FrameParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(FrameParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBody(FrameParser.ComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentProperty(FrameParser.ComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(FrameParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(FrameParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassVariableLabel}
	 * labeled alternative in {@link FrameParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVariableLabel(FrameParser.ClassVariableLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassConstructorLabel}
	 * labeled alternative in {@link FrameParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstructorLabel(FrameParser.ClassConstructorLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassMethodLabel}
	 * labeled alternative in {@link FrameParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodLabel(FrameParser.ClassMethodLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(FrameParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FrameParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpressionLabel}
	 * labeled alternative in {@link FrameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionLabel(FrameParser.UnaryExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpressionLabel}
	 * labeled alternative in {@link FrameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpressionLabel(FrameParser.LiteralExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpressionLabel}
	 * labeled alternative in {@link FrameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpressionLabel(FrameParser.IdentifierExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpressionLabel}
	 * labeled alternative in {@link FrameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpressionLabel(FrameParser.ParenExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpressionLabel}
	 * labeled alternative in {@link FrameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionLabel(FrameParser.BinaryExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectExpressionLabel}
	 * labeled alternative in {@link FrameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpressionLabel(FrameParser.SelectExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessExpression}
	 * labeled alternative in {@link FrameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(FrameParser.ArrayAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpressionLabel}
	 * labeled alternative in {@link FrameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpressionLabel(FrameParser.ObjectLiteralExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(FrameParser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(FrameParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FrameParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(FrameParser.ArrayAccessContext ctx);
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
	 * Visit a parse tree produced by {@link FrameParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(FrameParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(FrameParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(FrameParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FrameParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStmtLabel}
	 * labeled alternative in {@link FrameParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmtLabel(FrameParser.AssignmentStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStmtLabel}
	 * labeled alternative in {@link FrameParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStmtLabel(FrameParser.FunctionCallStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationStmtLabel}
	 * labeled alternative in {@link FrameParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationStmtLabel(FrameParser.VarDeclarationStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmtLabel}
	 * labeled alternative in {@link FrameParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmtLabel(FrameParser.ReturnStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DispatchStmtLabel}
	 * labeled alternative in {@link FrameParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispatchStmtLabel(FrameParser.DispatchStmtLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(FrameParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(FrameParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(FrameParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(FrameParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(FrameParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FrameParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#serviceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDeclaration(FrameParser.ServiceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#injectableBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableBody(FrameParser.InjectableBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#injectableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableProperty(FrameParser.InjectablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(FrameParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(FrameParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(FrameParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(FrameParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(FrameParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#interfaceProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceProperty(FrameParser.InterfacePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(FrameParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(FrameParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#enumMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumMember(FrameParser.EnumMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#routingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutingDeclaration(FrameParser.RoutingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#routeConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteConfig(FrameParser.RouteConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#pathProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathProperty(FrameParser.PathPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#routeComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteComponentProperty(FrameParser.RouteComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#ngrxActionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgrxActionDeclaration(FrameParser.NgrxActionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionType(FrameParser.ActionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#storeDispatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreDispatchStatement(FrameParser.StoreDispatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#actionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionCall(FrameParser.ActionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#storeSelectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreSelectExpression(FrameParser.StoreSelectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#selectorCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorCall(FrameParser.SelectorCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#ngrxReducerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgrxReducerDeclaration(FrameParser.NgrxReducerDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#reducerConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReducerConfig(FrameParser.ReducerConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link FrameParser#onReducerBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnReducerBlock(FrameParser.OnReducerBlockContext ctx);
}