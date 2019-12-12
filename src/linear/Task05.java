package linear;

import java.util.Scanner;

class Task05 {
    private static final String INPUT_MSG = "Enter time in seconds:";
    private static final String OUTPUT_MSG = "%02dч %02dм %02dс";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int h = t / 3600;
        int m = t % 3600 / 60;
        int s = t % 60;
        System.out.printf(OUTPUT_MSG, h, m, s);
    }
}
