#include<stdio.h>
#include<conio.h>
void main()
{
int y,x;
int p,i,j=1;
clrscr();
printf("Enter the y value : ");
scanf("%d",&y);
printf("Enter the pair : ");
scanf("%d",&p);
for(i=0;i<2*y;i++)
{
x=2*y-i;
if(p!=x)
{
printf("The pair for %d  day  is %d and %d\n",p,j++,p);
}
}
getch();
}
