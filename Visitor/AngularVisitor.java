package Visitor;

import Ast_Class.HTML_Classes.*;
import Ast_Class.Node.Node;
import Ast_Class.TS_Classes.*;
import Parser.FrameParser;
import Parser.FrameParserBaseVisitor;
import SemanticErros.ErrorCollector;
import SymbolTable.Scope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class AngularVisitor extends FrameParserBaseVisitor<Node> {
    public ErrorCollector errorCollector = new ErrorCollector();

    @Override
    public Node visitHtmlDivTag(FrameParser.HtmlDivTagContext ctx) {
        HTMLDivLabel div = new HTMLDivLabel();
        div.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        if (ctx.divAttribute() != null) {
            for (FrameParser.DivAttributeContext aCtx : ctx.divAttribute()) {
                DivAttribute attr = (DivAttribute) visit(aCtx);
                div.getAttributes().add(attr);
            }
        }

        if (ctx.divContent() != null) {
            for (FrameParser.DivContentContext cCtx : ctx.divContent()) {
                DivContentNode content = (DivContentNode) visit(cCtx);
                div.getContent().add(content);
            }
        }

        return div;
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
        HTMLParagraphLabel node = new HTMLParagraphLabel();
        node.initializeNode(ctx, false, "");

        FrameParser.HtmlParagraphTagContext tag = ctx.htmlParagraphTag();
        if (tag != null) {
            if (tag.paragraphAttribute() != null) {
                for (FrameParser.ParagraphAttributeContext aCtx : tag.paragraphAttribute()) {
                    ParagraphAttribute attr = (ParagraphAttribute) visit(aCtx);
                    node.getAttributes().add(attr);
                }
            }
            if (tag.paragraphContent() != null) {
                ParagraphContentNode content = (ParagraphContentNode) visit(tag.paragraphContent());
                node.setContent(content);
            }
        }

        return node;
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
    public Node visitHtmlLabelTag(FrameParser.HtmlLabelTagContext ctx) {
        HTMLLabel node = new HTMLLabel();
        node.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        if (ctx.labelAttribute() != null) {
            for (FrameParser.LabelAttributeContext aCtx : ctx.labelAttribute()) {
                LabelAttribute attr = (LabelAttribute) visit(aCtx);
                node.getAttributes().add(attr);
            }
        }

        if (ctx.labelContent() != null) {
            for (FrameParser.LabelContentContext cCtx : ctx.labelContent()) {
                LabelContent content = (LabelContent) visit(cCtx);
                node.getContents().add(content);
            }
        }

        return node;
    }

    @Override
    public Node visitHTMLRouterOutletLabel(FrameParser.HTMLRouterOutletLabelContext ctx) {
        HTMLRouterOutletLabel outletNode = new HTMLRouterOutletLabel();

        outletNode.initializeNode(ctx, false, "");

        return outletNode;
    }

    @Override
    public Node visitDivAttribute(FrameParser.DivAttributeContext ctx) {
        DivAttribute node = new DivAttribute();
        node.initializeNode(ctx, false, ""); // لا سكوب هنا

        // نوع الخاصية (واحد من البدائل)
        String type =
        (ctx.ID() != null)              ? ctx.ID().getText() :
        (ctx.CLASS_KW() != null)        ? ctx.CLASS_KW().getText() :
        (ctx.STYLE() != null)           ? ctx.STYLE().getText() :
        (ctx.STAR_NG_IF() != null)      ? ctx.STAR_NG_IF().getText() :
        (ctx.STAR_NG_FOR() != null)     ? ctx.STAR_NG_FOR().getText() :
        (ctx.CLICK() != null)           ? ctx.CLICK().getText() :
        (ctx.NG_MODEL() != null)        ? ctx.NG_MODEL().getText() :
        (ctx.NG_MODEL_TWO_WAY() != null)? ctx.NG_MODEL_TWO_WAY().getText() :
        null;

        node.setAttributeType(type);

        // القيمة (STRING) — نزيل علامات التنصيص لأن getValue() يضيفها
        String raw = (ctx.STRING() != null) ? ctx.STRING().getText() : null;
        if (raw != null && raw.length() >= 2) {
            raw = raw.substring(1, raw.length() - 1);
        }
        node.setAttributeValue(raw);

        return node;
    }

    public Node visitDivImageLabel(FrameParser.DivImageLabelContext ctx) {
        DivImageLabel node = new DivImageLabel();
        node.initializeNode(ctx, false, "");

        FrameParser.HtmlImageTagContext tag = ctx.htmlImageTag();
        if (tag != null) {
            for (FrameParser.ImgAttributeContext aCtx : tag.imgAttribute()) {
                ImgAttribute attr = (ImgAttribute) visit(aCtx);
                node.getAttributes().add(attr);
            }
        }

        return node;
    }

    @Override
    public Node visitHtmlButtonTag(FrameParser.HtmlButtonTagContext ctx) {
        DivButtonLabel node = new DivButtonLabel();
        node.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        if (ctx.buttonAttribute() != null) {
            for (FrameParser.ButtonAttributeContext aCtx : ctx.buttonAttribute()) {
                ButtonAttribute attr = (ButtonAttribute) visit(aCtx);
                node.getAttributes().add(attr);
            }
        }

        if (ctx.buttonContent() != null) {
            ButtonContent content = (ButtonContent) visit(ctx.buttonContent());
            node.setContent(content);
        }

        return node;
    }

    @Override
    public Node visitDivButtonLabel(FrameParser.DivButtonLabelContext ctx) {
        DivButtonLabel node = new DivButtonLabel();
        node.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        FrameParser.HtmlButtonTagContext tag = ctx.htmlButtonTag();
        if (tag != null) {
            if (tag.buttonAttribute() != null) {
                for (FrameParser.ButtonAttributeContext aCtx : tag.buttonAttribute()) {
                    ButtonAttribute attr = (ButtonAttribute) visit(aCtx);
                    node.getAttributes().add(attr);
                }
            }
            if (tag.buttonContent() != null) {
                ButtonContent content = (ButtonContent) visit(tag.buttonContent());
                node.setContent(content);
            }
        }

        return node;
    }

    @Override
    public Node visitDivInputLabel(FrameParser.DivInputLabelContext ctx) {
        DivInputLabel inputNode = new DivInputLabel();

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
    public Node visitDivParagraphLabel(FrameParser.DivParagraphLabelContext ctx) {
        DivParagraphLabel node = new DivParagraphLabel();
        node.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        FrameParser.HtmlParagraphTagContext tag = ctx.htmlParagraphTag();
        if (tag != null) {
            if (tag.paragraphAttribute() != null) {
                for (FrameParser.ParagraphAttributeContext aCtx : tag.paragraphAttribute()) {
                    ParagraphAttribute attr = (ParagraphAttribute) visit(aCtx);
                    node.getAttributes().add(attr);
                }
            }
            if (tag.paragraphContent() != null) {
                ParagraphContentNode content = (ParagraphContentNode) visit(tag.paragraphContent());
                node.setContent(content);
            }
        }
        return node;
    }

    @Override
    public Node visitDivNestedLabel(FrameParser.DivNestedLabelContext ctx) {
        DivNestedLabel nestedDivNode = new DivNestedLabel();

        nestedDivNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.DivAttributeContext) {
                DivAttribute attr = (DivAttribute) visit(child);
                nestedDivNode.getAttributes().add(attr);

            } else if (child instanceof FrameParser.DivContentContext) {
                DivContentNode content = (DivContentNode) visit(child);
                nestedDivNode.getContent().add(content);
            }
        }

        return nestedDivNode;
    }

    @Override
    public Node visitDivRouterOutletLabel(FrameParser.DivRouterOutletLabelContext ctx) {
        DivRouterOutletLabel outletNode = new DivRouterOutletLabel();

        outletNode.initializeNode(ctx, false, "");

        return outletNode;
    }

    @Override
    public Node visitDivNgIfLabel(FrameParser.DivNgIfLabelContext ctx) {
        DivNgIfLabel divNgIfLabel = new DivNgIfLabel();

        divNgIfLabel.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.STRING) {
                String condition = terminal.getText().replaceAll("^\"|\"$", "");
            }
        }

        return divNgIfLabel;
    }

    @Override
    public Node visitDivNgForLabel(FrameParser.DivNgForLabelContext ctx) {
        DivNgForLabel divNgForLabel = new DivNgForLabel();

        divNgForLabel.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.STRING) {
                String loopExpr = terminal.getText().replaceAll("^\"|\"$", "");
                divNgForLabel.setLoopExpression(loopExpr);
            }
        }

        return divNgForLabel;
    }


    public Node visitDivPlainTextLabel(FrameParser.DivPlainTextLabelContext ctx) {
        DivPlainTextLabel node = new DivPlainTextLabel();

        node.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.STRING) {
                String rawText = terminal.getText().replaceAll("^\"|\"$", ""); // إزالة علامات التنصيص
                node.setText(rawText);
            }
        }

        return node;
    }

    @Override
    public Node visitFormAttribute(FrameParser.FormAttributeContext ctx) {
        FormAttribute attribute = new FormAttribute();

        attribute.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.ID:
                    case FrameParser.CLASS_KW:
                    case FrameParser.STYLE:
                    case FrameParser.NG_SUBMIT:
                        attribute.setAttributeType(terminal.getText());
                        break;

                    case FrameParser.STRING:
                        attribute.setAttributeValue(terminal.getText().replaceAll("^\"|\"$", ""));
                        break;
                }
            }
        }

        return attribute;
    }

    @Override
    public Node visitFormInputLabel(FrameParser.FormInputLabelContext ctx) {
        FormInputLabel inputNode = new FormInputLabel();
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
    public Node visitFormButtonLabel(FrameParser.FormButtonLabelContext ctx) {
        FormButtonLabel buttonNode = new FormButtonLabel();
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
    public Node visitFormLabel(FrameParser.FormLabelContext ctx) {
        FormLabel labelNode = new FormLabel();
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
    public Node visitFormDivLabel(FrameParser.FormDivLabelContext ctx) {
        FormDivLabel divNode = new FormDivLabel();
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
    public Node visitFormTextLabel(FrameParser.FormTextLabelContext ctx) {
        FormTextLabel textLabel = new FormTextLabel();
        textLabel.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.STRING) {
                String rawText = terminal.getText().replaceAll("^\"|\"$", "");
                textLabel.setText(rawText);
            }
        }

        return textLabel;
    }

    @Override
    public Node visitParagraphAttribute(FrameParser.ParagraphAttributeContext ctx) {
        ParagraphAttribute attribute = new ParagraphAttribute();
        attribute.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.ID:
                    case FrameParser.CLASS_KW:
                    case FrameParser.STYLE:
                    case FrameParser.STAR_NG_IF:
                    case FrameParser.STAR_NG_FOR:
                    case FrameParser.CLICK:
                    case FrameParser.NG_MODEL:
                    case FrameParser.NG_MODEL_TWO_WAY:
                        attribute.setAttributeType(terminal.getText());
                        break;

                    case FrameParser.STRING:
                        attribute.setAttributeValue(terminal.getText().replaceAll("^\"|\"$", ""));
                        break;
                }
            }
        }

        return attribute;
    }


    @Override
    public Node visitParagraphTextLabel(FrameParser.ParagraphTextLabelContext ctx) {
        ParagraphTextLabel textLabel = new ParagraphTextLabel();
        textLabel.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.STRING) {
                String rawText = terminal.getText().replaceAll("^\"|\"$", "");
                textLabel.setText(rawText);
            }
        }

        return textLabel;
    }

    @Override
    public Node visitParagraphImageLabel(FrameParser.ParagraphImageLabelContext ctx) {
        ParagraphImageLabel imgNode = new ParagraphImageLabel();
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
    public Node visitParagraphButtonLabel(FrameParser.ParagraphButtonLabelContext ctx) {
        ParagraphButtonLabel buttonNode = new ParagraphButtonLabel();
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
    public Node visitParagraphInputLabel(FrameParser.ParagraphInputLabelContext ctx) {
        ParagraphInputLabel inputNode = new ParagraphInputLabel();
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
    public Node visitButtonAttribute(FrameParser.ButtonAttributeContext ctx) {
        ButtonAttribute node = new ButtonAttribute();
        node.initializeNode(ctx, false, ""); // لا سكوب هنا

        if (ctx.DISABLED() != null) {
            node.setAttributeType(ctx.DISABLED().getText()); // "disabled"
            node.setAttributeValue(null);                    // بدون قيمة
            return node;
        }

        // نوع الخاصية (أحد البدائل مع قيمة)
        String type =
        (ctx.TYPE_DECLARE() != null)        ? ctx.TYPE_DECLARE().getText() :
        (ctx.STYLE() != null)               ? ctx.STYLE().getText() :
        (ctx.STAR_NG_IF() != null)          ? ctx.STAR_NG_IF().getText() :
        (ctx.STAR_NG_FOR() != null)         ? ctx.STAR_NG_FOR().getText() :
        (ctx.CLICK() != null)               ? ctx.CLICK().getText() :
        (ctx.NG_MODEL() != null)            ? ctx.NG_MODEL().getText() :
        (ctx.NG_MODEL_TWO_WAY() != null)    ? ctx.NG_MODEL_TWO_WAY().getText() :
        null;

        node.setAttributeType(type);

        // القيمة STRING مع إزالة علامات التنصيص لأن getValue() يضيفها
        String raw = (ctx.STRING() != null) ? ctx.STRING().getText() : null;
        if (raw != null && raw.length() >= 2) {
            raw = raw.substring(1, raw.length() - 1);
        }
        node.setAttributeValue(raw);

        return node;
    }

    public Node visitButtonContent(FrameParser.ButtonContentContext ctx) {
        ButtonContent buttonContent = new ButtonContent();
        buttonContent.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.STRING) {
                String text = terminal.getText().replaceAll("^\"|\"$", "");
                buttonContent.setRawContent(text);
            }
        }

        return buttonContent;
    }

    @Override
    public Node visitInputAttribute(FrameParser.InputAttributeContext ctx) {
        InputAttribute attribute = new InputAttribute();
        attribute.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.TYPE:
                    case FrameParser.PLACEHOLDER:
                    case FrameParser.STYLE:
                    case FrameParser.VALUE:
                    case FrameParser.NAME:
                    case FrameParser.ID:
                    case FrameParser.NG_MODEL:
                    case FrameParser.NG_MODEL_TWO_WAY:
                        attribute.setAttributeType(terminal.getText());
                        break;

                    case FrameParser.STRING:
                        attribute.setAttributeValue(terminal.getText().replaceAll("^\"|\"$", ""));
                        break;
                }
            }
        }

        return attribute;
    }

    @Override
    public Node visitImgAttribute(FrameParser.ImgAttributeContext ctx) {
        ImgAttribute attribute = new ImgAttribute();
        attribute.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.SRC:
                    case FrameParser.ALT:
                    case FrameParser.STYLE:
                        attribute.setAttributeType(terminal.getText());
                        break;

                    case FrameParser.STRING:
                        attribute.setAttributeValue(terminal.getText().replaceAll("^\"|\"$", ""));
                        break;
                }
            }
        }

        return attribute;
    }

    @Override
    public Node visitLabelAttribute(FrameParser.LabelAttributeContext ctx) {
        LabelAttribute attribute = new LabelAttribute(null, null);
        attribute.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.FOR:
                    case FrameParser.CLASS_KW:
                    case FrameParser.STYLE:
                        attribute.setAttributeType(terminal.getText());
                        break;

                    case FrameParser.STRING:
                        attribute.setAttributeValue(terminal.getText().replaceAll("^\"|\"$", ""));
                        break;
                }
            }
        }

        return attribute;
    }

    @Override
    public Node visitLabelContent(FrameParser.LabelContentContext ctx) {
        LabelContent node = new LabelContent();
        node.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        if (ctx.STRING() != null) {
            String raw = ctx.STRING().getText();              // "text"
            node.setText(raw.length() >= 2 ? raw.substring(1, raw.length() - 1) : raw);
        } else if (ctx.htmlSpanTag() != null) {
            HTMLSpanLabel span = (HTMLSpanLabel) visit(ctx.htmlSpanTag());
            node.setSpan(span);
        } else if (ctx.htmlInputTag() != null) {
            HTMLInputLabel input = (HTMLInputLabel) visit(ctx.htmlInputTag());
            node.setInput(input);
        }

        return node;
    }

    ////////////////////////////////////////////////////////////////////////////
    @Override
    public Node visitRootprogram(FrameParser.RootprogramContext ctx) {
        RootProgram rootNode = new RootProgram();

        rootNode.initializeNode(ctx, true, "Global");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ProgramContext) {
                ProgramNode prog = (ProgramNode) visit(child);
                rootNode.getPrograms().add(prog);
            }

        }
        rootNode.removeScope();
        return rootNode;
    }

    @Override
    public Node visitProgram(FrameParser.ProgramContext ctx) {
        ProgramNode programNode = new ProgramNode();

        programNode.initializeNode(ctx, true, "Program");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.StatementsContext) {
                StatementsNode st = (StatementsNode) visit(child);
                programNode.getStatements().add(st);
            }
        }

        programNode.removeScope();
        return programNode;
    }
    @Override
    public Node visitStatements(FrameParser.StatementsContext ctx) {
        StatementsNode stmtsNode = new StatementsNode();

        stmtsNode.initializeNode(ctx, false, "");

        stmtsNode.setHasSemicolon(ctx.SEMICOLON() != null);

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.StetmentContext) {
                Stetment st = (Stetment) visit(child);
                stmtsNode.setStatement(st);
            }
        }

        return stmtsNode;
    }


    public Node visitImportStatement1(FrameParser.ImportStatement1Context ctx) {
        ImportStatement1 importNode = new ImportStatement1();

        importNode.initializeNode(ctx, false, "");
        FrameParser.ImportStatementContext imp = ctx.importStatement();

        String name = null;
        if (imp.IDENTIFIER() != null) {
            name = imp.IDENTIFIER().getText();
        } else if (imp.COMPONENT_KW() != null) {
            name = imp.COMPONENT_KW().getText();
        } else if (imp.SIGNAL_KW() != null) {
            name = imp.SIGNAL_KW().getText();
        } else if (imp.ROUTES_TYPE() != null) {
            name = imp.ROUTES_TYPE().getText();
        }

        String moduleLiteral = (imp.STRING() != null) ? imp.STRING().getText() : null;
        importNode.setImportedName(name);
        importNode.setModuleLiteral(moduleLiteral);


        if (name != null) {
            importNode.createSymbol(importNode.getScopeID(), name, "Import");
        }

        return importNode;
    }

    @Override
    public Node visitClassStatement1(FrameParser.ClassStatement1Context ctx) {
        ClassStatement1 node = new ClassStatement1();
        FrameParser.ClassStatementContext cs = ctx.classStatement();

        String name = (cs.IDENTIFIER() != null) ? cs.IDENTIFIER().getText() : null;
        node.setName(name);
        node.setExported(cs.EXPORT_KW() != null);

        int parentScopeId = (node.getCurrentScope() != null) ? node.getCurrentScope().getId() : -1;

        node.initializeNode(cs, true, (name != null ? name : "ClassScope"));

        if (cs.classBody() != null) {
            node.setBody((ClassBodyNode) visit(cs.classBody()));
        }

        if (name != null && parentScopeId != -1) {
            node.createSymbol(parentScopeId, name, "Class");
        }

        node.removeScope();
        return node;
    }

    @Override
    public Node visitClassBody(FrameParser.ClassBodyContext ctx) {
        ClassBodyNode bodyNode = new ClassBodyNode();
        bodyNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ClassMemberContext) {
                Node member = (Node) visit(child);
                bodyNode.getMembers().add(member);
            }
        }

        return bodyNode;
    }

    public Node visitClassMember(FrameParser.ClassMemberContext ctx) {
        ClassMemberNode node = new ClassMemberNode();

        node.initializeNode(ctx, false, "");

        if (ctx.constructorDeclaration() != null) {
            Node m = (Node) visit(ctx.constructorDeclaration());
            node.setMember(m);

        } else if (ctx.functionDeclaration() != null) {
            Node m = (Node) visit(ctx.functionDeclaration());
            node.setMember(m);

        } else if (ctx.propertyDeclaration() != null) {
            Node m = (Node) visit(ctx.propertyDeclaration());
            node.setMember(m);

        } else if (ctx.exprStatement() != null) {
            Node m = (Node) visit(ctx.exprStatement());
            node.setMember(m);
        }

        return node;
    }

    @Override
    public Node visitConstructorStatement(FrameParser.ConstructorStatementContext ctx) {
        ConstructorStatement node = new ConstructorStatement();

        FrameParser.ConstructorDeclarationContext cd = ctx.constructorDeclaration();

        // خزّن سكوب الكلاس الحالي قبل فتح سكوب الكونستركتور
        int classScopeId = -1;
        if (node.getCurrentScope() != null) {
            classScopeId = node.getCurrentScope().getId();
        }

        // افتح سكوب الكونستركتور
        node.initializeNode(cd, true, "Constructor");

        // params
        if (cd.constructorParamList() != null) {
            ConstructorParamListNode plist =
                    (ConstructorParamListNode) visit(cd.constructorParamList());
            node.setParams(plist);
        }

        // block
        if (cd.block() != null) {
            BlockNode blk = (BlockNode) visit(cd.block());
            node.setBlock(blk);
        }

        // لو عندي بارامترات مع Access Modifier -> صِفها كـ ClassVariable في سكوب الكلاس
        if (classScopeId != -1 && node.getParams() != null) {
            for (ConstructorParamNode p : node.getParams().getParams()) {
                if (p.getAccessModifier() != null && p.getName() != null) {
                    node.createSymbol(classScopeId, p.getName(), "ClassVariable");
                }
            }
        }

        node.removeScope();
        return node;
    }

    @Override
    public Node visitConstructorParamList(FrameParser.ConstructorParamListContext ctx) {
        ConstructorParamListNode listNode = new ConstructorParamListNode();

        listNode.initializeNode(ctx, false, "");

        for (FrameParser.ConstructorParamContext pctx : ctx.constructorParam()) {
            ConstructorParamNode param = (ConstructorParamNode) visit(pctx);
            listNode.getParams().add(param);
        }

        return listNode;
    }

    @Override
    public Node visitConstructorParam(FrameParser.ConstructorParamContext ctx) {
        ConstructorParamNode node = new ConstructorParamNode();

        // لا سكوب جديد هنا — نلتقط السكوب الحالي (سكوب الـ constructor)
        node.initializeNode(ctx, false, "");

        // 1) ACCESS_MODIFIER (توكن اختياري)
        String am = (ctx.ACCESS_MODIFIER() != null) ? ctx.ACCESS_MODIFIER().getText() : null;
        node.setAccessModifier(am);

        // 2) الاسم: أول IDENTIFIER
        String name = null;
        if (ctx.IDENTIFIER() != null && !ctx.IDENTIFIER().isEmpty()) {
            name = ctx.IDENTIFIER(0).getText();
        }
        node.setName(name);

        // 3) النوع بعد النقطتين: إمّا IDENTIFIER ثانٍ أو توكن TYPE
        String typeName = null;
        if (ctx.IDENTIFIER() != null && ctx.IDENTIFIER().size() > 1) {
            typeName = ctx.IDENTIFIER(1).getText();
        } else if (ctx.TYPE() != null) {
            typeName = ctx.TYPE().getText();
        }
        node.setTypeName(typeName);

        // 4) الرموز:
        //    - المعامل داخل سكوب الـ constructor (السكوب الحالي)
        if (name != null && node.getScopeID() != -1) {
            node.createSymbol(node.getScopeID(), name, "Parameter");
        }

        //    - إن وُجد ACCESS_MODIFIER: أنشئ خاصية كلاس في سكوب الأب (سكوب الكلاس)
        Scope current = node.getCurrentScope();
        if (am != null && current != null && current.getParent() != null) {
            int classScopeId = current.getParent().getId();
            node.createSymbol(classScopeId, name, "ClassVariable");
        }
        return node;
    }

    @Override
    public Node visitComponentStatement1(FrameParser.ComponentStatement1Context ctx) {
        ComponentStatement1 node = new ComponentStatement1();

        node.initializeNode(ctx, false, "");

        FrameParser.ComponentDecoratorContext dec = ctx.componentDecorator();
        if (dec != null && dec.componentOptions() != null) {
            ComponentOptionsNode opts = (ComponentOptionsNode) visit(dec.componentOptions());
            node.setOptions(opts);
        }

        return node;

    }

    @Override
    public Node visitComponentOptions(FrameParser.ComponentOptionsContext ctx) {
        ComponentOptionsNode node = new ComponentOptionsNode();

        node.initializeNode(ctx, false, "");

        // الخصائص وفق الترتيب في القاعدة
        if (ctx.selectorProperty() != null) {
            SelectorPropertyNode sel = (SelectorPropertyNode) visit(ctx.selectorProperty());
            node.setSelector(sel);
        }

        if (ctx.standaloneProperty() != null) {
            StandalonePropertyNode st = (StandalonePropertyNode) visit(ctx.standaloneProperty());
            node.setStandalone(st);
        }

        if (ctx.importsProperty() != null) {
            ImportsPropertyNode imp = (ImportsPropertyNode) visit(ctx.importsProperty());
            node.setImportsProp(imp);
        }

        if (ctx.templateProperty() != null) {
            TemplatePropertyNode tmp = (TemplatePropertyNode) visit(ctx.templateProperty());
            node.setTemplate(tmp);
        }

        return node;
    }

    @Override
    public Node visitSelectorProperty(FrameParser.SelectorPropertyContext ctx) {
        SelectorPropertyNode node = new SelectorPropertyNode();

        // لا نفتح سكوب هنا
        node.initializeNode(ctx, false, "");

        // STRING هو التوكن الحامل للقيمة النصية بين علامتي التنصيص
        if (ctx.STRING() != null) {
            node.setSelectorLiteral(ctx.STRING().getText());
        }

        // لا createSymbol ولا removeScope هنا
        return node;
    }

    @Override
    public Node visitStandaloneProperty(FrameParser.StandalonePropertyContext ctx) {
        StandalonePropertyNode node = new StandalonePropertyNode();

        // لا سكوب جديد
        node.initializeNode(ctx, false, "");

        if (ctx.BOOLEAN() != null) {
            String boolText = ctx.BOOLEAN().getText();
            node.setStandalone("true".equalsIgnoreCase(boolText));
        }

        // لا createSymbol ولا removeScope
        return node;
    }

    @Override
    public Node visitImportsProperty(FrameParser.ImportsPropertyContext ctx) {
        ImportsPropertyNode node = new ImportsPropertyNode();

        node.initializeNode(ctx, false, "");

        if (ctx.IDENTIFIER() != null) {
            for (TerminalNode id : ctx.IDENTIFIER()) {
                node.getImports().add(id.getText());
            }
        }

        return node;
    }

    @Override
    public Node visitTemplateProperty(FrameParser.TemplatePropertyContext ctx) {
        TemplatePropertyNode node = new TemplatePropertyNode();

        node.initializeNode(ctx, false, "");

        if (ctx.htmlSection() != null) {
            for (FrameParser.HtmlSectionContext hctx : ctx.htmlSection()) {
                HtmlSectionNode sec = (HtmlSectionNode) visit(hctx);
                node.getSections().add(sec);
            }
        }

        return node;
    }

    @Override
    public Node visitHTMLSpanLabel(FrameParser.HTMLSpanLabelContext ctx) {
        HTMLSpanLabel spanNode = new HTMLSpanLabel();

        // لا سكوب جديد
        spanNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.SpanAttributeContext) {
                SpanAttribute attr = (SpanAttribute) visit(child);
                spanNode.getAttributes().add(attr);

            } else if (child instanceof FrameParser.SpanContentContext) {
                SpanContent content = (SpanContent) visit(child);
                spanNode.setContent(content);
            }
        }

        return spanNode;
    }

    @Override
    public Node visitSpanAttribute(FrameParser.SpanAttributeContext ctx) {
        SpanAttribute node = new SpanAttribute();
        node.initializeNode(ctx, false, "");

        // STYLE أو CLASS_KW مباشرة
        String type = (ctx.STYLE() != null) ? ctx.STYLE().getText() : ctx.CLASS_KW().getText();
        String raw  = ctx.STRING().getText(); // "value" مع علامات التنصيص

        node.setAttributeType(type);
        node.setValue(raw.substring(1, raw.length() - 1)); // شِيل علامتي التنصيص لأن getValue() يضيفهما

        return node;
    }

    @Override
    public Node visitSpanContent(FrameParser.SpanContentContext ctx) {
        SpanContent node = new SpanContent();
        node.initializeNode(ctx, false, "");

        String raw = ctx.STRING().getText();          // "text"
        node.setValue(raw.substring(1, raw.length()-1)); // إزالة علامتي التنصيص

        return node;
    }

    @Override
    public Node visitHTMLAnchorLabel(FrameParser.HTMLAnchorLabelContext ctx) {
        HTMLAnchorLabel node = new HTMLAnchorLabel();
        node.initializeNode(ctx, false, "");

        FrameParser.HtmlAnchorTagContext tag = ctx.htmlAnchorTag();
        if (tag != null) {
            if (tag.anchorAttribute() != null) {
                for (FrameParser.AnchorAttributeContext aCtx : tag.anchorAttribute()) {
                    AnchorAttribute attr = (AnchorAttribute) visit(aCtx);
                    node.getAttributes().add(attr);
                }
            }
            if (tag.anchorContent() != null) {
                AnchorContent content = (AnchorContent) visit(tag.anchorContent());
                node.setContent(content);
            }
        }

        return node;
    }

    @Override
    public Node visitDivSpanLabel(FrameParser.DivSpanLabelContext ctx) {
        DivSpanLabel node = new DivSpanLabel();
        node.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        if (ctx.htmlSpanTag() != null) {
            // أعِد استخدام بنّاء الـ <span> الموجود لديك
            HTMLSpanLabel span = (HTMLSpanLabel) visit(ctx.htmlSpanTag());
            node.setSpan(span);
        }

        return node;
    }

    @Override
    public Node visitDivAnchorLabel(FrameParser.DivAnchorLabelContext ctx) {
        DivAnchorLabel node = new DivAnchorLabel();
        node.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        if (ctx.htmlAnchorTag() != null) {
            HTMLAnchorLabel anchor = (HTMLAnchorLabel) visit(ctx.htmlAnchorTag());
            node.setAnchor(anchor);
        }

        return node;
    }

    @Override
    public Node visitDivLabel(FrameParser.DivLabelContext ctx) {
        DivLabel node = new DivLabel();
        node.initializeNode(ctx, false, "");

        if (ctx.htmlLabelTag() != null) {
            HTMLLabel label = (HTMLLabel) visit(ctx.htmlLabelTag());
            node.setLabel(label);
        }

        return node;
    }

    @Override
    public Node visitFunctionStatement(FrameParser.FunctionStatementContext ctx) {
        FunctionStatement node = new FunctionStatement();

        FrameParser.FunctionDeclarationContext fd = ctx.functionDeclaration();

        String name = (fd.IDENTIFIER() != null) ? fd.IDENTIFIER().getText() : null;
        node.setName(name);

        int outerScopeId = -1;
        if (node.getCurrentScope() != null) {
            outerScopeId = node.getCurrentScope().getId();
        }

        node.initializeNode(fd, true, (name != null ? name : "Function"));

        if (fd.paramList() != null) {
            ParamListNode params = (ParamListNode) visit(fd.paramList());
            node.setParamList(params); // المعاملات نفسها تضيف Symbols داخل سكوب الدالة
        }

        if (fd.block() != null) {
            BlockNode blk = (BlockNode) visit(fd.block());
            node.setBlock(blk);
        }

        if (name != null && outerScopeId != -1) {
            node.createSymbol(outerScopeId, name, "Function");
        }

        node.removeScope();
        return node;
    }


    @Override
    public Node visitParamList(FrameParser.ParamListContext ctx) {
        ParamListNode list = new ParamListNode();
        list.initializeNode(ctx, false, ""); // لا سكوب هنا

        for (FrameParser.ParamContext pctx : ctx.param()) {
            ParamNode p = (ParamNode) visit(pctx);
            list.getParams().add(p);
        }

        return list;
    }

    @Override
    public Node visitParam(FrameParser.ParamContext ctx) {
        ParamNode node = new ParamNode();

        node.initializeNode(ctx, false, "");

        if (ctx.ACCESS_MODIFIER() != null) {
            node.setAccessModifier(ctx.ACCESS_MODIFIER().getText());
        }


        String name = (ctx.IDENTIFIER() != null && ctx.IDENTIFIER().size() > 0)
                ? ctx.IDENTIFIER(0).getText()
                : null;
        node.setName(name);


        String typeName = null;
        if (ctx.IDENTIFIER() != null && ctx.IDENTIFIER().size() > 1) {
            typeName = ctx.IDENTIFIER(1).getText();
        } else if (ctx.TYPE() != null) {
            typeName = ctx.TYPE().getText();
        }
        node.setTypeName(typeName);

        if (name != null && node.getScopeID() != -1) {
            node.createSymbol(node.getScopeID(), name, "Parameter");
        }

        return node;
    }

    @Override
    public Node visitBlock(FrameParser.BlockContext ctx) {
        BlockNode node = new BlockNode();

        node.initializeNode(ctx, true, "Block");


        if (ctx.blockContent() != null) {
            FrameParser.BlockContentContext bc = ctx.blockContent();

            for (int i = 0; i < bc.getChildCount(); i++) {
                ParseTree child = bc.getChild(i);

                if (child instanceof FrameParser.StatementsContext) {
                    Node st = (Node) visit(child);
                    node.getItems().add(st);
                }
            }
        }

        node.removeScope();

        return node;
    }

    public Node visitBlockContent(FrameParser.BlockContentContext ctx) {
        BlockContentNode node = new BlockContentNode();
        node.initializeNode(ctx, false, "");

        if (ctx.statementInBlock() != null) {
            for (FrameParser.StatementInBlockContext sctx : ctx.statementInBlock()) {
                Node st = (Node) visit(sctx);
                node.getStatements().add(st);
            }
        }

        return node;
    }

    @Override
    public Node visitStatementInBlock(FrameParser.StatementInBlockContext ctx) {
        StatementInBlockNode node = new StatementInBlockNode();
        node.initializeNode(ctx, false, "");

        if (ctx.varDeclareStatement() != null) {
            node.setStatement((Node) visit(ctx.varDeclareStatement()));

        } else if (ctx.exprStatement() != null) {
            node.setStatement((Node) visit(ctx.exprStatement()));

        } else if (ctx.ifStatement() != null) {
            node.setStatement((Node) visit(ctx.ifStatement()));

        } else if (ctx.returnStatement() != null) {
            node.setStatement((Node) visit(ctx.returnStatement()));
        }

        return node;
    }

    @Override
    public Node visitIfStatement(FrameParser.IfStatementContext ctx) {
        IfStatementNode node = new IfStatementNode();
        node.initializeNode(ctx, false, "");

        if (ctx.expr() != null) {
            node.setCondition((Node) visit(ctx.expr()));
        }

        boolean inThen = true;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode tn && tn.getSymbol().getType() == FrameParser.ELSE) {
                inThen = false;
                continue;
            }

            if (child instanceof FrameParser.BlockContext) {
                Node b = (Node) visit(child);
                if (inThen) node.setThenBranch(b); else node.setElseBranch(b);

            } else if (child instanceof FrameParser.ExprStatementContext) {
                Node e = (Node) visit(child);
                if (inThen) node.setThenBranch(e); else node.setElseBranch(e);

            } else if (child instanceof FrameParser.ReturnStatementContext) {
                Node r = (Node) visit(child);
                if (inThen) node.setThenBranch(r); else node.setElseBranch(r);
            }
        }

        return node;
    }

    @Override
    public Node visitReturnStatement(FrameParser.ReturnStatementContext ctx) {
        ReturnStatementNode node = new ReturnStatementNode();

        node.initializeNode(ctx, false, "");

        if (ctx.expr() != null) {
            node.setExpr((Node) visit(ctx.expr()));
        }

        return node;
    }

    @Override
    public Node visitVarDeclareStatement1(FrameParser.VarDeclareStatement1Context ctx) {
        VarDeclareStatement1 node = new VarDeclareStatement1();

        FrameParser.VarDeclareStatementContext vd = ctx.varDeclareStatement();
        node.initializeNode(vd, false, ""); // لا سكوب هنا

        // EXPORT_KW?
        node.setExported(vd.EXPORT_KW() != null);

        // CONST_KW | LET
        String kind = (vd.CONST_KW() != null) ? vd.CONST_KW().getText()
                : (vd.LET() != null)      ? vd.LET().getText()
                : null;
        node.setKind(kind);

        // varDecl (COMMA varDecl)*
        if (vd.varDecl() != null) {
            for (FrameParser.VarDeclContext dctx : vd.varDecl()) {
                VarDeclNode decl = (VarDeclNode) visit(dctx);
                node.getDecls().add(decl);
            }
        }

        return node;
    }


    @Override
    public Node visitVarDecl(FrameParser.VarDeclContext ctx) {
        VarDeclNode node = new VarDeclNode();

        node.initializeNode(ctx, false, "");

        // بديل 1: ROUTES_ID ...
        if (ctx.ROUTES_ID() != null) {
            node.setName(ctx.ROUTES_ID().getText());
            if (ctx.ROUTES_TYPE() != null) {
                node.setRoutesType(ctx.ROUTES_TYPE().getText());
            }
        }
        // بديل 2: IDENTIFIER ...
        else if (ctx.IDENTIFIER() != null) {
            node.setName(ctx.IDENTIFIER().getText());
            if (ctx.generalTypeAnnotation() != null) {
                Node ann = (Node) visit(ctx.generalTypeAnnotation());
                node.setTypeAnnotation(ann);
            }
        }

        if (ctx.assignmentExpr() != null) {
            Node init = (Node) visit(ctx.assignmentExpr());
            node.setInitializer(init);
        }

        // استنتاج نوع الإعلان const/let من الأب varDeclareStatement
        ParserRuleContext p = ctx.getParent();
        FrameParser.VarDeclareStatementContext vds = null;
        while (p != null && !(p instanceof FrameParser.VarDeclareStatementContext)) {
            p = p.getParent();
        }
        vds = (FrameParser.VarDeclareStatementContext) p;

        String kind = null;
        String symType = "Variable";
        if (vds != null) {
            if (vds.CONST_KW() != null) {
                kind = vds.CONST_KW().getText();   // "const"
                symType = "ConstVariable";
            } else if (vds.LET() != null) {
                kind = vds.LET().getText();        // "let"
                symType = "Variable";
            }
        }
        node.setVarKind(kind);

        if (node.getName() != null && node.getScopeID() != -1) {
            node.createSymbol(node.getScopeID(), node.getName(), symType);
        }

        return node;
    }

    @Override
    public Node visitGeneralTypeAnnotation(FrameParser.GeneralTypeAnnotationContext ctx) {
        GeneralTypeAnnotationNode node = new GeneralTypeAnnotationNode();
        node.initializeNode(ctx, false, "");

        if (ctx.typeRef() != null) {
            Node t = (Node) visit(ctx.typeRef());
            node.setTypeRef(t);
        }

        return node;
    }

    @Override
    public Node visitPropertyDeclaration(FrameParser.PropertyDeclarationContext ctx) {
        PropertyDeclarationNode node = new PropertyDeclarationNode();
        node.initializeNode(ctx, false, "");

        if (ctx.routesPropertyDeclaration() != null) {
            node.setProperty((Node) visit(ctx.routesPropertyDeclaration()));
        } else if (ctx.normalPropertyDeclaration() != null) {
            node.setProperty((Node) visit(ctx.normalPropertyDeclaration()));
        }

        return node;
    }

    @Override
    public Node visitRoutesPropertyDeclaration(FrameParser.RoutesPropertyDeclarationContext ctx) {
        RoutesPropertyDeclarationNode node = new RoutesPropertyDeclarationNode();
        node.initializeNode(ctx, false, "");

        // token ROUTES_TYPE مكرر مرتين: الأول اسم الخاصية، الثاني نوعها
        String name = ctx.ROUTES_TYPE(0).getText();
        String type = ctx.ROUTES_TYPE(1).getText();
        node.setName(name);
        node.setTypeName(type);

        if (ctx.assignmentExpr() != null) {
            node.setInitializer((Node) visit(ctx.assignmentExpr()));
        }

        // تسجيل الخاصية ضمن سكوب الكلاس الحالي
        if (name != null && node.getScopeID() != -1) {
            node.createSymbol(node.getScopeID(), name, "ClassVariable");
        }

        return node;
    }

    @Override
    public Node visitNormalPropertyDeclaration(FrameParser.NormalPropertyDeclarationContext ctx) {
        NormalPropertyDeclarationNode node = new NormalPropertyDeclarationNode();

        node.initializeNode(ctx, false, "");

        if (ctx.IDENTIFIER() != null) {
            node.setName(ctx.IDENTIFIER().getText());
        }

        if (ctx.generalTypeAnnotation() != null) {
            GeneralTypeAnnotationNode ann = (GeneralTypeAnnotationNode) visit(ctx.generalTypeAnnotation());
            node.setType(ann);
        }

        if (ctx.assignmentExpr() != null) {
            Node init = (Node) visit(ctx.assignmentExpr());
            node.setInitializer(init);
        }

        if (node.getName() != null && node.getScopeID() != -1) {
            node.createSymbol(node.getScopeID(), node.getName(), "ClassVariable");
        }

        return node;
    }

    @Override
    public Node visitTypeAliasStatement1(FrameParser.TypeAliasStatement1Context ctx) {
        TypeAliasStatement1 node = new TypeAliasStatement1();
        node.initializeNode(ctx, false, "");

        FrameParser.TypeAliasStatementContext ta = ctx.typeAliasStatement();

        if (ta.IDENTIFIER() != null) {
            node.setName(ta.IDENTIFIER().getText());
        }

        // objectType
        if (ta.objectType() != null) {
            ObjectTypeNode obj = (ObjectTypeNode) visit(ta.objectType());
            node.setObject(obj);
        }

        if (node.getName() != null && node.getScopeID() != -1) {
            node.createSymbol(node.getScopeID(), node.getName(), "TypeAlias");
        }

        return node;
    }

    @Override
    public Node visitObjectType(FrameParser.ObjectTypeContext ctx) {
        ObjectTypeNode node = new ObjectTypeNode();

        node.initializeNode(ctx, false, "");

        if (ctx.objectTypeMembers() != null) {
            Node mems = (Node) visit(ctx.objectTypeMembers());
            node.setMembers(mems);
        }

        return node;
    }

    @Override
    public Node visitObjectTypeMembers(FrameParser.ObjectTypeMembersContext ctx) {
        ObjectTypeMembersNode node = new ObjectTypeMembersNode();

        node.initializeNode(ctx, false, "");
        if (ctx.objectTypeMember() != null) {
            for (FrameParser.ObjectTypeMemberContext mctx : ctx.objectTypeMember()) {
                Node m = (Node) visit(mctx);
                node.getMembers().add(m);
            }
        }

        return node;
    }

    @Override
    public Node visitObjectTypeMember(FrameParser.ObjectTypeMemberContext ctx) {
        ObjectTypeMemberNode node = new ObjectTypeMemberNode();
        node.initializeNode(ctx, false, "");

        if (ctx.IDENTIFIER() != null) {
            node.setName(ctx.IDENTIFIER().getText());
        }

        node.setOptional(ctx.QUESTION() != null);

        if (ctx.typeRef() != null) {
            node.setTypeRef((Node) visit(ctx.typeRef()));
        }

        return node;
    }

    @Override
    public Node visitTypeRef(FrameParser.TypeRefContext ctx) {
        TypeRefNode node = new TypeRefNode();

        node.initializeNode(ctx, false, "");

        if (ctx.IDENTIFIER() != null) {
            node.setBase(ctx.IDENTIFIER().getText());
        } else if (ctx.TYPE() != null) {
            node.setBase(ctx.TYPE().getText());
        } else if (ctx.NULL() != null) {
            node.setBase(ctx.NULL().getText()); // "null"
        }

        if (ctx.LBRACKET() != null) {
            node.setArrayDims(ctx.LBRACKET().size());
        }

        if (ctx.typeRef() != null) {
            for (FrameParser.TypeRefContext tctx : ctx.typeRef()) {
                TypeRefNode other = (TypeRefNode) visit(tctx);
                node.getUnionTypes().add(other);
            }
        }

        return node;
    }

    @Override
    public Node visitExprStatement1(FrameParser.ExprStatement1Context ctx) {
        ExprStatement1 node = new ExprStatement1();

        FrameParser.ExprStatementContext es = ctx.exprStatement();
        node.initializeNode(es != null ? es : ctx, false, "");

        if (es != null && es.expr() != null) {
            node.setExpr((Node) visit(es.expr()));
        }

        return node;
    }


    @Override
    public Node visitExpr(FrameParser.ExprContext ctx) {
        ExprNode node = new ExprNode();
        node.initializeNode(ctx, false, ""); // لا سكوب هنا

        if (ctx.assignmentExpr() != null) {
            node.setAssignment((Node) visit(ctx.assignmentExpr()));
        }

        return node;
    }

    @Override
    public Node visitAssignmentExpr(FrameParser.AssignmentExprContext ctx) {
        AssignmentExprNode node = new AssignmentExprNode();

        node.initializeNode(ctx, false, "");

        // البديل 1: assignable '=' assignmentExpr  (ارتباط يميني)
        if (ctx.assignable() != null && ctx.assignmentExpr() != null) {
            node.setLeft((Node) visit(ctx.assignable()));
            node.setRight((Node) visit(ctx.assignmentExpr()));
        }
        // البديل 2: conditionalExpr
        else if (ctx.conditionalExpr() != null) {
            node.setConditional((Node) visit(ctx.conditionalExpr()));
        }

        return node;
    }

    @Override
    public Node visitAssignable(FrameParser.AssignableContext ctx) {
        AssignableNode node = new AssignableNode();
        node.initializeNode(ctx, false, ""); // لا سكوب هنا

        // الأساس: IDENTIFIER | (expr)
        if (ctx.getChildCount() > 0) {
            ParseTree first = ctx.getChild(0);

            if (first instanceof TerminalNode t && t.getSymbol().getType() == FrameParser.IDENTIFIER) {
                node.setBaseIdentifier(t.getText());
            } else if (first instanceof TerminalNode t && t.getSymbol().getType() == FrameParser.LPAREN) {
                // ابحث عن expr بين الأقواس
                for (int i = 1; i < ctx.getChildCount(); i++) {
                    if (ctx.getChild(i) instanceof FrameParser.ExprContext) {
                        node.setBaseExpr((Node) visit(ctx.getChild(i)));
                        break;
                    }
                }
            }
        }

        // أجزاء الوصول: .name أو [expr]
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree ch = ctx.getChild(i);

            if (ch instanceof TerminalNode t) {
                int type = t.getSymbol().getType();

                // DOT (IDENTIFIER | SRC | TARGET)
                if (type == FrameParser.DOT && i + 1 < ctx.getChildCount()) {
                    node.getOrder().add('d');
                    node.getDotProps().add(ctx.getChild(++i).getText()); // خذ الاسم التالي مباشرة

                    // LBRACKET expr RBRACKET
                } else if (type == FrameParser.LBRACKET && i + 1 < ctx.getChildCount()) {
                    if (ctx.getChild(i + 1) instanceof FrameParser.ExprContext) {
                        Node idx = (Node) visit(ctx.getChild(i + 1));
                        node.getOrder().add('i');
                        node.getIndexExprs().add(idx);
                    }
                    // تخطَّ expr و RBRACKET إن وُجدا
                    i = Math.min(i + 2, ctx.getChildCount() - 1);
                }
            }
        }

        return node;
    }

    @Override
    public Node visitConditionalExpr(FrameParser.ConditionalExprContext ctx) {
        ConditionalExprNode node = new ConditionalExprNode();

        node.initializeNode(ctx, false, "");

        if (ctx.nullishExpr() != null) {
            node.setCondition((Node) visit(ctx.nullishExpr()));
        }

        if (ctx.expr() != null && ctx.expr().size() == 2) {
            node.setThenExpr((Node) visit(ctx.expr(0)));
            node.setElseExpr((Node) visit(ctx.expr(1)));
        }

        return node;
    }

    @Override
    public Node visitNullishExpr(FrameParser.NullishExprContext ctx) {
        NullishExprNode node = new NullishExprNode();
        node.initializeNode(ctx, false, "");

        if (ctx.logicalOrExpr() != null) {
            for (FrameParser.LogicalOrExprContext lctx : ctx.logicalOrExpr()) {
                Node operand = (Node) visit(lctx);
                node.getOperands().add(operand);
            }
        }

        return node;
    }

    @Override
    public Node visitLogicalOrExpr(FrameParser.LogicalOrExprContext ctx) {
        LogicalOrExprNode node = new LogicalOrExprNode();
        node.initializeNode(ctx, false, "");

        java.util.ArrayList<FrameParser.LogicalAndExprContext> parts = new java.util.ArrayList<>();
        FrameParser.LogicalOrExprContext cur = ctx;

        while (cur.logicalOrExpr() != null) {
            parts.add(cur.logicalAndExpr());
            cur = cur.logicalOrExpr();
        }

        parts.add(cur.logicalAndExpr());


        for (int i = parts.size() - 1; i >= 0; i--) {
            Node andNode = (Node) visit(parts.get(i));
            node.getOperands().add(andNode);
        }

        return node;
    }

    @Override
    public Node visitLogicalAndExpr(FrameParser.LogicalAndExprContext ctx) {
        LogicalAndExprNode node = new LogicalAndExprNode();
        node.initializeNode(ctx, false, "");

        java.util.ArrayList<FrameParser.EqualityExprContext> parts = new java.util.ArrayList<>();
        FrameParser.LogicalAndExprContext cur = ctx;

        while (cur.logicalAndExpr() != null) {
            parts.add(cur.equalityExpr());
            cur = cur.logicalAndExpr();
        }
        parts.add(cur.equalityExpr());
        for (int i = parts.size() - 1; i >= 0; i--) {
            Node eq = (Node) visit(parts.get(i));
            node.getOperands().add(eq);
        }

        return node;
    }

    @Override
    public Node visitEqualityExpr(FrameParser.EqualityExprContext ctx) {
        EqualityExprNode node = new EqualityExprNode();
        node.initializeNode(ctx, false, "");

        ArrayList<FrameParser.RelationalExprContext> parts = new ArrayList<>();
        ArrayList<String> opsStack = new ArrayList<>();

        FrameParser.EqualityExprContext cur = ctx;
        while (cur.equalityExpr() != null) {

            String opText =
            (cur.TEQUAL() != null)       ? cur.TEQUAL().getText() :
            (cur.EQUALEQUAL() != null)   ? cur.EQUALEQUAL().getText() :
            (cur.NTEQUAL() != null)      ? cur.NTEQUAL().getText() :
            (cur.NOTEQUAL() != null)     ? cur.NOTEQUAL().getText() :
            null;

            if (opText != null) opsStack.add(opText);
            parts.add(cur.relationalExpr());
            cur = cur.equalityExpr();
        }

        parts.add(cur.relationalExpr());

        for (int i = parts.size() - 1; i >= 0; i--) {
            Node r = (Node) visit(parts.get(i));
            node.getOperands().add(r);
        }

        for (int i = opsStack.size() - 1; i >= 0; i--) {
            node.getOps().add(opsStack.get(i));
        }

        return node;
    }

    @Override
    public Node visitRelationalExpr(FrameParser.RelationalExprContext ctx) {
        RelationalExprNode node = new RelationalExprNode();
        node.initializeNode(ctx, false, "");

        ArrayList<FrameParser.AdditiveExprContext> parts = new ArrayList<>();
        ArrayList<String> opsStack = new ArrayList<>();

        FrameParser.RelationalExprContext cur = ctx;
        while (cur.relationalExpr() != null) {

            String opText =
            (cur.LT()  != null) ? cur.LT().getText()  :
            (cur.GT()  != null) ? cur.GT().getText()  :
            (cur.LTE() != null) ? cur.LTE().getText() :
            (cur.GTE() != null) ? cur.GTE().getText() :
             null;
            if (opText != null) opsStack.add(opText);
            parts.add(cur.additiveExpr());

            cur = cur.relationalExpr();
        }

        parts.add(cur.additiveExpr());

        for (int i = parts.size() - 1; i >= 0; i--) {
            Node add = (Node) visit(parts.get(i));
            node.getOperands().add(add);
        }

        for (int i = opsStack.size() - 1; i >= 0; i--) {
            node.getOps().add(opsStack.get(i));
        }

        return node;
    }

    @Override
    public Node visitAdditiveExpr(FrameParser.AdditiveExprContext ctx) {
        AdditiveExprNode node = new AdditiveExprNode();
        node.initializeNode(ctx, false, "");

        ArrayList<FrameParser.MultiplicativeExprContext> parts = new ArrayList<>();
        ArrayList<String> opsStack = new ArrayList<>();

        FrameParser.AdditiveExprContext cur = ctx;
        while (cur.additiveExpr() != null) {
            String opText =
                    (cur.PLUS()  != null) ? cur.PLUS().getText() :
                            (cur.MINUS() != null) ? cur.MINUS().getText() : null;
            if (opText != null) opsStack.add(opText);

            parts.add(cur.multiplicativeExpr());
            cur = cur.additiveExpr();
        }
        parts.add(cur.multiplicativeExpr());

        for (int i = parts.size() - 1; i >= 0; i--) {
            Node mul = (Node) visit(parts.get(i));
            node.getOperands().add(mul);
        }

        for (int i = opsStack.size() - 1; i >= 0; i--) {
            node.getOps().add(opsStack.get(i));
        }

        return node;
    }

    @Override
    public Node visitMultiplicativeExpr(FrameParser.MultiplicativeExprContext ctx) {
        MultiplicativeExprNode node = new MultiplicativeExprNode();
        node.initializeNode(ctx, false, "");

        ArrayList<FrameParser.UnaryExprContext> parts = new ArrayList<>();
        ArrayList<String> opsStack = new ArrayList<>();

        FrameParser.MultiplicativeExprContext cur = ctx;
        while (cur.multiplicativeExpr() != null) {
            String opText =
                    (cur.ASTERISK() != null) ? cur.ASTERISK().getText() :
                            (cur.DIV()      != null) ? cur.DIV().getText() :
                                    null;
            if (opText != null) opsStack.add(opText);

            parts.add(cur.unaryExpr());

            cur = cur.multiplicativeExpr();
        }
        parts.add(cur.unaryExpr());

        for (int i = parts.size() - 1; i >= 0; i--) {
            Node un = (Node) visit(parts.get(i));
            node.getOperands().add(un);
        }

        for (int i = opsStack.size() - 1; i >= 0; i--) {
            node.getOps().add(opsStack.get(i));
        }

        return node;
    }

    @Override
    public Node visitUnaryExpr(FrameParser.UnaryExprContext ctx) {
        UnaryExprNode node = new UnaryExprNode();
        node.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        // لفّ على السلسلة: (NOT | PLUS | MINUS) unaryExpr ... ثم asExpression
        java.util.ArrayList<String> ops = new java.util.ArrayList<>();
        FrameParser.UnaryExprContext cur = ctx;

        while (cur.asExpression() == null) {
            if (cur.NOT() != null)       ops.add(cur.NOT().getText());
            else if (cur.PLUS() != null) ops.add(cur.PLUS().getText());
            else if (cur.MINUS() != null)ops.add(cur.MINUS().getText());
            cur = cur.unaryExpr();
        }

        node.setOperators(ops);
        node.setOperand((Node) visit(cur.asExpression()));

        return node;
    }

    @Override
    public Node visitAsExpression(FrameParser.AsExpressionContext ctx) {
        AsExpressionNode node = new AsExpressionNode();
        node.initializeNode(ctx, false, ""); // لا سكوب هنا

        // postfixExpr
        if (ctx.postfixExpr() != null) {
            node.setBase((Node) visit(ctx.postfixExpr()));
        }

        // (AS typeRef)*
        if (ctx.typeRef() != null) {
            for (FrameParser.TypeRefContext tctx : ctx.typeRef()) {
                TypeRefNode tr = (TypeRefNode) visit(tctx);
                node.getTypes().add(tr);
            }
        }

        return node;
    }

    @Override
    public Node visitPostfixExpr(FrameParser.PostfixExprContext ctx) {
        PostfixExprNode node = new PostfixExprNode();
        node.initializeNode(ctx, false, ""); // لا سكوب هنا

        // base: primary
        if (ctx.primary() != null) {
            node.setBase((Node) visit(ctx.primary()));
        }

        // امشِ على الأطفال لبناء السلسلة
        for (int i = 1; i < ctx.getChildCount(); i++) {
            ParseTree ch = ctx.getChild(i);

            if (ch instanceof TerminalNode t) {
                int type = t.getSymbol().getType();

                // .prop  أو ?.prop
                if (type == FrameParser.DOT || type == FrameParser.QDOT) {
                    // الاسم التالي: IDENTIFIER | SRC | TARGET
                    if (i + 1 < ctx.getChildCount()) {
                        String name = ctx.getChild(i + 1).getText();
                        node.getOrder().add(type == FrameParser.DOT ? 'p' : 'P');
                        node.getPropNames().add(name);
                        i++; // تخطَّ الاسم
                        continue;
                    }
                }

                // (args)  أو ?.(args)
                if (type == FrameParser.LPAREN) {
                    Node args = null;
                    if (i + 1 < ctx.getChildCount() && ctx.getChild(i + 1) instanceof FrameParser.ArgumentListContext) {
                        args = (Node) visit(ctx.getChild(i + 1));
                        i++; // تخطَّ argumentList
                    }
                    // تخطَّ RPAREN (إن وجد) تلقائيًا بالزيادة في الحلقة
                    node.getOrder().add('c');
                    node.getCallArgs().add(args);
                    continue;
                }
                if (type == FrameParser.QDOT && i + 1 < ctx.getChildCount()
                        && ctx.getChild(i + 1) instanceof TerminalNode
                        && ((TerminalNode) ctx.getChild(i + 1)).getSymbol().getType() == FrameParser.LPAREN) {
                    // ?.(
                    i++; // على LPAREN
                    Node args = null;
                    if (i + 1 < ctx.getChildCount() && ctx.getChild(i + 1) instanceof FrameParser.ArgumentListContext) {
                        args = (Node) visit(ctx.getChild(i + 1));
                        i++; // تخطَّ argumentList
                    }
                    // RPAREN سيُتخطّى طبيعيًا
                    node.getOrder().add('C');
                    node.getCallArgs().add(args);
                    continue;
                }

                // [expr]  أو ?.[expr]
                if (type == FrameParser.LBRACKET) {
                    if (i + 1 < ctx.getChildCount() && ctx.getChild(i + 1) instanceof FrameParser.ExprContext) {
                        Node idx = (Node) visit(ctx.getChild(i + 1));
                        node.getOrder().add('i');
                        node.getIndexExprs().add(idx);
                        i += 1; // تخطَّ expr (RBRACKET يُتخطّى لاحقًا)
                    }
                    continue;
                }
                if (type == FrameParser.QDOT && i + 1 < ctx.getChildCount()
                        && ctx.getChild(i + 1) instanceof TerminalNode
                        && ((TerminalNode) ctx.getChild(i + 1)).getSymbol().getType() == FrameParser.LBRACKET) {
                    // ?.[
                    i++; // على LBRACKET
                    if (i + 1 < ctx.getChildCount() && ctx.getChild(i + 1) instanceof FrameParser.ExprContext) {
                        Node idx = (Node) visit(ctx.getChild(i + 1));
                        node.getOrder().add('I');
                        node.getIndexExprs().add(idx);
                        i += 1; // تخطَّ expr (RBRACKET يُتخطّى لاحقًا)
                    }
                    continue;
                }

                // !.prop  (NON_NULL_DOT)
                if (type == FrameParser.NON_NULL_DOT) {
                    if (i + 1 < ctx.getChildCount()) {
                        String name = ctx.getChild(i + 1).getText(); // IDENTIFIER | SRC | TARGET
                        node.getOrder().add('n');
                        node.getPropNames().add(name);
                        i++; // تخطَّ الاسم
                    }
                    continue;
                }
            }
        }

        return node;
    }

    @Override
    public Node visitSignalGenericCallPrimary(FrameParser.SignalGenericCallPrimaryContext ctx) {
        SignalGenericCallPrimaryNode node = new SignalGenericCallPrimaryNode();
        node.initializeNode(ctx, false, "");

        if (ctx.signalGenericArgs() != null) {
            node.setGenericArgs((Node) visit(ctx.signalGenericArgs()));
        }
        if (ctx.argumentList() != null) {
            node.setArgumentList((Node) visit(ctx.argumentList()));
        }

        return node;
    }

    @Override
    public Node visitSignalGenericArgs(FrameParser.SignalGenericArgsContext ctx) {
        SignalGenericArgsNode node = new SignalGenericArgsNode();
        node.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        if (ctx.signalGenericArg() != null) {
            for (FrameParser.SignalGenericArgContext aCtx : ctx.signalGenericArg()) {
                SignalGenericArgNode arg = (SignalGenericArgNode) visit(aCtx);
                node.getArgs().add(arg);
            }
        }

        return node;
    }


    @Override
    public Node visitSignalGenericArg(FrameParser.SignalGenericArgContext ctx) {
        SignalGenericArgNode node = new SignalGenericArgNode();
        node.initializeNode(ctx, false, "");

        if (ctx.IDENTIFIER() != null) {
            node.setBaseType(ctx.IDENTIFIER().getText());
        } else if (ctx.TYPE() != null) {
            node.setBaseType(ctx.TYPE().getText());
        }

        if (ctx.LBRACKET() != null) {
            node.setArrayDims(ctx.LBRACKET().size());
        }

        return node;
    }

    @Override
    public Node visitArgumentList(FrameParser.ArgumentListContext ctx) {
        ArgumentListNode node = new ArgumentListNode();
        node.initializeNode(ctx, false, "");

        if (ctx.expr() != null) {
            for (FrameParser.ExprContext ectx : ctx.expr()) {
                Node arg = (Node) visit(ectx);
                node.getArgs().add(arg);
            }
        }

        return node;
    }

    @Override
    public Node visitPrimary(FrameParser.PrimaryContext ctx) {
        PrimaryNode node = new PrimaryNode();
        node.initializeNode(ctx, false, "");

        // 1) بدائل قواعد
        if (ctx.arrowFunction() != null) {
            node.setArrowFunction((Node) visit(ctx.arrowFunction()));
            return node;
        }
        if (ctx.arrayLiteral() != null) {
            node.setArrayLiteral((Node) visit(ctx.arrayLiteral()));
            return node;
        }
        if (ctx.objectLiteral() != null) {
            node.setObjectLiteral((Node) visit(ctx.objectLiteral()));
            return node;
        }
        if (ctx.signalGenericCallPrimary() != null) {
            node.setSignalGenericCallPrimary((Node) visit(ctx.signalGenericCallPrimary()));
            return node;
        }
        if (ctx.importCallPrimary() != null) {
            node.setImportCallPrimary((Node) visit(ctx.importCallPrimary()));
            return node;
        }
        if (ctx.expr() != null && ctx.LPAREN() != null) {
            // ( expr )
            node.setParenthesized((Node) visit(ctx.expr()));
            return node;
        }

        // 2) ANGULAR_QUT htmlSection* ANGULAR_QUT
        if (ctx.htmlSection() != null && ctx.ANGULAR_QUT() != null && ctx.ANGULAR_QUT().size() == 2) {
            for (FrameParser.HtmlSectionContext hctx : ctx.htmlSection()) {
                HtmlSectionNode sec = (HtmlSectionNode) visit(hctx);
                node.getAngularSections().add(sec);
            }
            return node;
        }

        // 3) بدائل التوكنات/النصوص الخام
        if (ctx.NUMBER() != null) {
            node.setNumberLiteral(ctx.NUMBER().getText());
        } else if (ctx.ROUTES_ID() != null) {
            node.setRoutesId(ctx.ROUTES_ID().getText());
        } else if (ctx.STRING() != null) {
            node.setStringLiteral(ctx.STRING().getText()); // مع علامات التنصيص
        } else if (ctx.BOOLEAN() != null) {
            node.setBooleanLiteral(ctx.BOOLEAN().getText());
        } else if (ctx.NULL() != null) {
            node.setNull(true);
        } else if (ctx.SIGNAL_KW() != null) {
            node.setSignalKw(ctx.SIGNAL_KW().getText());
        } else if (ctx.IDENTIFIER() != null) {
            node.setIdentifier(ctx.IDENTIFIER().getText());
        } else if (ctx.IMPORT_KW() != null) {
            node.setImportKw(ctx.IMPORT_KW().getText());
        }

        return node;
    }

    @Override
    public Node visitImportCallPrimary(FrameParser.ImportCallPrimaryContext ctx) {
        ImportCallPrimaryNode node = new ImportCallPrimaryNode();
        node.initializeNode(ctx, false, "");

        // import("module")
        if (ctx.STRING() != null) {
            node.setModuleLiteral(ctx.STRING().getText()); // أبقِ العلامات كما هي
        }

        // ( . IDENTIFIER ( argumentList? ) )*
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree ch = ctx.getChild(i);

            if (ch instanceof TerminalNode tn && tn.getSymbol().getType() == FrameParser.DOT) {
                String name = null;
                ArgumentListNode argsNode = null;

                // التالي يجب أن يكون IDENTIFIER
                if (i + 1 < ctx.getChildCount()) {
                    name = ctx.getChild(i + 1).getText();
                }

                // ثم LPAREN argumentList? RPAREN
                int j = i + 2;
                if (j < ctx.getChildCount()
                        && ctx.getChild(j) instanceof TerminalNode
                        && ((TerminalNode) ctx.getChild(j)).getSymbol().getType() == FrameParser.LPAREN) {

                    // إن وُجد argumentList
                    if (j + 1 < ctx.getChildCount() && ctx.getChild(j + 1) instanceof FrameParser.ArgumentListContext) {
                        argsNode = (ArgumentListNode) visit(ctx.getChild(j + 1));
                        // RPAREN في j+2
                        i = j + 2; // تخطَّ المجموعة كاملة
                    } else {
                        // لا يوجد argumentList — RPAREN مباشرة
                        i = j + 1; // تخطَّ RPAREN
                    }
                }

                node.getCallNames().add(name);
                node.getCallArgs().add(argsNode);
            }
        }

        return node;
    }

    @Override
    public Node visitArrowFunction(FrameParser.ArrowFunctionContext ctx) {
        ArrowFunctionNode node = new ArrowFunctionNode();

        // افتح سكوب خاص بالـ Arrow Function
        node.initializeNode(ctx, true, "ArrowFunction");

        // الحالة 1: single param => IDENTIFIER ARROW ...
        if (ctx.IDENTIFIER() != null) {
            String p = ctx.IDENTIFIER().getText();
            node.getParams().add(p);
            node.setParenthesizedParams(false);

            // أضف الرمز للبرامتر داخل سكوب الدالة الحالية
            if (node.getScopeID() != -1) {
                node.createSymbol(node.getScopeID(), p, "Parameter");
            }
        }

        // الحالة 2: ( paramListSimple? ) => ...
        if (ctx.paramListSimple() != null || (ctx.LPAREN() != null && ctx.RPAREN() != null)) {
            node.setParenthesizedParams(true);

            if (ctx.paramListSimple() != null) {
                // لا نعرف قواعد paramListSimple التفصيلية؛ نجمع كل IDENTIFIER بداخلها كمعاملات
                FrameParser.ParamListSimpleContext pl = ctx.paramListSimple();
                for (int i = 0; i < pl.getChildCount(); i++) {
                    ParseTree ch = pl.getChild(i);
                    if (ch instanceof TerminalNode tn && tn.getSymbol().getType() == FrameParser.IDENTIFIER) {
                        String name = tn.getText();
                        node.getParams().add(name);
                        if (node.getScopeID() != -1) {
                            node.createSymbol(node.getScopeID(), name, "Parameter");
                        }
                    }
                }
            }
            // لو كانت الأقواس فارغة: () =>   فلا يوجد بارامترات
        }

        // الجسم: expr أو block
        if (ctx.expr() != null) {
            node.setBody((Node) visit(ctx.expr()));
        } else if (ctx.block() != null) {
            node.setBody((Node) visit(ctx.block())); // سيُفتح سكوب للـ block حسب منطقك الحالي
        }

        // أغلق سكوب الـ Arrow Function
        node.removeScope();

        return node;
    }

    @Override
    public Node visitParamListSimple(FrameParser.ParamListSimpleContext ctx) {
        ParamListSimpleNode node = new ParamListSimpleNode();
        node.initializeNode(ctx, false, "");

        if (ctx.IDENTIFIER() != null) {
            for (TerminalNode id : ctx.IDENTIFIER()) {
                node.getParams().add(id.getText());
            }
        }

        return node;
    }

    @Override
    public Node visitArrayLiteral(FrameParser.ArrayLiteralContext ctx) {
        ArrayLiteralNode node = new ArrayLiteralNode();
        node.initializeNode(ctx, false, "");

        if (ctx.arrayElement() != null) {
            for (FrameParser.ArrayElementContext ectx : ctx.arrayElement()) {
                Node el = (Node) visit(ectx);
                node.getElements().add(el);
            }
        }

        return node;
    }

    @Override
    public Node visitArrayElement(FrameParser.ArrayElementContext ctx) {
        ArrayElementNode node = new ArrayElementNode();
        node.initializeNode(ctx, false, "");

        node.setSpread(ctx.ELLIPSIS() != null);
        if (ctx.expr() != null) {
            node.setExpr((Node) visit(ctx.expr()));
        }

        return node;
    }

    @Override
    public Node visitObjectLiteral(FrameParser.ObjectLiteralContext ctx) {
        ObjectLiteralNode node = new ObjectLiteralNode();
        node.initializeNode(ctx, false, ""); // لا سكوب هنا

        if (ctx.objectProperty() != null) {
            for (FrameParser.ObjectPropertyContext pctx : ctx.objectProperty()) {
                ObjectPropertyNode prop = (ObjectPropertyNode) visit(pctx);
                node.getProperties().add(prop);
            }
        }

        return node;
    }

    @Override
    public Node visitObjectProperty(FrameParser.ObjectPropertyContext ctx) {
        ObjectPropertyNode node = new ObjectPropertyNode();
        node.initializeNode(ctx, false, ""); // لا سكوب ولا رموز هنا

        // بديل 1: ...expr
        if (ctx.ELLIPSIS() != null) {
            node.setSpread(true);
            if (ctx.expr() != null) {
                node.setExpression((Node) visit(ctx.expr()));
            }
            return node;
        }

        // بديل 2: (IDENTIFIER | STRING) : expr
        if (ctx.expr() != null) {
            if (ctx.IDENTIFIER() != null) {
                node.setKey(ctx.IDENTIFIER().getText());
            } else if (ctx.STRING() != null) {
                node.setKey(ctx.STRING().getText()); // حافظ على علامات التنصيص
            }
            node.setShorthand(false);
            node.setExpression((Node) visit(ctx.expr()));
            return node;
        }

        // بديل 3: IDENTIFIER (shorthand)
        if (ctx.IDENTIFIER() != null) {
            node.setKey(ctx.IDENTIFIER().getText());
            node.setShorthand(true);
        }

        return node;
    }

    @Override
    public Node visitInterpolation(FrameParser.InterpolationContext ctx) {
        InterpolationNode node = new InterpolationNode();
        node.initializeNode(ctx, false, "");

        node.setHasDollar(ctx.DOLAR() != null);
        if (ctx.expr() != null) {
            node.setExpr((Node) visit(ctx.expr()));
        }

        return node;
    }
}

