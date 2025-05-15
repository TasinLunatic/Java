class cylinder{
    private int radius;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}


public class PS01 {
    public static void main(String[] args) {
        //Create a cylinder class and use getters and setters to sets its radius and height?

        cylinder myCylinder =new cylinder();
        myCylinder.setHeight(45);
        int h=myCylinder.getHeight();
        System.out.println("Height:"+h);

        myCylinder.setRadius(33);
        int r=myCylinder.getRadius();
        System.out.println("Radius:"+r);

    }
}
