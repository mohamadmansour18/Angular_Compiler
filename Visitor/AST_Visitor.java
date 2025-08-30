package Visitor;


import Ast_Class.HTML_Classes.*;
import Ast_Class.TS_Classes.*;

public interface AST_Visitor {
    void visit(HTMLDivLabel div);
    void visit(DivAttribute attribute);
    void visit(ImgAttribute attribute);
    void visit(DivImageLabel image);
    void visit(ButtonAttribute attribute);
    void visit(ButtonContent content);
    void visit(DivButtonLabel button);
    void visit(InputAttribute attribute);
    void visit(DivInputLabel input);
    void visit(ParagraphAttribute attribute);
    void visit(ParagraphTextLabel text);
    void visit(DivParagraphLabel paragraph);
    void visit(ParagraphImageLabel image);
    void visit(ParagraphButtonLabel button);
    void visit(ParagraphInputLabel input);
    void visit(DivNestedLabel nestedDiv);
    void visit(DivRouterOutletLabel outlet);
    void visit(DivNgIfLabel ngIf);
    void visit(DivNgForLabel ngFor);
    void visit(DivPlainTextLabel text);
    void visit(FormAttribute attribute);
    void visit(HTMLFormLabel form);
    void visit(FormInputLabel input);
    void visit(FormButtonLabel button);
    void visit(LabelAttribute attr);
    void visit(LabelContent content);
    void visit(FormLabel label);
    void visit(FormDivLabel formDiv);
    void visit(FormTextLabel text);
    void visit(HTMLParagraphLabel paragraph);
    void visit(HTMLButtonLabel button);
    void visit(HTMLInputLabel input);
    void visit(HTMLImageLabel image);
    void visit(HTMLLabel label);
    void visit(HTMLRouterOutletLabel routerOutlet);
    void visit(HTMLSpanLabel span);
    void visit(HTMLAnchorLabel anchor);
    void visit(SpanAttribute attr);
    void visit(SpanContent content);
    void visit(AnchorAttribute attr);
    void visit(AnchorContent content);
    void visit(DivSpanLabel node);
    void visit(DivAnchorLabel node);
    void visit(DivLabel node);
    //------------------{ TS Function }------------------//
    void visit(RootProgram root);
}
