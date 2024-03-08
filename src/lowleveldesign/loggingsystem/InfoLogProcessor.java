package lowleveldesign.loggingsystem;

public class InfoLogProcessor extends LoggingProcessor {

    InfoLogProcessor(LoggingProcessor loggingProcessor) {
        super(loggingProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == INFO) {
            System.out.println("Info : " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }

}
