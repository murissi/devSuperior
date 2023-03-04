package Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int p = sc.nextInt();

        List<Product> proddutos = new ArrayList<>();

        sc.nextLine();
        for (int i = 1; i <= p; i++) {
            System.out.printf("Product #%d data: %n", i);
            System.out.print("Common, used or imported(c/u/i)");
            char type = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Customs fee: ");
                Double customFee = sc.nextDouble();

                proddutos.add(new ImportedProduct(name, price, customFee));

            } else if (type == 'u') {
                sc.nextLine();
                System.out.print("Manufacture data (DD/MM/YYYY): ");
                String data = sc.next();

                proddutos.add(new UsedProduct(name, price, data));
            } else {
                proddutos.add(new Product(name, price));
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product i : proddutos) {
            System.out.println(i.pricetag());
        }


        sc.close();
    }
}
