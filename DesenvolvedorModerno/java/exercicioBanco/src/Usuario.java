public class Usuario extends Conta {
    private String nome;

    public Usuario(int numeroConta, String nome) {
        super(numeroConta);
        this.nome = nome;
    }

    public Usuario(double depositoInicial, int numeroConta, String nome) {
        super(depositoInicial, numeroConta);
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
