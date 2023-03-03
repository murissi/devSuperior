package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int employees = sc.nextInt();

        List<Employee> funcionarios = new ArrayList<>();

        sc.nextLine();
        for (int i = 1; i <= employees; i++) {
            String name;
            int hours;
            double valueHour;
            double addtionalCharge;

            System.out.print("Outsourced (y/n)? ");

            char resposta = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Hours: ");
            hours = sc.nextInt();
            System.out.print("Value per hour: ");
            valueHour = sc.nextDouble();

            if (resposta == 'y') {

                System.out.print("Additional charge: ");
                addtionalCharge = sc.nextDouble();

                funcionarios.add(new OutsourceEmployee(name, hours, valueHour, addtionalCharge));
            } else {

                funcionarios.add(new Employee(name, hours, valueHour));

            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee i: funcionarios) {
            System.out.println(i.getName());
            System.out.println(i.payment());
        }

    }


}
