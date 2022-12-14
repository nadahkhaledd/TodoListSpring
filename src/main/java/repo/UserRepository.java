package repo;

import connection.DBConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class UserRepository implements UserRepoTemplate{
    Connection connection;
    Statement stmt;

    DBConnection dbConnection ;//= new DBConnection();

    @Autowired
    public UserRepository(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
        connection = dbConnection.configureConnection();
        try {
            stmt = connection.createStatement();
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

    public boolean createUser(String name) {
        String insertQuery = "INSERT INTO `todolist`.`user` (`name`) VALUES ('"+name+"');";
        try {
            int result = stmt.executeUpdate(insertQuery);
            return result > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean updateUsersName(String name, String newName){
        String updateStatement = "UPDATE todolist.user SET name= '" + newName+
                "'\nWHERE name= '" + name + "';";

        try {
            int result = stmt.executeUpdate(updateStatement);
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public ResultSet getUserNames() {
        ResultSet result = null;
        try {
            result = stmt.executeQuery(" SELECT name \n" +
                    "FROM todolist.user");
        } catch (SQLException e) {
            System.out.println(e);
        }

        return result;
    }
}
