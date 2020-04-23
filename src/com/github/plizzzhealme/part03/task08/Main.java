package com.github.plizzzhealme.part03.task08;

import static com.github.plizzzhealme.interaction.Interaction.getInt;

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

        System.out.printf("Common digits for %d and %d:", m, n);
        printCommonDigits(m, n);
    }

    private static void printCommonDigits(int m, int n) {
        int digitsNumber = 10;

        for (int i = 0; i < digitsNumber; i++) {
            if (hasDigit(m, i) && hasDigit(n, i)) {
                System.out.print(" " + i);
            }
        }
    }

    private static boolean hasDigit(int number, int digit) {
        int digitsNumber = 10;
        int temp = Math.abs(number);

        if (temp < digitsNumber) {
            return temp == digit;
        }

        while (temp != 0) {
            if (temp % digitsNumber == digit) {
                return true;
            }
            temp /= 10;
        }
        return false;
    }
}