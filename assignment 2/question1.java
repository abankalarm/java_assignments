import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        String[] string_array = {"aaa","ccc","bbb"};
        int[] int_array = {1,3,2};
        
        Arrays.sort(string_array);
        Arrays.sort(int_array);

        System.out.println("the string array {aaa,ccc,bbb} is now");
        System.out.println(Arrays.toString(string_array));
        System.out.println("the integer array {1,3,2} is now");
        System.out.println(Arrays.toString(int_array));
    
    } 
}
