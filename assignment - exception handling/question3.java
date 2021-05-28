import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numerator and then denominator");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Fraction f = new Fraction();
        f.check(b);
        String output = f.fract(a, b);
        System.out.println(output);
        sc.close();
    }
}
class Fraction{
    public String fract(int numerator, int denominator) {
        return numerator + ((denominator != 1) ? "/" + denominator : "");
    }
    public int check(int b){
        if (b == 0) {
            throw new ArithmeticException("denominator is zero");
        }
        return 0;
    }
} 
