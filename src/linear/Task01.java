package linear;

import java.util.Scanner;

class Task01 {
    private static final String INPUT_MSG = "Input a, b, c in order:";

    public static void main(String[] args) {
        System.out.println(INPUT_MSG);
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int z = (a - 3) * b / 2 + c;
        System.out.println("z = " + z);
    }
}