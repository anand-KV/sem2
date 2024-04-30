import java.util.Scanner;
class stringmal
{
 public static void main(String ar[])
 {
  String str[]=new String[40];
  String s="d    hi-java";
  System.out.println("org string:"+s);
  System.out.println("character at index 0:"+s.charAt(0));
  System.out.println("substring from index 6:"+s.substring(6));
  System.out.println("string to uppercase"+s.toUpperCase());
  System.out.println("string to lowercase:"+s.toLowerCase());
  System.out.println("trim whitespaces:"+s.trim());
  System.out.println("index of letter h:"+s.indexOf("h"));
  System.out.println("words after splitting:");
  str=s.trim().split("-");
  for(String i:str)
  {
   System.out.println(i);
  }
  System.out.println("length:"+s.length());
  System.out.println("strings are equal:"+s.equals("hello"));
  System.out.println("after concatinating:"+s.concat("! welcome"));
  System.out.println("replace java with word:"+s.replace("java","word"));
 }
}       
