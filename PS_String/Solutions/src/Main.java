import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Tasin" ;
        System.out.println(name);
        String lcase = name.toLowerCase(Locale.ROOT) ;
        System.out.println(lcase);
        String ucase = name.toUpperCase() ;
        System.out.println(ucase);
        System.out.println(name.replace("s","r"));
        System.out.println(name.replace("as","ur"));
    }
}