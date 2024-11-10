package solidprinciples.liskovSubstitution.withoutLSP;

public class Vehicle {
    public Integer numberOfWheels() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}
