package homework;

public class Main3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 2.0);
        Square square = new Square(4.0);
        Circle circle = new Circle(3.0);
        System.out.println("Prostokąt o bokach " + rectangle.getLength() + " i " + rectangle.getWidth() + " - pole = " + rectangle.calculateArea() + ", obwód = " + rectangle.calculateCircuit());
        System.out.println("Kwadrat o boku " + square.getLength() + " - pole = " + square.calculateArea() + ", obwód = " + square.calculateCircuit());
        System.out.println("Koło o promieniu " + circle.getRadius() + " - pole = " + circle.calculateArea() + ", obwód = " + circle.calculateCircuit());
    }
}
