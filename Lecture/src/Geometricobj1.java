import java.util.Date;

public abstract class Geometricobj1 {
    private String color;
    private boolean filled;
    private Date datecreated;

    public Geometricobj1(){
        datecreated=new Date();
    }

    public Geometricobj1(String color, boolean filled){
        this.color=color;
        this.filled=filled;
        datecreated=new Date();

    }
    public abstract double getArea();
    public abstract double getPremier();

    public String getColor(){
        return color;
    }

    public void  setColor(String color){

    }
    public void getDiameter(){

    }

}
