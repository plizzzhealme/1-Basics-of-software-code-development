package part02.task02;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c, d");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(findMaxMin(a, b, c, d));
    }

    @SuppressWarnings("ManualMinMaxCalculation")
    private static int findMaxMin(int a, int b, int c, int d) {
        int min1 = a < b ? a : b;
        int min2 = c < d ? c : d;
        return min1 > min2 ? min1 : min2;
    }
}