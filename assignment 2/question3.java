import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("please enter the 2 numbers");
        int a = n.nextInt();
        int b = n.nextInt();
        int answer = euclid(a,b);
        System.out.println("the gcd is "+answer);
        n.close();
    }
    public static int euclid(int a, int b) {

        if (a==0){
            return b;
        }
        return euclid(b%a, a);
    }
}
