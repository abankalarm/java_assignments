import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s1 = n.nextLine();
        n.close();
        //s2.length;
        for (int i=0;i<s1.length();i=i+1){
            int count=0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)&&i!=j){
                    count=count+1;
                }
            }
            if(count==0){
                System.out.println(s1.charAt(i));
                System.exit(0);
            }

        }
        
    }
}