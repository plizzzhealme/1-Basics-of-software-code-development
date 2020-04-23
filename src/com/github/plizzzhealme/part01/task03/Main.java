package com.github.plizzzhealme.part01.task03;

import static com.github.plizzzhealme.interaction.Interaction.getDouble;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 */
class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double result;

        System.out.println("Enter x, y");
        x = getDouble();
        y = getDouble();

        result = calcFunction(x, y);

        if (Double.isInfinite(result)) {
            System.out.println("Error! Dividing by zero");
        } else {
            System.out.printf("z = %.3f", result);
        }
    }

    private static double calcFunction(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}