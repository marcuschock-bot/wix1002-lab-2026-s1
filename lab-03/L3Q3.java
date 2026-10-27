import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter sales volume: ");
        double salesVolume = scanner.nextDouble();
        
        double commissionRate;
        if (salesVolume <= 100) {
            commissionRate = 0.05;
        } else if (salesVolume <= 500) {
            commissionRate = 0.075;
        } else if (salesVolume <= 1000) {
            commissionRate = 0.10;
        } else {
            commissionRate = 0.125;
        }
        
        double commission = salesVolume * commissionRate;
        System.out.printf("Commission: %.2f\n", commission);
        
        scanner.close();
    }
}