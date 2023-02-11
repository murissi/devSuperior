import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // notas
//        double nota1 = 45.5;
//        double nota2 = 31.3;
//        double notaFinal = (nota1 + nota2);
//
//        if (notaFinal <= 60.0) {
//            System.out.println("Reprovado");
//        } else
//            System.out.println("Aprovado");

        // baskara
//
//        double a = 1;
//        double b = 0;
//        double c = -9;
//        double delta = Math.pow(b, 2.0) - 4*a*c;
//        double  x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
//        double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
//
//        if (Double.isNaN(x1) && Double.isNaN(x2) ) {
//
//            System.out.println("Esta equacao nao possui raizes reias");
//        } else {
//            System.out.println(x1);
//            System.out.println(x2);
//        }


        // Menor de tres
//        int n1 = 7;
//        int n2 = 3;
//        int n3 = 8;
//        int menor;
//
//        if (n1 < n2 && n1 < n3) {
//            menor = n1;
//        }
//        else if (n2 < n3) {
//            menor = n2;
//
//        } else {
//            menor = n3;
//        }
//
//        System.out.println(menor);

        // Operadora

//        int quantidadeLimite = 22;
//        int precoPlano = 50;
//        int jurosPlano = 2;
//
//        if (quantidadeLimite > 100) {
//            int limitePlano = quantidadeLimite - 100;
//            System.out.println((limitePlano * jurosPlano) + precoPlano);
//        } else
//            System.out.println(precoPlano);


        // troco verificado

//        double precoUnitario = 4.0;
//        int quantidadeComprada = 2;
//        double dinheiroRecebido = 8.0;
//        double troco =  dinheiroRecebido - (precoUnitario * quantidadeComprada);
//
//        if (troco < 0) {
//            System.out.printf("Insuficiente. Faltam %.2f", Math.abs(troco));
//        } else
//            System.out.println("Troco: "+ troco);


        // glicose
//        double glicose = 143.2;
//        if (glicose <= 100.0) {
//            System.out.println("Normal");
//        }
//        else if (glicose > 100.1 && glicose <= 140.0) {
//            System.out.println("Elevado");
//        } else
//            System.out.println("Diabetes");


        // dardo
//        double n1, n2, n3, maior;
//        n1 = 83.21;
//        n2 = 87.20;
//        n3 = 83.21;
//
//        if (n1 > n2 && n1 > n3) {
//            maior = n1;
//        }
//        else if (n2 > n3) {
//            maior = n2;
//        } else
//            maior = n3;
//        System.out.println(maior);

//        System.out.print("C | F ");
//        char tipoTemperatura = sc.next().charAt(0);
//
//        System.out.print("Temperatura: ");
//        double temperatura = sc.nextDouble();
//
//
//        if (tipoTemperatura == 'F') {
//            System.out.println("F: "+(temperatura - 32) * 5/9);
//        } else {
//            System.out.println("C: "+(temperatura * (9/5)) + 32);
//        }

        // Lanchonete
//        System.out.print("Codigo produto");
//        int codigoProduto = 4;
//        int quantidadeComprada = 2;
//        double precoProduto = 0;
//        switch (codigoProduto){
//            case 1 -> precoProduto = 5.0;
//            case 2 -> precoProduto = 3.50;
//            case 3 -> precoProduto = 4.80;
//            case 4 -> precoProduto = 8.90;
//            case 5 -> precoProduto = 7.32;
//
//        }
//
//        double total = quantidadeComprada * precoProduto;
//        System.out.println(total);


        // multiplos
//        int n1,n2;
//        n1 = 6;
//        n2 = 24;
//
//        if (n1 % n2 == 0 || n2 % n1 == 0) {
//            System.out.println("Multiplos");
//        } else
//            System.out.println("Não sao Multiplos");


        //Aumento
//        double salario = 2500.0;
//        double aumento;
//
//        if (salario <= 1000.0) {
//            aumento = 0.20;
//        }
//        else if (salario > 1000.0 && salario <= 3000.0) {
//                aumento = 0.15;
//        }
//        else if (salario > 3000.0 && salario <= 8000.0) {
//            aumento = 0.10;
//        } else
//            aumento = 0.05;
//
//        double salarioFinal = (salario * aumento) + salario;
//        System.out.println(salarioFinal);


        // tempoDeJogo
        int horaInicial = 0;
        int horaFinal = 0;

        if (horaInicial < horaFinal) {
            System.out.println(horaFinal - horaInicial);
        } else {
            System.out.println(24 - horaInicial + horaFinal);
        }

        // coordenadas
        double x, y;
        x = 4.5;
        y = -2.2;

        if (x >= 0) {
            if (y >= 0) {
                System.out.println("Q1");
            } else {
                System.out.println("Q4");
            }
        } else if (x < 0) {
            if ()
        }


    }


}



