public class PS_Loop {
    public static void main(String[] args) {
        //1.Write a program to print the following pattern?
        //  * * * *
        //  * * *
        //  * *
        //  *
        int n=4;

        for (int i=n;i>0;i--){

            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }

        //Write a program to sum first n even numbers using while loops?
        int sum =0;
        int n1=3;

        for (int i1=0;i1<n1;i1++){
            sum = sum + (2*i1);

        }
        System.out.println("Sum of even number is : ");
        System.out.println(sum);

        //Write a program to print multiplication table of a given number n.
        int n2=5;

        for (int i2=1;i2<=10;i2++){
            System.out.printf("%d X %d = %d\n",n2,i2,n2*i2) ;
        }
    }
}
