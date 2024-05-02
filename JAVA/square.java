import java.util.Scanner;
package graphics;
public interface sq
{
    public void areaperi();//interface method doesnt have body here
    
}
public class square implements sq
{
    double ar;
    double p;
    float r;
 public void areaperi()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the side of square:");
  r=s.nextInt();
  ar=r*r;
  System.out.println("area of square:"+ar);
  p=4*r;
  System.out.println("perimeter of square:"+p);
 }
 
}