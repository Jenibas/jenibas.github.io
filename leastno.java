import java.io.*;
import java.util.*;
public class leastno
{
static int[] separate(String a)
{
int n[]=new int[a.length()];
for(int j=0;j<a.length();j++)
{
n[j]=a.charAt(i)-48;
}
return n;
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String a=in.nextLine();
int n=in.nextInt();
int[] a1=separate(a);
Arrays.sort(a1);
int re=a1.length-n;
int sum=0;
for(int i=0;i<re;i++)
{
	sum=sum*10+a1[i];
}
System.out.println(sum);
}
}
