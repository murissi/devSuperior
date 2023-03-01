import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] numeros = new int[n][n];

        List<Integer> maioresNumeros = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                numeros[i][j] = sc.nextInt();
                // LOGICA ERRADA.
//                maiorNumero = numeros[i][0];
//                if (maiorNumero > numeros[i][j]) {
//                    continue;
//                } else {
//                    maiorNumero = numeros[i][j];
//                }
            }
        }

        // Definindo maiores numeros
        for (int i = 0; i < numeros.length; i++) {
            int maiorNumero = 0;
            for (int j = 0; j < numeros[0].length; j++) {
                if(numeros[i][j] > maiorNumero) {
                    maiorNumero = numeros[i][j];
                }
            }
            maioresNumeros.add(maiorNumero);
        }

        for (Integer i: maioresNumeros) {
            System.out.println(i);
        }

        sc.close();
    }
}