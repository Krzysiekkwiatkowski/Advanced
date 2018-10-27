package homework;

public class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculateCircuit() {
        return 2 * 3.14 * radius;
    }
}
