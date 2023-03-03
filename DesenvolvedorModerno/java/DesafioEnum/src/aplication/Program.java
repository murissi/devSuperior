package aplication;

import entities.Adress;
import entities.Department;
import entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Departamento
        System.out.print("Nome do departamento: ");
        String departamentoNome = sc.nextLine();

        System.out.print("Dia do pagamento: ");
        int diaPagamento = sc.nextInt();

        // Endereço
        sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        Adress endereco = new Adress(email,telefone);
        Department department = new Department(departamentoNome, diaPagamento, endereco);

        System.out.print("Quantos funcionarios tem o departamento? ");
        int numeroFuncionarios = sc.nextInt();

        for (int j = 0; j < numeroFuncionarios; j++) {
            System.out.println("Dados do funcionario "+ (j+1));
            System.out.print("Nome: ");
            sc.nextLine();
            String nomeFuncionario = sc.nextLine();
            System.out.print("Salario: ");
            double salarioFuncionario = sc.nextDouble();

            Employee employee = new Employee(nomeFuncionario,salarioFuncionario);
            department.addEmployee(employee);
        }

        System.out.println();
        showReport(department);

        sc.close();
    }

    public static void showReport(Department dept) {
        System.out.println("FOLHA DE PAGAMENTO: ");
        System.out.printf("Departamento %s = R$ %.2f%n",dept.getName(),dept.payroll());
        System.out.printf("Pagamento realizado no dia: %d%n", dept.getPayday());
        System.out.println("Funcionários: ");
        for (Employee i : dept.getEmployees()){
            System.out.println(i.getName());
        }
        System.out.printf("Para duvidas favor entrar em contato: %s",dept.getAdress().getEmail());

    }
}
