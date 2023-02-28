package VetoresExercicios;

import java.util.Scanner;

public class n11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas? ");
        int x = sc.nextInt();

        int contadorHomens = 0;
        Genero[] generos = new Genero[x];


        // Media mulheres
        int contadorMulheres = 0;
        double alturaMulheres = 0;

        // Pegando valores
        for (int i = 0; i < generos.length; i++) {
            System.out.printf("Altura da %d pessoa\n", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %d pessoa\n", i + 1);
            char genero = sc.next().charAt(0);

            if(genero == 'M' || genero == 'm') {
                contadorHomens++;
            } else {
                contadorMulheres++;
                alturaMulheres += altura;
            }

            generos[i] = new Genero(genero, altura);

        }



        // Menor e maior altura
        double maiorAltura = generos[0].getAltura();
        double menorAltura = generos[0].getAltura();

        for (int i = 0; i < generos.length; i++) {
            if (generos[i].getAltura() > maiorAltura) {
                maiorAltura = generos[i].getAltura();
            }
        }
        for (int j = 0; j < generos.length; j++) {
            if(generos[j].getAltura() < menorAltura) {
                menorAltura = generos[j].getAltura();
            }
        }

        System.out.printf("Menor altura %.2f\n",menorAltura);
        System.out.printf("Maior altura %.2f\n",maiorAltura);
        System.out.printf("Media altura das mulheres = %.2f",(alturaMulheres / contadorMulheres));
        System.out.println("Numero de homens = " + contadorHomens);


        sc.close();
    }
}
