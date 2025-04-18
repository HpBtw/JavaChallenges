package challenge7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("How many grades are there for each student?");
        int quantity = kb.nextInt();

        String[] est = new String[] {"John", "Mary", "Mathew", "David", "Ed"}; // If u want to change or add names, rewrite them or write new ones between these brackets using "name"
        double[][] grades = new double[est.length][quantity];

        for (int i = 0; i < est.length; i++) {
            System.out.println();
            for (int j = 0; j < quantity; j++) {
                System.out.print("Insert " + est[i] + "'s grade " + (j+1) + ": ");
                grades[i][j] = kb.nextDouble();
            }
        }

        System.out.println(calcAvg(est, grades, quantity));
    }

    public static String calcAvg(String[] est, double[][] grades, int quantity) {
        String aux = "";

        for (int i = 0; i < est.length; i++) {
            aux += "\n" + est[i];
            double avg = 0;
            for (int j = 0; j < quantity; j++) {
                avg += grades[i][j];
            }
            aux += "\nAverage: " + avg / quantity;
            aux += "\nSituation: ";
            if (avg / quantity >= 6) // change the number according to the desired average
                aux += "Approved\n";
            else
                aux += "Failed\n";
        }

        return aux;
    }
}
