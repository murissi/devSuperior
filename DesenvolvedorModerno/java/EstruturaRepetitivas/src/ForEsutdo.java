import java.util.Scanner;

public class ForEsutdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros: ");
        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite Numero: ");
            int x = sc.nextInt();
            soma += x;
        }

        System.out.printf("Soma = %d%n",soma);
    }
}
