public class PS01 {
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d =%d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        //write a java method to print multiplication table of number n?
        multiplication(7);
    }
}
