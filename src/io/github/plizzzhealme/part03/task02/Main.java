package io.github.plizzzhealme.part03.task02;

import io.github.plizzzhealme.interaction.Interaction;

/*
Вычислить значение функции на отрезке [a;b] с шагом h
 */
class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double h;

        System.out.println("Enter the interval");
        a = Interaction.getDouble();

        do {
            b = Interaction.getDouble();

            if (b < a) {
                System.out.println("b must be greater than a");
            }
        } while (b < a);

        System.out.println("Enter the step size");
        h = Interaction.getPositiveDouble();

        printFunctionValues(a, b, h);
    }

    private static void printFunctionValues(double a, double b, double h) {
        double currentX = a;
        double currentY;

        for (int i = 1; currentX <= b; i++) {
            currentY = calcFunction(currentX);
            System.out.printf("f(%.2f) = %.2f%n", currentX, currentY);
            currentX = a + i * h;
        }
    }

    private static double calcFunction(double x) {
        return 2 < x || x == 0 ? x : -x;
    }
}