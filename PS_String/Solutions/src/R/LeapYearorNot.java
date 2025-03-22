package R;

import java.util.Scanner;

public class LeapYearorNot {
    public static void main(String[] args) {
        //Write a java program to find whether a year entered by  the user is a leap  year or not
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();


        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }


    }
}
