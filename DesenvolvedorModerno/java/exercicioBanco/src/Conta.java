public class Conta {
    protected int numeroConta;
    protected double saldo;
    private static int taxa = 5;


    public Conta(int numeroConta) {
        this.numeroConta = numeroConta;

    }

    public Conta(double depositoInicial, int numeroConta) {
        this.saldo += depositoInicial;
        this.numeroConta = numeroConta;
    }

    public static int getTaxa() {
        return taxa;
    }

    public void setDeposito(double deposito) {
        this.saldo += deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaca(double sacar ) {
        this.saldo  -= getTaxa();
        return this.saldo -= sacar;
    }
}
