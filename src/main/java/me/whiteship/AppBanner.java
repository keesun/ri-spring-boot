package me.whiteship;

import org.springframework.boot.Banner;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

import static org.springframework.boot.ansi.AnsiElement.DEFAULT;
import static org.springframework.boot.ansi.AnsiElement.FAINT;
import static org.springframework.boot.ansi.AnsiElement.GREEN;

/**
 * @author Keeun Baik
 */
public class AppBanner implements Banner {

    private static final String BANNER =
            ".d8888. d8888b. d8888b. d888888b d8b   db  d888b    d8888b.  .d88b.   .d88b.  d888888b   d8888b. d888888b\n" +
            "88'  YP 88  `8D 88  `8D   `88'   888o  88 88' Y8b   88  `8D .8P  Y8. .8P  Y8. `~~88~~'   88  `8D   `88'  \n" +
            "`8bo.   88oodD' 88oobY'    88    88V8o 88 88        88oooY' 88    88 88    88    88      88oobY'    88   \n" +
            "  `Y8b. 88~~~   88`8b      88    88 V8o88 88  ooo   88~~~b. 88    88 88    88    88      88`8b      88   \n" +
            "db   8D 88      88 `88.   .88.   88  V888 88. ~8~   88   8D `8b  d8' `8b  d8'    88      88 `88.   .88.  \n" +
            "`8888Y' 88      88   YD Y888888P VP   V8P  Y888P    Y8888P'  `Y88P'   `Y88P'     YP      88   YD Y888888P\n";

    private static final int STRAP_LINE_SIZE = 105;

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream printStream) {
        printStream.print(BANNER);
        String appVersion = environment.getProperty("project.version");

        String springBootVersion = Banner.class.getPackage().getImplementationVersion();
        springBootVersion = (springBootVersion == null ? "" : "Spring Boot (v" + springBootVersion + ")");
        int appVersionLength = appVersion == null ? 0 : appVersion.length();
        String padding = "";
        while (padding.length() < STRAP_LINE_SIZE
                - (springBootVersion.length() + appVersionLength)) {
            padding += " ";
        }

        printStream.println(AnsiOutput.toString(GREEN, appVersion, DEFAULT, padding,
                FAINT, springBootVersion));

        printStream.println();
    }
}
