package designpatterns.strategy.withStrategyPattern;

import designpatterns.strategy.withStrategyPattern.driveStrategy.Drive;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(Drive drive) {
        super(drive);
    }
}
