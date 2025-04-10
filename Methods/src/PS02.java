public class PS02 {
    static void pattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Write a program to print the following pattern
        //*
        //**
        //***
        //****
        pattern(4);
    }
}
