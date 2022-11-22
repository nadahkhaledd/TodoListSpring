package connection;

import main.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Component
public class DBConnection {

    DBConfig dbConfig;
    public Connection connection;

    @Autowired
    public DBConnection(DBConfig config) {
        this.dbConfig=config;
    }

    public Connection configureConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbConfig.url + dbConfig.dbName, dbConfig.dbUserName, dbConfig.password);
        } catch (ClassNotFoundException | SQLException c) {
            System.out.println(c);
        }

        return connection;
    }


}
