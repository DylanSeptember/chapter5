package chapter5.bridge;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 4/1/2017.
 */
public class AppConfig {



    @Bean(name = "int1")
    public Computer getChess() {
        return new PC(new i7());
    }

    @Bean(name = "int2")
    public Processor getChess2() {
        return new i7();
    }

}
