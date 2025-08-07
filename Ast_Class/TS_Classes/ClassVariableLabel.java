package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ClassVariableLabel extends Node implements ClassMemberNode {

    private String declarationType; // let / const / var
    private String name;            // اسم المتغير
    private Type type;          // نوع البيانات
    private ExpressionNode value;   // القيمة الابتدائية (اختيارية)

    public String getDeclarationType() {
        return declarationType;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public ExpressionNode getValueNode() {
        return value;
    }

    public void setDeclarationType(String declarationType) {
        this.declarationType = declarationType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setValueNode(ExpressionNode value) {
        this.value = value;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append(declarationType).append(" ").append(name).append(": ").append(type.getValue());
        if (value != null) {
            sb.append(" = ").append(value.getValue());
        }
        sb.append(";");
        return sb.toString();
    }
}
