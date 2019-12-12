package loops;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class Task07 {
    private static final String INPUT_MSG = "Enter [m, n] interval:";
    private static final String OUTPUT_MSG = "%3d dividers: ";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.printf(OUTPUT_MSG, i);
            for (int j = 2; j <= sqrt(i); j++) {
                if (i % j == 0) {
                    int k = i / j;
                    System.out.print(j != k ? j + " " + k + " " : j + " ");
                }
            }
            System.out.println();
        }
    }
}