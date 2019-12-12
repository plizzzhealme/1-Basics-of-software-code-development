package condition;

import java.util.Scanner;

class Task05 {
    private static final String INPUT_MSG = "Enter x:";
    private static final String OUTPUT_MSG = "f(x) = %.3f";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        if (x > 3) {
            System.out.printf(OUTPUT_MSG, 1 / (x * x * x + 6));
        } else {
            System.out.printf(OUTPUT_MSG, x * x - 3 * x + 9);
        }
    }
}
