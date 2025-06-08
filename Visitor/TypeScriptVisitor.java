package Visitor;

import Ast_Class.Node.Node;
import Ast_Class.TypeScriptClasses.RootProgram;
import Ast_Class.TypeScriptClasses.*;
import Ast_Class.TypeScriptClasses.Class;
import Ast_Class.TypeScriptClasses.Enum;
import SymbolTable.Scope;
import gen.FrameParser;
import Main.Main;
import SemanticErros.*;
import SymbolTable.Symbol;
import gen.FrameParserBaseVisitor;
import java.lang.Object;

public class TypeScriptVisitor extends FrameParserBaseVisitor {
    public ErrorCollector errorCollector = new ErrorCollector();

    @Override
    public RootProgram visitRootprogram(FrameParser.RootprogramContext ctx) {

        RootProgram rootProgram = new RootProgram();

        rootProgram.initializeNode(ctx, true, "Global");

        if (ctx.program() != null) {
            for (int i = 0; i < ctx.program().size(); i++) {
                rootProgram.getPrograms().add(visitProgram(ctx.program(i)));
            }
        }

        Node.removeScope();
        return rootProgram;
    }

    @Override
    public Program visitProgram (FrameParser.ProgramContext ctx){

        Program program = new Program();

        program.initializeNode(ctx , false , "");

        if (ctx.statements() != null) {
            for (int i = 0; i < ctx.statements().size(); i++) {
                program.getStatements().add(visitStatements(ctx.statements(i)));
            }
        }

        return program;
    }

    @Override
    public Statements visitStatements (FrameParser.StatementsContext ctx){
        Statements statements = new Statements();

        statements.initializeNode(ctx , false , "");

        if (ctx.Export() != null) {
            statements.setExport(ctx.Export().getText());
        }
        if (ctx.Await() != null) {
            statements.setAtt(ctx.Await().getText());
        }
        if (ctx.stetment() != null) {
            statements.setStatment((Statment) visit(ctx.stetment()));
        }

        return statements;
    }

    @Override
    public ServicesStatement visitServicesStatement(FrameParser.ServicesStatementContext ctx) {
        ServicesStatement services = new ServicesStatement();
        if (ctx.services() != null) {
            services.setServices(visitServices(ctx.services()));
        }
        return services;
    }

    @Override
    public ComponentStatement visitComponentStatement(FrameParser.ComponentStatementContext ctx) {
        ComponentStatement componentStatement = new ComponentStatement();
        if (ctx.component() != null) {
            componentStatement.setComponent(visitComponent(ctx.component()));
        }
        return componentStatement;
    }

    @Override
    public PrintStatement visitPrintStatement(FrameParser.PrintStatementContext ctx) {
        PrintStatement printStatement = new PrintStatement();
        if (ctx.print() != null)
            printStatement.setPrint(visitPrint(ctx.print()));
        return printStatement;
    }

    @Override
    public VarDeclareStatement visitVarDeclareStatement(FrameParser.VarDeclareStatementContext ctx) {
        VarDeclareStatement varDeclareStatement = new VarDeclareStatement();
        if (ctx.vardeclare() != null)
            varDeclareStatement.setVarDeclare(visitVardeclare(ctx.vardeclare()));
        return varDeclareStatement;
    }

    @Override
    public FunctionStatement visitFunctionStatement(FrameParser.FunctionStatementContext ctx) {
        FunctionStatement functionStatement = new FunctionStatement();
        if (ctx.function() != null) {
            functionStatement.setFunction(visitFunction(ctx.function()));
        }
        return functionStatement;
    }

    @Override
    public CallFunctionStatement visitCallFunctionStatement(FrameParser.CallFunctionStatementContext ctx) {
        CallFunctionStatement functionStatement = new CallFunctionStatement();
        functionStatement.setChildeCount(ctx.getChildCount());
        if (ctx.cullfunction() != null) {
            functionStatement.setCullFunction(visitCullfunction(ctx.cullfunction()));
        }
        return functionStatement;
    }

    @Override
    public AccessStatement visitAccessStatement(FrameParser.AccessStatementContext ctx) {
        AccessStatement accessStatement = new AccessStatement();
        if (ctx.access() != null) {
            accessStatement.setAccess(visitAccess(ctx.access()));
        }
        return accessStatement;
    }

    @Override
    public TypeDeclareStatement visitTypeDeclareStatement(FrameParser.TypeDeclareStatementContext ctx) {
        TypeDeclareStatement typeDeclareStatement = new TypeDeclareStatement();
        if (ctx.typedeclare() != null)
            typeDeclareStatement.setType(visitTypedeclare(ctx.typedeclare()));
        return typeDeclareStatement;
    }

    @Override
    public EnumStatement visitEnumStatement(FrameParser.EnumStatementContext ctx) {
        EnumStatement enumStatement = new EnumStatement();
        if (ctx.enum_() != null)
            enumStatement.setAnEnum(visitEnum(ctx.enum_()));
        return enumStatement;
    }

    @Override
    public InterfaceStatement visitInterfaceStatement(FrameParser.InterfaceStatementContext ctx) {
        InterfaceStatement interfaceStatement = new InterfaceStatement();
        if (ctx.interface_() != null)
            interfaceStatement.setAnInterface(visitInterface(ctx.interface_()));
        return interfaceStatement;
    }

    @Override
    public ClassStatement visitClassStatement(FrameParser.ClassStatementContext ctx) {
        ClassStatement classStatement = new ClassStatement();
        classStatement.setChildeCount(ctx.getChildCount());
        if (ctx.class_() != null) {
            classStatement.setaClass(visitClass(ctx.class_()));
        }
        return classStatement;
    }

    @Override
    public OperationsStatement visitOperationsStatement(FrameParser.OperationsStatementContext ctx) {
        OperationsStatement operationsStatement = new OperationsStatement();
        if (ctx.operations() != null)
            operationsStatement.setOperations(visitOperations(ctx.operations()));
        return operationsStatement;
    }

    @Override
    public ImportStatement visitImportStatement(FrameParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        if (ctx.import_rule() != null)
            importStatement.setImportRul(visitImport_rule(ctx.import_rule()));
        return importStatement;
    }

    @Override
    public TemplateStatement visitTemplateStatement(FrameParser.TemplateStatementContext ctx) {
        TemplateStatement templetLable = new TemplateStatement();
        if (ctx.template() != null) {
            templetLable.setTemplet(visitTemplate(ctx.template()));
        }
        return templetLable;
    }

    @Override
    public IfStatement visitIfStatement(FrameParser.IfStatementContext ctx) {
        IfStatement ifStatement = new IfStatement();
        if (ctx.if_statement() != null) {
            ifStatement.setIfStatment(visitIf_statement(ctx.if_statement()));
        }
        return ifStatement;
    }

    @Override
    public LoopStatement visitLoopStatement(FrameParser.LoopStatementContext ctx) {
        LoopStatement loopStatments = new LoopStatement();
        if (ctx.loop_statement() != null)
            loopStatments.setLoopStatments(visitLoop_statement(ctx.loop_statement()));
        return loopStatments;
    }

    @Override
    public PrefixStatement visitPrefixStatement(FrameParser.PrefixStatementContext ctx) {
        PrefixStatement prefixStatement = new PrefixStatement();
        if (ctx.prefix() != null)
            prefixStatement.setPrefix(visitPrefix(ctx.prefix()));
        return prefixStatement;
    }

    @Override
    public Prefix visitPrefix(FrameParser.PrefixContext ctx) {
        Prefix prefix = new Prefix();
        if (ctx.IDENTIFIER() != null) {
            prefix.setIdentifier(ctx.IDENTIFIER().getText());
        }

        return prefix;
    }


    @Override
    public NumberStringBool visitNumber_STRING_BOOLEAN(FrameParser.Number_STRING_BOOLEANContext ctx) {
        NumberStringBool numberStringBool = new NumberStringBool();
        if (ctx.NUMBER() != null)
            numberStringBool.setNumber(ctx.NUMBER().getText());
        if (ctx.STRING() != null)
            numberStringBool.setString(ctx.STRING().getText());
        if (ctx.BOOLEAN() != null)
            numberStringBool.setBool(ctx.BOOLEAN().getText());
        return numberStringBool;
    }

    @Override
    public Keyword visitKeyword(FrameParser.KeywordContext ctx) {
        Keyword keyword = new Keyword();
        if (ctx.LET() != null)
            keyword.setS(ctx.LET().getText());
        if (ctx.Const() != null)
            keyword.setS(ctx.Const().getText());
        return keyword;
    }

    @Override
    public Templet visitTemplate(FrameParser.TemplateContext ctx) {
        Templet templet = new Templet();
        if (ctx.element() != null)
            for (int i = 0; i < ctx.element().size(); i++) {
                templet.getElements().add(visitElement(ctx.element(i)));
            }
        if (ctx.text() != null)
            for (int i = 0; i < ctx.text().size(); i++) {
                templet.getTexts().add(visitText(ctx.text(i)));
            }
        return templet;
    }

    @Override
    public Element visitElement(FrameParser.ElementContext ctx) {
        Element element = new Element();
        element.setChildeCount(ctx.getChildCount());

        if (ctx.htmlElement() != null)
            element.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        if (ctx.angularComponent() != null)
            element.setAngular(visitAngularComponent(ctx.angularComponent()));
        return element;
    }


    @Override
    public ElementContent visitElementContent(FrameParser.ElementContentContext ctx) {
        ElementContent elementContent = new ElementContent();
        elementContent.setChildeCount(ctx.getChildCount());

        if (ctx.content() != null)
            for (int i = 0; i < ctx.content().size(); i++) {
                elementContent.getContents().add((Content) visit(ctx.content(i)));
            }
        return elementContent;
    }

    @Override
    public HtmlElement visitHtmlElement(FrameParser.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();
        if (ctx.tagOpen() != null)
            htmlElement.setTagOpen(visitTagOpen(ctx.tagOpen()));
        if (ctx.tagClose() != null)
            htmlElement.setTagClose(visitTagClose(ctx.tagClose()));
        if (ctx.elementContent() != null)
            htmlElement.setElementContent(visitElementContent(ctx.elementContent()));
        if (ctx.tagOpenEmpty() != null)
            htmlElement.setTagOpenEmpty(visitTagOpenEmpty(ctx.tagOpenEmpty()));
        return htmlElement;
    }

    @Override
    public Char visitCharacter(FrameParser.CharacterContext ctx) {
        Char aChar = new Char();
        if (ctx.PLUS() != null)
            aChar.setS(ctx.PLUS().getText());
        if (ctx.MINUS() != null)
            aChar.setS(ctx.MINUS().getText());
        return aChar;
    }

    @Override
    public TagOpenEmpty visitTagOpenEmpty(FrameParser.TagOpenEmptyContext ctx) {
        TagOpenEmpty tagOpenEmpty = new TagOpenEmpty();

        if (ctx.IDENTIFIER() != null)
            tagOpenEmpty.setId(ctx.IDENTIFIER().getText());

        if (ctx.elementContent() != null)
            tagOpenEmpty.setElementContent(visitElementContent(ctx.elementContent()));

        if (ctx.attribute() != null) {
            for (int i = 0; i < ctx.attribute().size(); i++) {
                Attribute attr = visitAttribute(ctx.attribute(i));
                tagOpenEmpty.getAttributes().add(attr);

                if (tagOpenEmpty.getId() != null && attr.getId() != null) {
                    if (!isValidPropertyForElement(tagOpenEmpty.getId(), attr.getId())) {
                        errorCollector.addError(new InvalidPropertyForElementError(
                                attr.getId(), tagOpenEmpty.getId(),
                                ctx.getStart().getLine(),
                                ctx.getStart().getCharPositionInLine()
                        ));
                    }
                }
            }
        }

        return tagOpenEmpty;
    }


    @Override
    public TagOpen visitTagOpen(FrameParser.TagOpenContext ctx) {
        TagOpen tagOpen = new TagOpen();

        if (ctx.IDENTIFIER() != null)
            tagOpen.setId(ctx.IDENTIFIER().getText());

        if (ctx.elementContent() != null)
            tagOpen.setElementContent(visitElementContent(ctx.elementContent()));

        if (ctx.attribute() != null) {
            for (int i = 0; i < ctx.attribute().size(); i++) {
                Attribute attr = visitAttribute(ctx.attribute(i));
                tagOpen.getAttributes().add(attr);

                if (tagOpen.getId() != null && attr.getId() != null) {
                    if (!isValidPropertyForElement(tagOpen.getId(), attr.getId())) {
                        errorCollector.addError(new InvalidPropertyForElementError(
                                attr.getId(), tagOpen.getId(),
                                ctx.getStart().getLine(),
                                ctx.getStart().getCharPositionInLine()
                        ));
                    }
                }
            }
        }

        return tagOpen;
    }

    @Override
    public TagClose visitTagClose (FrameParser.TagCloseContext ctx){
        TagClose tagClose = new TagClose();
        if (ctx.IDENTIFIER() != null)
            tagClose.setString(ctx.IDENTIFIER().getText());
        return tagClose;
    }

    @Override
    public Attribute visitAttribute(FrameParser.AttributeContext ctx) {
        Attribute attribute = new Attribute();

        if (ctx.IDENTIFIER() != null) {
            attribute.setId(ctx.IDENTIFIER().getText());
        }

        if (ctx.expression() != null)
            attribute.setExpression(visitExpression(ctx.expression()));

        if (ctx.NUMBER() != null)
            attribute.setCom(ctx.NUMBER().getText());

        if (ctx.STRING() != null) {
            attribute.setCom(ctx.STRING().getText());
            String s = ctx.STRING().getText();                  //  "()"
            String outqut = s.replaceAll("\"", "");             // ()

            if (outqut.contains(")") && !outqut.equals("click")) {
                String functionName = outqut.replace("()", "").trim();  //

                if (!isFunctionDefined(functionName, attribute.getCurrentScope().getId())) {
                    errorCollector.addError(new UndefinedFunctionError(
                            functionName,
                            ctx.getStart().getLine(),
                            ctx.getStart().getCharPositionInLine()
                    ));
                }
            }
        }

        if (ctx.BOOLEAN() != null)
            attribute.setCom(ctx.BOOLEAN().getText());

        return attribute;
    }


    @Override
    public Angular visitAngularComponent (FrameParser.AngularComponentContext ctx){
        Angular angular = new Angular();
        if (ctx.IDENTIFIER() != null)
            angular.setString(ctx.IDENTIFIER().getText());
        if (ctx.attribute() != null)
            for (int i = 0; i < ctx.attribute().size(); i++) {
                angular.getAttributes().add(visitAttribute(ctx.attribute(i)));
            }
        return angular;
    }


    @Override
    public StructuralDirective visitStructuralDirective (FrameParser.StructuralDirectiveContext ctx){
        StructuralDirective structuralDirective = new StructuralDirective();

        if (ctx.STRUCTURAL_DIRECTIVE() != null) {
            structuralDirective.setString(ctx.STRUCTURAL_DIRECTIVE().getText());
            checkDirectiveUsage(structuralDirective, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        }

        if (ctx.expression() != null)
            structuralDirective.setExpression(visitExpression(ctx.expression()));

        return structuralDirective;
    }

    @Override
    public AttributeDirictive visitAttributeDirective (FrameParser.AttributeDirectiveContext ctx){
        AttributeDirictive attributeDirictive = new AttributeDirictive();
        if (ctx.expression() != null)
            for (int i = 0; i < ctx.expression().size(); i++) {
                attributeDirictive.getExpressions().add(visitExpression(ctx.expression(i)));
            }
        return attributeDirictive;
    }

    @Override
    public TowwayDirective visitTwoWayDirective (FrameParser.TwoWayDirectiveContext ctx){
        TowwayDirective towwayDirective = new TowwayDirective();
        if (ctx.expression() != null)
            for (int i = 0; i < ctx.expression().size(); i++) {
                towwayDirective.getExpressions().add(visitExpression(ctx.expression(i)));
            }
        return towwayDirective;
    }

    @Override
    public Expression visitExpression (FrameParser.ExpressionContext ctx){
        Expression expression = new Expression();
        if (ctx.logicalOrExpression() != null)
            expression.setLogic(visitLogicalOrExpression(ctx.logicalOrExpression()));

        return expression;
    }

    @Override
    public Logic visitLogicalOrExpression (FrameParser.LogicalOrExpressionContext ctx){
        Logic logic = new Logic();
        if (ctx.logicalAndExpression() != null)
            for (int i = 0; i < ctx.logicalAndExpression().size(); i++) {
                logic.getLogicAnds().add(visitLogicalAndExpression(ctx.logicalAndExpression(i)));
            }
        return logic;
    }

    @Override
    public LogicAnd visitLogicalAndExpression (FrameParser.LogicalAndExpressionContext ctx){
        LogicAnd logicAnd = new LogicAnd();
        if (ctx.equalityExpression() != null)
            for (int i = 0; i < ctx.equalityExpression().size(); i++) {
                logicAnd.getEqualties().add(visitEqualityExpression(ctx.equalityExpression(i)));
            }
        return logicAnd;
    }

    @Override
    public Equalty visitEqualityExpression (FrameParser.EqualityExpressionContext ctx){
        Equalty equalty = new Equalty();
        if (ctx.relationalExpression() != null)
            for (int i = 0; i < ctx.relationalExpression().size(); i++) {
                equalty.getRelations().add(visitRelationalExpression(ctx.relationalExpression(i)));
            }
        return equalty;
    }

    @Override
    public Relation visitRelationalExpression (FrameParser.RelationalExpressionContext ctx){
        Relation relation = new Relation();
        if (ctx.additiveExpression() != null)
            for (int i = 0; i < ctx.additiveExpression().size(); i++) {
                relation.getAdds().add(visitAdditiveExpression(ctx.additiveExpression(i)));
            }
        return relation;
    }

    @Override
    public Add visitAdditiveExpression (FrameParser.AdditiveExpressionContext ctx){
        Add add = new Add();
        if (ctx.multiplicativeExpression() != null)
            for (int i = 0; i < ctx.multiplicativeExpression().size(); i++)
                add.getMultis().add(visitMultiplicativeExpression(ctx.multiplicativeExpression(i)));
        return add;
    }

    @Override
    public Multi visitMultiplicativeExpression (FrameParser.MultiplicativeExpressionContext ctx){
        Multi multi = new Multi();
        if (ctx.unaryExpression() != null) {
            for (int i = 0; i < ctx.unaryExpression().size(); i++) {
                multi.getUnaries().add(visitUnaryExpression(ctx.unaryExpression(i)));
            }
        }
        return multi;
    }

    @Override
    public Unary visitUnaryExpression (FrameParser.UnaryExpressionContext ctx){
        Unary unary = new Unary();
        if (ctx.unaryExpression() != null)
            unary.setUnary(visitUnaryExpression(ctx.unaryExpression()));
        if (ctx.primaryExpression() != null)
            unary.setPrimaryExpression(visitPrimaryExpression(ctx.primaryExpression()));
        return unary;
    }

    @Override
    public PrimaryExpression visitPrimaryExpression (FrameParser.PrimaryExpressionContext ctx){
        PrimaryExpression primaryExpression = new PrimaryExpression();
        if (ctx.literal() != null)
            primaryExpression.setLiteral(visitLiteral(ctx.literal()));
        if (ctx.IDENTIFIER() != null) {

            primaryExpression.setId(ctx.IDENTIFIER().getText());
            if(!ctx.IDENTIFIER().getText().equals("click"))
                checkTemplateVariableDeclared(ctx.IDENTIFIER().getText(), primaryExpression.getCurrentScope().getId());
        }
        if (ctx.expression() != null)
            primaryExpression.setExpression(visitExpression(ctx.expression()));
        if (ctx.functionCall() != null)
            primaryExpression.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        if (ctx.arrayLiteral() != null)
            primaryExpression.setArrayLitiral(visitArrayLiteral(ctx.arrayLiteral()));
        if (ctx.objectLiteral() != null)
            primaryExpression.setObjectLitiral(visitObjectLiteral(ctx.objectLiteral()));
        if (ctx.pipeExpression() != null)
            primaryExpression.setPip(visitPipeExpression(ctx.pipeExpression()));
        if (ctx.propLitiral() != null)
            primaryExpression.setProp(visitPropLitiral(ctx.propLitiral()));

        return primaryExpression;
    }

    @Override
    public Pip visitPipeExpression (FrameParser.PipeExpressionContext ctx){
        Pip pip = new Pip();
        if (ctx.baseExpression() != null)
            pip.setBaseExpression(visitBaseExpression(ctx.baseExpression()));
        if (ctx.expression() != null)
            for (int i = 0; i < ctx.expression().size(); i++) {
                pip.getExpressions().add(visitExpression(ctx.expression(i)));
            }
        return pip;
    }

    @Override
    public BaseExpression visitBaseExpression (FrameParser.BaseExpressionContext ctx){
        BaseExpression baseExpression = new BaseExpression();
        if (ctx.literal() != null)
            baseExpression.setLitiral(visitLiteral(ctx.literal()));
        if (ctx.IDENTIFIER() != null)
            baseExpression.setId(ctx.IDENTIFIER().getText());
        if (ctx.functionCall() != null)
            baseExpression.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        if (ctx.arrayLiteral() != null)
            baseExpression.setArrayLitiral(visitArrayLiteral(ctx.arrayLiteral()));
        if (ctx.objectLiteral() != null)
            baseExpression.setObjectLitiral(visitObjectLiteral(ctx.objectLiteral()));

        return baseExpression;
    }

    @Override
    public Litiral visitLiteral (FrameParser.LiteralContext ctx){
        Litiral litiral = new Litiral();
        if (ctx.BOOLEAN() != null)
            litiral.setString(ctx.BOOLEAN().getText());
        if (ctx.NUMBER() != null)
            litiral.setString(ctx.NUMBER().getText());
        if (ctx.STRING() != null)
            litiral.setString(ctx.STRING().getText());
        return litiral;
    }

    @Override
    public FunctionCall visitFunctionCall (FrameParser.FunctionCallContext ctx){
        FunctionCall functionCall = new FunctionCall();
        if (ctx.IDENTIFIER() != null) {
            functionCall.setId(ctx.IDENTIFIER().getText());

        }
        if (ctx.baseExpression() != null)
            functionCall.setBaseExpression(visitBaseExpression(ctx.baseExpression()));
        if (ctx.expression() != null)
            for (int i = 0; i < ctx.expression().size(); i++) {
                functionCall.getExpressions().add(visitExpression(ctx.expression(i)));
            }
        return functionCall;
    }

    @Override
    public ArrayLitiral visitArrayLiteral (FrameParser.ArrayLiteralContext ctx){
        ArrayLitiral arrayLitiral = new ArrayLitiral();
        if (ctx.baseExpression() != null)
            arrayLitiral.setBaseExpression(visitBaseExpression(ctx.baseExpression()));
        if (ctx.expression() != null)
            for (int i = 0; i < ctx.expression().size(); i++) {
                arrayLitiral.getExpressions().add(visitExpression(ctx.expression(i)));
            }
        return arrayLitiral;
    }

    @Override
    public ObjectLitiral visitObjectLiteral (FrameParser.ObjectLiteralContext ctx){
        ObjectLitiral objectLitiral = new ObjectLitiral();
        if (ctx.expression() != null)
            for (int i = 0; i < ctx.expression().size(); i++) {
                objectLitiral.getExpressions().add(visitExpression(ctx.expression(i)));
            }
        return objectLitiral;
    }

    @Override
    public Prop visitPropLitiral (FrameParser.PropLitiralContext ctx){
        Prop prop = new Prop();
        if (ctx.baseExpression() != null)
            for (int i = 0; i < ctx.baseExpression().size(); i++) {
                prop.getBaseExpression().add(visitBaseExpression(ctx.baseExpression(i)));
            }

        if (ctx.expression() != null)
            for (int i = 0; i < ctx.expression().size(); i++) {
                prop.getExpressions().add(visitExpression(ctx.expression(i)));
            }
        return prop;
    }

    @Override
    public Inter visitInterpolation (FrameParser.InterpolationContext ctx){
        Inter inter = new Inter();
        if (ctx.expression() != null)
            inter.setExpression(visitExpression(ctx.expression()));
        return inter;
    }

    @Override
    public Text visitText (FrameParser.TextContext ctx){
        Text text = new Text();
        if (ctx.IDENTIFIER() != null)
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                text.getStrings().add(ctx.IDENTIFIER(i).getText());

            }
        if (ctx.interpolation() != null)
            for (int i = 0; i < ctx.interpolation().size(); i++) {
                text.getInters().add(visitInterpolation(ctx.interpolation(i)));
            }
        return text;
    }

    @Override
    public If_statment visitIf_statement (FrameParser.If_statementContext ctx){
        If_statment ifStatment = new If_statment();
        if (ctx.expression() != null) {
            ifStatment.setExpression(visitExpression(ctx.expression()));
        }
        if (ctx.statements() != null) {
            for (int i = 0; i < ctx.statements().size(); i++) {
                ifStatment.getStatements().add(visitStatements(ctx.statements(i)));
            }
        }
        return ifStatment;
    }

    @Override
    public LoopStatments visitLoop_statement (FrameParser.Loop_statementContext ctx){
        LoopStatments loopStatement = new LoopStatments();
        if (ctx.while_() != null)
            loopStatement.setAnwhile(visitWhile(ctx.while_()));
        if (ctx.for_() != null)
            loopStatement.setAfor(visitFor(ctx.for_()));
        if (ctx.statements() != null)
            for (int i = 0; i < ctx.statements().size(); i++) {
                loopStatement.getStatements().add(visitStatements(ctx.statements(i)));
            }
        return loopStatement;
    }

    @Override
    public While visitWhile (FrameParser.WhileContext ctx){
        While aWhile = new While();
        if (ctx.expression() != null)
            aWhile.setExpression(visitExpression(ctx.expression()));
        return aWhile;
    }

    @Override
    public For visitFor (FrameParser.ForContext ctx){
        For aFor = new For();
        if (ctx.loop_init() != null)
            aFor.setLoopInit(visitLoop_init(ctx.loop_init()));
        if (ctx.loop_step() != null)
            aFor.setLoopStep(visitLoop_step(ctx.loop_step()));
        if (ctx.expression() != null)
            aFor.setExpression(visitExpression(ctx.expression()));
        return aFor;
    }

    @Override
    public LoopInit visitLoop_init (FrameParser.Loop_initContext ctx){
        LoopInit loopInit = new LoopInit();
        if (ctx.vardeclare() != null)
            loopInit.setVarDeclare(visitVardeclare(ctx.vardeclare()));
        if (ctx.expression() != null)
            for (int i = 0; i < ctx.expression().size(); i++) {
                loopInit.getExpressions().add(visitExpression(ctx.expression(i)));
            }
        return loopInit;
    }

    @Override
    public LoopStep visitLoop_step (FrameParser.Loop_stepContext ctx){
        LoopStep loopStep = new LoopStep();
        if (ctx.expression() != null)
            for (int i = 0; i < ctx.expression().size(); i++) {
                loopStep.getExpressions().add(visitExpression(ctx.expression(i)));
            }
        return loopStep;
    }

    @Override
    public Component visitComponent (FrameParser.ComponentContext ctx){
        Component component = new Component();

        component.setScopeID(component.getCurrentScope().getId());
        component.createScope("Component");
        component.setChildeCount(ctx.getChildCount());

        if (ctx.Component() != null) {
            component.setComponent(ctx.Component().getText());
        }
        if (ctx.objects() != null) {
            component.setObjects(visitObjects(ctx.objects()));
            component.createSymbol(component.getScopeID(), component.getObjects().getValue(), "object");
        }
        //Node.removeScope();
        return component;
    }

    @Override
    public Services visitServices (FrameParser.ServicesContext ctx){
        Services services = new Services();

        services.setScopeID(services.getCurrentScope().getId());
        services.createScope("services");
        services.setChildeCount(ctx.getChildCount());

        if (ctx.Injectable() != null) {
            services.setInjectable(ctx.Injectable().getText());
        }
        if (ctx.objects() != null) {
            services.setObjects(visitObjects(ctx.objects()));
            services.createSymbol(services.getScopeID(), services.getObjects().getValue(), "Object");
        }
        //   Node.removeScope();
        return services;
    }

    @Override
    public ImportRule visitImport_rule (FrameParser.Import_ruleContext ctx){
        ImportRule importRule = new ImportRule();
        importRule.setScopeID(importRule.getCurrentScope().getId());
        importRule.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null)
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                importRule.getIds().add(ctx.IDENTIFIER(i).getText());
            }
        if (ctx.Component() != null)
            for (int i = 0; i < ctx.Component().size(); i++) {
                importRule.getStrings().add(ctx.Component(i).getText());
            }
        if (ctx.STRING() != null)
            importRule.setUrl(ctx.STRING().getText());
        return importRule;
    }

    @Override
    public Operations visitOperations (FrameParser.OperationsContext ctx){
        Operations operations = new Operations();
        operations.setScopeID(operations.getCurrentScope().getId());
        operations.setChildeCount(ctx.getChildCount());
        if (ctx.access() != null) {
            operations.setAccess(visitAccess(ctx.access()));
        }
        if (ctx.equal() != null) {
            operations.setEqual(visitEqual(ctx.equal()));
        }
        return operations;
    }

    @Override
    public Class visitClass (FrameParser.ClassContext ctx){
        Class aClass = new Class();
        aClass.setScopeID(aClass.getCurrentScope().getId());
        aClass.createScope("Class");
        aClass.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            aClass.setName(ctx.IDENTIFIER().getText());
            aClass.createSymbol(aClass.getScopeID(), aClass.getName(), "ClassIDENTIFIER");
        }
        if (ctx.classbody() != null) {
            for (int i = 0; i < ctx.classbody().size(); i++) {
                aClass.getClassBodies().add(visitClassbody(ctx.classbody(i)));

            }
        }
        //Node.removeScope();
        return aClass;
    }

    @Override
    public Var visitVar (FrameParser.VarContext ctx){
        Var var = new Var();
        var.setScopeID(var.getCurrentScope().getId());
        var.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            var.setName(ctx.IDENTIFIER().getText());

        }
        if (ctx.type() != null) {
            var.setType(visitType(ctx.type()));
        }
        if (ctx.equal() != null) {
            var.setEqual(visitEqual(ctx.equal()));
        }
        return var;
    }

    @Override
    public ClassBody visitClassbody (FrameParser.ClassbodyContext ctx){
        ClassBody classBody = new ClassBody();
        classBody.setScopeID(classBody.getCurrentScope().getId());
        classBody.setChildeCount(ctx.getChildCount());
        if (ctx.var() != null) {
            classBody.setVar(visitVar(ctx.var()));
            classBody.createSymbol(classBody.getScopeID(), classBody.getVar().getName(), classBody.getVar().getTypes());
        }
        if (ctx.constructor() != null) {
            classBody.setConstructor(visitConstructor(ctx.constructor()));
        }
        if (ctx.class_function() != null) {
            classBody.setClassFunction(visitClass_function(ctx.class_function()));

        }
        return classBody;
    }

    @Override
    public Constructor visitConstructor (FrameParser.ConstructorContext ctx){
        Constructor constructor = new Constructor();
        constructor.setScopeID(constructor.getCurrentScope().getId());
        constructor.setChildeCount(ctx.getChildCount());
        if (ctx.Constructor() != null) {
            constructor.setConstructor(ctx.Constructor().getText());
        }
        if (ctx.prameters() != null) {
            constructor.setPrameters(visitPrameters(ctx.prameters()));
        }
        if (ctx.statements() != null) {
            for (int i = 0; i < ctx.statements().size(); i++) {
                constructor.getStatements().add(visitStatements(ctx.statements(i)));
            }
        }
        return constructor;
    }

    @Override
    public Interface visitInterface (FrameParser.InterfaceContext ctx){
        Interface anInterface = new Interface();
        anInterface.setScopeID(anInterface.getCurrentScope().getId());
        anInterface.createScope("interface");
        anInterface.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            anInterface.setName(ctx.IDENTIFIER().getText());
            anInterface.createSymbol(anInterface.getScopeID(), anInterface.getName(), "interface IDENTIFIER");
        }
        if (ctx.interfacebody() != null) {
            for (int i = 0; i < ctx.interfacebody().size(); i++) {
                anInterface.getInterfaceBodies().add(visitInterfacebody(ctx.interfacebody(i)));
            }
        }
        //Node.removeScope();
        return anInterface;
    }

    @Override
    public InterfaceBody visitInterfacebody (FrameParser.InterfacebodyContext ctx){
        InterfaceBody interfaceBody = new InterfaceBody();
        interfaceBody.setScopeID(interfaceBody.getCurrentScope().getId());
        interfaceBody.setChildeCount(ctx.getChildCount());
        if (ctx.interfacefun() != null) {
            interfaceBody.setInterfaceFun(visitInterfacefun(ctx.interfacefun()));
            interfaceBody.createSymbol(interfaceBody.getScopeID(), interfaceBody.getInterfaceFun().getName(), interfaceBody.getInterfaceFun().getType());
        }
        if (ctx.interfacevar() != null) {
            interfaceBody.setInterfaceVar(visitInterfacevar(ctx.interfacevar()));
            interfaceBody.createSymbol(interfaceBody.getScopeID(), interfaceBody.getInterfaceVar().getName(), interfaceBody.getInterfaceVar().getType());
        }
        return interfaceBody;
    }

    @Override
    public InterfaceFun visitInterfacefun (FrameParser.InterfacefunContext ctx){
        InterfaceFun interfaceFun = new InterfaceFun();
        interfaceFun.setScopeID(interfaceFun.getCurrentScope().getId());
        interfaceFun.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            interfaceFun.setName(ctx.IDENTIFIER().getText());
        }
        if (ctx.prameters() != null) {
            interfaceFun.setPrameters(visitPrameters(ctx.prameters()));
        }
        if (ctx.Type() != null) {
            interfaceFun.setType(ctx.Type().getText());
        }
        return interfaceFun;
    }

    @Override
    public InterfaceVar visitInterfacevar (FrameParser.InterfacevarContext ctx){
        InterfaceVar interfaceVar = new InterfaceVar();
        interfaceVar.setScopeID(interfaceVar.getCurrentScope().getId());
        interfaceVar.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            interfaceVar.setName(ctx.IDENTIFIER().getText());
        }
        if (ctx.Type() != null) {
            interfaceVar.setType(ctx.Type().getText());
        }
        return interfaceVar;
    }

    @Override
    public Enum visitEnum (FrameParser.EnumContext ctx){
        Enum anEnum = new Enum();
        anEnum.setScopeID(anEnum.getCurrentScope().getId());
        anEnum.createScope("Enum");
        anEnum.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            anEnum.setName(ctx.IDENTIFIER().getText());
            anEnum.createSymbol(anEnum.getScopeID(), anEnum.getName(), "Enum IDENTIFIER");
        }
        if (ctx.enumassignable() != null) {
            anEnum.setEnumAssignable(visitEnumassignable(ctx.enumassignable()));
        }
        // Node.removeScope();
        return anEnum;
    }

    @Override
    public EnumAssignable visitEnumassignable (FrameParser.EnumassignableContext ctx){
        EnumAssignable enumAssignable = new EnumAssignable();
        enumAssignable.setScopeID(enumAssignable.getCurrentScope().getId());
        enumAssignable.setChildeCount(ctx.getChildCount());
        if (ctx.enumAssin() != null) {
            for (int i = 0; i < ctx.enumAssin().size(); i++) {
                enumAssignable.getEnumAssins().add(visitEnumAssin(ctx.enumAssin(i)));
            }
        }
        return enumAssignable;
    }

    @Override
    public EnumAssin visitEnumAssin (FrameParser.EnumAssinContext ctx){
        EnumAssin enumAssin = new EnumAssin();
        enumAssin.setScopeID(enumAssin.getCurrentScope().getId());
        enumAssin.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            enumAssin.setName(ctx.IDENTIFIER().getText());
            enumAssin.createSymbol(enumAssin.getScopeID(), enumAssin.getName(), "Enum Variable");
        }
        if (ctx.number_STRING_BOOLEAN() != null) {
            enumAssin.setNumberStringBool(visitNumber_STRING_BOOLEAN(ctx.number_STRING_BOOLEAN()));
        }
        return enumAssin;
    }


    @Override
    public ClassFunction visitClass_function (FrameParser.Class_functionContext ctx){
        ClassFunction classFunction = new ClassFunction();
        classFunction.setScopeID(classFunction.getCurrentScope().getId());
        classFunction.createScope("Function");
        classFunction.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            classFunction.setName(ctx.IDENTIFIER().getText());
            classFunction.createSymbol(classFunction.getScopeID(), classFunction.getName(), "Function declare");

        }
        if (ctx.header() != null) {
            classFunction.setHeader(visitHeader(ctx.header()));
            classFunction.createSymbol(classFunction.getScopeID(), classFunction.getName(), classFunction.getHeader().getValue());

        }
        if (ctx.body() != null) {
            classFunction.setBody(visitBody(ctx.body()));
        }
        //Node.removeScope();
        return classFunction;
    }

    @Override
    public Function visitFunction (FrameParser.FunctionContext ctx){
        Function function = new Function();
        function.setScopeID(function.getCurrentScope().getId());
        function.setChildeCount(ctx.getChildCount());
        if (ctx.Function() != null) {
            function.setFunction(ctx.Function().getText());
        }
        if (ctx.class_function() != null) {
            function.setClassFunction(visitClass_function(ctx.class_function()));
        }
        return function;
    }

    @Override
    public BodyWithOutCurly visitBody_with_out_curly (FrameParser.Body_with_out_curlyContext ctx){
        BodyWithOutCurly bodyWithOutCurly = new BodyWithOutCurly();
        bodyWithOutCurly.setScopeID(bodyWithOutCurly.getCurrentScope().getId());
        bodyWithOutCurly.setChildeCount(ctx.getChildCount());
        if (ctx.statements() != null) {
            bodyWithOutCurly.setStatements(visitStatements(ctx.statements()));
        }
        if (ctx.return_() != null) {
            bodyWithOutCurly.setaReturn(visitReturn(ctx.return_()));
        }
        return bodyWithOutCurly;
    }

    @Override
    public Body visitBody (FrameParser.BodyContext ctx){
        Body body = new Body();
        body.setScopeID(body.getCurrentScope().getId());
        body.setChildeCount(ctx.getChildCount());
        if (ctx.statements() != null) {
            for (int i = 0; i < ctx.statements().size(); i++) {
                body.getStatements().add(visitStatements(ctx.statements(i)));
            }
        }
        if (ctx.return_() != null) {
            body.setaReturn(visitReturn(ctx.return_()));
        }
        return body;
    }

    @Override
    public BaseData visitBasedata (FrameParser.BasedataContext ctx){
        BaseData baseData = new BaseData();
        baseData.setScopeID(baseData.getCurrentScope().getId());
        baseData.setChildeCount(ctx.getChildCount());
        if (ctx.info() != null)
            baseData.setInfo((Info) visit(ctx.info()));
        if (ctx.IDENTIFIER() != null) {
            baseData.setId(ctx.IDENTIFIER().getText());
        }
        return baseData;
    }


    @Override
    public Array visitArray (FrameParser.ArrayContext ctx){
        Array array = new Array();
        array.setScopeID(array.getCurrentScope().getId());
        array.setChildeCount(ctx.getChildCount());
        if (ctx.basedata() != null) {
            for (int i = 0; i < ctx.basedata().size(); i++) {
                array.getBaseData().add(visitBasedata(ctx.basedata(i)));
            }
        }
        return array;
    }

    @Override
    public Data visitData (FrameParser.DataContext ctx){
        Data data = new Data();
        data.setScopeID(data.getCurrentScope().getId());
        data.setChildeCount(ctx.getChildCount());
        if (ctx.arrowfunction() != null) {
            data.setArrowFunction(visitArrowfunction(ctx.arrowfunction()));
        }
        if (ctx.basedata() != null) {
            data.setBaseData(visitBasedata(ctx.basedata()));
        }

        return data;
    }

    @Override
    public TypeEqual visitTypeequal (FrameParser.TypeequalContext ctx){
        TypeEqual typeEqual = new TypeEqual();
        typeEqual.setScopeID(typeEqual.getCurrentScope().getId());
        typeEqual.setChildeCount(ctx.getChildCount());

        if (ctx.cullfunction() != null) {
            typeEqual.setCullFunction(visitCullfunction(ctx.cullfunction()));
        }
        if (ctx.access() != null) {
            typeEqual.setAccess(visitAccess(ctx.access()));
        }
        if (ctx.typecurles() != null) {
            typeEqual.setTypeCurles(visitTypecurles(ctx.typecurles()));
        }
        return typeEqual;
    }

    @Override
    public Return visitReturn (FrameParser.ReturnContext ctx){
        Return aReturn = new Return();
        aReturn.setScopeID(aReturn.getCurrentScope().getId());
        aReturn.setChildeCount(ctx.getChildCount());
        if (ctx.Return() != null) {
            aReturn.setReturn(ctx.Return().getText());
        }
        if (ctx.basedata() != null) {
            aReturn.setBaseData(visitBasedata(ctx.basedata()));
            aReturn.createSymbol(aReturn.getScopeID(), aReturn.getBaseData().getValue(), "return var");
        }
        return aReturn;
    }

    @Override
    public TypeDeclare visitTypedeclare (FrameParser.TypedeclareContext ctx){
        TypeDeclare typeDeclare = new TypeDeclare();
        typeDeclare.setScopeID(typeDeclare.getCurrentScope().getId());
        typeDeclare.createScope("Type Scoep");
        typeDeclare.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            typeDeclare.setNmae(ctx.IDENTIFIER().getText());
            typeDeclare.createSymbol(typeDeclare.getScopeID(), typeDeclare.getNmae(), "Type IDENTIFIER");
        }

        if (ctx.typeequal() != null) {
            typeDeclare.setTypeEqual(visitTypeequal(ctx.typeequal()));
        }
        return typeDeclare;
    }

    @Override
    public Prameters visitPrameters (FrameParser.PrametersContext ctx){
        Prameters prameters = new Prameters();
        prameters.setScopeID(prameters.getCurrentScope().getId());
        prameters.setChildeCount(ctx.getChildCount());
        if (ctx.prameter() != null) {
            for (int i = 0; i < ctx.prameter().size(); i++) {
                prameters.getPrameters().add(visitPrameter(ctx.prameter(i)));
            }
        }
        return prameters;
    }

    @Override
    public Header visitHeader (FrameParser.HeaderContext ctx){
        Header header = new Header();
        header.setScopeID(header.getCurrentScope().getId());
        header.setChildeCount(ctx.getChildCount());
        if (ctx.prameters() != null) {
            header.setPrameters(visitPrameters(ctx.prameters()));
        }
        if (ctx.type() != null) {
            header.setType(visitType(ctx.type()));
        }
        return header;
    }

    @Override
    public ArrowFunction visitArrowfunction (FrameParser.ArrowfunctionContext ctx){
        ArrowFunction arrowFunction = new ArrowFunction();
        arrowFunction.setScopeID(arrowFunction.getCurrentScope().getId());
        arrowFunction.createScope("Arrow Function");
        arrowFunction.setChildeCount(ctx.getChildCount());
        if (ctx.header() != null) {
            arrowFunction.setHeader(visitHeader(ctx.header()));
        }
        if (ctx.body() != null) {
            arrowFunction.setBody(visitBody(ctx.body()));
        }
        if (ctx.body_with_out_curly() != null) {
            arrowFunction.setBodyWithOutCurly(visitBody_with_out_curly(ctx.body_with_out_curly()));
        }
        // Node.removeScope();
        return arrowFunction;
    }

    @Override
    public Print visitPrint (FrameParser.PrintContext ctx){
        Print print = new Print();
        print.setScopeID(print.getCurrentScope().getId());
        print.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            print.setString(ctx.IDENTIFIER().getText());
        }
        if (ctx.arguments() != null)
            print.setArguments(visitArguments(ctx.arguments()));
        return print;
    }

    @Override
    public Prameter visitPrameter (FrameParser.PrameterContext ctx){
        Prameter prameter = new Prameter();
        prameter.setScopeID(prameter.getCurrentScope().getId());
        prameter.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            prameter.setName(ctx.IDENTIFIER().getText());

        }
        if (ctx.type() != null) {
            prameter.setType(visitType(ctx.type()));
            prameter.createSymbol(prameter.getScopeID(), prameter.getName(), prameter.getType().getValue());
        }
        if (ctx.equal() != null) {
            prameter.setEqual(visitEqual(ctx.equal()));
        }
        if (ctx.objects() != null) {
            prameter.setObjects(visitObjects(ctx.objects()));
            prameter.createSymbol(prameter.getScopeID(), prameter.getObjects().getValue(), "Object");
        }
        return prameter;
    }

    @Override
    public Arguments visitArguments (FrameParser.ArgumentsContext ctx){
        Arguments arguments = new Arguments();
        arguments.setScopeID(arguments.getCurrentScope().getId());
        arguments.setChildeCount(ctx.getChildCount());
        if (ctx.argument() != null) {
            for (int i = 0; i < ctx.argument().size(); i++) {
                arguments.getArguments().add(visitArgument(ctx.argument(i)));
            }
        }
        return arguments;
    }

    @Override
    public Argument visitArgument (FrameParser.ArgumentContext ctx){
        Argument argument = new Argument();
        argument.setScopeID(argument.getCurrentScope().getId());
        argument.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            argument.setName(ctx.IDENTIFIER().getText());
            argument.createSymbol(argument.getScopeID(), argument.getName(), "Var");
        }
        if (ctx.equalbasedata() != null) {
            argument.setEqualBaseData(visitEqualbasedata(ctx.equalbasedata()));
        }
        if (ctx.objects() != null) {
            argument.setObjects(visitObjects(ctx.objects()));

            argument.createSymbol(argument.getScopeID(), argument.getObjects().getValue(), "Object");
        }
        if (ctx.basedata() != null) {
            argument.setBaseData(visitBasedata(ctx.basedata()));

            argument.createSymbol(argument.getScopeID(), argument.getBaseData().getValue(), "dataType");
        }
        if (ctx.arrowfunction() != null) {
            argument.setArrowFunction(visitArrowfunction(ctx.arrowfunction()));

            argument.createSymbol(argument.getScopeID(), argument.getArrowFunction().getValue(), "arrow function");
        }
        return argument;
    }

    @Override
    public VarDeclare visitVardeclare (FrameParser.VardeclareContext ctx){
        VarDeclare varDeclare = new VarDeclare();
        varDeclare.setScopeID(varDeclare.getCurrentScope().getId());
        varDeclare.setChildeCount(ctx.getChildCount());
        if (ctx.keyword() != null) {
            varDeclare.setKey(visitKeyword(ctx.keyword()));
        }
        if (ctx.prameter() != null) {
            varDeclare.setPrameter(visitPrameter(ctx.prameter()));
            if (varDeclare.getPrameter().getType() != null)
                varDeclare.createSymbol(varDeclare.getScopeID(), varDeclare.getPrameter().getValue(), varDeclare.getPrameter().getType().getValue());
        }
        return varDeclare;
    }

    @Override
    public Equal visitEqual (FrameParser.EqualContext ctx){
        Equal equal = new Equal();
        equal.setScopeID(equal.getCurrentScope().getId());
        equal.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            equal.setName(ctx.IDENTIFIER().getText());
            equal.createSymbol(equal.getScopeID(), equal.getName(), "VarIDENTIFIER");
        }
        if (ctx.data() != null) {
            equal.setData(visitData(ctx.data()));
        }
        return equal;
    }

    @Override
    public EqualBaseData visitEqualbasedata (FrameParser.EqualbasedataContext ctx){
        EqualBaseData equalBaseData = new EqualBaseData();
        equalBaseData.setScopeID(equalBaseData.getCurrentScope().getId());
        equalBaseData.setChildeCount(ctx.getChildCount());
        if (ctx.basedata() != null) {
            equalBaseData.setBaseData(visitBasedata(ctx.basedata()));
        }
        return equalBaseData;
    }

    @Override
    public Types visitTypes (FrameParser.TypesContext ctx){
        Types types = new Types();
        types.setScopeID(types.getCurrentScope().getId());
        types.setChildeCount(ctx.getChildCount());
        if (ctx.Type() != null) {
            types.setTypee(ctx.Type().getText());
        }
        if (ctx.IDENTIFIER() != null) {
            types.setName(ctx.IDENTIFIER().getText());
        }
        if (ctx.Void() != null) {
            types.setVoidd(ctx.Void().getText());
        }
        if (ctx.Never() != null) {
            types.setNever(ctx.Never().getText());
        }
        if (ctx.objectstype() != null) {
            types.setType(visitObjectstype(ctx.objectstype()));
        }
        return types;
    }

    @Override
    public Type visitType (FrameParser.TypeContext ctx){
        Type type = new Type();
        type.setScopeID(type.getCurrentScope().getId());
        type.setChildeCount(ctx.getChildCount());
        if (ctx.types() != null) {
            for (int i = 0; i < ctx.types().size(); i++) {
                type.getTypes().add(visitTypes(ctx.types(i)));
            }
        }
        return type;
    }

    @Override
    public Access visitAccess (FrameParser.AccessContext ctx){
        Access access = new Access();
        access.setScopeID(access.getCurrentScope().getId());
        access.setChildeCount(ctx.getChildCount());
        if (ctx.culls() != null) {
            for (int i = 0; i < ctx.culls().size(); i++) {
                access.getCulls().add(visitCulls(ctx.culls(i)));
            }
        }
        return access;
    }

    @Override
    public Culls visitCulls (FrameParser.CullsContext ctx){
        Culls culls = new Culls();
        culls.setScopeID(culls.getCurrentScope().getId());
        culls.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            culls.setName(ctx.IDENTIFIER().getText());
        }
        if (ctx.cullfunction() != null) {
            culls.setCullFunction(visitCullfunction(ctx.cullfunction()));
        }
        if (ctx.array() != null) {
            culls.setArray(visitArray(ctx.array()));
        }
        return culls;
    }

    @Override
    public CullFunction visitCullfunction (FrameParser.CullfunctionContext ctx){
        CullFunction cullFunction = new CullFunction();
        cullFunction.setScopeID(cullFunction.getCurrentScope().getId());
        cullFunction.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            cullFunction.setName(ctx.IDENTIFIER().getText());
        }
        if (ctx.arguments() != null) {
            cullFunction.setArguments(visitArguments(ctx.arguments()));
        }
        return cullFunction;
    }

    @Override
    public Objects visitObjects (FrameParser.ObjectsContext ctx){
        Objects objects = new Objects();
        objects.setScopeID(objects.getCurrentScope().getId());
        objects.createScope("object");
        objects.setChildeCount(ctx.getChildCount());
        if (ctx.object() != null) {
            for (int i = 0; i < ctx.object().size(); i++) {
                objects.getObjects().add(visitObject(ctx.object(i)));
                objects.createSymbol(objects.getScopeID(), objects.getObjects().get(i).getValue(), "Objects");
            }
        }
        //Node.removeScope();
        return objects;
    }

    @Override
    public Ast_Class.TypeScriptClasses.Object visitObject (FrameParser.ObjectContext ctx){
        Ast_Class.TypeScriptClasses.Object object = new Ast_Class.TypeScriptClasses.Object();
        object.setScopeID(object.getCurrentScope().getId());

        object.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            object.setName(ctx.IDENTIFIER().getText());
            object.createSymbol(object.getScopeID(), object.getName(), "object var");
        }
        if (ctx.data() != null) {
            object.setData(visitData(ctx.data()));
        }

        return object;
    }

    @Override
    public ObjectsType visitObjectstype (FrameParser.ObjectstypeContext ctx){
        ObjectsType objectsType = new ObjectsType();
        objectsType.setScopeID(objectsType.getCurrentScope().getId());
        objectsType.setChildeCount(ctx.getChildCount());
        if (ctx.objecttype() != null) {
            for (int i = 0; i < ctx.objecttype().size(); i++) {
                objectsType.getObjectTypes().add(visitObjecttype(ctx.objecttype(i)));
            }
        }
        return objectsType;
    }

    @Override
    public ObjectType visitObjecttype (FrameParser.ObjecttypeContext ctx){
        ObjectType objectType = new ObjectType();
        objectType.setScopeID(objectType.getCurrentScope().getId());
        objectType.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            objectType.setName(ctx.IDENTIFIER().getText());
        }
        if (ctx.Type() != null) {
            objectType.setType(ctx.Type().getText());
        }
        return objectType;
    }

    @Override
    public TypeCurles visitTypecurles (FrameParser.TypecurlesContext ctx){
        TypeCurles typeCurles = new TypeCurles();
        typeCurles.setScopeID(typeCurles.getCurrentScope().getId());
        typeCurles.setChildeCount(ctx.getChildCount());
        if (ctx.typecurle() != null) {
            for (int i = 0; i < ctx.typecurle().size(); i++) {
                typeCurles.getTypeCurles().add(visitTypecurle(ctx.typecurle(i)));
            }
        }
        return typeCurles;
    }

    @Override
    public TypeCurle visitTypecurle (FrameParser.TypecurleContext ctx){
        TypeCurle typeCurle = new TypeCurle();
        typeCurle.setScopeID(typeCurle.getCurrentScope().getId());
        typeCurle.setChildeCount(ctx.getChildCount());
        if (ctx.IDENTIFIER() != null) {
            typeCurle.setName(ctx.IDENTIFIER().getText());
        }
        if (ctx.Type() != null) {
            typeCurle.setType(ctx.Type().getText());
        }
        if (ctx.data() != null) {
            typeCurle.setData(visitData(ctx.data()));
        }
        return typeCurle;
    }

    @Override
    public Variable visitVariable (FrameParser.VariableContext ctx){
        Variable variable = new Variable();
        if (ctx.number_STRING_BOOLEAN() != null) {
            variable.setNumberStringBool(visitNumber_STRING_BOOLEAN(ctx.number_STRING_BOOLEAN()));
        }
        return variable;
    }

    @Override
    public ObjectsLable visitObjectss (FrameParser.ObjectssContext ctx){
        ObjectsLable objects = new ObjectsLable();
        if (ctx.objects() != null) {
            objects.setObjects(visitObjects(ctx.objects()));
        }
        return objects;
    }

    @Override
    public CallFunction visitCallFunction (FrameParser.CallFunctionContext ctx){
        CallFunction function = new CallFunction();
        if (ctx.cullfunction() != null) {
            function.setCullFunction(visitCullfunction(ctx.cullfunction()));
        }
        return function;
    }

    @Override
    public AccessLable visitAccesss (FrameParser.AccesssContext ctx){
        AccessLable accessLable = new AccessLable();
        if (ctx.access() != null)
            accessLable.setAccess(visitAccess(ctx.access()));
        return accessLable;
    }

    @Override
    public ArratLable visitArrays (FrameParser.ArraysContext ctx){
        ArratLable arratLable = new ArratLable();
        if (ctx.array() != null) {
            arratLable.setArray(visitArray(ctx.array()));
        }
        return arratLable;
    }

    @Override
    public AngularTemplet visitAngularTemplet (FrameParser.AngularTempletContext ctx){
        AngularTemplet templetLable = new AngularTemplet();
        if (ctx.template() != null)
            templetLable.setTemplet(visitTemplate(ctx.template()));
        return templetLable;
    }

    @Override
    public QutAngular visitQuitAngulat (FrameParser.QuitAngulatContext ctx){
        QutAngular qutAngular = new QutAngular();
        if (ctx.template() != null) {
            qutAngular.setTemplet(visitTemplate(ctx.template()));
        }
        return qutAngular;
    }

    @Override
    public Charcter visitCharacters (FrameParser.CharactersContext ctx){
        Charcter charcter = new Charcter();
        if (ctx.character() != null)
            charcter.setaChar(visitCharacter(ctx.character()));
        return charcter;
    }

    @Override
    public TextLable visitTexts (FrameParser.TextsContext ctx){
        TextLable textLable = new TextLable();
        if (ctx.text() != null)
            textLable.setText(visitText(ctx.text()));
        return textLable;
    }

    @Override
    public Html visitHtml (FrameParser.HtmlContext ctx){
        Html html = new Html();
        if (ctx.htmlElement() != null)
            html.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        return html;
    }

    @Override
    public AngularComponent visitAngularComponents (FrameParser.AngularComponentsContext ctx){
        AngularComponent angularComponent = new AngularComponent();
        if (ctx.angularComponent() != null) {
            angularComponent.setAngular(visitAngularComponent(ctx.angularComponent()));
        }
        return angularComponent;
    }

    @Override
    public Dirictive visitDirective (FrameParser.DirectiveContext ctx){
        Dirictive dirictive = new Dirictive();
        if (ctx.directiveElement() != null) {
            dirictive.setDirictiveElement((DirictiveElement) visit(ctx.directiveElement()));
        }
        return dirictive;
    }

    @Override
    public Structural visitStructural (FrameParser.StructuralContext ctx){
        Structural structural = new Structural();
        if (ctx.structuralDirective() != null)
            structural.setStructural(visitStructuralDirective(ctx.structuralDirective()));

        return structural;
    }

    @Override
    public AttributeLable visitAttributes (FrameParser.AttributesContext ctx){
        AttributeLable attributeLable = new AttributeLable();
        if (ctx.attributeDirective() != null)
            attributeLable.setAttributeLable(visitAttributeDirective(ctx.attributeDirective()));
        return attributeLable;
    }

    @Override
    public Object visitTwoWay (FrameParser.TwoWayContext ctx){
        Towway towway = new Towway();
        if (ctx.twoWayDirective() != null) {
            towway.setTowwayDirective(visitTwoWayDirective(ctx.twoWayDirective()));
        }
        return towway;
    }

    private boolean isValidStructuralDirectiveTarget (StructuralDirective angular){
        return angular.getString().equals("*ngIf") || angular.getString().equals("*ngFor");
    }

    private boolean checkDirectiveUsage (StructuralDirective angular,int line, int column){
        if (angular.getString() != null && angular.getString().startsWith("*")) {
            if (!isValidStructuralDirectiveTarget(angular)) {
                errorCollector.addError(new DirectiveUsageError(angular.getString(), line, column));
                return false;
            }
        }
        return true;
    }

    private boolean checkTemplateVariableDeclared (String varName,int currentScopeID){
        Symbol symbol = Main.symbolTable.getScopeByID(currentScopeID).searchForSymbol(varName);
        if (symbol == null || symbol.getScope().getId() > currentScopeID) {
            errorCollector.addError(new TemplateVariableError(varName, currentScopeID, currentScopeID));
            return false;
        }
        return true;
    }
    private boolean isValidPropertyForElement (String elementName, String propertyName){
        if(elementName!=""){
            switch (elementName) {
                case "input":
                    return propertyName.equals("value") || propertyName.equals("placeholder");
                case "a":
                    return propertyName.equals("routerLink") || propertyName.equals("href");
                case "button":
                    return propertyName.equals("click") || propertyName.equals("disabled");
                default:
                    return true;
            }}
        return true;
    }


    private boolean isFunctionDefined(String functionName, int currentScopeID) {
        for (Scope scope : Main.symbolTable.getScopes()) {
            Symbol symbol = scope.searchForSymbol(functionName);
            if (symbol != null &&
                    symbol.getType() != null &&
                    symbol.getType().equalsIgnoreCase("Function declare") &&
                    symbol.getScope().getId() <= currentScopeID) {
                return true;
            }
        }
        return false;
    }






}

