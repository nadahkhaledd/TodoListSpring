package repo;

import java.sql.ResultSet;

public interface UserRepoTemplate {

    public boolean createUser(String name);
    public boolean updateUsersName(String name, String newName);
    public ResultSet getUserNames();
}
