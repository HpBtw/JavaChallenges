package challenge1;

import javax.swing.*;

// Check if it's a leap or not leap year

public class Main {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Type a year to be checked"));

        JOptionPane.showMessageDialog(null, check(year));
    }

    public static String check(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return "It's a leap year";
        }
        return "It's not a leap year";
    }
}
