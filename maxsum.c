#include<stdio.h>
int main()
{
int arr[]={-3,-3,-5,-5,-7,-4,-9,-6,-4};
int x,max;
int sum=0;
for(x=0;x<9;x++);
{
sum=sum+arr[x];
if(sum<0)
sum=0;
else if(sum>max)
{
max=sum;
}
}
printf("%d",max);
return 0;
}
