import entidades.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto manteiga = new Produto();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        manteiga.nome = sc.nextLine();

        System.out.print("Price: ");
        manteiga.preco = sc.nextDouble();

        System.out.print("Quantity: ");
        manteiga.quantidade = sc.nextInt();

        System.out.println(manteiga);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();

        manteiga.addProducts(quantity);

        System.out.println(manteiga);
    }

}