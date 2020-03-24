package part03.task07;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter the interval");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        printDividers(m, n);
    }

    private static void printDividers(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.print(String.format("%3d dividers:", i));
            StringBuilder dividers = new StringBuilder();

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    dividers.append(" ").append(j);
                    int k = i / j;

                    if (k != j) {
                        dividers.append(" ").append(k);
                    }
                }
            }
            System.out.println(dividers.toString().isEmpty() ? " -" : dividers);
        }
    }
}