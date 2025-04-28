class Tom{
    private String name;
    private int health;
    private int stamina;
    private int ammo;


    public Tom(String name) {
        this.name = name;
        this.health = 100;
        this.stamina = 100;
        this.ammo = 30;
    }

    public void run() {
        if (stamina > 0) {
            stamina -= 10;
            System.out.println(name + " is running. Stamina left: " + stamina);
        } else {
            System.out.println(name + " is too tired to run.");
        }
    }

    public void hit() {
        System.out.println(name + " throws a punch!");
    }

    public void fire() {
        if (ammo > 0) {
            ammo--;
            System.out.println(name + " fires a shot! Ammo left: " + ammo);
        } else {
            System.out.println(name + " has no ammo left!");
        }
    }

    public void reload(int bullets) {
        ammo += bullets;
        System.out.println(name + " reloaded. Ammo now: " + ammo);
    }

    public void rest() {
        stamina = 100;
        System.out.println(name + " is resting. Stamina restored.");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            System.out.println(name + " is dead.");
        } else {
            System.out.println(name + " took " + damage + " damage. Health now: " + health);
        }
    }

    public void displayStatus() {
        System.out.println("Status of " + name + " => Health: " + health + ", Stamina: " + stamina + ", Ammo: " + ammo);
    }
}



public class AdvPS08 {

    public static void main(String[] args) {

        Tom tommy = new Tom("tommy");

        tommy.displayStatus();
        tommy.run();
        tommy.hit();
        tommy.fire();
        tommy.fire();
        tommy.takeDamage(20);
        tommy.rest();
        tommy.reload(15);
        tommy.displayStatus();
    }
}
