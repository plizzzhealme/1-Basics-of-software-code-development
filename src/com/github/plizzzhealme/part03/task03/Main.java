package com.github.plizzzhealme.part03.task03;

/*
Найти сумму квадратов первых 100 чисел
 */
class Main {
    public static void main(String[] args) {
        int n = 100;
        long sum;

        sum = calcSquaresSum(n);
        System.out.println(sum);
    }

    private static int calcSquaresSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}