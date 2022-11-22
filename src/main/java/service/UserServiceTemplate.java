package service;

import model.TodoItem;
import model.User;

import java.util.ArrayList;

public interface UserServiceTemplate {

    boolean addUser(String name);
    boolean updateUsersName(String name, String newName);
    ArrayList<String> getUserNames();
  ArrayList<TodoItem> getUserTodos(String username);
 User setUserData(String username, ArrayList<TodoItem> items);

}
