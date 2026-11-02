import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        Random random = new Random();
        // Generate random n in range 0 to 100 (inclusive)[cite: 1]
        int n = random.nextInt(101);

        System.out.println("Random n generated: " + n);
        System.out.println("First " + n + " prime numbers:");

        int count = 0;
        int candidate = 2;

        while (count < n) {
            if (isPrime(candidate)) {
                System.out.print(candidate + " ");
                count++;
            }
            candidate++;
        }
        System.out.println();
    }

    // Helper method to verify if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}