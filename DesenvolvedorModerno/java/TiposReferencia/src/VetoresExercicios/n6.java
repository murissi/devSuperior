package VetoresExercicios;

import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        // A
        System.out.print("Digite os valores do vetor A: \n");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // B
        System.out.print("Digite os valores do vetor B: \n");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        // Calculo
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%d\n",a[i] + b[i]);
        }



    }
}
