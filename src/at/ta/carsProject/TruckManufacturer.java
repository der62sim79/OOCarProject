package at.ta.carsProject;

public class TruckManufacturer extends Manufacturer {

    private boolean trailer;

    public TruckManufacturer(String brand, String madeIn, double discount, double basePrice, boolean trailer) {
        super(brand, madeIn, discount, basePrice);
        this.trailer = trailer;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    public void manufacturerDiscount(boolean trailer) {
        if (trailer) {
            double discount = calculateDiscount(getBasePrice(), getDiscount());
            System.out.printf("Your Vehicle without tailer cost %.2f €.\n", discount);
            discount = discount + 50000.00;
            System.out.printf("Plus 50.000.-€ for the Trailerr %.2f €.\n ", discount);
        } else {
            //oberklasse methode
            super.manufacturerDiscount();
        }

    }
}
