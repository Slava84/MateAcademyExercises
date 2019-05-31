package may_28;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    private static BigInteger factorial(int value) {
        long sum = 1;
        for(int i = 1; i <= value; i++)
            sum *= i;
        return BigInteger.valueOf(sum);
    }
}
