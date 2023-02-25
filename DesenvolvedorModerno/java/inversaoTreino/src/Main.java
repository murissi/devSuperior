import dependecias.Funcionario;
import dependecias.ImpostoEmpresa;
import dependecias.NovaTaxa;
import dependecias.TaxaSalario;

import java.lang.annotation.Target;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu salario: ");
        double salario = sc.nextDouble();

        ImpostoEmpresa impostoEmpresa = new ImpostoEmpresa();
        TaxaSalario taxaSalario = new NovaTaxa();
        System.out.println(impostoEmpresa.ImpostoSalario(salario));
        System.out.println(taxaSalario.SalarioTaxa(salario));

        Funcionario funcionario = new Funcionario(nome,salario,taxaSalario,impostoEmpresa);

        System.out.println(funcionario.salarioBruto());
    }
}