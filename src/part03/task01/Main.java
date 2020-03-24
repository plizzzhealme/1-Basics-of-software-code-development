package part03.task01;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = calcSum(n);
        System.out.printf("Sum = %d", sum);
    }

    private static int calcSum(int n) {
        return n * (n + 1) / 2;
    }
}