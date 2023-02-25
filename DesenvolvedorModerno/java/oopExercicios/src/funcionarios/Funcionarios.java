package funcionarios;

import java.util.Scanner;

public class Funcionarios {
    Scanner sc = new Scanner(System.in);
    public String nome;
    public double salarioLiquido;
    public double imposto;

    public double salarioTotal() {
        return this.salarioLiquido - this.imposto;
    }
    public void getFuncionario() {
        System.out.printf("Funcionário: %s, $ %.2f\n",this.nome,salarioTotal());
    }

}
