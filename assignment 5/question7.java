import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s1 = n.nextLine();
        n.close();
        String f ="";
        //s2.length;
        for (int i=0;i<s1.length();i=i+2){
            f += s1.charAt(i);
        }
        System.out.println(f);
    }
}