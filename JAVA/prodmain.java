import java.util.Scanner;
class product
{
 int pcode;
 string pname;
 float price;
 void get()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter pcode:");
  s.nextInt();
  Scanner s1=new Scanner(System.in);
  System.out.println("enter pname:");
  s1.nextLine();
  System.out.println("enter price:");
  s.nextFloat();
 }
}
class prodmain()
{
  public static void main(String ar[])
  {
   product p0= new prodmain();
   product p1= new prodmain();
   product p2= new prodmain();
   p0.get();
   p1.get();
   p2.get();
   if(p0.price<=p1.price && p0.price)
  }

}


