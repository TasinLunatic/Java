class Employee1{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName(){
        return name;
    }

    public void  setName(String n){
        name=n;
    }
}




public class PS06 {

    public static void main(String[] args) {
        //create a class employee with following properties and method
        //salary,get salary,name,get name,set name

        Employee1 tasin=new Employee1();
        tasin.setName("bongodevTasin");
        tasin.salary=20000000;
        System.out.println("Salary:"+tasin.getSalary());
        System.out.println(tasin.getName());

    }
}
