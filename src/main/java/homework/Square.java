package homework;

public class Square extends Shape {

    private double length;

    public double getLength() {
        return length;
    }

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }

    @Override
    public double calculateCircuit() {
        return 4 * length;
    }
}
