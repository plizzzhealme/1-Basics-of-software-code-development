package io.github.plizzzhealme.part03.task08;

import io.github.plizzzhealme.interaction.Interaction;

/*
Определить цифры, входящие в запись как первого так и второго числа
 */
class Main {
    public static void main(String[] args) {
        int m;
        int n;

        System.out.println("Enter 2 numbers");
        m = Interaction.getInt();
        n = Interaction.getInt();

        System.out.printf("Common digits for %d and %d%n:", m, n);
        printCommonDigits(m, n);
    }

    private static void printCommonDigits(int m, int n) {
        int mTable;
        int nTable;
        int table;
        int i = 0;

        mTable = buildDigitsTable(m);
        nTable = buildDigitsTable(n);
        table = mTable + nTable;

        while (table > 0) {
            if (table % 10 == 2) {
                System.out.println(i);
            }
            table /= 10;
            i++;
        }
    }

    /*
    Builds digits table for the number. Each digit int the table is 0 or 1,
    depending on whether the corresponding digit is found in the number or not.
    Adds 10^0 for 0, 10^1 for 1, 10^2 for 2 and so on.

    For example:
    table:               0001101111 is for 6523210
    corresponding digit: 9876543210
     */
    private static int buildDigitsTable(int n) {
        int table = 0;
        int temp = Math.abs(n);

        do {
            int digit = temp % 10;
            int inc = (int) Math.pow(10, digit);

            if (table % (10 * inc) < inc) {
                table += inc;
            }
            temp /= 10;
        } while (temp > 0);
        return table;
    }
}