class  trainer{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is"+id);
        System.out.println("and my name is"+name);
    }
}





public class Custom_class {

    public static void main(String[] args) {
        System.out.println("This is our custom class!");

        trainer tasin = new trainer();//instantiating a new Employee object.
        tasin.id=12;
        tasin.name="tasinLunatic";
        //System.out.println(tasin.id);
        //System.out.println(tasin.name);
        tasin.printDetails();
    }
}
