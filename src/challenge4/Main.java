package challenge4;

// Function to receive an Int and return alphabet letters until that position (ex: 4 = return a, b, c, d)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Insert a number to return letters (max 26): ");
        int num = kb.nextInt();

        char[] letters = retLetters(num);

        for (char elem : letters) {
            if (elem == '\u0000') // erases default char values output
                elem = ' ';
            System.out.print(elem + " ");
        }
    }

    public static char[] retLetters(int num) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] c = alphabet.toCharArray();
        char[] letters = new char[26];

        for (int i = 0; i < num; i++) {
            letters[i] = c[i];
        }
        return letters;
    }
}
