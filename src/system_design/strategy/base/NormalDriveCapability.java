package system_design.strategy.base;

public class NormalDriveCapability implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal diving capability..");
    }
}
