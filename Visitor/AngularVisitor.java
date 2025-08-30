package Visitor;

import Ast_Class.HTML_Classes.*;
import Ast_Class.Node.Node;
import Ast_Class.TS_Classes.*;
import Parser.FrameParser;
import Parser.FrameParserBaseVisitor;
import SemanticErros.ErrorCollector;
import SymbolTable.Scope;
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
    public Node visitConstructorDeclaration(FrameParser.ConstructorDeclarationContext ctx) {
        ConstructorDeclarationNode node = new ConstructorDeclarationNode();
        int parentScopeId = (node.getCurrentScope() != null) ? node.getCurrentScope().getId() : -1;

        node.initializeNode(ctx, true, "Constructor");


        if (ctx.constructorParamList() != null) {
            Node params = (Node) visit(ctx.constructorParamList());
            node.setParamList(params);
        }

        if (parentScopeId != -1) {
            node.createSymbol(parentScopeId, "constructor", "Constructor");
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

    public Node visitComponentStatement1(FrameParser.ComponentStatement1Context ctx) {
        ComponentStatement1 node = new ComponentStatement1();

        // لا نفتح سكوب
        node.initializeNode(ctx, false, "");

        // القاعدة الداخلية الفعلية: componentDecorator
        FrameParser.ComponentDecoratorContext dec = ctx.componentDecorator();

        // داخل الأقواس: LPAREN LBRACKETS componentOptions RBRACKETS RPAREN
        if (dec != null && dec.componentOptions() != null) {
            ComponentOptionsNode opts = (ComponentOptionsNode) visit(dec.componentOptions());
            node.setOptions(opts);
        }

        // لا createSymbol هنا
        return node;

    }

    @Override
    public Node visitComponentOptions(FrameParser.ComponentOptionsContext ctx) {
        ComponentOptionsNode node = new ComponentOptionsNode();

        // لا سكوب جديد هنا
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

        // لا createSymbol ولا removeScope هنا
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

        // لا سكوب جديد
        node.initializeNode(ctx, false, "");

        // اجمع كل أقسام الـ HTML داخل القالب
        if (ctx.htmlSection() != null) {
            for (FrameParser.HtmlSectionContext hctx : ctx.htmlSection()) {
                HtmlSectionNode sec = (HtmlSectionNode) visit(hctx);
                node.getSections().add(sec);
            }
        }

        // لا createSymbol ولا removeScope هنا
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


}

