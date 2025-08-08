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

    public Node visitComponentBody(FrameParser.ComponentBodyContext ctx) {
        ComponentBody bodyNode = new ComponentBody();
        bodyNode.initializeNode(ctx, false, "");

        ArrayList<ComponentProperty> props = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ComponentPropertyContext) {
                ComponentProperty prop = (ComponentProperty) visit(child);
                props.add(prop);
            }
        }

        bodyNode.setProperties(props);

        return bodyNode;
    }

    @Override
    public Node visitComponentProperty(FrameParser.ComponentPropertyContext ctx) {
        ComponentProperty propNode = new ComponentProperty();
        propNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.SELECTOR:
                    case FrameParser.TEMPLATE:
                    case FrameParser.STYLEURLS:
                        propNode.setKey(terminal.getText());
                        break;

                    case FrameParser.STRING:
                        String value = terminal.getText().replaceAll("^\"|\"$", "");
                        propNode.setStringValue(value);
                        break;
                }

            } else if (child instanceof FrameParser.ArrayLiteralContext) {
                ArrayLiteral array = (ArrayLiteral) visit(child);
                propNode.setArrayLiteralValue(array);
            }
        }

        return propNode;
    }

    @Override
    public Node visitArrayLiteral(FrameParser.ArrayLiteralContext ctx) {
        ArrayLiteral arrayNode = new ArrayLiteral();
        arrayNode.initializeNode(ctx, false, "");

        ArrayList<ExpressionNode> elements = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ExpressionContext) {
                ExpressionNode expr = (ExpressionNode) visit(child);
                elements.add(expr);
            }
        }

        arrayNode.setElements(elements);

        return arrayNode;
    }

    public Node visitClassBlock(FrameParser.ClassBlockContext ctx) {
        ClassBlock blockNode = new ClassBlock();
        blockNode.initializeNode(ctx, false, "");

        ArrayList<ClassMemberNode> members = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ClassMemberContext) {
                ClassMemberNode member = (ClassMemberNode) visit(child);
                members.add(member);
            }
        }

        blockNode.setMembers(members);

        return blockNode;
    }

    @Override
    public Node visitClassVariableLabel(FrameParser.ClassVariableLabelContext ctx) {
        ClassVariableLabel varNode = new ClassVariableLabel();
        varNode.initializeNode(ctx, false, "");

        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.LET:
                    case FrameParser.CONST:
                    case FrameParser.VAR:
                        varNode.setDeclarationType(terminal.getText());
                        break;

                    case FrameParser.IDENTITY:
                        name = terminal.getText();
                        varNode.setName(name);
                        break;
                }

            } else if (child instanceof FrameParser.TypeContext) {
                Type type = (Type) visit(child);
                varNode.setType(type);

            } else if (child instanceof FrameParser.ExpressionContext) {
                ExpressionNode expr = (ExpressionNode) visit(child);
                varNode.setValueNode(expr);
            }
        }

        // ✅ تسجيل المتغير داخل Symbol Table إذا كان داخل classBlock
        if (name != null) {
            varNode.createSymbol(varNode.getScopeID(), name, "ClassVariable");
        }

        return varNode;
    }

    @Override
    public Node visitClassConstructorLabel(FrameParser.ClassConstructorLabelContext ctx) {
        ClassConstructorLabel ctorNode = new ClassConstructorLabel();
        ctorNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ParameterListContext) {
                ParameterList params = (ParameterList) visit(child);
                ctorNode.setParameterList(params);

            } else if (child instanceof FrameParser.BlockContext) {
                Block block = (Block) visit(child);
                ctorNode.setBlock(block);
            }
        }

        return ctorNode;
    }

    @Override
    public Node visitClassMethodLabel(FrameParser.ClassMethodLabelContext ctx) {
        ClassMethodLabel methodNode = new ClassMethodLabel();
        methodNode.initializeNode(ctx, false, "");

        ArrayList<MethodModifier> modifiers = new ArrayList<>();
        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            // معالجة الموديفايرز
            if (child instanceof FrameParser.MethodModifierContext) {
                MethodModifier mod = (MethodModifier) visit(child);
                modifiers.add(mod);

                // async
            } else if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.ASYNC) {
                methodNode.setAsync(true);

                // الاسم
            } else if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                name = terminal.getText();
                methodNode.setName(name);

                // البراميترز
            } else if (child instanceof FrameParser.ParameterListContext) {
                ParameterList params = (ParameterList) visit(child);
                methodNode.setParameterList(params);

                // نوع الإرجاع
            } else if (child instanceof FrameParser.TypeContext) {
                Type returnType = (Type) visit(child);
                methodNode.setReturnType(returnType);

                // الجسم
            } else if (child instanceof FrameParser.BlockContext) {
                Block body = (Block) visit(child);
                methodNode.setBody(body);
            }
        }

        methodNode.setModifiers(modifiers);

        if (name != null) {
            methodNode.createSymbol(methodNode.getScopeID(), name, "Method");
        }

        return methodNode;
    }

    @Override
    public Node visitMethodModifier(FrameParser.MethodModifierContext ctx) {
        MethodModifier node = new MethodModifier();
        node.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                node.setModifier(terminal.getText());
                break; // لأنه يوجد فقط عنصر واحد في القاعدة
            }
        }

        return node;
    }

    @Override
    public Node visitParameterList(FrameParser.ParameterListContext ctx) {
        ParameterList paramListNode = new ParameterList();
        paramListNode.initializeNode(ctx, false, "");

        ArrayList<Parameter> parameters = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ParameterContext) {
                Parameter param = (Parameter) visit(child);
                parameters.add(param);
            }
        }

        paramListNode.setParameters(parameters);

        return paramListNode;
    }

    @Override
    public Node visitParameter(FrameParser.ParameterContext ctx) {
        Parameter paramNode = new Parameter();
        paramNode.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.PUBLIC:
                    case FrameParser.PRIVATE:
                    case FrameParser.PROTECTED:
                        paramNode.setVisibility(terminal.getText());
                        break;

                    case FrameParser.IDENTITY:
                        paramNode.setName(terminal.getText());
                        break;
                }

            } else if (child instanceof FrameParser.TypeContext) {
                Type type = (Type) visit(child);
                paramNode.setType(type);
            }
        }

        return paramNode;
    }

    @Override
    public Node visitType(FrameParser.TypeContext ctx) {
        Type typeNode = new Type();
        typeNode.initializeNode(ctx, false, "");

        String baseType = "";
        boolean isArray = false;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                if (tokenType == FrameParser.PRIMITIVE_TYPE || tokenType == FrameParser.IDENTITY) {
                    baseType = terminal.getText();

                } else if (tokenType == FrameParser.LBRACK) {
                    isArray = true;
                }
            }
        }

        if (isArray) {
            baseType += "[]";
        }

        typeNode.setTypeName(baseType);

        return typeNode;
    }

    @Override
    public Node visitBlock(FrameParser.BlockContext ctx) {
        Block blockNode = new Block();

        blockNode.initializeNode(ctx, true, "Block");

        ArrayList<StatementNode> statements = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.StatementContext) {
                StatementNode stmt = (StatementNode) visit(child);
                statements.add(stmt);
            }
        }

        blockNode.setStatements(statements);


        Node.removeScope();
        return blockNode;
    }

    @Override
    public Node visitAssignmentStmtLabel(FrameParser.AssignmentStmtLabelContext ctx) {
        AssignmentStmtLabel stmt = new AssignmentStmtLabel();
        stmt.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            // التحقق من وجود "this"
            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                if (tokenType == FrameParser.THIS) {
                    stmt.setThis(true);

                } else if (tokenType == FrameParser.IDENTITY) {
                    stmt.setIdentifier(terminal.getText());
                }

            } else if (child instanceof FrameParser.ExpressionContext) {
                ExpressionNode expr = (ExpressionNode) visit(child);
                stmt.setValue(expr);
            }
        }

        return stmt;
    }

    @Override
    public Node visitFunctionCallStmtLabel(FrameParser.FunctionCallStmtLabelContext ctx) {
        FunctionCallStmtLabel stmt = new FunctionCallStmtLabel();
        stmt.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                if (tokenType == FrameParser.THIS) {
                    stmt.setThis(true);

                } else if (tokenType == FrameParser.IDENTITY) {
                    stmt.setFunctionName(terminal.getText());
                }

            } else if (child instanceof FrameParser.ArgumentListContext) {
                ArgumentList args = (ArgumentList) visit(child);
                stmt.setArguments(args);
            }
        }

        return stmt;
    }

    @Override
    public Node visitVarDeclarationStmtLabel(FrameParser.VarDeclarationStmtLabelContext ctx) {
        VarDeclarationStmtLabel stmt = new VarDeclarationStmtLabel();
        stmt.initializeNode(ctx, false, "");

        String name = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int tokenType = terminal.getSymbol().getType();

                switch (tokenType) {
                    case FrameParser.LET:
                    case FrameParser.CONST:
                    case FrameParser.VAR:
                        stmt.setModifier(terminal.getText());
                        break;

                    case FrameParser.IDENTITY:
                        name = terminal.getText();
                        stmt.setName(name);
                        break;
                }

            } else if (child instanceof FrameParser.TypeContext) {
                Type type = (Type) visit(child);
                stmt.setType(type);

            } else if (child instanceof FrameParser.ExpressionContext) {
                ExpressionNode expr = (ExpressionNode) visit(child);
                stmt.setExpression(expr);
            }
        }

        if (name != null) {
            stmt.createSymbol(stmt.getScopeID(), name, "Variable");
        }

        return stmt;
    }

    @Override
    public Node visitReturnStmtLabel(FrameParser.ReturnStmtLabelContext ctx) {
        ReturnStmtLabel stmt = new ReturnStmtLabel();
        stmt.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ExpressionContext) {
                ExpressionNode expr = (ExpressionNode) visit(child);
                stmt.setExpression(expr);
            }
        }

        return stmt;
    }

    @Override
    public Node visitDispatchStmtLabel(FrameParser.DispatchStmtLabelContext ctx) {
        DispatchStmtLabel stmt = new DispatchStmtLabel();
        stmt.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ActionCallContext) {
                ActionCall action = (ActionCall) visit(child);
                stmt.setAction(action);
            }
        }

        return stmt;
    }

    public Node visitActionCall(FrameParser.ActionCallContext ctx) {
        ActionCall node = new ActionCall();
        node.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                node.setActionName(terminal.getText());
            }
        }

        return node;
    }

    @Override
    public Node visitBinaryExpressionLabel(FrameParser.BinaryExpressionLabelContext ctx) {
        BinaryExpressionLabel exprNode = new BinaryExpressionLabel();
        exprNode.initializeNode(ctx, false, "");

        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));

        String operator = ctx.binaryOp().getText();

        exprNode.setLeft(left);
        exprNode.setRight(right);
        exprNode.setOperator(operator);

        return exprNode;
    }

    @Override
    public Node visitUnaryExpressionLabel(FrameParser.UnaryExpressionLabelContext ctx) {
        UnaryExpressionLabel exprNode = new UnaryExpressionLabel();
        exprNode.initializeNode(ctx, false, "");

        String operator = ctx.unaryOp().getText();
        ExpressionNode innerExpr = (ExpressionNode) visit(ctx.expression());

        exprNode.setOperator(operator);
        exprNode.setExpression(innerExpr);

        return exprNode;
    }

    @Override
    public Node visitLiteralExpressionLabel(FrameParser.LiteralExpressionLabelContext ctx) {
        LiteralExpressionLabel literal = new LiteralExpressionLabel();
        literal.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                String raw = terminal.getText();

                if (terminal.getSymbol().getType() == FrameParser.STRING) {
                    raw = raw.replaceAll("^\"|\"$", "");
                }
                literal.setValue(raw);
                break;
            }
        }

        return literal;
    }

    @Override
    public Node visitArrayAccessExpression(FrameParser.ArrayAccessExpressionContext ctx) {
        ArrayAccessExpressionLabel node = new ArrayAccessExpressionLabel();
        node.initializeNode(ctx, false, "");

        // استخرج التعبير الأساسي (array) من العنصر السابق في parent
        ParseTree parentExpr = ctx.getParent().getChild(0);
        ExpressionNode arrayExpr = (ExpressionNode) visit(parentExpr);

        // استخرج التعبير داخل الأقواس [ ... ]
        ExpressionNode indexExpr = (ExpressionNode) visit(ctx.expression());

        node.setArray(arrayExpr);
        node.setIndex(indexExpr);

        return node;
    }

    public Node visitIdentifierExpressionLabel(FrameParser.IdentifierExpressionLabelContext ctx) {
        IdentifierExpressionLabel node = new IdentifierExpressionLabel();
        node.initializeNode(ctx, false, "");

        node.setName(ctx.getText());

        return node;
    }

    public Node visitObjectLiteralExpressionLabel(FrameParser.ObjectLiteralExpressionLabelContext ctx) {
        ObjectLiteralExpressionLabel node = new ObjectLiteralExpressionLabel();
        node.initializeNode(ctx, false, "");

        ArrayList<ObjectProperty> props = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.ObjectPropertyContext) {
                ObjectProperty prop = (ObjectProperty) visit(child);
                props.add(prop);
            }
        }

        node.setProperties(props);

        return node;
    }

    public Node visitObjectProperty(FrameParser.ObjectPropertyContext ctx) {
        ObjectProperty node = new ObjectProperty();
        node.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                node.setKey(terminal.getText());

            } else if (child instanceof FrameParser.ExpressionContext) {
                ExpressionNode value = (ExpressionNode) visit(child);
                node.setValue(value);
            }
        }

        return node;
    }

    @Override
    public Node visitParenExpressionLabel(FrameParser.ParenExpressionLabelContext ctx) {
        ParenExpressionLabel node = new ParenExpressionLabel();
        node.initializeNode(ctx, false, "");

        ExpressionNode inner = (ExpressionNode) visit(ctx.expression());
        node.setInner(inner);

        return node;
    }

    @Override
    public Node visitSelectExpressionLabel(FrameParser.SelectExpressionLabelContext ctx) {
        SelectExpressionLabel node = new SelectExpressionLabel();
        node.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof FrameParser.SelectorCallContext) {
                SelectorCall selector = (SelectorCall) visit(child);
                node.setSelectorCall(selector);
            }
        }

        return node;
    }

    @Override
    public Node visitSelectorCall(FrameParser.SelectorCallContext ctx) {
        SelectorCall node = new SelectorCall();
        node.initializeNode(ctx, false, "");

        node.setSelectorName(ctx.getText());

        return node;
    }

    @Override
    public Node visitInjectableProperty(FrameParser.InjectablePropertyContext ctx) {
        InjectableProperty node = new InjectableProperty(null, null);
        node.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal) {
                int type = terminal.getSymbol().getType();

                switch (type) {
                    case FrameParser.PROVIDEDIN:
                        node.setKey("providedIn");
                        break;
                    case FrameParser.USECLASS:
                        node.setKey("useClass");
                        break;
                    case FrameParser.USEVALUE:
                        node.setKey("useValue");
                        break;
                    case FrameParser.STRING:
                        String rawString = terminal.getText().replaceAll("^\"|\"$", "");
                        node.setStringValue(rawString);
                        break;
                    case FrameParser.IDENTITY:
                        node.setStringValue(terminal.getText());
                        break;
                }

            } else if (child instanceof FrameParser.ExpressionContext) {
                ExpressionNode expr = (ExpressionNode) visit(child);
                node.setExpressionValue(expr);
            }
        }

        return node;
    }

    public Node visitInterfaceBody(FrameParser.InterfaceBodyContext ctx) {
        InterfaceBody node = new InterfaceBody();
        node.initializeNode(ctx, false, "");

        ArrayList<InterfaceProperty> props = new ArrayList<>();

        for (ParseTree child : ctx.children) {
            if (child instanceof FrameParser.InterfacePropertyContext) {
                InterfaceProperty prop = (InterfaceProperty) visit(child);
                props.add(prop);
            }
        }

        node.setProperties(props);

        return node;
    }

    @Override
    public Node visitInterfaceProperty(FrameParser.InterfacePropertyContext ctx) {
        InterfaceProperty node = new InterfaceProperty();
        node.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                node.setName(terminal.getText());

            } else if (child instanceof FrameParser.TypeContext) {
                Type type = (Type) visit(child);
                node.setType(type);
            }
        }

        return node;
    }

    @Override
    public Node visitEnumBody(FrameParser.EnumBodyContext ctx) {
        EnumBody node = new EnumBody();
        node.initializeNode(ctx, false, "");

        ArrayList<EnumMember> members = new ArrayList<>();

        for (ParseTree child : ctx.children) {
            if (child instanceof FrameParser.EnumMemberContext) {
                EnumMember member = (EnumMember) visit(child);
                members.add(member);
            }
        }

        node.setMembers(members);

        return node;
    }

    @Override
    public Node visitEnumMember(FrameParser.EnumMemberContext ctx) {
        EnumMember node = new EnumMember();
        node.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                node.setName(terminal.getText());

            } else if (child instanceof FrameParser.ExpressionContext) {
                ExpressionNode expr = (ExpressionNode) visit(child);
                node.setValue(expr);
            }
        }

        return node;
    }

    @Override
    public Node visitRouteConfig(FrameParser.RouteConfigContext ctx) {
        RouteConfig node = new RouteConfig();
        node.initializeNode(ctx, false, "");

        for (ParseTree child : ctx.children) {
            if (child instanceof FrameParser.PathPropertyContext) {
                PathProperty path = (PathProperty) visit(child);
                node.setPath(path);

            } else if (child instanceof FrameParser.RouteComponentPropertyContext) {
                RouteComponentProperty component = (RouteComponentProperty) visit(child);
                node.setComponent(component);
            }
        }

        return node;
    }

    @Override
    public Node visitPathProperty(FrameParser.PathPropertyContext ctx) {
        PathProperty node = new PathProperty();
        node.initializeNode(ctx, false, "");

        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.STRING) {

                String raw = terminal.getText().replaceAll("^\"|\"$", ""); // إزالة علامات التنصيص
                node.setValue(raw);
            }
        }

        return node;
    }

    @Override
    public Node visitRouteComponentProperty(FrameParser.RouteComponentPropertyContext ctx) {
        RouteComponentProperty node = new RouteComponentProperty();
        node.initializeNode(ctx, false, "");

        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode terminal &&
                    terminal.getSymbol().getType() == FrameParser.IDENTITY) {

                node.setComponentName(terminal.getText());
            }
        }

        return node;
    }

    @Override
    public Node visitActionType(FrameParser.ActionTypeContext ctx) {
        ActionType node = new ActionType();
        node.initializeNode(ctx, false, "");

        TerminalNode stringNode = ctx.STRING();
        if (stringNode != null) {
            String raw = stringNode.getText().replaceAll("^\"|\"$", ""); // إزالة علامات التنصيص
            node.setValue(raw);
        }

        return node;
    }

    @Override
    public Node visitReducerConfig(FrameParser.ReducerConfigContext ctx) {
        ReducerConfig node = new ReducerConfig();
        node.initializeNode(ctx, false, "");

        String initial = null;
        ArrayList<OnReducerBlock> reducers = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.IDENTITY) {

                initial = terminal.getText();

            } else if (child instanceof FrameParser.OnReducerBlockContext) {
                OnReducerBlock onBlock = (OnReducerBlock) visit(child);
                reducers.add(onBlock);
            }

        }

        node.setInitialState(initial);
        node.setReducers(reducers);

        return node;
    }

    @Override
    public Node visitOnReducerBlock(FrameParser.OnReducerBlockContext ctx) {
        OnReducerBlock node = new OnReducerBlock();
        node.initializeNode(ctx, false, "");

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);

            if (child instanceof TerminalNode terminal && terminal.getSymbol().getType() == FrameParser.IDENTITY) {
                // اسم الأكشن: on(<IDENTITY>, state => {...})
                node.setActionName(terminal.getText());

            } else if (child instanceof FrameParser.BlockContext) {
                Block block = (Block) visit(child);
                node.setBlock(block);
            }
        }

        return node;
    }
}

