import java.io.*;
public class NumberReverse {
    public static void main(String a[]){
        public int reverseNumber()
        {
        Scanner x=new Scanner(System.in);
        number=x.nextInt();
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        System.ou.println(reverse);
    }
    }
}
