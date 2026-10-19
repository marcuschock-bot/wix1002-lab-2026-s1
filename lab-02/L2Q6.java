import java.util.Random;

public class L2Q6{
    public static void main(String[] args) {
        Random generator = new Random();
        int number = generator.nextInt(10001); 

        int tenThousands = (number / 10000) % 10;
        int thousands = (number / 1000) % 10;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        int sum = tenThousands + thousands + hundreds + tens + ones;

        System.out.println("Random generated number: " + number);
        System.out.println("The sum of the digits is: " + sum);
    }
}
