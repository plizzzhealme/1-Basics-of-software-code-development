package part03.task02;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the interval");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Enter the step");
        double h = in.nextDouble();
        printFunctionValues(a, b, h);
    }

    private static void printFunctionValues(double a, double b, double h) {
        double currentX = a;
        double currentY;

        if (a <= b) {
            for (int i = 1; currentX <= b; i++) {
                currentY = calcFunction(currentX);
                System.out.printf("f(%.2f) = %.2f%n", currentX, currentY);
                currentX = a + i * h;
            }
        }
    }

    private static double calcFunction(double x) {
        return x > 2 || x == 0 ? x : -x;
    }
}