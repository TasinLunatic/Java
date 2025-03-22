package R;
import java.util.Scanner;

public class PSonConAndSwitch {
    public static void main(String[] args) {
        //Prob1. What will the output of the program?
        /* int a=10;
        if(a==11){
            System.out.println("I am 11 !");
        }else {
            System.out.println("I am not 11 .");
        }*/

        //Prob2. Write a program to find out whether a student pass or fail
        //if it requires total 40% and at least 33% each subject to pass.Assume 3 subjects and take marks as an input from the user.
         byte m1,m2,m3 ;
         Scanner sc =new Scanner(System.in) ;
         System.out.println("Enter your Physics mark: ");
         m1 =sc.nextByte();

         System.out.println("Enter your Chemistry mark: ");
         m2 =sc.nextByte() ;

         System.out.println("Enter your Math mark: ");
         m3 = sc.nextByte() ;

         float avg = (m1+m2+m3)/3.0f ;
         System.out.println("Your Overall percentage is : "+avg);

         if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
             System.out.println("Congratulation, You have been promoted.");
         }else {
             System.out.println("Sorry! You have not promoted.");
         }

    }
}
