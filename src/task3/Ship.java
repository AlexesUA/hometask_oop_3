package task3;

public class Ship extends Vehicle {
    private int countPassenger;
    private String portRegistration;


    public Ship(double price, int yearManufacture, double speed){
        super(price, yearManufacture, speed);
    }

    public Ship(double price, int yearManufacture, double speed, int countPassenger, String portRegistration){
        this(price, yearManufacture, speed);
        this.countPassenger = countPassenger;
        this.portRegistration = portRegistration;
    }
    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    public String getPortRegistration() {
        return portRegistration;
    }

    public void setPortRegistration(String portRegistration) {
        this.portRegistration = portRegistration;
    }

    @Override
    public String toString() {
        return String.format("%1$s, Кількість пасажирів: %2$s, Порт реєстрації: %3$s", super.toString(), countPassenger, portRegistration);
    }
}
