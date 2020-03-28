package at.ta.carsProject;

public class SportCarManufacturer extends Manufacturer {

    private boolean wings;

    public SportCarManufacturer(String brand, String madeIn, double discount, double basePrice, boolean wings) {
        super(brand, madeIn, discount, basePrice);
        this.wings = wings;
    }

    public boolean isWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }

    public void manufacturerDiscount(boolean wings) {
        if (wings) {
            double discount = calculateDiscount(getBasePrice(), getDiscount());
            System.out.printf("Your Vehicle without wings cost %.2f €.\n", discount);

            discount = discount + 500.00;
            System.out.printf("Plus 500.-€ for the Wing %.2f €.\n", discount);
        } else {
            super.manufacturerDiscount();
        }

    }
}
