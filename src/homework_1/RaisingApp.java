package homework_1;

public class RaisingApp {
    public static void main(String[] args) {
        System.out.println("Возведение числа в квадрат: " + squaringNumber(3));
        System.out.println("Возведение числа в куб: " + inTheCube(3));
        System.out.println("Возведение числа в степень: " + pow(3, 0));
        System.out.println("Возведение числа в степень: " + pow(3, -1));
    }

    private static double squaringNumber(double num) {
        return num * num;
    }

    private static double inTheCube(double num) {
        return num * num * num;
    }

    private static double pow(double num, double power) {
        if (power == 0) return 1;
        if (power > 0) {
            for (int i = 1; i < power; i++) {
                num *= num;
            }
            return num;
        } else throw new IllegalArgumentException(" Степінь не може бути від'ємною! ");
    }
}
