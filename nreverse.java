import java.io.*;
class FactorialUsingWhile
{
public static void main(String arg[])
    {
        int factorial = 1,j;
        Scanner n=new Scanner(System.in);
        j=n.nextInt();
        int i = 1;
        if(j>=0)
        {
        while(i <= j)
        {
            factorial *= i;
            i++;
        }
        
        System.out.println("Factorial of number " + j+ " is " + factorial);
        }
    }
}
