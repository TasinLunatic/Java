package R;
import java.util.Scanner ;

public class SwitchCase {
    public static void main(String[] args) {
        int age;
        System.out.println("Please Enter your age : ");

        Scanner sc = new Scanner(System.in) ;
        age = sc.nextInt() ;

        if(age>56){
            System.out.println("You are experienced. ");
        } else if (age>46) {
            System.out.println("You are semi-experienced.");
        } else if (age>36) {
            System.out.println("You are beginner. ");

        }else {
            System.out.println("You are not experienced .");
        }
    }
}
