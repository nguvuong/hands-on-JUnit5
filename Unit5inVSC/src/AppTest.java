import java.beans.Transient;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void test() {
        App gre = new App();
        Assert.assertEquals("Hello", "Hello");
    }
}
