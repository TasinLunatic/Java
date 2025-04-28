class square{
    int side;
    public  int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}


public class PS07 {
    public static void main(String[] args) {
    // create a class square with a method to initialized its side,area,perimeter etc.
        square sq=new square();
        sq.side =3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
