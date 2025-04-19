public class CirclewithStaticMembers {
    double radius;
    static int numberOfObjects = 0;

    CirclewithStaticMembers(){
        numberOfObjects++;
        radius=10;
    }

    CirclewithStaticMembers(double newRadius){
        numberOfObjects++;
        this.radius = newRadius;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
}
