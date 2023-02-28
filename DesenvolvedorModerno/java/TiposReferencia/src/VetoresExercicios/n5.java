package VetoresExercicios;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] valores = new double[n];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um numero: ");
            valores[i] = sc.nextInt();
        }

        double maior = valores[0];
        int posicaoMaiorValor = 0;

        // Descobrindo maior numero
        for (int i = 0; i < valores.length; i++) {
            if(valores[i] > maior) {
                maior = valores[i];
                posicaoMaiorValor++;
            }
        }

        System.out.println("Maior Numero: "+ maior);
        System.out.println(posicaoMaiorValor);

        // Outra forma de criar array
        //int[] numeros = {1,2,2,3,4};


    }

}
