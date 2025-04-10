public class Recursion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }else {
            int product=1;
            for (int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        //A function of java can call itself such calling of function  itself is called recursion.
        int n=4;
        System.out.println("The value of factorial n:"+factorial(n));
        System.out.println("The value of factorial n is: "+factorial_iterative(n));
    }
}
