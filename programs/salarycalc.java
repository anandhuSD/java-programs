import java.util.Scanner;

public class salarycalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = input.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = input.nextDouble();

        System.out.print("Enter DA: ");
        double da = input.nextDouble();

        System.out.print("Enter bonus: ");
        double bonus = input.nextDouble();

        System.out.print("Enter deductions: ");
        double deduction = input.nextDouble();

        double totalSalary = basic + hra + da + bonus - deduction;

        System.out.println("Total Salary = " + totalSalary);
    }
}