package homework_2;

public class BooleanExp {
    public static void main(String[] args) {
        System.out.println("true, false, false, false  = " + booleanExpression(true, false, false, false));
        System.out.println("false, true, false, false  = " + booleanExpression(false, true, false, false));
        System.out.println("false, false, true, false  = " + booleanExpression(false, false, true, false));
        System.out.println("false, false, false, true  = " + booleanExpression(false, false, false, true));
        System.out.println();
        System.out.println("true, true, false, false  = " + booleanExpression(true, true, false, false));
        System.out.println("false, false, true, true  = " + booleanExpression(false, false, true, true));
        System.out.println("true, false, true, false  = " + booleanExpression(true, false, true, false));
        System.out.println("false, true, false, true  = " + booleanExpression(false, true, false, true));
        System.out.println("true, false, false, true  = " + booleanExpression(true, false, false, true));
        System.out.println("false, true, true, false  = " + booleanExpression(false, true, true, false));
    }

    private static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        if ((a == true && b == true) ^ (c == true && d == true)) {
            return true;
        } else if ((a == true && d == true) ^ (b == true && c == true)) {
            return true;
        } else if ((a == true && c == true) ^ (b == true && d == true)) {
            return true;
        } else return false;
    }
}
