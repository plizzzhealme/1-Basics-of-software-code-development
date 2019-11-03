package loops;

class Task03 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
