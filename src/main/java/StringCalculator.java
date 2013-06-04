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

        if(s.contains("//") && s.contains("\n")){

            String sCur=s.substring(4,s.length());
            String curs[] = sCur.split(s.substring(2,3));
            for(int i=0; i<curs.length;i++)
                sum=sum+Integer.parseInt(curs[i]);
            return sum;
        }
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
