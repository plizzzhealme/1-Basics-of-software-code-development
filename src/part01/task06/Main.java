package part01.task06;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter x and y coordinates");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(checkPoint(x, y));
    }

    private static boolean checkPoint(int x, int y) {
        return -2 <= x && x <= 2 && 0 <= y && y <= 4
               || -4 <= x && x <= 4 && -3 <= y && y <= 0;
    }
}