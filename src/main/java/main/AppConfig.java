package main;
import org.springframework.context.annotation.*;

@Configuration
@Lazy
@ComponentScan(basePackages = {"repo", "service","connection","main"})
public class AppConfig {


}
