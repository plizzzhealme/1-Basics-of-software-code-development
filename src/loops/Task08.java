package loops;

import java.util.Scanner;

class Task08 {
    private static final int DIGITS_NUMBER = 10;
    private static final String INPUT_MSG = "Enter the numbers a and b.";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String mm = String.valueOf(m);
        String nn = String.valueOf(n);
        for (int i = 0; i < DIGITS_NUMBER; i++) {
            String ii = String.valueOf(i);
            if (mm.contains(ii) && nn.contains(ii)) {
                System.out.println(i);
            }
        }
    }
}
