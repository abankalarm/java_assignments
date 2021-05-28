import java.util.Scanner;
public class question3 {

    public static void swap(char a,char b){
        char t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s = n.nextLine();
        n.close();
        int i = s.length()/2;

        for(int j=0;j<i;j++){
            if(s.charAt(j)!=s.charAt(s.length()-j-1)){
                System.out.println("NO its not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("yes its palindrome");
        System.exit(0);

    }

}
