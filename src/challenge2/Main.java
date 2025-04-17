package challenge2;

// Create a method that returns the results of a quadratic equation

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Insert 'a': ");
        double a = kb.nextDouble();
        if (a == 0) {
            System.out.println("Invalid value");
            return;
        }
        System.out.print("Insert 'b': ");
        double b = kb.nextDouble();
        System.out.print("Insert 'c': ");
        double c = kb.nextDouble();

        double delta = calcDelta(a, b, c);
        System.out.println(calcResults(a, b, c, delta));
    }

    public static double calcDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static String calcResults(double a, double b, double c, double delta) {
        double x1 = (-b + Math.sqrt(delta)) / 2 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2 * a;
        String aux = "X1 = " + x1 + "\nX2 = " + x2 + "\nDelta = " + delta;

        return aux;
    }
}
