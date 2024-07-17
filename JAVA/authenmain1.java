/*write a user defined exception class to authenticate the username 
and password*/
import java.util.*;
class authexception extends Exception
{
    //constructor
    public authexception(String message)
    {
        super(message);
    }
}
class authen
{
    String user_name="anand_kv";
    String passwd="0123";
    public void authen(String us,String ps) throws authexception
    {
      if(user_name.equals(us)&& passwd.equals(ps))
      throw new authexception("login done!");
      else
      throw new authexception("login failed!!");
    }
}
class authenmain1
{
    public static void main(String ar[])
    {
        authen a=new authen();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the username and passwrd:");
        String u=s.nextLine();
        String p=s.nextLine();
        try{
        a.authen(u,p);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
           s.close();
        }

    }
}