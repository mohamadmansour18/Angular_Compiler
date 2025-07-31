package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class TSRoutingLabel extends Node implements TsSectionNode {

    private String variableName; // اسم المتغير الذي يحتوي على routes
    private ArrayList<RouteConfig> routeConfigs;

    public String getVariableName() {
        return variableName;
    }

    public ArrayList<RouteConfig> getRouteConfigs() {
        return routeConfigs;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public void setRouteConfigs(ArrayList<RouteConfig> routeConfigs) {
        this.routeConfigs = routeConfigs;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("const ").append(variableName).append(": Routes = [\n");
        for (int i = 0; i < routeConfigs.size(); i++) {
            sb.append("  ").append(routeConfigs.get(i).getValue());
            if (i < routeConfigs.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("];");
        return sb.toString();
    }

}
