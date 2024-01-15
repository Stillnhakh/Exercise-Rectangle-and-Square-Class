//Exercise: Rectangle and Square Class

class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}

class Square extends Rectangle {
    // Square does not have any additional data members

    public Square(double side) {
        super(side, side); // Calling the constructor of the superclass (Rectangle)
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        Square square = new Square(5.0);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
