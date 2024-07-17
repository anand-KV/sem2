/*program to add two complex number*/
import java.util.*;
class complex
{
    double real;
    double img;
    complex(double a,double b)
    {
        real=a;
        img=b;
    }
}
class commain
{
    public static void main(String ar[])
    {
        complex c1=new complex(3,3.14);
        complex c2=new complex(2,1.4);
        complex res= add(c1,c2);
        System.out.println("first comp:"+c1.real+"+"+c1.img);
        System.out.println("first comp:"+c2.real+"+"+c2.img);
        System.out.println("resultant complex num:"+res.real+"+"+res.img);
    }
    public static complex add(complex s1,complex s2)
    {
        complex r=new complex(0.0,0.0);
        r.real=s1.real+s2.real;
        r.img=s1.img+s2.img;
        return r;
        
    }
}