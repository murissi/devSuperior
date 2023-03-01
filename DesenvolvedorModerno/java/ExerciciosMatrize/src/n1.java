import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a quantidade de linhas da matriz? ");
        int linhas = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        List<Integer> negativos = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Elemento [%d %d]: ",i,j);
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j] < 0) {
                    negativos.add(matriz[i][j]);
                }
            }
        }
        System.out.println("VALORES NEGATIVOS: ");
        for (Integer n: negativos) {
            System.out.println(n);
        }

    }
}
