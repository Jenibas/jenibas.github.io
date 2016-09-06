#include<stdio.h>
#include<conio.h>
#include<string.h>
void dup(char a[],int b)
{
int k,l[40]={0};
clrscr();
for(k=0;k<b;k++)
l[a[k]%97]++;
for(k=0;k<b;k++)
{
if(l[a[k]%97]==1)
{
printf("%c\n",a[k]);
l[a[k]%97]=0;
}
}
}
int main()
{
char a[200];
int b;
scanf("%s",a);
b=strlen(a);
dup(a,b);
getch();
return 0;
}
