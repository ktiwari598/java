package designpatterns.strategy.withStrategyPattern;

import designpatterns.strategy.withStrategyPattern.driveStrategy.Drive;
import designpatterns.strategy.withStrategyPattern.driveStrategy.NormalDrive;
import designpatterns.strategy.withStrategyPattern.driveStrategy.SpecialDrive;

/**
 * Just pass the type of drive you want for your vehicle
 */
public class Main {
    public static void main(String[] args) {
        Drive specialDrive = new SpecialDrive();
        SportsVehicle sportsVehicle = new SportsVehicle(specialDrive);
        sportsVehicle.drive();

        Drive normalDrive = new NormalDrive();
        PassengerVehicle passengerVehicle = new PassengerVehicle(normalDrive);
        passengerVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle(specialDrive);
        offRoadVehicle.drive();

    }
}
