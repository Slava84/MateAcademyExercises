package homework_6.cloning;

public class Car implements Cloneable {
    protected String brand;
    protected String colour;
    protected int productionYear;

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
        return "Марка автівки: " + getBrand() +
                ",\t колір: " + getColour() +
                ",\t рік випуску: " + getProductionYear();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
