package Modularity.user;

import java.util.List;
import java.util.ArrayList;

public class UserService {

    private List<User> usersList = new ArrayList<>();

    public void addUser(User user) {
        usersList.add(user);
    }

    public List<User> getUsers() {
        return usersList;
    }

}
