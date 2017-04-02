package chapter5.chainOfResponsibility;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 4/1/2017.
 */
public class AppConfig {



    @Bean(name = "b1")
    public Strategy getChess() {
        return new PurchaseShoeStrategy();
    }

    @Bean(name = "b2")
    public Strategy getChess2() {
        return new PurchaseHoodieStrategy();
    }

}
