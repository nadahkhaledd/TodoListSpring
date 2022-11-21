package service;

import java.util.ArrayList;

public interface UserServiceTemplate {

    boolean addUser(String name);
    boolean updateUsersName(String name, String newName);
    ArrayList<String> getUserNames();

}
