/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 6/4/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public int add(String s) {
        if(s.isEmpty())
            return 0;  //To change body of created methods use File | Settings | File Templates.
        if(s.length()==1)
            return Integer.parseInt(s);
        return 0;

    }
}
