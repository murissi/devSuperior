package Funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Joao Silva";
        funcionario.salarioBruto = 6000.0;

        System.out.println(funcionario);

        System.out.print("Qual porcentagem: ");
        double taxa = sc.nextDouble();
        funcionario.increaseSalary(taxa);
    }
}
