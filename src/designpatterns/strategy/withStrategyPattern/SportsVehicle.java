package designpatterns.strategy.withStrategyPattern;

import designpatterns.strategy.withStrategyPattern.driveStrategy.Drive;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(Drive drive) {
        super(drive);
    }
}
