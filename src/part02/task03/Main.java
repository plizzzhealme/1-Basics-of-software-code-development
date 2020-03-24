package part02.task03;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter the coordinates");
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        if (isCollinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("These points are collinear");
        } else {
            System.out.println("These points aren't collinear");
        }
    }

    private static boolean isCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (x1 - x3) * (y2 - y3) == (x2 - x3) * (y1 - y3);
    }
}