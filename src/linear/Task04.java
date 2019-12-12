package linear;

import java.util.Scanner;

class Task04 {
    private static final String INPUT_MSG = "Enter number in xxx.yyy format:";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(INPUT_MSG);
        double r = in.nextDouble();
        int xxxyyy = (int) (1000 * r);
        int xxx = xxxyyy / 1000;
        int yyy = xxxyyy % 1000;
        double yyyxxx = yyy + xxx / 1000.;
        System.out.printf("%07.3f", yyyxxx);
    }
}
