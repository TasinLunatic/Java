import java.util.Scanner;

public class Classwork02 {
    public static void main(String[] args) {

                double xCenter = 0;
                double yCenter = 0;
                double width = 10;
                double height = 5;
                Scanner scanner = new Scanner (System.in);

                //Prompt the user to enter a point.

                System.out.print("Enter a point with two coordinates : ");
                double xCoordinate = scanner.nextDouble();
                double yCoordinate = scanner.nextDouble();
                if(xCoordinate <= xCenter + width*0.5
                        &&
                        xCoordinate >= xCenter - width*0.5
                        &&
                        yCoordinate <= yCenter + height*0.5
                        &&
                        yCoordinate >= yCenter - height*0.5)

                    System.out.print("Point (" + xCoordinate + ","
                            + yCoordinate + ") is in the rectangle.");
                else
                    System.out.print("Point (" + xCoordinate + ","
                            + yCoordinate + ") is not in the rectangle.");

                scanner.close();

    }
}
