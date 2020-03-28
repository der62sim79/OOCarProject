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

    //überall aufrufbar für if methode
    public double calculateDiscount(double basePrice, double discount) {
        double manufacturerDiscount = (100 / this.basePrice) * this.discount;
        return this.basePrice - manufacturerDiscount;
    }

    public void manufacturerDiscount() {
        double manufacturerDiscount = (100 / this.basePrice) * this.discount;
        this.basePrice = this.basePrice - manufacturerDiscount;
        System.out.printf("Your Vehicle cost with our discount form " + discount + " precent now total %.2f €.\n", getBasePrice());
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
