package connection;

import main.AppConfig;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    DBConfig dbConfig = new DBConfig();

//    private String url;
//    private String dbName;
//    private String dbUserName;
//    private String password;
static Connection connection;

    public DBConnection() {
    }

//    public DBConnection(String url, String dbName, String dbUserName, String password) {
//        this.url = url;
//        this.dbName = dbName;
//        this.dbUserName = dbUserName;
//        this.password = password;
//    }

    public Connection configureConnection() {
        System.out.println(dbConfig.url + dbConfig.dbName);
        System.out.println(dbConfig.dbUserName);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbConfig.url + dbConfig.dbName, dbConfig.dbUserName, dbConfig.password);
        } catch (ClassNotFoundException | SQLException c) {
            System.out.println(c);
        }

        return connection;
    }


}
