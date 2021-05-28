import java.util.Scanner;
public class question4 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s1 = n.nextLine();
        String s2 = n.nextLine();
        n.close();
        String[] s1_a = s1.split(" ", 2); 
        String[] s2_a = s2.split(" ", 2);
        String s1_n = s1_a[0]+" "+s2_a[1]; 
        String s2_n = s2_a[0]+" "+s1_a[1]; 
        System.out.println(s1_n+"\n"+s2_n);
    }
}
