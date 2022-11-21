package model;


import ui.Font;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String name;
    ArrayList<TodoItem> items;
    private Font font;

    public User(String name) {
        this.name = name;
        this.font = new Font();
        this.items = new ArrayList<>();
    }

    public ArrayList<TodoItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<TodoItem> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
