package connection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbconfig.properties")
public class DBConfig {
  //  @Autowired
    @Value("${url}")
    public String url;

    @Value("${databasename}")
    public String dbName;

    @Value("${dbusername}")
    public String dbUserName;

    @Value("${password}")
    public String password;
    public DBConfig(){
    //  System.out.println("hehehehehe");
    }

}
