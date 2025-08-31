package Ast_Class.TS_Classes;

import Ast_Class.HTML_Classes.HtmlSectionNode;
import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

import java.util.ArrayList;

public class PrimaryNode extends Node {
    // بدائل معقّدة (كقواعد)
    private Node arrowFunction;              // arrowFunction
    private Node arrayLiteral;               // arrayLiteral
    private Node objectLiteral;              // objectLiteral
    private Node signalGenericCallPrimary;   // signalGenericCallPrimary
    private Node importCallPrimary;          // importCallPrimary
    private Node parenthesized;              // ( expr )

    // بدائل نصّية/توكنات خام (نحتفظ بالنص كما جاء)
    private String numberLiteral;    // NUMBER
    private String routesId;         // ROUTES_ID
    private String stringLiteral;    // STRING (بما في ذلك علامات التنصيص)
    private String booleanLiteral;   // BOOLEAN
    private boolean isNull;          // NULL
    private String signalKw;         // SIGNAL_KW كتوكن مستقل
    private String identifier;       // IDENTIFIER
    private String importKw;         // IMPORT_KW

    // قالب Angular داخل backticks: ` ... htmlSection* ... `
    private ArrayList<HtmlSectionNode> angularSections = new java.util.ArrayList<>();

    // getters / setters
    public Node getArrowFunction() { return arrowFunction; }
    public void setArrowFunction(Node arrowFunction) { this.arrowFunction = arrowFunction; }

    public Node getArrayLiteral() { return arrayLiteral; }
    public void setArrayLiteral(Node arrayLiteral) { this.arrayLiteral = arrayLiteral; }

    public Node getObjectLiteral() { return objectLiteral; }
    public void setObjectLiteral(Node objectLiteral) { this.objectLiteral = objectLiteral; }

    public Node getSignalGenericCallPrimary() { return signalGenericCallPrimary; }
    public void setSignalGenericCallPrimary(Node signalGenericCallPrimary) { this.signalGenericCallPrimary = signalGenericCallPrimary; }

    public Node getImportCallPrimary() { return importCallPrimary; }
    public void setImportCallPrimary(Node importCallPrimary) { this.importCallPrimary = importCallPrimary; }

    public Node getParenthesized() { return parenthesized; }
    public void setParenthesized(Node parenthesized) { this.parenthesized = parenthesized; }

    public String getNumberLiteral() { return numberLiteral; }
    public void setNumberLiteral(String numberLiteral) { this.numberLiteral = numberLiteral; }

    public String getRoutesId() { return routesId; }
    public void setRoutesId(String routesId) { this.routesId = routesId; }

    public String getStringLiteral() { return stringLiteral; }
    public void setStringLiteral(String stringLiteral) { this.stringLiteral = stringLiteral; }

    public String getBooleanLiteral() { return booleanLiteral; }
    public void setBooleanLiteral(String booleanLiteral) { this.booleanLiteral = booleanLiteral; }

    public boolean isNull() { return isNull; }
    public void setNull(boolean aNull) { isNull = aNull; }

    public String getSignalKw() { return signalKw; }
    public void setSignalKw(String signalKw) { this.signalKw = signalKw; }

    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }

    public String getImportKw() { return importKw; }
    public void setImportKw(String importKw) { this.importKw = importKw; }

    public java.util.ArrayList<HtmlSectionNode> getAngularSections() { return angularSections; }
    public void setAngularSections(java.util.ArrayList<HtmlSectionNode> angularSections) { this.angularSections = angularSections; }

    @Override
    public void accept(AST_Visitor visitor) { visitor.visit(this); }

    @Override
    public String getValue() {
        if (arrowFunction != null)           return arrowFunction.getValue();
        if (numberLiteral != null)           return numberLiteral;
        if (routesId != null)                return routesId;
        if (stringLiteral != null)           return stringLiteral;      // تبقى بعلامات التنصيص
        if (booleanLiteral != null)          return booleanLiteral;
        if (isNull)                          return "null";
        if (!angularSections.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("`");
            for (int i = 0; i < angularSections.size(); i++) {
                if (i > 0) sb.append("\n");
                sb.append(angularSections.get(i).getValue());
            }
            sb.append("`");
            return sb.toString();
        }
        if (arrayLiteral != null)            return arrayLiteral.getValue();
        if (objectLiteral != null)           return objectLiteral.getValue();
        if (signalGenericCallPrimary != null)return signalGenericCallPrimary.getValue();
        if (importCallPrimary != null)       return importCallPrimary.getValue();
        if (signalKw != null)                return signalKw;
        if (identifier != null)              return identifier;
        if (importKw != null)                return importKw;
        if (parenthesized != null)           return "(" + parenthesized.getValue() + ")";
        return "";
    }
}
