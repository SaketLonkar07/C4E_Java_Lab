import java.util.Scanner;

public class A_and_P_of_square {
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side Length of Square:");
        float s = scan.nextFloat();

        float a = s*s;
        float p = 4*s;

        System.out.println("\nArea= "+a);
        System.out.println("\nPerimeter= "+p);
    }
}
