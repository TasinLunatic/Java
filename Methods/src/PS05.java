public class PS05 {
    static void pattern_Rec(int n){
        if (n>0){
            pattern_Rec(n-1);
            for (int i=0;i<n;i++){
                System.out.println("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //using 2 recursive
        pattern_Rec(9);
    }
}
