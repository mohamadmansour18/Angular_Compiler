    package Ast_Class.TypeScriptClasses;

    import Ast_Class.Node.Node;
    import Visitor.AST_Visitor;

    import java.util.ArrayList;

    public class ClassStatement extends Node implements Stetment {
        private String className;
        private ArrayList<ClassBody> classBodies = new ArrayList<>();
        private String Implements ;
        private String interfaceName ;

        public String getInterfaceName() {
            return interfaceName;
        }

        public void setInterfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
        }


        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String getImplements() {
            return Implements;
        }

        public void setImplements(String anImplements) {
            Implements = anImplements;
        }

        public String getName() {
            return className;
        }

        public void setName(String name) {
            this.className = name;
        }

        public ArrayList<ClassBody> getClassBodies() {
            return classBodies;
        }

        public void setClassBodies(ArrayList<ClassBody> classBodies) {
            this.classBodies = classBodies;
        }

        @Override
        public void accept(AST_Visitor astVisitor) {
            astVisitor.visit(this);
        }
}
