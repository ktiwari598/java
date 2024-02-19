package designpatterns.behavioral.strategy.withStrategyPattern;

import designpatterns.behavioral.strategy.withStrategyPattern.driveStrategy.Drive;

public class Vehicle {
    public Drive drive;

    public Vehicle(Drive drive) {
        this.drive = drive;
    }

    public void drive() {
        this.drive.drive();
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }
}
