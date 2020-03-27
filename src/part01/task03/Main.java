package part01.task03;

import static cleaner.Cleaner.getDouble;
import static java.lang.Math.*;

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
        return (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
    }
}