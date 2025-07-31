package Visitor;

import Ast_Class.HTML_Classes.*;
import Ast_Class.TS_Classes.*;



public class BaseAstVisitor implements AST_Visitor {

    @Override
    public void visit(RootProgram root) {
        System.out.println("========== Root Program ==========");
        System.out.println("Child Count : " + root.getChildeCount());
        if(root.getHtmlSections() != null)
        {
            for (HtmlSectionNode html : root.getHtmlSections()) {
                html.accept(this);
            }
        }
        if(root.getTsSections() != null)
        {
            for (TsSectionNode ts : root.getTsSections()) {
                ts.accept(this);
            }
        }
    }

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
        System.out.println("[Label Content] " + content.getText());
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

//    @Override
//    public void visit(Keyword keyword) {
//        System.out.println("**********************************************");
//        System.out.println("[Keyword Node]");
//        System.out.println("Child Count : " + keyword.getChildeCount());
//        if (keyword.getS() != null) {
//            System.out.println(keyword.getS());
//        }
//    }


}
