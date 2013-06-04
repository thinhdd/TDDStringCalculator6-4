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
    @Test
    public void testOneDigit()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add("1"),1);
        Assert.assertEquals(sc.add("2"),2);
    }
    @Test
    public void testOneDelimiterDigit()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add("1,2"),3);
        Assert.assertEquals(sc.add("2,3"),5);
    }
    @Test
    public void testOneTwoDelimiter()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add("1,2\n3"),6);
        Assert.assertEquals(sc.add("2\n2"),4);
    }
    @Test
    public void testOneTwoDelimiterError()
    {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(sc.add("1,\n3"),-1);
        Assert.assertEquals(sc.add("2\n2"),4);
    }

}
