import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class question4 {
    public static void intreadInFile(String line, String file) throws FileNotFoundException{
        Scanner sc2 = new Scanner(new FileInputStream(file));
        int line_num = 1;
        while(sc2.hasNextLine()) {
            String line1 = sc2.nextLine();
            if(line.equals(line1)){
                System.out.println(line_num);
            }
            line_num = line_num + 1;}
        }
    public static void main(String[] args) {
    System.out.println("Please enter the line you would like to search for: ");
    Scanner kb = new Scanner(System.in);
    String line = kb.nextLine();
    System.out.println("Please enter the file path you would like to search in: ");
    String file = kb.nextLine();
    try {
        intreadInFile(line,file);
    } catch (Exception e) {
        System.out.println("not found");
    }
    kb.close();
}
    
}