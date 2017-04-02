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

    Strategy strategy;


    @Before
    public void testBean() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        strategy = (Strategy) ctx.getBean("b1");

    }

    @Before
    public void testBean2() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        strategy = (Strategy) ctx.getBean("b2");

    }



    @Test
    public void testHoodieClass()
    {
        PurchaseHoodieStrategy purchaseHoodieStrategy = new PurchaseHoodieStrategy();

        Assert.assertNotNull(purchaseHoodieStrategy);
    }

    @Test
    public void testShoeClass()
    {
        PurchaseShoeStrategy purchaseShoeStrategy = new PurchaseShoeStrategy();

        Assert.assertNotNull(purchaseShoeStrategy);
    }

    @Test
    public void testContextShoe()
    {
        PurchaseShoeStrategy purchaseShoeStrategy = new PurchaseShoeStrategy();
        Context context = new Context(500, purchaseShoeStrategy);

        Assert.assertNotNull(context);
    }

    @Test
    public void testContextHoodie()
    {
        PurchaseHoodieStrategy purchaseHoodieStrategy = new PurchaseHoodieStrategy();
        Context context = new Context(500, purchaseHoodieStrategy);

        Assert.assertNotNull(context);
    }

    @Test
    public void testCheckHoodie()
    {
        PurchaseHoodieStrategy purchaseHoodieStrategy = new PurchaseHoodieStrategy();
        Context context = new Context(200, purchaseHoodieStrategy);

        Assert.assertFalse(context.getResult());
    }

    @Test
    public void testCheckShoe()
    {
        PurchaseShoeStrategy purchaseShoeStrategy = new PurchaseShoeStrategy();
        Context context = new Context(1500, purchaseShoeStrategy);

        Assert.assertFalse((!context.getResult()));
    }

    @Test
    public void testSetStrategy()
    {
        PurchaseHoodieStrategy purchaseHoodieStrategy = new PurchaseHoodieStrategy();
        PurchaseShoeStrategy purchaseShoeStrategy = new PurchaseShoeStrategy();
        Context context = new Context(1500, purchaseShoeStrategy);
        context.setStrategy(purchaseHoodieStrategy);

        Assert.assertSame(purchaseHoodieStrategy, context.getStrategy());
    }

    @Test
    public void testGetBalance()
    {
        PurchaseShoeStrategy purchaseShoeStrategy = new PurchaseShoeStrategy();
        Context context = new Context(1500, purchaseShoeStrategy);

        Assert.assertEquals(1500, context.getBalance());
    }


}
