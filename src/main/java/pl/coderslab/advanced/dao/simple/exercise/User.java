package pl.coderslab.advanced.dao.simple.exercise;

public class User implements Model {

    private Long id;
    private String group;
    private String name;
    private String surname;

    public User(String group, String name, String surname) {
        this(null, group, name, surname);
    }

    public User(Long id, String group, String name, String surname) {
        this.id = id;
        this.setGroup(group);
        this.setName(name);
        this.setSurname(surname);
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public User setGroup(String group) {
        this.group = group;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public User setSurname(String surname) {
        this.surname = surname;
        return this;
    }
}
