import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);3
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}