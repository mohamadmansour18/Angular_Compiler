package Visitor;

import Ast_Class.HTML_Classes.*;
import Ast_Class.Node.Node;
import Ast_Class.TS_Classes.*;

import javax.xml.transform.Source;


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
    public void visit(ConstructorDeclarationNode node) {
        System.out.println("========== [CONSTRUCTOR DECLARATION] ==========");

        if (node.getParamList() != null) {
            System.out.println("-- Parameters --");
            node.getParamList().accept(this);
        }

//        if (node.getBlock() != null) {
//            System.out.println("-- Block --");
//            node.getBlock().accept(this);
//        }
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
}
