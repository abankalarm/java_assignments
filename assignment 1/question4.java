import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of rows");
        int rows = in.nextInt();
        in.close();
        int a = 1;
        String b = "";
        for(; a<=rows; a++){
            String e = String.valueOf(a);
            b = b + e;
            System.out.println(b);
        }     
    }
}
