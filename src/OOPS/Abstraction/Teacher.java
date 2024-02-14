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
 *
 * ADT defines what operations you can perform on a certain kind of data, like adding items, removing items,
 * or finding out how many items there are. It's like the rulebook for working with that type of data.
 */