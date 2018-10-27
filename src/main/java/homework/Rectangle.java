package homework;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return  length * width;
    }

    @Override
    public double calculateCircuit() {
        return 2 * (length + width);
    }
}
