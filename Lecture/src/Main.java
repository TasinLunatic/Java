import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter an integer") ;

        int number = sc.nextInt();

        if (number %5== 0){
            System.out.println("Hi Five");
        }
        if (number %2 ==0){
            System.out.println("Hello");
        }
    }
}