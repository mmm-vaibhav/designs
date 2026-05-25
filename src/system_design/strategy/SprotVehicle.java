package system_design.strategy;

import system_design.strategy.Vehicle;
import system_design.strategy.base.DriveStrategy;
import system_design.strategy.base.SprortDriveCapability;

public class SprotVehicle extends Vehicle {


    public SprotVehicle() {
        super(new SprortDriveCapability());
    }
}
