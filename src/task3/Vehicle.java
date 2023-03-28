package task3;

public class Vehicle {

    protected double price;
    protected int yearManufacture;
    protected double speed;

    public Vehicle(double price, int yearManufacture, double speed){
        this.price = price;
        this.yearManufacture = yearManufacture;
        this.speed = speed;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return String.format("Ціна: %1$.2f, Рік виробництва: %2$s, Швидкість: %3$.2f", price, yearManufacture, speed);
    }
}
