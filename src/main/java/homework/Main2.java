package homework;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("z", "z");
        Person person2 = new Person("b", "b");
        Person person3 = new Person("f", "f");
        Person person4 = new Person("x", "x");
        Person person5 = new Person("y", "y");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person.firstName + " " + person.lastName);
        }
    }
}
