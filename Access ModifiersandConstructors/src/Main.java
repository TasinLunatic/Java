class Employee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }

    public int getId() {
        return id;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Employee Tasin =new Employee();
       //Tasin.id=67;
       //Tasin.name="Hacker";[Throw an error during access private modifier]
        Tasin.setName("Hacker");
        System.out.println(Tasin.getName());
        Tasin.setId(245);
        System.out.println(Tasin.getId());
    }
}