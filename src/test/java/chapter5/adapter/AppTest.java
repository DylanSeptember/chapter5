package chapter5.adapter;

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

    DistanceInfo distanceInfo;

    @Before
    public void testBean() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        distanceInfo = (DistanceInfo) ctx.getBean("int");

    }





    @Test
    public void testDistanceMiles()
    {
        DistanceMiles distanceMiles = new DistanceMiles();

        Assert.assertNotNull(distanceMiles);
    }

    @Test
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
    }

}
