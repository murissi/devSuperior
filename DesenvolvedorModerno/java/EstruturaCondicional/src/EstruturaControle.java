import java.util.Scanner;

public class EstruturaControle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas horas: ");
        int x = sc.nextInt();

        if (x < 12) {
            System.out.println("Bom dia!");
        } else if (x < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite");

        }


    }
}
