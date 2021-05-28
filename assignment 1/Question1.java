import java.util.Scanner;

public class Question1
{
    public static void main(String[] args)
    {
        System.out.println("please enter the coefficients of equation in order x^2, x and then constant");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int root_inside = (b^2)-4*a*c;
        int root_1 = -b + (root_inside)^-1/2;
        int root_2 = -b - (root_inside)^-1/2;
        System.out.println("root1 is ");
        System.out.println(root_1/2*a);
        System.out.println("root 2 is");
        System.out.println(root_2/2*a);
        in.close();
    }
};