package part01.task03;

import java.util.Scanner;

import static java.lang.Math.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter x, y");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = calcFunction(x, y);
        System.out.printf("z = %.3f", z);
    }

    private static double calcFunction(double x, double y) {
        return (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
    }
}