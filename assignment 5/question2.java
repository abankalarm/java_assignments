import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s = n.nextLine();
        char[] arr = {'a','e','i','o','u'};
        n.close();
        int v=0;
        for(int i = 0;i<s.length();i++){
            for(int j=0;j<5;j++){
                if(s.charAt(i)==arr[j]){
                    v++;
                } 
            }
        }
        int c = s.length()-v;
        System.out.println("the number of vowels is "+v);
        System.out.println("the number of consonants is "+c);
    }
}
