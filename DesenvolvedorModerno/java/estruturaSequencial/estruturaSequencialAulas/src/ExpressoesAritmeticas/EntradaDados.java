package ExpressoesAritmeticas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pedindo nome e salvando.
        System.out.print("Digite seu nome;");
        String nome = sc.nextLine();
//        System.out.println(nome);

        System.out.print("Digite seu peso; ");
        int peso = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("%s seu imc é %.2f%n",nome,imc);

        System.out.println(nome.charAt(0));


        sc.close(); // encerrando Scanner


        // Para ler varios dados na mesma linha
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();


    }

}
