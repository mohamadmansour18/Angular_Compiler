package Visitor;

import Ast_Class.HTML_Classes.*;
import Ast_Class.Node.Node;
import Ast_Class.TS_Classes.*;
import Parser.FrameParser;
import Parser.FrameParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AngularVisitor extends FrameParserBaseVisitor<Node>{

    @Override
    public Node visitRoot(FrameParser.RootContext ctx)
    {
        RootProgram rootProgram = new RootProgram();

        rootProgram.initializeNode(ctx, true, "Global");

        if (ctx.htmlSection() != null) {
            for (int i = 0; i < ctx.htmlSection().size(); i++) {
                rootProgram.getHtmlSections().add(
                        (HtmlSectionNode) visit(ctx.htmlSection(i))
                );
            }
        }

        if (ctx.tsSection() != null) {
            for (int i = 0; i < ctx.tsSection().size(); i++) {
                rootProgram.getTsSections().add(
                        (TsSectionNode) visit(ctx.tsSection(i))
                );
            }
        }

        Node.removeScope();
        return rootProgram;
    }

    @Override
    public Node visitHTMLDivLabel(FrameParser.HTMLDivLabelContext ctx) {
        HTMLDivLabel divNode = new HTMLDivLabel();

        divNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.DivAttributeContext) {
                DivAttribute attr = (DivAttribute) visit(child);
                divNode.getAttributes().add(attr);

            } else if (child instanceof FrameParser.DivContentContext) {
                DivContentNode content = (DivContentNode) visit(child);
                divNode.getContent().add(content);
            }
        }

        return divNode;
    }

    @Override
    public Node visitHTMLFormLabel(FrameParser.HTMLFormLabelContext ctx) {
        HTMLFormLabel formNode = new HTMLFormLabel();

        formNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.FormAttributeContext) {
                FormAttribute attr = (FormAttribute) visit(child);
                formNode.getAttributes().add(attr);

            } else if (child instanceof FrameParser.FormContentContext) {
                FormContentNode content = (FormContentNode) visit(child);
                formNode.getContent().add(content);
            }
        }

        return formNode;
    }

    @Override
    public Node visitHTMLParagraphLabel(FrameParser.HTMLParagraphLabelContext ctx) {
        HTMLParagraphLabel paragraphNode = new HTMLParagraphLabel();

        paragraphNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ParagraphAttributeContext) {
                ParagraphAttribute attr = (ParagraphAttribute) visit(child);
                paragraphNode.getAttributes().add(attr);

            } else if (child instanceof FrameParser.ParagraphContentContext) {
                ParagraphContentNode content = (ParagraphContentNode) visit(child);
                paragraphNode.setContent(content); // فقط عنصر واحد محتمل
            }
        }

        return paragraphNode;
    }

    @Override
    public Node visitHTMLButtonLabel(FrameParser.HTMLButtonLabelContext ctx) {
        HTMLButtonLabel buttonNode = new HTMLButtonLabel();

        buttonNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ButtonAttributeContext) {
                ButtonAttribute attr = (ButtonAttribute) visit(child);
                buttonNode.getAttributes().add(attr);

            } else if (child instanceof FrameParser.ButtonContentContext) {
                ButtonContent content = (ButtonContent) visit(child);
                buttonNode.setContent(content);
            }
        }

        return buttonNode;
    }

    @Override
    public Node visitHTMLInputLabel(FrameParser.HTMLInputLabelContext ctx) {
        HTMLInputLabel inputNode = new HTMLInputLabel();

        inputNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.InputAttributeContext) {
                InputAttribute attr = (InputAttribute) visit(child);
                inputNode.getAttributes().add(attr);
            }
        }

        return inputNode;
    }

    @Override
    public Node visitHTMLImageLabel(FrameParser.HTMLImageLabelContext ctx) {
        HTMLImageLabel imgNode = new HTMLImageLabel();

        imgNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ImgAttributeContext) {
                ImgAttribute attr = (ImgAttribute) visit(child);
                imgNode.getAttributes().add(attr);
            }
        }

        return imgNode;
    }

    @Override
    public Node visitHTMLLabel(FrameParser.HTMLLabelContext ctx) {
        HTMLLabel labelNode = new HTMLLabel();

        labelNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.LabelAttributeContext) {
                LabelAttribute attr = (LabelAttribute) visit(child);
                labelNode.getAttributes().add(attr);

            } else if (child instanceof FrameParser.LabelContentContext) {
                LabelContent content = (LabelContent) visit(child);
                labelNode.setContent(content);
            }
        }

        return labelNode;
    }

    @Override
    public Node visitHTMLRouterOutletLabel(FrameParser.HTMLRouterOutletLabelContext ctx) {
        HTMLRouterOutletLabel outletNode = new HTMLRouterOutletLabel();

        outletNode.initializeNode(ctx, false, "");

        return outletNode;
    }

    @Override
    public Node visitTSComponentLabel(FrameParser.TSComponentLabelContext ctx) {
        TSComponentLabel componentNode = new TSComponentLabel();

        componentNode.initializeNode(ctx, true, "Component");

        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ComponentBodyContext) {
                ComponentBody body = (ComponentBody) visit(child);
                componentNode.setBody(body);

            } else if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                name = terminal.getText();
                componentNode.setName(name);

            } else if (child instanceof FrameParser.ClassBlockContext) {
                ClassBlock block = (ClassBlock) visit(child);
                componentNode.setClassBlock(block);
            }
        }

        if (name != null) {
            componentNode.createSymbol(componentNode.getScopeID(), name, "Component");
        }

        Node.removeScope();
        return componentNode;
    }

    @Override
    public Node visitTSServiceLabel(FrameParser.TSServiceLabelContext ctx) {
        TSServiceLabel serviceNode = new TSServiceLabel();

        serviceNode.initializeNode(ctx, true, "Service");

        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.InjectableBodyContext) {
                InjectableBody body = (InjectableBody) visit(child);
                serviceNode.setInjectableBody(body);

            } else if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                name = terminal.getText();
                serviceNode.setServiceName(name);

            } else if (child instanceof FrameParser.ClassBlockContext) {
                ClassBlock block = (ClassBlock) visit(child);
                serviceNode.setClassBlock(block);
            }
        }

        if (name != null) {
            serviceNode.createSymbol(serviceNode.getScopeID(), name, "Service");
        }

        Node.removeScope();
        return serviceNode;
    }



}
