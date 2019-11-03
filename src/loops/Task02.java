package loops;

import java.util.Scanner;

class Task02 {
    private static final String INPUT_STEP_MSG = "Input step:";
    private static final String INPUT_INTERVAL_MSG = "Input [a,b] interval:";
    private static final String OUTPUT_MSG = "f(%.2f) = %.2f\n";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(INPUT_INTERVAL_MSG);
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println(INPUT_STEP_MSG);
        double h = in.nextDouble();

        double x = a;
        double y;
        if (a <= b) {
            for (int i = 1; x <= b; i++) {
                if (x > 2 || x == 0) {
                    y = x;
                } else {
                    y = -x;
                }
                System.out.printf(OUTPUT_MSG, x, y);
                x = a + i * h;
            }
        }
    }
}
