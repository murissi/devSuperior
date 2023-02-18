package alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudantes aluno = new Estudantes();

        System.out.print("Digite seu nome: ");
        aluno.nome = sc.nextLine();

        System.out.println("Digite notas em sequencia: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        aluno.aprovacao();
    }
}
