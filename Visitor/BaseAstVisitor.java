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

    @Override
    public void visit(HTMLLabel label) {
        System.out.println("========== [HTML LABEL NODE] ==========");
        for (LabelAttribute attr : label.getAttributes()) {
            attr.accept(this);
        }
        if (label.getContent() != null) {
            label.getContent().accept(this);
        }
        System.out.println("========================================");
    }

    @Override
    public void visit(HTMLRouterOutletLabel routerOutlet) {
        System.out.println("[HTML RouterOutlet Node]");
    }

    //------------------------------------{ TS Function }------------------------------------//

    @Override
    public void visit(ComponentProperty property) {
        System.out.println("→ [Component Property] " + property.getKey());

        if (property.getStringValue() != null) {
            System.out.println("    Value (string): \"" + property.getStringValue() + "\"");
        } else if (property.getArrayLiteralValue() != null) {
            System.out.println("    Value (array):");
            property.getArrayLiteralValue().accept(this);
        } else {
            System.out.println("    Value: null");
        }
    }

    @Override
    public void visit(ComponentBody body) {
        System.out.println("===== [Component Body] =====");
        for (ComponentProperty prop : body.getProperties()) {
            prop.accept(this);
        }
        System.out.println("============================");
    }

    @Override
    public void visit(TSComponentLabel component) {
        System.out.println("========== [TS COMPONENT NODE] ==========");
        System.out.println("Component Class Name: " + component.getName());
        component.getBody().accept(this);
        component.getClassBlock().accept(this);
        System.out.println("=========================================");
    }

    @Override
    public void visit(ClassBlock classBlock) {
        System.out.println("========== [CLASS BLOCK] ==========");
        for (ClassMemberNode member : classBlock.getMembers()) {
            member.accept(this);
        }
        System.out.println("===================================");
    }

    @Override
    public void visit(ClassVariableLabel variable) {
        System.out.println("→ [CLASS VARIABLE]");
        System.out.println("  Declaration: " + variable.getDeclarationType());
        System.out.println("  Name: " + variable.getName());
        variable.getType().accept(this);
        if (variable.getValueNode() != null) {
            variable.getValueNode().accept(this);
        }
    }

    @Override
    public void visit(Type type) {
        System.out.println("  → Type: " + type.getTypeName());
    }

    @Override
    public void visit(LiteralExpressionLabel literal) {
        System.out.println("→ Literal: " + literal.getValue());
    }

    @Override
    public void visit(IdentifierExpressionLabel identifier) {
        System.out.println("→ Identifier: " + identifier.getName());
    }

    @Override
    public void visit(BinaryExpressionLabel binary) {
        System.out.println("→ Binary Expression:");
        System.out.println("  Operator: " + binary.getOperator());
        binary.getLeft().accept(this);
        binary.getRight().accept(this);
    }

    @Override
    public void visit(UnaryExpressionLabel unary) {
        System.out.println("→ Unary Expression:");
        System.out.println("  Operator: " + unary.getOperator());
        unary.getExpression().accept(this);
    }

    @Override
    public void visit(ParenExpressionLabel paren) {
        System.out.println("→ Parenthesized Expression:");
        paren.getInner().accept(this);
    }

    @Override
    public void visit(ArrayAccessExpressionLabel access) {
        System.out.println("→ Array Access:");
        System.out.println("  Array:");
        access.getArray().accept(this);
        System.out.println("  Index:");
        access.getIndex().accept(this);
    }

    @Override
    public void visit(ObjectLiteralExpressionLabel objectLiteral) {
        System.out.println("→ Object Literal:");
        for (ObjectProperty prop : objectLiteral.getProperties()) {
            prop.accept(this);
        }
    }

    @Override
    public void visit(ObjectProperty property) {
        System.out.println("  - Property: " + property.getKey());
        property.getValueExpression().accept(this);
    }

    @Override
    public void visit(SelectorCall selectorCall) {
        System.out.println("→ Selector Call: " + selectorCall.getSelectorName());
    }

    @Override
    public void visit(SelectExpressionLabel select) {
        System.out.println("→ Select Expression:");
        select.getSelectorCall().accept(this);
    }

    @Override
    public void visit(ClassConstructorLabel constructor) {
        System.out.println("→ Constructor:");
        constructor.getBlock().accept(this);
        constructor.getParameterList().accept(this);
    }

    @Override
    public void visit(Block block) {
        System.out.println("→ Block:");
        for (StatementNode stmt : block.getStatements()) {
            stmt.accept(this);
        }
    }

    @Override
    public void visit(Parameter parameter) {
        System.out.println("→ Parameter: " + parameter.getValue());
    }

    @Override
    public void visit(ParameterList paramList) {
        System.out.println("→ Parameter List:");
        for (Parameter param : paramList.getParameters()) {
            param.accept(this);
        }
    }

    @Override
    public void visit(AssignmentStmtLabel stmt) {
        System.out.println("→ Assignment Statement:");
        System.out.println("  Target: " + (stmt.isThis() ? "this." : "") + stmt.getIdentifier());
        System.out.println("  Value:");
        stmt.getValueExpression().accept(this);
    }

    @Override
    public void visit(FunctionCallStmtLabel stmt) {
        System.out.println("→ Function Call:");
        System.out.println("  Function: " + (stmt.isThis() ? "this." : "") + stmt.getFunctionName());
        if (stmt.getArguments() != null) {
            stmt.getArguments().accept(this);
        } else {
            System.out.println("  Arguments: (none)");
        }
    }

    @Override
    public void visit(ArgumentList args) {
        System.out.println("  Arguments:");
        for (ExpressionNode arg : args.getArguments()) {
            arg.accept(this);
        }
    }

    @Override
    public void visit(VarDeclarationStmtLabel stmt) {
        System.out.println("→ Variable Declaration:");
        System.out.println("  " + stmt.getModifier() + " " + stmt.getName() + ": " + stmt.getType().getValue());
        if (stmt.getExpression() != null) {
            System.out.println("  Initial Value:");
            stmt.getExpression().accept(this);
        }
    }

    @Override
    public void visit(ReturnStmtLabel stmt) {
        System.out.println("→ Return Statement:");
        if (stmt.getExpression() != null) {
            stmt.getExpression().accept(this);
        } else {
            System.out.println("  (no return value)");
        }
    }

    @Override
    public void visit(DispatchStmtLabel stmt) {
        System.out.println("→ Store Dispatch Statement:");
        stmt.getAction().accept(this);
    }

    @Override
    public void visit(ActionCall action) {
        System.out.println("  Dispatching Action: " + action.getActionName());
    }

    @Override
    public void visit(MethodModifier modifier) {
        System.out.println("  Modifier: " + modifier.getModifier());
    }

    @Override
    public void visit(ClassMethodLabel method) {
        System.out.println("→ Method Declaration:");
        System.out.println("  Name: " + method.getName());
        System.out.println("  Modifiers:");
        for (MethodModifier mod : method.getModifiers()) {
            mod.accept(this);
        }
        System.out.println("  Async: " + method.isAsync());
        System.out.println("  Return Type: " + method.getReturnType().getValue());

        if (method.getParameterList() != null) {
            System.out.println("  Parameters:");
            method.getParameterList().accept(this);
        }

        System.out.println("  Body:");
        method.getBody().accept(this);
    }

    @Override
    public void visit(ArrayLiteral array) {
        System.out.println("→ Array Literal:");
        for (ExpressionNode element : array.getElements()) {
            element.accept(this);
        }
    }

    @Override
    public void visit(InjectableProperty prop) {
        if (prop.getExpressionValue() != null) {
            System.out.println("  " + prop.getKey() + ":");
            prop.getExpressionValue().accept(this);
        } else {
            System.out.println("  " + prop.getKey() + ": \"" + prop.getStringValue() + "\"");
        }
    }

    @Override
    public void visit(TSServiceLabel service) {
        System.out.println("→ Service: " + service.getServiceName());
        service.getInjectableBody().accept(this);
        service.getClassBlock().accept(this);
    }

    @Override
    public void visit(InjectableBody body) {
        for (InjectableProperty prop : body.getProperties()) {
            prop.accept(this);
        }
    }

    @Override
    public void visit(TSClassLabel classNode) {
        System.out.println("→ Class: " + classNode.getClassName());
        if (classNode.getSuperClassName() != null) {
            System.out.println("  Extends: " + classNode.getSuperClassName());
        }
        classNode.getClassBlock().accept(this);
    }

    @Override
    public void visit(TSFunctionLabel func) {
        System.out.println("→ Function: " + func.getName());
        if (func.isAsync()) System.out.println("  Async: true");
        if (func.getParameterList() != null) func.getParameterList().accept(this);
        System.out.println("  Return Type: " + func.getReturnType().getValue());
        func.getBody().accept(this);
    }

    @Override
    public void visit(TSArrowFunctionLabel arrow) {
        System.out.println("→ Arrow Function:");
        if (arrow.getParameterList() != null) arrow.getParameterList().accept(this);
        if (arrow.getReturnType() != null)
            System.out.println("  Return Type: " + arrow.getReturnType().getValue());
        if (arrow.getBodyBlock() != null)
            arrow.getBodyBlock().accept(this);
        else if (arrow.getBodyExpression() != null)
            arrow.getBodyExpression().accept(this);
    }

    @Override
    public void visit(TSVariableLabel variable) {
        System.out.println("→ Variable Declaration: " + variable.getName());
        System.out.println("  Type: " + variable.getType().getValue());
        if (variable.getValueExpression() != null)
            variable.getValueExpression().accept(this);
    }

    @Override
    public void visit(TSInterfaceLabel inter) {
        System.out.println("→ Interface: " + inter.getName());
        inter.getBody().accept(this);
    }

    @Override
    public void visit(InterfaceBody body) {
        for (InterfaceProperty prop : body.getProperties()) {
            prop.accept(this);
        }
    }

    @Override
    public void visit(InterfaceProperty prop) {
        System.out.println("  Property: " + prop.getName() + " : " + prop.getType().getValue());
    }

    @Override
    public void visit(TSEnumLabel node) {
        System.out.println("→ Enum: " + node.getName());
        node.getBody().accept(this);
    }

    @Override
    public void visit(EnumBody body) {
        for (EnumMember member : body.getMembers()) {
            member.accept(this);
        }
    }

    @Override
    public void visit(EnumMember member) {
        System.out.print("  Member: " + member.getName());
        if (member.getValueExpression() != null) {
            System.out.print(" = ");
            member.getValueExpression().accept(this);
        } else {
            System.out.println();
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
