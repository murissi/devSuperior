import java.util.Scanner;

public class WhileEstudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            System.out.print("Numero: ");
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        System.out.println(Math.sqrt(2));


        sc.close();
    }
}
