import java.io.*;
import java.util.*;
class reverseString {
    public static void main(String[] args) {
        String input="";
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] try= input.toCharArray();
            for (int i=tr1.length-1;i>=0;i--)
            System.out.print(try[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
