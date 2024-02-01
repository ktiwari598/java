import java.util.Objects;

public class POJO {
    private String name;
    private int age;


    public POJO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * equals() method is used for comparing 2 objects, default implementation in Object class
     * is to check if both methods point to the same memory location, override it to add your own
     * custom comparing logic
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        POJO pojo = (POJO) o;
        return age == pojo.age && Objects.equals(name, pojo.name);
    }

    /**
     *  If two objects are equal according to the equals() method, then they must have the same hash code
     *  according to the hashCode() method. Conversely, if two objects have the same hash code,
     *  they are not necessarily equal according to the equals() method, although it's less common
     *  and referred to as a hash collision.
     *
     *  The primary purpose of the hashCode() method is to provide a numerical representation of the state of an object.
     *  This numerical value is used by hash-based data structures to determine the bucket or slot in which the object
     *  should be stored
     *
     *  By default, the hashCode() method provided by the Object class returns a unique identifier
     *  for each object, based on the memory address of the object.
     *
     * Common practice for implementation of hashCode = 31 * result + (element == null ? 0 : element.hashCode());
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * The primary purpose of the toString() method is to provide a string representation of an object's state.
     * It is often used for debugging, logging, and general information display.
     *
     *  The default implementation of the toString() method provided by the Object class returns a string consisting
     *  of the class name followed by the "@" symbol and the object's hash code in hexadecimal format.
     */
    @Override
    public String toString() {
        return "POJO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
