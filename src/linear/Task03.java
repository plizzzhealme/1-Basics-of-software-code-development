package linear;

import java.util.Scanner;

import static java.lang.Math.*;

class Task03 {
    private static final String INPUT_MSG = "Input x, y in order:";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        double z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        System.out.println("z = " + z);
    }
}
