public class PS06 {
    public static void main(String[] args) {
        //Write a java program to find out maximum number?
        int []arr={1,2,3,4,5};
        int max=0;

        for (int e:arr){
            if (e>max){
                max=e;

            }
        }
        System.out.println("The maximum value of an array is : "+max);
    }
}
