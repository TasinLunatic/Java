public class Circle {
    double radius =1.0;

    Circle(){

    }
    Circle(double newRadius){
        this.radius=newRadius;
    }

    double getArea(){
        return radius * radius*3.1416;
    }
}
