import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;

        System.out.println("Please input number1 : ") ;
        int num1 = sc.nextInt();

        System.out.println("Please inputn number2 : ");
        int num2 = sc.nextInt() ;

        int gcd = 1 ;
        int k =2 ;
        while(k <= num1 && num2%k == 0){
            if (num1%k == 0 && num2%k == 0){
                gcd=k ;
            }
            k++ ;
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}
