package Visitor;

import Ast_Class.HTML_Classes.*;
import Ast_Class.TS_Classes.*;



public class BaseAstVisitor implements AST_Visitor {

    @Override
    public void visit(HTMLDivLabel div) {
        System.out.println("========== [DIV NODE] ==========");

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

        if(attribute.getAttributeType() != null && attribute.getAttributeValue() != null)
        {
            System.out.println("[Div Attribute] " + attribute.getValue());
        }

    }

    @Override
    public void visit(ImgAttribute attribute) {
        if(attribute.getAttributeType() != null && attribute.getAttributeValue() != null)
        {
            System.out.println("[Img Attribute] " + attribute.getValue());
        }
    }

    @Override
    public void visit(DivImageLabel image) {
        System.out.println("========== [IMG NODE] ==========");
        for (ImgAttribute attr : image.getAttributes()) {
            attr.accept(this);
        }
        System.out.println("DIV INPUT HTML : " + image.getValue());
    }

    @Override
    public void visit(ButtonAttribute attribute) {
        if(attribute.getAttributeType() != null && attribute.getAttributeValue() != null)
        {
            System.out.println("[Button Attribute] " + attribute.getValue());
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
    public void visit(DivButtonLabel button) {
        System.out.println("========== [BUTTON NODE] ==========");
        for (ButtonAttribute attr : button.getAttributes()) {
            attr.accept(this);
        }
        System.out.println("DIV BUTTON HTML : " + button.getValue());

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



}
