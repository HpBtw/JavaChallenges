package challenge9;

// Scans a hh:mm:ss time and converts to seconds

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Insert time (hh:mm:ss): ");
        String time = kb.next();
        if (time.length() != 8) {
            System.err.println("Invalid time, use hh:mm:ss" +
                    "\nexample: 02:10:05");
            return;
        }

        char[] c = time.toCharArray();
        int hr = Integer.parseInt(c[0] + "" + c[1]);
        int min = Integer.parseInt(c[3] + "" + c[4]);
        int sec = Integer.parseInt(c[6] + "" + c[7]);

        convSecs(hr, min, sec);
    }

    public static void convSecs(int hr, int min, int sec) {
        int mins = hr * 60 + min;
        int secs = mins * 60 + sec;

        System.out.println(secs + " secs");
    }
}
