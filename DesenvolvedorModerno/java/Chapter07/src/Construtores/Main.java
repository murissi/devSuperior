package Construtores;
public class Main {
    public static void main(String[] args) {
        String name = "TV";
        double price =  900.0;
        int quantity = 10;

        Produto p1 = new Produto(name, price, quantity);

        System.out.println(p1);

        Produto p2 = new Produto("SOM",10,2);
        System.out.println(p2.name);
        System.out.println(p2.price);
        System.out.println(p2.quantity);
    }
}
