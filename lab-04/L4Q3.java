import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to keep track of statistics
        int count = 0;
        double sum = 0;
        double sumSq = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        // Loop continuously to get input until a negative score is entered
        while (true) {
            System.out.print("Enter a score [negative score to quit]:");
            double score = scanner.nextDouble();

            // Exit condition when a negative score is entered
            if (score < 0) {
                break;
            }

            // Update minimum and maximum scores
            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }

            // Accumulate sum and sum of squares for calculation
            sum += score;
            sumSq += score * score;
            count++;
        }

        // Display results if valid scores were entered
        if (count > 0) {
            // Calculate average score
            double average = sum / count;

            // Calculate standard deviation using the formula: s = sqrt((sumSq - (sum^2 / N)) / (N - 1))
            double stdDeviation = 0.0;
            if (count > 1) {
                stdDeviation = Math.sqrt((sumSq - (Math.pow(sum, 2) / count)) / (count - 1));
            }

            // Print outputs matching the sample format
            System.out.println(sumSq); // Printing sum of squares as shown in the output sample
            
            // Format output values (casting min/max to int if scores are whole numbers)
            System.out.printf("Minimum Score: %.0f\n", min);
            System.out.printf("Maximum Score: %.0f\n", max);
            System.out.printf("Average Score: %.2f\n", average);
            System.out.printf("Standard Deviation: %.2f\n", stdDeviation);
        } else {
            System.out.println("No valid scores were entered.");
        }

        scanner.close();
    }
}