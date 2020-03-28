package at.ta.carsProject;

public class Truck extends Car {

    private int truckHowLong;

    public Truck(String color, BODY body, int truckHowLong) {
        super(color, body);
        this.truckHowLong = truckHowLong;
    }

    public int getTruckHowLong() {
        return truckHowLong;
    }

    public void setTruckHowLong(int truckHowLong) {
        this.truckHowLong = truckHowLong;
    }


}
