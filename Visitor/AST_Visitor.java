package Visitor;


import Ast_Class.HTML_Classes.*;
import Ast_Class.TS_Classes.*;

public interface AST_Visitor {
    void visit(RootProgram root);
    void visit(HTMLDivLabel div);
    void visit(DivAttribute attribute);
    void visit(ImgAttribute attribute);
    void visit(DivImageLabel image);
    void visit(ButtonAttribute attribute);
    void visit(ButtonContent content);
    void visit(DivButtonLabel button);
    void visit(InputAttribute attribute);
    void visit(DivInputLabel input);
    void visit(ParagraphAttribute attribute);
    void visit(ParagraphTextLabel text);
    void visit(DivParagraphLabel paragraph);
    void visit(ParagraphImageLabel image);
    void visit(ParagraphButtonLabel button);
    void visit(ParagraphInputLabel input);
    void visit(DivNestedLabel nestedDiv);
    void visit(DivRouterOutletLabel outlet);
    void visit(DivNgIfLabel ngIf);
    void visit(DivNgForLabel ngFor);
    void visit(FormAttribute attribute);
    void visit(HTMLFormLabel form);
    void visit(FormInputLabel input);
    void visit(FormButtonLabel button);
    void visit(LabelAttribute attr);
    void visit(LabelContent content);
    void visit(FormLabel label);
    void visit(FormDivLabel formDiv);
    void visit(FormTextLabel text);
    void visit(HTMLParagraphLabel paragraph);
    void visit(HTMLButtonLabel button);
    void visit(HTMLInputLabel input);
    void visit(HTMLImageLabel image);
    void visit(HTMLLabel label);
    void visit(HTMLRouterOutletLabel routerOutlet);

    //------------------{ TS Function }------------------//

    void visit(TSComponentLabel component);
    void visit(ComponentBody body);
    void visit(ComponentProperty property);
    void visit(ClassBlock classBlock);
    void visit(ClassVariableLabel variable);
    void visit(Type type);

    // Expressions
    void visit(LiteralExpressionLabel literal);
    void visit(IdentifierExpressionLabel identifier);
    void visit(BinaryExpressionLabel binary);
    void visit(UnaryExpressionLabel unary);
    void visit(ParenExpressionLabel paren);
    void visit(ArrayAccessExpressionLabel access);
    void visit(ObjectLiteralExpressionLabel objectLiteral);
    void visit(ObjectProperty property);
    void visit(SelectExpressionLabel select);
    void visit(SelectorCall selectorCall);

    //construct
    void visit(ClassConstructorLabel constructor);
    void visit(Parameter parameter);
    void visit(Block block);
    void visit(ParameterList paramList);

    void visit(AssignmentStmtLabel stmt);
    void visit(FunctionCallStmtLabel stmt);
    void visit(ArgumentList args);
    void visit(VarDeclarationStmtLabel stmt);
    void visit(ReturnStmtLabel stmt);
    void visit(DispatchStmtLabel stmt);
    void visit(ActionCall action);

    //method
    void visit(MethodModifier modifier);
    void visit(ClassMethodLabel method);

    void visit(ArrayLiteral array);

    void visit(InjectableProperty prop);
    void visit(TSServiceLabel service);
    void visit(InjectableBody body);

    void visit(TSClassLabel classNode);
    void visit(TSFunctionLabel func);
    void visit(TSArrowFunctionLabel arrow);

    void visit(TSVariableLabel variable);
    void visit(TSInterfaceLabel inter);
    void visit(InterfaceBody body);
    void visit(InterfaceProperty prop);

    void visit(TSEnumLabel node);
    void visit(EnumBody body);
    void visit(EnumMember member);

    //------------------{ STATE MANGMENT }------------------//

    void visit(TSRoutingLabel node);
    void visit(RouteConfig config);
    void visit(PathProperty path);
    void visit(RouteComponentProperty component);

    void visit(TSActionLabel node);
    void visit(ActionType actionType);

    void visit(TSReducerLabel node);
    void visit(ReducerConfig config);
    void visit(OnReducerBlock reducer);
}
