package part03.task06;

class Main {
    public static void main(String[] args) {
        printChars();
    }

    private static void printChars() {
        for (int i = 32; i < 256; i++) {
            System.out.println(String.format("%03d - %c", i, i));
        }
    }
}
