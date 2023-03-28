package task3;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehiclesPark = new Vehicle[3];

        vehiclesPark[0] = new Plane(1900234,2022,873,10000,75);
        vehiclesPark[1] = new Ship(10234432,2010,23,270,"Одеса");
        vehiclesPark[2] = new Car(12500,2017,231);

        Car tempCar = (Car)vehiclesPark[2];
        tempCar.setClassCar('D');

        //Або можна так
        //((Car)vehiclesPark[2]).setClassCar('S');

        for(int i=0; i<vehiclesPark.length; i++){
            System.out.println((i+1) + " - " + vehiclesPark[i].toString());
        }

    }
}
