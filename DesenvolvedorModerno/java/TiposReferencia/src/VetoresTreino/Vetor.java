package VetoresTreino;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando vetor com tipos primitivos
        // Diferente de Go, vetor não é imutavel.
        int[] vetorInt = new int[5];
        for (int i = 0; i < vetorInt.length; i++) {
            vetorInt[i] = i;
            System.out.println(vetorInt[i]);
        }

        int[] variavelInstanciandoMesmoVetor = vetorInt;
        variavelInstanciandoMesmoVetor[0] = 22;
        System.out.println(vetorInt[0]);

        // Vetor com Classes
        Animal[] animais = new Animal[2];

        animais[0] = new Animal("Lucas","Humano");
        animais[0] = new Animal("Lola","Cachorro");

    }
}
