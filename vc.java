import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Vowel_Consonant 
{
    public static void main(String[] args) throws Exception 
    {
        char j;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        j = (char) bf.read();
    switch(j)
    {
        case 'a':
        System.out.println("The given character "+j+" is vowel");
        break;
 
        case 'e':
        System.out.println("The given character "+j+" is vowel");
        break;
 
        case 'i':
        System.out.println("The given character "+j+" is vowel");
        break;
 
        case 'o':
        System.out.println("The given character "+j+" is vowel");
        break;
 
        case 'u':
        System.out.println("The given character "+j+" is vowel");
        break;
 
        default:
        System.out.println("The given character "+j+" is consonant");
        break;
        }
    }
}
