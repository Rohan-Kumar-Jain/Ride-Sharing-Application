package service;

import model.User;
import repository.Repository;

public class UserService {

    public static User addUser(String name, String gender, int age){
        User u = new User(name,gender,age);
        Repository.userArrayList.add(u);
        return u;
    }

}
