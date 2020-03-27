package part01.task02;

import static cleaner.Cleaner.getDouble;

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