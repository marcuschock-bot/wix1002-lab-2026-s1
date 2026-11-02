//Write  a  program  that  ask  user  to  enter  the  year  and  the  first  day  of  the  year  (0  for 
//Sunday,  1  for  Monday,  ...  ,  6  for  Saturday).  Display  the  calendar  for  May  and 
//August

import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDay = scanner.nextInt();

        // Display calendar for May
        displayCalendar(year, firstDay, 5);

        // Calculate the first day of August
        int daysInMay = 31;
        int daysInJune = 30;
        int daysInJuly = 31;
        int firstDayOfAugust = (firstDay + daysInMay + daysInJune + daysInJuly) % 7;

        // Display calendar for August
        displayCalendar(year, firstDayOfAugust, 8);

        scanner.close();
    }

    private static void displayCalendar(int year, int firstDay, int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("\n" + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}