package lesson7;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(MyTestListener.class)
public class AssertExample {

    @Test
    public void someAsserts() {
        Assert.assertEquals(5, 5);
        Assert.assertEquals("Jack", "Jack");
        Assert.assertTrue(5 > 8, "sfrerferf 5>4");
    }

    @Test
    public void someAsserts2() {
        Assert.assertEquals(5, 5);
        Assert.assertEquals("Jack", "Jack");
        Assert.assertFalse(5 > 8, "sfrerferf 5>4");
    }


}
