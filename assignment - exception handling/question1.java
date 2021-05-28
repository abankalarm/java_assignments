
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
    String[] months = {"January", "February", "March", "April", "May", "June","July", "August","September", "October", "November", "December"};
    int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    System.out.println("Elements in the array are:: ");
    Scanner sc = new Scanner(System.in);
    sc.close();
    System.out.println("Enter the index of the required month ::");
    try {
        int element = sc.nextInt();
        System.out.println("Element in the given index is "+months[element]+" and days are "+dom[element]);
    } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("The index you have entered is invalid");
        System.out.println("Please enter an index number between 0 and 12");
      }
    }
}
