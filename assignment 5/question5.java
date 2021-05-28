import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s1 = n.nextLine();
        n.close();
        int sum=0;
        for (int i=0;i<s1.length();i++){
            sum+=s1.charAt(i);
        }
        System.out.println(sum);
    }
}
