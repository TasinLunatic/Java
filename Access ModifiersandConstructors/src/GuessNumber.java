import java.util.Scanner;
import java.util.Random;


public class GuessNumber {
    public static void main(String[] args) {
        //Create a class which allows guess the number?
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");


    }
}
