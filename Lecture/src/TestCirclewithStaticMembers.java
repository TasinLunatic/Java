public class TestCirclewithStaticMembers {
    public static void main(String[] args) {
        System.out.println("The number of circle objects:"+ CirclewithStaticMembers.numberOfObjects);

        CirclewithStaticMembers c1 =new CirclewithStaticMembers() ;

        System.out.println("After create c1,the number of object is:"
                + CirclewithStaticMembers.numberOfObjects);

        CirclewithStaticMembers c2=new CirclewithStaticMembers(10);

        System.out.println("After create c2,the number of object is:"
                + CirclewithStaticMembers.getNumberOfObjects());
    }
}
