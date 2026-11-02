import java.util.Scanner;

public class L4Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input parameters
        System.out.print("Enter principal amount: ");
        double P = scanner.nextDouble();

        System.out.print("Enter interest in %: ");
        double yearlyInterest = scanner.nextDouble();

        System.out.print("Enter total number of month(s): ");
        int N = scanner.nextInt();

        // Monthly interest rate formula
        double monthlyRate = yearlyInterest / (12 * 100);

        // Monthly payment (M) calculation
        double M = (P * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -N));

        // Header formatting
        System.out.printf("\n%-8s %-16s %-12s %-12s %-16s %-14s%n", 
                "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        double totalInterest = 0;

        // Amortization table loop
        for (int n = 1; n <= N; n++) {
            // Formula implementation[cite: 1]
            double C = M * Math.pow(1 + monthlyRate, -(1 + N - n)); // Principal portion
            double L = M - C;                                       // Interest due
            double R = (L / monthlyRate) - C;                      // Remaining balance

            // Handle potential rounding residual (-0.00) in final month
            if (Math.abs(R) < 1e-4) {
                R = 0.0;
            }

            totalInterest += L;

            System.out.printf("%-8d %-16.2f %-12.2f %-12.2f %-16.2f %-14.2f%n", 
                    n, M, C, L, R, totalInterest);
        }

        scanner.close();
    }
}