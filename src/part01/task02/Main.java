package part01.task02;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double z = calcFunction(a, b, c);

        if (Double.isNaN(z)) {
            System.out.println("Negative numbers can't have square roots");
        } else {
            System.out.printf("z = %.3f", z);
        }
    }

    private static double calcFunction(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}