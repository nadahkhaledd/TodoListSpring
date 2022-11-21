package service;

import enums.Category;
import enums.Priority;
import enums.SearchKey;
import model.TodoItem;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public interface TodoItemServiceTemplate {

     ArrayList<TodoItem> getItemsByPriority(Priority priority, ArrayList<TodoItem> userItems);
     ArrayList<TodoItem> getItemsByFavorite(ArrayList<TodoItem> userItems);
     ArrayList<TodoItem> getItemsByStartDate(Date startDate, ArrayList<TodoItem> userItems);
     ArrayList<TodoItem> getItemsByEndDate(Date endDate, ArrayList<TodoItem> userItems);
     boolean addTodoItem(String name, TodoItem item);
     boolean updateTodoItem(String name,TodoItem item, String oldTitle);
     boolean deleteTodoItem(String title, String name);
     void showAllTodoItems(ArrayList<TodoItem> userTodoItems);
     ArrayList<TodoItem> getTodosFromDB(ResultSet result);
     void showTop5ItemsByDate(String username);
     void printListItems(int lastIndex, ArrayList<TodoItem> userTodoItems);
     public int getItemByTitle(String title, ArrayList<TodoItem> userTodoItems);
     public ArrayList<TodoItem>searchByKey(SearchKey searchKey, String searchValue, String username);
     public ArrayList<TodoItem> searchShowItemsBySearchKey(SearchKey searchKey, String searchValue, ArrayList<TodoItem> userTodoItems);
     public boolean addItemToFavorite(String name,String title);
     public void printFavorites(ArrayList<TodoItem> userTodoItems);
     public boolean addItemToCategory(String name,String title, Category category);
}
