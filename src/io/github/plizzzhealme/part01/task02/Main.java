package io.github.plizzzhealme.part01.task02;

import io.github.plizzzhealme.console.Input;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения)
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

        if (Double.isNaN(result)) {
            System.out.println("Error! Negative number under square root");
        } else if (Double.isInfinite(result)) {
            System.out.println("Error! Division by zero");
        } else {
            System.out.printf("z = %.3f", result);
        }
    }

    private static double calcFunction(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}