import java.util.Scanner;
import java.util.Locale;

public class L2Q5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the amount of water in grams: ");
        double massInGrams = input.nextDouble();

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialF = input.nextDouble();

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalF = input.nextDouble();

        double massKg = massInGrams / 1000.0;
        double initialC = (initialF - 32) * 5.0 / 9;
        double finalC = (finalF - 32) * 5.0 / 9;

        double energy = massKg * (finalC - initialC) * 4184;

        System.out.printf(Locale.US, "The energy needed is: %.2f Joules%n", energy);

        input.close();
    }
}