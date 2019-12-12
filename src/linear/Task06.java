package linear;

import java.util.Scanner;

class Task06 {
    private static final String INPUT_MSG = "Enter x and y coordinates in order:";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(x >= -2 && x <= 2 && y >= 0 && y <= 4
                || x >= -4 && x <= 4 && y >= -3 && y <= 0);
    }
}
