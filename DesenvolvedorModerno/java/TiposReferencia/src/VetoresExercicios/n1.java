package VetoresExercicios;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numeros: ");
        int n = sc.nextInt();

        while (n > 10) {
            System.out.println("Numero invalido");
            System.out.print("Digite novamente: ");
            n = sc.nextInt();
        }

        int[] valores = new int[n];
        for (int i = 0; i < n; i++) {
            valores[i] = sc.nextInt();
        }

        for (int i = 0; i < valores.length ; i++) {
            if(valores[i] < 0) {
                System.out.println("NUMEROS NEGATIVOS: ");
                System.out.print(valores[i]);
            }
        }


        sc.close();
    }
}
