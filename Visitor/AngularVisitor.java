package Visitor;

import Ast_Class.HTML_Classes.*;
import Ast_Class.Node.Node;
import Ast_Class.TS_Classes.*;
import Parser.FrameParser;
import Parser.FrameParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class AngularVisitor extends FrameParserBaseVisitor<Node>{

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
    public Node visitDivAttribute(FrameParser.DivAttributeContext ctx) {
        DivAttribute attribute = new DivAttribute();

        attribute.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.ID:
                    case FrameParser.CLASS:
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
    public Node visitDivImageLabel(FrameParser.DivImageLabelContext ctx) {
        DivImageLabel imgNode = new DivImageLabel();

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
    public Node visitDivButtonLabel(FrameParser.DivButtonLabelContext ctx) {
        DivButtonLabel buttonNode = new DivButtonLabel();

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
        DivParagraphLabel paragraphNode = new DivParagraphLabel();

        paragraphNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ParagraphAttributeContext) {
                ParagraphAttribute attr = (ParagraphAttribute) visit(child);
                paragraphNode.getAttributes().add(attr);

            } else if (child instanceof FrameParser.ParagraphContentContext) {
                ParagraphContentNode content = (ParagraphContentNode) visit(child);
                paragraphNode.setContent(content);
            }
        }

        return paragraphNode;
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
    public Node visitDivNgForLabel(FrameParser.DivNgForLabelContext ctx){
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
                    case FrameParser.CLASS:
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
                    case FrameParser.CLASS:
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
        ButtonAttribute attribute = new ButtonAttribute();
        attribute.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.TYPE:
                    case FrameParser.CLICK:
                    case FrameParser.STYLE:
                    case FrameParser.STAR_NG_IF:
                    case FrameParser.STAR_NG_FOR:
                    case FrameParser.NG_MODEL:
                    case FrameParser.NG_MODEL_TWO_WAY:
                        attribute.setAttributeType(terminal.getText());
                        break;

                    case FrameParser.STRING:
                        attribute.setAttributeValue(terminal.getText().replaceAll("^\"|\"$", ""));
                        break;

                    case FrameParser.DISABLED:
                        attribute.setAttributeType(terminal.getText());
                        attribute.setAttributeValue(null);
                        break;
                }
            }
        }

        return attribute;
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
                    case FrameParser.CLASS:
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
        LabelContent labelContent = new LabelContent();
        labelContent.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.STRING) {
                String rawText = terminal.getText().replaceAll("^\"|\"$", "");
                labelContent.setText(rawText);
            }
        }

        return labelContent;
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

        return rootNode;
    }

}

