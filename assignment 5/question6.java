import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s1 = n.nextLine();
        n.close();
        int a = s1.length();
        String f ="";
        if(s1.charAt(0)=='x'){
            f += "x";
        }
        String[] s2 = s1.split("[x]");
        //s2.length;
        for (int i=0;i<s2.length;i++){
            f += s2[i];
        }
        if(s1.charAt(a-1)=='x'){
            f += "x";
        }
        System.out.println(f);
    }
}
