package solidprinciples.liskovSubstitution.withoutLSP;

/**
 * This class is violating Liskov Substitution principle as it is downgrading the parent class capability
 *
 * Ideally, child class should add to parent capability
 */

public class Bicycle extends Vehicle {

    @Override
    public Boolean hasEngine() {
        return null;
    }
}
