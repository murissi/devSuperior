package alunos;

public class Estudantes {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean aprovacao() {
        double notasTotais = this.nota1 + this.nota2 + this.nota3;
        if (notasTotais >= 60) {
            System.out.println("Nota final: " + notasTotais);
            return true;
        } else {
            System.out.println("Failed " +
                    "Faltaram: " + (60 - notasTotais));
            return false;
        }

    }
}
