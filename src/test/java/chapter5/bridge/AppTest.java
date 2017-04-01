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

    DBInfo dbInfo;


    @Before
    public void testBean() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        dbInfo = (PersonInfo) ctx.getBean("int1");

    }



    @Test
    public void testPersonInfo()
    {
        PersonInfo personInfo = new PersonInfo();

        Assert.assertNotNull(personInfo);
    }


    @Test
    public void testProxy()
    {
        Proxy proxy = new Proxy();

        Assert.assertNotNull(proxy);
    }



}
