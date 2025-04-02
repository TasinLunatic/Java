public class MultplicationTable {
    public static void main(String[] args) {
        //Write a program to calculate the sum of the numbers accuring in  the multiplication table of 8?
        int n=8;
        int sum=0;

        for (int i=1;i<=2;i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
}
