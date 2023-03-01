package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Marcos");
        nomes.add("Pedro");
        nomes.add("Joao");

        for(String i: nomes) {
            System.out.println(i);
        }
        */
        List<Integer> idades = new ArrayList<>();
        Character decisao = 'N';

        while(decisao != 'S') {
            System.out.print("Digite idade: ");
            int i = sc.nextInt();
            idades.add(i);
            System.out.print("Terminar programa: S|N: ");
            decisao = sc.next().charAt(0);
        }

        for (int i: idades) {
            System.out.println(i);
        }




        sc.close();
    }
}
