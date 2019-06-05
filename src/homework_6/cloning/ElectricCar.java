package homework_6.cloning;

public class ElectricCar extends Car {
    protected int maxKilometers;

    public ElectricCar(String brand, String colour, int productionYear, int maxKilometers) {
        super(brand, colour, productionYear);
        this.maxKilometers = maxKilometers;
    }

    @Override
    public ElectricCar clone() {
        return new ElectricCar(this.brand, this.colour, this.productionYear, this.maxKilometers);
    }

    @Override
    public String toString() {
        return super.toString()
                + ",\t максимальна прохідність, кілометрів: " + getMaxKilometers();
    }

    public int getMaxKilometers() {
        return maxKilometers;
    }

    public void setMaxKilometers(int maxKilometers) {
        this.maxKilometers = maxKilometers;
    }
}
