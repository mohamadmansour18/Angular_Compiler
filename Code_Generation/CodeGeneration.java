package Code_Generation;

import Ast_Class.TS_Classes.RootProgram;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
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

        java.nio.file.Path htmlPath = java.nio.file.Paths.get("output", "welcomePage.html");
        RunHelpers.openInBrowser(htmlPath);
    }

    public static class RunHelpers {
        // تفتح ملف HTML في المتصفح الافتراضي
        public static void openInBrowser(Path htmlFile) {
            try {
                if (!Files.exists(htmlFile)) {
                    System.err.println("HTML file not found: " + htmlFile);
                    return;
                }

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().browse(htmlFile.toUri());
                    return;
                }

                String os = System.getProperty("os.name").toLowerCase();
                if (os.contains("win")) {
                    new ProcessBuilder("rundll32", "url.dll,FileProtocolHandler", htmlFile.toUri().toString()).start();
                } else if (os.contains("mac")) {
                    new ProcessBuilder("open", htmlFile.toString()).start();
                } else {
                    new ProcessBuilder("xdg-open", htmlFile.toString()).start();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Open this URL manually: " + htmlFile.toUri());
            }
        }
    }

}
