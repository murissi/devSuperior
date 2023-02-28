package VetoresExercicios;

import java.util.Scanner;

public class n9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        PessoaMaisVelha[] pessoas = new PessoaMaisVelha[n];
        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();
            System.out.printf("Dados %d pessoa: \n", i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoas[i] = new PessoaMaisVelha(nome,idade);
        }

//        String nomePessoaVelha = " ";
        int pessoaMaisVelha = pessoas[0].getIdade();

        for (int i = 0; i < pessoas.length; i++) {
            if(pessoaMaisVelha < pessoas[i].getIdade()) {
                pessoaMaisVelha = pessoas[i].getIdade();
            }
        }

        // Conseguindo nome da idade mais velha
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoaMaisVelha == pessoas[i].getIdade()) {
                System.out.println("Pessoa mais velha:" + pessoas[i].getNome());
            }
        }

        sc.close();
    }
}
