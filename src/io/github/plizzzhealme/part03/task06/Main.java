package io.github.plizzzhealme.part03.task06;

/*
Вывести на экран соответствия между символами
и их обозначениями в памяти компьютера
 */
class Main {
    public static void main(String[] args) {
        printChars();
    }

    private static void printChars() {
        for (int i = 32; i < 128; i++) {
            System.out.printf("%03d - %c%n", i, i);
        }
    }
}