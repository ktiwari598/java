package solidprinciples.liskovSubstitution.withLSV;

public class Car extends Vehicle {
    @Override
    public Integer numberOfWheels() {
        return 4;
    }

    public Boolean hasEngine() {
        return true;
    }
}
