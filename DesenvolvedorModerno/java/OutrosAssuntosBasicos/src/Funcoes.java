import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Funções

        System.out.print("3 numeros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int resultado = retornaMaior(n1,n2,n3);
        mensagem(resultado);

        sc.close();
    }

    public static int retornaMaior(int n1, int n2, int n3) {
        int aux;
        if (n1 > n2 && n1 > n3) {
            aux = n1;
        } else if (n2 > n3) {
            aux = n2;
        } else
            aux = n3;

        return aux;
    }

    public static void mensagem(int numero) {
        System.out.printf("Maior = %d%n",numero);
    }


}

