import java.util.Scanner;

public class A_and_P_of_Circle {
    public static void main(String[]args){
        Scanner io =new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius= io.nextDouble();
        System.out.println("Perimeter of circle is ="+(2*radius*Math.PI));
        System.out.println("Area is ="+(Math.PI*radius*radius));

    }
}
