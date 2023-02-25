package dependecias;

public class NovaTaxa  extends TaxaSalario{
    @Override
    public double SalarioTaxa(double salario) {
        return salario * 0.04;
    }
}
