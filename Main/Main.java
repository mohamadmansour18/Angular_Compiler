package Main;

import SymbolTable.Scope;
import SymbolTable.SymbolTable;
import Visitor.BaseAstVisitor;
import Visitor.TypeScriptVisitor;
import SymbolTable.Symbol;
import gen.FrameLexer;
import gen.FrameParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static SymbolTable symbolTable = new SymbolTable();

    public static void main(String[] args) {

        try {
            System.out.println();

            String source = "Test/FrameTest";
            CharStream cs = fromFileName(source);
            FrameLexer lexer = new FrameLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            FrameParser parser = new FrameParser(token);
            parser.removeErrorListeners();
            parser.addErrorListener(new Syntex_Error());
            ParseTree tree = parser.rootprogram();

            System.out.println();

            if(Syntex_Error.hasError){
                System.out.println("<<<<<<<<---------[ Type Script Ast ]--------->>>>>>>>");
                System.out.println("<<<<<<<<---------[ Type Script Ast ]--------->>>>>>>>");
                System.out.println("<<<<<<<<---------[ Type Script Ast ]--------->>>>>>>>");
                System.out.println("<<<<<<<<---------[ Type Script Ast ]--------->>>>>>>>");

            }
            else{
                System.out.println("<<<<<<<<---------[ Type Script Ast ]--------->>>>>>>>");
                System.out.println("<<<<<<<<---------[ Type Script Ast ]--------->>>>>>>>");
                TypeScriptVisitor visitor = new TypeScriptVisitor();
//                RootProgram startProgram = (RootProgram) visitor.visit(tree);
//                startProgram.accept(new BaseAstVisitor());

                System.out.println();
                System.out.println("<<<<<<<<---------[ Symbol Table ]--------->>>>>>>>");
                System.out.println("Number of Scopes in the program : " + Scope.getContID());
                for (int i = 0; i < symbolTable.getScopes().size(); i++) {
                    for (Symbol symbol : symbolTable.getScopes().get(i).getSymbolList()) {
                        symbol.print();
                        System.out.println();
                    }
                }
                System.out.println();
                if (visitor.errorCollector.hasErrors()) {
                    visitor.errorCollector.printErrors();
                    System.exit(1);
                }
            }





        } catch (IOException e) {
            e.getMessage();
        }

    }
}
