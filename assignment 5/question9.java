import java.util.Scanner;
public class question9 {
    public static void main(String[] args) {
        boolean x=true;
        while(x==true){
        Scanner n = new Scanner(System.in);
        String s1 = n.nextLine();
        
        int count=0;
        if(s1.length()>=9){
            count++;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>64&&s1.charAt(i)<91){
                count++;
                break;
            }
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>96&&s1.charAt(i)<123){
                count++;
                break;
            }
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>47&&s1.charAt(i)<58){
                count++;
                break;
            }
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='@'||s1.charAt(i)=='#'||s1.charAt(i)=='$'||s1.charAt(i)=='%'){
                count++;
                break;
            }
        }
        if(count==5){
            System.out.println("secure");
            n.close();
            System.exit(0);
        }
        System.out.println("try again"); 
        }
    }}