package loops;

import java.util.Scanner;

import static java.lang.Math.pow;

class Task05 {
    private static final String INPUT_MSG = "Input e:";
    private static final String OUTPUT_MSG = "Sum = %.3f.";
    private static final double ROW_SUM = 1.5;

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        double e = in.nextDouble();

        double sum = 0;
        if (e <= 0) {
            sum = ROW_SUM;
        } else {
            int n = 1;
            double a = 1 / pow(2, n) + 1 / pow(3, n);
            while (a >= e) {
                sum += a;
                n++;
                a = 1 / pow(2, n) + 1 / pow(3, n);
            }
        }
        System.out.printf(OUTPUT_MSG, sum);
    }
}
