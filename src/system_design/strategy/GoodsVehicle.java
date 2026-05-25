package system_design.strategy;

import system_design.strategy.base.DriveStrategy;
import system_design.strategy.base.NormalDriveCapability;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new NormalDriveCapability());
    }
}
