package part02.task04;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hole dimensions");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter the brick dimensions");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if (canPass(a, b, x, y, z)) {
            System.out.println("You shall pass");
        } else {
            System.out.println("YOU SHALL NOT PASS!");
        }
    }

    private static boolean canPass(int a, int b, int x, int y, int z) {
        return x <= a && y <= b
               || y <= a && x <= b
               || x <= a && z <= b
               || z <= a && x <= b
               || y <= a && z <= b
               || z <= a && y <= b;
    }
}