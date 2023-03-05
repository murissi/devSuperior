package TreinoExecao;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();


        System.out.println("Digite a quantidade a ser retirada: ");
        double retirada = sc.nextDouble();

        Conta acc = new Conta(nome, id, saldo);

        try {
            acc.sacar(retirada);
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}
