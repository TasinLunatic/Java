import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks: ");
        int Physics = scan.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scan.nextInt() ;
        System.out.println("Enter your Math marks : ");
        int Math = scan.nextInt() ;
        System.out.println("Enter your Chemistry marks : ");
        int Chemistry = scan.nextInt() ;
        System.out.println("Enter your Biology marks : ");
        int Biology = scan.nextInt() ;
        System.out.println("Enter your ICT marks : ");
        int ICT = scan.nextInt() ;

        float percentage = ((Physics+English+Math+Chemistry+Biology+ICT)/500.0f)*100 ;

        System.out.println("Percentage : ");
        System.out.println(percentage);
    }
}
