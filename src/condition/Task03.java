package condition;

import java.util.Scanner;

class Task03 {
    private static final String INPUT_A_MSG = "Input A x and y coordinates:";
    private static final String INPUT_B_MSG = "Input B x and y coordinates:";
    private static final String INPUT_C_MSG = "Input C x and y coordinates:";
    private static final String COLLINEAR_MSG = "These points are collinear.";
    private static final String NOT_COLLINEAR_MSG = "These points are not collinear.";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(INPUT_A_MSG);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.println(INPUT_B_MSG);
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        System.out.println(INPUT_C_MSG);
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        if ((x1 - x3) * (y2 - y3) == (x2 - x3) * (y1 - y3)) {
            System.out.println(COLLINEAR_MSG);
        } else {
            System.out.println(NOT_COLLINEAR_MSG);
        }
    }
}
