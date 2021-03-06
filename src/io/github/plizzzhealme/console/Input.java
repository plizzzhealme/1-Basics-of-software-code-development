package io.github.plizzzhealme.console;

import java.util.Scanner;

public class Input {
    private static final Scanner in = new Scanner(System.in);

    private Input() {
    }

    public static int getInt() {
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Enter an integer");
        }
        return in.nextInt();
    }

    public static int getPositiveInt() {
        int n;

        do {
            n = getInt();

            if (n <= 0) {
                System.out.println("Enter a positive integer");
            }
        } while (n <= 0);
        return n;
    }

    public static double getDouble() {
        while (!in.hasNextDouble()) {
            in.next();
            System.out.println("Enter a real number");
        }
        return in.nextDouble();
    }

    public static double getPositiveDouble() {
        double d;

        do {
            d = getDouble();

            if (d <= 0) {
                System.out.println("Enter a positive real number");
            }
        } while (d <= 0);
        return d;
    }
}