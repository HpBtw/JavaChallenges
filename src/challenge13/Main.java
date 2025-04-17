package challenge13;

import javax.swing.*;

// Set a range of numbers and return a list of evens

public class Main {
    public static void main(String[] args) {
        int stt = Integer.parseInt(JOptionPane.showInputDialog("Set the range's start" +
                "\n(Maximum range length: 60 (lack of collections)"));
        int end = Integer.parseInt(JOptionPane.showInputDialog("Set the range's end"));

        JOptionPane.showMessageDialog(null, evens(stt, end));
    }

    public static String evens(int stt, int end) {
        int[] evens = new int[31];
        int i = 0;
        String aux = "";

        do {
            if (stt % 2 == 0) {
                evens[i] = stt;
                i++;
            }
            stt++;
        } while (stt <= end);

        for (int even : evens) {
            if (even != 0)
                aux += even + " ";
            else
                aux += "";
        }
        return aux;
    }
}