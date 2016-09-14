import java.io.*;
import java.lang.*;
class Visitmatrix
{
  public static void main(String args[])
  {
   Scanner a=new Scanner(System.in);
   int a1=a.nextInt();
   int a2=a.netInt();
   int[][] b=new int[a1][a2];
   int i,j,k;
   for(i=0;i<a1;i++)
   {
    for(j=0;j<a2;j++)
    {
     b[i][j]=a.nextInt();
     }
    }
    for(i=0;i<a1;i++)
    {
    for(j=0j<a2;j++)
    {
     for(k=j+1;k<a2;k++)
     {
     if(b[i][j]==b[i][k])
      System.out.println("0");
    else 
     System.out.println("1");
  }
}
