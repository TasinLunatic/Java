import java.util.Scanner;

public class Takinginput{
    public static void main(String[]args){
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt() ;
 //       boolean b1= sc.hasNext();
 //       System.out.println(b1);
 //       String str = sc.next();
//        System.out.println(str);
//        float a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
 //       float b = sc.nextInt();

         int sum = a+b;
//        float sum = a+b;
        System.out.println("The sum of this numbers is : ");
        System.out.println(sum);
    }
}
