package Visitor;


import Ast_Class.TypeScriptClasses.RootProgram;
import Ast_Class.TypeScriptClasses.*;
import Ast_Class.TypeScriptClasses.Class;
import Ast_Class.TypeScriptClasses.Enum;
import Ast_Class.TypeScriptClasses.Object;

public interface AST_Visitor {

    void visit(Angular angular);
void visit(HtmlElement htmlElement);
void visit(Keyword keyword);
void visit(TowwayDirective towwayDirective);
void visit(StructuralDirective  structuralDirective);
void visit(TagOpen tagOpen);
void visit(TagClose tagClose);
void visit(TagOpenEmpty tagOpenEmpty);

    void visit(AngularComponent angularComponent);

    void visit(AngularTemplet angularTemplet);

    void visit(QutAngular angular);

    void visit(ArratLable arratLable);

    void visit(Attribute attribute);

    void visit(AttributeLable attributeLable);

    void visit(AttributeDirictive attributeDirictive);

    void visit(CallFunction function);

    void visit(Char aChar);

    void visit(Charcter charcter);

    void visit(ClassStatement classStatement);

    void visit(CallFunctionStatement functionStatement);

    void visit(Content content);

    void visit(Dirictive dirictive);

    void visit(DirictiveElement dirictiveElement);

    void visit(ElementContent elementContent);

    void visit(FunctionStatement functionStatement);

    void visit(Html html);

    void visit(IfStatement ifStatement);

    void visit(ImportStatement importStatement);

    void visit(Info info);

    void visit(Inter inter);

    void visit(InterfaceStatement interfaceStatement);

    void visit(LoopStatement loopStatement);

    void visit(Argument argument);

    void visit(Arguments arguments);

    void visit(RootProgram rootProgram);

    //void visit(Array array);
    void visit(Templet templet);

    void visit(If_statment ifStatment);

    void visit(LoopStatments loopStatments);

    void visit(Prefix prefix);

    void visit(Text text);

    void visit(Element element);

    void visit(Add add);

    void visit(ArrayLitiral arrayLitiral);

    void visit(BaseExpression baseExpression);

    void visit(Equalty equalty);

    void visit(Expression expression);

    void visit(For aFor);

    void visit(FunctionCall functionCall);

    void visit(Litiral litiral);

    void visit(Logic logic);

    void visit(LogicAnd logicAnd);

    void visit(LoopInit loopInit);

    void visit(LoopStep loopStep);

    void visit(Multi multi);

    void visit(ObjectLitiral objectLitiral);

    void visit(Pip pip);

    void visit(PrimaryExpression primaryExpression);

    void visit(Prop prop);

    void visit(Relation relation);

    void visit(Statment statment);

    void visit(Unary unary);

    void visit(While aWhile);

    void visit(ArrowFunction arrowFunction);

    void visit(BaseData baseData);

    void visit(Body body);

    void visit(BodyWithOutCurly bodyWithOutCurly);

    void visit(Class aClass);

    void visit(ClassFunction classFunction);

    void visit(Component component);

    void visit(Constructor constructor);

    void visit(CullFunction cullFunction);

    void visit(Culls culls);

    void visit(Data data);

    void visit(Enum anEnum);

    void visit(EnumAssignable enumAssignable);

    void visit(EnumAssin enumAssin);

    void visit(Equal equal);

    void visit(EqualBaseData equalBaseData);

    void visit(Function function);

    void visit(Header header);

    void visit(ImportRule importRule);

    void visit(Interface anInterface);

    void visit(InterfaceBody interfaceBody);

    void visit(InterfaceFun interfaceFun);

    void visit(InterfaceVar interfaceVar);

    void visit(NumberStringBool numberStringBool);

    void visit(Object object);

    void visit(Objects objects);

    void visit(ObjectType objectType);

    void visit(ObjectsType objectTypes);

    void visit(Operations operations);

    void visit(Prameter prameter);

    void visit(Print print);

    void visit(Program program);

    void visit(Return aReturn);

    void visit(Services services);

    void visit(Statements statements);

    void visit(Type type);

    void visit(TypeCurle typeCurle);

    void visit(TypeCurles typeCurles);

    void visit(TypeDeclare typeDeclare);

    void visit(TypeEqual typeEqual);

    void visit(Types types);

    void visit(Var var);

    void visit(VarDeclare varDeclare);
    //void visit(Access access);

    void visit(Ast_Class.TypeScriptClasses.Access access);

    void visit(Prameters prameters);

    void visit(Ast_Class.TypeScriptClasses.Array array);

    void visit(ClassBody classBody);
}
