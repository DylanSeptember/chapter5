package chapter5.abstractFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
    private Hobby Hobby1;
    private Hobby Hobby2;
    private abstractFactory ab1;

    @Before
    public void testBean1() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Hobby1 = (Hobby) ctx.getBean("Hobby1");

    }

    @Before
    public void testBean2() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Hobby2 = (Hobby) ctx.getBean("Hobby2");

    }

    @Before
    public void testBean4() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ab1 = (abstractFactory) ctx.getBean("ab1");

    }

}
