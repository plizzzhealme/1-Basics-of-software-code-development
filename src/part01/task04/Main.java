package part01.task04;

import static interaction.Interaction.getDouble;

class Main {
    public static void main(String[] args) {
        double xxxyyy;
        double yyyxxx;

        System.out.println("Enter number in xxx.yyy format");
        xxxyyy = getDouble();
        yyyxxx = replacePartsOfNumber(xxxyyy);
        System.out.printf("%07.3f", yyyxxx);
    }

    private static double replacePartsOfNumber(double r) {
        int xxxyyy = (int) (1000 * r);
        int xxx = xxxyyy / 1000;
        int yyy = xxxyyy % 1000;
        return yyy + xxx / 1000.;
    }
}