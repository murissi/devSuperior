package exercicio4;

public class Individual extends TaxPayer {

    private Double heathExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualInCome, Double heathExpenditures) {
        super(name, anualInCome);
        this.heathExpenditures = heathExpenditures;
    }


    public Double getHeathExpenditures() {
        return heathExpenditures;
    }

    public void setHeathExpenditures(Double heathExpenditures) {
        this.heathExpenditures = heathExpenditures;
    }

    @Override
    public final Double tax() {
        double taxa = 0;
        if (getAnualInCome() < 20_000.0) {
            taxa = getAnualInCome() * 0.15;
        } else if (getAnualInCome() >= 20_000.0) {
            if (getHeathExpenditures() > 0) {
                taxa = getAnualInCome() * 0.25 - (getHeathExpenditures() * 0.5);
            } else {
                taxa = getAnualInCome() * 0.25;
            }
        }
        return taxa;
    }
}
