package main.javatokotlin.user;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private static Repository INSTANCE = null;

    public List<User> users;

    // keeping the constructor private to enforce the usage of getInstance
    private Repository() {
        User user1 = new User("Chinedu", "Ihedioha");
        User user2 = new User("Uche", "");
        User user3 = new User("Olutoba", null);

        users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public static Repository getInstance() {
        if (INSTANCE == null) {
            synchronized (Repository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Repository();
                }
            }
        }
        return INSTANCE;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<String> getFormattedUserName() {
        List<String> userNames = new ArrayList<>(users.size());
        for (User user : users) {
            String name;
            if (user.getLastName() != null) {
                if (user.getFirstName() != null) {
                    name = user.getFirstName() + " " + user.getLastName();
                } else {
                    name = user.getLastName();
                }
            } else if (user.getFirstName() != null) {
                name = user.getFirstName();
            } else {
                name = "unknown";
            }
            userNames.add(name);
        }
        return userNames;
    }

}