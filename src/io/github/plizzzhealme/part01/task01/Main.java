package io.github.plizzzhealme.part01.task01;

import io.github.plizzzhealme.console.Input;

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
        a = Input.getDouble();
        b = Input.getDouble();
        c = Input.getDouble();

        result = calcFunction(a, b, c);

        System.out.printf("z = %.2f", result);
    }

    private static double calcFunction(double a, double b, double c) {
        return (a - 3) * b / 2 + c;
    }
}