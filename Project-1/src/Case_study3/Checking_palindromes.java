package Case_study3;

import java.util.Scanner;

public class Checking_palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean isPalindrome = true;
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is palindrome: " + isPalindrome);
        sc.close();
    }
}
