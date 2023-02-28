package VetoresExercicios;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int count = sc.nextInt();

        double[] valores = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Digite um numero: ");
            valores[i] = sc.nextInt();
        }

        double soma = 0;
        System.out.print("Valores = ");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.1f ",valores[i]);
            soma += valores[i];
        }

        System.out.printf("\nSOMA: %.2f\nMEDIA: %.2f\n",soma,(soma/valores.length));


        sc.close();
    }
}
