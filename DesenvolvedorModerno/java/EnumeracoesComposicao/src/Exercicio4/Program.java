package Exercicio4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birth = sc.nextLine();

        Client c1 = new Client(name,email,birth);
        Order orderC1 = new Order();

        System.out.print("Status: ");
        String order = sc.nextLine();
        OrderStatus status = OrderStatus.valueOf(order);

        System.out.println("How many item to this order?" );
        int i = sc.nextInt();

        sc.next();
        for (int j = 1; j <= i; j++) {
            System.out.printf("Enter #%d item data: %n",i);
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();
            orderC1.addItem();

        }


        sc.close();
    }
}
