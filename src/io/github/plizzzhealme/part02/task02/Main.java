package io.github.plizzzhealme.part02.task02;

import static io.github.plizzzhealme.console.Input.getInt;

/*
Найти max{min(a,b),min(c,d)}
 */
class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int result;

        System.out.println("Enter a, b, c, d");
        a = getInt();
        b = getInt();
        c = getInt();
        d = getInt();

        result = calcMaxMin(a, b, c, d);

        System.out.println(result);
    }

    @SuppressWarnings("ManualMinMaxCalculation")
    private static int calcMaxMin(int a, int b, int c, int d) {
        int min1;
        int min2;

        min1 = a < b ? a : b;
        min2 = c < d ? c : d;
        return min1 > min2 ? min1 : min2;
    }
}