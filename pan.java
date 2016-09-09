public class PangramChecker {
	PangramChecker(String Str)
	{
		String a=Str.toLowerCase();
		boolean ispan=true;
		for(int i=97;i<123;i++)
		{
			if(a.indexOf((char)(i))==-1)
			{
				ispan=false;
				break;
			}
		}
		if(ispan)
			System.out.println("It is a Pangram");
		else
			System.out.println("It is not a Pangram");
	}
public static void main(String[] args) {
	new PangramChecker("qwertyuiOP asdfghjkl zxcvbnm");
}
}
