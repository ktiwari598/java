package solidprinciples.openclose.withOpenClosed;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Shape circle = new Circle(2.0);
        Shape rectangle = new Rectangle(2.0, 6.0);
        Shape triangle = new Triangle(2.0, 6.0);
        System.out.println("Area of circle : " + areaCalculator.getArea(circle));
        System.out.println("Area of rectangle : " + areaCalculator.getArea(rectangle));
        System.out.println("Area of triangle : " + areaCalculator.getArea(triangle));
    }
}
