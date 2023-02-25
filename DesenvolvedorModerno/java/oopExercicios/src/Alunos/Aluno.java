package Alunos;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double getNotasSoma() {
        return this.nota1 + this.nota2 + this.nota3;
    }

    public boolean passado() {
        return this.getNotasSoma() >= 60;
    }

    public double restante() {
        return 60 - this.getNotasSoma();
    }
}
