package Main;

import Ast_Class.TS_Classes.RootProgram;
import Code_Generation.CodeGeneration;
import Parser.*;
import SymbolTable.Scope;
import SymbolTable.SymbolTable;

import SymbolTable.Symbol;

import Visitor.AngularVisitor;
import Visitor.BaseAstVisitor;
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
            ParseTree tree = parser.rootprogram();

            System.out.println();

            System.out.println("<<<<<<<<---------[ AST ]--------->>>>>>>>");
            AngularVisitor visitor = new AngularVisitor();
            RootProgram startProgram = (RootProgram) visitor.visit(tree);
            CodeGeneration codeGeneration = new CodeGeneration();
            codeGeneration.startGenerate(startProgram);
            startProgram.accept(new BaseAstVisitor());

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


        } catch (IOException e) {
            e.getMessage();
        }

    }
}
