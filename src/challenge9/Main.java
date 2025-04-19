package challenge9;

// receive a hh:mm:ss and converts to seconds

public class Main {
    public static void main(String[] args) {
        int hr = 2;
        int min = 10;
        int sec = 50;

        convSecs(hr, min, sec);
    }

    public static void convSecs(int hr, int min, int sec) {
        int mins = hr * 60 + min;
        int secs = mins * 60 + sec;

        System.out.println(secs);
    }
}
