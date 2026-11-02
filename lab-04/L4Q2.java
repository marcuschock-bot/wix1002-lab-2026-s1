//Write  a  program  that  accepts  an  integer  n  from  user  and  then  sum  the  following series
//1 + (1+2) + (1+2+3) + ... + (1+2+3+...+n)
import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a positive integer:");
            int number = input.nextInt();
            int sum = 0;
            for (int i = 1; i <= number; i++){
                int innerSum = 0;
                for (int j = 1; j <= i; j++)
                    innerSum += j;
                sum += innerSum;
            }
            System.out.println("Total summation of following series is = " + sum);
        }
    }
}