package R;

public class RL_operator {
    public static void main(String[] args) {
        System.out.println("For Logical And...");
        boolean a =true;
        boolean b =true ;
        boolean c =true ;
        if(a && b && c){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        System.out.println("For Logical Or...");
        boolean a1 =true;
        boolean b1 =false ;
        boolean c1 = false ;
        if(a1 || b1 ||c1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
