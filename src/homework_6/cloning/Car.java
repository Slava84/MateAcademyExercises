package homework_6.cloning;

public class Car implements Cloneable {
    private String brand;
    private String colour;
    private int productionYear;

    public Car(String brand, String colour, int productionYear) {
        this.brand = brand;
        this.colour = colour;
        this.productionYear = productionYear;
    }

    @Override
    public Car clone() {
        return new Car(this.brand, this.colour, this.productionYear);
    }

    @Override
    public String toString() {
        return "Марка автівки: " + brand +
                ",\t колір: " + colour +
                ", рік випуску: " + productionYear;
    }
}
