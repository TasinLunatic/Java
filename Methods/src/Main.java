//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=6;
        int b=7;
        int c;
        c=logic(a,b);
        int a1=2;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
       System.out.println(c);
        System.out.println(c1);
    }
}