/*create a class cpu with attribute price.create an inner class processor
(no of cores,manufacturer)and a static nested class ram(memory,manufacturer)
create an object of the cpu and print info of processor and ram.*/

import java.util.*;
class cpu
{
    Double price;
    cpu(Double p)
    {
        price=p;
    }
    class processor
    {
        int noc;
        String manu;
        processor(int c,String m)
        {
          noc=c;
          manu=m;
        }
        void pdisplay()
        {
            System.out.println("no of cores:"+noc);
            System.out.println("manufacturer:"+manu);
        }
    }

 static class ram
 {
    String memo;
    String manuf;
    ram(String me,String ma)
    {
        memo=me;
        manuf=ma;
    }
    void rdisplay()
    {
        System.out.println("memory:"+memo);
        System.out.println(" ram manufacturer:"+manuf);
    }
 }
    void display()
    {
      System.out.println("price:"+price);
    }
}
class cpumain
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the price:");
        double pr=s.nextDouble();
        cpu c=new cpu(pr);
        System.out.println("enter the noc and manu:");
        int nc=s.nextInt();
        String mn=s1.nextLine();
        cpu.processor p= c.new processor(nc,mn);
        System.out.println("enter the memory and manf:");
        String mm=s1.nextLine();
        String mnf=s1.nextLine();
        cpu.ram r=new cpu.ram(mm,mnf);
        r.rdisplay();
        p.pdisplay();
        c.display();

    }
}