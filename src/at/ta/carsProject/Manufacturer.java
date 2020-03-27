package at.ta.carsProject;

public class Manufacturer {
    private String brand;
    private String madeIn;
    private double discount;
    private double basePrice;


    public Manufacturer(String brand, String madeIn, double discount, double basePrice) {
        this.brand = brand;
        this.madeIn = madeIn;
        this.discount = discount;
        this.basePrice = basePrice;
    }

    public void manufacturerDiscount() {
        double manufacturerDiscount = (100 / this.basePrice) * this.discount;
        this.basePrice = this.basePrice - manufacturerDiscount;
        System.out.println("Your Car cost wiht your discount form " + discount + " % now total " + getBasePrice() + " €.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return brand + " " + " Rabatt " + discount;
    }
}
