import java.util.Scanner;
class sort
{
 static int n,i,j;
 static String s[]=new String[100];
 static void get()
 {
 Scanner ob1=new Scanner(System.in);
     System.out.println("enter the count");
     n=ob1.nextInt();
     
     Scanner ob2=new Scanner(System.in);
     System.out.println("enter the strings");
     for(i=0;i<n;i++)
     {
	s[i]=ob2.nextLine();
     }
    } 
 void compare()
 {
  	String tem;
  	for(i=0;i<n;i++)
 	{
   	  for(j=i+1;j<n;j++)
          {
    	    if(s[i].compareTo(s[j])>0)
     	    {
        	tem=s[i];
        	s[i]=s[j];
        	s[j]=tem;
     	    } 
    	   }
  	 }    
  }
  void display()
  {
    System.out.println("sorted strings:");
    for(i=0;i<n;i++)
    {
      System.out.println(s[i]);
    }
  }
}
class sortstr
{
    
    
 public static void main(String ar[])   
 {
    
     
     sort x=new sort();
     x.get();
     x.compare();
     x.display();
  }
}     
  
