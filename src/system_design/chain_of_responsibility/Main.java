package system_design.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor processor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        processor.log(LogProcessor.ERROR, "Exception happens");
        processor.log(LogProcessor.DEBUG, "We need to debug the issue..");
        processor.log(LogProcessor.INFO, "Just for info man...");
        processor.log(5, "Just for info man...");
    }
}
