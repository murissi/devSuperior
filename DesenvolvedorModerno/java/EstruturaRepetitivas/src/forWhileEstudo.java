import java.util.Scanner;

public class forWhileEstudo {
    public static void main(String[] args) {
        // Faça-Enquanto
        Scanner sc = new Scanner(System.in);


        char resp;
        do {

            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = (9.0 * C) / 5.0 + 32;
            System.out.printf("Equivale em F: %.2f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);

        } while (resp != 'n');



        sc.close();













    }
}
