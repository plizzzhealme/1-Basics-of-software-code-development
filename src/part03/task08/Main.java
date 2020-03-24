package part03.task08;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter a, b");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        printCommonDigits(m, n);
    }

    private static void printCommonDigits(int m, int n) {
        int digitsNumber = 10;
        System.out.print(String.format("Common digits for %d and %d:", m, n));

        for (int i = 0; i < digitsNumber; i++) {
            boolean mContains = false;
            boolean nContains = false;
            int tempN = n;
            int tempM = m;

            while (tempM != 0 && !mContains) {
                if (tempM % digitsNumber == i) {
                    mContains = true;
                }
                tempM /= digitsNumber;
            }

            while (tempN != 0 && !nContains) {
                if (tempN % digitsNumber == i) {
                    nContains = true;
                }
                tempN /= digitsNumber;
            }

            if (mContains && nContains) {
                System.out.print(" " + i);
            }
        }
    }
}
