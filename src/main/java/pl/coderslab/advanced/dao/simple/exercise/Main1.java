package pl.coderslab.advanced.dao.simple.exercise;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        // create group
        GroupDao groupDao = new GroupDao();
        Group g = new Group("sample name");
        //save group to database
        groupDao.save(g);

        //get all groups
        List<Model> groups = groupDao.loadAll();
        for (Model model : groups) {
            Group group = (Group) model;
            System.out.println(group.getName());
        }
        //update group
        g.setName("other name");
        groupDao.save(g);

        //remove group
        Group firstElement = (Group) groupDao.loadById(1);
        if (firstElement != null) {
            groupDao.delete(firstElement);
        }

        UserDao userDao = new UserDao();
        User user = new User("Mistrze", "Michał", "Win");
        userDao.save(user);

        List<Model> users = userDao.loadAll();
        for (Model model : users) {
            User loadedUser = (User) model;
            System.out.println(loadedUser.getGroup() + " " + loadedUser.getName() + " " + loadedUser.getSurname());
        }
        user.setGroup("Second group");
        user.setName("Second name");
        user.setSurname("Second surname");
        userDao.save(user);

        User firstUser = (User) userDao.loadById(1);
        if (firstUser != null) {
            userDao.delete(firstUser);
        }
    }
}
