package part03.task05;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter e");
        Scanner in = new Scanner(System.in);
        double e = in.nextDouble();
        double sum = calcSum(e);
        System.out.printf("Sum = %.3f", sum);
    }

    private static double calcSum(double e) {
        double rowSum = 1.5;

        if (e <= 0) {
            return rowSum;
        } else {
            double sum = 0;
            int n = 1;
            double a = calcValue(n);

            while (a >= e) {
                sum += a;
                n++;
                a = calcValue(n);
            }
            return sum;
        }
    }

    private static double calcValue(int n) {
        return Math.pow(2, -n) + Math.pow(3, -n);
    }
}