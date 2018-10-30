package homeworkDay2;

import pl.coderslab.advanced.dao.simple.exercise.pl.coderslab.Train;

public class Main4 {
    public static void main(String[] args) {
        Car car = new Car("SUV", 120, "Sportage");
        Train train = new Train(120, "Mallard", 1560);
        System.out.println(car.toString());
        System.out.println(train.toString());
    }
}
