import java.util.Scanner;

public class Classwork5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The amount invested: ");

        double investmentAmount = sc.nextDouble();

        System.out.println("Annual interest rate: ");
        double annualInterestRate = sc.nextDouble();

        double monthlyInterestRate = annualInterestRate/100/12;

        System.out.println("Years future value");

        for (int years=1; years<=30;years++){
            double futureValue = futureInvestmentValue(investmentAmount,monthlyInterestRate,years);
            System.out.printf("%-8d%.2f%n",years,futureValue);
        }
        sc.close();

    }
    public static double futureInvestmentValue(double investmentAmount,double monthlyInterestRate,int years){
        return investmentAmount*Math.pow(1+monthlyInterestRate,years*12);
    }
}
