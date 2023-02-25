package treino;

import java.util.Scanner;

public class animal {
    public static void main(String[] args) {
        /*
            for (int i = 0; i < 10; i++) {
                for (int linhas = 10; linhas > i; linhas--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite numero: ");
        int numero = sc.nextInt();
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.printf("%d é primo.\n", numero);
        } else {
            System.out.printf("%d não é primo.\n", numero);
        }


        sc.close();
    }

}
