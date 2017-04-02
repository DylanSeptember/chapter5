package chapter5.visitor;

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

    HumanOrgan humanOrgan;
    OrganVisitor organVisitor;


    @Before
    public void testBean() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        organVisitor = (OrganVisitor) ctx.getBean("b1");

    }

    @Before
    public void testBean2() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        humanOrgan = (HumanOrgan) ctx.getBean("b2");

    }

    @Before
    public void testBean3() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        humanOrgan = (HumanOrgan) ctx.getBean("b3");

    }

    @Before
    public void testBean4() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        humanOrgan = (HumanOrgan) ctx.getBean("b4");

    }

    @Before
    public void testBean5() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        humanOrgan = (HumanOrgan) ctx.getBean("b5");

    }


    @Test
    public void testHeartClass()
    {
        Heart heart = new Heart();

        Assert.assertNotNull(heart);
    }

    @Test
    public void testLiverClass()
    {
        Liver liver = new Liver();

        Assert.assertNotNull(liver);
    }

    @Test
    public void testLungClass()
    {
        Lungs lungs = new Lungs();

        Assert.assertNotNull(lungs);
    }

    @Test
    public void testHumanClass()
    {
        Human human = new Human();

        Assert.assertNotNull(human);
    }



   /* @Test
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

*/
}
