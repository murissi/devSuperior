package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        Character[] letra = new Character[nome.length()];
        List<Character> letras = new ArrayList<>();

        for (int i = 0; i < nome.length(); i++) {
            letra[i] = nome.charAt(i);
            letras.add(nome.charAt(i));
        }

        for (Character i: letra) {
            System.out.println(i);
        }
        System.out.println("-----------------------------");

        for (Character x: letras) {
            System.out.println(x);
        }


    }
}
