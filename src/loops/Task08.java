package loops;

import java.util.Scanner;

public class Task08 {
    private static final int DIGITS_NUMBER = 10;

    public static void main(String[] args) {
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
