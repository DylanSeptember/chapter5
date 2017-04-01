package chapter5.prototype;

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

    CloneObject clone1;

    @Before
    public void testBean1() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        clone1 = (CloneObject) ctx.getBean("clone1");

    }

    CloneObject clone2;

    @Before
    public void testBean2() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        clone2 = (CloneObject) ctx.getBean("clone2");

    }



    @Test
    public void testCat()
    {
        Cat cat = new Cat();

        Assert.assertNotNull(cat);
    }

    @Test
    public void testDog()
    {
        Dog dog = new Dog();

        Assert.assertNotNull(dog);
    }

    @Test
    public void testCatCopy()
    {
        Cat cat = new Cat();
        Cat c = (Cat)cat.copy();
        Assert.assertSame(cat.getClass(), c.getClass());
    }

    @Test
    public void testDogCopy()
    {
        Dog dog = new Dog();

        Dog d = (Dog)dog.copy();
        Assert.assertSame(dog.getClass(), d.getClass());
    }

}
