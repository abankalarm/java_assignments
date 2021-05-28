import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of rows");
        int rows = in.nextInt();
        int a = 1;
        for(int i =1; i<=rows; i++){
            for(int d =1; d<=i; d++)
            {
            System.out.print(a);
            a++;
        }
        System.out.println();  
    }
        in.close();
    }
}