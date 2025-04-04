public class Ps02 {
    public static void main(String[] args) {
        float []marks ={77.5f,89.3f,55.65f,67.9f,56.56f};
        float num=55.65f;
        boolean isInArray=false;

        for (float element:marks){
            if (num==element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is in the Array");
        }
        else {
            System.out.println("The value is not in the Array");
        }

    }

}
