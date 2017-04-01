package chapter5.singleton;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 

{

    @org.junit.Test
    public void testLogin()
    {
        Login log = Login.getInstance();

        Assert.assertSame(log, Login.getInstance());
    }

    @org.junit.Test
    public void testNotNull()
    {
        Login log = Login.getInstance();

        Assert.assertNotNull(log);
    }
}
