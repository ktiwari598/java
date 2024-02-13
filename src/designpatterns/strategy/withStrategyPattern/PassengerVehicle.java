package designpatterns.strategy.withStrategyPattern;

import designpatterns.strategy.withStrategyPattern.driveStrategy.Drive;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(Drive drive) {
        super(drive);
    }
}
