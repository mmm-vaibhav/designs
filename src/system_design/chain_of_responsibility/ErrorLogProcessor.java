package system_design.chain_of_responsibility;

public class ErrorLogProcessor extends LogProcessor{


    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }


    @Override
    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("INFO: " + message);
        } else {
            super.log(logLevel, message);
        }
    }

}
