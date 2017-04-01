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

   /* @Test
    public void testDistanceAdapter()
    {
        DistanceAdapter distanceAdapter = new DistanceAdapter();

        Assert.assertNotNull(distanceAdapter);
    }

    @Test
    public void testKMToMiles()
    {
        DistanceAdapter distanceAdapter = new DistanceAdapter();

        distanceAdapter.setDistanceMiles(90);
        Assert.assertEquals(144, distanceAdapter.getDistanceKM(), 0);
    }

    @Test
    public void testMilesToKM()
    {
        DistanceAdapter distanceAdapter = new DistanceAdapter();

        distanceAdapter.setDistanceKM(144);;
        Assert.assertEquals(90, distanceAdapter.getDistanceMiles(), 0);
    }

    @Test
    public void testMiles()
    {
        DistanceAdapter distanceAdapter = new DistanceAdapter();

        distanceAdapter.setDistanceKM(144);;
        Assert.assertEquals(144, distanceAdapter.getDistanceKM(), 0);
    }

    @Test
    public void testKM()
    {
        DistanceAdapter distanceAdapter = new DistanceAdapter();

        distanceAdapter.setDistanceMiles(144);;
        Assert.assertEquals(144, distanceAdapter.getDistanceMiles(), 0);
    }*/

}
