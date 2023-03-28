package task3;

public class Саг extends Vehicle {
    private char classCar;

    public Саг(double price, int yearManufacture, double speed) {
        super(price, yearManufacture, speed);
    }
    public Саг(double price, int yearManufacture, double speed, char classCar) {
        this(price, yearManufacture, speed);
        this.classCar = classCar;
    }

    public char getClassCar() {
        return classCar;
    }

    public void setClassCar(char classCar) {
        this.classCar = classCar;
    }

    @Override
    public String toString() {
        return String.format("%1$s, Клас машини: %2$s", super.toString(), classCar);
    }
}
