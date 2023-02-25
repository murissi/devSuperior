package Bar;

public class Cliente {
    public char genero;
    public int cervejas;
    public int espetinhos;
    public int refrigerantes;


    public double consumo() {
        double cervejas = 5 * this.cervejas;
        double refrigerantes = 3 * this.refrigerantes;
        double espetinhos = 7 * this.espetinhos;
        return cervejas + refrigerantes + espetinhos;
    }

    public double ingresso() {
        if (this.genero == 'F') {
            return 8;
        } else {
            return 10;
        }
    }

    public double couvert() {
        if (this.consumo() > 30) {
            return 0.0;
        } else {
            return 4.0;
        }
    }

    public double totalGasto() {
        return this.consumo() + this.ingresso() + this.couvert();
    }

}
