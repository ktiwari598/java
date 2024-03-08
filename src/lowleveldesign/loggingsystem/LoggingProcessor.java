package lowleveldesign.loggingsystem;

public abstract class LoggingProcessor {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LoggingProcessor loggingProcessor;

    public LoggingProcessor(LoggingProcessor loggingProcessor) {
        this.loggingProcessor = loggingProcessor;
    }

    public void log(int logLevel, String message) {
        if(loggingProcessor != null) {
            loggingProcessor.log(logLevel, message);
        }
    }
}
