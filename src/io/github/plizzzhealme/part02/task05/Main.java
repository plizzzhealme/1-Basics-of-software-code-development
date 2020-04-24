package io.github.plizzzhealme.part02.task05;

import io.github.plizzzhealme.interaction.Interaction;

/*
Вычислить значение функции
 */
class Main {
    public static void main(String[] args) {
        double x;
        double f;

        System.out.println("Enter x");
        x = Interaction.getDouble();

        f = calcFunction(x);

        System.out.printf("f(%.3f) = %.3f", x, f);
    }

    private static double calcFunction(double x) {
        return x > 3 ? f1(x) : f2(x);
    }

    private static double f1(double x) {
        return 1 / (x * x * x + 6);
    }

    private static double f2(double x) {
        return x * x - 3 * x + 9;
    }
}