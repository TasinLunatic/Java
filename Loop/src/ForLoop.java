import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        //Write a program to print n odd number using for loop?
        //2n+1 =odd number=1,3,5,7....
        int n=5;

        for (int i1=0;i1<50;i1++){
            System.out.println(2*i1+1);
        }

        //Decrement of for loop
        for (int i2=5;i2>0;i2--){
            System.out.println(i2);
        }
    }
}
