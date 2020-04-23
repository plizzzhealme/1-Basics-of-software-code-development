package com.github.plizzzhealme.part02.task04;

import static com.github.plizzzhealme.interaction.Interaction.getPositiveInt;

/*
Определить, пройдет ли кирпич x, y, z через отверстие A, B
 */
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