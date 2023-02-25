package treino;

import java.util.Scanner;

public class treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idades = 0;
        float count = 0;

        while(true) {
            System.out.print("Digite idades: ");
            idades += sc.nextInt();
            count++;

            System.out.print("Finalizar programa? S|N ");
            char resultado = sc.next().charAt(0);

            if (resultado == 'S') {
                break;
            } else {
                continue;
            }
        }

        System.out.printf("Resultado: %.2f",(idades / count));



    }
}
