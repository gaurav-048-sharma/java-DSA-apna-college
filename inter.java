// Define an interface
interface Shape {
    double calculateArea(); // Abstract method

    void display(); // Another abstract method
}

// Implement the interface in a class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle with radius: " + radius);
    }
}

public class inter {
    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle myCircle = new Circle(5.0);

        // Call methods defined in the interface
        double area = myCircle.calculateArea();
        System.out.println("Area: " + area);

        myCircle.display();
    }
}
