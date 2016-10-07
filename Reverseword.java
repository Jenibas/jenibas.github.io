import java.util.*;
public class Reverseword
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 String[] s1=s.split(" ");
 Stringn s2,s3="";
 for(int i=0;i<s.length();i++)
 {
  StringBuffer sb=new StringBuffer(s1[i]);
  s2=sb.reverse().toString();
  s3=s3+" "+s2;
  }
  System.out.println(s3);
 }
}
  
