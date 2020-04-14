package part01.task01;

import static interaction.Interaction.getInt;

class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int result;

        System.out.println("Enter a, b, c");
        a = getInt();
        b = getInt();
        c = getInt();
        result = calcFunction(a, b, c);
        System.out.printf("z = %d", result);
    }

    private static int calcFunction(int a, int b, int c) {
        return (a - 3) * b / 2 + c;
    }
}