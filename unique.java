public class Array {

	public static void main(String[] args) 
	{
		int m = args.length;
		int []a=new int[m];
		int []b=new int[m];
		for(int i=0;i<m;i++)
		{
			a[i]=Integer.parseInt(args[i]);		
		b[i]=0;
		}
		for(int i=0;i<m;i++)
		{
		for(int j=0;j<m;j++)
		{
			if(a[i]==a[j])
			{
				b[i]=b[i]+1;
			}
			
			}}
		for(int i=0;i<m;i++)
		{
			if(b[i]<2)
			{
			System.out.println("The unique element is " +a[i]);
			}
			}
		}
	}
