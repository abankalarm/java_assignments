import java.text.DecimalFormat;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 2 decimal numbers");
        double a = in.nextDouble();
        double b = in.nextDouble();
        DecimalFormat df = new DecimalFormat("########.##");
        String a1 = df.format(a);
        String b1 = df.format(b);
        if (a1.equals(b1)){
            System.out.println("the 2 numbers are equal to 2 decimal places");
        }
        else{
            System.out.println("nice try, but the numbers are not same");
        }
        in.close();
        
    }
}
