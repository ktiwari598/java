package OOPS.clone;

public class MyClass implements Cloneable {
    private int value;
    private ClassB classB;

    public MyClass(int value, ClassB classB) {
        this.value = value;
        this.classB = classB;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ClassB getClassB() {
        return classB;
    }

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
