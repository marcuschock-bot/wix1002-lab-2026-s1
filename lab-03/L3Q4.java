import java.util.Random;

public class L3Q4 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int p1Roll1 = random.nextInt(6) + 1;
        int p1Roll2 = random.nextInt(6) + 1;
        int p1Score = p1Roll1 + p1Roll2;
        
        int p2Roll1 = random.nextInt(6) + 1;
        int p2Roll2 = random.nextInt(6) + 1;
        int p2Score = p2Roll1 + p2Roll2;
        
        System.out.println("Player 1 rolled: " + p1Roll1 + " and " + p1Roll2 + " (Total: " + p1Score + ")");
        System.out.println("Player 2 rolled: " + p2Roll1 + " and " + p2Roll2 + " (Total: " + p2Score + ")");
        
        if (p1Score > p2Score) {
            System.out.println("Player 1 wins!");
        } else if (p2Score > p1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}