package at.ta.carsProject;


public class Car {
    public enum BODY {BUS, SPORT, FAMILYVAN}

    private String color;
    private BODY body;
    private Manufacturer manufacturer;
    private Engine engine;

    public Car(String color, BODY body) {
        this.color = color;
        this.body = body;
        this.manufacturer = manufacturer;
        this.engine = engine;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BODY getBody() {
        return body;
    }

    public void setBody(BODY body) {
        this.body = body;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
