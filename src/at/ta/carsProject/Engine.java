package at.ta.carsProject;

public class Engine {
    public enum FUEL {DIESEL, GAS}

    private FUEL fuel;
    private double maxSpeed;
    private double fuelConsumption;
    private double kilometersDriven;
    private double horsePower;

    public Engine(FUEL fuel, double maxSpeed, double fuelConsumption, double kilometersDriven, double horsePower) {
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.kilometersDriven = kilometersDriven;
        this.horsePower = horsePower;
    }

    public void odlerEngineConsumption() {
        if (this.getKilometersDriven() >= 50000.0) {
            double olderEngineConsumtion = this.getFuelConsumption() * 1.098;
            System.out.printf("Your Fuel consumption is higher Because your Engine " +
                    "driving more than 50.000 km %.2f Liter.\n ", olderEngineConsumtion);
        } else {
            System.out.printf("Your Fuel consumption is normal by %.2f Liter.\n  ", this.getFuelConsumption());
        }
    }

    public FUEL getFuel() {
        return fuel;
    }

    public void setFuel(FUEL fuel) {
        this.fuel = fuel;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getKilometersDriven() {
        return kilometersDriven;
    }

    public void setKilometersDriven(double kilometersDriven) {
        this.kilometersDriven = kilometersDriven;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return fuel + ", " + horsePower;
    }
}
