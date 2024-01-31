package OOPS.Abstraction;

public abstract class Teacher {

    public void teach() {
        System.out.println("Teach to students");
    }

    abstract void giveAssignment();
}

/**
 * Abstract classes
 * Objects cannot be created
 * Can have constructors
 * Supports multi level inheritance
 * Do not support multiple inheritance, only interface supports multiple inheritance
 */