package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class TSServiceLabel extends Node implements TsSectionNode{
    private String serviceName;
    private InjectableBody injectableBody;
    private ClassBlock classBlock;

    public String getServiceName() {
        return serviceName;
    }

    public InjectableBody getInjectableBody() {
        return injectableBody;
    }

    public ClassBlock getClassBlock() {
        return classBlock;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setInjectableBody(InjectableBody injectableBody) {
        this.injectableBody = injectableBody;
    }

    public void setClassBlock(ClassBlock classBlock) {
        this.classBlock = classBlock;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("@Injectable({\n");
        for (InjectableProperty prop : injectableBody.getProperties()) {
            sb.append("  ").append(prop.getValue()).append(",\n");
        }
        sb.append("})\n");
        sb.append("export class ").append(serviceName).append(" ");
        sb.append(classBlock.getValue());
        return sb.toString();
    }
}
