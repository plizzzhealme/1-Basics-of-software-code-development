package com.github.plizzzhealme.part03.task01;

import static com.github.plizzzhealme.interaction.Interaction.getPositiveInt;

/*
Сложить цифры от 1 до n
 */
class Main {
    public static void main(String[] args) {
        int n;
        long sum;

        System.out.println("Enter any number");
        n = getPositiveInt();

        sum = calcSum(n);

        System.out.printf("Sum = %d", sum);
    }

    private static long calcSum(int n) {
        long sum;
        long pairSum;
        int pairsNumber;

        pairSum = n + 1L;
        pairsNumber = n / 2;
        sum = pairSum * pairsNumber;

        if (n % 2 == 1) {
            sum += pairSum / 2;
        }
        return sum;
    }
}