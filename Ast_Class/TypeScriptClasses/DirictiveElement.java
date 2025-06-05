package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class DirictiveElement extends Node {
    private Structural structural;
    private AttributeLable attribute;
    private Towway towway;

    @Override
    public void accept(AST_Visitor ast_Visitor) {
        ast_Visitor.visit(this);
    }

    @Override
    public String getValue() {
        if (attribute!=null)
            return attribute.getValue();
  return "";  }

    public Structural getStructural() {
        return structural;
    }

    public void setStructural(Structural structural) {
        this.structural = structural;
    }

    public AttributeLable getAttribute() {
        return attribute;
    }

    public void setAttribute(AttributeLable attribute) {
        this.attribute = attribute;
    }

    public Towway getTowway() {
        return towway;
    }

    public void setTowway(Towway towway) {
        this.towway = towway;
    }
}
