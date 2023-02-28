package VetoresExercicios;

import java.util.Scanner;

public class n7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int v = sc.nextInt();

        double[] valores = new double[v];

        double media = 0;

        for (int i = 0; i < v; i++) {
            valores[i] = sc.nextDouble();
            media += valores[i];

        }
        media /= valores.length;

        System.out.println("Media do Vetor: " + media);
        // Fora Media
        System.out.println("Elementos abaixo da Media: ");
        for (int i = 0; i < valores.length; i++) {
            if(valores[i] < media) {
                System.out.println(valores[i]);
            }
        }






        sc.close();
    }
}
