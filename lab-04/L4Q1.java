//Write a program that accepts an integer from user. Then, display its entire factors in  increasing factor.

import java.util.Scanner;
import java.util.Locale;

public class L4Q1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}