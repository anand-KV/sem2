import java.util.Scanner;
class pro
{
   int x,y;
   String str,w;
   int v;
     pro()
    {
      Scanner s= new Scanner(System.in);/*object creation*/
      System.out.println("Enter your name:");
      str=s.nextLine();
     }
     pro(int a, int b)
     {
       x=a;
       y=b;
     }
     pro(String st,int i)
     {
       w=st;
       v=i;
      }
     void display()
     {
       System.out.println("name:"+str);
       System.out.println("number1:"+x);
       System.out.println("number2:"+y);
       System.out.println("sum:"+(x+y));
       System.out.println("name:"+w +"\n"+"id:"+v);
     }
     
     
}
class test
{
      public static void main(String ar[])
     {
        /*object instantiation*/
        pro p1 = new pro();/* default arg*/
        pro p2 = new pro(2,4);/*constructor with args(int)*/
        pro p3 = new pro("sheem",34);/*constructor with args(int,str)*/
        p1.display();
        p2.display();
        p3.display();
  
     }
}
