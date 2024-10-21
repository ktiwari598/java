package solidprinciples.openclose.withoutOpenClosed;

public class AreaCalculator {

        public double calculateRectangleArea(Rectangle rectangle) {
            return rectangle.getWidth() * rectangle.getHeight();
        }

        public double calculateCircleArea(Circle circle) {
            return Math.PI * circle.getRadius() * circle.getRadius();
        }

}
