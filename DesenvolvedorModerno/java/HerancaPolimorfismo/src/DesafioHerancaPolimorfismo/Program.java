package DesafioHerancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        System.out.print("Quantas aulas tem o curso? ");
        int aulas = sc.nextInt();

        sc.nextLine();

        List<Lesson> lessons = new ArrayList<>();

        for (int i = 1; i <= aulas; i++) {
            System.out.print("Conteudo ou tarefa (c/t): ");
            char decisao = sc.next().charAt(0);

            System.out.print("Titulo: ");
            String titulo = sc.nextLine();

            if (decisao == 'c') {
                sc.nextLine();
                System.out.print("URL do video: ");
                String url = sc.nextLine();

                System.out.print("Duracao em segundos: ");
                int duracaoSegundos = sc.nextInt();

                lessons.add(new Video(titulo,url,duracaoSegundos));
            } else {
                sc.nextLine();
                System.out.print("Descrição: ");
                String descricao = sc.nextLine();

                System.out.print("Quantidade de questoes: ");
                int quantidadeQuestoes = sc.nextInt();

                lessons.add(new Task(titulo,descricao,quantidadeQuestoes));
            }
        }

        double totalSegundos = 0;
        for (Lesson i : lessons) {
            totalSegundos += i.duration();
        }

        System.out.println("DURACAO TOTAL DO CURSO: " + totalSegundos + " segundos");
    sc.close();
    }
}
