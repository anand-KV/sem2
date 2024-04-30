import java.util.Scanner;
class author
{ 
 static String usr;
 static int pss;
 static String user="anand_kv";
 static int pass=120908;
 public static void main(String ar[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("username:");
  usr=s.nextLine();
  System.out.println("password:");
  pss=s.nextInt();
  try
  {
   if (usr.equals(user) && pss==pass)//int need == for comparing values
   {
    System.out.println("matched");
    }
    else 
    System.out.println("match failed:");
  } 
   catch(Exception e)
   {
     System.out.println("exception:"+e);
    }
     
  }
}     
