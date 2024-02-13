package designpatterns.strategy.withStrategyPattern.driveStrategy;

public class NormalDrive implements Drive {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
