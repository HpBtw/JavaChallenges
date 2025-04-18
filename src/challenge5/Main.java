package challenge5;

import java.util.Scanner;

// Draw a right triangle with asterisks from a int base

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Insert the right triangle's base: ");
        int base = kb.nextInt();

        drawRt(base);
    }

    public static void drawRt(int base) {
        int[] designer = new int[base];
        System.out.println();

        for (int i = 1; i <= designer.length; i++) {
            int ext = 0;
            while (ext != i) {
                System.out.print("*");
                ext++;
            }
            System.out.println();
        }
    }
}
