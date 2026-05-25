package system_design.strategy;

import system_design.strategy.base.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
