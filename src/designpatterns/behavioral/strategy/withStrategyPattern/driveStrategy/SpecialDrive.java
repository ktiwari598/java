package designpatterns.behavioral.strategy.withStrategyPattern.driveStrategy;

public class SpecialDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }
}
