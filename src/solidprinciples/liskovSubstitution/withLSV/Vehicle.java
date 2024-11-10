package solidprinciples.liskovSubstitution.withLSV;

/**
 * The fix is to add only generic methods in interface so that child class can completely substitute parent class object
 */

public class Vehicle {
    public Integer numberOfWheels() {
        return 2;
    }
}
