import java.util.Scanner;

public class treino {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matriz de: ");
        int n = sc.nextInt();

        Integer[][] matriz = new Integer[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Digite [%d, %d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
