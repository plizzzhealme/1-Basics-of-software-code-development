package part02.task02;

import static interaction.Interaction.getInt;

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
        result = findMaxMin(a, b, c, d);
        System.out.println(result);
    }

    @SuppressWarnings("ManualMinMaxCalculation")
    private static int findMaxMin(int a, int b, int c, int d) {
        int min1 = a < b ? a : b;
        int min2 = c < d ? c : d;
        return min1 > min2 ? min1 : min2;
    }
}