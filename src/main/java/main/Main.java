package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.TodoItemsService;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

//        TodoItemsService todoItemsService = context.getBean(TodoItemsService.class);
//
//        todoItemsService.showTop5ItemsByDate("nadah");

    }

}
