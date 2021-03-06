package io.github.plizzzhealme.part03.task07;

import io.github.plizzzhealme.console.Input;

/*
Для каждого натурального числа в диапазоне [m;n]
вывести все его делители кроме 1 и самого числа
 */
class Main {
    public static void main(String[] args) {
        int m;
        int n;

        System.out.println("Enter the interval");
        m = Input.getPositiveInt();

        do {
            n = Input.getPositiveInt();

            if (n < m) {
                System.out.println("n must be greater than m");
            }
        } while (n < m);

        for (int i = m; i <= n; i++) {
            System.out.printf("%3d dividers:", i);
            printDividers(i);
        }
    }

    private static void printDividers(int n) {
        int low = 2;
        int high = (int) Math.sqrt(n);

        for (int i = low; i <= high; i++) {
            if (n % i == 0) {
                int j = n / i;

                System.out.printf(" %d", i);

                if (j != i) {
                    System.out.printf(" %d", j);
                }
            }
        }
        System.out.println();
    }
}