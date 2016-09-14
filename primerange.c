#include<stdio.h>
void main()
{
int i, prime, up, low, n;
clrscr();
printf(“\n\n\t ENTER THE LOWER LIMIT…: “);
scanf(“%d”, &low);
printf(“\n\n\t ENTER THE UPPER LIMIT…: “);
scanf(“%d”, &up);
printf(“\n\n\t PRIME NUMBERS ARE…: “);
for(n=low+1; n<up; n++)
{
prime = 1;
for(i=2; i<n; i++)
if(n%i == 0)
{
prime = 0;
break;
}
if(prime)
printf(“\n\n\t\t\t%d”, n);
}
getch();
}
