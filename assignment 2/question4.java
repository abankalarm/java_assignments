import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] input_array = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            input_array[i] = s.nextInt();
        }
        System.out.println("the numbers greater than average are");
        int sum = 0;
        for(int i=0; i<length; i++ ) {
            sum += input_array[i];
        }
        int average = sum/length;

        for(int i=0; i<length; i++ ) {
            if (input_array[i]>average){
                System.out.println(input_array[i]);
            }
        }
        s.close();
    }
}
