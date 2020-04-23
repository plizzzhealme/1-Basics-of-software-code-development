package com.github.plizzzhealme.part01.task04;

import static com.github.plizzzhealme.interaction.Interaction.getDouble;

/*
Дано действительное число R вида xxx.yyy (три числовых раздряда в дробной и целой частях).
Поменять местами дробную и целую части
 */
class Main {
    public static void main(String[] args) {
        double xxxyyy;
        double yyyxxx;

        System.out.println("Enter number in xxx.yyy format");
        xxxyyy = getDouble();

        yyyxxx = swapPartsOfNumber(xxxyyy);

        System.out.printf("%07.3f", yyyxxx);
    }

    private static double swapPartsOfNumber(double r) {
        int xxxyyy;
        int xxx;
        int yyy;

        xxxyyy = (int) (1000 * r);
        xxx = xxxyyy / 1000;
        yyy = xxxyyy % 1000;
        return yyy + xxx / 1000.;
    }
}