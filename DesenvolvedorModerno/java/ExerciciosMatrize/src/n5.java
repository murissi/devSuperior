import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        double[][] matriz = new double[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("SOMA DOS POSITIVOS: "+somaMatriz(matriz));

        System.out.print("Escolha uma linha: ");
        int linha = sc.nextInt();

        System.out.println("LINHA ESCOLHIDA: ");
        for (int linhas = 0; linhas < linha; linhas++) {
            for (int i = 0; i < matriz[0].length; i++) {
                System.out.println(matriz[linhas][i]);
            }
        }
        System.out.println("Escolha uma coluna: ");
        int coluna = sc.nextInt();

        System.out.println("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[coluna].length; j++) {
                System.out.println(matriz[i][coluna]);
            }
        }


        sc.close();
    }

    public static double somaMatriz(double[][] m) {
        double calculo = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] >= 0) {
                    calculo += m[i][j];

                }
            }
        }
        return calculo;
    }

}
