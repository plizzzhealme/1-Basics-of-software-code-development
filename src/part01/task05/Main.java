package part01.task05;

import static cleaner.Cleaner.getPositiveInt;

class Main {
    public static void main(String[] args) {
        int t;
        String time;

        System.out.println("Enter time in seconds");
        t = getPositiveInt();
        time = convertTime(t);
        System.out.println(time);
    }

    private static String convertTime(int t) {
        int h = t / 3600;
        int m = t % 3600 / 60;
        int s = t % 60;
        return String.format("%02dч %02dм %02dс", h, m, s);
    }
}