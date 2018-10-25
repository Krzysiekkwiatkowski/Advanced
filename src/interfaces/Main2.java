package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Moveable> moveableList = new ArrayList<>();
        Car car = new Car();
        moveableList.add(car);
        Cat cat = new Cat();
        moveableList.add(cat);
        Person person = new Person();
        moveableList.add(person);
        for (Moveable moveable : moveableList) {
            moveable.start();
        }
    }
}
