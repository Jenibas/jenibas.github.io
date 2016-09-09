#include<stdio.h>
#include<conio.h>
int main() {
		int n=123;
	    int m=n;
		int n1=0;
	     while(n!=0)
		{
			n1=n%10;
			n=n/10;
			m=m*n1;
			
		}
		printf("%d:",m);
	}

}
