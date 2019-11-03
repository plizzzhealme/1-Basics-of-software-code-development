package loops;

import java.math.BigInteger;

class Task04 {
    public static void main(String[] args) {
        int n = 200;
        BigInteger facFac = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            facFac = facFac.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(facFac);
    }
}
