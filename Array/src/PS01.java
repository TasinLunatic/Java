public class PS01 {
    public static void main(String[] args) {
        //Create an Array of 5 floats and calculate their sum
        float []marks ={77.5f,89.3f,55.65f,67.9f,56.56f};
        float sum=0;

        for (float element:marks){
            sum = sum+element;
        }
        System.out.println("The sum of the marks is:"+sum);
    }
}
