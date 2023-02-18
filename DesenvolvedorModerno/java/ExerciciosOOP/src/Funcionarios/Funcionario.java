package Funcionarios;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public String toString() {
        return "Nome: "
                + this.nome
                + " Salário bruto:$ "
                + this.salarioBruto;
    }

    public void increaseSalary(double imposto) {
        double porcentagem = this.salarioBruto / imposto;
        System.out.println(this.salarioBruto + porcentagem);
    }


}
