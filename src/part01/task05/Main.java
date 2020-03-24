package part01.task05;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter time in seconds");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println(convertTime(t));
    }

    private static String convertTime(int t) {
        int h = t / 3600;
        int m = t % 3600 / 60;
        int s = t % 60;
        return String.format("%02dч %02dм %02dс", h, m, s);
    }
}