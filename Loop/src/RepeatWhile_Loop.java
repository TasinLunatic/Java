public class RepeatWhile_Loop {
    public static void main(String[] args) {
        //Repeat 5 using While Loop?
        int n=5;
        //What is factorial n=n*n-1*n-2....1
        //5!=5*4*3*2*1=120

        int i =1;
        int factorial=1;

        while (i<n){
          factorial *=i;
          i++;

        }
        System.out.println(factorial);

    }
}
