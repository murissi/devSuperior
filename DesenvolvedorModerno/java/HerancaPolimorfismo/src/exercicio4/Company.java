package exercicio4;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company() {

    }

    public Company(String name, Double anualInCome, int numberOfEmployees) {
        super(name, anualInCome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double taxa = 0.16;
        if (numberOfEmployees < 10) {
            return taxa * getAnualInCome();
        } else {
            return 0.14 * getAnualInCome();
        }
    }
}
