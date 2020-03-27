package at.ta.carsProject;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Car car1 = new Car("Black", Car.BODY.BUS);
        Car car2 = new Car("Black", Car.BODY.FAMILYVAN);
        Car car3 = new Car("Black", Car.BODY.SPORT);

        Manufacturer manufacturer1 = new Manufacturer("Audi", "Germany", 10.0, 45000.0);
        Manufacturer manufacturer2 = new Manufacturer("Porsche", "German", 8.0, 80000.0);

        Engine engine1 = new Engine(Engine.FUEL.DIESEL, 250.00, 12.0, 50007.0, 240.0);
        Engine engine2 = new Engine(Engine.FUEL.GAS, 280.00, 14.0, 30000.0, 300.0);


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

    }
}
