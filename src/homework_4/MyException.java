package homework_4;

public class MyException {
    public static void main(String[] args) {
        System.out.println(sqrt(4));
        System.out.println(sqrt(-1));
    }

    private static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }
}
