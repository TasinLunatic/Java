import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        //Write a program to print n odd number using for loop?
        //2n+1 =odd number=1,3,5,7....
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int i= sc.nextInt();

        for (int i1=0;i<50;i++){
            System.out.println(2*i+1);
        }
    }
}
