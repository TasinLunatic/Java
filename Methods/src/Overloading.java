public class Overloading {
    static void change(int a){
        a=98;
    }
    static  void change2(int []arr){
        arr[0]=98;
    }
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static  void foo(int a){
        System.out.println("Good Morning "+ a + " bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning "+ a + " bro!");
        System.out.println("Good Morning "+ b + " bro!");
    }
    static void telljoke(){
        System.out.println("I invented a new word!\n"+"plagiarism!");
    }
    public static void main(String[] args) {
        //telljoke();
        //case 1: changing the integer
       // int[]marks={55,67,78,98,67};
        //int x=45;
        //change(x);
        //System.out.println("The value of x after running is "+ x);

        //case 2: changing the Array
        int[]marks={55,67,78,98,67};

        change2(marks);
        System.out.println("The value of x after running is: "+ marks[0]);

        //Method Overloading
        foo( );
        foo(400);
        foo(200,400);
        //Arguments are actual

    }


}
