public class PS07 {
    public static void main(String[] args) {
        //Write a java program to find whether an array is sorted or not?
        boolean isSorted = true;
        int []arr={1,2,3,4,5};


        for (int i=0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is Sorted.");
        }else {
            System.out.println("The Array is not Sorted.");
        }
    }
}
