public class PS03 {
    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }
    public static void main(String[] args) {
        //Write a recursive functions to calculate the sum of n natural number?
        int c=sumRec(4);
        System.out.println(c);
    }
}
