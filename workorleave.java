import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
public class workorleave {
    public static void main(String[] args){
        Scanner str=new Scanner(in);
        out.print("Enter a day : ");
        String day=str.next();
        switch(day.toLowerCase()){
            case "sunday":out.println("WorkingDay("+day+") : "+false);break;
            default:out.println("WorkingDay("+day+") : "+true);
        }
    }
}
