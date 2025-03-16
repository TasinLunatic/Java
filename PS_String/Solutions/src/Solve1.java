import java.util.Locale;

public class Solve1 {
    public static void main(String[] args) {
        //Write a java program to convert string in lower case?
        String name ="Pablo Escober" ;
        String lcase = name.toLowerCase(Locale.ROOT) ;
        System.out.println(name);

        //Write a java program to replace space to underscore ?
        String text = "Hello Boys." ;
        text = text.replace(" ","_") ;
        System.out.println(text);

        //Write a java program to fill in a letter template like this
        // letter = "Dear <|name|> , thanks a lot."
        //Replace name with a string name..?
        String letter = "Dear <|name|>,Thanks a lot.";
        letter = letter.replace("<|name|>","Tasin") ;
        System.out.println(letter);


    }
}
