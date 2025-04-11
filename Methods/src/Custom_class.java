public class Custom_class {
    public class Employee{
        int id;
        String name;
    }
    public static void main(String[] args) {
        System.out.println("This is our custom class!");
        Employee tasin = new Employee();
        tasin.id=12;
        tasin.name="TasinLunatic";
        System.out.println(tasin.id);
        System.out.println(tasin.name);
    }
}
