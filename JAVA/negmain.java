/*find the average of n positive numbers,raising a user defind exception for each negative input*/
import java.util.*;
class negav extends Exception
{
   public  negav(String message)
    {
        super(message);
    }
}
class negmain
{
    static int avg=0;
    public static void main(String ar[]) //throws negav
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit:");
        int n=s.nextInt();
        System.out.println("elements:");
        for(int i=1;i<=n;i++)
        {
            int a=s.nextInt();
            try{
                if(a<0)
                {
                    i--;
                    throw new negav("negative number occured:pls re enter it");
                }
                else
                {
                    avg=avg+a;
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("average of positive num:"+avg);
 
    }

    
}