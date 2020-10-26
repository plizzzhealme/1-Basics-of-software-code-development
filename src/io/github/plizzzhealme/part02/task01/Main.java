package io.github.plizzzhealme.part02.task01;

import static io.github.plizzzhealme.console.Input.getPositiveInt;

/*
Даны 2 угла в градусах. Определить, существует ли такой треугольник.
Если да, будет ли он прямоугольным
 */
class Main {
    public static void main(String[] args) {
        int angle1;
        int angle2;
        int angle3;

        System.out.println("Enter 2 angles");
        angle1 = getPositiveInt();
        angle2 = getPositiveInt();

        angle3 = calcThirdAngle(angle1, angle2);

        if (angle3 == 90) {
            System.out.println("It's a right triangle");
        } else if (angle3 > 0) {
            System.out.println("It's a triangle");
        } else {
            System.out.println("Such triangle doesn't exist");
        }
    }

    private static int calcThirdAngle(int angle1, int angle2) {
        int triangleSum = 180;

        if (angle1 >= triangleSum || triangleSum <= angle2) {
            return -1;
        }
        return triangleSum - angle1 - angle2;
    }
}