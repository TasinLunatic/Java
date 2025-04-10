public class Recursion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        //A function of java can call itself such calling of function  itself is called recursion.
        int n=4;
        System.out.println("The value of factorial n:"+factorial(n));
    }
}
