package com.github.plizzzhealme.part01.task01;

import static com.github.plizzzhealme.interaction.Interaction.getDouble;

/*
Найдите значение функции
 */
class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double result;

        System.out.println("Enter a, b, c");
        a = getDouble();
        b = getDouble();
        c = getDouble();
        result = calcFunction(a, b, c);
        System.out.printf("z = %.2f", result);
    }

    private static double calcFunction(double a, double b, double c) {
        return (a - 3) * b / 2 + c;
    }
}