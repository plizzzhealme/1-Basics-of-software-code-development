package part03.task01;

import static interaction.Interaction.getPositiveInt;

class Main {
    public static void main(String[] args) {
        int n;
        int sum;

        System.out.println("Enter any number");
        n = getPositiveInt();
        sum = calcSum(n);
        System.out.printf("Sum = %d", sum);
    }

    private static int calcSum(int n) {
        return n * (n + 1) / 2;
    }
}