package condition;

import java.util.Scanner;

@SuppressWarnings("ManualMinMaxCalculation")
class Task02 {
    private static final String INPUT_MSG = "Input a, b, c, d in order:";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int min1 = a < b ? a : b;
        int min2 = c < d ? c : d;
        System.out.println(min1 > min2 ? min1 : min2);
    }
}