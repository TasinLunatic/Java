import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10) ;

        Scanner sc =new Scanner(System.in) ;

        System.out.println("Please Guess :");
        int guess = sc.nextInt();

        if (guess == num){
            System.out.println("You are win.");
        } else if (guess < num) {
            System.out.println(guess + "is too small,Please try again:");
            guess = sc.nextInt();
        } else if (guess > num) {
            System.out.println(guess + "is too big ,Please try again:");
            guess = sc.nextInt();
        }
    }
}
