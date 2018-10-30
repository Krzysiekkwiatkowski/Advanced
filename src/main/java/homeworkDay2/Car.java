package homeworkDay2;

public class Car extends Vehicle implements Inspectionable {
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

    @Override
    public void createInspection() {
        System.out.println("Model: " + this.getModel() + " - sprawdzony");
    }

    @Override
    public String toString() {
        return "Model: " + this.getModel() + " - sprawdzony";
    }
}
