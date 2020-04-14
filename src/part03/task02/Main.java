package part03.task02;

import static interaction.Interaction.getDouble;

class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double h;

        System.out.println("Enter the interval");
        a = getDouble();
        b = getDouble();
        System.out.println("Enter the step size");
        h = getDouble();
        printFunctionValues(a, b, h);
    }

    private static void printFunctionValues(double a, double b, double h) {
        double currentX = a;
        double currentY;

        if (h <= 0) {
            System.out.printf("Incorrect step value h = %.2f", h);
            return;
        }

        if (a > b) {
            System.out.printf("Incorrect interval [%.2f; %.2f]", a, b);
            return;
        }

        for (int i = 1; currentX <= b; i++) {
            currentY = calcFunction(currentX);
            System.out.printf("f(%.2f) = %.2f%n", currentX, currentY);
            currentX = a + i * h;
        }
    }

    private static double calcFunction(double x) {
        return x > 2 || x == 0 ? x : -x;
    }
}