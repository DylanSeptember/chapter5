package chapter5.chainOfResponsibility;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 4/1/2017.
 */
public class AppConfig {



    @Bean(name = "b1")
    public WorkerHandler getChess() {
        return new Worker1Handler();
    }

    @Bean(name = "b2")
    public WorkerHandler getChess1() {
        return new Worker2Handler();
    }

    @Bean(name = "b3")
    public WorkerHandler getChess2() {
        return new Worker3Handler();
    }

}
