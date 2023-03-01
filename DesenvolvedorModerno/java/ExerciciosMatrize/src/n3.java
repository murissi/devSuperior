import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class n3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter cada matriz? ");
        int linhas = sc.nextInt();

        System.out.print("Quantas colunas vai ter cada matriz? ");
        int colunas = sc.nextInt();

        int[][] colunaA = new int[linhas][colunas];
        int[][] colunaB = new int[linhas][colunas];
        int[][] colunaC = new int[linhas][colunas];

        fazerMatriz(colunaA);
        System.out.println("Digite os valores da matriz B: ");
        fazerMatriz(colunaB);

        retornaSomaMatriz(colunaA, colunaB, colunaC);
        retornaMatriz(colunaC);




        sc.close();
    }


    public static void fazerMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Elemento [%d, %d]: ",i ,j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void retornaMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void retornaSomaMatriz(int[][] matrizA, int[][] matrizB, int[][] matrizC){
        for (int i = 0; i < matrizB.length ; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }

        }
    }
}