public class BreakandContinue {
    public static void main(String[] args) {
        //break and continue using loops!
        for(int i=1;i<5;i++){
            System.out.println(i);
            System.out.println("Java is amazing");

            if (i==2){
                System.out.println("End the loop!");
                break;
            }
        }

        for(int i=1;i<50;i++){

            if (i==2){
                System.out.println("End the loop!");
                continue;
            }

            System.out.println(i);
            System.out.println("Java is amazing");
        }
    }
}
