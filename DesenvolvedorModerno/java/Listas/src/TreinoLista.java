import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreinoLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas: ");
        int n = sc.nextInt();


        List<Pessoa> listaPessoas = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            Integer idade = sc.nextInt();

            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            listaPessoas.add(new Pessoa(nome,idade,salario));
        }

        // Descobrindo maior salario
        double maiorsalario = listaPessoas.get(0).getSalario();
        String pessoaSalario = listaPessoas.get(0).getNome();

        for (int i = 0; i < listaPessoas.size(); i++) {
            if(listaPessoas.get(i).getSalario() > maiorsalario) {
                maiorsalario = listaPessoas.get(i).getSalario();
                pessoaSalario = listaPessoas.get(i).getNome();
            }
        }

        System.out.println();
        System.out.println(pessoaSalario);
        System.out.println(maiorsalario);

        sc.close();
    }
}
