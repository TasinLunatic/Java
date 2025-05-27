package Case_study5;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter full year: ");
        int year= sc.nextInt();

        System.out.print("Enter month as a number between 1 to 12: ");
        int month= sc.nextInt();

        printMonth(year,month);
    }
    public static void printMonth(int year,int month){
        System.out.print(month+" "+year);
    }

    public static void printMonthTitle(int year,int month){

    }
    public static void printMonthBody(int year,int month){

    }


}
