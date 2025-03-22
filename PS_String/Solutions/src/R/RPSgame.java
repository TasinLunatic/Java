package R;
import java.util.Random ;
import java.util.Scanner;

public class RPSgame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = scanner.nextLine();

        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
        } else {
            System.out.println("You lose!");
                }


    }
}
