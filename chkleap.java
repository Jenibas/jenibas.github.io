import java.io.*;
import java.lang.*;
class chkleap
{
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
System.out.println("enter the year  to calculate leap or not");
if(n1%4==0)
{
System.out.println("the year is a leap year");
}
else
{
System.out.println("Not a leap year");
}
String[] a=new String[45];
a[0]="sunady";
a[1]="monday";
a[2]="tuesday";
a[3]="wednesday";
a[4]="thursday";
a[5]="friday";
a[6]="saturday";
for(int i=0;i<a.length;i++)
{
System.out.println(a[i+1]);
}
}
}
