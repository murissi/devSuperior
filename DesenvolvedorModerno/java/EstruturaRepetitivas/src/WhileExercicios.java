import java.util.Scanner;

public class WhileExercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*
        System.out.print("N1: ");
        int n1 = sc.nextInt();

        System.out.print("N2: ");
        int n2 = sc.nextInt();

        while(n1 != n2) {
            if (n1 > n2) {
                System.out.println("Decrescente!");
            } else {
                System.out.println("Crescente!");
            }
            System.out.print("N1: ");
            n1 = sc.nextInt();

            System.out.print("N2: ");
            n2 = sc.nextInt();
        }
        */

        //Media idades
        /*int idade = 0;
        while (true) {
            System.out.print("Idade: ");
            int media = sc.nextInt();

            if (media < 0) {
                break;
            } else {
                idade += media;
                continue;
            }
        }

        System.out.println(idade);*/

        // SenhaFixa
        /*int senhaCorreta = 2002;
        System.out.print("Digite senha: ");
        int testeSenha = sc.nextInt();

        while (true) {

            if (testeSenha != senhaCorreta) {
                System.out.print("Senha Invalida! Tente Novamente: ");
                testeSenha = sc.nextInt();
            } else {
                System.out.print("Acesso Permitido!");
                break;
            }
        }*/

        //Quadrante
        /*int x, y;

        while (true) {

            System.out.print("X: ");
            x = sc.nextInt();
            System.out.print("Y: ");
            y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            } else if (x == 0 || y == 0){
                break;
            }

        }*/

        // ValidacaoNota
/*

        double nota1, nota2;
        System.out.print("Digite 1 Nota: ");
        nota1 = sc.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Invalido, Tente novamente: ");
            nota1 = sc.nextDouble();
        }

        System.out.print("Digite 2 Nota: ");
        nota2 = sc.nextDouble();

        while (nota2 < 0 || nota2 > 10) {
            System.out.print("Invalido, Tente novamente: ");
            nota2 = sc.nextDouble();
        }

        System.out.printf("Media: %.2f%n", (nota1 + nota2) / 2);
*/


        // Combustivel
        /*int gasolina, alcool, diesel, tipoCombustivel;
        gasolina = 0;
        alcool = 0;
        diesel = 0;

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        tipoCombustivel = sc.nextInt();

        while (tipoCombustivel != 4) {

            if (tipoCombustivel == 1) {
                alcool++;
            } else if (tipoCombustivel == 2) {
                gasolina++;
            } else if (tipoCombustivel == 3){
                diesel++;
            }
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            tipoCombustivel = sc.nextInt();

        }
        System.out.println("Muito Obrigado!");
        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n",
                alcool, gasolina, diesel);*/

        // ParesConsecutivos
       /* System.out.print("Digite um numero inteiro: ");
        int x = sc.nextInt();

        int impar;
        int par;

        while (x != 0){
            if (x % 2 != 0) {
                impar = (x+2) + (x+3) + (x+5) + (x+7) + (x+8);
                System.out.println(impar);
            } else {
                par = x + (x+2) + (x+4) + (x+6) + (x+8);
                System.out.println(par);
            }
            System.out.print("Digite um numero inteiro: ");
            x = sc.nextInt();
}*/


    }
}
