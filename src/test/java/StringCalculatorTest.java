import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 6/4/13
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {
    @Test
    public void testEmptyString()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add(""),0);

    }
}
