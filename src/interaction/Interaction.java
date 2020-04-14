package interaction;

import java.util.Scanner;

public class Interaction {
    private static final Scanner in = new Scanner(System.in);

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
}