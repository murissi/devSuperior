package VetoresExercicios;

import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int n = sc.nextInt();

        Alunos[] aluno = new Alunos[n];

        sc.nextLine();
        for (int i = 0; i <aluno.length; i++) {
            System.out.printf("Digite nome, primeira e segunda do %d aluno\n", i+1);
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            sc.nextLine();
            aluno[i] = new Alunos(nome,nota1,nota2);
        }

        // Mostrando aprovados
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < aluno.length; i++) {
            if(aluno[i].aprovado()) {
                System.out.println(aluno[i].getNome());
            }
        }


        sc.close();
    }
}
