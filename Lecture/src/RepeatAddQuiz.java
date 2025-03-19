import java.util.Scanner;

public class RepeatAddQuiz {
    public static void main(String[] args) {
        int num1 = (int) (Math.random()*10) ;
        int num2 = (int)(Math.random()*10) ;

        Scanner sc =new Scanner(System.in) ;

        System.out.println("What is " + num1 + " + " + num2 + "?");
        int answer = sc.nextInt();

        while (num1+num2 !=answer){
            System.out.println("Wrong answer, What is " + num1 + "+" + num2 + "?");
            answer = sc.nextInt();
        }
        System.out.println("You got it .");
    }
}
