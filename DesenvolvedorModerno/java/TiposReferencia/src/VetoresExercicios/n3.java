package VetoresExercicios;

import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int count = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[count];
        String nome;
        int idade;
        double altura;

        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %d pessoa: \n", i + 1);
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.print("Altura: ");
            altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        // Media altura
        double mediaAltura = 0;
        for (int i = 0; i < pessoas.length; i++) {
            mediaAltura += pessoas[i].getAltura();
        }

        mediaAltura /= pessoas.length;
        System.out.printf("Altura média: %.2f", mediaAltura
        );

        // Pessoas com 16 anos
        int pessoasCom16anos = 0;

        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getIdade() < 16) {

                pessoasCom16anos++;
            }
        }

        double porcentagem = (pessoasCom16anos * 100) / pessoas.length;
        System.out.println("\nPessoas com menos de 16 anos: "+porcentagem);

        sc.close();
    }
}
