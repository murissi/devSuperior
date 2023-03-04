package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Try-catch
        method1();

        // Stacktrace mostra todos os metodos que foram chamados
        // até gerar aquela acessao (erro).

        System.out.println("End of program");

        // Bloco finally
        // Bloco que executa mesmo se nao tiver havido uma exceção.


        sc.close();
    }

    public static void method1() {
        System.out.println("****Method2 start****");
        method2();
        System.out.println("****Method2 finhish****");

    }

    public static void method2() {
        System.out.println("****Method2 start****");
        Scanner sc = new Scanner(System.in);
        try {

            String[] vector = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace(); // imprimir na tela o restreamento do stack
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        sc.close();
        System.out.println("****Method2 finhish****");

    }
}
