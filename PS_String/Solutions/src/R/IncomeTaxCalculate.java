package R;

import java.util.Scanner;

public class IncomeTaxCalculate {
    public static void main(String[] args) {
        //Calculate income tax paid by an employee to the govt as per the slabs mention below:
        // INCOME  SLABS   TAX
        // 2.5L  - 5.0L     5%
        // 5.0L  - 10.0L    20%  &   Above to 10.0L    30%
        //There is no tax below 2.5L.Take input amount as an input from the user.
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter your income in lacs per annual : ");

        float tax =0;
        float income = sc.nextFloat();

        if(income<2.5f){
            tax =tax + 0 ;
        }
        else if (income > 2.5f && income < 5f) {
            tax = tax +0.05f*(income - 2.5f);
            
        }
        else if (income>5f && income<10f) {
            tax =tax +0.05f*(5.0f-2.5f);
            tax = tax +0.2f*(income - 2.5f);
        }
        else if (income>10.0f) {
            tax = tax +0.05f*(5.0f - 2.5f);
            tax = tax +0.02f*(10.0f - 5f);
            tax = tax +0.3f*(income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is:"+tax);
    }
}
