package exercicio;

public class OutsourceEmployee extends Employee{
    private Double additionalCharge;

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourceEmployee() {
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final Double payment() {
        double porcentagem = additionalCharge * 0.10;
        return (hours * valuePerHour) + porcentagem + additionalCharge;
    }
}
