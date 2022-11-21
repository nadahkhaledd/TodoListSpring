package main;

import connection.DBConfig;
import connection.DBConnection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@Lazy
@ComponentScan(basePackages = {"repo", "service"})
public class AppConfig {

//    @Value("${url}")
//    public String url;
//
//    @Value("${databasename}")
//    public String dbName;
//
//    @Value("${dbusername}")
//    public String dbUserName;
//
//    @Value("${password}")
//    public String password;

//    @Bean
//    public DBConnection connection(){
//        DBConnection connection = new DBConnection(url, dbName, dbUserName, password);
//        return connection;
//    }


}
