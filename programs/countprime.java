import java.util.Scanner;

public class countprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int count = 0;
        for (int num : numbers) {
            boolean prime = true;
            if (num <= 1) {
                prime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if (prime) {
                count++;
            }
        }
        System.out.println("Prime numbers count = " + count);
    }
}