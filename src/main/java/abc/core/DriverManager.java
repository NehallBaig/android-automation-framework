package abc.core;

import abc.utils.TestResultsListener;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestResultsListener.class)
public class DriverManager {

    @Test
    public void test(){
        Assert.assertTrue(false);
    }
}
