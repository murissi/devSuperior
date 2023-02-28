package Vetores;

import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos: ");
        int count = sc.nextInt();

        Produto[] vetor = new Produto[count];

        for (int i = 0; i <count; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new Produto(nome,price);
        }

        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            sum += vetor[i].getPreco();
        }

        double avg = sum / count;

        System.out.printf("AVERAGE PRICE %.2f\n",avg);
    }
}
