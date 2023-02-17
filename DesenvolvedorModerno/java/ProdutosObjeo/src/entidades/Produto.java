package entidades;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;


    public double totalValueinStock(){
        return preco * quantidade;
    }

    public void addProducts(int quantidade) {
         this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return this.nome
                + ",$"
                + String.format("%.2f",this.preco)
                +", "
                + this.quantidade
                + " units, Total: $ "
                + String.format("%.2f",this.totalValueinStock());
    }
}
