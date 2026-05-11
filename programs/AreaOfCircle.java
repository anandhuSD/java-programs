import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}
