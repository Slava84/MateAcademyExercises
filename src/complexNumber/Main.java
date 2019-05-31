package may_28.complexNumber;

public class Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(1, 1);
        ComplexNumber complexNumber2 = new ComplexNumber(1, 1);

        System.out.println(complexNumber1.equals(complexNumber2));
        System.out.println(complexNumber1.hashCode() == complexNumber2.hashCode());
        System.out.println();
        System.out.println(complexNumber1.hashCode());
        System.out.println(complexNumber2.hashCode());
    }
}
