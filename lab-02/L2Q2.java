import java.util.Scanner;
import java.util.Locale;

public class L2Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the price (P): ");
        double P = input.nextDouble();

        System.out.print("Enter the down payment (D): ");
        double D = input.nextDouble();

        System.out.print("Enter the interest rate in % (R): ");
        double R = input.nextDouble();

        System.out.print("Enter the loan duration in years (Y): ");
        double Y = input.nextDouble();

        double principal = P - D;
        double monthly = principal * (1 + R * Y / 100) / (Y * 12);

        System.out.printf(Locale.US, "Monthly payment:RM %.2f\n", monthly);

        input.close();
    }
}