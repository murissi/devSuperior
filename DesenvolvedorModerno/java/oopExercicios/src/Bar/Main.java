package Bar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente c1 = new Cliente();
        System.out.print("Digite seu sexo: ");
        c1.genero = sc.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        c1.cervejas = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        c1.refrigerantes = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        c1.espetinhos = sc.nextInt();

        System.out.println("RELATÓRIO: ");
        System.out.printf("Consumo = R$ %.2f\n",c1.consumo());
        System.out.printf("Couvert = R$ %.2f\n",c1.couvert());
        System.out.printf("Ingresso = R$ %.2f\n",c1.ingresso());
        System.out.println();
        System.out.printf("Valor a pagar = R$ %.2f",c1.totalGasto());


        sc.close();
    }
}
