public class Encapsulamento {
    private int idade; // Encapsulamento
    private double peso; // Encapsulamento

    public Encapsulamento() {
    }

    public Encapsulamento(int idade) {
        this.idade = idade;
    }

    public Encapsulamento(int idade, double peso) {
        this.idade = idade;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Sobreescrita.
    @Override
    public String toString() {
        return "Encapsulamento{" +
                "idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}
