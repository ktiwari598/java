package solidprinciples.openclose.withOpenClosed;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return  (base * height)/2;
    }
}
