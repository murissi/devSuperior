package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa a = new Pessoa("Lucas",12);
        Pessoa b = new Pessoa("Marco", 22);
        Pessoa c = new Pessoa("Joao",33);
        pessoas.add(a);
        pessoas.add(b);
        pessoas.add(c);
        String nome = "Maria";
        Integer idade = 2;
        pessoas.add(new Pessoa(nome,idade));


        for(Pessoa i: pessoas) {
            System.out.println(i.getNome());
            System.out.println(i.getIdade());
        }

    }
}
