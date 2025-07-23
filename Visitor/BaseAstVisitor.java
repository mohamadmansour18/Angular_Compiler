package Visitor;

import Ast_Class.HTML_Classes.*;
import Ast_Class.TS_Classes.*;



public class BaseAstVisitor implements AST_Visitor {

    @Override
    public void visit(RootProgram root) {
        System.out.println("========== Root Program ==========");

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

        System.out.println("Attributes:");
        for (DivAttribute attr : div.getAttributes()) {
            attr.accept(this);
        }


        System.out.println("Content Nodes: " + div.getContent().size());
        for (DivContentNode contentNode : div.getContent()) {
            contentNode.accept(this);
        }
    }

    @Override
    public void visit(DivAttribute attribute) {
        System.out.println("========== [Div Attribute] ==========");

        if(attribute.getAttributeType() != null)
        {
            System.out.println("Type : " + attribute.getAttributeType());
        }

        if(attribute.getAttributeValue() != null)
        {
            System.out.println("Value: " + attribute.getAttributeValue());
        }
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
