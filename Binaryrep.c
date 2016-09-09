#include<stdio.h>

int main()
{
int x,t,a[50],b[50];
int i,j;

printf("\n Enter the no of value  :  ");
scanf("%d",&x);
printf("enter the first set value  :  ");
for(i=0;i<x;i++)
{
scanf("%d",&a[i]);
a[i]=b[i];
}
printf("enter the second set value  :  ");
for(j=0;j<x;j++)
{
scanf("%d",&a[j]);
}
for(i=0;i<x;i++)
{
for(j=0;j<x;j++)
{
if(b[i]>b[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
t=b[i];
b[i]=b[j];
b[j]=t;
}
else if(b[i]==b[i+1])
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
}
for(i=0;i<x;i++)
{
printf("%d",a[i]);
}
return 0;


}
