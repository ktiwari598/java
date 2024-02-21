package OOPS.clone;

public class ClassB {
    private int id;

    public ClassB(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "id=" + id +
                '}';
    }
}
