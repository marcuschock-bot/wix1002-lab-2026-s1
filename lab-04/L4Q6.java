import java.util.Scanner;
import java.util.Random;

public class L4Q6{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int integer = random.nextInt();
        System.out.println("Random integer generated: " + integer);
        System.out.print("The number of digits in the integer is:" + " " + String.valueOf(Math.abs(integer)).length());
        input.close();
    }

}
