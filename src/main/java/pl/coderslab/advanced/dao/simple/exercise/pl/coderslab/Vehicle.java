package pl.coderslab.advanced.dao.simple.exercise.pl.coderslab;

public abstract class Vehicle {

    private Integer maxSpeed;
    private String model;

    public Vehicle(Integer maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    @Override
    public String toString(){
        return "Class : " + getClass().getName() + ", model: " + this.model + ", speed: " + this.maxSpeed;
    }
}
