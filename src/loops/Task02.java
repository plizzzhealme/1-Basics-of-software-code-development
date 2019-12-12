package loops;

import java.util.Scanner;

@SuppressWarnings("SuspiciousNameCombination")
class Task02 {
    private static final String INPUT_STEP_MSG = "Enter step size:";
    private static final String INPUT_INTERVAL_MSG = "Enter [a,b] interval:";
    private static final String OUTPUT_MSG = "f(%.2f) = %.2f\n";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(INPUT_INTERVAL_MSG);
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println(INPUT_STEP_MSG);
        double h = in.nextDouble();
        double currentX = a;
        double currentY;
        if (a <= b) {
            for (int i = 1; currentX <= b; i++) {
                if (currentX > 2 || currentX == 0) {
                    currentY = currentX;
                } else {
                    currentY = -currentX;
                }
                System.out.printf(OUTPUT_MSG, currentX, currentY);
                currentX = a + i * h;
            }
        }
    }
}
