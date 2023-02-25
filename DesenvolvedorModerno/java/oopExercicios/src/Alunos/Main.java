package Alunos;

public class Main {
    public static void main(String[] args) {
        Aluno n1 = new Aluno();
        n1.nome = "Alex Green";
        n1.nota1 = 17.00;
        n1.nota2 = 20.00;
        n1.nota3 = 15.00;

        System.out.println(n1.getNotasSoma());
        if (n1.passado()) {
            System.out.println("PASS");

        } else {
            System.out.printf("FALTARAM: %.2f\n",n1.restante());
            System.out.println("FAILED");
        }
    }
}
