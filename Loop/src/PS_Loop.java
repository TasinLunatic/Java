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
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}
