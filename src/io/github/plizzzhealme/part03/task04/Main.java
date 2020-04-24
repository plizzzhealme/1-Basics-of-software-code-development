package io.github.plizzzhealme.part03.task04;

import java.math.BigInteger;

/*
Найти произведение квадратов первых 200 чисел
 */
class Main {
    public static void main(String[] args) {
        int n = 200;
        BigInteger facFac;

        facFac = calcFacFac(n);

        System.out.println(facFac);
    }

    private static BigInteger calcFacFac(int n) {
        BigInteger facFac = BigInteger.valueOf(1);

        for (int i = 2; i <= n; i++) {
            facFac = facFac.multiply(BigInteger.valueOf((long) i * i));
        }
        return facFac;
    }
}