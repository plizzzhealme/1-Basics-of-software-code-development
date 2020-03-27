package part02.task04;

import static cleaner.Cleaner.getPositiveInt;

class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int x;
        int y;
        int z;

        System.out.println("Enter the hole dimensions");
        a = getPositiveInt();
        b = getPositiveInt();
        System.out.println("Enter the brick dimensions");
        x = getPositiveInt();
        y = getPositiveInt();
        z = getPositiveInt();

        if (isBrickPass(a, b, x, y, z)) {
            System.out.println("You shall pass");
        } else {
            System.out.println("YOU SHALL NOT PASS!");
        }
    }

    private static boolean isBrickPass(int a, int b, int x, int y, int z) {
        return x <= a && y <= b
               || y <= a && x <= b
               || x <= a && z <= b
               || z <= a && x <= b
               || y <= a && z <= b
               || z <= a && y <= b;
    }
}