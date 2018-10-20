package pl.coderslab.advanced.dao.simple.exercise.pl.coderslab;

public class Car extends Vehicle {
    private String type;

    public Car(String type, Integer maxSpeed, String model) {
        super(maxSpeed, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
