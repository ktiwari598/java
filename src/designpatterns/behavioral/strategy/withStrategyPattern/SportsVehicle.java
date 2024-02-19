package designpatterns.behavioral.strategy.withStrategyPattern;

import designpatterns.behavioral.strategy.withStrategyPattern.driveStrategy.Drive;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(Drive drive) {
        super(drive);
    }
}
