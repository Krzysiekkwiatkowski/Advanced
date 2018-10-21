package pl.coderslab.advanced.dao.simple.exercise.pl.coderslab;

public class Exercise implements ExerciseModel{

    private Integer id;
    private String title;
    private String description;

    public Exercise(String title, String description) {
        this.id = null;
        this.title = title;
        this.description = description;
    }

    public Exercise(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
