import java.util.Scanner;
interface shape
{
 public void area();//interface methd without any body//body of the interface cannot be created here
 public void perimeter();
 public void get();
}

class circle implements shape
{
    static double ar;
    static double p;
    float r;
    public void get()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        r= s.nextInt();
    }
 public void area()//body of the interface can be created inside the class
 {
 
  ar=3.14*r*r;
  System.out.println("Area of the circle:"+ar);
 }
 public void perimeter()
{
  p=2*3.14*r;
  System.out.println("perimeter of the circle:"+p);
 }
}
 class rectangle implements shape
 {
    static float a;
    static float peri;
    float l;
    float b;
    public void get()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the length of the rectangle:");
        l= s.nextInt();
        System.out.println("enter the breadth of the rectangle:");
        b= s.nextInt();
    }
    public void area()
    {
     
     a=l*b;
     System.out.println("Area of the rectangle:"+a);
    }
    public void perimeter()
    {
     peri=2*(l+b);
     System.out.println("perimeter of the rectangle:"+peri);
    }
 }
class interfacepgm
{
    public static void main(String ar[])
    {
        circle c=new circle();
        rectangle re=new rectangle();
        c.get();
        re.get();
        Scanner s= new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter your choice:\n 1.area of circle \n 2. perimeter of circle \n 3.area of rectangle \n 4. perimeter of rectangle \n 5.exit");
        int co=s.nextInt();
       
            switch(co)
            {
              case 1:  
              {
                c.area();
                break;
              }
              case 2:  
              {
                c.perimeter();
                break;
              }
              case 3:  
              {
                re.area();
                break;
              }
              case 4:  
              {
                re.perimeter();
                break;
              }
              case 5:  
              {
                return;
              }
            }
        }
        
    }
}