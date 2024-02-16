package solidprinciples.liskovSubstitution;

/**
 * Here, we are easily replacing Shape with its child classes Square and Rectangle
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.getArea());
        Shape square = new Square(25);
        System.out.println(square.getArea());
    }
}
