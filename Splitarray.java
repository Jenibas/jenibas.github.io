import java.util.Scanner;


public class Splitarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int a[]=new int[len];
		for(int i=0;i<len;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
		int b=a.length;
		int c=b/2;
		int d=c+1;
		int e=b-d;
		int j=0;
		int sum1=0;
		int arr[]=new int[d];
		int a1[]=new int[e];
		for(int i=0;i<=c;i++){
			sum=sum+a[i];
		}System.out.println(sum);
		for(int i=c+1;i<b;i++){
			sum1=sum1+a[i];
		}if(sum/d==sum1/e){
			
			for(int i=0;i<=c;i++){
				arr[i]=a[i];
			}
			for(int i=c+1;i<b;i++){
				a1[j]=a[i];
				j++;
			}System.out.println(arr);
			System.out.println(a1);
		}else{
			System.out.println("not possible");
		}
	}

}
