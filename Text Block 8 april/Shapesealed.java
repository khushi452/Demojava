sealed abstract class Shape permits Circle, Rectangle, Square {
    abstract int area();
}

final class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    int area() {
        return 3 * radius * radius;
    }
}

final class Rectangle extends Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }
}

final class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    int area() {
        return side * side;
    }
}

public class Shapesealed {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape s = new Square(3);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Square Area: " + s.area());
    }
}