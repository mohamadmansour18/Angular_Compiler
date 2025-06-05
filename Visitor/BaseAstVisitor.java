package Visitor;

import Ast_Class.TypeScriptClasses.RootProgram;
import Ast_Class.TypeScriptClasses.*;
import Ast_Class.TypeScriptClasses.Class;
import Ast_Class.TypeScriptClasses.Enum;
import Ast_Class.TypeScriptClasses.Object;
import Ast_Class.TypeScriptClasses.Access;


public class BaseAstVisitor implements AST_Visitor {
    @Override
    public void visit(Angular angular) {
        System.out.println("**********************************************");
        System.out.println("[Angular Node]");
        System.out.println("Child Count : " + angular.getChildeCount());

        if(angular.getString()!=null) {
            System.out.println(angular.getString());
        }
        if(angular.getAttributes()!=null) {
            for (Attribute a : angular.getAttributes()) {
                a.accept(this);
            }
        }
    }

    @Override
    public void visit(HtmlElement htmlElement) {
        System.out.println("**********************************************");
        System.out.println("[HtmlElement Node]");
        System.out.println("Child Count : " + htmlElement.getChildeCount());
        if(htmlElement.getTagClose()!=null) {
            htmlElement.getTagClose().accept(this);
        }
        if(htmlElement.getTagOpen()!=null) {
            htmlElement.getTagOpen().accept(this);
        }
        if(htmlElement.getElementContent()!=null) {
            htmlElement.getElementContent().accept(this);
        }
        if(htmlElement.getTagOpenEmpty()!=null) {
            htmlElement.getTagOpenEmpty().accept(this);
        }
    }

    @Override
    public void visit(Keyword keyword) {
        System.out.println("**********************************************");
        System.out.println("[Keyword Node]");
        System.out.println("Child Count : " + keyword.getChildeCount());
        if (keyword.getS() != null) {
            System.out.println(keyword.getS());
        }
    }

    @Override
    public void visit(TowwayDirective towwayDirective) {

    }

    @Override
    public void visit(StructuralDirective structuralDirective) {

    }

    @Override
    public void visit(TagOpen tagOpen) {

    }

    @Override
    public void visit(TagClose tagClose) {

    }

    @Override
    public void visit(TagOpenEmpty tagOpenEmpty) {

    }

    @Override
    public void visit(AngularComponent angularComponent) {
        System.out.println("**********************************************");
        System.out.println("[AngularComponent Node]");
        System.out.println("Child Count : " + angularComponent.getChildeCount());

        if (angularComponent.getAngular()!=null) {
            angularComponent.getAngular().accept(this);
        }
    }

    @Override
    public void visit(AngularTemplet angularTemplet) {
        System.out.println("**********************************************");
        System.out.println("[AngularTemplet Node]");
        System.out.println("Child Count : " + angularTemplet.getChildeCount());
        if (angularTemplet.getTemplet()!=null){
            angularTemplet.getTemplet().accept(this);
        }
    }

    @Override
    public void visit(QutAngular angular) {

    }

    @Override
    public void visit(ArratLable arratLable) {
        System.out.println("**********************************************");
        System.out.println("[ArratLable Node]");

        if(arratLable.getArray()!=null) {
            arratLable.getArray().accept(this);
        }
    }

    @Override
    public void visit(Attribute attribute) {
        System.out.println("**********************************************");
        System.out.println("[Attribute Node]");
        System.out.println("Child Count : " + attribute.getChildeCount());
        if (attribute.getId()!=null) {
            System.out.println(attribute.getId());
        }
        if(attribute.getExpression()!=null) {
            attribute.getExpression().accept(this);
        }
        if (attribute.getCom()!=null) {
            System.out.println(attribute.getCom());
        }
    }

    @Override
    public void visit(AttributeLable attributeLable) {
        System.out.println("**********************************************");
        System.out.println("[AttributeLable Node]");

        if (attributeLable.getAttributeLable()!=null) {
            attributeLable.getAttributeLable().accept(this);
        }
    }

    @Override
    public void visit(AttributeDirictive attributeDirictive) {
        System.out.println("**********************************************");
        System.out.println("[AttributeDirictive Node]");

        if (attributeDirictive.getExpressions()!=null) {
            for (Expression e : attributeDirictive.getExpressions()) {
                e.accept(this);
            }
        }
    }

    @Override
    public void visit(CallFunction function) {
        System.out.println("**********************************************");
        System.out.println("[CallFunction Node]");
        System.out.println("Child Count : " + function.getChildeCount());

        if (function.getCullFunction()!=null) {
            function.getCullFunction().accept(this);
        }
    }

    @Override
    public void visit(Char aChar) {
        System.out.println("**********************************************");
        System.out.println("[Char Node]");
        if(aChar.getS()!=null) {
            System.out.println(aChar.getS());
        }
    }

    @Override
    public void visit(Charcter charcter) {
        if (charcter.getaChar()!=null) {
            charcter.getaChar().accept(this);
        }
    }

    @Override
    public void visit(ClassStatement classStatement) {
        System.out.println("**********************************************");
        System.out.println("[ClassStatement Node]");
        System.out.println("Child Count : " + classStatement.getChildeCount());
        if(classStatement.getaClass()!=null) {
            classStatement.getaClass().accept(this);
        }
    }

    @Override
    public void visit(CallFunctionStatement functionStatement) {
        System.out.println("**********************************************");
        System.out.println("[CallFunctionStatement Node]");
        System.out.println("Child Count : " + functionStatement.getChildeCount());

        if(functionStatement.getCullFunction()!=null) {
            functionStatement.getCullFunction().accept(this);
        }
    }

    @Override
    public void visit(Content content) {
        System.out.println("**********************************************");
        System.out.println("[Content Node]");
        if(content.getCharcter()!=null)
            content.getCharcter().accept(this);
        if(content.getTextLable()!=null)
            content.getTextLable().accept(this);
        if(content.getComponent()!=null)
            content.getComponent().accept(this);
        if(content.getHtml()!=null)
            content.getHtml().accept(this);
        if(content.getDirictive()!=null)
            content.getDirictive().accept(this);
    }

    @Override
    public void visit(Dirictive dirictive) {
        System.out.println("**********************************************");
        System.out.println("[Dirictive Node]");
        if(dirictive.getDirictiveElement()!=null) {
            dirictive.getDirictiveElement().accept(this);
        }
    }

    @Override
    public void visit(DirictiveElement dirictiveElement) {
        System.out.println("**********************************************");
        System.out.println("[DirictiveElement Node]");
        if(dirictiveElement.getStructural()!=null)
            dirictiveElement.getStructural().accept(this);
        if(dirictiveElement.getAttribute()!=null)
            dirictiveElement.getAttribute().accept(this);
        if(dirictiveElement.getTowway()!=null)
            dirictiveElement.getTowway().accept(this);
    }

    @Override
    public void visit(ElementContent elementContent) {
        System.out.println("**********************************************");
        System.out.println("[ElementContent Node]");
        System.out.println("Child Count : " + elementContent.getChildeCount());

        if(elementContent.getContents()!=null) {
            for (Content c : elementContent.getContents()){
                c.accept(this);
            }
        }
    }

    @Override
    public void visit(FunctionStatement functionStatement) {
        System.out.println("**********************************************");
        System.out.println("[Html Node]");
        System.out.println("Child Count : " + functionStatement.getChildeCount());
        if(functionStatement.getFunction()!=null) {
            functionStatement.getFunction().accept(this);
        }
    }

    @Override
    public void visit(Html html) {
        System.out.println("**********************************************");
        System.out.println("[Html Node]");
        System.out.println("Child Count : " + html.getChildeCount());
        if(html.getHtmlElement()!=null) {
            html.getHtmlElement().accept(this);
        }
    }

    @Override
    public void visit(IfStatement ifStatement) {
        System.out.println("**********************************************");
        System.out.println("[IfStatement Node]");
        System.out.println("Child Count : " + ifStatement.getChildeCount());
        if(ifStatement.getIfStatment()!=null) {
            ifStatement.getIfStatment().accept(this);
        }
    }

    @Override
    public void visit(ImportStatement importStatement) {
        System.out.println("**********************************************");
        System.out.println("[importStatement Node]");
        System.out.println("Child Count : " + importStatement.getChildeCount());
        if (importStatement.getImportRul()!=null){
            importStatement.getImportRul().accept(this);
        }
    }

    @Override
    public void visit(Info info) {
        System.out.println("**********************************************");
        System.out.println("[info Node]");
        System.out.println("Child Count : " + info.getChildeCount());
        if (info.getVariable()!=null)
        {
            info.getVariable().accept(this);
        }
        if(info.getObjectsLable()!=null)
        {
            info.getObjectsLable().accept(this);
        }
        if(info.getCallFunctionLable()!=null)
        {
            info.getCallFunctionLable().accept(this);
        }
        if(info.getAccessLable()!=null)
        {
            info.getAccessLable().accept(this);
        }
        if(info.getTempletLable()!=null)
        {
            info.getTempletLable().accept(this);
        }
        if(info.getQutAngular()!=null)
        {
            info.getQutAngular().accept(this);
        }
        if (info.getArratLable()!=null)
        {
            info.getArratLable().accept(this);
        }
    }

    @Override
    public void visit(Inter inter) {
        System.out.println("**********************************************");
        System.out.println("[info Node]");
        System.out.println("Child Count : " + inter.getChildeCount());
        if(inter.getExpression()!=null) {
            inter.getExpression().accept(this);
        }
    }

    @Override
    public void visit(InterfaceStatement interfaceStatement) {
        System.out.println("**********************************************");
        System.out.println("[InterfaceStatement Node]");
        System.out.println("Child Count : " + interfaceStatement.getChildeCount());
        if(interfaceStatement.getAnInterface()!=null) {
            interfaceStatement.getAnInterface().accept(this);
        }
    }

    @Override
    public void visit(LoopStatement loopStatement) {
        System.out.println("**********************************************");
        System.out.println("[loopStatement Node]");
        System.out.println("Child Count : " + loopStatement.getChildeCount());
        if (loopStatement.getLoopStatments()!=null) {
            loopStatement.getLoopStatments().accept(this);
        }
    }

    @Override
    public void visit(Argument argument) {

        System.out.println("**********************************************");
        System.out.println("[Argument Node]");
        System.out.println("Child Count : " + argument.getChildeCount());
        if (argument.getName()!=null)
        {
            System.out.println("argument name : " + argument.getName());
        }
        if(argument.getEqualBaseData()!=null)
        {
            System.out.println("argument with value :" + argument.getEqualBaseData());
            argument.getEqualBaseData().accept(this);
        }
        if(argument.getObjects()!=null)
        {
            System.out.println("argument is an object type : ");
            argument.getObjects().accept(this);
        }
        if(argument.getBaseData()!=null)
        {
            System.out.println("argument from base date");
            argument.getBaseData().accept(this);
        }
        if(argument.getArrowFunction()!=null)
        {
            System.out.println("argument from arrow function");
            argument.getArrowFunction().accept(this);
        }
    }

    @Override
    public void visit(Arguments arguments) {
        System.out.println("**********************************************");
        System.out.println("[Arguments Node]");
        System.out.println("Child Count : " + arguments.getChildeCount());

        if (arguments.getArguments() != null) {
            for (Argument a : arguments.getArguments()) {
                a.accept(this);
            }
        }
    }

    @Override
    public void visit(RootProgram rootProgram) {

    }

    @Override
    public void visit(Templet templet) {

    }

    @Override
    public void visit(If_statment ifStatment) {
        System.out.println("**********************************************");
        System.out.println("[If_statment Node]");
        System.out.println("Child Count : " + ifStatment.getChildeCount());

        if(ifStatment.getExpression()!=null) {
            ifStatment.getExpression().accept(this);
        }
        if (ifStatment.getStatements()!=null)
        {
            for (Statements s : ifStatment.getStatements()) {
                s.accept(this);
            }
        }
    }

    @Override
    public void visit(LoopStatments loopStatments) {
        System.out.println("**********************************************");
        System.out.println("[LoopStatments Node]");
        System.out.println("Child Count : " + loopStatments.getChildeCount());

        if (loopStatments.getAnwhile() != null)
        {
            loopStatments.getAnwhile().accept(this);
        }
        if (loopStatments.getAfor() != null)
        {
            loopStatments.getAfor().accept(this);
        }
        if (loopStatments.getStatements() !=null)
        {
            for (Statements s : loopStatments.getStatements()) {
                s.accept(this);
            }
        }
    }

    @Override
    public void visit(Prefix prefix) {

    }

    @Override
    public void visit(Text text) {

    }

    @Override
    public void visit(Element element) {
        System.out.println("**********************************************");
        System.out.println("[Element Node]");
        System.out.println("Child Count : " + element.getChildeCount());

        if(element.getHtmlElement()!=null)
            element.getHtmlElement().accept(this);
        if(element.getAngular()!=null)
            element.getAngular().accept(this);
    }

    @Override
    public void visit(Add add) {
        System.out.println("**********************************************");
        System.out.println("[Add Node]");
        System.out.println("Child Count : " + add.getChildeCount());
        if (add.getMultis() !=null)
        {
            for (Multi m : add.getMultis())
                m.accept(this);
        }
    }

    @Override
    public void visit(ArrayLitiral arrayLitiral) {
        System.out.println("**********************************************");
        System.out.println("[ArrayLitiral Node]");

        if (arrayLitiral.getBaseExpression()!=null) {
            arrayLitiral.getBaseExpression().accept(this);
        }
        if(arrayLitiral.getExpressions()!=null)
        {
            for (Expression e : arrayLitiral.getExpressions())
                e.accept(this);
        }
    }

    @Override
    public void visit(BaseExpression baseExpression) {
        System.out.println("**********************************************");
        System.out.println("[BaseExpression Node]");
        System.out.println("Child Count : " + baseExpression.getChildeCount());
        if(baseExpression.getLitiral()!=null)
        {
            baseExpression.getLitiral().accept(this);
        }
        if(baseExpression.getId()!=null) {
            System.out.println(baseExpression.getId());
        }
        if(baseExpression.getFunctionCall()!=null) {
            baseExpression.getFunctionCall().accept(this);
        }
        if(baseExpression.getArrayLitiral()!=null) {
            baseExpression.getArrayLitiral().accept(this);
        }
        if(baseExpression.getObjectLitiral()!=null) {
            baseExpression.getObjectLitiral().accept(this);
        }
    }

    @Override
    public void visit(Equalty equalty) {
        System.out.println("**********************************************");
        System.out.println("[Equalty Node]");
        System.out.println("Child Count : " + equalty.getChildeCount());
        if(equalty.getRelations()!=null)
        {
            for (Relation r : equalty.getRelations()) {
                r.accept(this);
            }
        }
    }

    @Override
    public void visit(Expression expression) {
        System.out.println("**********************************************");
        System.out.println("[Expression Node]");
        System.out.println("Child Count : " + expression.getChildeCount());
        if (expression.getLogic()!=null)
        {
            expression.getLogic().accept(this);
        }

    }

    @Override
    public void visit(For aFor) {
        System.out.println("**********************************************");
        System.out.println("[For Node]");
        System.out.println("Child Count : " + aFor.getChildeCount());
        if (aFor.getAfor()!=null)
        {
            System.out.println(aFor.getAfor());
        }

        if(aFor.getLoopInit()!=null)
        {
            aFor.getLoopInit().accept(this);
        }

        if(aFor.getExpression()!=null)
        {
            aFor.getExpression().accept(this);
        }
        if(aFor.getLoopStep()!=null)
        {
            aFor.getLoopStep().accept(this);
        }
        if(aFor.getStatements()!=null)
        {
            for (Statements s : aFor.getStatements()) {
                s.accept(this);
            }
        }
    }

    @Override
    public void visit(FunctionCall functionCall) {
        System.out.println("**********************************************");
        System.out.println("[FunctionCall Node]");
        System.out.println("Child Count : " + functionCall.getChildeCount());
        if(functionCall.getId()!=null) {
            System.out.println(functionCall.getId());
        }
        if (functionCall.getBaseExpression()!=null) {
            functionCall.getBaseExpression().accept(this);
        }
        if(functionCall.getExpressions()!=null)
        {
            for (Expression e : functionCall.getExpressions()){
                e.accept(this);
            }
        }
    }

    @Override
    public void visit(Litiral litiral) {
        System.out.println("**********************************************");
        System.out.println("[Litiral Node]");
        System.out.println("Child Count : " + litiral.getChildeCount());
        if(litiral.getString()!=null) {
            System.out.println(litiral.getString());
        }
    }

    @Override
    public void visit(Logic logic) {
        System.out.println("**********************************************");
        System.out.println("[Logic Node]");
        System.out.println("Child Count : " + logic.getChildeCount());
        if(logic.getLogicAnds()!=null)
        {
            for (LogicAnd l : logic.getLogicAnds()){
                l.accept(this);
            }
        }
    }

    @Override
    public void visit(LogicAnd logicAnd) {
        System.out.println("**********************************************");
        System.out.println("[LogicAnd Node]");
        System.out.println("Child Count : " + logicAnd.getChildeCount());
        if (logicAnd.getEqualties() != null) {
            for (Equalty e : logicAnd.getEqualties()) {
                e.accept(this);
            }
        }
    }

    @Override
    public void visit(LoopInit loopInit) {
        System.out.println("**********************************************");
        System.out.println("[LoopInit Node]");
        System.out.println("Child Count : " + loopInit.getChildeCount());
        if(loopInit.getVarDeclare()!=null){
            loopInit.getVarDeclare().accept(this);
        }
        if (loopInit.getExpressions()!=null)
        {
            for (Expression e : loopInit.getExpressions())
            {
                e.accept(this);
            }
        }
    }

    @Override
    public void visit(LoopStep loopStep) {
        System.out.println("**********************************************");
        System.out.println("[LoopStep Node]");
        System.out.println("Child Count : " + loopStep.getChildeCount());
        if(loopStep.getExpressions()!=null)
        {
            for (Expression e : loopStep.getExpressions()) {
                e.accept(this);
            }
        }
    }

    @Override
    public void visit(Multi multi) {
        System.out.println("**********************************************");
        System.out.println("[Multi Node]");
        System.out.println("Child Count : " + multi.getChildeCount());
        if (multi.getUnaries()!=null)
        {
            for (Unary u : multi.getUnaries()) {
                u.accept(this);
            }
        }
    }

    @Override
    public void visit(ObjectLitiral objectLitiral) {
        System.out.println("**********************************************");
        System.out.println("[ObjectLitiral Node]");
        System.out.println("Child Count : " + objectLitiral.getChildeCount());
        if(objectLitiral.getExpressions()!=null)
        {
            for (Expression e : objectLitiral.getExpressions()) {
                e.accept(this);
            }
        }
    }

    @Override
    public void visit(Pip pip) {
        System.out.println("**********************************************");
        System.out.println("[Pip Node]");
        System.out.println("Child Count : " + pip.getChildeCount());
        if (pip.getBaseExpression()!=null)
        {
            pip.getBaseExpression().accept(this);
        }
        if(pip.getExpressions()!=null)
        {
            for (Expression e : pip.getExpressions()) {
                e.accept(this);
            }
        }
    }

    @Override
    public void visit(PrimaryExpression primaryExpression) {

    }

    @Override
    public void visit(Prop prop) {

    }

    @Override
    public void visit(Relation relation) {

    }

    @Override
    public void visit(Statment statment) {

    }

    @Override
    public void visit(Unary unary) {

    }

    @Override
    public void visit(While aWhile) {

    }

    @Override
    public void visit(ArrowFunction arrowFunction) {
        System.out.println("**********************************************");
        System.out.println("[ArrowFunction Node]");
        System.out.println("Child Count : " + arrowFunction.getChildeCount());

        if (arrowFunction.getHeader() != null) {
            System.out.println("arrow function header");
            arrowFunction.getHeader().accept(this);
        }
        if (arrowFunction.getBody() != null) {
            System.out.println("arrow function body");
            arrowFunction.getBody().accept(this);
        }
    }

    @Override
    public void visit(BaseData baseData) {
        System.out.println("**********************************************");
        System.out.println("[BaseData Node]");
        System.out.println("Child Count : " + baseData.getChildeCount());

        if(baseData.getInfo()!=null) {
            baseData.getInfo().accept(this);
        }
        if(baseData.getId()!=null){
            System.out.println(baseData.getId());
        }
    }

    @Override
    public void visit(Body body) {
        System.out.println("**********************************************");
        System.out.println("[Body Node]");
        System.out.println("Child Count : " + body.getChildeCount());

        if (body.getStatements() != null) {
            System.out.println("body Statement :");
            for (Statements s : body.getStatements()) {
                s.accept(this);
            }
        }
        if (body.getaReturn() != null) {
            System.out.println("return statement :");
            body.getaReturn().accept(this);
        }
    }

    @Override
    public void visit(BodyWithOutCurly bodyWithOutCurly) {
        System.out.println("**********************************************");
        System.out.println("[Body With out curly Node]");
        System.out.println("Child Count : " + bodyWithOutCurly.getChildeCount());

        if (bodyWithOutCurly.getStatements() != null) {
            System.out.println("body statement:");
            bodyWithOutCurly.getStatements().accept(this);
        }
        if (bodyWithOutCurly.getaReturn() != null) {
            System.out.println("return statement:");
            bodyWithOutCurly.getaReturn().accept(this);
        }
    }

    @Override
    public void visit(Class aClass) {
        System.out.println("**********************************************");
        System.out.println("[Class Node]");
        System.out.println("Child Count : " + aClass.getChildeCount());

        if(aClass.getName()!=null)
        {
            System.out.println("class name : " + aClass.getName());
        }
        if (aClass.getClassBodies()!=null)
        {
            for (ClassBody c : aClass.getClassBodies())
            {
                c.accept(this);
            }
        }
    }

    @Override
    public void visit(ClassFunction classFunction) {
        System.out.println("**********************************************");
        System.out.println("[function details Node]");
        System.out.println("Child Count : " + classFunction.getChildeCount());

        if (classFunction.getName() != null) {
            System.out.println("function name : " + classFunction.getName());
        }
        if (classFunction.getHeader() != null) {
            System.out.println("function header :");
            classFunction.getHeader().accept(this);
        }
        if (classFunction.getBody() != null) {
            System.out.println("function body");
            classFunction.getBody().accept(this);
        }
    }

    @Override
    public void visit(Component component) {
        System.out.println("**********************************************");
        System.out.println("[Component Node]");
        System.out.println("Child Count : " + component.getChildeCount());

        if (component.getComponent() != null) {
            System.out.println("declare component");
        }
        if (component.getObjects() != null) {
            System.out.println("component content");
            component.getObjects().accept(this);
        }
    }

    @Override
    public void visit(Constructor constructor) {
        System.out.println("**********************************************");
        System.out.println("[Constructor Node]");
        System.out.println("Child Count" + constructor.getChildeCount());
        if (constructor.getConstructor() != null) {
            System.out.println("constructor declare :");
        }
        if (constructor.getPrameters() != null) {
            System.out.println("constructor parameter :");
            constructor.getPrameters().accept(this);
        }
        if (constructor.getStatements() != null) {
            System.out.println("constructor body :");
            for (Statements s : constructor.getStatements()) {
                s.accept(this);
            }
        }
    }

    @Override
    public void visit(CullFunction cullFunction) {
        System.out.println("**********************************************");
        System.out.println("[CullFunction Node]");
        System.out.println("Child Count : " + cullFunction.getChildeCount());
        if (cullFunction.getName() != null) {
            System.out.println("function name : " + cullFunction.getName());
        }
        if (cullFunction.getArguments() != null) {
            System.out.println("cull function argument : ");
            cullFunction.getArguments().accept(this);
        }
    }

    @Override
    public void visit(Culls culls) {
        System.out.println("**********************************************");
        System.out.println("[culls Node]");
        System.out.println("Child Count : " + culls.getChildeCount());

        if(culls.getName()!=null)
        {
            System.out.println("access type name : " + culls.getName());
        }
        if(culls.getCullFunction()!=null)
        {
            System.out.println("access type cull function :");
            culls.getCullFunction().accept(this);
        }
        if(culls.getArray()!=null)
        {
            System.out.println("access type array : ");
            culls.getArray().accept(this);
        }
    }

    @Override
    public void visit(Data data) {
        System.out.println("**********************************************");
        System.out.println("[Data Node]");
        System.out.println("Child Count : " + data.getChildeCount());
        if (data.getArrowFunction() != null) {
            data.getArrowFunction().accept(this);
        }
        if (data.getBaseData() != null) {
            data.getBaseData().accept(this);
        }
    }

    @Override
    public void visit(Enum anEnum) {
        System.out.println("**********************************************");
        System.out.println("[Enum Node]");
        System.out.println("Child Count : " + anEnum.getChildeCount());

        if (anEnum.getName() != null) {
            System.out.println("enum name : " + anEnum.getName());
        }
        if (anEnum.getEnumAssignable() != null) {
            System.out.println("enum body");
            anEnum.getEnumAssignable().accept(this);
        }
    }

    @Override
    public void visit(EnumAssignable enumAssignable) {
        System.out.println("**********************************************");
        System.out.println("[Enum Assignable Node]");
        System.out.println("Child Count : " + enumAssignable.getChildeCount());
        if (enumAssignable.getEnumAssins() != null) {
            System.out.println("enum assignable body :");
            for (EnumAssin e : enumAssignable.getEnumAssins()) {
                e.accept(this);
            }
        }
    }

    @Override
    public void visit(EnumAssin enumAssin) {
        System.out.println("**********************************************");
        System.out.println("[EnumAssign Node]");
        System.out.println("Child Count : " + enumAssin.getChildeCount());
        if (enumAssin.getName() != null) {
            System.out.println("Enum variable: " + enumAssin.getName());
        }
        if (enumAssin.getNumberStringBool() != null) {
            System.out.println("enum variable value:");
            enumAssin.getNumberStringBool().accept(this);
        }
    }

    @Override
    public void visit(Equal equal) {
        System.out.println("**********************************************");
        System.out.println("[Equal Node]");
        System.out.println("Child Count : " + equal.getChildeCount());
        if (equal.getData() != null) {
            System.out.println("the value data");
            equal.getData().accept(this);
        }
        if (equal.getName() != null) {
            System.out.println("change type to another: " + equal.getName());
        }
    }

    @Override
    public void visit(EqualBaseData equalBaseData) {
        System.out.println("**********************************************");
        System.out.println("[EqualBaseData Node]");
        System.out.println("Child Count : " + equalBaseData.getChildeCount());
        if(equalBaseData.getBaseData()!=null)
        {
            System.out.println("Equal Value:");
            equalBaseData.getBaseData().accept(this);
        }
    }

    @Override
    public void visit(Function function) {
        System.out.println("**********************************************");
        System.out.println("[Function Node]");
        System.out.println("Child Count : " + function.getChildeCount());
        if (function.getClassFunction() != null) {
            System.out.println("node for function details:");
            function.getClassFunction().accept(this);
        }
        if(function.getFunction() != null)
        {
            System.out.println("function is : " + function.getFunction());
        }
    }

    @Override
    public void visit(Header header) {
        System.out.println("**********************************************");
        System.out.println("[Header Node]");
        System.out.println("Child Count : " + header.getChildeCount());
        if (header.getPrameters() != null) {
            System.out.println("header parameters :");
            header.getPrameters().accept(this);
        }
        if (header.getType() != null) {
            System.out.println("type : ");
            header.getType().accept(this);
        }
    }

    @Override
    public void visit(ImportRule importRule) {
        System.out.println("**********************************************");
        System.out.println("[Import rule Node]");
        System.out.println("Child Count : " + importRule.getChildeCount());
        if(importRule.getStrings()!=null)
        {
            for (String s : importRule.getStrings()) {
                System.out.println(s);
            }
        }
        if(importRule.getIds()!=null)
        {
            for (String s : importRule.getIds()) {
                System.out.println(s);
            }
        }
        if(importRule.getUrl()!=null)
        {
            System.out.println("url for import : " + importRule.getUrl());
        }
    }

    @Override
    public void visit(Interface anInterface) {
        System.out.println("**********************************************");
        System.out.println("[Interface Node]");
        System.out.println("Child Count : " + anInterface.getChildeCount());
        if (anInterface.getName() != null) {
            System.out.println("interface name: " + anInterface.getName());
        }
        if (anInterface.getInterfaceBodies() != null) {
            System.out.println("interface body: ");
            for (InterfaceBody i : anInterface.getInterfaceBodies()) {
                i.accept(this);
            }
        }
    }

    @Override
    public void visit(InterfaceBody interfaceBody) {
        System.out.println("**********************************************");
        System.out.println("[InterfaceBody Node]");
        System.out.println("Child Count : " + interfaceBody.getChildeCount());
        if (interfaceBody.getInterfaceFun() != null) {
            System.out.println("interface function: ");
            interfaceBody.getInterfaceFun().accept(this);
        }
        if (interfaceBody.getInterfaceVar() != null) {
            System.out.println("interface variable: ");
            interfaceBody.getInterfaceVar().accept(this);
        }
    }

    @Override
    public void visit(InterfaceFun interfaceFun) {
        System.out.println("**********************************************");
        System.out.println("[Interface function body Node]");
        System.out.println("Child Count : " + interfaceFun.getChildeCount());
        if (interfaceFun.getName() != null) {
            System.out.println("interface function name: " + interfaceFun.getName());
        }
        if (interfaceFun.getPrameters() != null) {
            System.out.println("interface function parameter: ");
            interfaceFun.getPrameters().accept(this);
        }
        if (interfaceFun.getType() != null) {
            System.out.println("interface function type: " + interfaceFun.getType());
        }
    }

    @Override
    public void visit(InterfaceVar interfaceVar) {
        System.out.println("**********************************************");
        System.out.println("[InterfaceVar variable Node]");
        System.out.println("Child Count : " + interfaceVar.getChildeCount());
        if (interfaceVar.getName() != null) {
            System.out.println("interface variable name: " + interfaceVar.getName());
        }
        if (interfaceVar.getType() != null) {
            System.out.println("interface variable type: " + interfaceVar.getType());
        }
    }

    @Override
    public void visit(NumberStringBool numberStringBool) {
        System.out.println("**********************************************");
        System.out.println("[Number_String_bool Node]");
        System.out.println("Child Count : " + numberStringBool.getChildeCount());
        if (numberStringBool.getNumber() != null) {
            System.out.println("value is number: " + numberStringBool.getNumber());
        }
        if (numberStringBool.getString() != null) {
            System.out.println("value is string: " + numberStringBool.getString());
        }
        if (numberStringBool.getBool() != null) {
            System.out.println("value is boolean: " + numberStringBool.getBool());
        }
    }

    @Override
    public void visit(Object object) {
        System.out.println("**********************************************");
        System.out.println("[Object Node]");
        System.out.println("Child Count : " + object.getChildeCount());
        if (object.getName() != null) {
            System.out.println("object name: " + object.getName());
        }
        if (object.getData() != null) {
            System.out.println("object value: ");
            object.getData().accept(this);
        }
    }

    @Override
    public void visit(Objects objects) {
        System.out.println("**********************************************");
        System.out.println("[Objects Node]");
        System.out.println("Child Count : " + objects.getChildeCount());
        if (objects.getObjects() != null) {
            for (Object o : objects.getObjects()) {
                o.accept(this);
            }
        }
    }

    @Override
    public void visit(ObjectType objectType) {
        System.out.println("**********************************************");
        System.out.println("[ObjectType Node]");
        System.out.println("Child Count : " + objectType.getChildeCount());
        if (objectType.getName() != null) {
            System.out.println("object name : " + objectType.getName());
        }
        if (objectType.getType() != null) {
            System.out.println("object type : " + objectType.getType());
        }
    }

    @Override
    public void visit(ObjectsType objectTypes) {
        System.out.println("**********************************************");
        System.out.println("[ObjectType Node]");
        System.out.println("Child Count : " + objectTypes.getChildeCount());
        if (objectTypes.getObjectTypes() != null) {
            for (ObjectType s : objectTypes.getObjectTypes()) {
                s.accept(this);
            }
        }
    }

    @Override
    public void visit(Operations operations) {
        System.out.println("**********************************************");
        System.out.println("[Operations Node]");
        System.out.println("Child Count : " + operations.getChildeCount());
        if (operations.getAccess() != null) {
            operations.getAccess().accept(this);
        }
        if (operations.getEqual() != null) {
            operations.getEqual().accept(this);
        }
    }

    @Override
    public void visit(Prameter prameter) {
        System.out.println("**********************************************");
        System.out.println("[Parameter Node]");
        System.out.println("Child Count : " + prameter.getChildeCount());
        if (prameter.getName() != null) {
            System.out.println("parameter name: " + prameter.getName());
        }
        if (prameter.getType() != null) {
            System.out.println("parameter type: ");
            prameter.getType().accept(this);
        }
        if (prameter.getEqual() != null) {
            System.out.println("parameter default value: ");
            prameter.getEqual().accept(this);
        }
        if (prameter.getObjects() != null) {
            System.out.println("parameter object type: ");
            prameter.getObjects().accept(this);
        }
    }

    @Override
    public void visit(Print print) {

    }

    @Override
    public void visit(Program program) {

    }

    @Override
    public void visit(Return aReturn) {

    }

    @Override
    public void visit(Services services) {

    }

    @Override
    public void visit(Statements statements) {

    }

    @Override
    public void visit(Type type) {

    }

    @Override
    public void visit(TypeCurle typeCurle) {

    }

    @Override
    public void visit(TypeCurles typeCurles) {

    }

    @Override
    public void visit(TypeDeclare typeDeclare) {

    }

    @Override
    public void visit(TypeEqual typeEqual) {

    }

    @Override
    public void visit(Types types) {

    }

    @Override
    public void visit(Var var) {

    }

    @Override
    public void visit(VarDeclare varDeclare) {

    }

    @Override
    public void visit(Access access) {
        System.out.println("**********************************************");
        System.out.println("[Access Node]");
        System.out.println("Child Count : " + access.getChildeCount());
        if (access.getCulls() != null) {
            for (Culls c : access.getCulls())
                c.accept(this);
        }
        System.out.println("**********************************************");
    }

    @Override
    public void visit(Prameters prameters) {
        System.out.println("**********************************************");
        System.out.println("[Parameters Node]");
        System.out.println("Child Count : " + prameters.getChildeCount());
        if (prameters.getPrameters() != null) {
            for (Prameter p : prameters.getPrameters()) {
                p.accept(this);
            }
        }
    }

    @Override
    public void visit(Array array) {
        System.out.println("**********************************************");
        System.out.println("[Array Node]");
        System.out.println("Child Count : " + array.getChildeCount());

        if (array.getBaseData() != null) {
            System.out.println("Array Body: ");
            for (BaseData b : array.getBaseData()) {
                b.accept(this);
            }
        }
    }

    @Override
    public void visit(ClassBody classBody) {
        System.out.println("**********************************************");
        System.out.println("[ClassBody Node]");
        System.out.println("Child Count : " + classBody.getChildeCount());

        if (classBody.getVar() != null) {
            System.out.println("classVariable :");
            classBody.getVar().accept(this);
        }
        if (classBody.getConstructor() != null) {
            System.out.println("class constructor : ");
            classBody.getConstructor().accept(this);
        }
        if (classBody.getClassFunction() != null) {
            System.out.println("class function : ");
            classBody.getClassFunction().accept(this);
        }
    }
}
