package homework_7.myGeneric;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = Pair.of(1, "hello");
        Pair<Integer, String> pair2 = Pair.of(1, "hello");

        System.out.println(pair1.getFirst()); // 1
        System.out.println(pair1.getSecond()); // "hello"
        System.out.println();
        System.out.println(pair1.equals(pair2)); // true!
        System.out.println(pair1.hashCode() == pair2.hashCode()); // true!
    }
}
