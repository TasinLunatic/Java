package abstract_class;

public class circle1 extends abstract_class.TestGeoObj1{
    private  double radius;
    public circle1(){

    }


public circle1(double radius,String color,boolean filled) {
        super(color,filled);
        this.radius=radius;
  }
  public double getRadius(){
        return radius;
  }

  public void setRadius(double radius){
        this.radius=radius;
  }

  public void getDiameter(){
        return this.radius*2;
  }

}
