import java.util.Scanner;
import java.util.Locale;


public class L2Q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int seconds = input.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.printf(Locale.US, "%d seconds is equal to %d hours, %d minutes, and %d seconds.%n", seconds, hours, minutes, remainingSeconds);

        input.close();
    }
    
}
