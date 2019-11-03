package loops;

import java.util.Scanner;

class Task01 {
    private static final String INPUT_MSG = "Input any number:";
    private static final String OUTPUT_MSG = "Sum = %d";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf(OUTPUT_MSG, sum);
    }
}
