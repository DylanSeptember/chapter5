package chapter5.prototype;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 4/1/2017.
 */
public class AppConfig {



    @Bean(name = "clone1")
    public CloneObject getChess() {
        return new Cat();
    }

    @Bean(name = "clone2")
    public CloneObject getFactory()
    {
        return new Dog();
    }
}
