package homework;

public class Main1 {

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("z", "z");
        people[1] = new Person("b", "b");
        people[2] = new Person("f", "f");
        people[3] = new Person("x", "x");
        people[4] = new Person("y", "y");

        for (int i = 0; i < people.length - 1; i++) {
            int comparison = people[i].compareTo(people[i+1]);
            if(comparison == 0){
                Person personFirst = people[i+1];
                Person personLast = people[i];
                people[i] = personFirst;
                people[i+1] = personLast;
            }
        }

        for (Person person : people) {
            System.out.println(person.firstName + " " + person.lastName);
        }
    }

}
