import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int q = sc.nextInt();

        // Lendo matriz
        int[][] matriz = new int[q][q];

        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Elemento [%d, %d]: ",i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        int diagonal = 0;
        // Mostrando diagonal
        for (int i = 0; i < matriz.length; i++) {
            diagonal = matriz[i][i];
            for (int j = 0; j < matriz[0].length; j++) {

            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(j > i) {
                    diagonal += matriz[i][j];
                }
            }
        }

        System.out.println(diagonal);

    }
}
