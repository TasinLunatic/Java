public class PS03 {
    public static void main(String[] args) {
        //Calculate the average mark from an array?
        float []marks ={77.5f,89.3f,55.65f,67.9f,56.56f};
        float sum=0;

        for (float element:marks){
            sum = sum+element;
        }
        System.out.println("The value of average is:"+sum/ marks.length);
    }
}
