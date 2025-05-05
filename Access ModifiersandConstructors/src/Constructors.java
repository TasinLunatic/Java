class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(){
        id=45;
        name="hacker!";
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }

    public int getId() {
        return id;
    }
}

public class Constructors {
    public static void main(String[] args) {
      MyEmployee tasin =new MyEmployee();
      //tasin.setName("hacker");
      //tasin.setId(440);
      System.out.println(tasin.getId());
      System.out.println(tasin.getName());
    }
}
