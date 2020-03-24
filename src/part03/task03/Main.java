package part03.task03;

class Main {
    public static void main(String[] args) {
        int n = 100;
        int sum = calcSquaresSum(n);
        System.out.println(sum);
    }

    private static int calcSquaresSum(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }
}