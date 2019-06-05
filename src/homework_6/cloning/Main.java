package homework_6.cloning;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "red", 2018);
        Car electricCar = new ElectricCar("BMW", "blue", 2019, 300);
        Car anything;

        System.out.println(bmw);
        System.out.println(electricCar);
        System.out.println();

        anything = bmw.clone();
        System.out.println(anything);

        anything = electricCar.clone();
        System.out.println(anything);
    }
}
