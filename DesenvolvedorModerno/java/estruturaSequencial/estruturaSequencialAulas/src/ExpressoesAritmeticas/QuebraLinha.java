package ExpressoesAritmeticas;

import java.util.Scanner;

public class QuebraLinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt(); // QUANDO DIGITAMOS E DAMOS ENTER, A S1 RECEBE O ESPACO
        sc.nextLine(); // agora esse nextLine() vai receber o vazio
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();


        System.out.println("Dados Digitados");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
