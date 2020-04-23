package com.github.plizzzhealme.part03.task02;

import static com.github.plizzzhealme.interaction.Interaction.getDouble;
import static com.github.plizzzhealme.interaction.Interaction.getPositiveDouble;

/*
Вычислить значение функции на отрезке [a;b] с шагом h
 */
class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double h;

        System.out.println("Enter the interval");
        a = getDouble();

        do {
            b = getDouble();

            if (b < a) {
                System.out.println("b must be greater than a");
            }
        } while (b < a);

        System.out.println("Enter the step size");
        h = getPositiveDouble();
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