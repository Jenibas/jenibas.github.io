#include <iostream>
using namespace std;

int main() {
	long long int m;
	cin>>m;
	long long int a[m],k[10000]={0},i,j,max=0;
	for(i=0;i<m;i++)
	{
		cin>>a[i];
		k[a[i]]++;
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	for(i=0;i<=max;i++)
	{
		if(k[i]>1)
		{
			cout<<i<<" ";
		}
	}
	return 0;
}
