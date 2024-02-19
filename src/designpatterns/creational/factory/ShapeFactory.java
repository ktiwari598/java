package designpatterns.creational.factory;

public class ShapeFactory {
    public Shape getShape(String type) {
        switch (type) {
            case "Circle" -> {
                return new Circle();
            }
            case "Square" -> {
                return new Square();
            }
            case "Rectangle" -> {
                return new Rectangle();
            }
            default -> {
                return null;
            }
        }
    }
}
