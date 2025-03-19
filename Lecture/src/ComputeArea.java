import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        System.out.println("Please enter the radius: ");

        Scanner sc = new Scanner(System.in) ;

        int radius = sc.nextInt();

        if (radius>=0){
            double area=radius*radius*3.1416 ;
            System.out.println("The area for a circle of radius"+radius+"is"+area);
        }else {
            System.out.println("The radius is negative,please again");
        }
    }
}
