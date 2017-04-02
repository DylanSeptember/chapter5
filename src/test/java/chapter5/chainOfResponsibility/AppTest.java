package chapter5.chainOfResponsibility;

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

    WorkerHandler workerHandler;


    @Before
    public void testBean() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        workerHandler = (WorkerHandler) ctx.getBean("b1");

    }

    @Before
    public void testBean2() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        workerHandler = (WorkerHandler) ctx.getBean("b2");

    }

    @Before
    public void testBean3() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        workerHandler = (WorkerHandler) ctx.getBean("b3");

    }

    @Test
    public void testWorker1()
    {
        Worker1Handler worker1Handler = new Worker1Handler();

        Assert.assertNotNull(worker1Handler);
    }

    @Test
    public void testWorker2()
    {
        Worker2Handler worker2Handler = new Worker2Handler();

        Assert.assertNotNull(worker2Handler);
    }

    @Test
    public void testWorker3()
    {
        Worker3Handler worker3Handler = new Worker3Handler();

        Assert.assertNotNull(worker3Handler);
    }

   /* @Test
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

*/

}
