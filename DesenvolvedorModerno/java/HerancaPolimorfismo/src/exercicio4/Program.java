package exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int tax = sc.nextInt();

        List<TaxPayer> taxas = new ArrayList<>();

        for (int i = 1; i <= tax; i++) {
            System.out.printf("Tax payer #%d data: %n", i);
            System.out.print("(i/c) ");
            char decision = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anual = sc.nextDouble();

            if (decision == 'i') {
                System.out.print("Health Expenditures: ");
                double health = sc.nextDouble();

                taxas.add(new Individual(name, anual, health));

            } else {
                System.out.print("Number of employees: ");
                int employess = sc.nextInt();

                taxas.add(new Company(name,anual,employess));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer i : taxas) {
            System.out.printf("%s: $%.2f\n", i.getName(), i.tax());
        }

        double sum = 0;
        System.out.println("TOTAL TAXES: ");
        for(TaxPayer i: taxas) {
            sum += i.tax();
        }

        System.out.printf("$ %.2f",sum);

        sc.close();
    }
}
