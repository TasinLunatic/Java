package R;
import java.util.Scanner ;

public class SwitchCase {
    public static void main(String[] args) {
        int age;
        Scanner sc =new Scanner(System.in) ;
        System.out.println("Please Enter your Salary :");
        age = sc.nextInt();

        switch (age){
            case 22500:
                System.out.println("Starting salary ! ");
                break;
            case 25000:
                System.out.println("Average salary ^_^ ");
                break;
            case 45000:
                System.out.println("Good salary for live in . ");
                break;
            case 65000:
                System.out.println("Promoted salary for Standard lifestyle . ");
                break;
            default:
                System.out.println("Work and practise hard for a better life.\t");
        }
        System.out.println("With work you also need to enjoy every situation.");
    }
}
