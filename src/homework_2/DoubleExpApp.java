package homework_2;

public class DoubleExpApp {
    final static double FALLIBILITY = 0.0001;

    public static void main(String[] args) {
        System.out.println("6.5 + 4.5001 = 11 : " + doubleExpression(6.5, 4.5001, 11));
        System.out.println("6.5 + 4.4999 = 11 : " + doubleExpression(6.5, 4.4999, 11));
    }

    private static boolean doubleExpression(double a, double b, double c) {
//        return StrictMath.round(a) == StrictMath.subtractExact(StrictMath.round(c), StrictMath.round(b));
        return Math.abs(a + b - c) <= FALLIBILITY;
    }
}
