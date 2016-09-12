#include<stdio.h>
#include<stdlib.h>
int main()
{
int i1;
char num[123];
printf("enter the number ");
gets(num);
i1=atoi(num);
printf("the number in after conversion from string to int is %d",i1);
return 0;
}
