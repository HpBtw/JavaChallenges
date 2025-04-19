package challenge8;

// Receive a text and encrypt them to their respective positions in the alphabet

public class Main {
    public static void main(String[] args) {
        String text = "macaco"; // insert the text to be encrypted here
        code(text);
    }

    public static void code(String text) {
        int[] code = new int[text.length()];
        char[] c = text.toLowerCase().toCharArray();

        for (int i = 0; i < code.length; i++) {
            code[i] = (int) c[i] - 96;
        }

        for (int elem : code) {
            System.out.print(elem + " ");
        }
    }
}
