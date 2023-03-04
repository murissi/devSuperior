package Exercicio2;

public class ImportedProduct extends Product{

    private Double customFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    @Override
    public final String pricetag() {
        return String.format("%s $ %.2f (Customs Fee: $ %.2f %n",getName(),totalPrice(),getCustomFee());
    }

    public Double totalPrice() {
        return getPrice() + getCustomFee();
    }

}
