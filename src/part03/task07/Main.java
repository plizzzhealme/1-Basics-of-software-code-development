package part03.task07;

import static interaction.Interaction.getPositiveInt;

class Main {
    public static void main(String[] args) {
        int m;
        int n;

        System.out.println("Enter the interval");
        m = getPositiveInt();
        n = getPositiveInt();
        printDividers(m, n);
    }

    private static void printDividers(int m, int n) {
        for (int i = m; i <= n; i++) {
            StringBuilder dividers = new StringBuilder();
            System.out.print(String.format("%3d dividers:", i));

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    int k = i / j;
                    dividers.append(" ").append(j);

                    if (k != j) {
                        dividers.append(" ").append(k);
                    }
                }
            }
            System.out.println(dividers.toString().isEmpty() ? " -" : dividers);
        }
    }
}