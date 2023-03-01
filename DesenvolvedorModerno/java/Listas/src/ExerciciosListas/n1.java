package ExerciciosListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios: ");
        int funcionarios = sc.nextInt();

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add( new Funcionario("Lucas",22,500.0));




    }
}
