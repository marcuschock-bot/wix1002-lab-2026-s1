import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter coordinate point (x, y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        
        double distance = Math.sqrt(x * x + y * y);
        
        if (distance <= radius) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }
        
        scanner.close();
    }
}