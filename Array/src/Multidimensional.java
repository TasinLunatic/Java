public class Multidimensional {
    public static void main(String[] args) {
        int []marks; //1D Array
        int [][]flat ;//2D Array
        //String [][][]arr=new String[1][2][4] 3D Array

        int [][]flats =new int[2][3];

        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        System.out.println("Printing 2D Array:");
        for (int i=0;i< flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

    }
}
