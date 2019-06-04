package homework_5;

import java.util.logging.*;

public class LoggerApp {
    public static void main(String[] args) {
        configureLogging();
    }

    private static void configureLogging() {
        Logger.getLogger("org.stepic.java.logging.ClassA").setLevel(Level.ALL);
        Logger.getLogger("org.stepic.java.logging.ClassB").setLevel(Level.WARNING);
        Logger logger = Logger.getLogger("org.stepic.java");

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new XMLFormatter());

        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false);
    }
}
