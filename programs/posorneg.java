import java.util.Scanner;

public class posorneg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number >= 0) {
            System.out.println("The number is Positive");
        } else {
            System.out.println("The number is Negative");
        }
    }
}