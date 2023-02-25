package Dolar;

public class Dolar {
    public double cotacaoDolar;
    public double dolaresComprados;
    public static  double IOF = 0.06;

    public double comprarDolares() {
        return cotacaoDolar * dolaresComprados * (1.0 + IOF);
    }
}
