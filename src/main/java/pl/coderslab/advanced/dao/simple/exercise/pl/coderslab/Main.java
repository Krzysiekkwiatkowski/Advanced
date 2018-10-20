package pl.coderslab.advanced.dao.simple.exercise.pl.coderslab;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        Car car = new Car("SUV", 120, "Cayenne");
        Train train = new Train(100, "Mallard", 1435 );
        vehicles[0] = car;
        vehicles[1] = train;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
