package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {
        // Lista nao recebe tipos primitivos

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Rodolfo");
        list.add("Joao");
        list.add("Carla");
        list.add("Joana");
        list.add(2, "Marco"); // na posicao 2 adicionando o Marco


        // Removendo
        list.remove("Joao"); // Removendo a partir da comparacao de bytes
        list.remove(1); // removendo a string da posicao 1.

        // Removendo todo mundo que comeca com a letra J
        list.removeIf(x -> x.charAt(0) == 'J'); // Funcao Lambda

        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        // Quando o indexOf nao encontra elemento ele retorna -1.
        System.out.println("Index of Pedro: " + list.indexOf("Pedro"));

        System.out.println(list.size());
        for (String i : list) {
            System.out.println(i);
        }


        // Filtrando Lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        for(String i: result) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("-----------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);

        String xxx = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(xxx);
    }


}
