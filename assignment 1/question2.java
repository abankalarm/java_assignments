import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("welcome to loan calculator");
        System.out.println("please enter your principal, interest rate(annually) and number of payments");
        int P = in.nextInt();
        double r = in.nextInt();
        r = r/1200;
        double n = in.nextInt();
        double EMI = P*r*Math.pow(1+r,n)/(Math.pow(1+r,n)-1);
        in.close();
        System.out.println(EMI);
    }
}
