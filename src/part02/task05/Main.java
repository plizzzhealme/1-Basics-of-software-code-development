package part02.task05;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter x");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.printf("f(%.3f) = %.3f", x, calcFunction(x));
    }

    private static double calcFunction(double x) {
        return x > 3 ? 1 / (x * x * x + 6) : x * x - 3 * x + 9;
    }
}