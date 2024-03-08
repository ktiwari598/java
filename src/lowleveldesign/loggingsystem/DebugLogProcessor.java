package lowleveldesign.loggingsystem;

public class DebugLogProcessor extends LoggingProcessor {
    public DebugLogProcessor(LoggingProcessor loggingProcessor) {
        super(loggingProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == DEBUG) {
            System.out.println("Debug: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
