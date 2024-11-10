package solidprinciples.liskovSubstitution.withoutLSP;

public class Car extends Vehicle {
    @Override
    public Integer numberOfWheels() {
        return 4;
    }
}
