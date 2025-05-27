import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CountingMonitaryUnits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter an amount in double:");
        double amount =sc.nextDouble();

        int remainingAmount=(int)(amount*100);

        int numberOfDollars=remainingAmount/100;
        remainingAmount=remainingAmount%100;

        int numberOfQuarters=remainingAmount/25;
        remainingAmount=remainingAmount%25;

        int numberOfDimes=remainingAmount/10;
        remainingAmount=remainingAmount%10;

        int numberOfNickels=remainingAmount/5;
        remainingAmount=remainingAmount%5;

        int numberOfPennies=remainingAmount;

        System.out.println("Your amount "+amount+" consists of");
        System.out.println("Your amount "+numberOfDollars+" dollars");
        System.out.println("Your amount "+numberOfQuarters+" quarters");
        System.out.println("Your amount "+numberOfDimes+" dimes");
        System.out.println("Your amount "+numberOfNickels+" nickels");
        System.out.println("Your amount "+numberOfPennies+" pennies");
    }
}