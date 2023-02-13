import java.util.Scanner;

public class ForExercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        int n;
//        System.out.print("Qual tabuada: ");
//        n = sc.nextInt();
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.printf("%d * %d = %d%n",n,i,i * n);
//        }
//    }

        // SomaImpares
//        int x,y,soma;
//
//        System.out.print("X: ");
//        x = sc.nextInt();
//
//        System.out.print("Y: ");
//        y = sc.nextInt();
//
//        if (x > y){
//            int troca;
//            troca = x;
//            x = y;
//            y = troca;
//        }
//
//        soma = 0;
//
//        for (int i = x+1; i < y; i++) {
//            if(i % 2 != 0) {
//                soma += i;
//            }
//        }
//
//        System.out.println(soma);


        //DentroFora
        /*System.out.print("Quantos numeros voce vai digitar: ");
        int N = sc.nextInt();
        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < N; i++) {
            int numero = 0;
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();

            if(numero >= 10 && numero <= 20) {
                dentro++;
            }else {
                fora++;
            }
        }

        System.out.printf("Dentro: %d%n",dentro);
        System.out.printf("Fora: %d%n",fora);
*/


        // ParImpar
//        System.out.print("Quantos numeros voce vai digitar; ");
//        int totalNumeros = sc.nextInt();
//
//        for (int i = 0; i < totalNumeros; i++) {
//            System.out.print("Digite um numero: ");
//            int N = sc.nextInt();
//
//            if (N == 0) {
//                System.out.println("Nulo");
//            }else if (N > 0) {
//                if(N % 2 == 0) {
//                    System.out.println("Par Positivo");
//                } else {
//                    System.out.println("Impar Positivo");
//                }
//            } else {
//                if (N % 2 == 0) {
//                    System.out.println("Par Negativo");
//                } else {
//                    System.out.println("Impar Negativo");
//                }
//            }
//
//        }


        //MediaPonderada
//        int n;
//        double valor, valor1, valor2, media;
//
//        System.out.print("Quantos casos voce vai digitar? ");
//        n = sc.nextInt();
//
//        for (int i=0; i<n; i++) {
//            System.out.println("Digite tres numeros:");
//            valor = sc.nextDouble();
//            valor1 = sc.nextDouble();
//            valor2 = sc.nextDouble();
//
//            media = (valor * 2.0 + valor1 * 3.0 + valor2 * 5.0) / 10.0;
//
//            System.out.printf("MEDIA = %.1f\n", media);
//        }


        // Divisao
//        double quantidade,numerador,denominador;
//
//        numerador = 0;
//        denominador = 0;
//
//        System.out.print("Quantos casos voce vai digitar: ");
//        quantidade = sc.nextDouble();
//
//        for (int i = 0; i < quantidade; i++) {
//            System.out.print("Entre com o numerador: ");
//            numerador = sc.nextDouble();
//
//            System.out.print("Entre com o denominador: ");
//            denominador = sc.nextDouble();
//
//            if(denominador == 0) {
//                System.out.println("DIVISAO IMPOSSIVEL");
//            }
//
//
//
//            double divisao = numerador/denominador;
//            System.out.printf("DIVISAO = %.2f%n",divisao);
//
//
//        }

        // FATORIAL
        int quantidadesTeste = 0;

        int coelhos,ratos,sapos, total;
        coelhos = 0;
        ratos = 0;
        sapos = 0;
        total = 0;

        System.out.print("Quantos casos: ");
        quantidadesTeste = sc.nextInt();

        for (int i = 0; i < quantidadesTeste; i++) {

            System.out.print("Quantidade de cobaias: ");
            int cobaias = sc.nextInt();
            total += cobaias;

            System.out.println("Tipo de cobaias: ");
            char tipoCobaia = sc.next().charAt(0);

            if (tipoCobaia == 'C') {
                coelhos += cobaias;
            } else if (tipoCobaia == 'R') {
                ratos += cobaias;
            } else if (tipoCobaia == 'S') {
                sapos += cobaias;
            }
            }
        System.out.println("RELATORIO FINAL");
        System.out.println("Total: "+total);
        System.out.println("Coelhos: "+coelhos);
        System.out.println("Ratos: "+ratos);
        System.out.println("Sapos: "+sapos);


    }
}