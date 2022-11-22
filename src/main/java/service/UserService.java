package service;

import model.TodoItem;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.UserRepoTemplate;
import repo.UserRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class UserService implements UserServiceTemplate{

    private  UserRepoTemplate userRepository;
    private TodoItemServiceTemplate todoService;
    public UserService(){}
     @Autowired
    public UserService( UserRepoTemplate userRepository,TodoItemServiceTemplate todoService) {
        this.userRepository = userRepository;
        this.todoService=todoService;
    }

    public boolean addUser(String name) {
        return userRepository.createUser(name);
    }

    public boolean updateUsersName(String name, String newName){
        boolean updated = userRepository.updateUsersName(name,newName);
        if(updated){
            return true;
        }
        return false;
    }
   public ArrayList<TodoItem> getUserTodos(String username){
       return todoService.getUserTodos(username);
      // todoService.getTodosFromDB(userRepository.getUserTodos(username));
   }

    public ArrayList<String> getUserNames(){
        ResultSet result = userRepository.getUserNames();

        ArrayList<String> usernames = new ArrayList<>();

        try {
            while (result.next())
                usernames.add(result.getString(1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usernames;
    }
    public User setUserData(String username, ArrayList<TodoItem> items) {
        User user = new User(username);
        user.setItems(items);
        return user;
    }


}
