package task3;

public class Car extends Vehicle {
    private char classCar;

    public Car(double price, int yearManufacture, double speed) {
        super(price, yearManufacture, speed);
    }
    public Car(double price, int yearManufacture, double speed, char classCar) {
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
        return String.format("Машина; %1$s, Клас машини: %2$s", super.toString(), classCar);
    }

    public String getVehicle(){
        return "Машина";
    }
}
