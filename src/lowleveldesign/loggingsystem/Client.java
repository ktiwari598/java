package lowleveldesign.loggingsystem;

/**
 * This design follows Chain of Responsibility Design Pattern
 */
public class Client {
    public static void main(String[] args) {
        LoggingProcessor loggingProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        loggingProcessor.log(LoggingProcessor.INFO, "This is an info log");
        loggingProcessor.log(LoggingProcessor.DEBUG, "This is a debug log");
        loggingProcessor.log(LoggingProcessor.ERROR, "This is an error log");
    }
}
