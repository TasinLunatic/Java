public class Var_Arguments {
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs Tutorial!");
        System.out.println("The sum of 4 and 5 is:"+sum(4,5));
        System.out.println("The sum of 2,3,4 and 8 is:"+sum(2,3,4,8));
    }
}
