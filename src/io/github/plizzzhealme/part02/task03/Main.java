package io.github.plizzzhealme.part02.task03;

import static io.github.plizzzhealme.interaction.Interaction.getInt;

/*
Определить, лежат ли 3 точки на одной прямой
 */
class Main {
    public static void main(String[] args) {
        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;

        System.out.println("Enter the coordinates");
        x1 = getInt();
        y1 = getInt();
        x2 = getInt();
        y2 = getInt();
        x3 = getInt();
        y3 = getInt();

        if (isCollinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("These points are collinear");
        } else {
            System.out.println("These points aren't collinear");
        }
    }

    private static boolean isCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (x1 - x3) * (y2 - y3) == (x2 - x3) * (y1 - y3);
    }
}