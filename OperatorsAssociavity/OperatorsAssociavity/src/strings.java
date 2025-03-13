import java.util.Locale;

public class strings {
    public static void main(String[] args) {
        String Name = "Tasin" ;
        System.out.println(Name);

        int value = Name.length();
        System.out.println(value);

        String lcase = Name.toLowerCase(Locale.ROOT);
        System.out.println(lcase);

        String ucase = Name.toUpperCase();
        System.out.println(ucase);

        String nontrimedString = "   T a s i n   ";
        System.out.println(nontrimedString);
        System.out.println(nontrimedString.trim());
    }
}
