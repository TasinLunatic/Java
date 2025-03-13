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

        System.out.println(Name.substring(2));
        System.out.println(Name.substring(1,3));

        System.out.println(Name.replace("T","Y"));

        System.out.println(Name.startsWith("Tas"));
        System.out.println(Name.endsWith("Tas"));
        System.out.println(Name.charAt(2));
        System.out.println(Name.indexOf("s"));

        String Modifiedname = "Yasin" ;
        System.out.println(Modifiedname.indexOf("sin22"));
        System.out.println(Modifiedname.indexOf("s",2));
        System.out.println(Modifiedname.lastIndexOf("sin",3));

    }
}
