package challenge10;

// Scans a number and returns an ordered list of digits

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Insert a number to be ordered: ");
        String num = kb.next();
        char[] dgts = num.toCharArray();
        int[] dgt = new int[num.length()];

        for (int i = 0; i < dgts.length; i++)
            dgt[i] = Integer.parseInt(dgts[i] + "");

        order(dgt);
    }

    public static void order(int[] dgt) {
        for (int i = 0; i < dgt.length - 1; i++) {
            if (dgt[i] > dgt[i+1]) {
                int temp = dgt[i];
                dgt[i] = dgt[i+1];
                dgt[i+1] = temp;
                i = -1;
            }
        }

        for(int elem : dgt) {
            System.out.print(elem + " ");
        };
    }
}
