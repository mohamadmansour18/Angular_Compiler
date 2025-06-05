package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class ServicesStatement extends Statment  {
private Services services;

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
        if (services!=null)
            services.accept(astVisitor);
    }


    public Services getServices() {
        return services;
    }


    public void setServices(Services services) {
        this.services = services;
    }
}

