package designpatterns.behavioral.strategy.withStrategyPattern;

import designpatterns.behavioral.strategy.withStrategyPattern.driveStrategy.Drive;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(Drive drive) {
        super(drive);
    }
}
