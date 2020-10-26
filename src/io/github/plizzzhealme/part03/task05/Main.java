package io.github.plizzzhealme.part03.task05;

import io.github.plizzzhealme.console.Input;

/*
Найти сумму членов ряда, модуль которых больше либо равен заданному e
 */
class Main {
    public static void main(String[] args) {
        double e;
        double sum;

        System.out.println("Enter e");
        e = Input.getDouble();

        sum = calcSum(e);

        System.out.printf("Sum = %.3f", sum);
    }

    private static double calcSum(double e) {
        double rowSum = 1.5;
        double sum = 0;
        int n = 1;
        double a;

        if (e <= 0) {
            return rowSum;
        }

        a = calcValue(n);

        if (e > a) {
            return 0;
        }

        while (a >= e) {
            sum += a;
            n++;
            a = calcValue(n);
        }
        return sum;
    }

    private static double calcValue(int n) {
        return Math.pow(2, -n) + Math.pow(3, -n);
    }
}