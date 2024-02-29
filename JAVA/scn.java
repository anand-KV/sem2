import java.util.Scanner;
class scn
{
 public static void main(String ar[])
 {
  try{
     Scanner s= new Scanner(System.in);
     System.out.println("enter your name:");
     String n=s.nextLine();
     String m=s.next();
     s.nextLine();
     System.out.println("name:"+n +m);
     System.out.println("enter a number:");
     int nu=s.nextInt();
     System.out.println("number:"+nu);
     print();
     scn w=new scn();
     w.output();
     }
  catch(Exception e)
  {
   System.out.println(e);
   }  
  }
  static void print()
  {
   System.out.println("hello");
  }
  void output()
  {
  System.out.println("hello world");
  }
  
  }
