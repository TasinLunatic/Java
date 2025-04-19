public class CirclewithStaticMembers {
    double radius;
    static int numberOfObjects = 0;

    CirclewithStaticMembers(){
        numberOfObjectsfObjects++;
        radius=1;
    }
    CirclewithStaticMembers(){
        numberOfObjectsfObjects++;
        this.radius = newRadius;
    }

    static int getNumberOfObjects(){
        return numberOfObjectsfObjects;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
}
