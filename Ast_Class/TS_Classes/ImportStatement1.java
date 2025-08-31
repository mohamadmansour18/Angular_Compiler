package Ast_Class.TS_Classes;

import Ast_Class.Node.Node;
import Code_Generation.GenContext;
import Visitor.AST_Visitor;

public class ImportStatement1 extends Node implements Stetment {
    private String importedName;   // الاسم داخل الأقواس { name }
    private String moduleLiteral;  // النص بين علامات التنصيص: "module/path"

    public String getImportedName() {
        return importedName;
    }

    public void setImportedName(String importedName) {
        this.importedName = importedName;
    }

    public String getModuleLiteral() {
        return moduleLiteral;
    }

    public void setModuleLiteral(String moduleLiteral) {
        this.moduleLiteral = moduleLiteral;
    }

    @Override
    public void accept(AST_Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        sb.append("import { ");
        if (importedName != null) {
            sb.append(importedName);
        }
        sb.append(" } from ");
        if (moduleLiteral != null) {
            sb.append(moduleLiteral);
        }
        return sb.toString();
    }

    @Override
    public String generate(GenContext ctx) {

        //   - from '@angular/core'      → signal / computed / (Component decorator يُعالَج في عقدة أخرى)
        //   - from '@angular/common'    → NgFor / NgIf
        //   - from '@angular/router'    → Router, RouterLink, RouterOutlet, Routes, ActivatedRoute, provideRouter
        //   - from '@angular/forms'     → FormsModule (ngModel)
        //   - from '@angular/platform-browser' → bootstrapApplication (الاستدعاء يُترجم لاحقًا؛ هنا لا حاجة لPrelude)

        if (moduleLiteral == null) return "";

        // أزل علامات التنصيص من الـ literal إن وجدت
        String mod = moduleLiteral.trim();
        if ((mod.startsWith("\"") && mod.endsWith("\"")) || (mod.startsWith("'") && mod.endsWith("'"))) {
            mod = mod.substring(1, mod.length() - 1);
        }

        String name = (importedName != null) ? importedName : "";

        switch (mod) {
            case "@angular/core":
                // import { signal } from '@angular/core'
                if ("signal".equals(name)) {
                    ctx.requireSignal();
                }
                // import { computed } from '@angular/core'
                else if ("computed".equals(name)) {
                    ctx.requireComputed();
                }
                // import { Component } from '@angular/core'
                break;

            case "@angular/common":
                // import { NgFor } from '@angular/common'
                if ("NgFor".equals(name)) {
                    ctx.requireRenderList();
                }
                // import { NgIf } منطق *ngIf
                else if ("NgIf".equals(name)) {
                    ctx.requireRenderIf();
                }
                break;

            case "@angular/router":
                // import { RouterLink } from '@angular/router'
                if ("RouterLink".equals(name)) {
                    ctx.requireRouterLink();
                }
                // import { RouterOutlet | Routes | ActivatedRoute | Router | provideRouter } ...
                else if ("RouterOutlet".equals(name)
                        || "Routes".equals(name)
                        || "ActivatedRoute".equals(name)
                        || "Router".equals(name)
                        || "provideRouter".equals(name)) {
                    ctx.requireRouter();
                }
                break;

            case "@angular/forms":
                // import { FormsModule } from '@angular/forms'
                if ("FormsModule".equals(name)) {
                    ctx.requireNgModel();
                }
                break;

            case "@angular/platform-browser":
                // import { bootstrapApplication } ...
                break;

            default:
                break;
        }

        return "";
    }
}
