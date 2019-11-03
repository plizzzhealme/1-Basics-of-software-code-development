package linear;

import java.util.Scanner;

class Task02 {
    private static final String INPUT_MSG = "Input a, b, c in order:";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 / a - a * a * a * c + 1 / b / b;
        System.out.println("z = " + z);
    }
}
