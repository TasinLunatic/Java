import java.util.Random;
import java.util.Scanner;

public class QA01 {
    public static void main(String[] args) {
        //Rock,paper,Scissor game
        Scanner  sc =new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for paper,2 for scissor:");
        int userInput= sc.nextInt();

        Random random=new Random();
        int ComputerInput=random.nextInt();

        if (userInput==ComputerInput){
            System.out.println("Draw");
        } else if (userInput==0 && ComputerInput==2 || userInput==1 && ComputerInput==0 || userInput==2 && ComputerInput==1) {
            System.out.println("You win");
        }else {
            System.out.println("Computer  Win!");
        }


    }
}
