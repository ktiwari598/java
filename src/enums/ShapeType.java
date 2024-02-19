package enums;

/**
 * Enums can have private constructors, methods, fields
 * Enums can implement interfaces
 * Enums in Java do not support inheritance from other enums or classes.
 * Enums are implicitly final, meaning they cannot be subclassed or extended.
 */
public enum ShapeType implements Shape {

    Circle {
        @Override
        public double area(int size) {
            return Math.PI * size * size;
        }
    },
    Square {
        @Override
        public double area(int size) {
            return size * size;
        }
    };
}
