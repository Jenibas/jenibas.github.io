import java.io.*;
import java.util.*;
class charalpha
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  char[] ch=s.toCharArray();
  for(int i=0;i<s.length();i++)
  {
   if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
   {
    System.out.println("it have only character");
    }
    else
    {
    System.out.println("not a character");
  }
}
   
