import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
    System.out.println("enter number to count digits of");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int count = 0;
    in.close();
    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
    }

}

