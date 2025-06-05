package Case_study6;

import java.util.Random;

class RandomCharacter {
    static char getRandomLowerCaseLetter() {
        return (char) ('a' + new Random().nextInt(26));
    }
}

public class LetterCounter {
    public static void main(String[] args) {
        int[] counts = new int[26];
        char[] letters = new char[100];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = RandomCharacter.getRandomLowerCaseLetter();
            counts[letters[i] - 'a']++;
        }

        System.out.println("Generated Letters: " + new String(letters));
        System.out.println("Letter Counts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.printf("%c: %d%n", (char) (i + 'a'), counts[i]);
            }
        }
    }
}