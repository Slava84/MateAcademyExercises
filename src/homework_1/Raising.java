package homework_1;

public class Raising {
    public static void main(String[] args) {
        System.out.println("Возведение числа в квадрат: " + squaringNumber(3));
        System.out.println("Возведение числа в куб: " + inTheCube(3));
        System.out.println("Возведение числа в степень: " + pow(3, 0));
    }

    private static double squaringNumber(double a) {
        return a * a;
    }

    private static double inTheCube(double a) {
        return a * a * a;
    }

    private static double pow(double a, double b) {
        if (b == 0) return 1;
        for (int i = 1; i < b; i++) {
            a *= a;
        }
        return a;
    }
}
