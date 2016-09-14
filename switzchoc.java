import java.util.Scanner;

public class switzchoc {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Matrix Size M*N:\n Input must be positive\nM=");
    int input=sc.nextInt();
    System.out.println("N=");
    int input1=sc.nextInt();
    sc.close();
    if(input>0){
         if(input1>0){
            System.out.println("The number of cut is");
            System.out.println(((input*input1)-1));
         }
         else{
             System.out.println("Enter in range");
         }
    }
    else{
        System.out.println("Enter in range");
    }

}
}
