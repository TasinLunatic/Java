import javax.naming.PartialResultException;

public class Var_Arguments {
    /*static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }*/
    //Shortest Way
    static int sum(int...arr){
        int result=0;
        for (int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs Tutorial!");
        System.out.println("The sum of 4 and 5 is:"+sum(4,5));
        System.out.println("The sum of 2,3,4 and 8 is:"+sum(2,3,4,8));
        System.out.println("The sum of 9 and 14 is:"+sum(9,14));
    }
}
