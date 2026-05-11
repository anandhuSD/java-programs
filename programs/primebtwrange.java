import java.util.Scanner;

public class primebtwrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int n = sc.nextInt();
        System.out.print("Enter ending number: ");
        int k = sc.nextInt();
        for (int num = n; num <= k; num++) {
            if (num < 2) {
                continue;
            }
            boolean prime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
            }
        }
    }
}
