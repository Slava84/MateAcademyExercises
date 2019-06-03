package homework_2;

public class DoubleExp {
    public static void main(String[] args) {
        System.out.println("6.8 + 4.4 = 11 : " + doubleExpression(6.8, 4.4, 11));
        System.out.println("6.8 + 4.7 = 11 : " + doubleExpression(6.8, 4.7, 11));
    }

    private static boolean doubleExpression(double a, double b, double c) {
        return StrictMath.round(a) == StrictMath.subtractExact(StrictMath.round(c), StrictMath.round(b));
    }
}
