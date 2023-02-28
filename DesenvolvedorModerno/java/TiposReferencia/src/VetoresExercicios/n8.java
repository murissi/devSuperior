package VetoresExercicios;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] valores = new int[n];

        int pares = 0;
        double soma = 0.0;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
            if(valores[i] % 2 == 0) {
                pares++;
                soma += valores[i];
            }
        }


        if(pares == 0) {
            System.out.println("Nenhum numero par");
        } else {
            System.out.println("Media dos pares: " + (soma / pares));

        }
    }
}
