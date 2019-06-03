import java.math.BigInteger;

public class FactorialApp {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static BigInteger factorial(int value) {
        BigInteger bigInteger = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= value; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
}
