package Stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Krysia", "Nowa", "female", "1988-06-15", 2500.00);
        Employee employee2 = new Employee("Marysia", "Wałkowa", "female", "1973-09-05", 2300.00);
        Employee employee3 = new Employee("Marta", "Mieszko", "female", "1990-08-25", 2800.00);
        Employee employee4 = new Employee("Michał", "Nowicki", "male", "1968-04-08", 2600.00);
        Employee employee5 = new Employee("Krystian", "Kowalski", "male", "1993-06-04", 2450.00);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
        employees.stream()
                .filter(s -> s.getSurname().startsWith("N"))
                .forEach(employee -> {
                    System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getGender() + " " + employee.getBirth() + " " + employee.getSalary());
                });
        employees.stream()
                .filter(s -> {
                    int now = LocalDate.now().getYear();
                    int birth = LocalDate.parse(s.getBirth()).getYear();
                    if(now - birth >= 30 && now - birth <= 45) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .forEach(s -> System.out.println(s.getName() + " " + s.getSurname() + " " + s.getGender() + " " + s.getBirth() + " " + s.getSalary()));
        employees.stream()
                .filter(s -> s.getGender().equals("female"))
                .filter(o -> {
                    int now = LocalDate.now().getYear();
                    int birth = LocalDate.parse(o.getBirth()).getYear();
                    if(now - birth >= 20 && now - birth <= 30) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .filter(p -> p.getSalary() < 3500)
                .forEach(employee -> employee.setSalary(employee.getSalary() * 1.05));
    }
}
