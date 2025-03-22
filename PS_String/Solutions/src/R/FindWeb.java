package R;

import java.util.Scanner;

public class FindWeb {
    public static void main(String[] args) {
        //Write a java program to find out website by url.
        Scanner sc = new Scanner(System.in);
        String website =sc.next();

        if (website.endsWith(".org")){
            System.out.println("This is an organizational website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an indian website");
        } else if (website.endsWith(".bd")) {
            System.out.println("This is a Bangladeshi website");
        }else if (website.endsWith(".cn")){
            System.out.println("This is an chinese website");
        }
    }
}
