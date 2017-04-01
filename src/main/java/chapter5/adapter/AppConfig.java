package chapter5.adapter;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 4/1/2017.
 */
public class AppConfig {



    @Bean(name = "int")
    public DistanceInfo getChess() {
        return new DistanceAdapter();
    }


}
