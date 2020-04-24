package io.github.plizzzhealme.part03.task01;

import io.github.plizzzhealme.interaction.Interaction;

/*
Сложить цифры от 1 до n
 */
class Main {
    public static void main(String[] args) {
        int n;
        long sum;

        System.out.println("Enter any number");
        n = Interaction.getPositiveInt();

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