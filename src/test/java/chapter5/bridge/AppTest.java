package chapter5.bridge;

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

    Computer computer;

    @Before
    public void testBean() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        computer = (Computer) ctx.getBean("int1");

    }

    Processor processor;

    @Before
    public void testBean2() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        processor = (Processor) ctx.getBean("int2");

    }

    @Test
    public void testProcesser()
    {
        i7 i = new i7();

        Assert.assertNotNull(i);
    }


    @Test
    public void testPC()
    {
        PC pc = new PC(new i7());

        Assert.assertNotNull(pc);
    }



}
