package challenge3;

// Method that sums 2 multidimensional arrays

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Insert the m.d. array size (ex: 2 for 2x2 array; 3 for 3x3 array): ");
        int size = kb.nextInt();

        int[][] m1 = new int[size][size];
        int[][] m2 = new int[size][size];

        System.out.println("Fill m.d. Array 1:");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.println("Insert coord (" + i + "," + j + ")");
                m1[i][j] = kb.nextInt();
            }
        }

        System.out.println("\nm.d. Array 1:");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("----------------\n\nFill m.d. Array 2:");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.println("Insert coord (" + i + "," + j + ")");
                m2[i][j] = kb.nextInt();
            }
        }

        System.out.println("\nm.d. Array 2:");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }
        sumArrays(m1, m2);
    }

    public static void sumArrays(int[][] m1, int [][] m2) {
        int[][] mSum = new int[m1.length][m1.length];

        System.out.println("----------------\nSum of arrays:");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                mSum[i][j] = m1[i][j] + m2[i][j];
                System.out.print(mSum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
