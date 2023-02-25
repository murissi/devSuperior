package funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionarios f1 = new Funcionarios();
        f1.nome = "Joao Silva";
        f1.salarioLiquido = 6000.00;
        f1.imposto = 1000.00;

        f1.getFuncionario();

        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double porcentagem = sc.nextDouble();
        porcentagem /= 100;

        System.out.println((f1.salarioTotal() * porcentagem) + f1.salarioTotal());




    }

}
