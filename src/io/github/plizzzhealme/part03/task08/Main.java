package io.github.plizzzhealme.part03.task08;

import static io.github.plizzzhealme.console.Input.getInt;

/*
Определить цифры, входящие в запись как первого так и второго числа
 */
class Main {
    public static void main(String[] args) {
        int m;
        int n;

        System.out.println("Enter 2 numbers");
        m = getInt();
        n = getInt();

        System.out.printf("Common digits for %d and %d:%n", m, n);
        printCommonDigits(m, n);
    }

    private static void printCommonDigits(int m, int n) {
        int digit = 0;
        int mTable;
        int nTable;
        int commonTable;

        mTable = buildDigitsTable(m);
        nTable = buildDigitsTable(n);
        commonTable = mTable + nTable;  //digit 2 in the table is for common digits of both numbers

        while (commonTable > 0) {
            if (commonTable % 10 == 2) {
                System.out.println(digit);
            }
            commonTable /= 10;
            digit++;
        }
    }

    /*
    Builds digits table for the number. Each digit int the table is 0 or 1,
    depending on whether the corresponding digit is found in the number or not.
    Adds 1 for 0, 10 for 1, 100 for 2, 1000 for 3, etс.
    The table is used to avoid extra iterations over the numbers.

    Example:
    table: 0001101111 is for 6523210
           ^^^^^^^^^^
    digit: 9876543210
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