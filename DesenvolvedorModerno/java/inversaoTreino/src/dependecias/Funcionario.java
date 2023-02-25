package dependecias;

public class Funcionario {
    private String nome;
    private double salario;
    private ImpostoEmpresa impostoEmpresa;
    private TaxaSalario taxaSalario;

    public Funcionario() {

    }

    public Funcionario(String nome, double salario, TaxaSalario t, ImpostoEmpresa i) {
        this.nome = nome;
        this.salario = salario;
        this.impostoEmpresa = i;
        this. taxaSalario = t;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioBruto() {
        return this.salario - taxaSalario.SalarioTaxa(salario) - impostoEmpresa.ImpostoSalario(salario);
    }


}
