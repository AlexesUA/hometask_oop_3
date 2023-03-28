package task3;

public class Plane extends Vehicle {
    private int flyHeight;
    private int countPassenger;


    public Plane(double price, int yearManufacture, double speed) {
        super(price, yearManufacture, speed);
    }
    public Plane(double price, int yearManufacture, double speed, int flyHeight, int countPassenger) {
        this(price, yearManufacture, speed);
        this.flyHeight = flyHeight;
        this.countPassenger = countPassenger;
    }

    public int getFlyHeight() {
        return flyHeight;
    }

    public void setFlyHeight(int flyHeight) {
        this.flyHeight = flyHeight;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    @Override
    public String toString() {
        return String.format("%1$s, Висота польоту: %2$s, Кількість пасажирів: %3$s", super.toString(), flyHeight, countPassenger);
    }
}
