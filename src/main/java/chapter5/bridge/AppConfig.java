package chapter5.bridge;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 4/1/2017.
 */
public class AppConfig {



    @Bean(name = "int1")
    public DBInfo getChess() {
        return new PersonInfo();
    }

}
