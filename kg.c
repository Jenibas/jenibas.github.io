#include<stdio.h>
#include<conio.h>
void main()
{
int n1,x;
int p,i,j=1;
clrscr();
printf("Enter the n value : ");
scanf("%d",&n1);
printf("Enter the pair : ");
scanf("%d",&p);
for(i=0;i<2*n1;i++)
{
x=2*n1-i;
if(p!=x)
{
printf("The pair for %d  day  is %d and %d\n",p,j++,p);
}
}
getch();
}
