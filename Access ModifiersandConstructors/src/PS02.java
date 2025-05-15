import java.awt.*;

class rectangle{
    private int length;
    private int breadth;

    public rectangle(){
        this.length=4;
        this.breadth=5;
    }

    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

public class PS02 {
    public static void main(String[] args) {
       //Overload a constructor used to initialize a rectangle length 4 and breadth 5 for using custom parameters?
        rectangle r=new rectangle();

        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}


