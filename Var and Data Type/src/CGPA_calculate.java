import java.util.Arrays;

public class CGPA_calculate {
    public static void main(String[]args){
        float math=97;
        float chemistry =86;
        float physics =88;
        float ICT =78;

        float sum = math+chemistry+physics+ICT;
        float CGPA= (sum)/4;
        System.out.println(CGPA);

    }
}
