//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a =6*5-34/2;
        System.out.println(a);
        /*
          Highest precedence goes to * and /
          =30-34/2
          =30-17
          =13(Precedence)
         */
        //precedence and associativity
        int b =60/5-34*2;
        System.out.println(b);
        /*
           =12-34*2
           =12-68
           =-56  (Left to right --> Associativity)
         */
        //Quiz
        int x=6;
        int y=8;
        int z=9;
        int k=x*y-(4*y*z)/(x*2);
        System.out.println(k);
    }
}