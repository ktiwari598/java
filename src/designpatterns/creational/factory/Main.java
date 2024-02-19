package designpatterns.creational.factory;

/**
 * This is a Creational Design Pattern
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        Shape square = shapeFactory.getShape("Square");
        Shape others = shapeFactory.getShape("Other");

        circle.draw();
        square.draw();
        rectangle.draw();
        others.draw();

    }
}
