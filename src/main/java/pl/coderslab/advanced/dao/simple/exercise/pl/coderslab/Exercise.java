package pl.coderslab.advanced.dao.simple.exercise.pl.coderslab;

public class Exercise implements ExerciseModel{

    private Integer id;
    private String title;
    private String description;

    public Exercise(String title, String description) {
        this(null, title, description);
    }

    public Exercise(Integer id, String title, String description) {
        this.setTitle(title);
        this.setDescription(description);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Exercise setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Exercise setDescription(String description) {
        this.description = description;
        return this;
    }
}
