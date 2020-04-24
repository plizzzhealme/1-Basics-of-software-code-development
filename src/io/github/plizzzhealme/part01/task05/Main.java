package io.github.plizzzhealme.part01.task05;

import io.github.plizzzhealme.interaction.Interaction;

/*
Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
Вывести в формате HHч MMмин SSс
 */
class Main {
    public static void main(String[] args) {
        int t;
        String time;

        System.out.println("Enter time in seconds");
        t = Interaction.getPositiveInt();

        time = convertTime(t);

        System.out.println(time);
    }

    private static String convertTime(int t) {
        int h;
        int m;
        int s;

        h = t / 3600;
        m = t % 3600 / 60;
        s = t % 60;
        return String.format("%02dч %02dмин %02dс", h, m, s);
    }
}