package Exercicio2;

public class UsedProduct extends Product{

    private String manufactureDate;


    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String pricetag() {
        return String.format("%s (used) $ %.2f (Manufacture date: %s%n) ",getName(),getPrice(),getManufactureDate());
    }
}
