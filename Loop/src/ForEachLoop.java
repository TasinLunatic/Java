public class ForEachLoop {
    public static void main(String[] args) {
        //Connected with an Array file

        int [] marks ={49,98,87,76,89};
        System.out.println(marks.length);
        //Display the Array in naive way
        System.out.println("Display in naive way:");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Display the Array by using for loop
        System.out.println("Display using for loop:");
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        //In reverse order
        System.out.println("Display the marks in reverse order:");
        for (int i= marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        //Using for-each loop
        System.out.println("Display the marks by using for-each loop:");
        for (int element:marks){
            System.out.println(element);
        }
    }
}
