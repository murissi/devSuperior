package VetoresExercicios;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int count = sc.nextInt();

        int[] numeros = new int[count];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("NUMEROS PARES: ");

        int n = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf("%d ",numeros[i]);
                n++;
            }
        }

        System.out.println("\nQUANTIDADE DE PARES: "+n);

    }
}
