package part01.task01;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int z = calcFunction(a, b, c);
        System.out.printf("z = %d", z);
    }

    private static int calcFunction(int a, int b, int c) {
        return (a - 3) * b / 2 + c;
    }
}