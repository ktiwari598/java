package designpatterns.behavioral.strategy.withoutStrategyPattern;

/**
 * Here, we can see that drive method is exactly same for both SportsVehicle and OffRoadVehicle, so there
 * duplicacy of code.
 * Whenever duplicate code is there in two or more child classes at the same level,
 * then we can think of strategy design pattern
 */
public class Main {
    public static void main(String[] args) {
        SportsVehicle spv = new SportsVehicle();
        spv.drive();

        PassengerVehicle pv = new PassengerVehicle();
        pv.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
