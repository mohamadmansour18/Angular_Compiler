package Visitor;

import Ast_Class.HTML_Classes.*;
import Ast_Class.Node.Node;
import Ast_Class.TS_Classes.*;


public class BaseAstVisitor implements AST_Visitor {

    @Override
    public void visit(HTMLDivLabel div) {
        System.out.println("========== [DIV NODE] ==========");
        System.out.println("-> Child Count <- : " + div.getChildeCount());
        for (DivAttribute attr : div.getAttributes()) {
            attr.accept(this);
        }

        for (DivContentNode contentNode : div.getContent()) {
            contentNode.accept(this);
        }

    }

    @Override
    public void visit(DivAttribute attribute) {
        System.out.println("========== [Div Attribute] ==========");
        System.out.println("-> Child Count <- : " + attribute.getChildeCount());
        if(attribute.getAttributeType() != null && attribute.getAttributeValue() != null)
        {
            System.out.println("[Div Attribute] " + attribute.getValue());
        }

    }

    @Override
    public void visit(ImgAttribute attribute) {
        System.out.println("========== [IMG ATTRIBUTE] ==========");
        System.out.println("-> Child Count <- : " + attribute.getChildeCount());
        if(attribute.getAttributeType() != null && attribute.getAttributeValue() != null)
        {
            System.out.println("[Img Attribute] " + attribute.getValue());
        }
    }

    @Override
    public void visit(DivImageLabel image) {
        System.out.println("========== [IMG NODE] ==========");
        System.out.println("-> Child Count <- : " + image.getChildeCount());
        for (ImgAttribute attr : image.getAttributes()) {
            attr.accept(this);
        }

    }

    @Override
    public void visit(ButtonAttribute attr) {
        System.out.println("========== [BUTTON ATTRIBUTE] ==========");
        if (attr.getAttributeValue() == null) {
            System.out.println("[Button Attribute] " + attr.getAttributeType());
        } else {
            System.out.println("[Button Attribute] " + attr.getAttributeType() + "=\"" + attr.getAttributeValue() + "\"");
        }
    }

    @Override
    public void visit(ButtonContent content) {
        if(content.getRawContent() != null)
        {
            System.out.println("[Button Content] " + content.getRawContent());
        }
    }

    @Override
    public void visit(DivButtonLabel node) {
        System.out.println("========== [BUTTON NODE] ==========");

        for (ButtonAttribute attr : node.getAttributes()) {
            attr.accept(this);
        }

        if (node.getContent() != null) {
            node.getContent().accept(this);
        }
    }

    @Override
    public void visit(InputAttribute attribute) {
        System.out.println("[Input Attribute] " + attribute.getValue());
    }

    @Override
    public void visit(DivInputLabel input) {
        System.out.println("========== [INPUT NODE] ==========");
        for (InputAttribute attr : input.getAttributes()) {
            attr.accept(this);
        }
        System.out.println("DIV INPUT HTML : " + input.getValue());

    }

    @Override
    public void visit(ParagraphAttribute attribute) {
        System.out.println("[Paragraph Attribute] " + attribute.getValue());
    }

    @Override
    public void visit(ParagraphTextLabel text) {
        System.out.println("[Paragraph Text] " + text.getText());
    }

    @Override
    public void visit(DivParagraphLabel paragraph) {
        System.out.println("========== [PARAGRAPH NODE] ==========");
        for (ParagraphAttribute attr : paragraph.getAttributes()) {
            attr.accept(this);
        }
        if (paragraph.getContent() != null) {
            paragraph.getContent().accept(this);
        }

    }

    @Override
    public void visit(ParagraphImageLabel image) {
        System.out.println("========== [PARAGRAPH IMG NODE] ==========");
        for (ImgAttribute attr : image.getAttributes()) {
            attr.accept(this);
        }
    }

    @Override
    public void visit(ParagraphButtonLabel button) {
        System.out.println("========== [PARAGRAPH BUTTON NODE] ==========");
        for (ButtonAttribute attr : button.getAttributes()) {
            attr.accept(this);
        }
        if (button.getContent() != null) {
            button.getContent().accept(this);
        }

    }

    @Override
    public void visit(ParagraphInputLabel input) {
        System.out.println("========== [PARAGRAPH INPUT NODE] ==========");
        for (InputAttribute attr : input.getAttributes()) {
            attr.accept(this);
        }
    }

    @Override
    public void visit(DivNestedLabel nestedDiv) {
        System.out.println("========== [NESTED DIV NODE] ==========");
        for (DivAttribute attr : nestedDiv.getAttributes()) {
            attr.accept(this);
        }
        for (DivContentNode content : nestedDiv.getContent()) {
            content.accept(this);
        }

    }

    @Override
    public void visit(DivRouterOutletLabel outlet) {
        System.out.println("[Router Outlet]");
    }

    @Override
    public void visit(DivNgIfLabel ngIf) {
        System.out.println("[ngIf Directive] condition = " + ngIf.getCondition());
    }

    @Override
    public void visit(DivNgForLabel ngFor) {
        System.out.println("[ngFor Directive] loop = " + ngFor.getLoopExpression());
    }

    @Override
    public void visit(DivPlainTextLabel text){
        System.out.println("[Div text Directive] = " + text.getText());
    };

    @Override
    public void visit(FormAttribute attribute) {
        System.out.println("[Form Attribute] " + attribute.getValue());
    }

    @Override
    public void visit(HTMLFormLabel form) {
        System.out.println("========== [FORM NODE] ==========");
        for (FormAttribute attr : form.getAttributes()) {
            attr.accept(this);
        }
        for (FormContentNode node : form.getContent()) {
            node.accept(this);
        }
        System.out.println("FORM HTML : " + form.getValue());
    }

    @Override
    public void visit(FormInputLabel input) {
        System.out.println("========== [FORM INPUT NODE] ==========");
        for (InputAttribute attr : input.getAttributes()) {
            attr.accept(this);
        }
    }

    @Override
    public void visit(FormButtonLabel button) {
        System.out.println("========== [FORM BUTTON NODE] ==========");
        for (ButtonAttribute attr : button.getAttributes()) {
            attr.accept(this);
        }
        if (button.getContent() != null) {
            button.getContent().accept(this);
        }
        System.out.println("=========================================");
    }

    @Override
    public void visit(LabelAttribute attr) {
        System.out.println("[Label Attribute] " + attr.getAttributeType() + " = " + attr.getAttributeValue());
    }

    @Override
    public void visit(LabelContent content) {
        if (content.getText() != null) {
            System.out.println("[Label Content TEXT] " + content.getText());
        } else if (content.getSpan() != null) {
            System.out.println("[Label Content -> SPAN]");
            content.getSpan().accept(this);
        } else if (content.getInput() != null) {
            System.out.println("[Label Content -> INPUT]");
            content.getInput().accept(this);
        } else {
            System.out.println("[Label Content] <empty>");
        }
    }

    @Override
    public void visit(FormLabel label) {
        System.out.println("========== [FORM LABEL NODE] ==========");
        for (LabelAttribute attr : label.getAttributes()) {
            attr.accept(this);
        }
        if (label.getContent() != null) {
            label.getContent().accept(this);
        }
        System.out.println("========================================");
    }

    @Override
    public void visit(FormDivLabel formDiv) {
        System.out.println("========== [FORM DIV NODE] ==========");
        for (DivAttribute attr : formDiv.getAttributes()) {
            attr.accept(this);
        }
        for (DivContentNode content : formDiv.getContent()) {
            content.accept(this);
        }
        System.out.println("=====================================");
    }

    @Override
    public void visit(FormTextLabel text) {
        System.out.println("[Form Text] " + text.getText());
    }

    @Override
    public void visit(HTMLParagraphLabel paragraph) {
        System.out.println("========== [PARAGRAPH NODE] ==========");
        for (ParagraphAttribute attr : paragraph.getAttributes()) {
            attr.accept(this);
        }
        if (paragraph.getContent() != null) {
            paragraph.getContent().accept(this);
        }
        System.out.println("======================================");
    }

    @Override
    public void visit(HTMLButtonLabel button) {
        System.out.println("========== [HTML BUTTON NODE] ==========");
        for (ButtonAttribute attr : button.getAttributes()) {
            attr.accept(this);
        }
        if (button.getContent() != null) {
            button.getContent().accept(this);
        }
        System.out.println("=========================================");
    }

    @Override
    public void visit(HTMLInputLabel input) {
        System.out.println("========== [HTML INPUT NODE] ==========");
        for (InputAttribute attr : input.getAttributes()) {
            attr.accept(this);
        }
        System.out.println("========================================");
    }

    @Override
    public void visit(HTMLImageLabel image) {
        System.out.println("========== [HTML IMAGE NODE] ==========");
        for (ImgAttribute attr : image.getAttributes()) {
            attr.accept(this);
        }
        System.out.println("========================================");
    }

    @Override
    public void visit(HTMLLabel label) {
        System.out.println("========== [HTML LABEL NODE] ==========");
        for (LabelAttribute attr : label.getAttributes()) {
            attr.accept(this);
        }
        for (LabelContent c : label.getContents()) {
            if (c != null) {
                c.accept(this);
            }
        }
        System.out.println("========================================");
    }

    @Override
    public void visit(HTMLRouterOutletLabel routerOutlet) {
        System.out.println("[HTML RouterOutlet Node]");
    }


    @Override
    public void visit(HTMLSpanLabel span) {
        System.out.println("========== [HTML SPAN NODE] ==========");
        for (SpanAttribute attr : span.getAttributes()) {
            attr.accept(this);
        }
        if (span.getContent() != null) {
            span.getContent().accept(this);
        }
        System.out.println("=======================================");
    }

    @Override
    public void visit(HTMLAnchorLabel anchor) {
        System.out.println("========== [HTML ANCHOR NODE] ==========");
        for (AnchorAttribute attr : anchor.getAttributes()) {
            attr.accept(this);
        }
        if (anchor.getContent() != null) {
            anchor.getContent().accept(this);
        }
        System.out.println("========================================");
    }

    @Override
    public void visit(SpanAttribute attr) {
        System.out.println("SPAN ATTR -> " + attr.getValue());
    }

    @Override
    public void visit(SpanContent content) {
        System.out.println("SPAN CONTENT -> " + content.getValue());
    }

    @Override
    public void visit(AnchorAttribute attr) {
        System.out.println("A ATTR -> " + attr.getValue());
    }

    @Override
    public void visit(AnchorContent content) {
        System.out.println("A CONTENT -> " + content.getValue());
    }

    @Override
    public void visit(DivSpanLabel node) {
        System.out.println("========== [DIV SPAN CONTENT] ==========");
        if (node.getSpan() != null) node.getSpan().accept(this);
        System.out.println("========================================");
    }

    @Override
    public void visit(DivAnchorLabel node) {
        System.out.println("========== [DIV ANCHOR CONTENT] ==========");
        if (node.getAnchor() != null) node.getAnchor().accept(this);
        System.out.println("==========================================");
    }

    @Override
    public void visit(DivLabel node) {
        System.out.println("========== [DIV LABEL CONTENT] ==========");
        if (node.getLabel() != null) node.getLabel().accept(this);
        System.out.println("=========================================");
    }

    //------------------------------------{ TS Function }------------------------------------//
    @Override
    public void visit(RootProgram root) {
        System.out.println("========== [ROOT PROGRAM] ==========");

        for (ProgramNode p : root.getPrograms()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(ProgramNode program) {
        System.out.println("========== [PROGRAM NODE] ==========");

        for (StatementsNode st : program.getStatements()) {
            st.accept(this);
        }
    }

    @Override
    public void visit(StatementsNode node) {
        System.out.println("========== [STATEMENTS NODE] ==========");
        System.out.println("Has Semicolon: " + node.isHasSemicolon());

        if (node.getStatement() != null) {
            node.getStatement().accept(this);
        }
    }

    @Override
    public void visit(ImportStatement1 node) {
        System.out.println("========== [IMPORT STATEMENT] ==========");
        System.out.println("Imported Name : " + node.getImportedName());
        System.out.println("From Module   : " + node.getModuleLiteral());
    }

    @Override
    public void visit(ClassStatement1 node) {
        System.out.println("========== [CLASS STATEMENT] ==========");
        System.out.println("Name     : " + node.getName());
        System.out.println("Exported : " + node.isExported());

        if (node.getBody() != null) {
            node.getBody().accept(this);
        }
    }

    @Override
    public void visit(ClassBodyNode body) {
        System.out.println("========== [CLASS BODY] ==========");
        for (Node member : body.getMembers()) {
            member.accept(this);
        }
    }

    @Override
    public void visit(ClassMemberNode node) {
        System.out.println("========== [CLASS MEMBER] ==========");
        if (node.getMember() != null) {
            node.getMember().accept(this);
        }
    }

    @Override
    public void visit(ConstructorStatement node) {
        System.out.println("========== [CONSTRUCTOR] ==========");

        if (node.getParams() != null) {
            System.out.println("-- Params --");
            node.getParams().accept(this);
        }

        if (node.getBlock() != null) {
            System.out.println("-- Block --");
            node.getBlock().accept(this);
        }
    }

    @Override
    public void visit(ConstructorParamListNode node) {
        System.out.println("========== [CONSTRUCTOR PARAM LIST] ==========");
        for (ConstructorParamNode p : node.getParams()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(ConstructorParamNode node) {
        System.out.println("========== [CONSTRUCTOR PARAM] ==========");
        System.out.println("Access Modifier : " + node.getAccessModifier());
        System.out.println("Name            : " + node.getName());
        System.out.println("Type            : " + node.getTypeName());
    }

    @Override
    public void visit(ComponentStatement1 node) {
        System.out.println("========== [@Component DECORATOR] ==========");
        if (node.getOptions() != null) {
            node.getOptions().accept(this);
        }
    }

    @Override
    public void visit(ComponentOptionsNode node) {
        System.out.println("========== [COMPONENT OPTIONS] ==========");

        if (node.getSelector() != null)   node.getSelector().accept(this);
        if (node.getStandalone() != null) node.getStandalone().accept(this);
        if (node.getImportsProp() != null)node.getImportsProp().accept(this);
        if (node.getTemplate() != null)   node.getTemplate().accept(this);
    }

    @Override
    public void visit(SelectorPropertyNode node) {
        System.out.println("========== [SELECTOR PROPERTY] ==========");
        System.out.println("Selector : " + node.getSelectorLiteral());
    }

    @Override
    public void visit(StandalonePropertyNode node) {
        System.out.println("========== [STANDALONE PROPERTY] ==========");
        System.out.println("Standalone : " + node.isStandalone());
    }

    @Override
    public void visit(ImportsPropertyNode node) {
        System.out.println("========== [IMPORTS PROPERTY] ==========");
        for (String imp : node.getImports()) {
            System.out.println(" - " + imp);
        }
    }

    @Override
    public void visit(TemplatePropertyNode node) {
        System.out.println("========== [TEMPLATE PROPERTY] ==========");
        for (HtmlSectionNode sec : node.getSections()) {
            sec.accept(this);
        }
    }

    @Override
    public void visit(FunctionStatement node) {
        System.out.println("========== [FUNCTION DECLARATION] ==========");
        System.out.println("Name: " + node.getName());

        if (node.getParamList() != null) {
            System.out.println("-- Parameters --");
            node.getParamList().accept(this);
        }

        if (node.getBlock() != null) {
            System.out.println("-- Block --");
            node.getBlock().accept(this);
        }
    }

    @Override
    public void visit(ParamListNode node) {
        System.out.println("========== [PARAM LIST] ==========");
        for (ParamNode p : node.getParams()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(ParamNode node) {
        System.out.println("========== [PARAM] ==========");
        System.out.println("Access Modifier : " + node.getAccessModifier());
        System.out.println("Name            : " + node.getName());
        System.out.println("Type            : " + node.getTypeName());
    }

    @Override
    public void visit(BlockNode node) {
        System.out.println("========== [BLOCK] ==========");
        for (Node n : node.getItems()) {
            n.accept(this);
        }
    }

    @Override
    public void visit(BlockContentNode node) {
        System.out.println("========== [BLOCK CONTENT] ==========");
        for (Node st : node.getStatements()) {
            st.accept(this);
        }
    }

    @Override
    public void visit(StatementInBlockNode node) {
        System.out.println("========== [STATEMENT IN BLOCK] ==========");
        if (node.getStatement() != null) {
            node.getStatement().accept(this);
        }
    }

    @Override
    public void visit(IfStatementNode node) {
        System.out.println("========== [IF STATEMENT] ==========");

        System.out.println("-- Condition --");
        if (node.getCondition() != null) node.getCondition().accept(this);

        System.out.println("-- Then --");
        if (node.getThenBranch() != null) node.getThenBranch().accept(this);

        if (node.getElseBranch() != null) {
            System.out.println("-- Else --");
            node.getElseBranch().accept(this);
        }
    }

    @Override
    public void visit(ReturnStatementNode node) {
        System.out.println("========== [RETURN STATEMENT] ==========");
        if (node.getExpr() != null) {
            node.getExpr().accept(this);
        }
    }

    @Override
    public void visit(VarDeclareStatement1 node) {
        System.out.println("========== [VAR DECLARE STATEMENT] ==========");
        System.out.println("Exported: " + node.isExported());
        System.out.println("Kind    : " + node.getKind());

        for (VarDeclNode d : node.getDecls()) {
            d.accept(this);
        }
    }

    @Override
    public void visit(VarDeclNode node) {
        System.out.println("========== [VAR DECL] ==========");
        System.out.println("Name   : " + node.getName());
        System.out.println("Kind   : " + node.getVarKind());

        if (node.getRoutesType() != null) {
            System.out.println("Type   : " + node.getRoutesType());
        } else if (node.getTypeAnnotation() != null) {
            System.out.println("Type   : " + node.getTypeAnnotation().getValue());
            node.getTypeAnnotation().accept(this);
        }

        if (node.getInitializer() != null) {
            System.out.println("-- Initializer --");
            node.getInitializer().accept(this);
        }
    }

    @Override
    public void visit(GeneralTypeAnnotationNode node) {
        System.out.println("========== [TYPE ANNOTATION] ==========");
        if (node.getTypeRef() != null) {
            node.getTypeRef().accept(this);
        }
    }

    @Override
    public void visit(PropertyDeclarationNode node) {
        System.out.println("========== [PROPERTY DECLARATION] ==========");
        if (node.getProperty() != null) {
            node.getProperty().accept(this);
        }
    }

    @Override
    public void visit(RoutesPropertyDeclarationNode node) {
        System.out.println("========== [ROUTES PROPERTY DECL] ==========");
        System.out.println("Name : " + node.getName());
        System.out.println("Type : " + node.getTypeName());

        if (node.getInitializer() != null) {
            System.out.println("-- Initializer --");
            node.getInitializer().accept(this);
        }
    }

    @Override
    public void visit(NormalPropertyDeclarationNode node) {
        System.out.println("========== [NORMAL PROPERTY DECL] ==========");
        System.out.println("Name : " + node.getName());
        if (node.getType() != null) {
            System.out.println("Type : " + node.getType().getValue());
            node.getType().accept(this);
        }
        if (node.getInitializer() != null) {
            System.out.println("-- Initializer --");
            node.getInitializer().accept(this);
        }
    }

    @Override
    public void visit(TypeAliasStatement1 node) {
        System.out.println("========== [TYPE ALIAS] ==========");
        System.out.println("Name : " + node.getName());
        if (node.getObject() != null) {
            System.out.println("-- Object Type --");
            node.getObject().accept(this);
        }
    }

    @Override
    public void visit(ObjectTypeNode node) {
        System.out.println("========== [OBJECT TYPE] ==========");
        if (node.getMembers() != null) {
            node.getMembers().accept(this);
        }
    }

    @Override
    public void visit(ObjectTypeMembersNode node) {
        System.out.println("========== [OBJECT TYPE MEMBERS] ==========");
        for (Node m : node.getMembers()) {
            m.accept(this);
        }
    }

    @Override
    public void visit(ObjectTypeMemberNode node) {
        System.out.println("========== [OBJECT TYPE MEMBER] ==========");
        System.out.println("Name     : " + node.getName());
        System.out.println("Optional : " + node.isOptional());
        if (node.getTypeRef() != null) {
            System.out.println("-- Type --");
            node.getTypeRef().accept(this);
        }
    }

    @Override
    public void visit(TypeRefNode node) {
        System.out.println("========== [TYPE REF] ==========");
        System.out.println("Type: " + node.getValue());
    }

    @Override
    public void visit(ExprStatement1 node) {
        System.out.println("========== [EXPR STATEMENT] ==========");
        if (node.getExpr() != null) {
            node.getExpr().accept(this);
        }
    }

    @Override
    public void visit(ExprNode node) {
        System.out.println("========== [EXPR] ==========");
        if (node.getAssignment() != null) {
            node.getAssignment().accept(this);
        }
    }

    @Override
    public void visit(AssignmentExprNode node) {
        System.out.println("========== [ASSIGNMENT EXPR] ==========");
        if (node.getLeft() != null) {
            System.out.println("-- Left --");
            node.getLeft().accept(this);
            System.out.println("-- Right --");
            if (node.getRight() != null) node.getRight().accept(this);
        } else if (node.getConditional() != null) {
            System.out.println("-- Conditional --");
            node.getConditional().accept(this);
        }
    }

    @Override
    public void visit(AssignableNode node) {
        System.out.println("========== [ASSIGNABLE] ==========");
        System.out.println(node.getValue());
    }

    @Override
    public void visit(ConditionalExprNode node) {
        System.out.println("========== [CONDITIONAL EXPR] ==========");
        System.out.println("-- Condition --");
        if (node.getCondition() != null) node.getCondition().accept(this);

        if (node.getThenExpr() != null && node.getElseExpr() != null) {
            System.out.println("-- Then --");
            node.getThenExpr().accept(this);
            System.out.println("-- Else --");
            node.getElseExpr().accept(this);
        }
    }

    @Override
    public void visit(NullishExprNode node) {
        System.out.println("========== [NULLISH EXPR] ==========");
        for (Node op : node.getOperands()) {
            op.accept(this);
        }
    }

    @Override
    public void visit(LogicalOrExprNode node) {
        System.out.println("========== [LOGICAL OR EXPR] ==========");
        for (Node op : node.getOperands()) {
            op.accept(this);
        }
    }

    @Override
    public void visit(LogicalAndExprNode node) {
        System.out.println("========== [LOGICAL AND EXPR] ==========");
        for (Node op : node.getOperands()) {
            op.accept(this);
        }
    }

    @Override
    public void visit(EqualityExprNode node) {
        System.out.println("========== [EQUALITY EXPR] ==========");
        for (Node opnd : node.getOperands()) {
            opnd.accept(this);
        }
    }

    @Override
    public void visit(RelationalExprNode node) {
        System.out.println("========== [RELATIONAL EXPR] ==========");
        for (Node opnd : node.getOperands()) {
            opnd.accept(this);
        }
    }

    @Override
    public void visit(AdditiveExprNode node) {
        System.out.println("========== [ADDITIVE EXPR] ==========");
        for (Node opnd : node.getOperands()) {
            opnd.accept(this);
        }
    }

    @Override
    public void visit(MultiplicativeExprNode node) {
        System.out.println("========== [MULTIPLICATIVE EXPR] ==========");
        for (Node opnd : node.getOperands()) {
            opnd.accept(this);
        }
    }

    @Override
    public void visit(UnaryExprNode node) {
        System.out.println("========== [UNARY EXPR] ==========");
        if (!node.getOperators().isEmpty()) {
            System.out.println("Ops: " + String.join(" ", node.getOperators()));
        }
        if (node.getOperand() != null) {
            node.getOperand().accept(this);
        }
    }

    @Override
    public void visit(AsExpressionNode node) {
        System.out.println("========== [AS EXPRESSION] ==========");
        if (node.getBase() != null) {
            System.out.println("-- Base --");
            node.getBase().accept(this);
        }
        for (TypeRefNode t : node.getTypes()) {
            System.out.println("-- as Type --");
            t.accept(this);
        }
    }

    @Override
    public void visit(PostfixExprNode node) {
        System.out.println("========== [POSTFIX EXPR] ==========");
        System.out.println("Base:");
        if (node.getBase() != null) node.getBase().accept(this);

        int p = 0, c = 0, i = 0;
        for (char k : node.getOrder()) {
            switch (k) {
                case 'p': System.out.println(". " + node.getPropNames().get(p++)); break;
                case 'P': System.out.println("?. " + node.getPropNames().get(p++)); break;
                case 'n': System.out.println("!. " + node.getPropNames().get(p++)); break;
                case 'c':
                    System.out.println("call(...)");
                    if (node.getCallArgs().get(c) != null) node.getCallArgs().get(c).accept(this);
                    c++;
                    break;
                case 'C':
                    System.out.println("?.call(...)");
                    if (node.getCallArgs().get(c) != null) node.getCallArgs().get(c).accept(this);
                    c++;
                    break;
                case 'i':
                    System.out.println("[index]");
                    node.getIndexExprs().get(i++).accept(this);
                    break;
                case 'I':
                    System.out.println("?.[index]");
                    node.getIndexExprs().get(i++).accept(this);
                    break;
            }
        }
    }

    @Override
    public void visit(SignalGenericCallPrimaryNode node) {
        System.out.println("========== [SIGNAL GENERIC CALL] ==========");

        if (node.getGenericArgs() != null) {
            System.out.println("-- Generic Args --");
            node.getGenericArgs().accept(this);
        }

        if (node.getArgumentList() != null) {
            System.out.println("-- Arguments --");
            node.getArgumentList().accept(this);
        }
    }

    @Override
    public void visit(SignalGenericArgsNode node) {
        System.out.println("========== [SIGNAL GENERIC ARGS] ==========");
        for (SignalGenericArgNode a : node.getArgs()) {
            a.accept(this);
        }
    }

    @Override
    public void visit(SignalGenericArgNode node) {
        System.out.println("========== [SIGNAL GENERIC ARG] ==========");
        System.out.println("Type: " + node.getValue());
    }

    @Override
    public void visit(ArgumentListNode node) {
        System.out.println("========== [ARGUMENT LIST] ==========");
        for (Node a : node.getArgs()) {
            a.accept(this);
        }
    }

    @Override
    public void visit(PrimaryNode node) {
        System.out.println("========== [PRIMARY] ==========");

        if (node.getArrowFunction() != null)          node.getArrowFunction().accept(this);
        else if (node.getArrayLiteral() != null)      node.getArrayLiteral().accept(this);
        else if (node.getObjectLiteral() != null)     node.getObjectLiteral().accept(this);
        else if (node.getSignalGenericCallPrimary() != null) node.getSignalGenericCallPrimary().accept(this);
        else if (node.getImportCallPrimary() != null) node.getImportCallPrimary().accept(this);
        else if (!node.getAngularSections().isEmpty()) {
            for (HtmlSectionNode sec : node.getAngularSections()) sec.accept(this);
        } else if (node.getParenthesized() != null)   node.getParenthesized().accept(this);
        else {
            // ليتيرالات/توكنات
            if (node.getNumberLiteral() != null)   System.out.println(node.getNumberLiteral());
            else if (node.getRoutesId() != null)   System.out.println(node.getRoutesId());
            else if (node.getStringLiteral() != null) System.out.println(node.getStringLiteral());
            else if (node.getBooleanLiteral() != null) System.out.println(node.getBooleanLiteral());
            else if (node.isNull())                System.out.println("null");
            else if (node.getSignalKw() != null)   System.out.println(node.getSignalKw());
            else if (node.getIdentifier() != null) System.out.println(node.getIdentifier());
            else if (node.getImportKw() != null)   System.out.println(node.getImportKw());
        }
    }

    @Override
    public void visit(ImportCallPrimaryNode node) {
        System.out.println("========== [IMPORT CALL PRIMARY] ==========");
        System.out.println("Module: " + node.getModuleLiteral());
        for (int i = 0; i < node.getCallNames().size(); i++) {
            System.out.println(" . " + node.getCallNames().get(i) + "(...)");
            ArgumentListNode args = node.getCallArgs().get(i);
            if (args != null) args.accept(this);
        }
    }

    @Override
    public void visit(ArrowFunctionNode node) {
        System.out.println("========== [ARROW FUNCTION] ==========");
        System.out.println("Params: " + String.join(", ", node.getParams()));
        if (node.getBody() != null) {
            System.out.println("-- Body --");
            node.getBody().accept(this);
        }
    }

    @Override
    public void visit(ParamListSimpleNode node) {
        System.out.println("========== [SIMPLE PARAM LIST] ==========");
        for (String p : node.getParams()) {
            System.out.println("- " + p);
        }
    }

    @Override
    public void visit(ArrayLiteralNode node) {
        System.out.println("========== [ARRAY LITERAL] ==========");
        for (Node el : node.getElements()) {
            el.accept(this);
        }
    }

    @Override
    public void visit(ArrayElementNode node) {
        System.out.println("========== [ARRAY ELEMENT] ==========");
        System.out.println("Spread : " + node.isSpread());
        if (node.getExpr() != null) {
            node.getExpr().accept(this);
        }
    }

    @Override
    public void visit(ObjectLiteralNode node) {
        System.out.println("========== [OBJECT LITERAL] ==========");
        for (ObjectPropertyNode p : node.getProperties()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(ObjectPropertyNode node) {
        System.out.println("========== [OBJECT PROPERTY] ==========");
        if (node.isSpread()) {
            System.out.println("[Spread]");
            if (node.getExpression() != null) node.getExpression().accept(this);
        } else {
            System.out.println("Key       : " + node.getKey());
            System.out.println("Shorthand : " + node.isShorthand());
            if (!node.isShorthand() && node.getExpression() != null) {
                System.out.println("-- Value --");
                node.getExpression().accept(this);
            }
        }
    }

    @Override
    public void visit(InterpolationNode node) {
        System.out.println("========== [INTERPOLATION] ==========");
        System.out.println("Has $ : " + node.isHasDollar());
        if (node.getExpr() != null) {
            node.getExpr().accept(this);
        }
    }

}
