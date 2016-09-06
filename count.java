import java.util.Scanner;

public class unter5 {
	public static void main(String [] args) {

		String []oo={"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String A="1",B="2",C="3",D="4",E="5",F="6",G="7",H="8",I="9",J="10",K="11",L="12",M="13",N="14",O="15",P="16",Q="17",R="18",S="19",T="20",U="21",V="22",W="23",X="24",Y="25",Z="26";
	System.out.println("Enter the no");
	int z;
	Scanner abc=new Scanner(System.in);
	z=abc.nextInt();
	int count=0;
	String n=String.valueOf(z);
	String ss[]=new String[100];
	int k=0;String s1;
	ss[k]="";
	for(int i=0;i<=n.length()-1;i++){
	 		 s1=n.substring(i,i+1);
			 int i1=Integer.parseInt(s1);
				ss[k]+=oo[i1];
		}  System.out.println(ss[k]);
		k++;	count++;ss[k]="";
	for(int i=0;i<=n.length()-2;i++){
	 s1=n.substring(i, i+2); 
	 
			int i1=Integer.parseInt(s1);
			if(i1>26){
				  i1=i1-26;
			}
			 
			ss[k]+=oo[i1];
			for(int p=i+2;p<=n.length()-1;p++)
			{  String s2=n.substring(p,p+1);
			int p1=Integer.parseInt(s2);
			
				 ss[k]+=oo[p1]+"";			
			}
			if(i==n.length()-1){
				for(int i11=0;i11<=n.length()-2;i11++){
			 		 s1=n.substring(i11,i11+1);
					 int i21=Integer.parseInt(s1);
						ss[k]+=oo[i21];
						
				}  			}  
			System.out.println(ss[k]);
			count++;	k++;ss[k]=""; 
			}System.out.print("count= "+k);
	 
 

	 
}
	}
