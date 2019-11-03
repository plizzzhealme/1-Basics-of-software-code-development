package loops;

class task06 {
    private static final String OUTPUT_MSG = "%03d - %c\n";
    public static void main(String[] args) {
        for (int i = 32; i < 256; i++) {
            System.out.printf(OUTPUT_MSG, i, i);
        }
    }
}
