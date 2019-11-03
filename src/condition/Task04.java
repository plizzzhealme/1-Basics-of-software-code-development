package condition;

import java.util.Scanner;

class Task04 {
    private static final String INPUT_HOLE_MSG = "Input hole A and B dimensions:";
    private static final String INPUT_BRICK_MSG = "Input brick x, y and z dimensions:";
    private static final String PASS_MSG = "You shall pass.";
    private static final String NOT_PASS_MSG = "YOU SHALL NOT PASS!";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(INPUT_HOLE_MSG);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(INPUT_BRICK_MSG);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if (x <= a && y <= b
                || y <= a && x <= b
                || x <= a && z <= b
                || z <= a && x <= b
                || y <= a && z <= b
                || z <= a && y <= b) {
            System.out.println(PASS_MSG);
        } else {
            System.out.println(NOT_PASS_MSG);
        }
    }
}
