/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 6/4/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public int add(String s) {
        int sum=0;
        if(s.isEmpty())
            return 0;  //To change body of created methods use File | Settings | File Templates.
        if(s.length()==1)
            return Integer.parseInt(s);
        String cur[] = s.split("[,\n]");
        for(int i=0; i<cur.length;i++)
        {
            if(check(cur[i]))
                sum=sum+Integer.parseInt(cur[i]);
            else
                return -1;
        }
        return sum;
    }
    public boolean check(String s)
    {
        if(s.isEmpty())
            return false;
        return true;
    }
}
