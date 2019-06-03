package homework_4.charSequenceImpl;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(bytes);

        System.out.println("toString() " + asciiCharSequence.toString());
        System.out.println("length() " + asciiCharSequence.length());
        System.out.println("charAt(3) " + asciiCharSequence.charAt(3));
        System.out.println("subSequence(2, 4) " + asciiCharSequence.subSequence(2, 4));
        System.out.println("Перевірка на порушення меж масиву:");
    }
}
