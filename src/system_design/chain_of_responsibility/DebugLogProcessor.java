package system_design.chain_of_responsibility;

public class DebugLogProcessor extends LogProcessor{


    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }


    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("INFO: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
