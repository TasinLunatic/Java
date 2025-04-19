public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Circle yourCircle =new Circle(100);

        System.out.println("Radius of my Circle is:"+myCircle.radius);
        System.out.println("Area of my Circle is:"+myCircle.getArea());

        //Print the radius and area of your circle
    }
}
