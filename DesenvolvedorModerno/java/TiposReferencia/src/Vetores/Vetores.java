package Vetores;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas idades: ");
        int count = sc.nextInt();

        // instanciando um vetor e criando o tamanho de count
        double[] vetor = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Digite idades: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];

        }

        soma /=  vetor.length;

        System.out.printf("AVERAGE HEIGHT: %.2f\n",soma);

        // Vetores
        int[] vetor2 = new int[4];
        vetor2[0] = 0;
        vetor2[1] = 1;
        vetor2[2] = 2;
        vetor2[3] = 3;


    }
}
