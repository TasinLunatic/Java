public class PS04 {
    public static void main(String[] args) {
        //Create a java program to add 2 matrices of size 2 X 3?

        int [][] mat1={{1, 2, 3},
                    {4, 5, 6}};
        int [][] mat2={{2, 2, 3},
                    {4, 6, 8}};
        int [][] result={{0,0,0},
                         {0,0,0}};

        for (int i=0;i< mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]=mat1[i][j]+mat2[i][j] ;

            }
        }
    }
}
