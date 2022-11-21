package repo;

import enums.Category;
import model.TodoItem;

import java.sql.ResultSet;

public interface TodoItemRepoTemplate {

    boolean createUserTodo(String name, TodoItem item);
    ResultSet searchByTitle(String username, String title);
    ResultSet searchByStartDate(String username,String startDate);
    ResultSet searchByEndDate(String username,String endDate);
    ResultSet searchByPriority(String username,String priority);
    ResultSet getFavorites(String username);
    ResultSet getUserTodos(String username);
    ResultSet getUserLatestTodos(String username);
    boolean deleteTodoItem(String title, String name);
    boolean updateTodoItem(String name,TodoItem item, String oldTitle);
    boolean addItemToFavorite(String name,String title);
    boolean addItemToCategory(String name,String title, Category category);

}
