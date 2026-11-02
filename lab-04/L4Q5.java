// import java.util.Scanner;
// public class L4Q5 { 
//     public static void main (String [] args) {
//         Scanner input = new Scanner (System.in);
//         int dice = (int)(Math.random() * 6) + 1;
//         int score1 =0;
//         int score2 =0;

//         while (score1 < 100 && score2 < 100) {
//             System.out.print("Player 1, press Enter to roll the dice...");
//             input.nextLine();
//             score1 += (int)(Math.random() * 6) + 1;
//             System.out.println("Player 1 rolled a " + dice + ". Total score: " + score1);
            
//             if (score1 >= 100) {
//                 System.out.println("Player 1 wins!");
//                 break;
//             }
            
//             System.out.print("Player 2, press Enter to roll the dice...");
//             input.nextLine();
//             score2 += (int)(Math.random() * 6) + 1;
//             System.out.println("Player 2 rolled a " + dice + ". Total score: " + score2);
            
//             if (score2 >= 100) {
//                 System.out.println("Player 2 wins!");
//                 break;
//             }

//         }
//     }  
// }

import java.util.Random;
import java.util.Scanner;

public class L4Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] scores = {0, 0}; // Index 0 = Player 1, Index 1 = Player 2
        int currentPlayer = 0; // Starts with Player 1 (index 0)
        final int WINNING_SCORE = 100;

        System.out.println("=== Welcome to the Dice Race to 100! ===");

        // Game loop continues until a player scores more than 100
        while (scores[0] <= WINNING_SCORE && scores[1] <= WINNING_SCORE) {
            int playerNum = currentPlayer + 1;
            boolean rollAgain;

            System.out.println("\n----------------------------------");
            System.out.println("Player " + playerNum + "'s Turn (Current Score: " + scores[currentPlayer] + ")");

            do {
                rollAgain = false;
                System.out.print("Press ENTER to roll the dice...");
                scanner.nextLine();

                // Roll a 6-sided dice (1 to 6)
                int roll = random.nextInt(6) + 1;
                scores[currentPlayer] += roll;

                System.out.println("Player " + playerNum + " rolled a: " + roll);
                System.out.println("Total Score: " + scores[currentPlayer]);

                // Check for immediate win condition
                if (scores[currentPlayer] > WINNING_SCORE) {
                    break;
                }

                // If player rolls a 6, grant an extra turn
                if (roll == 6) {
                    System.out.println("--> You rolled a 6! You get an extra roll!");
                    rollAgain = true;
                }
            } while (rollAgain);

            // Switch to the other player (0 -> 1, 1 -> 0)
            currentPlayer = (currentPlayer == 0) ? 1 : 0;
        }

        // Determine and display the winner
        int winner = (scores[0] > WINNING_SCORE) ? 1 : 2;
        System.out.println("\n==================================");
        System.out.println("🎉 Congratulations! Player " + winner + " wins with " + scores[winner - 1] + " points! 🎉");
        System.out.println("==================================");

        scanner.close();
    }
}