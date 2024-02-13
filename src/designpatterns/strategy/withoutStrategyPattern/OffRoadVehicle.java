package designpatterns.strategy.withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Special Drive capability");
    }
}
