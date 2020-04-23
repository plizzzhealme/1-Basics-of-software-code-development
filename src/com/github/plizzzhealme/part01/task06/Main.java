package com.github.plizzzhealme.part01.task06;

import static com.github.plizzzhealme.interaction.Interaction.getInt;

/*
Напечатать true, если точка (x;y) принадлежит закрашенной области, false - в противном случае
 */
class Main {
    public static void main(String[] args) {
        int x;
        int y;
        boolean result;

        System.out.println("Enter x and y coordinates");
        x = getInt();
        y = getInt();

        result = checkPoint(x, y);

        System.out.println(result);
    }

    private static boolean checkPoint(int x, int y) {
        return -2 <= x && x <= 2 && 0 <= y && y <= 4
               || -4 <= x && x <= 4 && -3 <= y && y <= 0;
    }
}