package Case_study5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2012): ");
        int year = scanner.nextInt();

        System.out.print("Enter month as number between 1 and 12: ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
            return;
        }

        displayCalendar(year, month);

        scanner.close();
    }

    public static void displayCalendar(int year, int month) {
        YearMonth yearmonth = YearMonth.of(year, month);
        LocalDate firstOfMonth = yearmonth.atDay(1);
        DayOfWeek firstDayOfWeek = firstOfMonth.getDayOfWeek();

        System.out.println("\n---------------------------");
        System.out.printf("          %s %d%n", yearmonth.getMonth(), year);
        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDayValue = firstDayOfWeek.getValue();
        int spaces = 0;
        if (startDayValue == 7) {
            spaces = 0;
        } else {
            spaces = startDayValue;
        }

        for (int i = 0; i < spaces; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= yearmonth.lengthOfMonth(); day++) {
            System.out.printf("%3d ", day);

            if (LocalDate.of(year, month, day).getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
        }
        System.out.println("\n---------------------------");
    }

}
