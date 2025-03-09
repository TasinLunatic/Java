import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = sc.nextInt();


        double monthlyInterestRate = annualInterestRate / 1200;


        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);


        System.out.printf("Accumulated value is %.2f\n", futureInvestmentValue);


    }
}
