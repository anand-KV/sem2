class sample 
{
 void func()
 {
  System.out.println("sum of two number");
  }
  static void func1(int a,int b)
  {
   System.out.println("a = "+a + "  and "+"b = " + b);
   }
  public static void main(String ar[])
  {
  int a,b;
   sample ob= new sample();
   ob.func();
   
   a=Integer.parseInt(ar[0]);
   b=Integer.parseInt(ar[1]);
   func1(a,b);
   System.out.println("sum = "+(a+b));
   }
}
