import java.util.Scanner;
/* using reference variable*/
class complex
{
 Double real;
 Double img;
 /*complex()
 {}*/
 
 complex(Double a,Double b)
 {42
  img=b;
  }
}
class comp
{
 public static void main(String args[])
 {
 complex c1=new complex(2.10,3.4);
 complex c2=new complex(1.20,4.1);
  complex res;//REFERENCE VARIABLE
  res = add(c1,c2);
   System.out.println("first complex number:"+c1.real+"+"+c1.img+"i");
  System.out.println("second complex number:"+c2.real+"+"+c2.img+"i");
  System.out.println("sum of complex numbers:"+res.real+"+"+res.img+"i");
  }
  
  public static complex add(complex s1,complex s2)
  {
  complex r=new complex(0.0,0.0);
  r.real=s1.real+s2.real;
  r.img=s1.img+s2.img;
  return r;
  }
 
}
