import java.util.Scanner;
import java.util.Locale;

public class L2Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf(Locale.US, fahrenheit + "°F is equal to " + String.format("%.2f", celsius) + "°C");

        input.close();
    }
}