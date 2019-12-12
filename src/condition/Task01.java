package condition;

import java.util.Scanner;

class Task01 {
    private static final int TRIANGLE_SUM = 180;
    private static final int RIGHT_ANGLE = 90;
    private static final String INPUT_MSG = "Enter the angles A and B:";
    private static final String TRIANGLE_MSG = "A triangle with angles A=%d and B=%d exists. ";
    private static final String RIGHT_TRIANGLE_MSG = "It's a right triangle.";
    private static final String NOT_TRIANGLE_MSG = "A triangle with angles A=%d and B=%d doesn't exist.";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = TRIANGLE_SUM - a - b;
        if (a > 0 && b > 0 && c > 0) {
            System.out.printf(TRIANGLE_MSG, a, b);
            if (c == RIGHT_ANGLE) {
                System.out.println(RIGHT_TRIANGLE_MSG);
            }
        } else {
            System.out.printf(NOT_TRIANGLE_MSG, a, b);
        }
    }
}
