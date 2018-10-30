package homeworkDay2;

public abstract class Vehicle {

    private Integer maxSpeed;
    private String model;

    public Vehicle(Integer maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    @Override
    public String toString(){
        if(this.getClass().equals("Car")){
            return this.toString();
        } else {
            return "Class : " + getClass().getName() + ", model: " + this.model + ", speed: " + this.maxSpeed;
        }
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
