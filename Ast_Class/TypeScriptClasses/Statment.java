package Ast_Class.TypeScriptClasses;

import Ast_Class.Node.Node;
import Visitor.AST_Visitor;

public class Statment extends Node {
    private ServicesStatement services;
    private ComponentStatement component;
    private PrintStatement print;
    private VarDeclareStatement varDeclare;
    private FunctionStatement function;
    private CallFunctionStatement cullFunction;
    private AccessStatement access;
    private TypeDeclareStatement typeDeclare;
    private EnumStatement anEnum;
    private InterfaceStatement anInterface;
    private ClassStatement aClass;
    private OperationsStatement operations;
    private ImportStatement importRule;
    private PrefixStatement prefix;
    private TemplateStatement templet;
    private IfStatement ifStatment;
    private LoopStatement loopStatments;

    public ServicesStatement getServicesStatement() {
        return services;
    }

    public void setServicesStatement(ServicesStatement services) {
        this.services = services;
    }

    public ComponentStatement getComponentStatement() {
        return component;
    }

    public void setComponentStatement(ComponentStatement component) {
        this.component = component;
    }

    public PrintStatement getPrintStatement() {
        return print;
    }

    public void setPrintStatement(PrintStatement print) {
        this.print = print;
    }

    public VarDeclareStatement getVarDeclareStatement() {
        return varDeclare;
    }

    public void setVarDeclareStatement(VarDeclareStatement varDeclare) {
        this.varDeclare = varDeclare;
    }

    public FunctionStatement getFunctionStatement() {
        return function;
    }

    public void setFunctionStatement(FunctionStatement function) {
        this.function = function;
    }

    public CallFunctionStatement getCallFunctionStatement() {
        return cullFunction;
    }

    public void setCallFunctionStatement(CallFunctionStatement cullFunction) {
        this.cullFunction = cullFunction;
    }

    public AccessStatement getAccessStatement() {
        return access;
    }

    public void setAccessStatement(AccessStatement access) {
        this.access = access;
    }

    public TypeDeclareStatement getTypeDeclareStatement() {
        return typeDeclare;
    }

    public void setTypeDeclareStatement(TypeDeclareStatement typeDeclare) {
        this.typeDeclare = typeDeclare;
    }

    public EnumStatement getEnumStatement() {
        return anEnum;
    }

    public void setEnumStatement(EnumStatement anEnum) {
        this.anEnum = anEnum;
    }

    public InterfaceStatement getInterfaceStatement() {
        return anInterface;
    }

    public void setInterfaceStatement(InterfaceStatement anInterface) {
        this.anInterface = anInterface;
    }

    public ClassStatement getClassStatement() {
        return aClass;
    }

    public void setClassStatement(ClassStatement aClass) {
        this.aClass = aClass;
    }

    public OperationsStatement getOperationsStatement() {
        return operations;
    }

    public void setOperationsStatement(OperationsStatement operations) {
        this.operations = operations;
    }

    public ImportStatement getImportStatement() {
        return importRule;
    }

    public void setImportStatement(ImportStatement importRule) {
        this.importRule = importRule;
    }

    public PrefixStatement getPrefixStatement() {
        return prefix;
    }

    public void setPrefixStatement(PrefixStatement prefix) {
        this.prefix = prefix;
    }

    public TemplateStatement getTemplateStatement() {
        return templet;
    }

    public void setTemplateStatement(TemplateStatement templet) {
        this.templet = templet;
    }

    public IfStatement getIfStatement() {
        return ifStatment;
    }

    public void setIfStatement(IfStatement ifStatment) {
        this.ifStatment = ifStatment;
    }

    public LoopStatement getLoopStatement() {
        return loopStatments;
    }

    public void setLoopStatement(LoopStatement loopStatments) {
        this.loopStatments = loopStatments;
    }

    @Override
    public void accept(AST_Visitor astVisitor) {
        astVisitor.visit(this);
    }
}
