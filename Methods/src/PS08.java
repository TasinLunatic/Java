class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy.");
    }
    public void run(){
        System.out.println("Running");
    }
    public void fire(){
        System.out.println("Firing on the enemy.");
    }
}

public class PS08 {
    public static void main(String[] args) {
      //create a class for tommy for rockstar games capable of hitting,running,firing etc.
      Tommy player1 =new Tommy();
      player1.fire();
      player1.hit();
      player1.run();

    }
}
