import java.util.Scanner;

public class A_and_P_of_Rectangle {
    public static void main(String[]args){

        float length,width,area,perimeter;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of Rectangle: ");
        length = in.nextFloat();

        System.out.print("Enter width of Rectangle: ");
        width = in.nextFloat();

        perimeter= 2*(length+width);

        area=length*width;

        System.out.println("Perimeter of Rectacngle is" + perimeter+"units");
        System.out.println("Area of Rectangle is " + area+"sq.units");
    }
}
