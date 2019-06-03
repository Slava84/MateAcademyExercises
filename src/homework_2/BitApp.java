package homework_2;

public class BitApp {
    public static void main(String[] args) {
        System.out.println("0001 ^ 0001 = 0000 : " + flipBit(1, 1));
        System.out.println("0001 ^ 0010 = 0011 : " + flipBit(1, 2));
        System.out.println("0001 ^ 0100 = 0101 : " + flipBit(1, 3));
        System.out.println("0001 ^ 1000 = 1001 : " + flipBit(1, 4));
    }

    private static int flipBit(int value, int bitIndex) {
        return value ^ 1 << --bitIndex;
    }
}
