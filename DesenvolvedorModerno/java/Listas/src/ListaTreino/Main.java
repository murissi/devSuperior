package ListaTreino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funcionarios: ");
        int n = sc.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Funcionario: %d%n", i + 1);
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Funcionario(id, name, salary));

        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();


        sc.close();
    }

}
