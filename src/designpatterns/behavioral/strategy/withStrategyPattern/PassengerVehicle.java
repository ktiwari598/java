package designpatterns.behavioral.strategy.withStrategyPattern;

import designpatterns.behavioral.strategy.withStrategyPattern.driveStrategy.Drive;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(Drive drive) {
        super(drive);
    }
}
