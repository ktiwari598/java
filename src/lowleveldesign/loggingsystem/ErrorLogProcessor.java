package lowleveldesign.loggingsystem;

public class ErrorLogProcessor extends LoggingProcessor {
    public ErrorLogProcessor(LoggingProcessor loggingProcessor) {
        super(loggingProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == ERROR) {
            System.out.println("ERROR : " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
