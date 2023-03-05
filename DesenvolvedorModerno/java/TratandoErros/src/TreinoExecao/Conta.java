package TreinoExecao;

public class Conta {
    private String nome;
    private Integer id;
    private Double saldo;

    public Conta() {

    }

    public Conta(String nome, Integer id, Double saldo) {
        this.nome = nome;
        this.id = id;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void addDinheiro(double dinheiro) {
        saldo += dinheiro;
    }

    public void sacar(double dinheiro) {
        testaRetirada(dinheiro);
        saldo -= dinheiro;
    }

    private void testaRetirada(double dinheiro) {
        if (dinheiro > saldo) {
            throw new ContaException("Saldo inferior a retirada");
        }
    }



}
