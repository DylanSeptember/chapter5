package chapter5.visitor;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 4/1/2017.
 */
public class AppConfig {



    @Bean(name = "b1")
    public OrganVisitor getChess() {
        return new HumanOrganDisplayVisitor();
    }


    @Bean(name = "b2")
    public HumanOrgan getChess3() {
        return new Heart();
    }

    @Bean(name = "b3")
    public HumanOrgan getChess4() {
        return new Liver();
    }

    @Bean(name = "b4")
    public HumanOrgan getChess5() {
        return new Lungs();
    }

    @Bean(name = "b5")
    public HumanOrgan getChess6() {
        return new Human();
    }

}
