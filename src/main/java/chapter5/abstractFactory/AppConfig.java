package chapter5.abstractFactory;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 4/1/2017.
 */
public class AppConfig {

    @Bean(name = "Hobby1")
    public Hobby getSoccer()
    {
        return new Soccer();
    }

    @Bean(name = "Hobby2")
    public Hobby getChess() {
        return new Chess();
    }

    @Bean(name = "ab1")
    public abstractFactory getFactory()
    {
        return new HobbyFactory();
    }
}
