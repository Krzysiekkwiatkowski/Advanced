package Stream;

public class Employee {

    private String name;
    private String surname;
    private String gender;
    private String birth;
    private double salary;

    public Employee(String name, String surname, String gender, String birth, double salary) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birth = birth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
