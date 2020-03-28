package at.ta.carsProject;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Car car3 = new Car("Black", Car.BODY.SPORT);


        Manufacturer manufacturer1 = new Manufacturer("Audi", "Germany", 10.0, 45000.0);
        Manufacturer manufacturer2 = new Manufacturer("Porsche", "German", 8.0, 80000.0);

        Engine engine1 = new Engine(Engine.FUEL.DIESEL, 250.00, 12.0, 50007.0, 240.0);
        Engine engine2 = new Engine(Engine.FUEL.GAS, 280.00, 14.0, 30000.0, 300.0);
        Engine truckEngine1 = new Engine(Engine.FUEL.DIESEL, 140.0, 25.0, 1000.0, 500);
        Engine raceEngine1 = new Engine(Engine.FUEL.GAS, 400.0, 40.0, 10.0, 1000.0);


        System.out.println("Wählen sie eine Herssteller:");
        System.out.println("1 " + manufacturer1 + " %");
        System.out.println("2 " + manufacturer2 + " %");

        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        if (choose == 1) {
            car3.setManufacturer(manufacturer1);
            manufacturer1.manufacturerDiscount();
        } else {
            car3.setManufacturer(manufacturer2);
            manufacturer2.manufacturerDiscount();
        }

        System.out.println("Wählen sie eine Motorisierung:");
        System.out.println("1 " + engine1 + " km/h");
        System.out.println("2 " + engine2 + " km/h");

        Scanner input1 = new Scanner(System.in);
        int choose1 = input1.nextInt();
        if (choose1 == 1) {
            car3.setEngine(engine1);
            engine1.odlerEngineConsumption();
        } else {
            car3.setEngine(engine2);
            engine2.odlerEngineConsumption();
        }


        System.out.println();
        System.out.println("----------TRUCK-------------------");

        Truck truck1 = new Truck("White", Car.BODY.BUS, 20);

        System.out.println("You choose the Truck MAN");
        TruckManufacturer truckManufacturer1 = new TruckManufacturer("MAN", "Schweden", 5,
                100000, true);

        System.out.println("Your new price are: ");
        truckManufacturer1.manufacturerDiscount(truckManufacturer1.isTrailer());
        truck1.setManufacturer(truckManufacturer1);

        System.out.println("Your fuel consumption: ");
        truck1.setEngine(truckEngine1);
        truckEngine1.odlerEngineConsumption();

        System.out.println();
        System.out.println("----------Sport Car-------------------");

        Car sportCar = new Car("White", Car.BODY.SPORT);

        System.out.println("You choose the Sport Car Wiesmann");
        SportCarManufacturer sportCarManufacturer = new SportCarManufacturer("Wiesmann", "Schweden",
                5.0, 60000.0, true);

        System.out.println("Your new price are: ");
        sportCarManufacturer.manufacturerDiscount(sportCarManufacturer.isWings());
        sportCar.setManufacturer(sportCarManufacturer);

        System.out.println("Your fuel consumption: ");
        sportCar.setEngine(raceEngine1);
        raceEngine1.odlerEngineConsumption();
    }
}
