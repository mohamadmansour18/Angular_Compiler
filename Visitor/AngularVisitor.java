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

    @Override
    public Node visitTSClassLabel(FrameParser.TSClassLabelContext ctx) {
        TSClassLabel classNode = new TSClassLabel();

        classNode.initializeNode(ctx, true, "Class");

        String className = null;
        String superClassName = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.IDENTITY) {

                if (className == null) {
                    className = terminal.getText();
                    classNode.setClassName(className);
                } else {
                    superClassName = terminal.getText();
                    classNode.setSuperClassName(superClassName);
                }

            } else if (child instanceof FrameParser.ClassBlockContext) {
                ClassBlock block = (ClassBlock) visit(child);
                classNode.setClassBlock(block);
            }
        }

        if (className != null) {
            classNode.createSymbol(classNode.getScopeID(), className, "Class");
        }

        Node.removeScope();
        return classNode;
    }

    @Override
    public Node visitTSFunctionLabel(FrameParser.TSFunctionLabelContext ctx) {
        TSFunctionLabel functionNode = new TSFunctionLabel();

        functionNode.initializeNode(ctx, true, "Function");

        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int type = terminal.getSymbol().getType();

                if (type == FrameParser.ASYNC) {
                    functionNode.setAsync(true);

                } else if (type == FrameParser.IDENTITY && name == null) {
                    name = terminal.getText();
                    functionNode.setName(name);
                }

            } else if (child instanceof FrameParser.ParameterListContext) {
                ParameterList params = (ParameterList) visit(child);
                functionNode.setParameterList(params);

            } else if (child instanceof FrameParser.TypeContext) {
                Type returnType = (Type) visit(child);
                functionNode.setReturnType(returnType);

            } else if (child instanceof FrameParser.BlockContext) {
                Block body = (Block) visit(child);
                functionNode.setBody(body);
            }
        }

        if (name != null) {
            functionNode.createSymbol(functionNode.getScopeID(), name, "Function");
        }

        Node.removeScope();
        return functionNode;
    }

    @Override
    public Node visitTSArrowFunctionLabel(FrameParser.TSArrowFunctionLabelContext ctx) {
        TSArrowFunctionLabel arrowNode = new TSArrowFunctionLabel();

        arrowNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ParameterListContext) {
                ParameterList params = (ParameterList) visit(child);
                arrowNode.setParameterList(params);

            } else if (child instanceof FrameParser.TypeContext) {
                Type returnType = (Type) visit(child);
                arrowNode.setReturnType(returnType);

            } else if (child instanceof FrameParser.BlockContext) {
                Block block = (Block) visit(child);
                arrowNode.setBodyBlock(block);

            } else if (child instanceof FrameParser.ExpressionContext) {
                ExpressionNode expr = (ExpressionNode) visit(child);
                arrowNode.setBodyExpression(expr);
            }
        }

        return arrowNode;
    }

    @Override
    public Node visitTSVariableLabel(FrameParser.TSVariableLabelContext ctx) {
        TSVariableLabel varNode = new TSVariableLabel();

        varNode.initializeNode(ctx, false, "");

        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                if (tokenType == FrameParser.LET || tokenType == FrameParser.CONST || tokenType == FrameParser.VAR) {
                    varNode.setKeyword(terminal.getText());

                } else if (tokenType == FrameParser.IDENTITY) {
                    name = terminal.getText();
                    varNode.setName(name);
                }

            } else if (child instanceof FrameParser.TypeContext) {
                Type type = (Type) visit(child);
                varNode.setType(type);

            } else if (child instanceof FrameParser.ExpressionContext) {
                ExpressionNode expr = (ExpressionNode) visit(child);
                varNode.setValue(expr);
            }
        }

        if (name != null) {
            varNode.createSymbol(varNode.getScopeID(), name, "Variable");
        }

        return varNode;
    }

    @Override
    public Node visitTSInterfaceLabel(FrameParser.TSInterfaceLabelContext ctx) {
        TSInterfaceLabel interfaceNode = new TSInterfaceLabel();

        interfaceNode.initializeNode(ctx, true, "Interface");

        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                name = terminal.getText();
                interfaceNode.setName(name);

            } else if (child instanceof FrameParser.InterfaceBodyContext) {
                InterfaceBody body = (InterfaceBody) visit(child);
                interfaceNode.setBody(body);
            }
        }

        if (name != null) {
            interfaceNode.createSymbol(interfaceNode.getScopeID(), name, "Interface");
        }

        Node.removeScope();
        return interfaceNode;
    }

    @Override
    public Node visitTSEnumLabel(FrameParser.TSEnumLabelContext ctx) {
        TSEnumLabel enumNode = new TSEnumLabel();

        enumNode.initializeNode(ctx, true, "Enum");

        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                name = terminal.getText();
                enumNode.setName(name);

            } else if (child instanceof FrameParser.EnumBodyContext) {
                EnumBody body = (EnumBody) visit(child);
                enumNode.setBody(body);
            }
        }

        if (name != null) {
            enumNode.createSymbol(enumNode.getScopeID(), name, "Enum");
        }

        Node.removeScope();
        return enumNode;
    }

    @Override
    public Node visitTSRoutingLabel(FrameParser.TSRoutingLabelContext ctx) {
        TSRoutingLabel routingNode = new TSRoutingLabel();

        routingNode.initializeNode(ctx, false, "");

        ArrayList<RouteConfig> configs = new ArrayList<>();
        String variableName = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                variableName = terminal.getText();
                routingNode.setVariableName(variableName);

            } else if (child instanceof FrameParser.RouteConfigContext) {
                RouteConfig config = (RouteConfig) visit(child);
                configs.add(config);
            }
        }

        routingNode.setRouteConfigs(configs);

        if (variableName != null) {
            routingNode.createSymbol(routingNode.getScopeID(), variableName, "Routes");
        }

        return routingNode;
    }

    @Override
    public Node visitTSActionLabel(FrameParser.TSActionLabelContext ctx) {
        TSActionLabel actionNode = new TSActionLabel();

        actionNode.initializeNode(ctx, false, "");

        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                name = terminal.getText();
                actionNode.setName(name);

            } else if (child instanceof FrameParser.ActionTypeContext) {
                ActionType actionType = (ActionType) visit(child);
                actionNode.setActionType(actionType);
            }
        }

        if (name != null) {
            actionNode.createSymbol(actionNode.getScopeID(), name, "Action");
        }

        return actionNode;
    }

    @Override
    public Node visitTSReducerLabel(FrameParser.TSReducerLabelContext ctx) {
        TSReducerLabel reducerNode = new TSReducerLabel();

        reducerNode.initializeNode(ctx, false, "");

        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                name = terminal.getText();
                reducerNode.setName(name);

            } else if (child instanceof FrameParser.ReducerConfigContext) {
                ReducerConfig config = (ReducerConfig) visit(child);
                reducerNode.setConfig(config);
            }
        }

        if (name != null) {
            reducerNode.createSymbol(reducerNode.getScopeID(), name, "Reducer");
        }

        return reducerNode;
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


}

