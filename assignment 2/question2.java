import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        int[] range = {1,3,4,5,2,8};
        Scanner n = new Scanner(System.in);
        System.out.println("please enter the number you wanna find in {1,3,4,5,2,8} ");
        
        int key = n.nextInt();
        int len = range.length;
        int ans = 0;
        for(int i=0;i<len; i++){
            if (key==range[i]){
                ans =1;
            }
        }
        if (ans==1){
            System.out.println("YES IT IS PRESENT");
        }
        else{
            System.out.println("the number is non existent");
        }
        n.close();
    
    }
}