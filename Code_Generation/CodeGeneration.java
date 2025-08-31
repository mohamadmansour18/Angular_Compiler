package Code_Generation;

import Ast_Class.TS_Classes.RootProgram;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CodeGeneration {

    private static int pageNumber = 1;
    public static Page currentPage;
    private ArrayList<Page> pages = new ArrayList<>();
    private static Class currentClass;


    public void createHTMLPage(String name) {
        Page page = new Page(name + ".html");
        currentPage = page;
        pages.add(page);
        pageNumber++;
    }

    public void createJSPage(String name) {
        Page page = new Page(name + ".js");
        currentPage = page;
        pages.add(page);
    }

    public void startGenerate(RootProgram program) {
        // 1) أنشئ صفحة JS
        this.createJSPage("global");

        // 2) أنشئ سياق التوليد
        GenContext ctx = new GenContext();

        // 3) اطلب من الجذر توليد الكود كاملاً (prelude + body)
        String fullJs = program.generate(ctx);

        // 4) اكتب ملف JS
        currentPage.writeOnFile(fullJs);
        currentPage.closeFile();

        // 5) أنشئ صفحة HTML
        this.createHTMLPage("welcomePage");
        String htmlCode =
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "  <meta charset=\"UTF-8\">\n" +
                        "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                        "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "  <title>Welcome Page</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "  <div id=\"app\"></div>\n" +
                        "  <script src=\"global.js\"></script>\n" +
                        "</body>\n" +
                        "</html>";

        currentPage.writeOnFile(htmlCode);
        currentPage.closeFile();
    }


}
