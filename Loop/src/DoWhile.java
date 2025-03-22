import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //do while first execute code then check true or false

        int a=0;

        do {
            System.out.println(a);
            a++;
        }while (a<5);

        //write a program using do while loop to print first n natural number?
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();

        int i =1;
        System.out.println("The first " + n + " natural numbers are:");

        do {
            System.out.println(i+" ");
            i++;
        }while (i<=n);
    }
}
