package R;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        //Write a java program to find out the day of the week given the number[1 for monday 2 for tues and so on...]
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number: ");
        int day = sc.nextInt();

        switch (day){
            case 1 ->System.out.println("Monday");
            case 2 ->System.out.println("Tuesday");
            case 3 ->System.out.println("Wednesday");
            case 4 ->System.out.println("Thursday");
            case 5 ->System.out.println("Friday");
            case 6 ->System.out.println("Saturday");
            case 7 ->System.out.println("Sunday");
            default -> System.out.println("Please input 1 to 7");

        }
    }
}
