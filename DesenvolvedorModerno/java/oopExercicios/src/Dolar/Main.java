package Dolar;

public class Main {
    public static void main(String[] args) {

        Dolar n = new Dolar();
        n.cotacaoDolar = 3.10;
        n.dolaresComprados = 200.00;


        System.out.println(n.comprarDolares());
    }
}
