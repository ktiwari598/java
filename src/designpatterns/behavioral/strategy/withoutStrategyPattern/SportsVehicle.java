package designpatterns.behavioral.strategy.withoutStrategyPattern;

public class SportsVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Special Drive capability");
    }
}
