package part02.task01;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter the angles");
        Scanner in = new Scanner(System.in);
        int angle1 = in.nextInt();
        int angle2 = in.nextInt();
        printTriangleInfo(angle1, angle2);
    }

    private static void printTriangleInfo(int angle1, int angle2) {
        int triangleSum = 180;
        int rightAngle = 90;
        int angle3 = triangleSum - angle1 - angle2;

        if (angle1 > 0 && angle2 > 0 && angle3 > 0) {
            if (angle1 == rightAngle || angle2 == rightAngle || angle3 == rightAngle) {
                System.out.println("It's a right triangle");
            } else {
                System.out.println("It's a triangle");
            }
        } else {
            System.out.println("It's not a triangle");
        }
    }
}