package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class RouteConfig extends Node {

    private PathProperty path;
    private RouteComponentProperty component;

    public PathProperty getPath() {
        return path;
    }

    public RouteComponentProperty getComponent() {
        return component;
    }

    public void setPath(PathProperty path) {
        this.path = path;
    }

    public void setComponent(RouteComponentProperty component) {
        this.component = component;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        return "{ " + path.getValue() + ", " + component.getValue() + " }";
    }

}
