package homework_6.cloning;

public class Main {
    public static void main(String[] args) {
        Car bmw1 = new Car("BMW", "red", 2018);
        Car anything;

        System.out.println(bmw1);

        anything = bmw1.clone();
        System.out.println(anything);
    }
}
